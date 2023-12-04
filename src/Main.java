import java.util.Random;

public class Main {
    public static void main(String[] args) {
        stampaNumeri();
    }

    public static void stampaNumeri() {

        Random random = new Random();
        int lunghezzaArray = 5;

        int[] numeriCasuali = new int[lunghezzaArray];

        for (int i = 0; i < lunghezzaArray; i++) {
            numeriCasuali[i] = random.nextInt(10) + 1;
        }

        System.out.print("Numeri casuali generati: ");
        for (int numero : numeriCasuali) {
            System.out.print(numero + " ");
        }
    }
}