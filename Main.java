import java.io.File;
public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");

        System.out.println("Абсолютты жол: " + file.getAbdsolutePath());
    }
}