import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadInOut r = new ReadInOut(sc);

        while(sc.hasNext()) {
            r.printMe();
        }

    }
}
