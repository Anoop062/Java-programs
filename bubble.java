import java.util.*;
public class bubble {
    public static void main(String []args){
        int[] a={23,7,43,2,15};
        bubbleSort(a);
        System.out.print(Arrays.toString(a));
    }
    static void bubbleSort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }
        }
    }
    
}
