class Student {
    int roll;
    String name;
}

public class ArrayOfObjects {
    public static void main(Strings[] args) {
        Student students[] = new Student[2];

        // need to create a new student, since the array will only store only references
        // you need to create the object like below
        students[0] = new Student();
        students[0].roll = 1;
        students[0].name = "Abhinav";

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Fardeen";
        students[1] = s2;

        for (Student s : students) {
            System.out.println("roll: " + s.roll);
            System.out.println("name: " + s.name);
        }
    }

}
