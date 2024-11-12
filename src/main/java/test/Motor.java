package test;

public class Motor {
    private int cilindros;
    private String tipo;
    private int registro;

    public Motor(int cilindros, String tipo, int registro) {
        this.cilindros = cilindros;
        this.tipo = tipo;
        this.registro = registro;
    }

    public Motor() {
        // Default constructor
    }

    public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }

    public void asignarTipo(String nuevoTipo) {
        if (nuevoTipo != null && (nuevoTipo.equals("gasolina") || nuevoTipo.equals("electrico"))) {
            this.tipo = nuevoTipo;
        }
    }

    // Getters and setters for private attributes
    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
}