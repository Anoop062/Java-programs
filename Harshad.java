
public class Harshad
{
	public static void main(String[] args) { 
		Harshad obj=new Harshad();
        for(int n=500;n<=2500;n++){
           if(obj.harsh(n)){
			System.out.print(n+" ");
		   }
			}
		}
   boolean harsh(int n){
	    int sum=0;
	    int num=n;
	    while(num!=0){
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

	    
	
