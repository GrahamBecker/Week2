/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 207144826
 */
public class Functions {
    
    public static double divideFloatingPoints(int a,int b)
    {
      return a / b;
    }
    
    public static int addIntegers(int a,int b)
    {
      return a + b;
    } 
    
    public static boolean objEquality(String a, String b)
    {        
        if(a == b)
            return true;
        else
            return false;
    }
    
    public static String objIdentity(String a)
    {
        return a = "Testing";
    }
    
    public static boolean truth(int a, int b)
    {
        if(a == b)
            return true;
        else
            return false;
    }
    
    public static boolean notTrue(int a, int b)
    {
        if(a != b)
            return true;
        else
            return false;
    }
    
    public static String TestNull(String a)
    {
        return a;
    }
    
    public static String TestNotNull(String a)
    {
        return a = "Not null";
    }
    
    
}
