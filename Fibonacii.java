package Recursion;

public class Fibonacii {
    public static void fibona(int a,int b, int n){
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        fibona(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0, b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n = 7;

        fibona(a, b, n-2);
    }
}
// 0 1 1 2 3 5 8 