import java.util.Arrays;
public class transpose
{
	public static void main(String[] args) {
		int a[][]= {{1,5,3},{4,5,6},{7,5,9}};
		int n=a.length;
	    int c[][]=new int[3][3];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				c[i][j]=a[j][i];
			
			}
		}

       for(int t[]:c)
		System.out.print(Arrays.toString(t));
		}
		

	}
