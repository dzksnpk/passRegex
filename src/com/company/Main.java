package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String upperCase = ".*[A-Z]+.*";
        String lowerCase = ".*[a-z]+.*";
        String digit = ".*\\d+.*";
        String length = "\\w{12,}";

        String password = sc.nextLine();

        boolean upperRegex = password.matches(upperCase);
        boolean lowerRegex = password.matches(lowerCase);
        boolean digitRegex = password.matches(digit);
        boolean lengthRegex = password.matches(length);

        boolean passwordRegex = upperRegex && lowerRegex && digitRegex && lengthRegex;

        System.out.println(passwordRegex ? "YES" : "NO");

    }
}
