public class PackagesAndAll {
    public static void main(String[] args) {
        A greeting =  new A("good night");
        System.out.println(greeting.b);
    }

    public static void message(){
        System.out.println("packages and all er moddhe achi");


    }
}


class A{
//    String b = "hello there";
    String b;
    A(String gm){
        this.b =  gm;


    }
}
