import com.google.gson.Gson;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class MakeJson {
    public static void main(String[] args) throws IOException {
        String filePath = "file.txt";
        String outputPath = "user.json";
        List<User> users = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        boolean firstLine = true;

        while ((line = br.readLine()) != null) {
            if (firstLine) {
                // перший рядок - заголовок
                firstLine = false;
                continue;
            }

            String[] field = line.split(" ");
            String name = field[0];
            int age = Integer.parseInt(field[1]);

            users.add(new User(name, age));
        }

        br.close();

        Gson gson = new Gson();

        FileWriter writer = new FileWriter(outputPath);
        writer.write(gson.toJson(users));
        writer.close();
    }
}

