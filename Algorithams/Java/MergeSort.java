import java.util.Scanner;

public class MergeSort 
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

        mergeSort(a, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a[i] + " ");
        }
    }

    public static void mergeSort(int[] a, int left, int right) 
    {
        if (left < right) 
        {
            int mid = (left + right) / 2;

            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);

            merge(a, left, mid, right);
        }
    }

    public static void merge(int[] a, int left, int mid, int right) 
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) 
        {
            L[i] = a[left + i];
        }
        for (int j = 0; j < n2; j++) 
        {
            R[j] = a[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) 
        {
            if (L[i] <= R[j]) 
            {
                a[k] = L[i];
                i++;
            } 
            else 
            {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) 
        {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) 
        {
            a[k] = R[j];
            j++;
            k++;
        }
    }
}
