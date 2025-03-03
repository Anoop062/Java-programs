import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        
        int temp=0;
         temp=a;
         a=b;
         b=temp;
         System.out.println(a);
         System.out.println(b);
}
}
