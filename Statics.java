
class Mobile {
    String brand;
    int price;

    static String type; // static variables belong to class, instead of objects

    // Loads only once, when the class is loaded
    static {
        type = "smartphone";
        System.out.println("In static block");
    }

    // constructor is loaded every time we create an object
    public Mobile() {
        brand = "";
        price = 20_000;

        System.out.println("In constructor");
    }

    public void show() {
        System.out.println(brand + " | " + price + " | " + type);
    }

    // static functions also belongs to the class
    public static void showStatic(Mobile obj) {
        // IMP: we cannot directly access non static variables inside static methods
        // Error:
        // System.out.println(brand + " | " + price + " | " + type);

        // To solve the above problem, we need to pass objects to static functions
        System.out.println(obj.brand + " | " + obj.price + " | " + type);
    }
}

public class Statics {
    public static void main(String[] args) throws ClassNotFoundException {
        // Loads class even if an object is not created, otherwise class is loaded when
        // the first object is created
        Class.forName("Mobile");

        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 70_000;

        // obj.show();
        Mobile.showStatic(obj);
    }
}
