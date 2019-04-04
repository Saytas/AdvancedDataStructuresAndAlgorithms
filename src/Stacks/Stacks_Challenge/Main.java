package Stacks.Stacks_Challenge;

import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        // Should return true
        System.out.println(checkForPalindrome("abccba"));

        // Should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));

        // Should return true
        System.out.println(checkForPalindrome("I did, did I?"));

        // Should return false
        System.out.println(checkForPalindrome("hello"));

        // Should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string)
    {
        // A Stack is ideal for checking for palindromes because
        // what we basically want to do is reverse the String and then
        // compare it against the original String then if they are equal
        // then it is a palindrome
        // So the stack is ideal for reversing the String because what we do
        // is we push each character in turn and then because when we pop, it is
        // last in, first out; we can pop the characters out and either compare
        // them against the original String one by one, or what we can do is to pop
        // the characters out and append them to a StringBuilder and then we can
        // just compare the two Strings

        LinkedList<Character> stack = new LinkedList<Character>();

        // String that reads from left to right
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());

        String lowerCase = string.toLowerCase();

        for(int i = 0; i < lowerCase.length(); i++)
        {
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z')
            {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        // Create the reverse String
        // String that reads from right to left
        StringBuilder reverseString = new StringBuilder(stack.size());
        while(!stack.isEmpty())
        {
            reverseString.append(stack.pop());
        }

        // Compare reverseString against the stringNoPunctuation
        // If they are equal, it is a palindrome

        return reverseString.toString().equals(stringNoPunctuation.toString());
    }
}
