public class Main
{
	public static void main(String[] args) {
	    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	    int n=a.length;
	    int temp=0,add=0;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(i==j){
	                temp+=a[i][j];
	            }
	            if(i+j==n-1){
	                add+=a[i][j];
	            }
	        }
	     
	    }
	    System.out.print(temp+"\t"+add);
	   
	}
}