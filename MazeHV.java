import java.util.*;
public class printall {
   public static void printpath(int cr,int cc,String path,int n)
   {
       if(cr>=n || cc>=n) //illegal base case //agar bahar gaya maze se
       {
           return;
       }
       if(cr==n-1 && cc==n-1) //positive base case
       {
           System.out.println(path);
           return;
       }
       //Recursive calls
       printpath(cr,cc+1,path + 'H', n);
       printpath(cr+1,cc,path + 'V',n);
   }
   public static void main(String[] args)
   {
       printpath(0,0,"",3);  //cr,cc,String(path),n*n matrix
   }

}