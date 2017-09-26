
package bcccp.tickets.season;

import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 *
 * @author Oshan
 */
public class SeasonTicketDAOTest {
    
    private Map<String, ISeasonTicket> currentTickets;
    private IUsageRecordFactory factory;
    SeasonTicketDAO sut;
    
    @Before
    public void setUp() {         
        currentTickets = null;
        factory = mock(IUsageRecordFactory.class);        
        sut = new SeasonTicketDAO(factory);
    }
    
    @After
    public void tearDown() {
        sut = null;
    }

    /**
     * Test of registerTicket method, of class SeasonTicketDAO.
     */
    @Test
    public void testRegisterTicket() {
        System.out.println("registerTicket");
        ISeasonTicket ticket = null;
        SeasonTicketDAO instance = null;
        instance.registerTicket(ticket);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deregisterTicket method, of class SeasonTicketDAO.
     */
    @Test
    public void testDeregisterTicket() {
        System.out.println("deregisterTicket");
        ISeasonTicket ticket = null;
        SeasonTicketDAO instance = null;
        instance.deregisterTicket(ticket);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfTickets method, of class SeasonTicketDAO.
     */
    @Test
    public void testGetNumberOfTickets() {
        System.out.println("getNumberOfTickets");
        SeasonTicketDAO instance = null;
        int expResult = 0;
        int result = instance.getNumberOfTickets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findTicketById method, of class SeasonTicketDAO.
     */
    @Test
    public void testFindTicketById() {
        System.out.println("findTicketById");
        String barcode = "";
        SeasonTicketDAO instance = null;
        ISeasonTicket expResult = null;
        ISeasonTicket result = instance.findTicketById(barcode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recordTicketEntry method, of class SeasonTicketDAO.
     */
    @Test
    public void testRecordTicketEntry() {
        System.out.println("recordTicketEntry");
        String ticketId = "";
        SeasonTicketDAO instance = null;
        instance.recordTicketEntry(ticketId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recordTicketExit method, of class SeasonTicketDAO.
     */
    @Test
    public void testRecordTicketExit() {
        System.out.println("recordTicketExit");
        String ticketId = "";
        SeasonTicketDAO instance = null;
        instance.recordTicketExit(ticketId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
