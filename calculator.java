import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 0;
        int ans = 0;
        while(b>=0){
            System.out.print("Enter:");
            String str = sc.next();
            String s = "stop";
            if(str.compareTo(s)==0){
                b=-1;
                System.out.println("---------Thank You!!---------");
                break;
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            int a1=0;
            int a2=0;
            char ch = ' ';
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c=='+'||c=='-'||c=='*'||c=='/'||c=='%'){
                    String c1 = str.substring(0, i);
                    String c2 = str.substring(i+1);
                    ch = str.charAt(i);
                    a2 = Integer.valueOf(c2);
                    a1 = Integer.valueOf(c1);
                }
            }
            System.out.println("Entry: "+str);
            if(ch=='+'){
                ans = a1+a2;
                System.out.println("Answer: "+ans);
            }
            if(ch=='-'){
                ans = a1-a2;
                System.out.println("Answer: "+ans);
            }
            if(ch=='*'){
                ans = a1*a2;
                System.out.println("Answer: "+ans);
            }
            if(ch=='/'){
                double an = (double) a1/a2;
                System.out.println("Answer: "+an);
            }
            if(ch=='%'){
                ans = a1%a2;
                System.out.println("Answer: "+ans);
            }
            
            System.out.println("-----------------");
        }
    }
}
