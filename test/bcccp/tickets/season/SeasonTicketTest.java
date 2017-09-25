
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

    
    
}