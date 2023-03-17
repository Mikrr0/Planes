package semana3;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class main{
    public static void main(String[] args) {
        int x = 0;
        String nombre;
        String plan;
        int tipo;
        int minutos = 0;
        int monto = 0;
        int costo_mantencion = 0;
        int cantidad_clientes = 0;
        int cantidad_p = 0;
        int cantidad_n = 0;
        List<Plan> lista = new ArrayList<Plan> ();
        while (x == 0){
            /*Ingreso nombre*/
            Scanner name = new Scanner(System.in);
            System.out.println("Ingrese su nombre:");
            nombre = name.next();
            /*Ingreso plan*/
            while (true){
                try{
                    System.out.println("Ingrese tipo plan\n[1]Plan Preferencial\n[2]Plan Normal");
                    Scanner tp = new Scanner(System.in);
                    tipo = tp.nextInt();
                    if (tipo == 1){
                        System.out.println("Ha seleccionado el Plan Preferencial");
                        plan = "Plan Preferencial";
                        costo_mantencion = 15000;
                        cantidad_p++;
                        break;
                    }
                    if (tipo == 2){
                        System.out.println("Ha seleccionado el Plan normal");
                        plan = "Plan Normal";
                        costo_mantencion = 7000;
                        cantidad_n++;
                        break;
                    }
                    else{
                     System.out.println("Ingrese una opcion valida");   
                    }
                }catch(Exception e){
                    System.out.println("Ha ingresado caracter no numerico");
                }
            }
            /*Ingreso minutos*/
            while (true){
                try{
                    System.out.println("Ingrese minutos");
                    Scanner min = new Scanner(System.in);
                    minutos = min.nextInt();
                    if (minutos>0){
                        break;
                    }
                    else{
                        System.out.println("Ha ingresado un numero menor o igual a 0");
                    }
                }catch(Exception e){
                    System.out.println("Ha ingresado una letra");
                }  
            }
            /*Almacenamiento datos y muestra*/
            Plan persona_ = new Plan(nombre, plan, minutos, monto, costo_mantencion, cantidad_clientes);
            int monto_total = persona_.calculo(minutos);
            Plan persona = new Plan(nombre, plan, minutos, monto_total, costo_mantencion, cantidad_clientes);
            int index = lista.size();
            lista.add(index, persona);
            // Imprimir todos los objetos en la lista
            for (int i = 0; i < lista.size(); i++) {
                Plan planes = lista.get(i);
                System.out.println("-----------------------------------");
                System.out.println("Nombre:           " + planes.getNombre());
                System.out.println("Plan:             " + planes.getTipo_plan());
                System.out.println("Minutos:          " + planes.getMinutos());
                System.out.println("Monto Total:      " + planes.getMonto());
                System.out.println("Costo Mantencion: " + planes.getCosto_mantencion());
            }
            while(true){
                try{
                    System.out.println("   PRESIONE [0] PARA CONTINUAR\npresione cualquier numero para salir");
                    Scanner opcion = new Scanner(System.in);
                    x = opcion.nextInt();
                    break;     
                }catch(Exception e){
                    System.out.println("Ha ingresado una letra");
                }
            }    
        }
        System.out.println("Cantidad Clientes Preferenciales:      "+cantidad_p);
        System.out.println("Cantidad Clientes Normales:            "+cantidad_n);   
    }  
}
