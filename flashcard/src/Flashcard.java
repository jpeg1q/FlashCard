import java.util.HashMap;

public class Flashcard {
    HashMap<String, String> card = new HashMap<String, String>();
    public Flashcard(){}

    public void add(String[] term, String[] ans){
        for(int i = 0; i < term.length; i++){
            card.put(term[i], ans[i]);
        }
    }

    public void getAnswers(){
        for (String i : card.values()) {
            System.out.println(i);
        }
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
