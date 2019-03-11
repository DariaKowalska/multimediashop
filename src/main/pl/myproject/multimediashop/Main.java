package pl.myproject.multimediashop;

import pl.myproject.multimediashop.model.*;

public class Main {
    public static void main(String[] args) {
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

        for (Medium medium : multimediashop.getMedia()) {

            System.out.println(medium);
        }
    }
}


