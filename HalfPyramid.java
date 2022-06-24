
                                                   //Half Pyramid Patter with numbers........
                                                    //By Naimur Rahman
package Pattern;

import java.util.Scanner;

public class HalfPyramid {

    public static void main(String[] args) { //main class
        Scanner scan=new Scanner(System.in);
        int n,number=1;
        int i,j;
        System.out.print("Enter number of row : ");
        n= scan.nextInt();
        for (i=1;i<=n;i++){ //outer loop
            for (j=1;j<=i;j++){ //inner loop
                System.out.print(number+" ");
                number++;
            }
            System.out.println();//new line for new row
        }
    }
}
