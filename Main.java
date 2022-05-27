package pregunta01;

public class Main 
{
    public static void main(String args[])
    {
        Estudiante estudiante = new Estudiante("Frank");
        Docente docente = new Docente("Rosario Rojas", 985632145);
        
        System.out.println("DOCENTE:  "+docente.getNombre());
        System.out.println("TELEFONO:  "+docente.getTelefono());

        Matricula matricula = new Matricula(27, "MAYO", 2022);
        matricula.setEstudiante(estudiante);

        

        Curso curso = new Curso("Programacion Orientada a Objetos", 4);
        Curso curso02 = new Curso("calculo III", 5);
        Curso curso03 = new Curso("base de datos", 4);
        System.out.println("nombre del curso: "+curso.getNombre());
        System.out.println("creditos: "+curso.getCreditos());
        System.out.println("nombre del curso: "+curso02.getNombre());
        System.out.println("creditos: "+curso02.getCreditos());
        System.out.println("nombre del curso: "+curso03.getNombre());
        System.out.println("creditos: "+curso03.getCreditos());
        curso.setMatricula(matricula);
        

        for(Matricula m: curso.getMatricula())
        {
            System.out.println("Dia de la matricula: "+m.getDia());
            System.out.println("Mes de la matricula: "+m.getMes());
            System.out.println("año de la matricula:  "+m.getAño());

            for(Estudiante e: m.getEstudiante())
            {
                System.out.println("Estudiante :"+e.getNombre());


            }

        }

    }
    
}
