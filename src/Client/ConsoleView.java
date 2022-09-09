package Client;

import java.util.Scanner;

public class ConsoleView  {
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    }

    public void set(String value) {
        System.out.println(value);

    }
}
