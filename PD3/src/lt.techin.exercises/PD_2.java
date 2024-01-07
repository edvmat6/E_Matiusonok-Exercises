package lt.techin.exercises;

public class PD_2 {

    public static void main(String[] args) {

        byte pirmasByte = 50;
        short antrasShort = 1000;

        int suma = pirmasByte + antrasShort;
        int skirtumas = antrasShort - pirmasByte;
        long sandauga = (long) pirmasByte * antrasShort;
        double dalmuo = (double) antrasShort / pirmasByte;

        System.out.println("Suma: " + suma);
        System.out.println("Skirtumas: " + skirtumas);
        System.out.println("Sandauga: " + sandauga);
        System.out.println("Dalmuo: " + dalmuo);
    }
}
