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
            assertEquals(actualSut,sut);
           fail("Should have thrown exception");
    }

}


   