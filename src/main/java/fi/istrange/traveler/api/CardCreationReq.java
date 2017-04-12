package fi.istrange.traveler.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

/**
 * Created by aleksandr on 11.4.2017.
 */
public class CardCreationReq {

    private Long id;
    private Date startTime;
    private Date endTime;
    private Long lon;
    private Long lat;

    public CardCreationReq(
            Long id,
            Date startTime,
            Date endTime,
            Long lon,
            Long lat
    ) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lon = lon;
        this.lat = lat;
    }

    @JsonProperty
    public Long getId() {
        return id;
    }

    @JsonProperty
    public Date getStartTime() {
        return startTime;
    }

    @JsonProperty
    public Date getEndTime() {
        return endTime;
    }

    @JsonProperty
    public Long getLon() {
        return lon;
    }

    @JsonProperty
    public Long getLat() {
        return lat;
    }
}