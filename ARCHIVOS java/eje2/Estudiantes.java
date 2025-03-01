
public class Estudiantes {
  //caracteristicas
  String nombres;
  String apellidos;
  int edad;
  char sexo;
  String carne;
  Curso [] cursosAsignados= new Curso[5];
  int indice;

  public Estudiantes(String nombres, String apellidos, char sexo, String carne, int edad){
    System.out.println("Estudiantes");
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.edad = edad;
    this.sexo = sexo;
    this.carne = carne;
    this.indice = 0;
  }

  //comportamientos
  void aprender() {
    System.out.println(nombres + " esta aprendiendo");
  }
  void programar() {
    System.out.println(nombres + " esta programando");
  }
  void asignar(Curso curso) {
    curso.asignar(this);
    cursosAsignados[indice] = curso;
    indice++;
  }

  void mostrarCursosAsignados() {
    System.out.println("Cursos asignados a " + nombres + " " + apellidos + ":");
    for(int i = 0; i < indice; i++) {
      System.out.println(cursosAsignados[i].toString());
    }
  }
}
