package Recursion;

public class FiveToOne {
    public static void fto(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fto(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        fto(n);
    }
}
// 5
// 4
// 3
// 2
// 1