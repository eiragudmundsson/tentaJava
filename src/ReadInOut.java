import java.util.Scanner;

public class ReadInOut {

    public ReadInOut() {
        Scanner sc = new Scanner(System.in);
        TextProcessor tp = new TextProcessor();
        while (sc.hasNext()) {
            String x = sc.nextLine();
            if (tp.isStop(x)) {
                // display info before quit
                tp.displayInfo();
                break;
            }

            this.printMe(x);
            tp.addToRows(x);

        }
    }

    public void printMe(String input) {
        System.out.println(input);
    }
}
