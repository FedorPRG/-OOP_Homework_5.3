import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Read {

  public void ReadStudent(String text, ArrayList<Student> ListStudent) throws Exception {
    FileReader r = new FileReader(text);
    Scanner scan = new Scanner(r);
    while (scan.hasNextLine()) {
      String[] Data = scan.nextLine().split(" ");
      int id = Integer.parseInt(Data[0]);      
      String name = Data[1];
      int year_of_birth=Integer.parseInt(Data[2]);
      ListStudent.add(new Student(id, name, year_of_birth));
    }
    scan.close();
    r.close();
  }
}
