// You are using Java
import java.util.*;
class sample
{
    public static void insert(int[] arr,int idx,int s,int k,List<Integer> list,int n)
    {
        if(idx==n)
        {
            if(s==k)
            {
                for(int y:list)
                {
                    System.out.print(y+" ");
                }
                System.out.println();
            }
            return;
        }
        list.add(arr[idx]);
        insert(arr,idx+1,s+arr[idx],k,list,n);
        list.remove(Integer.valueOf(arr[idx]));
        insert(arr,idx+1,s,k,list,n);
    }
    public static void main(String[] args)
    {
        Scanner vis=new Scanner(System.in);
        int n=vis.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=vis.nextInt();
        }
        int k=vis.nextInt();
        List<Integer> list=new ArrayList<>();
        insert(arr,0,0,k,list,n);
    }
}
