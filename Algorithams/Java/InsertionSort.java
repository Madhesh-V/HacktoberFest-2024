import java.util.Scanner;

public class InsertionSort 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of elements: ");
        int n = scanner.nextInt();
        
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter element " + (i + 1) + ":");
            a[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; i++) 
        {
            int temp = a[i];
            int j = i - 1;
            
            while (j >= 0 && a[j] > temp) 
            {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a[i] + " ");
        }
    }
}
