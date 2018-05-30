package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant; target = -3. Is that really what's meant?
        target =+ num; // Noncompliant; target = 3
    }

    private final String getMessage() {
        return message;
    }

}
