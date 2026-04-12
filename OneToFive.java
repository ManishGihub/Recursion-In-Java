package Recursion;

public class OneToFive {
    public static void otf(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        otf(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        otf(n);
    }
}
// 1
// 2
// 3
// 4
// 5