package coreJava;

// every class has two things - properties (variables), and behaviours (functions/methods)
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class OOPS {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        Calculator cal = new Calculator();
        int result = cal.add(num1, num2);
        System.out.println(result);
    }
}
