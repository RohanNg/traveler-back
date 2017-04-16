package fi.istrange.traveler.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import fi.istrange.traveler.db.tables.pojos.GroupCard;
import fi.istrange.traveler.db.tables.pojos.TravelerUser;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by arsenii on 4/8/17.
 */
public class GroupCardRes extends CardRes {

    private List<String> participants;

    public GroupCardRes(
        Long id,
        Date startTime,
        Date endTime,
        Long lon,
        Long lat,
        UserProfileRes owner,
        List<String> participants
    ) {
        super(id, startTime, endTime, lon, lat, owner);
        this.participants = participants;
    }

    @JsonProperty
    public List<String> getParticipants() {
        return participants;
    }

    public static GroupCardRes fromEntity(GroupCard card, List<TravelerUser> participants, String ownerUN) {
        Optional<TravelerUser> optionalOwner = participants.stream()
                .filter(p -> p.getUsername() == ownerUN)
                .findFirst();

        return new GroupCardRes(
                card.getId(),
                card.getStartTime(),
                card.getEndTime(),
                card.getLon(),
                card.getLat(),
                optionalOwner.isPresent() ? UserProfileRes.fromEntity(optionalOwner.get()) : null,
                participants.stream()
                        .map(p -> p.getUsername())
                        .collect(Collectors.toList())
        );
    }
}
