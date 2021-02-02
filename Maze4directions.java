import java.util.*;
public class printall {
   public static void printpath(int cr,int cc,String path,int n,boolean vis[][])
   {
       if(cr>=n || cc>=n || cr<0 || cc<0 || vis[cr][cc]==true) //illegal base case //agar bahar gaya maze se
       {
           return;
       }
       if(cr==n-1 && cc==n-1) //positive base case
       {
           System.out.println(path);
           return;
       }
         vis[cr][cc]=true;
       //Recursive calls
       printpath(cr-1,cc,path + 'U', n,vis);  //up
       printpath(cr+1,cc,path + 'D',n,vis);  //down
       printpath(cr,cc-1,path + 'L',n,vis);  //left
       printpath(cr,cc+1,path + 'R',n,vis); //right
       vis[cr][cc]=false;  //backtracking step
   }
   public static void main(String[] args)
   {
       boolean vis[][]=new boolean[3][3];
       printpath(0,0,"",3,vis);  //cr,cc,String(path),n*n matrix
       
   }

}