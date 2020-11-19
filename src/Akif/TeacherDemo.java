package Akif;


public class TeacherDemo {

    public static void main(String[] args) {

        Teacher A = new Teacher();
        A.Display();;

        Teacher B = new Teacher("Akif Islam",191035,375000);
        B.Display();;

        Teacher C = B;
        C.Display();;



    }
}

