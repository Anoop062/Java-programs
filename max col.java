import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int a[][]= {{1,5,3,5},{4,5,6,7},{7,5,4,9},{2,9,1,6}};
		int n=a.length;
	
		for(int i=0; i<n; i++) {
		    int max=0;
			for(int j=0; j<n; j++) {
			if(a[j][i]>max){
			    max=a[j][i];
			    
			}

			}
				System.out.println(max);
		}

	}


}
