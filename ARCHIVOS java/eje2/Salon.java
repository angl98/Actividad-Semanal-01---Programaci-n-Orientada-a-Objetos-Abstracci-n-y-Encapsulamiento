
public class Salon {
  int capacidad;
  String ubicacion;
  int numero;
  Curso cursoAsignado;

  public Salon(int capacidad, String ubicacion, int numero){
    this.capacidad = capacidad;
    this.ubicacion = ubicacion;
    this.numero = numero;
  }

  void asignarCurso(Curso curso){
    this.cursoAsignado = curso;
    System.out.println("Salon " + numero + " asignado al curso " + curso.nombre);
  }

  public String toString(){
    String cursoInfo = cursoAsignado == null ? "No hay curso asignado" : "Curso asignado: " + cursoAsignado.nombre + " - " + cursoAsignado.codigo;
    return "Salon " + numero + " - Ubicación: " + ubicacion + ", Capacidad: " + capacidad + "\n" + cursoInfo;
  }
}
