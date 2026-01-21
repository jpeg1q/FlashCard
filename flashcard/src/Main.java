public class Main {
    public static void main(String[] args) {
        String term = "pala\nrastrillo\ncanasta\nbanco\nhule\nmacetero\nregalera\ninvernadero\nrespaldar";
        String answ = "shovel\npitchfork\nbasket\nstool\nrubber\npot\nwatering can\ngreenhouse\nto support";
        String[] terms = term.split("\n");
        String[] answers = answ.split("\n");
        Flashcard card =  new Flashcard();
        card.add(terms, answers);
        card.PrintTnA();
        card.getTerms();
        System.out.println();
        System.out.println();
        System.out.println();
        card.getAnswers();
    }
}