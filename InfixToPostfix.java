import java.util.*;
public class InfixToPostfix {
    public static int precedence(char ch) {
        if(ch == '^'){
            return 3;
        }
        else if(ch == '*' || ch == '/'){
            return 2;
        }
        else if(ch == '+' || ch == '-'){
            return 1;
        }
        else
         return 0;
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Infix Expression :- ");
            String s = sc.nextLine();
            char[] stack = new char[50];
            int i = -1 , j = 0;
            while(j<s.length()){
                char temp = s.charAt(j);
                if(temp == '('){
                    stack[++i] = temp;
                }
                else if(temp == ')'){
                    while(i>-1&&stack[i] != '('){
                        System.out.print(stack[i]);
                        i--;
                    }
                    i--;
                }
                else if(precedence(temp)==0){
                    System.out.print(temp);
                }
                else if(i>-1&&precedence(temp)>=precedence(stack[i])){
                    stack[++i] = temp;
                }
                else{
                    while(i>-1&&precedence(temp)<precedence(stack[i])){
                        System.out.print(stack[i]);
                        i--;
                    }
                    i++;
                    stack[i] = temp;
                }
                
                j++;

            }
        }
        
        

    }
}
