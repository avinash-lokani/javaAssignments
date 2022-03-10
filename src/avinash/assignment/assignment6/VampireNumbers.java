package avinash.assignment.assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VampireNumbers{
    public static int numDigits(int num){
        return Integer.toString(Math.abs(num)).length();
    }

    private static boolean fangCheck(int num, int fang1, int fang2){
        if(Integer.toString(fang1).endsWith("0") && Integer.toString(fang2).endsWith("0")) return false;

        int len = numDigits(num);
        if(numDigits(fang1) != len / 2 || numDigits(fang2) != len / 2) return false;

        char[] origArr = Integer.toString(num).toCharArray();
        char[] fangArr = (fang1 + Long.toString(fang2)).toCharArray();
        Arrays.sort(origArr);
        Arrays.sort(fangArr);
        return Arrays.equals(origArr, fangArr);
    }

    public static void main(String[] args){
        List<Integer> vampireList = new ArrayList<>();
        int count = 0;
        for(int i = 10; vampireList.size() <= 100; i++ ){
            if((numDigits(i) % 2) != 0) {
                i = i * 10 - 1;
                continue;
            }
            for(int fang1 = 2; fang1 <= Math.sqrt(i) + 1; fang1++){
                if(i % fang1 == 0){
                    int fang2 = i / fang1;
                    if(fangCheck(i, fang1, fang2) && fang1 <= fang2){
                        vampireList.add(i);

                        System.out.println(i + ": " + fang1 + ", " + fang2);
                    }
                }
            }

        }
    }
}
