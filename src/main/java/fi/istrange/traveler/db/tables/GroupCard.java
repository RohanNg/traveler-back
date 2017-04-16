/*
 * This file is generated by jOOQ.
*/
package fi.istrange.traveler.db.tables;


import fi.istrange.traveler.db.Keys;
import fi.istrange.traveler.db.Public;
import fi.istrange.traveler.db.tables.records.GroupCardRecord;
import org.jooq.*;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;


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
public class GroupCard extends TableImpl<GroupCardRecord> {

    private static final long serialVersionUID = -753210666;

    /**
     * The reference instance of <code>public.group_card</code>
     */
    public static final GroupCard GROUP_CARD = new GroupCard();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GroupCardRecord> getRecordType() {
        return GroupCardRecord.class;
    }

    /**
     * The column <code>public.group_card.id</code>.
     */
    public final TableField<GroupCardRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.group_card.start_time</code>.
     */
    public final TableField<GroupCardRecord, Date> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>public.group_card.end_time</code>.
     */
    public final TableField<GroupCardRecord, Date> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>public.group_card.lon</code>.
     */
    public final TableField<GroupCardRecord, Long> LON = createField("lon", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.group_card.lat</code>.
     */
    public final TableField<GroupCardRecord, Long> LAT = createField("lat", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.group_card.owner_fk</code>.
     */
    public final TableField<GroupCardRecord, String> OWNER_FK = createField("owner_fk", org.jooq.impl.SQLDataType.CHAR.length(80).nullable(false), this, "");

    /**
     * Create a <code>public.group_card</code> table reference
     */
    public GroupCard() {
        this("group_card", null);
    }

    /**
     * Create an aliased <code>public.group_card</code> table reference
     */
    public GroupCard(String alias) {
        this(alias, GROUP_CARD);
    }

    private GroupCard(String alias, Table<GroupCardRecord> aliased) {
        this(alias, aliased, null);
    }

    private GroupCard(String alias, Table<GroupCardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GroupCardRecord> getPrimaryKey() {
        return Keys.GROUP_CARD_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GroupCardRecord>> getKeys() {
        return Arrays.<UniqueKey<GroupCardRecord>>asList(Keys.GROUP_CARD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupCard as(String alias) {
        return new GroupCard(alias, this);
    }

    /**
     * Rename this table
     */
    public GroupCard rename(String name) {
        return new GroupCard(name, null);
    }
}
