import entity.Book;
import entity.Library;
import entity.TrainingManual;

public class Main {
    public static void main(String[] args) {
        Book dragonStory = new Book(200, "Shern A.L.", "skean", "fantasy", 1, 2019);
        TrainingManual physics = new TrainingManual("Physics", "Medium level", "noooo!", "Knowlege", 2, 2007);
        Library[] array = {dragonStory, physics};
        int counter = 0;
        for (Library paper : array) {
            if (paper instanceof Book) {
                Book book = (Book) paper;
                book.getInfo();
                book.printReaction();
            }
            if (paper instanceof TrainingManual) {
                TrainingManual trash = (TrainingManual) paper;
                trash.getInfo();
                trash.printReaction();
            }
        }
    }
}
