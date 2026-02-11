import java.util.Scanner;
public class lab_06_04{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the fan statement:");
        String s1=sc.nextLine();
        String team_str="";
        int rma_count=0;
        int bar_count=0;
        int close_count=0;
        int dest_count=0;
        for(int i=0;i<=s1.length()-1;i++){
            char ch=s1.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
                team_str+=ch;
            }
            else if(ch==' '){
                if(team_str.equals("MADRID")|| team_str.equals("Madrid")||team_str.equals("madrid")){
                    rma_count++;
                }
                else if(team_str.equals("Barcelona")||team_str.equals("barcelona")){
                    mci_count++;
                }
                if(team_str.equals("Close")|| team_str.equals("close")){
                    close_count++;
                }
                else if(team_str.equals("Destroy")|| team_str.equals("destroy")){
                    dest_count++;
                }
                team_str="";
            }
                   }
                if(team_str.equals("MADRID")|| team_str.equals("Madrid")){
                    rma_count++;
                }
                else if(team_str.equals("Barcelona")||team_str.equals("barcelona")){
                    mci_count++;
                }
                if(team_str.equals("Close")|| team_str.equals("close")){
                    close_count++;
                }
                else if(team_str.equals("Destroy")|| team_str.equals("destroy")){
                    dest_count++;
                }
                if(rma_count>mci_count){
                    System.out.println("Madrid Supporter");
                }
                else if(mci_count>rma_count){
                    System.out.println("Catalonia Supporter");
                }
                else{
                    System.out.println("Neutral");
                }
                if(dest_count>close_count){
                    System.out.println("Fan expects a dominating victory");
                }
                else if(close_count>dest_count){
                    System.out.println("Fan expects a close match");
                }
                else{
                    System.out.println("Hard to read the fan sentiment");
                }
    }
}
