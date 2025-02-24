import java.util.*;
class main{
    public static int oddNum(int n){
        int product = 1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                product = product*i;
            }
        }
        return product;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = oddNum(n);
        System.out.println(res);
    }
}