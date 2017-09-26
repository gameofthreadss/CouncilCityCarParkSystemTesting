
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
    private ISeasonTicket ticket,ticket1,ticket2;
    
    
    @Before
    public void setUp() {      
        ticket = mock(ISeasonTicket.class);
        ticket1 = mock(ISeasonTicket.class);
        ticket2= mock(ISeasonTicket.class);
       
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
        System.out.println("Size: "+ sut.getNumberOfTickets()); 
        System.out.println("End Test "); 
        System.out.println("++++++++++++++++++++++++++++++++++++++++");  
    }

    
    
}
