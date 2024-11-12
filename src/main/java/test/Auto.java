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
        synchronized (Auto.class) {
            cantidadCreados++;
        }
    }

    public Auto() {
        synchronized (Auto.class) {
            cantidadCreados++;
        }
    }

    public int cantidadAsientos() {
        int count = 0;
        if (asientos != null) {
            for (Asiento asiento : asientos) {
                if (asiento != null) {
                    count++;
                }
            }
        }
        return count;
    }

    public String verificarIntegridad() {
        int registroAsiento = -1;
        if (asientos != null) {
            for (Asiento asiento : asientos) {
                if (asiento != null) {
                    if (registroAsiento == -1) {
                        registroAsiento = asiento.getRegistro();
                    } else if (registroAsiento != asiento.getRegistro()) {
                        return "Las piezas no son originales";
                    }
                }
            }
        }
        if (motor != null && registroAsiento == this.registro && this.registro == this.motor.getRegistro()) {
            return "Auto original";
        } else {
            return "Las piezas no son originales";
        }
    }

    // Getters and setters for private attributes
    public static int getCantidadCreados() {
        return cantidadCreados;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Asiento[] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[] asientos) {
        this.asientos = asientos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
} 