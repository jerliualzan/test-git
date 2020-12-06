package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hexa_Binary hb = new Hexa_Binary();
        /*XBM xbm = new XBM();
        for (int i : xbm.file_parts){
            System.out.println(i);
        }*/
        hb.getVal();
        hb.convert();
        int a;
        int upper = 0,lower = 0;
        Scanner str = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String input = str.nextLine();

        int length = input.length();
        System.out.println("String: " + input + "\n" + "Length: " + length);

        for (int i = 0;i<length;i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                upper++;
            }
            if (Character.isLowerCase(input.charAt(i))){
                lower++;
            }
        }
        System.out.println("Upper letters: " + upper + "\nLower letters: " + lower);

    }
}
class Hexa_Binary {
    long num;

    void getVal(){
        {
            System.out.println("Convert Hexadecimal to Binary: ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter the number: ");
            num = Long.parseLong(scanner.nextLine(),16);
        }

        }
    void convert(){
        String binary = Long.toBinaryString(num);
        System.out.println("Binary Value is : "+ binary);
    }
}

class XBM {
    int width = 26;
    int height = 19;
    int file_parts[] = {
            0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x3e, 0x00,
            0x00, 0x00, 0x22, 0x00, 0x00, 0x00, 0x22, 0x00, 0x00, 0x00, 0x22, 0x00,
            0x00, 0x7c, 0x22, 0x00, 0x00, 0x7c, 0x22, 0x00, 0x00, 0x7c, 0x22, 0x00,
            0x00, 0x7c, 0x22, 0x00, 0xf8, 0x7c, 0x22, 0x00, 0xf8, 0x7c, 0x22, 0x00,
            0xf8, 0x7c, 0x22, 0x00, 0xf8, 0x7c, 0x22, 0x00, 0xf8, 0x7c, 0x22, 0x00,
            0xf8, 0x7c, 0x22, 0x00, 0xf8, 0x7c, 0x3e, 0x00, 0x00, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x00, 0x00
    };

}
