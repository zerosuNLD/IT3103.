import java.util.Scanner;
import java.util.Arrays;
class array {
    public static void printArray(double[] arr, int size)
    {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            
           System.out.print(arr[i] + " "); 
        }
        System.out.print("]");
    }

    public static double sum(double[] arr,int n)
    {
        double sum = 0;
        for (int i = 0; i < n; i++) {
           sum += arr[i];
        }
        System.out.println("\nSum of Array: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap size: ");
        size = scanner.nextInt();
        double[] arr = new double[size];

        for (int i = 0; i < size; i++) {
           arr[i] = scanner.nextDouble();
        }
        scanner.close();
        printArray(arr, size);


        //sort
        Arrays.sort(arr);;
        System.out.println("\n Sorted Array ");
        printArray(arr, size);
        
        //sum
        double sum = sum(arr, size);

        // Calculate the average
        double average = sum / size;
        System.out.println("Average of Array Elements: " + average);

        System.exit(0);
    }
}