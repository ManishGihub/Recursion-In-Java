package Recursion;

// Q) Print X^n (Stack height = n)
public class XPowNStackHeightn {
    public static int xpowern(int x,int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xpownm1 = xpowern(x, n-1);
        int xpown = x * xpownm1;
        return xpown;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int calc = xpowern(x, n);
        System.out.println(calc);
    }
}
// 32
// Stcak height = n