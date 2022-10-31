import java.util.Scanner;

public class ReadInOut {

    public ReadInOut() {
        Scanner sc = new Scanner(System.in);
        TextProcessor tp = new TextProcessor();
        String empty = "";
        while (sc.hasNext()) {
            String x = sc.nextLine();
            if (!x.equals(empty)) {
                if (tp.isStop(x)) {
                    // display info before quit
                    // ...
                    break;

                }

                this.printMe(x);
                tp.addToRows(x);
            }
        }
    }

    public void printMe(String input) {
        System.out.println(input);
    }
}
