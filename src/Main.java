import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creare un ArrayList con 12 elementi e stamparlo in console
        ArrayList<String> studenti = new ArrayList<>();

        studenti.add(String.valueOf(new Student("Ana", 26)));
        studenti.add(String.valueOf(new Student("Marco", 25)));
        studenti.add(String.valueOf(new Student("Luca", 32)));
        studenti.add(String.valueOf(new Student("Francesco", 23)));
        studenti.add(String.valueOf(new Student("Andrea", 28)));
        studenti.add(String.valueOf(new Student("Sara", 30)));
        studenti.add(String.valueOf(new Student("Vincenzo", 33)));
        studenti.add(String.valueOf(new Student("Mario", 31)));
        studenti.add(String.valueOf(new Student("Lucia", 34)));
        studenti.add(String.valueOf(new Student("Vanessa", 40)));
        studenti.add(String.valueOf(new Student("Maria", 24)));
        studenti.add(String.valueOf(new Student("Franca", 27)));

        System.out.println("Lista studenti: " + studenti);

        //mettere in ordine la collezione e stampare il risultato
        //ordine alfabetico
        studenti.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("Lista in ordine alfabetico: " + studenti);
    }
}