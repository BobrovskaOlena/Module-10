import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {
    public Reader(File file) {}

    public static void readFileWithPhoneNumbers() throws IOException {
        String example1 = "\\d{3}-\\d{3}-\\d{4}";
        String example2 = "\\((\\d{3})\\)\\s\\d{3}-\\d{4}";
        String pathName = "C:\\file.txt";
        File file = new File(pathName);
        Reader reader = new Reader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String phoneNumber = bufferedReader.readLine();
        while (phoneNumber != null) {
            Pattern pattern1 = Pattern.compile(example1);
            Pattern pattern2 = Pattern.compile(example2);
            Matcher matcher1 = pattern1.matcher(phoneNumber);
            Matcher matcher2 = pattern2.matcher(phoneNumber);
            if(matcher1.matches() || matcher2.matches()){
                System.out.println(phoneNumber);}
            phoneNumber = bufferedReader.readLine();
        }
    }
    public static void main(String[] args) throws IOException {
        readFileWithPhoneNumbers();
    }
}

