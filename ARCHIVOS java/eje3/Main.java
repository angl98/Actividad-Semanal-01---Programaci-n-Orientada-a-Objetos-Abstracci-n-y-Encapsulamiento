import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Termometro termometro = new Termometro(25.0);

        System.out.println("=== Sistema de Control de Temperatura ===");
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Ver temperatura actual");
            System.out.println("2. Establecer nueva temperatura");
            System.out.println("3. Ver historial de temperaturas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarTemperaturaActual(termometro);
                    break;
                case 2:
                    establecerNuevaTemperatura(termometro, scanner);
                    break;
                case 3:
                    mostrarHistorial(termometro);
                    break;
                case 4:
                    salir = true;
                    System.out.println("BYE");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }
        }

        scanner.close();
    }

    public static void mostrarTemperaturaActual(Termometro termometro) {
        System.out.println("\nTemperatura actual:");
        System.out.println("Celsius: " + termometro.getTemperatura() + "°C");
        System.out.println("Fahrenheit: " + termometro.convertirAFahrenheit() + "°F");
        System.out.println("Kelvin: " + termometro.convertirAKelvin() + "K");
    }

    public static void establecerNuevaTemperatura(Termometro termometro, Scanner scanner) {
        System.out.println("Ingrese la nueva temperatura en Celsius: ");
        double nuevaTemp = scanner.nextDouble();
        termometro.setTemperatura(nuevaTemp);
        System.out.println("Temperatura actualizada correctamente.");
        mostrarTemperaturaActual(termometro);
    }

    public static void mostrarHistorial(Termometro termometro) {
        List<Temperatura> historial = termometro.getHistorial();

        if (historial.isEmpty()) {
            System.out.println("\nNo hay registros de temperatura.");
            return;
        }

        System.out.println("\nHistorial de temperaturas:");
        System.out.println("---------------------------");

        for (int i = 0; i < historial.size(); i++) {
            Temperatura temp = historial.get(i);
            System.out.println((i+1) + ". " + temp);
        }
    }
}