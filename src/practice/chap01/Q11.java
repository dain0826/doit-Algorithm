package practice.chap01;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        do{
            System.out.print("양의 정수 n : ");
            n = stdIn.nextInt();
        }while(n<=0);

        int no= 0;
        while(n>0){
            n /= 10; //n = 10 으로 나눈 몫
            no++;
        }
        System.out.println("그 수는 " + no + "자리입니다.");


    }
}
