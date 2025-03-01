public class Temperatura {
    private double valorCelsius;
    private String fecha;

    // Constructor
    public Temperatura(double valorCelsius, String fecha) {
        this.valorCelsius = valorCelsius;
        this.fecha = fecha;
    }

    // Getters y setters
    public double getValorCelsius() {
        return valorCelsius;
    }

    public void setValorCelsius(double valorCelsius) {
        this.valorCelsius = valorCelsius;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double convertirAFahrenheit() {
        return (valorCelsius * 9/5) + 32;
    }

    public double convertirAKelvin() {
        return valorCelsius + 273.15;
    }

    public String toString() {
        return "Fecha: " + fecha + " | Celsius: " + valorCelsius + "°C" + " | Fahrenheit: " + convertirAFahrenheit() + "°F" + " | Kelvin: " + convertirAKelvin() + "K";
    }
}
