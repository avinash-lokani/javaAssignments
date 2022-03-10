package com.example.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(Checker(sentence));
    }
    public static boolean Checker(String sentence){
        int length = sentence.length();
        sentence = sentence.toLowerCase();
        if(sentence.length() < 26){
            return false;
        }
        else {

            Pattern fileExtnPtrn = Pattern.compile("[a-zA-Z]");

            // check if string only contains alphabets.. t(n) = O(n)
            for (char c : sentence.toCharArray()) {
                Matcher mtch = fileExtnPtrn.matcher(Character.toString(c));
                if(!mtch.matches()){
                    return false;
                }
            }

            // count the frequencies.. t(n) = O(n)

            Map<Character, Integer> map = new HashMap<>();
            for (char c : sentence.toCharArray()) {
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    map.put(c, map.get(c) + 1);
                }
            }

            if (map.size() == 26) {
                return true;
            }
            return false;
        }
    }
}
