/**
 * Una excepción que se lanza cuando se intenta registrar un usuario que ya existe.
 * Esta excepción se utiliza para indicar que el usuario que se intenta registrar ya está presente en el sistema.
 *
 * @author Eneko
 */
package exception;

public class UserAlreadyExistsException extends Exception {

    /**
     * Constructor de la excepción con un mensaje de error personalizado.
     *
     * @param message El mensaje de error que describe la causa de la excepción.
     */
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
