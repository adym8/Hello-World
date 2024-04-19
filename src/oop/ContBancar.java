package oop;

public class ContBancar {
    // prg files = definim logica unui cont bancar

    // oop = object oriented programing
    // poo = prog orientanta pe obiecte

    // o clasa = este un tip nou
    // este def unui concept
    // reteta la paste carbonara
    // ex: clasa Car

    // un obiect = instanta unei clase
    // paste carbonara
    // ex: obiect de tip Car

    // fields = proprietati = atribute
    // variabile
    // ex: culoare, marca, model, consum, pret

    // metode - actiuni ce pot fi facute de obiecte
    // functii
    // ex: accelereaza(), franeaza(), deschide usa(), vopsire()

    // proprietatile
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;

    // constructor = are rolul de a impune date de start
    // ca si * din formulare, required field
    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    // metode
    public void descriere(){
        System.out.println("Titular " + this.titularCont);
        System.out.println("IBAN " + this.iban);
        System.out.println("Sold " + this.sold);
        System.out.println("Activ " + this.activ);
    }

    public void activareCont() {
        //modifica activ in true doar daca pinul e corect

    }
}
