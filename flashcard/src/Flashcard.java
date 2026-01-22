import java.io.*;
import java.util.HashMap;

public class Flashcard {
    File f = new File("cards.txt");
    HashMap<String, String> card = new HashMap<String, String>();
    public Flashcard(){}

//    public void add(String[] term, String[] ans){
//        for(int i = 0; i < term.length; i++){
//            card.put(term[i], ans[i]);
//        }
//    }
    public void LoadFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(f));

        String line;
        while ((line = reader.readLine()) != null){
            line = line.trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s*\\|\\s*", 2);
            if (parts.length == 2){
                card.put(parts[0], parts[1]);
            }
        }
    }

    public void getAnswers(){
        for (String i : card.values()) {
            System.out.println(i);
        }
    }

    public HashMap<String, String> getMap() {
        return card;
    }


    public void getTerms(){
        for(String i: card.keySet()){
            System.out.println(i);
        }
    }

    public void PrintTnA(){
        for (String i : card.keySet()) {
            System.out.println("Term:" + i + "   Answer:" + card.get(i));
        }

    }
}
