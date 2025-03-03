import java.util.*;
public class Circprime {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
             
              
              if (isprime(n)){
                System.out.println("circular Prime");

              }
              else{
                System.out.println("Not");
              }
      }
      static boolean isprime(int n){
       
        
            int num=n;
            int count=0;
            int sum=1,ss=0;
            while(num>0){
                num/=10;
                count++;
                sum*=10;
            }
            sum/=10;
            num=n;

            for(int i=0;i<count;i++){
            int rem=0;
            rem=num%10;
            num/=10;
            sum=sum*rem+num;
            if(prime(num)){
                ss++;
            }
           
            }
            
            if(ss==count){
                return true;
            }
            else{
                return false;
        }
    }
            
            static boolean prime(int num){
                
             for(int i=2;i<num;i++){
                if(num%i==0){
                    return false;

                }
            }
                    return true;
            
             
             

            }
            
        }


