/**
 * Una excepción que se lanza cuando se producen errores en el servidor.
 * Esta excepción se utiliza para indicar que ha ocurrido un error inesperado en el servidor.
 *
 * @author Eneko.
 */
package exception;

public class ServerErrorException extends Exception {

    /**
     * Constructor de la excepción con un mensaje de error personalizado.
     *
     * @param message El mensaje de error que describe la causa de la excepción.
     */
    public ServerErrorException(String message) {
        super(message);
    }
}
