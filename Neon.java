
import java.util.*;
public class Neon 
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
            int n=sc.nextInt(); 
	    int square=n*n;
	    int sum=0;
	    while (square>0){
	        int rem=square%10;
	        sum+=rem;
	        square/=10;
	    }
	    if(sum==n){
	        System.out.println("Neon Number");
	}
	else{
	    System.out.println("not a Neon Number");
	}
	    
	    
	}
}