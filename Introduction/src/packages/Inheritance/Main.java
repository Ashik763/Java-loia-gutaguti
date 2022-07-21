package packages.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        Box box = new Box(box1);
//        System.out.println(box.l + " " + box.w + " " + box.h);
        BoxWeight box4 = new BoxWeight();

        BoxWeight box3 = new BoxWeight(8.0,9.0,10.0,3.0);
        System.out.println(box3.weight + " "+ box3.l + " " + box3.h + " "+ box3.w);
    }
}
