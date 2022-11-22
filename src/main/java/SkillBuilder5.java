import java.util.Objects;
/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class SkillBuilder5
{
    /**
     * Calculates the prefix average of array data and returns the prefex average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        double counter = 0;
        double [] ray = new double[data.length];
        for(int index = 0; index < data.length; index++){
            counter += data[index];
            ray[index] = counter/ (index+1);
        }
        return ray;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int  indexOf(int searchValue, int[] anArray)
    {
        for(int index = 0; index < anArray.length; index++)
        {
            if(anArray[index] == searchValue){
                return index;
            }
        }
        return -1;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param s a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int  indexOf(String s, String[] anArray)
    {
        for(int index = 0; index < anArray.length; index++){
            if(anArray[index] == s){
                return index;
            }
        }
        return -1;
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray)
    {
        int counter = 0;
        int counter2 = 0;
        for(String strCounter: anArray){
            if(!Objects.equals(strCounter,s)){
                counter++;
            }
        }
        String [] ray = new String[counter];
        for(String strCounter2: anArray){
            if(!Objects.equals(strCounter2,s)){
                ray[counter2] = strCounter2;
                counter2++;
            }
        }
        return ray;
    }

    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray)
    {
        int [] ray = new int[anArray.length];
        for(int index = 0; index < anArray.length; index++){
            ray[index] = anArray[index];
        }
        int counter = 0;
        for(int x = anArray.length-1; x >= 0; x--){
            anArray[counter] = ray[x];
            counter++;
        }
    }
}