/**
 * Una excepción que se lanza cuando se producen errores relacionados con credenciales de usuario.
 * Esta excepción se utiliza para indicar que las credenciales proporcionadas no son válidas.
 *
 * @author Josu
 */
package exception;

public class CredentialErrorException extends Exception {

    /**
     * Constructor de la excepción con un mensaje de error personalizado.
     *
     * @param message El mensaje de error que describe la causa de la excepción.
     */
    public CredentialErrorException(String message) {
        super(message);
    }
}
