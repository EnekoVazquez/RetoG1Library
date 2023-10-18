/**
 * Una excepción que se lanza cuando no se puede encontrar un usuario en el sistema.
 * Esta excepción se utiliza para indicar que el usuario solicitado no existe en el sistema.
 *
 * @author Josu
 */
package exception;

public class UserNotFoundException extends Exception {

    /**
     * Constructor de la excepción con un mensaje de error personalizado.
     *
     * @param message El mensaje de error que describe la causa de la excepción.
     */
    public UserNotFoundException(String message) {
        super(message);
    }
}
