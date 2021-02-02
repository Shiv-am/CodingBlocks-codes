import java.util.*;
public class printall {

	public static void printsub(String input,String output)
	{
	    if(input.length()==0)
	    {
	        System.out.println(output);
	        return;
	    }
	    
	    char zeroth=input.charAt(0);
	    String bachihuistring=input.substring(1);
	    
	    printsub(bachihuistring,output + zeroth); //inclusion
	    printsub(bachihuistring,output);          //exclusion
	}
	public static void main(String[] args)
	{
	    printsub("abc","");
	}

}