package pl.myproject.multimediashop.command;

import pl.myproject.multimediashop.model.Medium;
import pl.myproject.multimediashop.model.Multimediashop;

import java.io.PrintStream;

public class DisplayMultimediaCommand implements Command {

    private final Multimediashop<Medium> multimediashop;
    private final PrintStream printStream;

    public DisplayMultimediaCommand(Multimediashop<Medium> multimediashop, PrintStream printStream) {
        this.multimediashop = multimediashop;
        this.printStream = printStream;
    }

    @Override
    public void execute() {
        multimediashop.getMedia().forEach(printStream::println);
    }
}
