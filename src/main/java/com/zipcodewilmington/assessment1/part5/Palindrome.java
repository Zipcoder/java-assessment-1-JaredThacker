package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length() - i; j++) {
                StringBuilder sb = new StringBuilder(input.substring(j, j + (i + 1)));
                StringBuilder sbClone = new StringBuilder(sb.toString());
                boolean isPalin = sbClone.reverse().toString().equals(sb.toString());
                count += isPalin ? 1 : 0;
            }
        }
        return count;
    }
}
