package practice.chap01;

public class Q1 {
    static int max4(int a, int b, int c, int d){
        int max = a;
        if(b>max) max = b;
        if(c>max) max = c;
        if(d>max) max = d;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max(1,2,3,4) = "+max4(1,2,3,4));
        System.out.println("max(1,2,4,3) = "+max4(1,2,4,3));
        System.out.println("max(1,3,2,4) = "+max4(1,3,2,4));
        System.out.println("max(4,2,1,4) = "+max4(4,2,1,4));
        System.out.println("max(3,1,4,2) = "+max4(3,1,4,2));



    }
}
