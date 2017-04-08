package fi.istrange.traveler.resources;

import fi.istrange.traveler.api.PersonalCardCreationReq;
import fi.istrange.traveler.api.PersonalCardRes;
import fi.istrange.traveler.api.PersonalCardUpdateReq;
import fi.istrange.traveler.auth.AuthorizedUser;
import io.dropwizard.auth.Auth;
import io.swagger.annotations.*;

import javax.annotation.security.PermitAll;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by arsenii on 4/7/17.
 */
@Path("/personal-cards")
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "/personal-cards", tags = "personal cards")
@PermitAll
public class PersonalCardResource {

    // TODO DAO will go here as parameter
    public PersonalCardResource() {
    }

    @GET
    public List<PersonalCardRes> getTravelCards(@ApiParam(hidden = true) @Auth AuthorizedUser authorizedUser) {
        // TODO access DAO here and get list of personal cards
        return new ArrayList<>();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public PersonalCardRes createTravelCard(
            @ApiParam(hidden = true) @Auth AuthorizedUser authorizedUser,
            PersonalCardCreationReq personalCardCreationReq) {
        // TODO put new card in the db
        return new PersonalCardRes();
    }

    @GET
    @Path("/{id}")
    public PersonalCardRes getTravelCard(
            @ApiParam(hidden = true) @Auth AuthorizedUser authorizedUser,
            @PathParam("id") long personalCardId) {
        // TODO get card from the db
        return new PersonalCardRes();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public PersonalCardRes updateTravelCard(
            @ApiParam(hidden = true) @Auth AuthorizedUser authorizedUser,
            @PathParam("id") long personalCardId,
            PersonalCardUpdateReq personalCardUpdateReq) {
        // TODO update card in the db
        return new PersonalCardRes();
    }

    @DELETE
    @Path("/{id}")
    public PersonalCardRes deactivateTravelCard(
            @ApiParam(hidden = true) @Auth AuthorizedUser authorizedUser,
            @PathParam("id") long personalCardId) {
        // TODO deactivate card record
        return new PersonalCardRes();
    }
}
