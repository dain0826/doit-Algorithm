package practice.chap01;

public class Q3 {
    static int min4(int a, int b, int c, int d){
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;

        return min;
    }

    public static void main(String[] args) {
        System.out.println("min(1,2,3,4) = " + min4(1,2,3,4));
        System.out.println("min(2,3,1,4) = " + min4(2,3,1,4));
        System.out.println("min(3,4,2,1) = " + min4(3,4,2,1));
        System.out.println("min(1,4,2,3) = " + min4(1,4,2,3));
        System.out.println("min(2,1,4,3) = " + min4(2,1,4,3));
        System.out.println("min(3,2,4,1) = " + min4(3,2,4,1));

    }
}
