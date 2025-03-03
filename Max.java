public class Max{
    public static void main(String[] args) {
        int a[]={34,67,6,17,56};
        int max=0;
         for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[1];
            }
            
         }
         System.out.print(max);
        }
    }