import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    // class print all number 1 -225 method
    public static void printAllnumber()
    {
        //for loop to print 1 to 255
        for(int i = 1; i<=225; i++)
        { 
            System.out.println("All number: " + i);
        }
    }
    // class print odd numbers between 1-255
    public static void printOddnumber()
    {
        for(int i = 1; i<=225; i++)
        { 
            if(i % 2 !=0)
            {
                System.out.println(i + " is odd number ");
            }  
        }
    }

    /* Sigma of 255 AKA Sum to 255
    Write a method that creates and eventually returns 
    a sum variable that adds up all the numbers from 1 to 255. 
    In this method you are not printing the sum, except to debug 
    if you need to, the method should return the sum. 
    Note: You do not need an array to write this function.*/
    public static void printSumnumber()
    {
        // initial sum
        int sum =0;
        for(int i =1; i<=255; i++)
        {
            sum = i+ sum;
            
        }
        System.out.println("Sum: " + sum );
        //return sum;
        //return sum;
    }

    /* Iterating through an array
    Given an array X, say [1,3,5,7,9,13], write a method that would iterate 
    through each member of the array and print each value on the screen. 
    Being able to loop through each member of the array is extremely important. */
    public static void printIterateArray()
    {
        int array[] = {1,3,5,7,9,13};
        int i, n;
        for(i =0; i<array.length; i++)
        {
            n = array[i];
            System.out.println("Print array number: " + n );
        }
    }

    /* Find Max
    Write a method (sets of instructions) that takes any array and prints the 
    maximum value in the array. Your method should also work with a given array 
    that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive 
    numbers, negative numbers and zero. */
    // public static int printFindMax(int[] max, int n)
    // {
    //     Arrays.sort(max);
    //     return max[n-1];
    // }
    public static int[] printFindMax(int[] max, int i2)
    {
        int i;
        int arr = max[0];
        for( i = 1; i<max.length; i++)
        {
            if(max[i]>arr)
            arr = max[i];
        }
        return max;

    }

    /* Find Max 
     */
    public static void printFindMin()
    {
        int [] arr = new int [] {-3, -5, -7};
        int min =arr[0];
        // loop through array
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]<min)
            min= arr[i];
        
        }
        System.out.println("Minimum: " + min);
        //return min; 
    }

    /* Array with Odd Numbers 
    Write a method that creates an array 'y' that contains all the odd numbers 
    between 1 to 255. When the method is done, 'y' should have the value
    of [1, 3, 5, 7, ... 255]. */
    public static void printOddnumberArray()
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i =1; i<=225; i++)
        {
            if(i % 2 !=0)
            {
                array.add(i);
            }
        }
        System.out.println(array);
    }

    /* Get Average
    Write a method that takes an array, and prints the AVERAGE of the values 
    in the array. For example for an array [2, 10, 3], your method should 
    print an average of 5. Again, make sure you come up with a simple base 
    case and write instructions to solve that base case first, then test 
    your instructions for other complicated cases. */
    public static void printFindAverage()
    {
        int [] arr = new int [] {2, 10, 5};
        // int min =arr[0];
        int avg =0;
        int sum = arr[0];
        for(int i = 1; i<arr.length; i++)
        {
            sum = arr[i] + sum;
        }
        avg = sum/arr.length;
        System.out.println("Average: " + avg);
        // return arr;

    }

    /* Greater Than Y
    Write a method that takes an array and returns the number of values in 
    that array whose value is greater than a given value y. 
    For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will 
    print 2 (since there are two values in the array that are greater than 3). */
    public static void greaterThanY()
    {
        int [] arr = new int[]{1, 3, 5, 7};
        int count =0;
        int y =3;
        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i] > y)
            {
                count ++;
            }
        }
        System.out.println("Value great than Y: " + count);

    }

    /* Square the values
    Given any array x, say [1, 5, 10, -2], write a method that multiplies 
    each value in the array by itself. When the method is done, 
    the array x should have values that have been squared, say [1, 25, 100, 4]. */
    public static void squareValues()
    {
        int [] arr = new int[]{1, 5, 10, -2};
        for( int i = 1; i<arr.length; i++)
        {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println("Square the values: " + Arrays.toString(arr) );

    }

    /* Eliminate Negative Numbers
    Given any array x, say [1, 5, 10, -2], write a method that replaces any 
    negative number with the value of 0. When the method is done, x should 
    have no negative values, say [1, 5, 10, 0]. */
    public static void elminateNumber()
    {
        int [] arr = new int[]{1, 5, 10, -2};
        int x =0;
        for( int i = 0; i<arr.length; i++)
        {
            if( arr[i]< 0)
            arr[i]= x;
        }
        System.out.println("No negative values: " + Arrays.toString(arr) );

    }

    /* Max, Min, and Average
    Given any array x, say [1, 5, 10, -2], write a method that returns an array
    with the maximum number in the array, the minimum value in the array, 
    and the average of the values in the array. The returned array should 
    be three elements long and contain: [MAXNUM, MINNUM, AVG] */
    public static int[] maxMinAverage(int [] x)
    {
        //int [] arr = new int[]{1, 5, 10, -2};
        //int i;
        int [] newArrays = new int[3];
        int max = x[0];
        for(int i = 1; i<x.length; i++)
        {
            if(x[i]>max)
            max = x[i];
        }
        newArrays[0] = max;
    
        // Find min
        int min =x[0];
        // loop through array
        for(int i =1; i<x.length; i++)
        {
            if(x[i]<min)
            min= x[i];
        }
        newArrays[1] = min;
        // Average 
        int avg =0;
        int sum = 0;
        for(int i = 0; i<x.length; i++)
        {
            sum = x[i] + sum;
        }
        avg = sum/x.length;
        newArrays[2] = avg;
        //System.out.println("Average: " + avg);
        return newArrays;
    }

    /* Shifting the Values in the Array
    Given any array x, say [1, 5, 10, 7, -2], write a method that shifts 
    each number by one to the front. For example, when the method is done, 
    an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. 
    Notice that the last number is 0. The method does not need to wrap 
    around the values shifted out of bounds.*/


}
