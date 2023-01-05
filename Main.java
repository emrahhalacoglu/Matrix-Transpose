import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input Array Height: ");
        int arrayHeight = input.nextInt();
        System.out.print("Input Array Lenght : ");
        int arrayLenght = input.nextInt();

        int[][] list = new int[arrayHeight][arrayLenght];
        int[][] listT = new int[arrayHeight][arrayLenght];
        for (int i = 0; i < arrayHeight; i++)
        {
            for (int j = 0; j < arrayLenght; j++)
            {
                //System.out.println("Input Array Element ["+ i +"]["+ j +"] : ");
                //int arrayElement = input.nextInt();
                int arrayElement = (int)(Math.random()*20);
                list[i][j] = arrayElement;
            }
        }
        System.out.println(Arrays.deepToString(list));

        for (int i = 0; i < arrayHeight; i++)
        {
            for (int j = 0; j < arrayLenght; j++)
            {
                listT[i][j] = list[j][i];
            }
        }
        System.out.println(Arrays.deepToString(listT));
    }
}
