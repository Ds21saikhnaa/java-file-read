package com.journaldev.readfileslinebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String number = s.nextLine();
        System.out.println(check(number));
    }

    public static String check(String number){
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("num.txt"));
            String line = reader.readLine();

            while (line != null) {
                if(line.equals(number)) return number + " dugaartai mashin zogsoold bn!!!";
                line = reader.readLine();
            }
            reader.close();
            return number + " dugaartai mashin zogsoold baihgui bn!!!";
        } catch (IOException e) {
            e.printStackTrace();
            return "systemiin aldaa"  ;
        }
    }
} 