package coreJava;

// every class has two things - properties (variables), and behaviours (functions/methods)
// every function has its own stack, for example "main" would have its own stack, and "add" would have of its own
class Calculator {
    int num = 10; // instance variable

    public int add(int a, int b) {
        return a + b; // a, b -> local variables
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OOPS {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        // cal is actually a reference variable, that stores the address of the object
        // created inside heap
        Calculator cal = new Calculator();
        int result = cal.add(num1, num2);
        System.out.println(result);

        result = cal.add(num1, num2, 7);
        System.out.println(result);
    }
}
