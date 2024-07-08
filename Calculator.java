import java.util.Scanner; 

public class Calculator  
{
        public static void main( String [] args)
        {
               Scanner sc = new Scanner(System.in); 
               
               int a = sc.nextInt(); 
               char c1 = sc.next().charAt(0);
               int b = sc.nextInt(); 
               
               char c2 = sc.next().charAt(0);
               int c = sc. nextInt ();
               
               int  result = 0; 
               
               if (c1 == '+')result =a+b;
               else if (c1=='-')result= a - b; 
               else if ( c1 == '*' )result = a * b; 
               else if ( c1 == '/')result = a / b; 
               
               // for Second Operator 
               
                if (c2 == '+')result+=c;
               else if (c2=='-')result-=c; 
               else if ( c2 == '*' )result*=c; 
               else if ( c2 == '/')result/=c; 
               
               
               System.out.println("Result:" + result); 
               
               
               
               
              
               
               
        }
}