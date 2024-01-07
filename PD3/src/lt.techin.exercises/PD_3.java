package lt.techin.exercises;

public class PD_3 {

    public static void main(String[] args) {

        float floatSkaicius1 = 0.1f;
        float floatSkaicius2 = 0.2f;
        double doubleSkaicius1 = 0.1;
        double doubleSkaicius2 = 0.2;

        float floatSuma = floatSkaicius1 + floatSkaicius2;
        float floatSkirtumas = floatSkaicius2 - floatSkaicius1;
        double doubleSuma = doubleSkaicius1 + doubleSkaicius2;
        double doubleSkirtumas = doubleSkaicius2 - doubleSkaicius1;

        System.out.println("Float suma: " + floatSuma);
        System.out.println("Float skirtumas: " + floatSkirtumas);
        System.out.println("Double suma: " + doubleSuma);
        System.out.println("Double skirtumas: " + doubleSkirtumas);
    }
}
