/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.technolog.db.dao;

import edu.technolog.db.mappers.IncidentMapper;
import edu.technolog.models.Incident;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
/**
 *
 * @author Администратор
 */
public interface IncidentDao {
    @SqlQuery("select count(*) from incidents")
    long incidentsCount();

    @SqlQuery("select * from incidents where id = :id")
    @Mapper(IncidentMapper.class)
    Incident getById(@Bind("id") long id);

    @SqlQuery("select * from incidents where description = :description")
    @Mapper(IncidentMapper.class)
    Incident getByDescription(@Bind("description") String description);

    @SqlUpdate("update incidents set description = :description where id=:id")
    void updateDescription(@Bind("id") long id, @Bind("description") String description);

    @SqlUpdate("insert into incidents(description, lat, lon) " +
            "values (:description, :lat, :lon)")
    @GetGeneratedKeys
    long insert(@Bind("description") String description, @Bind("lat") double lat,
                @Bind("lon") double lon);

    void close();
}
