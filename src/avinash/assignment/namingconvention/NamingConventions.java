package avinash.assignment.namingconvention;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NamingConventions {

    public static int date,month,Year;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<n;i++){
            String s = sc.nextLine();
            int div = s.indexOf(' ');

            String signup = s.substring(0,div);
            String current = s.substring(div+1);



            setDate(signup);
            LocalDate signedup = LocalDate.of(Year,month,date);
            int sMonth = signedup.getMonthValue();
            int sYear = signedup.getYear();

            LocalDate lower = signedup.minusDays(30);
            int lodate = lower.getDayOfMonth();
            int lomonth = lower.getMonthValue();



            LocalDate upper = signedup.plusDays(30);
            int update = upper.getDayOfMonth();
            int upmonth = upper.getMonthValue();
            int upyear = upper.getYear();

            setDate(current);
            LocalDate currentdate = LocalDate.of(Year,month,date);
            int cdate = currentdate.getDayOfMonth();
            int cmonth = currentdate.getMonthValue();
            int cyear = currentdate.getYear();

            if(cmonth < sMonth && cyear == sYear){
                System.out.println("No range");
            }
            else if(cmonth == upmonth && cdate <= update || (cmonth == lomonth) && (cdate >= lodate) || (cmonth == sMonth)){
                format(lodate,lomonth,cyear,cdate,cmonth,cyear);
            }
            else{
                format(lodate,lomonth,cyear,update+1,upmonth,upyear);
            }
        }
    }

    public static void setDate(String Date){
        int x = Date.indexOf('-');
        int k = Date.indexOf('-',x+1);
        date = Integer.parseInt(Date.substring(0,x));
        month = Integer.parseInt(Date.substring(x+1,k));
        Year = Integer.parseInt(Date.substring(k+1));

    }

    public static void format(int date,int month,int year,int date1,int month1,int year1){
        String formatt = "dd-MM-yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatt);
        System.out.println(formatter.format(LocalDate.of(year, month, date)) + " " + formatter.format(LocalDate.of(year1, month1, date1)));
    }
}

