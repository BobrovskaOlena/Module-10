import java.io.File;

public class PhoneNumbersTests {
    public static void main(String[] args) {
        File file = new File("file.txt");
        System.out.println("file.exists() = " + file.exists());
        PhoneNumbers.readPhoneNumbers("file.txt");
    }
}
