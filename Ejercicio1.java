package emc;

public class Ejercicio1 
{
    private String horas;
    private double costo;
    private Docente docente;
    private Estudiante estudiante;
    private String institucion;
    
    Curso(String horas, double costo, String inst)
    {
      setHoras(horas);
      setCosto(costo);
      setInstitución(inst);
    }

    void setHoras(String horas)
    {
        this.horas= horas;
    }

    String getHoras()
    {
      return horas;
    }
    void setCosto(double costo)
    {
        this.costo= costo;
    }

    double getCosto()
    {
      return costo;
    }
    void setDocente(Docente docente)
    {
        this.docente= docente;
    }

    Docente getDocente()
    {
      return docente;
    }
    
    void setEstudiante(Estudiante estudiante)
    {
        this.estudiante= estudiante;
    }

    Estudiante getEstudiante()
    {
      return estudiante;
    }
    void setInstitución(String inst)
    {
        institucion=inst;
    }

    String getInstitucion()
    {
        return institucion;
    }
}
package Clase12;

public class Docente {

    private String nombre;

    private String apellido;

    Docente(String nombre, String apell)
{
    setNombre(nombre);
    setApellido(apell);
  
    
    
}
    void setNombre(String nombre)
    {
        this.nombre= nombre;
    }

    String getNombres()
    {
      return nombre;
    }

    void setApellido(String apell)
    {
        apellido = apell;
    }
    String getApellido()
    {
        return apellido;
    }
   
}
package Clase12;

public class Estudiante 
{
    private String nombres;

    private int codigoAlum;



    Estudiante(String nombres, int cod)
{
    setNombre(nombres);
    setCodigo(cod);
    
}
    void setNombre(String nombres)
    {
        this.nombres= nombres;
    }

    String getNombres()
    {
      return nombres;
    }

    void setCodigo(int cod)
    {
        codigoAlum=cod;
    }
    int getCodigo()
    {
        return codigoAlum;
    }
    
}
package Clase12;

public class Main 
{
        public static void main(String args[])
        {
            Curso curso = new Curso("2h 30min",128.4,"colegio Max Plack");
    
            System.out.println(curso.getHoras());
            System.out.println(curso.getCosto());
            System.out.println(curso.getInstitucion());
           
    
            curso.setDocente(new Docente("Jose", "Martinez"));
            System.out.println("nombre del docente: "+curso.getDocente().getNombres());
            System.out.println("apellido del docente; "+curso.getDocente().getApellido());

            curso.setEstudiante(new Estudiante("Alonso", 12345678));
            System.out.println("nombre del alumno: "+curso.getEstudiante().getNombres());
            System.out.println("codigo del alumno: "+curso.getEstudiante().getCodigo());
           
        }
        
}