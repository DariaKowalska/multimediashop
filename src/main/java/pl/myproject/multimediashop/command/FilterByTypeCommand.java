package pl.myproject.multimediashop.command;

import pl.myproject.multimediashop.model.Medium;
import pl.myproject.multimediashop.model.Multimediashop;

import java.io.PrintStream;
import java.util.Scanner;

public class FilterByTypeCommand implements Command {

    private final Multimediashop<Medium> multimediashop;
    private final PrintStream printStream;

    public FilterByTypeCommand(Multimediashop<Medium> multimediashop, PrintStream printStream) {
        this.multimediashop = multimediashop;
        this.printStream = printStream;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        printStream.println("Typ:");
        String type = scanner.nextLine();
        multimediashop.getMedia().stream()//


                .filter(m -> m.getType().equals(type))//


                .forEach(printStream::println);
    }
}
