import java.util.Random;
import java.util.Scanner;

public class MainApp {

    private static int[] randomArr;

    /**
     * This main method creates a random array
     * and a menu for different array operations
     * @author Mustafa Mert Mumcu
     */
    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);

        boolean done = false;

        while(!done)
        {

            System.out.println("\nMenu:");
            System.out.println("1. Create an array with random integers");
            System.out.println("2. Find minimum and maximum in the array");
            System.out.println("3. Find the average and differences from the average");
            System.out.println("4. Find the sum of elements at odd- and even-numbered indexes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int operation = in.nextInt();

            if(operation == 1) 
            {
                createArray(in);

            } 
            else if(operation == 2) 
            {
                if (isInitialized()) 
                {
                    System.out.println("Maximum value: " + findMax());
                    System.out.println("Minimum value: " + findMin());
                }

            } 
            else if(operation == 3) 
            {
                if (isInitialized()) 
                {
                    averageAndDiffs();
                }

            } 
            else if(operation == 4) 
            {
                if (isInitialized()) 
                {
                    sumOfEvenAndOddIndexesOfArray();
                }

            }
            else if(operation == 5)
            {
                done = true;
                System.out.println("Exited app.");

            }
            else
            {
                System.out.println("Invalid operation. Try again(1-5).");
                
            }
        }

        in.close();
    }

    private static void createArray(Scanner in)
    {
        System.out.print("Enter the array size: ");
        int size = in.nextInt();

        randomArr = new int[size];

        Random random = new Random();

        for(int i = 0; i < size; i++)
        {
            randomArr[i] = random.nextInt(101);
        }

        System.out.print("Created and randomized array: ");
        for(int numm : randomArr)
        {
            System.out.print(numm + " ");
        }
        System.out.println();
    }

    private static boolean isInitialized()
    {
        if(randomArr == null)
        {
            System.out.println("Array didn't created. Create an array before doing an operation.");
            return false;
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
        for(int number : randomArr)
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
        for(int number : randomArr)
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
        for(int number : randomArr)
        {
            summ += number;
        }

        double average = (double) summ / randomArr.length;

        System.out.println("Average of array: " + average);

        System.out.print("Differeces of numbers with average: ");
        for(int number : randomArr)
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
    private static void sumOfEvenAndOddIndexesOfArray() 
    {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 0; i < randomArr.length; i++) 
        {
            if (i % 2 == 0) 
            {
                sumOfEven += randomArr[i];
            } 
            else 
            {
                sumOfOdd += randomArr[i];
            }
        }

        System.out.println("Sum of odd numbers is: " + sumOfOdd);
        System.out.println("Sum of even numbers is: " + sumOfEven);
    }

    
}
