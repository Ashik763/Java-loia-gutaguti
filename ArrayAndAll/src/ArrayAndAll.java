import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndAll {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Array of Primitives
        int[] name = new int[5];
        for(int i=0;i<5;i++){
            name[i]= input.nextInt();
        }
        for (int val:name) {
            System.out.print(val + " ");

        }
//        System.out.println(Arrays.toString(name));
//        String[]


    }

}
