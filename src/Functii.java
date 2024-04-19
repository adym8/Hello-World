public class Functii {
    //functii = logica delimitata care poate fi refolosita
    // mu putem folosi spatii in nume
    // nu putem defini o functie in alta functie (nu pot instala firefox in chrome)

    // o functie simpla care ne rpinteza ceva pe ecran si nu returneaza nimic
    // nu ne da nici un raspuns
    // nu are paramentri
    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit!");

    }

    // o f care saluta clientul in f de numele lui
    // nu are return
    // nu are parametri
    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + " " + prenume);

    }

    // o f care calculeaza suma a 3 nr
    // ne da un raspuns - suma nr. va avea return
    // ce tip de date va avea raspunsul?
    // are nevoie de param
    public static int mediaNrNr(int a, int b, int c) {
        int media = (a + b + c) / 3;
        return media;

    // o f care ne da val lui pi
    // ne da un ras? da
    // ras va fi double
    // are nevoie de param? nu
    }

    public static void main(String[] args) {
        // intra clientul 1
        printGreeting(); // se apeleaza f

        // intra clientul 2
        printGreeting(); //CTRL + Click pe f => ne duce la corpul ei

        // apelam o f cu param, orefind argumente
        printGreetingByName("Sinpetrean", "Andy");
        printGreetingByName("Sinpetrean", "Crina");
        printGreetingByName("Sinpetrean", "Ares");

        System.out.println(mediaNrNr(3, 3, 4));


    }
}
