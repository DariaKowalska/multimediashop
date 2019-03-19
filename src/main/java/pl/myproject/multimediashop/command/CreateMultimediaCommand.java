package pl.myproject.multimediashop.command;

import pl.myproject.multimediashop.model.*;

import java.io.PrintStream;
import java.util.Scanner;

public class CreateMultimediaCommand implements Command{

    private static final String AUDIO_BOOK= " AudioBook";

    private final Multimediashop<Medium> multimediashop;
    private final PrintStream printStream;

    public CreateMultimediaCommand(Multimediashop<Medium> multimediashop, PrintStream printStream){
        this.multimediashop = multimediashop;
        this.printStream = printStream;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        printStream.println("Typ:");
        String type = scanner.nextLine();
        if(type.equals(AUDIO_BOOK)){
            printStream.println("Tytuł:");
            String title = scanner.nextLine();
            printStream.println("Imię autora:");
            String authorFirstName = scanner.nextLine();
            printStream.println("Nazwisko autora:");
            String authorLastName = scanner.nextLine();
            printStream.println("Format:");
            String format = scanner.nextLine();
            printStream.println("Czas trwania:");
            int duration = scanner.nextInt();
            scanner.nextLine();
            AudioBook audioBook = new AudioBookBuilder()
                    .title(title)
                    .authorFirstName(authorFirstName)
                    .authorLastName(authorLastName)
                    .format(Format.valueOf(format))
                    .duration(duration)
                    .build();
            multimediashop.addMedium(audioBook);
        }
    }
}
