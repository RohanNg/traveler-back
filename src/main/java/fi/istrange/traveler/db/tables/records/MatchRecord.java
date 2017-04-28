/*
 * This file is generated by jOOQ.
*/
package fi.istrange.traveler.db.tables.records;


import fi.istrange.traveler.db.tables.Match;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class MatchRecord extends UpdatableRecordImpl<MatchRecord> implements Record3<Long, Long, Boolean> {

    private static final long serialVersionUID = 1385034441;

    /**
     * Setter for <code>public.match.liker_card_id</code>.
     */
    public void setLikerCardId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.match.liker_card_id</code>.
     */
    public Long getLikerCardId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.match.liked_card_id</code>.
     */
    public void setLikedCardId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.match.liked_card_id</code>.
     */
    public Long getLikedCardId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.match.like_decision</code>.
     */
    public void setLikeDecision(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.match.like_decision</code>.
     */
    public Boolean getLikeDecision() {
        return (Boolean) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, Boolean> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, Boolean> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Match.MATCH.LIKER_CARD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Match.MATCH.LIKED_CARD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return Match.MATCH.LIKE_DECISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getLikerCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getLikedCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getLikeDecision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MatchRecord value1(Long value) {
        setLikerCardId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MatchRecord value2(Long value) {
        setLikedCardId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MatchRecord value3(Boolean value) {
        setLikeDecision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MatchRecord values(Long value1, Long value2, Boolean value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MatchRecord
     */
    public MatchRecord() {
        super(Match.MATCH);
    }

    /**
     * Create a detached, initialised MatchRecord
     */
    public MatchRecord(Long likerCardId, Long likedCardId, Boolean likeDecision) {
        super(Match.MATCH);

        set(0, likerCardId);
        set(1, likedCardId);
        set(2, likeDecision);
    }
}