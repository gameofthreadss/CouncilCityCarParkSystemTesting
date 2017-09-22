/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.tickets.adhoc;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author swaminarayan
 */
public class AdhocTicketDAOTest {
    
    public AdhocTicketDAOTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createTicket method, of class AdhocTicketDAO.
     */
    @Test
    public void testCreateTicket() {
        System.out.println("createTicket");
        String carparkId = "";
        AdhocTicketDAO instance = null;
        IAdhocTicket expResult = null;
      
    }
 /**
     * Test of findTicketByBarcode method, of class AdhocTicketDAO.
     */
    @Test
    public void testFindTicketByBarcode() {
        System.out.println("findTicketByBarcode");
        String barcode = "";
        AdhocTicketDAO instance = null;
        IAdhocTicket expResult = null;
      
    }

    /**
     * Test of getCurrentTickets method, of class AdhocTicketDAO.
     */
    @Test
    public void testGetCurrentTickets() {
        System.out.println("getCurrentTickets");
        AdhocTicketDAO instance = null;
        List<IAdhocTicket> expResult = null;
        List<IAdhocTicket> result = instance.getCurrentTickets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
   
}
