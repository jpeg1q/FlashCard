import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Flashcard card =  new Flashcard();
        card.LoadFile();
        Deck d = new Deck(card.getMap());
        d.start();
    }
}