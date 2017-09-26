
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
    private ISeasonTicket ticket;
    
    
    @Before
    public void setUp() {      
        ticket = mock(ISeasonTicket.class);
       
        //currentTickets = (Map<String, ISeasonTicket>) currentTickets.put(ticket.getId(), ticket);
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
        System.out.println("++++++++++++++++++++++++++++++++++++++++");  
        System.out.println("Test get registerTicket() method");   
        sut.registerTicket(ticket);
        System.out.println("Number of registered tickets: "+ sut.getNumberOfTickets()); 
        int actualResult = sut.getNumberOfTickets();
        int expResult = 1;
        assertEquals(expResult, actualResult);
        System.out.println("End Test "); 
        System.out.println("++++++++++++++++++++++++++++++++++++++++");  
    }
    
    /**
     * Test of deregisterTicket method, of class SeasonTicketDAO.
     */
    @Test
    public void testDeregisterTicket() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++"); 
        System.out.println("Test deregisterTicket() method");
        sut.registerTicket(ticket);
        System.out.println("Number of registered tickets/ before : "+ sut.getNumberOfTickets()); 
        sut.deregisterTicket(ticket);
        System.out.println("Number of registered tickets/ after: "+ sut.getNumberOfTickets()); 
        int actualResult = sut.getNumberOfTickets();
        int expResult = 0;
        assertEquals(expResult, actualResult);
        System.out.println("End Test "); 
        System.out.println("++++++++++++++++++++++++++++++++++++++++"); 
        
    }

    
    
}
