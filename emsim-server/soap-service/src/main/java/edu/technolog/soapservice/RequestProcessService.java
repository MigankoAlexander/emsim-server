/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.technolog.soapservice;

import edu.technolog.models.Incident;
import java.util.List;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author Администратор
 */

@WebService(targetNamespace = "http://wsdl2java")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,use=SOAPBinding.Use.LITERAL,
        parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)

public interface RequestProcessService {
	public List<Incident> processRequest(double[] params);
}
