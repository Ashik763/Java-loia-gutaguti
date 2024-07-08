import java.util.Scanner;
import java.lang.Math;
public class Two 
{
    public static void main(String[] args) 
    {
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
         a= s.nextInt();
	   b = s.nextInt();
	  
		
	   for(int i=a;i<= b;i++){
		    boolean prime = true;
		for(int j = 2;j<=Math.sqrt(i);j++){
			if(i%j==0 && i!=j){
				prime =false;
				break;
 				
			}
		}
		if(prime==true) System.out.println ("  "+i); 
		
		
	   }
       
              
    }
}