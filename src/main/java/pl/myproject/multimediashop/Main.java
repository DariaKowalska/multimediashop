package pl.myproject.multimediashop;

import pl.myproject.multimediashop.command.Command;
import pl.myproject.multimediashop.command.DisplayMultimediaCommand;
import pl.myproject.multimediashop.command.FilterByTypeCommand;
import pl.myproject.multimediashop.model.*;
import sun.applet.resources.MsgAppletViewer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Multimediashop<Medium> multimediashop = createMultimediashop();
        Scanner scanner = new Scanner(System.in);
        Map<String, Command> commands = new HashMap<>();
        commands.put("exit", () -> System.exit(0));
        commands.put("display", new DisplayMultimediaCommand(multimediashop, System.out));
        commands.put("filter", new FilterByTypeCommand(multimediashop, System.out));
        while (true) {
            System.out.println("Podaj komendę:");
            String commandName = scanner.nextLine();
            Command command = commands.get(commandName);
            Optional.ofNullable(command).ifPresent(Command::execute);
        }
    }
    private static Multimediashop<Medium> createMultimediashop(){
            Multimediashop<Medium> multimediashop = new Multimediashop<>();
            multimediashop.addMedium(new PaperBookBuilder()
                    .authorFirstName("Carol")
                    .authorLastName("Lewis")
                    .title("Lew, czarownica i stara szafa")
                    .cover(Cover.HARD)
                    .build());

            multimediashop.addMedium(new PaperBookBuilder()
                    .authorFirstName("Lewis")
                    .authorLastName("Carol")
                    .title("Alicja w Krainie Czarów")
                    .cover(Cover.HARD)
                    .build());

            multimediashop.addMedium(new PaperBookBuilder()
                    .authorFirstName("Xueqin")
                    .authorLastName("Cao")
                    .title("Sen czerwonego pawilonu")
                    .cover(Cover.HARD)
                    .build());

            multimediashop.addMedium(new PaperBookBuilder()
                    .authorFirstName("Agatha")
                    .authorLastName("Christie")
                    .title("I nie było już nikogo")
                    .cover(Cover.HARD)
                    .build());

            multimediashop.addMedium(new PaperBookBuilder()
                    .authorFirstName("John")
                    .authorLastName("Tolkien")
                    .title("Hobbit, czyli tam i z powrotem")
                    .cover(Cover.HARD)
                    .build());

            multimediashop.addMedium(new PaperBookBuilder()
                    .authorFirstName("Joanne")
                    .authorLastName("Rowling")
                    .title("Harry Potter i kamień filozoficzny")
                    .cover(Cover.HARD)
                    .build());

            multimediashop.addMedium(new PaperBookBuilder()
                    .authorFirstName("Antoine")
                    .authorLastName("de Saint-Exupéry")
                    .title("Mały Książę")
                    .cover(Cover.HARD)
                    .build());

            multimediashop.addMedium(new PaperBookBuilder()
                    .authorFirstName("John")
                    .authorLastName("Tolkien")
                    .title("Władca Pierścieni")
                    .cover(Cover.HARD)
                    .build());

            multimediashop.addMedium(new PaperBookBuilder()
                    .authorFirstName("Charles")
                    .authorLastName("Dickens")
                    .title("Opowieść o dwóch miastach")
                    .cover(Cover.HARD)
                    .build());

            multimediashop.addMedium(new PaperBookBuilder()
                    .authorFirstName("Miguel")
                    .authorLastName("de Cervantes")
                    .title("Don Kichot")
                    .cover(Cover.HARD)
                    .build());

            multimediashop.addMedium(new AudioBookBuilder()
                    .authorFirstName("Carol")
                    .authorLastName("Lewis")
                    .title("Lew, czarownica i stara szafa")
                    .format(Format.MP3)
                    .build());

            multimediashop.addMedium(new AudioBookBuilder()
                    .authorFirstName("Lewis")
                    .authorLastName("Carol")
                    .title("Alicja w Krainie Czarów")
                    .format(Format.MP3)
                    .build());

            multimediashop.addMedium(new AudioBookBuilder()
                    .authorFirstName("Xueqin")
                    .authorLastName("Cao")
                    .title("Sen czerwonego pawilonu")
                    .format(Format.MP3)
                    .build());

            multimediashop.addMedium(new AudioBookBuilder()
                    .authorFirstName("Agatha")
                    .authorLastName("Christie")
                    .title("I nie było już nikogo")
                    .format(Format.MP3)
                    .build());

            multimediashop.addMedium(new AudioBookBuilder()
                    .authorFirstName("John")
                    .authorLastName("Tolkien")
                    .title("Hobbit, czyli tam i z powrotem")
                    .format(Format.MP3)
                    .build());

            multimediashop.addMedium(new AudioBookBuilder()
                    .authorFirstName("Joanne")
                    .authorLastName("Rowling")
                    .title("Harry Potter i kamień filozoficzny")
                    .format(Format.MP3)
                    .build());

            multimediashop.addMedium(new AudioBookBuilder()
                    .authorFirstName("Antoine")
                    .authorLastName("de Saint-Exupéry")
                    .title("Mały Książę")
                    .format(Format.MP3)
                    .build());

            multimediashop.addMedium(new AudioBookBuilder()
                    .authorFirstName("John")
                    .authorLastName("Tolkien")
                    .title("Władca Pierścieni")
                    .format(Format.MP3)
                    .build());

            multimediashop.addMedium(new AudioBookBuilder()
                    .authorFirstName("Charles")
                    .authorLastName("Dickens")
                    .title("Opowieść o dwóch miastach")
                    .format(Format.MP3)
                    .build());

            multimediashop.addMedium(new AudioBookBuilder()
                    .authorFirstName("Miguel")
                    .authorLastName("de Cervantes")
                    .title("Don Kichot")
                    .format(Format.MP3)
                    .build());

            multimediashop.addMedium(new MovieBuilder()
                    .title("Skazani na Shawshank")
                    .directorFirstName("Frank")
                    .directorLastName("Darabont")
                    .duration(120)
                    .build());

            multimediashop.addMedium(new MovieBuilder()
                    .title("Zielona mila")
                    .directorFirstName("Frank")
                    .directorLastName("Darabont")
                    .duration(180)
                    .build());

            multimediashop.addMedium(new MovieBuilder()
                    .title("Nietykalni")
                    .directorFirstName("Olivier")
                    .directorLastName("Nakache")
                    .duration(110)
                    .build());
            multimediashop.addMedium(new MagazineBuilder()
                    .title("Programista")
                    .number(15)
                    .pageCount(32)
                    .build());
            multimediashop.addMedium(new MagazineBuilder()
                    .title("Newsweek")
                    .number(14)
                    .pageCount(64)
                    .build());
            multimediashop.addMedium(new MagazineBuilder()
                    .title("Polityka")
                    .number(13)
                    .pageCount(100)
                    .build());
            return multimediashop;

            //multimediashop.getMedia().forEach(System.out::println);
        /* for (Medium medium : multimediashop.getMedia()) {
            System.out.println(medium);*/

        }
    }


