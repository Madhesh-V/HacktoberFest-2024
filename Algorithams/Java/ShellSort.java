import java.util.Scanner;

public class ShellSort 
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

        for (int gap = n / 2; gap > 0; gap /= 2) 
        {
            for (int i = gap; i < n; i++) 
            {
                int temp = a[i];
                int j = i;
                while (j >= gap && a[j - gap] > temp) 
                {
                    a[j] = a[j - gap];
                    j -= gap;
                }
                
                a[j] = temp;
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a[i] + " ");
        }
    }
}
