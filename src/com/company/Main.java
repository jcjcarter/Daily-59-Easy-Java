package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(myIndexOf("Double, double, toil and trouble", "il an"));
    }

    public static int myIndexOf(String a, String b) {
        for(int i = 0; i < a.length() && i + b.length() < a.length(); i++) {
            String section = a.substring(i, b.length() + i);
            if(section.equals(b))
                return i;
        }
        return -1;
    }
}
