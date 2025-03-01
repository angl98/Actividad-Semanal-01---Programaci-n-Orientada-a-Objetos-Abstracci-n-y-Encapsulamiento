import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Termometro {
    private double temperaturaCelsius;
    private List<Temperatura> historial;
    // Constructor
    public Termometro() {
        this.temperaturaCelsius = 0.0;
        this.historial = new ArrayList<>();
    }
    public Termometro(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
        this.historial = new ArrayList<>();
        registrarTemperaturaActual();
    }
    public double getTemperatura() {
        return temperaturaCelsius;
    }
    public void setTemperatura(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
        registrarTemperaturaActual();
    }
    public double convertirAFahrenheit() {
        return (temperaturaCelsius * 9/5) + 32;
    }
    public double convertirAKelvin() {
        return temperaturaCelsius + 273.15;
    }

    private void registrarTemperaturaActual() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaActual = formato.format(new Date());
        Temperatura temp = new Temperatura(this.temperaturaCelsius, fechaActual);
        historial.add(temp);
    }

    public List<Temperatura> getHistorial() {
        return historial;
    }

    public Temperatura getUltimaTemperatura() {
        if (historial.isEmpty()) {
            return null;
        }
        return historial.get(historial.size() - 1);
    }
}