import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Delete {
    public void DeleteStudent(ArrayList<Student> ListStudent) {
        System.out.println("Введите фамилию студента:");
        Scanner input = new Scanner(System.in);
        String nameDelete = input.nextLine();
        int ind = -1;
        Iterator<Student> studentIterator = ListStudent.iterator();
        while (studentIterator.hasNext()) {
            Student nextStudent = studentIterator.next();
            if (nextStudent.getName().equals(nameDelete)) {
                // ListStudent.indexOf(student);
                // ind=ListStudent.indexOf(student);
                // System.out.println(ind);
                studentIterator.remove();
            }
        }

    }
}