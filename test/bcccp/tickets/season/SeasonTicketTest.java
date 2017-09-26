
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
        endValidPeriod = 10L;
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
        assertEquals(sut.getUsageRecords().size(), 1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");  
    }
    
     /**
     * Test of endUsage method, of class SeasonTicket.
     */
    @Test 
    public void testEndUsageForNullUsgaeRecord() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Test endUsage() method with null usage record");
        //sut.recordUsage(record);
        try {
            sut.endUsage(endValidPeriod);
        } catch (RuntimeException e) {
            System.out.println("ticket is not in use");
            return;
        }
        System.out.println("End Valid Period is: "+ sut.getEndValidPeriod()); 
        System.out.println("End of test");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");   
    }
    
     /**
     * Test of endUsage method, of class SeasonTicket.
     */
    @Test 
    public void testEndUsage() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Test endUsage() method");
        sut.recordUsage(record);
        try {
            sut.endUsage(endValidPeriod);
        } catch (RuntimeException e) {
            System.out.println("errrrror");
            return;
        }
        System.out.println("End Valid Period is: "+ sut.getEndValidPeriod()); 
        System.out.println("End of test");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");   
    }
    
    
    /**
     * Test of toString method, of class SeasonTicket.
     */
    @Test
    public void testToString() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");  
        System.out.println("Test toString() method");
        
        String expResult="Carpark    : Bathurst Chase\n"
                          +"Ticket No  : S1111";
        String result = sut.toString().trim();
        System.out.println("expected: "+expResult); 
        System.out.println("actual: "+result);
        assertEquals(expResult, result);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");  
    }
    
    
    /*
    Test constructor metho
    */
    @Test
    public void testSeasonTicketConstructor () {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");  
        System.out.println("Test constructor() method");
        
        SeasonTicket obj = new SeasonTicket(ticketId,carparkId,startValidPeriod,endValidPeriod);
        
       

        String expResult="Carpark    : Bathurst Chase\n"
                  +"Ticket No  : S1111";
        String actual = obj.toString().trim();
        assertEquals(expResult, actual);
        System.out.println("Test Passed..");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");  
	}

    
    
}
