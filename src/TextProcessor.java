import java.util.ArrayList;

public class TextProcessor {
    private final ArrayList<String> rows;
    private String currentLine;

    private String longestWord;

    public TextProcessor() {
        this.rows = new ArrayList<String>();
    }

    public int countLength() {
        return this.rows.size();
    }

    public long countChars() {
        return this.currentLine.chars().count();
    }

    public int countWords() {
        return this.currentLine.split(" ").length;
    }

    public void getLongestWord() {
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

        System.out.println(currentWord);
    }

    public void addToRows(String input) {
        rows.add(input);
    }

    public boolean isStop(String input) {
        //incoming string need to compare with string stop
        String stopWord = "stop";

        if (stopWord.equals(input)){
            return true;
        }
        return false;
    }

    public void displayInfo() {
        this.getLongestWord();
    }
}
