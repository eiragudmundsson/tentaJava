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

    public void cetLongestWord() {
        // split the current line

        // loop through array
        for (String word: this.currentLine.split(" ")) {
            System.out.println((word));
        }
        // count chars each word


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
}
