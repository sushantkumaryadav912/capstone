package StudentManagement;

public class StudentManagement {
    public static void main(String[] args) {
        Address a1 = new Address("Kothrud", "Pune", "314404");
        Address a2 = new Address("ABC", "Mumbai", "34434");
        Address a3 = new Address("PQR", "Mumbai", "43443");

        Student s1 = new Student(101, "John", a1, a2);
        Student s2 = new Student(102, "Smith", a1, a1);
        Student s3 = new Student(103, "Dehan", a1, a2);
        Student s4 = new Student(104, "Kiran", a1, a3);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
