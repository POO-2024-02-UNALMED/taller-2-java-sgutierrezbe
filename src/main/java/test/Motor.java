package test;

public class Motor {
    public int numeroCilindros;
    public int registro;
    public String tipo;

    public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }

    public int getRegistro() {
        return registro;
    }
}
