package soapservice.services.impls;

import edu.technolog.models.Incident;
import soapservice.services.Incidents;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vitaly on 5/11/14.
 */
@WebService(endpointInterface = "soapservice.services.Incidents")
public class IncidentsImpl implements Incidents {
    @Override
    public List<Incident> getIncidents(double[] params) {
        List<Incident> incidents = new ArrayList<>();

        // Do processing...

        Incident incident1 = new Incident(10, "Inc1", 30.60, 60.30);
        Incident incident2 = new Incident(11, "Inc2", 30.59, 59.30);

        incidents.add(incident1);
        incidents.add(incident2);

        return incidents;
    }
}
