/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.technolog.db.DbiManager;
import edu.technolog.db.daologic.IncidentDaoLogic;
import edu.technolog.models.Incident;
import org.dbunit.Assertion;
import org.dbunit.dataset.ITable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Администратор
 */
public class IncidentDaoLogicTest {
    private static DbInitializer dbInitializer = new DbInitializer();
    private IncidentDaoLogic dao = new IncidentDaoLogic(DbiManager.getDbi());



    @BeforeClass
    public static void createScheme() {
        dbInitializer.setUpSchema();
    }

    @Test
    public void testIncidentsCount() throws Exception {
        long actual = dao.incidentsCount();
        long expected = 2;
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testSelectById() {
        Incident actual = dao.getById(1);
        Incident expected = new Incident(1,"Incident #1",59.954000,30.316666);
        Assert.assertEquals(expected, actual);
    }
}