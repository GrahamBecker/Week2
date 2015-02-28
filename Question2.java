/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.junit.Ignore;
import static org.junit.Assert.*;

/**
 *
 * @author 207144826
 */
public class Question2 {
    
    public Question2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void divideFloatingPoints() 
    {
        //Checks value for a / b to one decimal point
        assertEquals(4.5, Functions.divideFloatingPoints(9, 2),1);
    }
    
    @Test
    public void addIntegers() 
    {
        //Checks value for a + b
        assertEquals(11,Functions.addIntegers(5,6));
    }
    
    @Test
    public void objEquality()
    {
        //Compares two strings
        assertTrue(Functions.objEquality("Test1", "Test1"));
    }
    
    @Test
    public void objIdentity()
    {
        //Compares if string 1 is same a function string
        assertSame("Testing", Functions.objIdentity(null));
    }
    
    @Test
    public void truth()
    {
        //Returns if a greater than b
        assertTrue(Functions.truth(11, 11));
    }
    
    @Test
    public void NotTrue()
    {
        //Returns if a greater than b
        assertTrue(Functions.notTrue(15, 11));
    }
    
    @Test
    public void TestNull()
    {
        //Checks if null string is equal to null
        assertNull(Functions.TestNull(null));
    }
    @Test
    public void TestNotNull()
    {
        //Checks if full string is equal to null
        assertNotNull(Functions.TestNotNull(null));
    }
    
//    @Test
//    public void Failing()
//    {
//        if (Functions.Failing(a) > 100)
//            System.out.print("Test complete");
//        else
//            System.out.print("Test failed");
//            fail();
//    }
    

    

    //private Object add(int i, int i0) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
}
