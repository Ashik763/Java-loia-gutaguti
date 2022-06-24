import java.util.Scanner;

public class Calculator2 
{   
        public static int  result ( int a, int b , int c )
        {
                if (c==1)  return a + b; 
                else if ( c== 2 ) return a - b; 
                else if ( c == 3 ) return a * b; 
                else if (c==4) return  a / b;
                else if (c==5) return a % b; 
                
                return 0; 
        }
        public static void main(String arg[])
        {
                  System.out.print("Enter Two Numbers: \n");
                  
                  Scanner sc = new Scanner(System.in);
                  
                  int x, y; x =sc. nextInt(); y = sc.nextInt();
                  
                  System.out.print("Choose what types of Operation do you want:\n1.Addition\n2.Subtraction\n3.Multiplication\n 4.Division\n5.Mode\n");
                  int z = sc.nextInt();
                  int r = result (x,y,z); 
                  System.out.println(r); 
                
        }  
}