/*
 * This file is generated by jOOQ.
*/
package fi.istrange.traveler.db.tables.records;


import fi.istrange.traveler.db.tables.GroupCard;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GroupCardRecord extends UpdatableRecordImpl<GroupCardRecord> implements Record6<Long, Date, Date, Long, Long, String> {

    private static final long serialVersionUID = 1586189543;

    /**
     * Setter for <code>public.group_card.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.group_card.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.group_card.start_time</code>.
     */
    public void setStartTime(Date value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.group_card.start_time</code>.
     */
    public Date getStartTime() {
        return (Date) get(1);
    }

    /**
     * Setter for <code>public.group_card.end_time</code>.
     */
    public void setEndTime(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.group_card.end_time</code>.
     */
    public Date getEndTime() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>public.group_card.lon</code>.
     */
    public void setLon(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.group_card.lon</code>.
     */
    public Long getLon() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.group_card.lat</code>.
     */
    public void setLat(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.group_card.lat</code>.
     */
    public Long getLat() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.group_card.owner_fk</code>.
     */
    public void setOwnerFk(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.group_card.owner_fk</code>.
     */
    public String getOwnerFk() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Date, Date, Long, Long, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Date, Date, Long, Long, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return GroupCard.GROUP_CARD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field2() {
        return GroupCard.GROUP_CARD.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return GroupCard.GROUP_CARD.END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return GroupCard.GROUP_CARD.LON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return GroupCard.GROUP_CARD.LAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return GroupCard.GROUP_CARD.OWNER_FK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value2() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getLon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getLat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOwnerFk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupCardRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupCardRecord value2(Date value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupCardRecord value3(Date value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupCardRecord value4(Long value) {
        setLon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupCardRecord value5(Long value) {
        setLat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupCardRecord value6(String value) {
        setOwnerFk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupCardRecord values(Long value1, Date value2, Date value3, Long value4, Long value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GroupCardRecord
     */
    public GroupCardRecord() {
        super(GroupCard.GROUP_CARD);
    }

    /**
     * Create a detached, initialised GroupCardRecord
     */
    public GroupCardRecord(Long id, Date startTime, Date endTime, Long lon, Long lat, String ownerFk) {
        super(GroupCard.GROUP_CARD);

        set(0, id);
        set(1, startTime);
        set(2, endTime);
        set(3, lon);
        set(4, lat);
        set(5, ownerFk);
    }
}
