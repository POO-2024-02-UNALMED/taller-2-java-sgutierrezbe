package test;
public class Auto {
    private static int cantidadCreados = 0;
    private String modelo;
    private double precio;
    private Asiento[] asientos;
    private String marca;
    private Motor motor;
    private int registro;

    public Auto(String modelo, double precio, Asiento[] asientos, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        cantidadCreados++;
    }

    public int cantidadAsientos() {
        int count = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                count++;
            }
        }
        return count;
    }

    public String verificarIntegridad() {
        int registroAsiento = -1;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                if (registroAsiento == -1) {
                    registroAsiento = asiento.getRegistro();
                } else if (registroAsiento != asiento.getRegistro()) {
                    return "Las piezas no son originales";
                }
            }
        }
        if (registroAsiento == this.registro && this.registro == this.motor.getRegistro()) {
            return "Auto original";
        } else {
            return "Las piezas no son originales";
        }
    }

    public static int getCantidadCreados() {
        return cantidadCreados;
    }
}

class Motor {
    private int cilindros;
    private String tipo;
    private int registro;

    public Motor(int cilindros, String tipo, int registro) {
        this.cilindros = cilindros;
        this.tipo = tipo;
        this.registro = registro;
    }

    public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }

    public void asignarTipo(String nuevoTipo) {
        if (nuevoTipo.equals("gasolina") || nuevoTipo.equals("electrico")) {
            this.tipo = nuevoTipo;
        }
    }

    public int getRegistro() {
        return registro;
    }
}

class Asiento {
    private String color;
    private double precio;
    private int registro;

    public Asiento(String color, double precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }

    public void cambiarColor(String nuevoColor) {
        if (nuevoColor.equals("rojo") || nuevoColor.equals("verde") || nuevoColor.equals("amarillo") || nuevoColor.equals("negro") || nuevoColor.equals("blanco")) {
            this.color = nuevoColor;
        }
    }

    public int getRegistro() {
        return registro;
    }
}