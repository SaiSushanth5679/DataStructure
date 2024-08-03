import java.util.*;
class Removetheballs {
    public static int  Remove(int n){
        if(n==0)
          return 1;
        else if(n==1)
          return 1;
        else if(n==2)
          return 1;
        else if(n==3)
          return 2;
          
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        for(int i=4;i<=n;i++){
            dp[i] = dp[i-3]+dp[i-1];
        }
        return dp[n];
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Remove(n));
        
    }
}