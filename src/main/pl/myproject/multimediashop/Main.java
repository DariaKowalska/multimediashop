package pl.myproject.multimediashop;

import pl.myproject.multimediashop.model.*;

public class Main {
    public static void main(String[] args) {
        Multimediashop <Book> multimediashop = new Multimediashop<>();

        multimediashop.addBook(new PaperBookBuilder()
                .authorFirstName("Carol")
                .authorLastName("Lewis")
                .title("Lew, czarownica i stara szafa")
                .cover(Cover.HARD)
                .build());

        multimediashop.addBook(new PaperBookBuilder()
                .authorFirstName("Lewis")
                .authorLastName("Carol")
                .title("Alicja w Krainie Czarów")
                .cover(Cover.HARD)
                .build());

        multimediashop.addBook(new PaperBookBuilder()
                .authorFirstName("Xueqin")
                .authorLastName("Cao")
                .title("Sen czerwonego pawilonu")
                .cover(Cover.HARD)
                .build());

        multimediashop.addBook(new PaperBookBuilder()
                .authorFirstName("Agatha")
                .authorLastName("Christie")
                .title("I nie było już nikogo")
                .cover(Cover.HARD)
                .build());

        multimediashop.addBook(new PaperBookBuilder()
                .authorFirstName("John")
                .authorLastName("Tolkien")
                .title("Hobbit, czyli tam i z powrotem")
                .cover(Cover.HARD)
                .build());

        multimediashop.addBook(new PaperBookBuilder()
                .authorFirstName("Joanne")
                .authorLastName("Rowling")
                .title("Harry Potter i kamień filozoficzny")
                .cover(Cover.HARD)
                .build());

        multimediashop.addBook(new PaperBookBuilder()
                .authorFirstName("Antoine")
                .authorLastName("de Saint-Exupéry")
                .title("Mały Książę")
                .cover(Cover.HARD)
                .build());

        multimediashop.addBook(new PaperBookBuilder()
                .authorFirstName("John")
                .authorLastName("Tolkien")
                .title("Władca Pierścieni")
                .cover(Cover.HARD)
                .build());

        multimediashop.addBook(new PaperBookBuilder()
                .authorFirstName("Charles")
                .authorLastName("Dickens")
                .title("Opowieść o dwóch miastach")
                .cover(Cover.HARD)
                .build());

        multimediashop.addBook(new PaperBookBuilder()
                .authorFirstName("Miguel")
                .authorLastName("de Cervantes")
                .title("Don Kichot")
                .cover(Cover.HARD)
                .build());

        multimediashop.addBook(new AudioBookBuilder()
                .authorFirstName("Carol")
                .authorLastName("Lewis")
                .title("Lew, czarownica i stara szafa")
                .format(Format.MP3)
                .build());

        multimediashop.addBook(new AudioBookBuilder()
                .authorFirstName("Lewis")
                .authorLastName("Carol")
                .title("Alicja w Krainie Czarów")
                .format(Format.MP3)
                .build());

        multimediashop.addBook(new AudioBookBuilder()
                .authorFirstName("Xueqin")
                .authorLastName("Cao")
                .title("Sen czerwonego pawilonu")
                .format(Format.MP3)
                .build());

        multimediashop.addBook(new AudioBookBuilder()
                .authorFirstName("Agatha")
                .authorLastName("Christie")
                .title("I nie było już nikogo")
                .format(Format.MP3)
                .build());

        multimediashop.addBook(new AudioBookBuilder()
                .authorFirstName("John")
                .authorLastName("Tolkien")
                .title("Hobbit, czyli tam i z powrotem")
                .format(Format.MP3)
                .build());

        multimediashop.addBook(new AudioBookBuilder()
                .authorFirstName("Joanne")
                .authorLastName("Rowling")
                .title("Harry Potter i kamień filozoficzny")
                .format(Format.MP3)
                .build());

        multimediashop.addBook(new AudioBookBuilder()
                .authorFirstName("Antoine")
                .authorLastName("de Saint-Exupéry")
                .title("Mały Książę")
                .format(Format.MP3)
                .build());

        multimediashop.addBook(new AudioBookBuilder()
                .authorFirstName("John")
                .authorLastName("Tolkien")
                .title("Władca Pierścieni")
                .format(Format.MP3)
                .build());

        multimediashop.addBook(new AudioBookBuilder()
                .authorFirstName("Charles")
                .authorLastName("Dickens")
                .title("Opowieść o dwóch miastach")
                .format(Format.MP3)
                .build());

        multimediashop.addBook(new AudioBookBuilder()
                .authorFirstName("Miguel")
                .authorLastName("de Cervantes")
                .title("Don Kichot")
                .format(Format.MP3)
                .build());

        for (Book book : multimediashop.getBooks()) {
            System.out.println(book);
        }
    }
}


