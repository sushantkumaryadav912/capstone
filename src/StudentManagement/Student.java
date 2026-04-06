package StudentManagement;

public class Student {
    int roll;
    String name;
    Address currentaddress;
    Address permanentaddress;

    Student(int roll, String name, Address currentaddress, Address permanentaddress) {
        this.roll = roll;
        this.name = name;
        this.currentaddress = currentaddress;
        this.permanentaddress = permanentaddress;
    }

    void display() {
        System.out.printf(
                "Roll No: %d, Name: %s, Current: %s, %s, %s, Permanent: %s, %s, %s%n",
                roll,
                name,
                currentaddress.area,
                currentaddress.City,
                currentaddress.Pin,
                permanentaddress.area,
                permanentaddress.City,
                permanentaddress.Pin
        );
    }
}