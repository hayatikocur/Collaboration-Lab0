import java.util.Scanner;

public class MainApp {

    private static int[] array;

    /**
     * This main method creates a random array
     * and a menu for different array operations
     * @author Mustafa Mert Mumcu
     */
    public static void main(String[] args) 
    {
        int size = 100;
        int[] randomArr = new int[size];

        Random random = new Random();

        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = random.nextInt(101);
        }

        boolean done = false;
        Scanner in = new Scanner(System.in);

        while (!done) {
            System.out.printf("Operation Menu:\n1) Find the array's minimum and maximum\n2) Find the average of the array\n3) Find the sum of elements with odd and even numbered indexed\n4) Exit\n\nPlease enter your operation: ");

            int operation = in.nextInt();

            if (operation == 1) {
                System.out.println("1");
            } else if (operation == 2) {
                System.out.println("2");
            } else if (operation == 3) {
                System.out.println("3");
            } else if (operation == 4) {
                done = true;
                System.out.println("Exited.");
            }
        }

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

    /**
     * This method find the max value in array
     * @return maximum value
     * @author Hayati Kocur
     */
    private static int findMax()
    {
        int max = Integer.MIN_VALUE;
        for(int number : array)
        {
            if(number > max)
            {
                max = number;
            }
        }
        return max;
    }
    /**
     * This method find the max value in array
     * @return minimum value
     * @author Hayati Kocur
     */
    private static int findMin()
    {
        int min = Integer.MAX_VALUE;
        for(int number : array)
        {
            if(number < min)
            {
                min = number;
            }
        }
        return min;

    }
    /**
     * This method find the average of array 
     * and calculate the differences of values with average
     * and show them.
     * @author Hayati Kocur
     */
    private static void averageAndDiffs()
    {

        int summ = 0;
        for(int number : array)
        {
            summ += number;
        }

        double average = (double) summ / array.length;

        System.out.printf("Average of array: %f\n", average);

        System.out.print("Differeces of numbers with average: ");
        for(int number : array)
        {
            System.out.printf("%.1f ", (number - average));

        }

        System.out.println();
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
