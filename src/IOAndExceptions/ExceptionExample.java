package IOAndExceptions;
/*
Create a class that performs various operations that can cause some checked exception like File, illegal argument etc.
and handle all the checked exception. Use finally block

Create class that generates some of runtime exceptions and then solve those errors so you never get those
runtime exceptions like arithmetic exception, null pointer exception etc. Use finally block

Create a program to read at least 10 people with their name , address and income and calculate tax for each
person and output the name, address, income and calculate tax in another file.
Do this with at least 6 classes, FileInputStream/FileOutputStream, FileReader/FileWriter,
BufferedReader/BufferedWriter
 */

import java.io.*;

import IRSTax.TaxCalculator;

import static IRSTax.TaxCalculator.calculateTax;

public class ExceptionExample {
    public static void main(String[] args) throws Exception{
        String k = null;
        try {
            nullPointerException(k.charAt(1));
            arithmeticException(10, 0);
        }catch(Exception e){
            System.out.println("Exception"+ e +"has occurred");
        }finally{
            System.out.println("Now the exception is perfectly handled");
        }

        TaxCalculator tc = new TaxCalculator();
        FileReader fr = null;
        try {
            fr = new FileReader("/Users/rashmisankepally/Desktop/career_planning/career_prep/JavaExamples/src/IOAndExceptions/people.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        FileWriter fw  = new FileWriter("/Users/rashmisankepally/Desktop/career_planning/career_prep/JavaExamples/src/IOAndExceptions/peopleTax.txt");

        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("File contains calculated tax of people"+"\n");

        try {
            String read_line = br.readLine();
            String[] line = read_line.split(",");
            double tax =  calculateTax(Double.parseDouble(line[2]));
            bw.write(line[0]+" "+line[1]+" "+tax+"\n");
            System.out.println(line[0]+" "+line[1]+" "+tax);
            while(read_line!=null) {
                read_line = br.readLine();
                if (read_line==null) {break;}
                line = read_line.split(",");
                tax =  calculateTax(Double.parseDouble(line[2]));
                System.out.println(line[0]+" "+line[1]+" "+tax);
                bw.write(line[0]+" "+line[1]+" "+tax+"\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        bw.close();

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("/Users/rashmisankepally/Desktop/career_planning/career_prep/JavaExamples/src/IOAndExceptions/people.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(fis.read());
    }

    private static int arithmeticException(int i, int j){
        return i/j;
    }

    private static void nullPointerException(char k){
        System.out.println(k);
    }



}
