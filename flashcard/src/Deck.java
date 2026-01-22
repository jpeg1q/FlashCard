import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Deck {
    HashMap<String, String> map;
    ArrayList<String> terms;
    public Deck(HashMap<String, String> map){
        this.map = map;
        this.terms = new ArrayList<>(map.keySet());
    }

    public void start(){
        Scanner sc = new Scanner(System.in);

        for (String t: terms){
            System.out.println("Term: "+ t);
            System.out.print("Your answer: ");

            String userAns = sc.nextLine();
            String correct =  map.get(t);

            if (userAns.equalsIgnoreCase(correct)){
                System.out.print("Correct\n");
            } else {
                System.out.println("wrong. answer: "+ correct+"\n");
            }
        }
    }
}
