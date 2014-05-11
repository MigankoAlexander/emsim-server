package soapservice.services;

import edu.technolog.models.Incident;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by vitaly on 5/11/14.
 */
@WebService
public interface Incidents {
    public List<Incident> getIncidents(double[] params);
}
