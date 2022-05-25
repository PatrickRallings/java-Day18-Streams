import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BooksFromFile {

    List<Book> books = new ArrayList<>();

    public void main(String fileName){
        read(fileName);
        print();
    }

    private void read(String file) {
        try {
            Files.lines(Paths.get(file))
            .map(row -> row.split(","))
            .filter(parts -> parts.length == 4)
            .map(parts -> new Book(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3]))
                    .forEach(book -> books.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void print(){
        for (Book book : books) {
            System.out.println(book.toString());
        };
    }
}