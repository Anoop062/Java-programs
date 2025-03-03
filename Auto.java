import java.util.Scanner;
public class Auto  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int square=n*n;
        while(n>0){
            if(n%10!=square%10){
                System.out.print("No");
                return;
            }
            n/=10;
            square/=10;
        }
        System.out.print("yes");
        }
    }