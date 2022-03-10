//package avinash.assignment.io;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

class Io {
    public static void main(String[] args){

        String home = System.getProperty("user.home");

        try{
            String filename = args[0];
            File file = new File(home + "/" + filename);
            FileReader fileReader = new FileReader(file);
            int r = 0;
            Map<Character,Integer> map = new TreeMap<>();
            while((r = fileReader.read()) != -1){
                if(!map.containsKey((char) r)){
                    map.put((char) r,1);
                }
                else
                    map.put((char) r,map.get((char) r) + 1);
            }
            fileReader.close();
            File newFile = new File(home + "/" + "results.txt");
            FileWriter fileWriter = new FileWriter(newFile);
            for(Map.Entry<Character, Integer> i : map.entrySet()){
                fileWriter.write(i +"\n");
            }
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
