// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    // Crear salones
    Salon salon1 = new Salon(30, "Edificio 1, 2do Nivel", 201);
    Salon salon2 = new Salon(25, "Edificio 1, 2do Nivel", 202);

    Estudiantes estudiante1 = new Estudiantes("Jonathan", "Garcia", 'M', "75-90-12476", 20);
    Estudiantes estudiante2 = new Estudiantes("Hilda", "Perez", 'F', "75-90-12477", 19);

    Curso curso1 = new Curso("Programacion 1", "12", "Miguel Catalan");
    Curso curso2 = new Curso("Fisica", "8", "David Mux");

    

    /*estudiante1.nombres = "Jonathan";
    estudiante1.apellidos = "Garcia";
    estudiante1.carne= "75-90-12476";
    estudiante1.sexo= 'M';
    estudiante1.edad= 20;*/ 
    
   // estudiante2.nombres = "Hilda";

    estudiante1.programar();
    estudiante2.aprender();

    estudiante1.asignar(curso1);
    estudiante2.asignar(curso1);
    estudiante1.asignar(curso2);
    
    // Asignar salones a los cursos
    salon1.asignarCurso(curso1);
    salon2.asignarCurso(curso2);
    
    estudiante1.mostrarCursosAsignados();
    curso1.mostrarEstudiantes();
    curso2.mostrarEstudiantes();
    
    // Mostrar información de salones y sus cursos asignados
    System.out.println("\nInformación de salones y cursos asignados:");
    System.out.println(salon1.toString());
    System.out.println(salon2.toString());
}
}