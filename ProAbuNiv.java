import java.util.*;
public class ProAbuNiv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((pronic(n)) && (Abundant(n))&& (Niven(n))){
            System.out.print("Three are true");
        }
        else if((Abundant(n))&&(pronic(n))){
            System.out.print("Abundant and pronic");
        }
        else if( (Abundant(n))&& (Niven(n))){
            System.out.print(" Abundant and Niven");

        }
        else if((Niven(n))&&(pronic(n))){
            System.out.print("Niven and Pronic");
        }
        else if((pronic(n)) ){
            System.out.print(" Pronic");
        }
        else if((Abundant(n))){
            System.out.print("Abundant ");
        }
        else if(Niven(n)){
            System.out.print("Niven");
        }
        else{
            System.out.print("All are false");
        }
sc.close();
}
static boolean pronic(int n){
    boolean var=false;
    for(int i=1;i<n;i++){
        if(i*(i+1)==n){
            return true;
        }
    }
    return var;
}
static boolean Abundant(int n){
   int sum=0;
for(int i=1;i<n;i++){
    if(n%i==0)
     sum+=i;
}
 if(sum>n){
    return true;
 }
 return false;

}
static boolean Niven(int n){
  int num=n;
  int count=0,sum=0;
  while(num!=0){
     num/=10;
     count++;
}
num=n;
  for(int i=0;i<count;i++){
    int rem=num%10;
    sum+=rem;
    num/=10;

  }
  if(n%sum==0){
    return true;
 }
 return false;


}
}


