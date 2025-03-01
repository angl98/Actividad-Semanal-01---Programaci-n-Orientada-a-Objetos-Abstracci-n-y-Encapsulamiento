
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Solicitar datos para crear la cuenta
    System.out.print("Ingrese el número de cuenta: ");
    String numeroCuenta = scanner.nextLine();
    
    System.out.print("Ingrese el saldo inicial: ");
    double saldoInicial = scanner.nextDouble();
    
    // Crear una cuenta bancaria
    CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldoInicial);
    
    // Mostrar información inicial
    System.out.println("\nCuenta: " + cuenta.getNumeroCuenta());
    System.out.println("Saldo inicial: " + cuenta.verSaldo());
    
    int opcion = 0;
    do {
      // Menú de opciones
      System.out.println("\n--- MENÚ ---");
      System.out.println("1. Depositar");
      System.out.println("2. Retirar");
      System.out.println("3. Ver saldo");
      System.out.println("4. Salir");
      System.out.print("Seleccione una opción: ");
      
      opcion = scanner.nextInt();
      
      switch (opcion) {
        case 1:
          System.out.print("Ingrese el monto a depositar: ");
          double montoDeposito = scanner.nextDouble();
          cuenta.depositar(montoDeposito);
          break;
        case 2:
          System.out.print("Ingrese el monto a retirar: ");
          double montoRetiro = scanner.nextDouble();
          cuenta.retirar(montoRetiro);
          break;
        case 3:
          System.out.println("Saldo actual: " + cuenta.verSaldo());
          break;
        case 4:
          System.out.println("Gracias por utilizar nuestro servicio");
          break;
        default:
          System.out.println("Opción no válida");
      }
      
    } while (opcion != 4);
    
    scanner.close();
  }

  // ¿Qué atributos debería tener la clase? R: porque numeroCuenta y saldo son tipo string y saldo es tipo double
  
  // ¿Cómo se asegura que el saldo no se vuelva negativo? R: porque si el saldo es negativo, se le resta el saldo inicial y ademas el constructor de cuenta bancaria no permite saldos negativos.
  
}