import java.util.*;
public class revprime {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        if(n%2!=0 || n==2){
            while(n!=0){
                int rem=0;
                int rev=0;
                rem=n%10;
                rev=rev*10+rem;
                n/=10;
                if(rev%2!=0 || rev==2){
                    System.out.print("twisted prime");
                }
                else{
                    System.out.print("not twisted prime");
                }    
            break;
        }
    }
        else{
            System.out.print("not prime");
        }
        
            
            
        }
    }


             