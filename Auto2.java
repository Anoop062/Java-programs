import java.util.Scanner;
public class Auto2  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    

    for(int i=0;i<n;i++){
      if(auto(i)){
        System.out.println(i);
      }
    }
  }
        static boolean auto(int i){
        int digits=i;
        int rem=0;
        int square=i*i;
        int count=0;
        int sum=0;
        while(digits!=0){
        
            digits/=10;
            count++;
        }
      for(int j=0;j<count;j++){
        rem=square%10;
        sum=sum*10+rem;
        square/=10;
      }
      int rev=0;
      while(sum>0)
      {
        rem=sum%10;
        rev=rev*10+rem;
        sum/=10;
              }
      if(rev==i){
       return true;
      }
      else{
        return false;
      
    }

    }

}


