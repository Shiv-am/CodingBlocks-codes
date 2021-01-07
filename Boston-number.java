import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int m=n;
	  int sum=0,a,b;
	  while(n%2==0)
	  {
	      sum=sum+2;
	      n=n/2;
	  }
	  for(int i=3;i<=(Math.sqrt(n));i=i+2)
	  {
	      while(n%i==0)
	      {
	          sum=sum+i;
	          n=n/i;
	      }
	  }
	  if(n>2)
	  {
	      sum=sum+n;
	  }
	  int sum1=0;
	  while(m!=0)
	  {
	      sum1=sum1+m%10;
	      m=m/10;
	  }
	
	  if(sum1==sum)
	  {
	      System.out.print("This is a Boston Number");
	  }
	  else{
	      System.out.print("This is not a Boston Number");
	  }
	}
}
