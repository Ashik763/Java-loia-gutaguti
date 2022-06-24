import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args) {
//        int[3][] twoD = new int[3][3]; //putting number of columns is not mandatory
            int twoD[][] = {
            {1,2},
            {4,5,6},
            {7,8,9,10}

        };
        for(int row = 0;row<3;row++)
        {
            for(int col = 0;col < twoD[row].length;col++)
            {
                System.out.print(twoD[row][col] + " ");
            }
            System.out.println();
        }


    }
}
