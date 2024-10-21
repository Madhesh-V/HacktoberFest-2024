import java.util.Scanner;

public class SelectionSort 
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

        for (int i = 0; i < n - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (a[j] < a[minIndex]) 
                {
                    minIndex = j;
                }
            }

            if (minIndex != i) 
            {
                int temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a[i] + " ");
        }
    }
}
