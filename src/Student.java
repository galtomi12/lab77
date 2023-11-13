public class Student {
    private String Nume;
    private int Varsta;

    public Student (String Nume, int Varsta){
        this.Nume = Nume;
        this.Varsta = Varsta;

    }
    private void setNume(String studentnume)
    {
        Nume = studentnume;
    }
    public String getNume(){
        return Nume;
    }

    private void setVarsta(int studentvarsta){
        Varsta = studentvarsta;
    }
    public int getVarsta(){
        return Varsta;
    }
}
