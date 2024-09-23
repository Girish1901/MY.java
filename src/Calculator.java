import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            while(true){
                System.out.println("Enter the operator:");
                char op = in.next().trim().charAt(0);
                int ans=0;
                if(op=='+'||op=='-'||op=='/'||op=='*'||op=='%'){
                    System.out.print("Enter two numbers:");
                    int n1=in.nextInt();
                    int n2=in.nextInt();
                    if(op=='+'){
                        ans=n1+n2;
                    }if(op=='-'){
                        ans=n1-n2;
                    }if(op=='*'){
                        ans=n1*n2;
                    }if(op=='/'){
                        ans=n1/n2;
                    }if(op=='%'){
                        ans=n1%n2;
                    }else if(op=='X'||op=='x'){
                        break;
                    }else{
                        System.out.println("Invalid operator");
                    }
                }
                System.out.println(ans);
            }
        }
    }
