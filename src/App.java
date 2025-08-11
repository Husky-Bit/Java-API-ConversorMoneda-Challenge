import java.util.Scanner;  // Importa Scanner para leer la entrada del usuario

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);  // Crea un objeto Scanner para leer datos del usuario desde consola
        ConsultaMoneda consulta = new ConsultaMoneda();  // Crea una instancia de ConsultaMoneda para obtener las tasas
        int opcionUsuario = 0;  // Variable para guardar la opcion elegida por el usuario

        // Bucle que se repite hasta que el usuario elija salir (7)
        while (opcionUsuario != 7) {
            // Menu
            System.out.println("\n#####################################");
            System.out.println("Sea bienvenido al Conversor de Moneda");
            System.out.println("1) Dolar >>> Peso Argentino");
            System.out.println("2) Peso Argentino >>> Dolar");
            System.out.println("3) Dolar >>> Real Brasileño");
            System.out.println("4) Real Brasileño >>> Dolar");
            System.out.println("5) Dolar >>> Peso Colombiano");
            System.out.println("6) Peso Colombiano >>> Dolar");
            System.out.println("7) Salir");
            System.out.println("Elija una opcion valida: ");

            opcionUsuario = lectura.nextInt();  // Lee la opcion que ingreso el usuario

            // Segun la opcion, se ejecuta un bloque para hacer la conversion elegida
            switch (opcionUsuario) {
                case 1 -> {  // USD a ARS
                    System.out.println("Ingrese el monto en USD: ");
                    double monto = lectura.nextDouble();  // Lee el monto a convertir
                    Moneda datos = consulta.buscaValor("USD");  // Obtiene las tasas desde la API para USD
                    double tasa = datos.conversion_rates().ARS();  // Obtiene la tasa de ARS a USD
                    double resultado = monto * tasa;  // Calcula el monto convertido
                    System.out.println("El valor " + monto + " [USD] corresponde a " + resultado + " [ARS]\n");
                }
                case 2 -> {  // ARS a USD
                    System.out.print("Ingrese el monto en ARS: ");
                    double monto = lectura.nextDouble();
                    Moneda datos = consulta.buscaValor("ARS");
                    double tasa = datos.conversion_rates().USD();
                    double resultado = monto * tasa;
                    System.out.println("El valor " + monto + " [ARS] corresponde a " + resultado + " [USD]\n");

                }
                case 3 -> {  // USD a BRL
                    System.out.print("Ingrese el monto en USD: ");
                    double monto = lectura.nextDouble();
                    Moneda datos = consulta.buscaValor("USD");
                    double tasa = datos.conversion_rates().BRL();
                    double resultado = monto * tasa;
                    System.out.println("El valor " + monto + " [USD] corresponde a " + resultado + " [BRL]\n");

                }
                case 4 -> {  // BRL a USD
                    System.out.print("Ingrese el monto en BRL: ");
                    double monto = lectura.nextDouble();
                    Moneda datos = consulta.buscaValor("BRL");
                    double tasa = datos.conversion_rates().USD();
                    double resultado = monto * tasa;
                    System.out.println("El valor " + monto + " [BRL] corresponde a " + resultado + " [USD]\n");
                }
                case 5 -> {  // USD a COP
                    System.out.print("Ingrese el monto en USD: ");
                    double monto = lectura.nextDouble();
                    Moneda datos = consulta.buscaValor("USD");
                    double tasa = datos.conversion_rates().COP();
                    double resultado = monto * tasa;
                    System.out.println("El valor " + monto +  " [USD] corresponde a " + resultado + " [COP]\n");
                }
                case 6 -> {  // COP a USD
                    System.out.print("Ingrese el monto en COP: ");
                    double monto = lectura.nextDouble();
                    Moneda datos = consulta.buscaValor("COP");
                    double tasa = datos.conversion_rates().USD();
                    double resultado = monto * tasa;
                    System.out.println("El valor " + monto +  " [COP] corresponde a " + resultado + " [USD]\n");
                    
                }
                case 7 -> System.out.println("Saliendo del programa..."); 
                default -> System.out.println("Opción inválida, intente de nuevo.");  // Mensaje para opcion no valida
            }
        }

        lectura.close();  // Cierra el Scanner para liberar recursos
    }
}


