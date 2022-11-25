import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task9 {

    public static void main(String[] args) throws IOException, SimpleException {
        try {
            FileReader reader = new FileReader("text.txt");
            BufferedReader reader1 = new BufferedReader(reader);
            String line = reader1.readLine();
            while (line != null) {
                if (line.length() >= 10) {
                    throw new SimpleException("");
                } else {
                    System.out.println(line);
                }
                line = reader1.readLine();
            }
        } catch
        (IOException e) {
            e.printStackTrace();
        }
    }
}
