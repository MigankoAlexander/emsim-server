package soapservice;

import edu.technolog.db.DbiManager;
import edu.technolog.db.SchemaMigrator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.lang.invoke.MethodHandles;

import static soapservice.config.Configuration.DB;

/**
 *
 * @author Администратор
 */
public class ContextListener implements ServletContextListener {

    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("context initialized");

        try {
            log.info(DB.toString());

            DbiManager.setUp(DB.getDriverClassName(),
                    DB.getUrl(),
                    DB.getUser(),
                    DB.getPassword());

            if (DB.isSchemaMigrationRequired()) {
                SchemaMigrator migrator = new SchemaMigrator(
                        DB.getDriverClassName(),
                        DB.getUrl(),
                        DB.getUser(),
                        DB.getPassword()
                );
                //migrate without dropping schema and data
                migrator.migrate(false);
            }

        } catch (Exception ex) {
            log.error("cannot setup configs", ex);
            throw new RuntimeException("context initialized failed", ex);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        log.info("context destroyed");
    }
}
