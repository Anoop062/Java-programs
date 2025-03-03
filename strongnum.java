import java.util.Scanner;
public class strongnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
    
        for(int n=1;n<=x;n++){
            if(fact(n)){
                System.out.print(n+" ");
            }

        }
          
    }
    static boolean fact(int n){
        int N=n;
        int sum=0;
        while(N!=0){
            int rem=0;
            rem=N%10;
            N/=10;
           sum+=fact1(rem);
        }
        if(sum==n){
       return true;
        }
        else
        return false;  
        
    }
    
 
    static int fact1(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    
    }
}


