package semana3;

public class Plan extends Cliente{
    private int costo_mantencion;
    private int cantidad_clientes;
    
    public Plan(String nombre, String tipo_plan, int minutos, int monto, int costo_mantencion, int cantidad_clientes){
        super(nombre,tipo_plan, minutos, monto);
        this.costo_mantencion = costo_mantencion;
        this.cantidad_clientes = cantidad_clientes;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCosto Mantencion:                      "+costo_mantencion;
    }

    public int getCosto_mantencion() {
        return costo_mantencion;
    }
    public int getCantidad_clientes() {
        return cantidad_clientes;
    }
    
    public void setCosto_mantencion(int costo_mantencion) {
        this.costo_mantencion = costo_mantencion;
    }
    public void setCantidad_clientes(int cantidad_clientes) {
        this.cantidad_clientes = cantidad_clientes;
    }
    
    public int calculo(int minutos){
        if (this.costo_mantencion == 15000){
            int valor = (minutos * 80)+15000;
            return valor;
        }else{
            if (this.costo_mantencion == 7000){
                int valor = (minutos * 120)+7000;
                return valor;
            } 
        }
        return 0;
    }
}
