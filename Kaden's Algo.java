import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
	int curmax=arr[0];
	int globmax=arr[0];
	for(int i=0;i<n;i++)
	{
	    curmax=Math.max(arr[i],curmax+arr[i]);
	    if(curmax>globmax)
	    {
	        globmax=curmax;
	    }
	}
	System.out.print(globmax);
	}
}
