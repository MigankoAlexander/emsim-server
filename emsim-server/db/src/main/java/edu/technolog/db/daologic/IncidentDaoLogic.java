package edu.technolog.db.daologic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package edu.technolog.db.daologic;


import edu.technolog.db.dao.IncidentDao;
import edu.technolog.models.Incident;
import org.skife.jdbi.v2.DBI;
/**
 *
 * @author Администратор
 */
public class IncidentDaoLogic {
     private DBI dbi;

    public IncidentDaoLogic(DBI dbi) {
        this.dbi = dbi;
    }

    public long incidentsCount() {
        IncidentDao dao = dbi.open(IncidentDao.class);
        long incidentsCount = dao.incidentsCount();
        dao.close();
        return incidentsCount;
    }

    public Incident getById(long id) {
        IncidentDao dao = dbi.open(IncidentDao.class);
        Incident incident = dao.getById(id);
        dao.close();
        return incident;
    }

    public Incident getByDescription(String description) {
        IncidentDao dao = dbi.open(IncidentDao.class);
        Incident incident = dao.getByDescription(description);
        dao.close();
        return incident;
    }

    public void updateDescription(long id, String description) {
        IncidentDao dao = dbi.open(IncidentDao.class);
        dao.updateDescription(id, description);
        dao.close();
    }

    public long insert(String description, double lat, double lon) {
        IncidentDao dao = dbi.open(IncidentDao.class);
        long id = dao.insert(description, lat, lon);
        dao.close();
        return id;
    }
}
