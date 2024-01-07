package lt.techin.exercises;

public class PD_4 {

    public static void main(String[] args) {
        boolean tiesa = true;
        boolean melas = false;

        boolean rezultatas1 = tiesa && melas; // AND (ir)
        boolean rezultatas2 = tiesa || melas; // OR (arba)
        boolean rezultatas3 = !tiesa;         // NOT (ne)

        System.out.println("tiesa && melas (AND): " + rezultatas1);
        System.out.println("tiesa || melas (OR): " + rezultatas2);
        System.out.println("!tiesa (NOT): " + rezultatas3);
    }
}
