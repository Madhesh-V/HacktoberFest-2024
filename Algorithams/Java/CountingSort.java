import java.util.Scanner;

public class CountingSort 
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

        int max = a[0];
        for (int i = 1; i < n; i++) 
        {
            if (a[i] > max) 
            {
                max = a[i];
            }
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) 
        {
            count[a[i]]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) 
        {
            while (count[i] > 0) 
            {
                a[index++] = i;
                count[i]--;
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a[i] + " ");
        }
    }
}
