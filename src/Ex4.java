import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        List<Student>Studenti = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int optiun;
        do{
            System.out.println("1. Adaugare student\n2. Afisare detalii student\n3. Iesire\n---------------");
            System.out.print("Command: ");
            optiun = in.nextInt();
            if(optiun==1){
                in.nextLine();
                System.out.println("Nume: ");
                String nume = in.nextLine();
                System.out.println("Varsta: ");
                int varsta = in.nextInt();

                Student student = new Student(nume,varsta);
                Studenti.add(student);
            }
            if(optiun==2){
                in.nextLine();
                System.out.println("Introduceti numele unui student pentru a afisa detaliile: ");
                String search = in.nextLine();

                boolean gasit = false;
                for(Student e:Studenti)
                {
                    if(e.getNume().equals(search)) {
                        gasit = true;
                        System.out.println("Numele studentului: "+e.getNume()+"\nVarsta studentului: "+e.getVarsta());
                    }
                }
                if(gasit == false)
                    System.out.println("Studentul nu a fost gasit");
            }
            if(optiun==3)
                continue;
            else System.out.println("Nu exista comanda.");
        }while(optiun!=3);
    }
}
