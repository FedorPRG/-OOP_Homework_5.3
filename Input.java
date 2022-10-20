import java.util.ArrayList;
import java.util.Scanner;

public class Input {

  public void InputStudent(ArrayList<Student> ListStudent) {

    Scanner input = new Scanner(System.in);
    System.out.printf("Введите количество дополнительныйх записей (можно 0):");
    int amount = input.nextInt(); 
    for (int i = 0; i < amount; i++) {
      input.nextLine();
      System.out.printf("Введите фамилию:");
      String name = input.nextLine();
      System.out.printf("Введите год рождения:");
      Integer year_of_birth = input.nextInt();
      Integer id = ListStudent.get(ListStudent.size()-1).getId();
      id=id+1;
      ListStudent.add(new Student(id, name, year_of_birth));
    }
  }
}
