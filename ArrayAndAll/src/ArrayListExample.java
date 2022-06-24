import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
//        Syntax of Dynamic array
        ArrayList<String> list1 = new ArrayList<>(3);
//        or,
//        ArrayList<Integer> list = new ArrayList<>(3);

        list1.add("3");
        list1.add("2");
        list1.add("5");
        System.out.println(list1);
        list1.add("9");
        list1.add("7");
        System.out.println(list1);
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            list.get(i).add(in.nextInt());
            list.get(i).add(in.nextInt());
            list.get(i).add(in.nextInt());
        }
        System.out.println(list);
    }
}
