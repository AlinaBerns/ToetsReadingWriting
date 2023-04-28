import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainApp {
    public static void main(String[] args) {

        Repository.taskFirst();
        Repository.taskSecond();
        Repository.writeToMessageToManuel();
        Repository.writeToMessageToCat();
        Repository.readToMessageToManuel();
        Repository.readToMessageToCat();

        Path pathC = Paths.get("resources//FromAlinaToCrocodile//message.txt");

        Crocodile crocodile = new Crocodile("Crocodile", false);
        try {

            Files.createDirectories(pathC.getParent());

            if (Files.notExists(pathC)) {
                Files.createFile(pathC);
                System.out.println(Repository.ANSI_GREEN + "Created" + Repository.ANSI_RESET);
            }

        } catch (IOException e) {
            System.err.println("You know there's no file, Betty.");
        }

        try {
            FileWriter fileWriter = new FileWriter(pathC.toFile(), true);
            if (pathC.toFile().exists()) {
                fileWriter.write("Hello " + crocodile.getName() + " " + crocodile.isEdible());
                fileWriter.close();
            }

            System.out.println(Repository.ANSI_BLUE + "The message has been sent to " + Repository.ANSI_RESET
                    + Repository.ANSI_PURPLE + crocodile.getName()
                    + Repository.ANSI_RESET);

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Sorry... Something wrong...");
        }

    }

}