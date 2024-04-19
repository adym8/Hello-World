package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop

        // initiaizam obiecte de tip ContBancar
        // instante alse clasei ContBancar
        ContBancar cont1 = new ContBancar("Andy S", "R001");
        ContBancar cont2 = new ContBancar("Crina S", "R002");

        // apelam metoda descrie
        cont1.descriere();
        cont2.descriere();

        // activam conturile
    }
}
