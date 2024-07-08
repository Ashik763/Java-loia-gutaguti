package ashik;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        Fish d = new Fish();
        System.out.println("Enter the Fish name :");
        String f = sc.nextLine();
        d.setName(f);
        System.out.println("This fish's name is "+d.getName());
        d.eat();
        d.walk();
        //object initialization &calling methodof cat
        Cat c = new Cat();
        System.out.println("Enter the Cat name :");
        String ca = sc.nextLine();
        c.setName(ca);
        System.out.println("This cat's name is"+c.getName());
        c.eat();
        c.walk(4);
        //object initialization &calling method of Animal as animal1
        Animal a = new Fish();
        System.out.println("Enter the Fish name :");
        String  a1 = sc.nextLine();
        ((Fish)a).setName(a1);
    }
}