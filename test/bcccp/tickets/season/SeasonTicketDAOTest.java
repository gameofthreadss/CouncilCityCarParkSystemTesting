
package bcccp.tickets.season;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarpark;
import bcccp.tickets.adhoc.AdhocTicketDAO;
import bcccp.tickets.adhoc.AdhocTicketFactory;
import bcccp.tickets.adhoc.IAdhocTicketDAO;
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
    
    
    IAdhocTicketDAO adhocTicketDAO = new AdhocTicketDAO(new AdhocTicketFactory());
    ISeasonTicketDAO seasonTicketDAO = new SeasonTicketDAO(new UsageRecordFactory());
    ISeasonTicket t1 = new SeasonTicket("S1111","Bathurst Chase", 0L, System.currentTimeMillis() );
    Carpark carpark = new Carpark("Bathurst Chase", 5, adhocTicketDAO, seasonTicketDAO);
    
    
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
    
    
    /**
     * Test of getNumberOfTickets method, of class SeasonTicketDAO.
     */
    @Test
    public void testGetNumberOfTickets() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++"); 
        System.out.println("Test getNumberOfTickets() method");
        sut.registerTicket(ticket);
        System.out.println("Number of registered tickets/ before : "+ sut.getNumberOfTickets());   
        sut.deregisterTicket(ticket);
        System.out.println("Number of registered tickets/ after: "+ sut.getNumberOfTickets()); 
        int expResult = 0;     
        int actResult = sut.getNumberOfTickets();   
        assertEquals(expResult, actResult);
        System.out.println("End Test "); 
        System.out.println("++++++++++++++++++++++++++++++++++++++++"); 
    }
    
     /**
     * Test of recordTicketExit method, of class SeasonTicketDAO.
     */
    @Test
    public void testRecordTicketExit() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++"); 
        System.out.println("Test recordTicketExit() method");
        
        
//        carpark.recordSeasonTicketEntry(t1.getId());
        
        seasonTicketDAO.registerTicket(t1);
        seasonTicketDAO.recordTicketEntry(t1.getId());
//        seasonTicketDAO.recordTicketEntry("1111");
        seasonTicketDAO.recordTicketExit(t1.getId());
        System.out.println("Ticket expires on : "+ t1.getEndValidPeriod()); 
        long getEndValidPeriod = t1.getEndValidPeriod();
        System.out.println("End Test "); 
        System.out.println("++++++++++++++++++++++++++++++++++++++++"); 
    }


    
    
}
