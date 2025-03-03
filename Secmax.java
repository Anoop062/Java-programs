public class Secmax{
    public static void main(String[] args) {
        int a[]={34,6,9,17,5};
        int max=0;
        int smax=0;
         for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            
         }
         System.out.println(max);
      for(int i=0;i<a.length;i++){
        if(a[i]>smax && a[i]!=max){
            smax=a[i];
        }
      }
      System.out.print(smax);

        }
    }