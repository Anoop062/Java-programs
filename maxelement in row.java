
public class Main
{
	public static void main(String[] args) {
	    int a[][]={{12,24,3},{5,6,9},{39,76,98}};
	    int n=a.length;
	    int n1=a[0].length;
	    for(int i=0;i<n;i++){
	        int max=a[i][0];
	        for(int j=0;j<n1;j++){
	            if(max<a[i][j]){      or|  max=Math.max(max,a[i][j];
	                max=a[i][j];        |
	            }
	            	
	        }
	        System.out.println(max);
	        
	    }
	
	}
}