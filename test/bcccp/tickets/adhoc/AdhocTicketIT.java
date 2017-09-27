/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.tickets.adhoc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author swaminarayan
 */
public class AdhocTicketIT{
    
    public AdhocTicketIT() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBarcode method, of class AdhocTicket.
     */
    @Test
    public void testGetBarcode() {
        System.out.println("getBarcode");
        AdhocTicket instance = null;
        String expResult = "";        
       
    }

    /**
     * Test of getCarparkId method, of class AdhocTicket.
     */
    @Test
    public void testGetCarparkId() {
        System.out.println("getCarparkId");
        AdhocTicket instance = null;
        String expResult = "";
        
    }
/**
     * Test of getTicketNo method, of class AdhocTicket.
     */
    @Test
    public void testGetTicketNo() {
        System.out.println("getTicketNo");
        AdhocTicket instance = null;
        int expResult = 0;
        
    }

    /**
     * Test of enter method, of class AdhocTicket.
     */
    @Test
    public void testEnter() {
        System.out.println("enter");
        long entryDateTime = 0L;
        
    }

    /**
     * Test of getEntryDateTime method, of class AdhocTicket.
     */
    @Test
    public void testGetEntryDateTime() {
        System.out.println("getEntryDateTime");
        AdhocTicket instance = null;
        long expResult = 0L;
        
    }
    
    /**
     * Test of pay method, of class AdhocTicket.
     */
    @Test
    public void testPay() {
        System.out.println("pay");
        long paidDateTime = 0L;
        float charge = 0.0F;
       
    }

    /**
     * Test of getPaidDateTime method, of class AdhocTicket.
     */
    @Test
    public void testGetPaidDateTime() {
        System.out.println("getPaidDateTime");
        AdhocTicket instance = null;
        long expResult = 0L;
        
    }

    /**
     * Test of getCharge method, of class AdhocTicket.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        AdhocTicket instance = null;
        float expResult = 0.0F;
        
    }
/**
     * Test of toString method, of class AdhocTicket.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AdhocTicket instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCurrent method, of class AdhocTicket.
     */
    @Test
    public void testIsCurrent() {
        System.out.println("isCurrent");
        AdhocTicket instance = null;
        boolean expResult = false;
     
    }

    /**
     * Test of isPaid method, of class AdhocTicket.
     */
    @Test
    public void testIsPaid() {
        System.out.println("isPaid");
        AdhocTicket instance = null;
        boolean expResult = false;
        
    }

    /**
     * Test of exit method, of class AdhocTicket.
     */
    @Test
    public void testExit() {
        System.out.println("exit");
        long dateTime = 0L;
        AdhocTicket instance = null;
        instance.exit(dateTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExitDateTime method, of class AdhocTicket.
     */
    @Test
    public void testGetExitDateTime() {
        System.out.println("getExitDateTime");
        AdhocTicket instance = null;
        long expResult = 0L;
      
    }

    /**
     * Test of hasExited method, of class AdhocTicket.
     */
    @Test
    public void testHasExited() {
        System.out.println("hasExited");
        AdhocTicket instance = null;
        boolean expResult = false;
        
    }
    
    
}


