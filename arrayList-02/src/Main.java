import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // student objects
        Studente student1 = new Studente("Iresha", 22);
        Studente student2 = new Studente("Santo", 25);
        Studente student3 = new Studente("Riccardo", 29);
        Studente student4 = new Studente("Michele", 25);
        Studente student5 = new Studente("Andrea", 22);
        Studente student6 = new Studente("Ilenia", 24);
        Studente student7 = new Studente("Madushan", 26);
        Studente student8 = new Studente("Enoka", 29);
        Studente student9 = new Studente("Joele", 22);
        Studente student10 = new Studente("Laura", 22);
        Studente student11 = new Studente("Franca", 25);
        Studente student12 = new Studente("Pino", 27);

        // ArrayList for the class studente  and printing it out on the console
        List<Studente> myStudentList = new ArrayList<Studente>();
        myStudentList.add(student1);
        myStudentList.add(student2);
        myStudentList.add(student3);
        myStudentList.add(student4);
        myStudentList.add(student5);
        myStudentList.add(student6);
        myStudentList.add(student7);
        myStudentList.add(student8);
        myStudentList.add(student9);
        myStudentList.add(student10);
        myStudentList.add(student11);
        myStudentList.add(student12);

        System.out.println("my students " + myStudentList);

        // put the arraylist in order
        myStudentList.sort(Comparator.comparing(Studente::getName));
        System.out.println("My ordered list of students " + myStudentList);
    }
}
