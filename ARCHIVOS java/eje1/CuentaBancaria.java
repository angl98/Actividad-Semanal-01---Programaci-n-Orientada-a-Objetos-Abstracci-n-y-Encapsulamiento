
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("No se permite un saldo inicial negativo. Se ha establecido el saldo en 0.");
        }
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito realizado con éxito. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= this.saldo) {
                this.saldo -= monto;
                System.out.println("Retiro realizado con éxito. Nuevo saldo: " + this.saldo);
            } else {
                System.out.println("Saldo insuficiente para realizar el retiro.");
            }
        } else {
            System.out.println("El monto a retirar debe ser mayor que cero.");
        }
    }

    public double verSaldo() {
        return this.saldo;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }
}
