import java.io.FileWriter;
import java.util.ArrayList;

public class Write {
  public static void WriteStudent(String text, ArrayList<Student> ListStudent) throws Exception {
    FileWriter w = new FileWriter(text, false);
    for (Student student : ListStudent) {
      w.write(student.getFullName() + "\n");
    }
    w.flush();
    w.close();
  }
}
