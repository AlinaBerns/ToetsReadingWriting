import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Repository {
    private static final Path pathA = Paths.get("resources//FromAlinaToCat//message.txt");
    private static final Path pathM = Paths.get("resources//FromAlinaToManuel//message.txt");
    public static void taskFirst () {

        try {

            Files.createDirectories(pathM.getParent());

            if (Files.notExists(pathM)) {
                Files.createFile(pathM);
                System.out.println(ANSI_GREEN + "Created" + ANSI_RESET);
            }

        } catch (IOException e) {
            System.err.println("You know there's no file, Betty.");
        }

    }

    public static void taskSecond () {

        try {
            Files.createDirectories(pathA.getParent());

            if (Files.notExists(pathA)) {
                Files.createFile(pathA);
                System.out.println(ANSI_GREEN + "Created" + ANSI_RESET);
            }

        } catch (IOException e) {
            System.err.println("You know there's no file, Betty.");
        }

    }

    public static void writeToMessageToManuel () {
        try {
            FileWriter fileWriter = new FileWriter("resources//FromAlinaToManuel//message.txt", true);

            if (pathM.toFile().exists()) {
                fileWriter.write("When gone am I, the last of the Jedi will you be. " +
                        "The Force runs strong in your family. Pass on what you have learned. ");
                fileWriter.close();
            }

            System.out.println(ANSI_BLUE + "The message has been sent" + ANSI_RESET);

        } catch (IOException e) {
            System.err.println("Not possible");

        }

    }

    public static void writeToMessageToCat () {
        try {
            FileWriter fileWriter = new FileWriter("resources//FromAlinaToCat//message.txt", true);

            if (pathM.toFile().exists()) {
                fileWriter.write("The first rule about fight club is you don’t talk about fight club… ");
                fileWriter.close();
            }

            System.out.println(ANSI_BLUE + "The message has been sent" + ANSI_RESET);

        } catch (IOException e) {
            System.err.println("Not possible");

        }

    }

    public static void readToMessageToManuel() {
        int b;

        try {
            FileReader fileReader = new FileReader("resources//FromAlinaToManuel//message.txt");
                while ((b = fileReader.read()) != -1) {
                    System.out.print((char)b);
                }
                System.out.println();

        } catch (FileNotFoundException e) {
            System.err.println("Not possible");
        } catch (IOException e) {
            System.err.println("Sorry... Something wrong");

        }


    }

    public static void readToMessageToCat() {
        int b;

        try {
            FileReader fileReader = new FileReader("resources//FromAlinaToCat//message.txt");
            while ((b = fileReader.read()) != -1) {
                System.out.print((char)b);
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            System.err.println("Not possible");
        } catch (IOException e) {
            System.err.println("Sorry... Something wrong");

        }

    }
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
}
