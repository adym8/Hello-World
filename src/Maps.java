import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // map = reprezentare de data in sitem cheie valoare
        // ex: gigel are nota 10, costel are nota 9

        // delcaram un map
        Map<String,Integer> note_elevi = new HashMap<>();

        // adaugam elemente
        note_elevi.put("Gigel", 10);
        note_elevi.put("Costel", 9);
        note_elevi.put("Ana", 10);

        // aflu notele
        System.out.println(note_elevi.get("Ana"));

        // acutalizam valori
        note_elevi.replace("Costel", 10);
        System.out.println("Costel si-a marit nota la " + note_elevi.get("Costel"));

        // aflam dimensiunea
        System.out.println(note_elevi.size());

        // stergem valori
        note_elevi.remove("Gigel");
        System.out.println(note_elevi.get("Gigel"));

        // declara, si initializam cu valori
        // map nu este ordonat
        Map<String, Integer> luni = new HashMap<String, Integer>()
        {{
            put("Jan", 1);
            put("Feb", 2);
            put("Mar", 3);
        }};
        System.out.println(luni);
    }
}
