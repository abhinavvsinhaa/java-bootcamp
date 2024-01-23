// NOTE: By default, Strings are IMMUTABLE (cant be changed) in Java

/**
 * Very Very Important
 * 
 * We have a "String Constant Pool" in Heap, which stores all the unique strings
 * that we've used in our program
 * 
 * since we donot have "Navin" in our pool, JVM will create one and add into the
 * pool, and s1 will point to that address
 * 
 * String s1 = "Navin"
 * 
 * for the second time, since we're having Navin, s2 will point to that address
 * only where s1 is pointing, saving us extra space
 * 
 * String s2 = "Navin"
 * 
 * String name = "abhinav"
 * name = name + " sinha"
 * 
 * Instead of mutating the original string from the constant pool, it will
 * create a new string and store it in the pool, and the new address will be
 * pointed to by name, making the previous address where "abhinav" is stored,
 * eligible for garbage collection
 */

// For mutable strings, we have String Buffer and String Builder
// String Buffer is thread SAFE, but not String Builder

public class Strings {
    public static void main(String[] args) {
        String name = "abhinav";

        // concatentaion
        // Method 1. Using + operator
        System.out.println("hello" + name);

        // Method 2. Using .concat
        String message = "Hey, ";
        System.out.println(message.concat(name));

        // fetching char at an index
        System.out.println("char at index 0: " + name.charAt(0));

        StringBuffer sb = new StringBuffer("Abhinav");

        // default: 16 when we do not assign it anything, 16 + len(str)
        // when we provide it a string
        // extra 16 char is given to prevent relocation,
        // if less than 16 chars are appended
        System.out.println("buffer capactiy: " + sb.capacity());

        // Appending into StringBuffer
        sb.append(" Sinha");

        // Insert at any specific position, similarly we can delete also
        sb.insert(sb.length(), " is very cool");

        System.out.println(sb);

    }
}
