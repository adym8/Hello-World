import java.util.ArrayList;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // delcaram o lista goala
        List<String> fructe = new ArrayList<>();
        // au o dimensiune dinamica

        // adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        // cum se iau elemente
        System.out.println(fructe.get(0));
        System.out.println(fructe.get(4));

        // cum se alfa indexul unui elem
        System.out.println(fructe.indexOf("banana"));

        // este lista goala?
        System.out.println(fructe.isEmpty());

        if (!fructe.isEmpty()) { // daca Nu este goala
            System.out.println("tinem ore");
        } else {
            System.out.println("nu tinem ore");
        }
    }
}
