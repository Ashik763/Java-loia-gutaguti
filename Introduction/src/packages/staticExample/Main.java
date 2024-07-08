package packages.staticExample;

public class Main {
    public static void main(String[] args) {
    Human ghosh = new Human(22,"Ashik Ghosh",10000,false);
    Human ashik = new Human(24,"ag",3434343,false);
        System.out.println(ashik.population);
        System.out.println(ghosh.population);
        fun();

    }

    static void fun(){
        System.out.println("Having fun idiot?");
        Main obj = new Main();
        obj.greeting();
    }
    void greeting(){
        System.out.println("Good Afternoon");
    }


}
