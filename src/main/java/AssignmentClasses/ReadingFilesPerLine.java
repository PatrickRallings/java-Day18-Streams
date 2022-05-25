package AssignmentClasses;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadingFilesPerLine {

    List<String> fileLines = new ArrayList<>();

    public void main(String fileName){
        read(fileName);
        print();
    }

    private void read(String file) {
        try {
            Files.lines(Paths.get(file)).forEach(row -> fileLines.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void print(){
        fileLines.forEach(System.out::println);
    }
}