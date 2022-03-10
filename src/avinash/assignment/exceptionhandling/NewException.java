package avinash.assignment.exceptionhandling;

import java.util.Scanner;

public class NewException extends Exception{

    NewException(String msg){
        super(msg);
    }

    public static void main(String[] args){
        newException();
    }

    private  static void newException() {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter number > 0");
            int n = sc.nextInt();
            if(n < 0){
                NewException newException = new NewException("The given input number must be greater than 0");
                throw newException;
            }
            String[] names = new String[n];
            String temp = null;
            for(int i = 0;i<n;i++){
                temp = sc.next();
                if(contains(temp,names,i)){
                    NewException newException = new NewException("The given input String is already present");
                    throw newException;
                }
                names[i] = temp;
            }
            int l = temp.length();

        }
         catch (NewException e) {
             System.out.println(e);
        }
        finally{
            System.out.println("finally gets executed");
        }
    }

    private static boolean contains(String temp, String[] names, int i) {
        for(int k = 0;k<i;k++){
            if(names[k].equalsIgnoreCase(temp))
                return true;
        }
        return false;
    }

}
