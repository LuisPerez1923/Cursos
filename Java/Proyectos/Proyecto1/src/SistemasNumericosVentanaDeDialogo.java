import javax.swing.*;

public class SistemasNumericosVentanaDeDialogo {
    public static void main(String[] args) {

        String numeroString = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        /*JOptionPane.showInputDialog() objeto de API Java SWING y su método para crear una ventana de
        díalogo de entrada, espera dos entradas componente padre y un mensaje*/
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero entero");
            main(args);
            //System.exit(0); si no se coloca esta línea el main se ejecuta recursivamente tantas veces como error detectados por el catch
            System.exit(0);
        }



        System.out.println("El numero decimal es: " + numeroDecimal);
        //Binario
        String mensajeBinario = "El numero binario de  = " + numeroDecimal + " = " +  Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);
        //Octal
        String mensajeOctal = "El numero octal de  = " + numeroDecimal + " = " +  Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);
        //Hexadecimal
        String mensajeHex = "El numero hexadecimal de  = " + numeroDecimal + " = " +  Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHex);


        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHex;
        /*JOptionPane.showMessageDialog() objeto de API Java SWING y su método para crear una ventana de
        díalogo que muestra un mensaje, espera dos entradas componente padre y un mensaje*/
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
