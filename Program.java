import java.util.ArrayList;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) throws Exception {
    ArrayList<Student> ListStudent = new ArrayList<>();
    Read r = new Read();
    Print p = new Print();
    Input i = new Input();
    Search s = new Search();
    Delete d = new Delete();
    System.out.print("\033[H\033[J");
    try (Scanner in = new Scanner(System.in)) {

      while (true) {
        System.out.println("Список студентов");
        System.out.println("Введите номер команды");
        System.out.println("1 - чтение из файла");
        System.out.println("2 - вывод на экран");
        System.out.println("3 - добавление записи");
        System.out.println("4 - удаление записи");
        System.out.println("5 - поиск по фамилии");
        System.out.println("6 - запись в файл");
        String key = in.next();
        switch (key) {
          case "1":
            r.ReadStudent("StudentLoad.txt", ListStudent);
            break;
          case "2":
            p.PrintListStudent(ListStudent);
            break;
          case "3":
            i.InputStudent(ListStudent);
            break;
          case "4":
            d.DeleteStudent(ListStudent);
            break;
          case "5":
            s.SearchStudent(ListStudent);
            break;
          case "6":
            Write.WriteStudent("StudentSave.txt", ListStudent);
            break;
          default:
            System.out.println("Такой команды нет");
            break;
        }
      }
    }
  }
}
