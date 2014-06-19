/**
 * @author      Matthew Garcia <matthew_garcia@keeplukealive.com>
 * @version     1
 * @since       2014-06-12
 */


import java.io.*;
import java.util.Arrays;
public class InterleaveTest
{
    /**
     * Help function used to abitrarily fill an array.
     * Used to help test the getNumeElements function in Interleave.java
     */
    public static int [][] fillArray(int [][]array)
    
    {
        for (int i=0; i<array.length;i++)
        {
            for(int j =0; j< array[i].length; j++)
            {
                array[i][j]=j;
            }
        }
        return array;
    }
    
    
    /**
     * Tests the getNumElements Function in Interleave.java
     * Expect to get a count of 3 total elements in all sub arrays
     */
    public static void testGetNumElements1()
    {
        Interleave intr = new Interleave();
        int [][] arr= new int [3][];
        
        for(int i=0; i< arr.length; i++)
        {
            arr[i]=new int[i];
            
        }
        
        if((intr.getNumElements(arr))==3)
            System.out.println("Pass");
        else
            System.out.println("Fail");
        
        
    }
    /**
     * Tests the getNumElements Function in Interleave.java
     * Expect to get a count of 6 total elements in all sub arrays
     */
    public static void testGetNumElements2()
    {
        Interleave intr = new Interleave();
        int [][] arr= new int [3][];
        
        for(int i=0; i< arr.length; i++)
        {
            arr[i]=new int[i+1];
            
        }
        
        if((intr.getNumElements(arr))==6)
            System.out.println("Pass");
        else
            System.out.println("Fail");
        
        
    }
    /**
     * Tests the getNumElements Function in Interleave.java
     * Expect to get a count of 24 total elements in all sub arrays
     */
    public static void testGetNumElements3()
    {
        Interleave intr = new Interleave();
        int [][] arr= new int [3][];
        
        for(int i=0; i< arr.length; i++)
        {
            arr[i]=new int[ i+7];
            
        }
        
        long startTime = System.currentTimeMillis();
        
        if((intr.getNumElements(arr))==24)
            System.out.println("Pass");
        else
            System.out.println("Fail");
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
        
    }
    /**
     * Tests the copyElements Function in Interleave.java
     * This just is just checking how the algorithm performs on large data sets
     * 101315000 was the largest amount of elements in an array before memory runs out 
     * on a Mac Book Pro 13 inch.
     */
    
    public static void testCopyElements1()
    {
        Interleave intr = new Interleave();
        int [][] arr= new int [10000][];
        
        for(int i=0; i< arr.length; i++)
        {
            arr[i]=new int[i+3000];
            
        }
        arr=fillArray(arr);
        long startTime = System.currentTimeMillis();
        int [] out= intr.copyElements(intr.getNumElements(arr),arr);
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
  
        
        
    }
    
    /**
     * Tests the copyElements Function in Interleave.java
     * checking one of the given examples
     */
    public static void testCopyElements2()
    {
        Interleave intr = new Interleave();
        int [][] arr=  {{1,2,3},{4,5},{6,7,8}};
        
        long startTime = System.currentTimeMillis();
        int [] out= intr.copyElements(intr.getNumElements(arr),arr);
       
        if(Arrays.toString(out).equals("[1, 4, 6, 2, 5, 7, 3, 8]"))
            System.out.println("Pass");
        else
            System.out.println("Fail");
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
        
        
    }
    
    /**
     * Tests the copyElements Function in Interleave.java
     * checking one of the given examples
     */
    public static void testCopyElements3()
    {
        Interleave intr = new Interleave();
        int [][] arr=  {{1},{2},{3},{4,5,6,7}};
        
        long startTime = System.currentTimeMillis();
        int [] out= intr.copyElements(intr.getNumElements(arr),arr);
     
        if(Arrays.toString(out).equals("[1, 2, 3, 4, 5, 6, 7]"))
            System.out.println("Pass");
        else
            System.out.println("Fail");
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
        

        
    }
    
    /**
     * Tests the copyElements Function in Interleave.java
     * Testing empty elements.
     */
    public static void testCopyElements4()
    {
        Interleave intr = new Interleave();
        int [][] arr=  {{1},{2},{},{},{4,5,6,7}};
        
        
        
        long startTime = System.currentTimeMillis();
        int [] out= intr.copyElements(intr.getNumElements(arr),arr);
        
        if(Arrays.toString(out).equals("[1, 2, 4, 5, 6, 7]"))
            System.out.println("Pass");
        else
            System.out.println("Fail");
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
        
    }
    /**
     * Tests the interleave Function in Interleave.java
     * Mixed test I cam up with.
     */
    
    public static void testCopyElements5()
    {
        Interleave intr = new Interleave();
        int [][] arr=  {{1,6,35,29},{2,2},{},{3,10,1000,60,40,80},{},{4,5,6,7}};
        
        
        
        long startTime = System.currentTimeMillis();
        int [] out= intr.interleave(arr);
      
        if(Arrays.toString(out).equals("[1, 2, 3, 4, 6, 2, 10, 5, 35, 1000, 6, 29, 60, 7, 40, 80]"))
            System.out.println("Pass");
        else
            System.out.println("Fail");
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
        
    }
    
    
    
    public static void main(String[] args)
    {
        InterleaveTest.testGetNumElements1();
        InterleaveTest.testGetNumElements2();
        InterleaveTest.testGetNumElements3();
        InterleaveTest.testCopyElements1();
        InterleaveTest.testCopyElements2();
        InterleaveTest.testCopyElements3();
        InterleaveTest.testCopyElements4();
        InterleaveTest.testCopyElements5();
    }
    
    
    
}

