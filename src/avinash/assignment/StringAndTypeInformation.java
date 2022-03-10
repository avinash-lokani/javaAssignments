package avinash.assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAndTypeInformation {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("[A-Z].*\\.$");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());
    }
}
