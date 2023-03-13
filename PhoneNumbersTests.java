import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PhoneNumbersTests {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        System.out.println("file.exists() = " + file.exists());
        PhoneNumbers.readPhoneNumbers("file.txt");
    }
}
