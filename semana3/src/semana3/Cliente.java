package semana3;

public class Cliente {
    private String nombre;
    private String tipo_plan;
    private int minutos;
    private int monto;
    
    public Cliente(String nombre, String tipo_plan, int minutos, int monto){
        this.nombre = nombre;
        this.tipo_plan = tipo_plan;
        this.minutos = minutos;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "\nNombre:                                "+nombre+"\nTipo Plan:                             "+tipo_plan+"\nMinutos:                               "+minutos+"\nMontos:                                "+monto;
    }

    
    public String getNombre() {
        return nombre;
    } 
    public String getTipo_plan() {
        return tipo_plan;
    }
    public int getMinutos() {
        return minutos;
    }
    public int getMonto() {
        return monto;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo_plan(String tipo_plan) {
        this.tipo_plan = tipo_plan;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public void setMonto(int monto) {
        this.monto = monto;
    }
}
