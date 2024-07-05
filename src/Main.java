import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        printSystemProperties();
    }

    public static void printSystemProperties() {
        System.out.println("The Printing Properties");
        Properties props = System.getProperties();
        System.out.println(props);
    }

}