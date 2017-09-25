
package bcccp.tickets.season;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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
    
    IUsageRecord record;
    private List<IUsageRecord> lstUsages;

    
    
       
    @Before
    public void setUp() {
        
        
        ticketId = "S1111";
        carparkId = "Bathurst Chase";
        startValidPeriod = 0L;
        endValidPeriod = 0L;
        record = mock(IUsageRecord.class);
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
        System.out.println("++++++++++++++++++++++++++++++++++++++++");  
        System.out.println("Test get Ticket Id");        
        System.out.println("Ticket ID is: " +ticketId);
        System.out.println("Ticket ID from method call is: " + sut.getId());
        assertEquals(sut.getId(), ticketId);
        System.out.println("End of test");   
        System.out.println("++++++++++++++++++++++++++++++++++++++++");  
    }
    
    /**
     * Test of recordUsage method, of class SeasonTicket.
     */
    @Test
    public void testRecordUsage() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");  
        System.out.println("Test recordUsage() method");
        System.out.println("previous item count: "+ sut.getUsageRecords().size());
        sut.recordUsage(record);
        System.out.println("new item count: "+ sut.getUsageRecords().size());
        System.out.println("End of test");   
        System.out.println("++++++++++++++++++++++++++++++++++++++++");  
    }
    
     /**
     * Test of endUsage method, of class SeasonTicket.
     */
    @Test
    public void testEndUsage() {
        System.out.println("endUsage");
        long dateTime = 0L;
        SeasonTicket instance = null;
        instance.endUsage(dateTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
