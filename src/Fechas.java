import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera fecha como DD/MM/AAAA");
        String fecha1 = sc.nextLine();
        int dia1 = Integer.parseInt(fecha1.substring(0, 2));
        int mes1 = Integer.parseInt(fecha1.substring(3, 5));
        int anio1 = Integer.parseInt(fecha1.substring(6, 10));
        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");
        String fecha2 = sc.nextLine();
        int dia2 = Integer.parseInt(fecha2.substring(0, 2));
        int mes2 = Integer.parseInt(fecha2.substring(3, 5));
        int anio2 = Integer.parseInt(fecha2.substring(6, 10));
         if (anio1 < anio2) {
            System.out.println("persona 2 es mayor");
        } else if (anio1 > anio2) {
            System.out.println("persona 1 es mayor");
        } else {
            if (mes1 < mes2)
                System.out.println("persona 2 es mayor");
            else if (mes1 > mes2)
                System.out.println("persona 1 es mayor");
            else {
                if (dia1 < dia2)
                    System.out.println("persona 2 es mayor");
                else if (dia1 > dia2)
                    System.out.println("persona 1 es mayor");
                else
                    System.out.println("Tienen la misma edad");
            }
        }
    }
}
