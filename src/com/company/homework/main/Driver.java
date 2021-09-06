package com.company.homework.main;

public class Driver {

    public static void main(String[] args) {
        isParenthesisMatcHed("");
    }

    public static void isParenthesisMatcHed(String input) {
        int leftParenthesis = 0;
        int rightParenthesis = 0;
        char[] charsArray = input.toCharArray();
        for (int i = 0; i < charsArray.length; i++) {
            if (charsArray[i] == '(')
                leftParenthesis += 1;
            else if (charsArray[i] == ')')
                rightParenthesis += 1;
            else
                continue;
        }

        if (input.startsWith("(")) {
            System.out.println("Left Parenthesis: " + leftParenthesis);
            System.out.println("Right Parenthesis: " + rightParenthesis);
            if (leftParenthesis == rightParenthesis)
                System.out.println("Parantezler eşittir.");
            else if (leftParenthesis > rightParenthesis)
                System.out.println("Parantezler eşleşmemiştir. ( -> daha Fazladır.");
            else if (rightParenthesis > leftParenthesis)
                System.out.println("Parantezler eşleşmemiştir. ) -> daha Fazladır.");
        }
        else if (input.startsWith(")"))
            System.out.println("String ifadesi ) ile başlayamaz");
        else if (input.isEmpty())
            System.out.println("String'e bir değer girilmemiştir.");
    }
}