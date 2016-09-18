/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.Person;
import org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.Person.Address;

/**
 *
 * @author mogens
 */
public class ClientTest {
    
    public ClientTest() {
    }
    
    @Test
    public void addPerson() {
        Person person = new Person();
        person.setFirstName("Anita");
        person.setLastName("Rasmussen");
        person.setPhone("555-1234");
        Address address = new Address();
        address.setCity("København");
        address.setPostcode("2000");
        address.setStreet("Amagerbrogade 12");
        person.setAddress(address);
        assertEquals("done", addPerson_1(person));
    }

    private static String addPerson_1(org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.Person person) {
        org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.WhitepagesWSDLService service = new org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.WhitepagesWSDLService();
        org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.WhitepagesWSDLPortType port = service.getWhitepagesWSDLPortTypeBindingPort();
        return port.addPerson(person);
    }
}
