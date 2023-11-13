import java.util.ArrayList;
import java.util.Collections;

public class Ex1 {

    public static void main(String[] args) {
        ArrayList<String> studenti = new ArrayList<String>();
        studenti.add("Elena");
        studenti.add("Vlad");
        studenti.add("Marcus");
        studenti.add("Maria");
        studenti.add("George");
        System.out.println(studenti);

        System.out.println("Accesarea: ");
        System.out.println(studenti.get(2));
        System.out.println(studenti.get(4));

        studenti.remove(2);
        studenti.remove(3);
        System.out.println(studenti);


        Collections.sort(studenti);
        System.out.println("Lista dupa sortare: ");
        System.out.println(studenti);
    }
}
