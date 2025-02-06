import java.util.Scanner;

public class MainApp {

    private static int[] array;

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        



        in.close();
    }

    private static void createArray(Scanner in)
    {

    }

    private static boolean isInitialized()
    {
        if(array == null)
        {
            System.out.println("Array didn't created. Create an array before doing an operation.");
        }

        return true;
    }

    private static void findMaxAndMin()
    {


    }

    private static void averageAndDiffs()
    {

    }

    /**
     * This function finds the sum of
     * elements in odd and even indexes 
     * seperately. Then prints them.
     *
     * @author Yiğit Kaan Önder
     */
    private static void sumOfEvenAndOddIndexesOfArray(int[] nums) 
    {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 0; i < nums.length; i+=2) 
        {
            sumOfEven += nums[i];
            sumOfOdd += nums[i + 1];
        }

        System.out.println("Sum of odd numbers is: " + sumOfOdd);
        System.out.println("Sum of even numbers is: " + sumOfEven);
    }

    
}
