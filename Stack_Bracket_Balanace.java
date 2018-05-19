
package stack_bracket_balanace;

import java.util.Stack;

/**
 *
 * @author jakaria
 */
public class Stack_Bracket_Balanace {
    
    public static boolean isBalanced(String str)
    {
        Stack <Character> stack = new Stack<>();
        char[] ch = str.toCharArray();
        
        for(char c : ch)
        {
            if(stack.empty())
            {
                stack.push(c);
            }
            else
            {
                char peek = stack.peek();
                if(peek == '(' && c == ')')
                {
                    stack.pop();
                }
                else if(peek == '{' && c == '}')
                {
                    stack.pop();
                }
                else if(peek == '[' && c == ']')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(c);
                }
            }
        }
        
        
        return stack.empty();
        
    }

 
    public static void main(String[] args) {
        
        
        String[] brackets = {
            "(()){}()","({})","({}(","){})"
        };
        
        for(String str : brackets)
        {
            String isbalance = isBalanced(str) ? "balanced" : "Unbalanced";
            
            System.out.println(str +" is " +isbalance);
        }
    //
    }
    
}
