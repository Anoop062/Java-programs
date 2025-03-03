

public class Main
{
	public static void main(String[] args) {
	    int a[][]={{5,4,3},{3,2,0},{7,12,16}};
	    int n=a.length;
	    int n1=a[0].length;
	    int count=0;
            int j=0;
	    for(int i=0;i<n;i++){
	        for( j=0;j<n1-1;j++){
	            if(a[i][j+1]<=a[i][j]){      |  if(a[i][j+1]>=a[i][j]){ --desc sort
	                break;
	            }
               } 
	            if(j==n1-1){
	            count++;
	        }
	   
	    }
		System.out.println(count);
	}
}