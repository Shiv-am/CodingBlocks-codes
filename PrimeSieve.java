import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n+1];
       for(int i=0;i<=n;i++)
       {
           arr[i]=1;
       }
       arr[0]=0;
       arr[1]=0;
       for(int i=2;i<=(Math.sqrt(n));i++)
       {
           if(arr[i]==1)
           {
               for(int j=2;i*j<=n;j++)
               {
                   arr[i*j]=0;
               }
           }
       }
       for(int i=2;i<=n;i++)
       {
           if(arr[i]==1)
           {
               System.out.print(i+" ");
           }
       }
   }
	
}
