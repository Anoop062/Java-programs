public class Strpalindrome{
    public static void main(String []args){
        String a="madam";
        reverse(a);
        StrBuilder(a);
        StrBuffer(a);
        }
    static void reverse(String a){
        int n=a.length();
        String s= new String();
        for(int i=n-1;i>=0;i--){
            s+=a.charAt(i);

        }
        
        if(s.equals(a)){
            System.out.println("palindrome");
        }
        else{
        System.out.println("Not a palindrome");
        }
    }
    static void StrBuilder(String a){
        String rev=new StringBuilder(a).reverse().toString();
        if(rev.equals(a)){
            System.out.println("palindrome");
        }
        else{
        System.out.println("Not a palindrome");
        }
    }
    static void StrBuffer(String a){
        String rev=new StringBuffer(a).reverse().toString();
        if(rev.equals(a)){
            System.out.println("palindrome");
        }
        else{
        System.out.println("Not a palindrome");
        }
    }
}


    
