import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        while (opcion != 7){
            System.out.println("************************\n"+
                    "Bienvenidos Al conversor de monedas\n\n"+
                    "1. Dolar --> Peso argentino\n"+
                    "2. Peso Argentino --> Dolar\n"+
                    "3. Dolar --> Real brasilero\n"+
                    "4. Real Brasilero --> Dolar\n"+
                    "5. Dolar --> Peso colombiano\n"+
                    "6. Peso colombiano --> Dolar\n"+
                    "7. Salir");
            opcion= lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD","ARS",consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta,lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL",consulta,lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD",consulta,lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","COP",consulta,lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP","USD",consulta,lectura);
                    break;
            }
        }
    }
}
