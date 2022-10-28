import java.util.Scanner;

public class ReadInOut {

    private final Scanner sc;
    public ReadInOut (Scanner sc) {
        this.sc = sc;
    }

    public void printMe () {
        String text = this.sc.nextLine();
        if (!text.equals("")) {
            System.out.println(text);
        }
    }
}
