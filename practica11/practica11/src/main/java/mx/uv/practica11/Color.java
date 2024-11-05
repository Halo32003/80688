package mx.uv.practica11;

public class Color {
    @Override
    public String toString() {
        return "Color [id=" + id + ", ValorColor=" + ValorColor + ", NombreColor=" + NombreColor + "]";
    }
    String id;
    String ValorColor;
    String NombreColor;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getValorColor() {
        return ValorColor;
    }
    public void setValorColor(String valorColor) {
        ValorColor = valorColor;
    }
    public String getNombreColor() {
        return NombreColor;
    }
    public void setNombreColor(String nombreColor) {
        NombreColor = nombreColor;
    }

}


