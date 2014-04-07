package edu.technolog.db.mappers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package db.mappers;

import edu.technolog.models.Incident;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Администратор
 */
public class IncidentMapper implements ResultSetMapper<Incident> {
    @Override
    public Incident map(int i, ResultSet rs, StatementContext statementContext) throws SQLException {
        return new Incident(rs.getLong("id"), rs.getString("description"), rs.getDouble("lat"), rs.getDouble("lon"));
    }
}