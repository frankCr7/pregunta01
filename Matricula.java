package pregunta01;

public class Matricula 
{
    private int dia;
    private String mes;

    private int año;

    private Estudiante[] estudiante;

    private int contador;

    public Matricula(int dia, String mes, int año) {
        this.dia = dia;
        this.setMes(mes);
        this.año = año;
        this.estudiante = new Estudiante[2];
        this.contador = 0;
    }

    

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Estudiante[] getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante[this.contador++] = estudiante;
    }
    
    

    
    
}
