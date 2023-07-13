package conversormonedas;

import javax.swing.JOptionPane;

/**
 *
 * @author yoni2
 */
public class ConversorMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] valoresPosibles = {"Conversor de moneda", "Conversor de pesos"};

        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null,
                "Elige una opción", "Menú",
                JOptionPane.INFORMATION_MESSAGE, null,
                valoresPosibles, null);

        if (opcionSeleccionada == null) {
            // El usuario ha cerrado el cuadro de diálogo sin seleccionar una opción
            JOptionPane.showMessageDialog(null, "Programa Terminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0); // Salir del programa

        }

        if (opcionSeleccionada.equals("Conversor de moneda")) {
            opcionesCon();

        } else if (opcionSeleccionada.equals("Conversor de pesos")) {
            opcionesPeso();
        }

    }

    public static void conversor(double conversion, String moneda) {

        do {
            String cantidadString = JOptionPane.showInputDialog("Ingresa la cantidad que deseas convertir:");

            if (cantidadString == null) {
                // El usuario ha cerrado el cuadro de diálogo sin seleccionar una opción
                JOptionPane.showMessageDialog(null, "Programa Terminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0); // Salir del programa

            } else if (cantidadString.equals("")) {
                JOptionPane.showMessageDialog(null, "No agregaste cantidad, programa terminado.", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0); // Salir del programa
            } else if (esNumero(cantidadString)) {

            } else {
                JOptionPane.showMessageDialog(null, "La entrada debe ser un número válido, programa terminado.", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0); // Salir del programa
            }

            cantidadString = cantidadString.trim(); // Eliminar espacios en blanco alrededor

            double cantidad = Double.parseDouble(cantidadString);
            // Realizar el cálculo o la operación 
            double resultado = conversion * cantidad;
            String mensajeResultado = "El resultado es: " + resultado + " " + moneda;

            int opcion = JOptionPane.showOptionDialog(null, mensajeResultado, "Resultado",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, new Object[]{"OK", "Otra vez"}, "Cancelar");

            if (opcion == 1) {

                opcionesCon();
            } else {
                // El usuario ha seleccionado "OK" 
                JOptionPane.showMessageDialog(null, "Programa Terminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);

                break;
            }
        } while (true);

    }

    public static void opcionesCon() {

        //Conversion  x moneda a pesos
        double dolarAPesos = 16.90;
        double eurosAPesos = 18.83;
        double librasAPesos = 21.97;
        double yenJAPesos = 0.12;
        double wonCAPesos = 0.013;

        //Conversion pesos a x moneda
        double pesosADolar = 0.059;
        double pesosAEuros = 0.053;
        double pesosALibras = 0.046;
        double pesosAYenJ = 8.21;
        double pesosAWonC = 75.63;

        String[] monedasConversor = {"De Dólar a Pesos Mx", "De Euro a Pesos Mx", "De Libras a Pesos Mx",
            "De Yen a Pesos Mx", "De Won Coreano a Pesos Mx", "De Pesos Mx a Dólar", "De Pesos Mx a Euro", "De Pesos Mx a Libra",
            "De Pesos Mx a Yen", "De Pesos Mx a Won Coreano"};

        String opcionSeleMoneda = (String) JOptionPane.showInputDialog(null,
                "Elige una opción", "Menú",
                JOptionPane.INFORMATION_MESSAGE, null,
                monedasConversor, null);

        if (opcionSeleMoneda == null) {
            JOptionPane.showMessageDialog(null, "Programa Terminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0); // Salir del programa

        }

        switch (opcionSeleMoneda) {
            case "De Dólar a Pesos Mx":
                conversor(dolarAPesos, "Peso/s Mx");
                break;
            case "De Euro a Pesos Mx":
                conversor(eurosAPesos, "Peso/s Mx");
                break;
            case "De Libras a Pesos Mx":
                conversor(librasAPesos, "Peso/s Mx");
                break;
            case "De Yen a Pesos Mx":
                conversor(yenJAPesos, "Peso/s Mx");
                break;
            case "De Won Coreano a Pesos Mx":
                conversor(wonCAPesos, "Peso/s Mx");
                break;
            case "De Pesos Mx a Dólar":
                conversor(pesosADolar, "Dolar/es");
                break;
            case "De Pesos Mx a Euro":
                conversor(pesosAEuros, "Euro/s");
                break;
            case "De Pesos Mx a Libra":
                conversor(pesosALibras, "Libra/s");
                break;
            case "De Pesos Mx a Yen":
                conversor(pesosAYenJ, "Yen/es");
                break;
            case "De Pesos Mx a Won Coreano":
                conversor(pesosAWonC, "Won/es Coreano/s");
                break;
            default:
        }
    }

    public static void conversorPeso(double conversion, String peso) {

        do {
            String cantidadString = JOptionPane.showInputDialog("Ingresa la cantidad que deseas convertir:");

            if (cantidadString == null) {
                // El usuario ha cerrado el cuadro de diálogo sin seleccionar una opción
                JOptionPane.showMessageDialog(null, "Programa Terminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

                System.exit(0); // Salir del programa

            } else if (cantidadString.equals("")) {
                JOptionPane.showMessageDialog(null, "No agregaste cantidad, programa terminado.", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0); // Salir del programa
            } else if (esNumero(cantidadString)) {

            } else {
                JOptionPane.showMessageDialog(null, "La entrada debe ser un número válido, programa terminado.", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0); // Salir del programa
            }
            cantidadString = cantidadString.trim(); // Eliminar espacios en blanco alrededor

            double cantidad = Double.parseDouble(cantidadString);
            // Realizar el cálculo o la operación 
            double resultado = conversion * cantidad;

            String mensajeResultado = "El resultado es: " + resultado + " " + peso;

            int opcion = JOptionPane.showOptionDialog(null, mensajeResultado, "Resultado",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, new Object[]{"OK", "Otra vez"}, "Cancelar");

            if (opcion == 1) {
                opcionesPeso();
            } else {
                // El usuario ha seleccionado "OK" 
                JOptionPane.showMessageDialog(null, "Programa Terminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);

                break;
            }
        } while (true);

    }

    public static void opcionesPeso() {

        double kiloAGramos = 1000;
        double kiloALibra = 2.2046;
        double kiloAOnza = 35.274;
        double kiloATon = 0.001;

        double gramosAKilo = 0.001;
        double libraAKilo = 0.4535;
        double onzaAKilo = 0.028;
        double tonAKilo = 1000;

        String[] pesoConversor = {"De Kilo a Gramo", "De Kilo a Libra", "De Kilo a Onza",
            "De Kilo a Tonelada", "De Gramos a Kilo", "De Libra a Kilo", "De Onza a Kilo",
            "De Tonelada a Kilo"};

        String opcionSelePeso = (String) JOptionPane.showInputDialog(null,
                "Elige una opción", "Menú",
                JOptionPane.INFORMATION_MESSAGE, null,
                pesoConversor, null);

        if (opcionSelePeso == null) {
            JOptionPane.showMessageDialog(null, "Programa Terminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0); // Salir del programa

        }

        switch (opcionSelePeso) {
            case "De Kilo a Gramo":
                conversorPeso(kiloAGramos, "Gramo/s");
                break;
            case "De Kilo a Libra":
                conversorPeso(kiloALibra, "Libra/s");
                break;
            case "De Kilo a Onza":
                conversorPeso(kiloAOnza, "Onza/s");
                break;
            case "De Kilo a Tonelada":
                conversorPeso(kiloATon, "Tonelada/s");
                break;
            case "De Gramos a Kilo":
                conversorPeso(gramosAKilo, "Kilo/s");
                break;
            case "De Libra a Kilo":
                conversorPeso(libraAKilo, "Kilo/s");
                break;
            case "De Onza a Kilo":
                conversorPeso(onzaAKilo, "Kilo/s");
                break;
            case "De Tonelada a Kilo":
                conversorPeso(tonAKilo, "Kilo/s");
                break;
            default:
        }
    }

    public static boolean esNumero(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
