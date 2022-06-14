public class SummativeSums
{
    public static void main(String[] args)
    {
        // Initialize arrays
        int[] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] arr2 = { 999, -60, -77, 14, 160, 301 };
        int[] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                       140, 150, 160, 170, 180, 190, 200, -99 };

        // Call method and display the results
        System.out.println("#1 Array Sum: " + getSum(arr1));
        System.out.println("#2 Array Sum: " + getSum(arr2));
        System.out.println("#3 Array Sum: " + getSum(arr3));
    }

    /**
     * Method which sums up the elements in an int array
     * @param array - int array
     * @return sum of array
     */
    public static int getSum(int[] array)
    {
        int sum = 0;

        // Loop through the array and add each number to the running sum
        for(int i: array)
        {
            sum += i;
        }

        return sum;
    }
}
