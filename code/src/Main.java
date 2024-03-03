import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bfn = new BufferedReader(
                new InputStreamReader(System.in));

        // String reading internally
        System.out.println("Wpisz String : ");
        String str = bfn.readLine();

        // Integer reading internally
        System.out.println("Wpisz Integer : ");
        int it = Integer.parseInt(bfn.readLine());

        // Printing String
        System.out.println("Wpisany String : " + str);

        // Printing Integer
        System.out.println("Wpisany Integer : " + it);
    }
}