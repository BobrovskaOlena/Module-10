import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PhoneNumbers {
       public static void readPhoneNumbers(String filename) {
            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                Pattern pattern = Pattern.compile("^\\(\\d{3}\\) \\d{3}-\\d{4}$|^\\d{3}-\\d{3}-\\d{4}$");
                while ((line = br.readLine()) != null) {
                    line = line.trim();
                    Matcher matcher = pattern.matcher(line);
                    if (matcher.matches()) {
                        System.out.println(line);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
