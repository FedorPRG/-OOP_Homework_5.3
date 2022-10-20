import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    public void SearchStudent(ArrayList<Student> ListStudent) {
        System.out.println("Введите фамилию студента:");
        Scanner input = new Scanner(System.in);
        String nameSearch = input.nextLine();
        for (Student student : ListStudent) {
            if (student.getName().equals(nameSearch)) {
                System.out.println(student.getFullName());
            }
        }
    }
}
