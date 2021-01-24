package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(468));
    }
    public static boolean hasSameLastDigit(int first, int second, int third){
        if (first < 10 || first > 1000 || second < 10 || second > 1000 ||third < 10 || third > 1000){
            return false;
        }
        int lastDigitOne = first % 10;
        int lastDigitTwo = second % 10;
        int lastDigitThree = third % 10;

        if ((lastDigitOne == lastDigitTwo) || (lastDigitOne == lastDigitThree) || (lastDigitTwo == lastDigitThree)){
            return true;
        }
        return false;

    }
    public static boolean isValid(int number){
        if (number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
