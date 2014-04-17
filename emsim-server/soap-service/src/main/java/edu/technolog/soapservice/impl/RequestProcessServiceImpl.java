/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.technolog.soapservice.impl;

/**
 *
 * @author Администратор
 */
import edu.technolog.models.Incident;
import edu.technolog.soapservice.RequestProcessService;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author Администратор
 */

@WebService(serviceName = "RequestProcess",
            portName = "RequestProcessPort",	
            endpointInterface = "edu.technolog.soapservice.RequestProcessService",
            targetNamespace = "http://technolog.edu/jaxws/requestprocess",
            wsdlLocation = "RequestProcess.wsdl")
//target\generated-sources\wsdl
public class RequestProcessServiceImpl implements RequestProcessService{
    	public List<Incident> processRequest(double[] params) {
                List<Incident> incidents = new ArrayList<>();
		
                // Do processing...
                
                Incident incident1 = new Incident(10, "Inc1", 30.60, 60.30);
                Incident incident2 = new Incident(11, "Inc2", 30.59, 59.30);
                
                incidents.add(incident1);
                incidents.add(incident2);
		
		return incidents;
	}

}
