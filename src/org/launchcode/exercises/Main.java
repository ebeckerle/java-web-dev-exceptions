package org.launchcode.exercises;

import org.launchcode.Temperature.TemperatureException;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
//        Divide(4, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        CheckFileExtension(studentFiles.get("Carl"));
        CheckFileExtension(studentFiles.get("Brad"));
    }

    public static int Divide(int x, int y)
    {
        // Write code here!
        if (y == 0){
            try {
                throw new ArithmeticException("You cannot divide by zero!");
            } catch (ArithmeticException e){
                e.printStackTrace();
            }
        }
        return x/y;
    }

    public static int CheckFileExtension(String fileName) {
        int grade = 0;
        if (fileName == null || fileName.equals("")){
            try {
                throw new FileMissingException("No file submitted");
            }catch (FileMissingException e){
                e.printStackTrace();
            }
        } else if (fileName.contains(".java")){
            grade = 1;
        } else {
            grade = -1;
        }
        return grade;
    }

}
