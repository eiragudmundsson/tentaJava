package myModule;
import java.util.ArrayList;

public class TextProcessor {
    private final ArrayList<String> rows;


    public TextProcessor() {
        this.rows = new ArrayList<String>();
    }

    public int countRows() {
        return this.rows.size();
    }

    public long countChars() {
        long temp = 0;
        for (String line: this.rows) {
            temp = temp + line.chars().count();
        }
        return temp;
    }

    public int countWords() {
        int temp = 0;
        for (String line:this.rows)
            temp = temp + line.split(" ").length;

        return temp;
    }

    public String getLongestWord() {
        String currentWord = "";

        // split the current line
        /**
         * [] hej
         * [] Hej Alla tre
         *
         * Hej
         * Hej , Alla
         */
        for (String line: this.rows){
            // current line. Get words through split
            String[] words = line.split(" ");

            // loop through words.
            for (String word: words) {
                //Get the longest word with count length
                if(word.length() > currentWord.length()) {
                    currentWord = word;
                }
            }
        }

        return currentWord;
    }

    public void addToRows(String input) {
        rows.add(input);
    }

    public boolean isStop(String input) {
        //incoming string need to compare with string stop
        String stopWord = "stop";

        return stopWord.equals(input);
    }

    public void displayInfo() {
        System.out.println("The longest word: " + this.getLongestWord());
        System.out.println("Amount of rows: " + this.countRows());
        System.out.println("Amount of chars: " + this.countChars());
        System.out.println("Amount of words: " + this.countWords());
    }
}
