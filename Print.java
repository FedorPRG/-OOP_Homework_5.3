import java.util.ArrayList;

public class Print {
  public void PrintListStudent(ArrayList<Student> ListStudent) {
    System.out.println("id Фамилия  год рождения");
    for (Student student : ListStudent) {
      System.out.println(student.getFullName());
    }
  }
}
