import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaAConvertir,  ConsultarMoneda buscarMoneda, Scanner lectura) {

        double cantidad;
        double cantidadConvertida;

        Moneda monedas = buscarMoneda.buscarMoneda(monedaBase, monedaAConvertir);
        System.out.println("Ingrese la cantidad de "+ monedaBase + " a convertir");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        DecimalFormat formato = new DecimalFormat("0.00000");
        String cantidadFormateada = formato.format(cantidadConvertida);
        System.out.println("La conversion final es: " + cantidadFormateada + " " +monedaAConvertir);

    }
}
