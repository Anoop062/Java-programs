public class Substring {
    public static void main(String[] args){
        String a="ANOOP KILLER";
        Strbuffer(a);
        Strbuilder(a);
        StrObject(a);
    }
    static void Strbuffer(String a){
   StringBuffer str=new StringBuffer(a);
   
   System.out.println("Sub= "+str.substring(0,3));


    }
    static void Strbuilder(String a){
        StringBuilder str=new StringBuilder(a);
        
        System.out.println("Sub= "+str.substring(3,4));
     
     
         }
         static void StrObject(String a){
            String substr=a.substring(4,5);
            System.out.println("Sub= "+substr);
}
}
