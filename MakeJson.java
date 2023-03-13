import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class MakeJson {
    public static void main(String[] args) throws IOException {
        String filePath = "file2.txt";
        String outputPath = "user.json";
        List<User> users = new ArrayList<>();
        FileReader fileReader = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fileReader);
        String line = br.readLine();
        boolean firstLine = true;

        while (line != null){
            line=br.readLine();
            if(line==null){
                break;
            }
            if (firstLine) {
                // перший рядок - заголовок
                firstLine = false;
                continue;
            }

            String[] f = line.split(" ");
            String name = f[0];
            int age = Integer.parseInt(f[1]);
            users.add(new User(name, age));
        }

        br.close();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter writer = new FileWriter(outputPath);
        writer.write(gson.toJson(users));
        writer.close();
    }
}

