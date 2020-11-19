package Akif;

public class Teacher {
    private String Name;
    private int ID;
    private int Salary;

    public Teacher() {
        Name = "Lecturer";
        ID = 10;
        Salary = 25000;
    }

    public Teacher(Teacher obj) {
        Name = obj.Name;
        ID = obj.ID;
        Salary = obj.Salary;
    }

    public Teacher(String Name, int ID, int Salary) {
        this.Name = Name;
        this.ID = ID;
        this.Salary = Salary;
    }

    void Display() {
        System.out.println("-------------");
        System.out.println("Name: " + Name);
        System.out.println("ID: " + ID);
        System.out.println("Salary: " + Salary);
        System.out.println("-------------");
        System.out.println();

    }
}
