/**
 * @author      Matthew Garcia <matthew_garcia@keeplukealive.com>
 * @version     1
 * @since       2014-06-12
 */

import java.io.*;

public class Interleave
{
    /**
     * Counts the number of elements contained in all sub arrays.
     * The resulting count is to be used to create a new array of size count
     * @param array The array that contains all the sub arrays.
    
     * @return            The count of all elements discovered.
     */
    public int getNumElements(int [][] array)
    {
        int count=0;
        
        for (int i=0; i<array.length;i++)
        {
            count+=array[i].length;
        }
        return count;
    }
    /**
     * Copies all the elements of a 2D array into a 1D in a interleaving pattern.
     * Used by the interleave function in order to do all the heavy lifting
     * @param array The array that contains all the sub arrays.
     * @param length The length of the new 1D array.
     * @return            The count of all elements discovered.
     */
    
    
    public int [] copyElements(int length,int [][] array)
    {
        int out[]=new int[length];
        //look up table used to determine the position in the matrix.
        int itrTable[]= new int[array.length];
        
        for (int i=0; i<length;)
        {
            for(int j =0; j< array.length; j++)
            {
                if(itrTable[j]<array[j].length)
                {
                    //move the position in the result array, increment the iteration lookup table. This syntax provided a .025 ms gain in performance
                    out[i++]=array[j][itrTable[j]++];
                }
                
            }
        }
        return out;
        
    }
    /**
     * Combines the copyElements and getNumeElements functions.
     * Takes in the array of arrays and returns a 1D array with the
     * elements of the 2D array Interleaved.
     * @param array The array that contains all the sub arrays.
     * @return            The count of all elements discovered.
     */
    public int [] interleave(int [][] array)
    {
        Interleave intr = new Interleave();
        int num= intr.getNumElements(array);
        
        
        int [] out= intr.copyElements(num,array);
        
        return out;
        
    }


}




