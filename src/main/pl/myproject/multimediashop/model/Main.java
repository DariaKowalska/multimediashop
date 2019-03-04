package pl.myproject.multimediashop.model;

public class Main {
    public static void main(String[] args) {
        Multimediashop multimediashop = new Multimediashop();

        multimediashop.addBook(new BookBuilder()
                .authorFirstName("Carol")
                .authorLastName("Lewis")
                .title("Lew, czarownica i stara szafa")
                .build());

        multimediashop.addBook(new BookBuilder()
                .authorFirstName("Lewis")
                .authorLastName("Carol")
                .title("Alicja w Krainie Czarów")
                .build());

        multimediashop.addBook(new BookBuilder()
                .authorFirstName("Xueqin")
                .authorLastName("Cao")
                .title("Sen czerwonego pawilonu")
                .build());

        multimediashop.addBook(new BookBuilder()
                .authorFirstName("Agatha")
                .authorLastName("Christie")
                .title("I nie było już nikogo")
                .build());

        multimediashop.addBook(new BookBuilder()
                .authorFirstName("John")
                .authorLastName("Tolkien")
                .title("Hobbit, czyli tam i z powrotem")
                .build());

        multimediashop.addBook(new BookBuilder()
                .authorFirstName("Joanne")
                .authorLastName("Rowling")
                .title("Harry Potter i kamień filozoficzny")
                .build());

        multimediashop.addBook(new BookBuilder()
                .authorFirstName("Antoine")
                .authorLastName("de Saint-Exupéry")
                .title("Mały Książę")
                .build());

        multimediashop.addBook(new BookBuilder()
                .authorFirstName("John")
                .authorLastName("Tolkien")
                .title("Władca Pierścieni")
                .build());

        multimediashop.addBook(new BookBuilder()
                .authorFirstName("Charles")
                .authorLastName("Dickens")
                .title("Opowieść o dwóch miastach")
                .build());

        multimediashop.addBook(new BookBuilder()
                .authorFirstName("Miguel")
                .authorLastName("de Cervantes")
                .title("Don Kichot")
                .build());

        for (Book book : multimediashop.getBooks()) {
            System.out.println(book);
        }
    }
}


