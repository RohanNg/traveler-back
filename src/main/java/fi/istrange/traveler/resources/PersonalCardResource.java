package fi.istrange.traveler.resources;

import fi.istrange.traveler.api.PersonalCardCreationReq;
import fi.istrange.traveler.api.PersonalCardRes;
import fi.istrange.traveler.api.PersonalCardUpdateReq;
import fi.istrange.traveler.bundle.ApplicationBundle;
import fi.istrange.traveler.dao.PersonalCardCustomDao;
import fi.istrange.traveler.db.tables.daos.PersonalCardDao;
import fi.istrange.traveler.db.tables.daos.TravelerUserDao;
import fi.istrange.traveler.db.tables.pojos.PersonalCard;
import io.dropwizard.auth.Auth;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.dhatim.dropwizard.jwt.cookie.authentication.DefaultJwtCookiePrincipal;
import org.jooq.DSLContext;

import javax.annotation.security.PermitAll;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by arsenii on 4/7/17.
 */
@Path("/personal-cards")
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "/personal-cards", tags = "personal cards")
@PermitAll
public class PersonalCardResource {
    private final PersonalCardDao cardDAO;
    private final TravelerUserDao userDAO;
    private final PersonalCardCustomDao customPersonalCardDao;

    public PersonalCardResource(
            ApplicationBundle applicationBundle
    ) {
        this.cardDAO = new PersonalCardDao(applicationBundle.getJooqBundle().getConfiguration());
        this.userDAO = new TravelerUserDao(applicationBundle.getJooqBundle().getConfiguration());
        this.customPersonalCardDao = new PersonalCardCustomDao();
    }

    @GET
    @ApiOperation(value = "Produces list of personal travel cards aggregated by radius")
    public List<PersonalCardRes> getPersonalCards(
            @ApiParam(hidden = true) @Auth DefaultJwtCookiePrincipal principal,
            @NotNull @QueryParam("lat") BigDecimal lat,
            @NotNull @QueryParam("lng") BigDecimal lng,
            @QueryParam("includeArchived") @DefaultValue("false") boolean includeArchived,
            @QueryParam("offset") @DefaultValue("0") int offset,
            @Context DSLContext database
            ) {
        return customPersonalCardDao.fetchByPosition(lat, lng, includeArchived, offset, database)
                .stream()
                .map(p -> PersonalCardRes.fromEntity(p, userDAO.fetchOneByUsername(principal.getName())))
                .collect(Collectors.toList());
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @ApiOperation("Create new personal card")
    public PersonalCardRes createPersonalCard(
            @ApiParam(hidden = true) @Auth DefaultJwtCookiePrincipal principal,
            PersonalCardCreationReq personalCardCreationReq
    ) {
        this.cardDAO.insert(fromCreateReq(personalCardCreationReq, principal.getName()));

        return PersonalCardRes.fromEntity(
                this.cardDAO.fetchOneById(personalCardCreationReq.getId()),
                userDAO.fetchOneByUsername(principal.getName())
        );
    }

    @GET
    @Path("/{id}")
    @ApiOperation("Get a personal card by id")
    public Optional<PersonalCardRes> getPersonalCard(
            @ApiParam(hidden = true) @Auth DefaultJwtCookiePrincipal principal,
            @PathParam("id") long personalCardId
    ) {
        return this.cardDAO.fetchByUsernameFk(principal.getName())
                .stream()
                .filter(p -> p.getId() == personalCardId)
                .map(p -> PersonalCardRes.fromEntity(p, userDAO.fetchOneByUsername(principal.getName())))
                .findFirst();
    }


    private static PersonalCard fromCreateReq(PersonalCardCreationReq req, String username) {
        return new PersonalCard(
                req.getId(),
                req.getStartTime(),
                req.getEndTime(),
                req.getLon(),
                req.getLat(),
                username,
                true
        );
    }
}
