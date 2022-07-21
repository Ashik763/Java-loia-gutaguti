package methodOverloading;

public class Mo {
    // method-overloading by changing the number of parameters
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public  void  add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    //method-overloading by changing the datatype of parameter

    public void subtract(int a,int b){
        System.out.println(a-b);

    }
    public void subtract(int a,int b,int c){
        System.out.println(a-b-c);

    }
}
