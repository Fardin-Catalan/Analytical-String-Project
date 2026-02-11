import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s1=sc.nextLine();
        String new_str="";
        for(int i=0;i<=s1.length()-1;i++){
            char ch=s1.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
                new_str+=ch;
            }
            else if(ch==' '){
                new_str="";
            }
        }
        int len=new_str.length();
        System.out.println(len);
    }
}
