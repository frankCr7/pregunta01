package pregunta01;

public class Docente 
{
    private String nombre;
    private int telefono;
    private Curso[] curso;
    private int contador;
    
    public Docente(String nombre, int telefono) 
    {
        this.nombre = nombre;
        this.telefono = telefono;
        this.curso = new Curso[2];
        this.contador = 0;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Curso[] getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso[this.contador++] = curso;
    }

    
    
}
