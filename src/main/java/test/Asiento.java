package test;

public class Asiento {
    public String color;
    public double precio;
    public int registro;

    public void cambiarColor(String nuevoColor) {
        if (nuevoColor != null) {
            this.color = nuevoColor;
        }
    }

    public int getRegistro() {
        return registro;
    }
}