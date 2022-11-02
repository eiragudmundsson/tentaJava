package testFiles;

import myModule.TextProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {

    @Test
    void countRows() {
        TextProcessor tp = new TextProcessor();
        tp.addToRows("Hello");
        tp.addToRows("Hello1");

        int expected = tp.countRows();
        int actual = 2;

        assertEquals(expected, actual);

    }

    @Test
    void isStop() {
        TextProcessor tp = new TextProcessor();

        boolean expected = tp.isStop("stop");
        boolean actual = true;
        assertEquals(expected, actual);

        boolean expected2 = tp.isStop("stoP");
        boolean actual2 = true;
        assertEquals(expected2, actual2);

        boolean expected3 = tp.isStop("Hello");
        boolean actual3 = false;
        assertEquals(expected3, actual3);
    }

    @Test
    void countWords() {
        TextProcessor tp = new TextProcessor();

        tp.addToRows("Hello");
        tp.addToRows("Hello1");

        int expected = tp.countWords();
        int actual = 2;

        assertEquals(expected, actual);


        tp.addToRows("Hello world");
        tp.addToRows("Hello1");
        tp.addToRows("Hello2");

        int expected2 = tp.countWords();
        int actual2 = 6;

        assertEquals(expected2, actual2);
    }
}