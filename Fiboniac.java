public class Fiboniac {
    public static void main(String[] args) {
        int n=4,n1=0,n2=1;
        for(int i=1;i<n;i++){
            System.out.print(n1+""+n2);
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        System.out.print(n3+"");
        
        
    } 
    
}
}
