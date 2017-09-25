
package bcccp.tickets.season;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oshan
 */
public class SeasonTicketTest {
    
    SeasonTicket sut;
    String ticketId;
    String carparkId;
    long startValidPeriod;
    long endValidPeriod;
    
    
       
    @Before
    public void setUp() {
        
        
        ticketId = "S1111";
        carparkId = "Bathurst Chase";
        startValidPeriod = 0L;
        endValidPeriod = 0L;
        sut = new SeasonTicket(ticketId, carparkId, startValidPeriod, endValidPeriod);
    }
    
    @After
    public void tearDown() {
        sut = null;
    }
    
    
     /**
     * Test of getId method, of class SeasonTicket.
     */
    @Test//(expected=RuntimeException.class) 
    public void testGetId() {
        System.out.println("get Ticket Id");        
        System.out.println("Ticket ID is: " +ticketId);
        System.out.println("Ticket ID from method call is: " + sut.getId());
        assertEquals(sut.getId(), ticketId);
    }
    
    /**
     * Test of recordUsage method, of class SeasonTicket.
     */
    @Test
    public void testRecordUsage() {
        System.out.println("recordUsage");
        IUsageRecord record = null;
        SeasonTicket instance = null;
        instance.recordUsage(record);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
