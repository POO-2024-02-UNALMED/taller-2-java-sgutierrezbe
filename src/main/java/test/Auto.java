package test;

public class Auto {
    static int cantidadCreados = 0;
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;

    public Auto() {
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
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.registro != this.registro) {
                return "Las piezas no son originales";
            }
        }
        if (this.motor.registro != this.registro) {
            return "Las piezas no son originales";
        }
        return "Auto original";
    }
}