package lt.techin.exercises;

import java.util.Scanner;

public class PD_5 {
    /*
     *Parasykite programa, kurioje yra naudojami vienos ir keliu eiluciu komentarai.
     *Parašykite programą, kuri paprašo vartotojo įvesti savo vardą, o po to atspausdina pranešimą
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Iveskite savo varda: ");
        String vardas = scanner.nextLine();
        //Rezultatas (ir pademonstruotas vienos eilutes komentaras)
        System.out.println("Sveiki, " + vardas + "!");
    }
}
