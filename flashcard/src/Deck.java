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
            System.out.print("Press Enter to see the answer...");
        sc.nextLine();
            
            System.out.println("Answer: " + map.get(t));
        System.out.print("Did you get it right? (y/n): ");

        String result = sc.nextLine().trim().toLowerCase();
        if (result.equals("y")) {
            System.out.println("Nice!\n");
        } else {
            System.out.println("Keep practicing.\n");
        }
        }
    }
}


