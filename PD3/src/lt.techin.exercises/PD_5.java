package lt.techin.exercises;

public class PD_5 {
    public static void main(String[] args) {
        // int i double konvertavimas
        int sveikasSkaicius = 42;
        double doubleSkaicius = (double) sveikasSkaicius;

        // long i int konvertavimas
        long ilgasSkaicius = 123456789L;
        int intSkaicius = (int) ilgasSkaicius;

        // double i int konvertavimas su apvalinimu
        double doubleSkaicius2 = 3.14;
        int intSkaicius2 = (int) doubleSkaicius2;

        System.out.println("int i double: " + doubleSkaicius);
        System.out.println("long i int: " + intSkaicius);
        System.out.println("double i int (su apvalinimu): " + intSkaicius2);
    }

}
