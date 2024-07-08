package superpackage;

public class SubClass extends SuperClass{
    String S = "From Sub";

   SubClass(){
       super();
       System.out.println(super.S);
        System.out.println(S+"2");
    }
}
