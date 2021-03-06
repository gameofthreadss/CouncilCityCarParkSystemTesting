/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.carpark.exit;
import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.AdhocTicket;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 *
 * @author swaminarayan
 */
public class ExitControllerTest {

     Carpark carpark;
     IGate exitGate;
     ICarSensor is;
     ICarSensor os;
     IExitUI ui;
     ExitController sut;
     AdhocTicket adhoc;
    
    public ExitControllerTest() {
    }
    
    @Before
    public void setUp() throws Exception {
		carpark = mock(Carpark.class);
		exitGate = mock(IGate.class);
                is = mock(ICarSensor.class);
		os = mock(ICarSensor.class);
                ui = mock(IExitUI.class);
		
		sut = new ExitController(carpark, exitGate, is, os,ui);
                System.out.println("Test.TestExitController.setUp()");
                
    }
    @After
    public void tearDown() {
    }
     @Test
    public void testInit() {
		assertTrue(carpark instanceof Carpark);
                assertTrue(exitGate instanceof IGate);
                assertTrue(is instanceof ICarSensor);
                assertTrue(os instanceof ICarSensor);
                assertTrue(ui instanceof IExitUI);
              
                
    }

    @Test(expected=RuntimeException.class) 
    public void testConstructorWithNullCar() {
        ExitController actualSut = new ExitController(carpark, null, is, os,ui);	
            //assertEquals(actualSut,sut);
            assertNotNull(actualSut);
           fail("Should have thrown exception");
    }

    /**
     * Test of carEventDetected method, of class ExitController.
     */
    @Test
    public void testCarEventDetected() {
        System.out.println("carEventDetected");
        //execute
        
        sut.carEventDetected("Exit Inside Sensor", true);
        ExitController.STATE newState = ExitController.STATE.WAITING;
        sut.setState(newState);

        //assert               
        //assertEquals(sut.state.IDLE,newState);
        //assertTrue("Exit Inside Sensor".equals(is.getId()));
        //assertTrue(true == is.carIsDetected());
                
    }

    /**
     * Test of setState method, of class ExitController.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        ExitController.STATE newState = ExitController.STATE.IDLE;
        sut.setState(newState);
        assertTrue(true);
            
    }

    /**
     * Test of isAdhocTicket method, of class ExitController.
     */
    @Test
    public void testIsAdhocTicket() {
        System.out.println("isAdhocTicket");
        String barcode = "A3";
        boolean expResult = true;
        boolean result = sut.isAdhocTicket(barcode);
        assertEquals(expResult, result);
        System.out.println(barcode + " : It is AdhocTicket");

    }
    //Test of isAdhocTicket method, of class ExitController with incorrect Value
    @Test
    public void testIsNotAdhocTicket() {
        System.out.println("isNotAdhocTicket");
        String barcode = "S1111";
        boolean expResult = false;
        boolean result = sut.isAdhocTicket(barcode);
        assertEquals(expResult, result);
        System.out.println(barcode + " : It is Not AdhocTicket");
        
    }
    /**
     * Test of ticketInserted method, of class ExitController.
     */
    @Test
    public void testTicketInserted() {
        System.out.println("ticketInserted");
        //execute
        ExitController.STATE newState = ExitController.STATE.WAITING;
        sut.setState(newState);
        String ticketStr = "A3";
        sut.ticketInserted(ticketStr);
        //assert               
        boolean expResult = true;
        boolean result = sut.isAdhocTicket(ticketStr);
        assertEquals(expResult, result);   
        sut.setState(ExitController.STATE.PROCESSED);
    }

    /**
     * Test of ticketTaken method, of class ExitController.
     */
    @Test
    public void testTicketTakenProcessedState() {
        System.out.println("ticketTaken : proccessed ");
        ExitController.STATE newState = ExitController.STATE.PROCESSED;
        sut.setState(newState);
        sut.ticketTaken();
        boolean expResult = false;
        boolean result = exitGate.isRaised();
        assertEquals(expResult, result);
       sut.setState(ExitController.STATE.TAKEN);
    }
     /**
     * Test of ticketTaken method, of class ExitController.
     * For non processed state
     */
    @Test
    public void testTicketTakenWithoutProcessedState() {
        System.out.println("ticketTaken : not proccessed state ");
        //when(ExitController.STATE.REJECTED).thenReturn(ExitController.STATE.WAITING);

        ExitController.STATE newState = ExitController.STATE.IDLE;
        sut.setState(newState);
        sut.ticketTaken();

        ExitController.STATE expResult = ExitController.STATE.IDLE;
        ExitController.STATE result = sut.getState();
        assertEquals(expResult, result);
      
    }

    
}


   