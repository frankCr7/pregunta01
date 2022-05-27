package pregunta01;

public class Curso 
{
    private String nombre;

    private int creditos;

    private Matricula[] matricula;

    private int contador;

    public Curso(String nombre, int creditos) 
    {
        this.nombre = nombre;
        this.creditos = creditos;
        this.matricula = new Matricula[3];
        this.contador = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Matricula[] getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) 
    {
        this.matricula[this.contador++] = matricula;
    }

    
    

    
}
