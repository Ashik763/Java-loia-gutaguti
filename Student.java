import java.util.Scanner;

public class Student 
{
       private String name, Roll, Dept, session; 
        
        
        public void setname(String n)
        {
              name = n; 
        }
        public void setroll(String n)
        {
              Roll = n; 
        }public void setdept(String n)
        {
               Dept = n; 
        }
        public void setsession(String n)
        {
                session = n; 
        }
        
        
        
        
       
        public String getname()
        {
             return name; 
        }
        
        public String getroll()
        {
             return Roll; 
        }
        
        public String getdept()
        {
             return Dept; 
        }
        public String getsession()
        {
             return session; 
        }
        public static void main( String args[])
        {
          
                Student st = new Student(); 
                

                
                st.setname("Shawmitra Das Dwip"); 
                st.setroll("20CSE033");
                st.setdept("Computer Science & Engineering"); 
                st.setsession("2019-20"); 
                
                System.out.println("Name:"+st.getname()); System.out.println("Roll:"+st.getroll()); 
                System.out.println("Department:"+st.getdept());
                System.out.println("Session:" +st.getsession()); 
                
                
                
        }
}