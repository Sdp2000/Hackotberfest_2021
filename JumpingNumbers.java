package com.company;

public class JumpingNumbers {
    public static String jumpingNumber(int number) {

        String given = String.valueOf(number);
        if(given.length() == 1){
            return "Jumping!!";
        }
        boolean flag = false;
        int count = 0;
        for(int i=0; i<given.length()-1; i++){
            if(Math.abs(Character.digit(given.charAt(i),10) - Character.digit(given.charAt(i+1),10)) == 1){
                flag = true;
                if(flag){
                    count++;
                }
                flag = false;
            }
        }
        if(count == given.length() -1){
            return "Jumping!!";
        }
        return "Not!!";
    }
}
