public class Variabile {
    public static void main(String[] args) {
        // declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        System.out.println("Am cumparat o masina marca: "+ marcaMasina);
        System.out.println("Este modelul: "+ modelMasina);

        // suprascriere
        modelMasina = "XC 60 facelift";
        System.out.println("Am cumparat o masina marca: "+ marcaMasina);
        System.out.println("Este modelul: "+ modelMasina);

        // declarare
        String nume;
        String prenume;
        // initializare
        prenume = "Andy";
        nume = "Sinpetrea";
        int varsta = 34;
        // concatenare de stringuri
        System.out.println(prenume + " " + nume + " cu varsta de " + varsta);


    }
}
