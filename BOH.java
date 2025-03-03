import java.util.Scanner;

public class BOH {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
    convertB(n);
    convert_O(n);
    convert_H(n);


}
 static void convertB(int n)
{
    int N=n;
    int a[]=new int[10];
    int sum=0;
    int rem=0;
    int i=0;

    while(N!=0){
        a[i]=N%2;
        sum=sum*10+rem;
        N/=2;
        i++;
    }
    System.out.print("Binary:");

        for(int j=i-1;j>=0;j--){
            System.out.print(a[j]);
        }
        System.out.println();
}
static  void convert_O(int n)
{
    int N=n;
    int a[]=new int[10];
    int sum=0;
    int rem=0;
    int i=0;

    while(N!=0){
        a[i]=N%8;
        sum=sum*10+rem;
        N/=8;
        i++;
        
    }
    System.out.print("Octal:");

        for(int j=i-1;j>=0;j--){
            System.out.print(a[j]);
        }
        System.out.println();
}
static  void convert_H(int n)
{
    int N=n;
    int a[]=new int[10];
    int sum=0;
    int rem=0;
    int i=0;

    while(N!=0){
        a[i]=N%16;
        sum=sum*10+rem;
        N/=16;
        i++;
    }
    System.out.print("Hexadecimal:");
        for(int j=i-1;j>=0;j--){
            System.out.print(a[j]);
        }
}
}

