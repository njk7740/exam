import java.util.Scanner;

public class Exam2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("높이를 입력해주세요 : ");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for(int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // 높이를 입력해주세요 : 3

        // 출력

        /*

           *

          ***

         *****

         */

        // 높이를 입력해주세요 : 5

        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         */

        // 높이를 입력해주세요 : 7

        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         ***********

         *************

         */

    }

}