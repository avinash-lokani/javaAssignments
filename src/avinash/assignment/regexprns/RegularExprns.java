package avinash.assignment.regexprns;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegularExprns {

    static Pattern fileExtnPtrn;
    public static boolean validateFileExtn(String userName){

        Matcher mtch = fileExtnPtrn.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        String home = System.getProperty("user.home");
        System.out.println(home);

        File file = new File(home);
        String[] flist = file.list();

        Scanner sc = new Scanner(System.in);

        String search = sc.nextLine();

         fileExtnPtrn = Pattern.compile("([\\w\\s]+(\\.(?i)(" + search + "))$)");



        for(int i = 0;i<flist.length;i++){
            if(validateFileExtn(flist[i])){
                flist[i] = file.getPath() +"/" + flist[i];
                System.out.println(flist[i]);
            }

        }

    }



}
