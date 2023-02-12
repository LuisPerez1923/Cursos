import java.util.Scanner;
import java.util.InputMismatchException;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        //System.in entrada de la consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        //scanner.nextLine() obtener la línea escrita por el usuario en la consola de Java
        //Con la clase scanner podemos obtener una cadena y transformarla directamente a un número con scanner.nextInt()
        //String numeroString = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            //numeroDecimal = Integer.parseInt(numeroString);
            numeroDecimal = scanner.nextInt();
        } catch (InputMismatchException e) {
            //Para este caso cambia el tipo de excepción ahora es: InputMismatchException la cual se debe importar
            //también se puede atrapar excepciones de forma genérica con: Exception (la más genérica) todas las demás son hijas de esa clase
            System.out.println("Debe ingresar un numero entero: ");
            main(args);
            //System.exit(0); si no se coloca esta línea el main se ejecuta recursivamente tantas veces como error detectado por el catch
            System.exit(0);
        }

        System.out.println("El numero decimal es: " + numeroDecimal);
        //Binario
        String mensajeBinario = "El numero binario de  = " + numeroDecimal + " = " +  Integer.toBinaryString(numeroDecimal);
        //Octal
        String mensajeOctal = "El numero octal de  = " + numeroDecimal + " = " +  Integer.toOctalString(numeroDecimal);
        //Hexadecimal
        String mensajeHex = "El numero hexadecimal de  = " + numeroDecimal + " = " +  Integer.toHexString(numeroDecimal);


        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHex;

        System.out.println(mensaje);
    }
}
