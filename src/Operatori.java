/*
Recap:
variabile
tipuri de date: char, string,int, float/double, boolean

Operatori:
aritmetici: +, -, *, /, %
de comparare: <, >, ==, !=, >=, <=
logici: &&, || , !
 */


public class Operatori {
    public static void main(String[] args) {
     int a = 3; // o declarare && initializare
     int b = 5;
     a = b; // suprascriere
        System.out.println(a!=b); // 5 diferit de 5? => false
        System.out.println(a==b); // 5 egal cu 5? => true
        System.out.println(7>b && 8>b); //7>5 si 8>5? => true
        System.out.println(7>b && 3>b);
        System.out.println(7>b || 3>b); // 7>5 sau 3>5? => true
        System.out.println(7>b && (8>b || 3>b)); //true si true
        System.out.println(!(7>b)); // !true => false

    }
}
