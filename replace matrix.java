import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int a[][]= {{1,5,3},{4,5,6},{7,5,9}};
		int n=a.length;
		int temp=1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(	a[i][j]==5) {
				 a[i][j]=7;
				}
			
			}
		}

       for(int c[]:a)
		System.out.print(Arrays.toString(c));
		}
		

	}
