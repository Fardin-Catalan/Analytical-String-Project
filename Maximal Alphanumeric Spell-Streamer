import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String max_spell="";
        String term_spell="stop";
        String new_string="";
        while(true){
            System.out.print("Enter the spell:");
            String str=sc.nextLine();
            new_string="";
        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                new_string+=ch;
            }
            else {
                continue;
            }
        }
        if(new_string.length()>max_spell.length())
        {
            max_spell="";
            max_spell+=new_string;
        }
            if(str.equals(term_spell)){
                break;
        }
        }
        String max_cap_spell="";
        for(int j=0;j<=max_spell.length()-1;j++){
            char ch1=max_spell.charAt(j);
            if(ch1>='a' && ch1<='z'){
                max_cap_spell+=(char)((int)(ch1-32));
            }
            else if(ch1>='A' && ch1<='Z'){
                max_cap_spell+=ch1;
            }
        }
        int sum=0;
        for(int i=0;i<=max_cap_spell.length()-1;i++){
            char ch=max_cap_spell.charAt(i);
            int value=(int)ch;
            sum+=value;
        }
        System.out.println("Largest spell:"+max_cap_spell);
        System.out.println("Power Level:"+sum);
    }
}        
