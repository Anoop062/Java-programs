import java.util.*;
public class rev
{
	public static void main(String[] args) {
		int a[][]= {{9,2,3},{5,6,9},{2,3,4}};
		int b[][]={{2,4},{3,5,},{3,4}};
		int c[][]=new int[3][2];
		int n=a.length;
		int n1=a[0].length;
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<2; j++) {
			 	for(int k=0; k<3; k++) {
			 	    c[i][j]+=a[i][k]*b[k][j];
                    
			}
			
			}	
			}
          for(int r[]:c){
			System.out.print(Arrays.toString(r));
          }

	
}
}