package Recursion;

public class SumOfN {

    public static void Son(int i,int n,int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        Son(i+1,n,sum);
    }
    public static void main(String[] args) {
        Son(1, 5, 0);
    }
}
