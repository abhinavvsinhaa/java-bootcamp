package coreJava;

public class Arrays {
    public static void main(String[] args) {
        // Way 1 of initialising arrays
        int nums[] = { 3, 7, 2, 4 };
        System.out.println(nums[0]);

        // Way 2 (with size, and all elements default to 0, in case of int)
        int numbers[] = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
