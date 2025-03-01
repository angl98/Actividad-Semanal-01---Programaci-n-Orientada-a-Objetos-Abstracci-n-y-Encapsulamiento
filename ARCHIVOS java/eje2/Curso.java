
public class Curso {
  String nombre;
  String codigo;
  String catedratico;
  String facultad;
  Estudiantes [] listadoEstudiantes = new Estudiantes[2];
  Salon salon;
  int indice = 0; 

  public Curso(String nombre, String codigo, String catedratico){
    this.nombre = nombre;
    this.codigo = codigo;
    this.catedratico = catedratico;
  }

  void asignar(Estudiantes estudiante){
    listadoEstudiantes[indice] = estudiante;
    indice++;
  }

  void aprobar(){
  }

  void desasignar(){
  }
  
  void mostrarEstudiantes() {
    System.out.println("\nEstudiantes asignados al curso " + nombre + ":");
    for(int i = 0; i < indice; i++) {
      System.out.println("Estudiante: " + listadoEstudiantes[i].nombres + " " + listadoEstudiantes[i].apellidos + " - Carné: " + listadoEstudiantes[i].carne);
    }
  }
  
  public String toString(){
    return "Código: " + codigo + ", Nombre: " + nombre + ", Catedrático: " + catedratico;
  }
}
