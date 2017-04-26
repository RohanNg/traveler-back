package fi.istrange.traveler.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by aleksandr on 11.4.2017.
 */
public class CardRes {
    private Long id;
    private Date startTime;
    private Date endTime;
    private BigDecimal lon;
    private BigDecimal lat;
    private UserProfileRes owner;

    public CardRes(
        Long id,
        Date startTime,
        Date endTime,
        BigDecimal lon,
        BigDecimal lat,
        UserProfileRes owner
    ) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lon = lon;
        this.lat = lat;
        this.owner = owner;
    }

    @JsonProperty
    public Long getID() {
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
    public BigDecimal getLatitude() {
        return lat;
    }

    @JsonProperty
    public BigDecimal getLongitude() {
        return lon;
    }

    @JsonProperty
    public UserProfileRes getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardRes cardRes = (CardRes) o;
        return Objects.equal(id, cardRes.id) &&
                Objects.equal(startTime, cardRes.startTime) &&
                Objects.equal(endTime, cardRes.endTime) &&
                Objects.equal(lon, cardRes.lon) &&
                Objects.equal(lat, cardRes.lat) &&
                Objects.equal(owner, cardRes.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, startTime, endTime, lon, lat, owner);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("startTime", startTime)
                .add("endTime", endTime)
                .add("lon", lon)
                .add("lat", lat)
                .add("owner", owner)
                .toString();
    }
}
