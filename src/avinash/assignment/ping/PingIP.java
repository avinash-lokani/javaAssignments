package avinash.assignment.ping;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class PingIP {

    public static double[] times;

    public static void runSystemCommand(String command,int n) {

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            int i = 0;
            // reading output stream of the command
            times = new double[n];
            while ((s = inputStream.readLine()) != null) {
                s = s.strip();
                if(s.contains("time=")) {
                    int l = s.lastIndexOf("time=");
                    int l2 = s.indexOf("ms");
                    times[i++] = Double.parseDouble(s.substring(l+5,l2-1));
                    System.out.println(s);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        int num = sc.nextInt();
        runSystemCommand("ping -c "+num+" "+ip,num);
        System.out.println(getMedian(times,times.length));

    }

    private static double getMedian(double[] times,int n) {
        Arrays.sort(times);
        if(n%2 != 0)
            return times[n/2 - 1];
        else{
            int k = n/2;
            return (times[k] + times[k+1])/2;
        }
    }
}