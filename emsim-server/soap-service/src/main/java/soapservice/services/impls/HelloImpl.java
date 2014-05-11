package soapservice.services.impls;

import soapservice.services.Hello;

import javax.jws.WebService;

/**
 * Created by vitaly on 5/11/14.
 */

@WebService(endpointInterface = "soapservice.services.Hello")
public class HelloImpl implements Hello {

    @Override
    public void sayHello() {
        System.out.println("Hello World!!!");
    }

}
