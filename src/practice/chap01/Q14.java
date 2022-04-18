package practice.chap01;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        System.out.println("사각형을 출력합니다.");
        Scanner stdIn = new Scanner(System.in);
        int n;
        do {
            System.out.print("단 수 : ");
            n = stdIn.nextInt();
        }while(n<=0);

        for(int i =1; i<=n;i++) {
            for (int j = 1; j <= n; j++)
                System.out.print("*  ");
            System.out.println();
        }
    }
}
