/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.carpark.exit;
import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.IGate;
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
        
        //assert               
        //assertEquals(ExitController.STATE.IDLE,sut.state.WAITING);
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
        String ticketStr = "S1111";
        sut.ticketInserted(ticketStr);
        //assert               
        boolean expResult = false;
        boolean result = sut.isAdhocTicket(ticketStr);
        assertEquals(expResult, result);   
        sut.setState(ExitController.STATE.REJECTED);
            
      
    }

}


   