/**
 * Interfaz para autenticación y registro de usuarios.
 *
 * @author Eneko,Josu
 */
package model;

import exception.*;

public interface Sign {

    /**
     * Registra un usuario.
     *
     * @param user El usuario a registrar.
     * @return El usuario registrado.
     * @throws ServerErrorException Si hay un error en el servidor.
     * @throws UserAlreadyExistsException Si el usuario ya existe.
     */
    public User getExecuteSignUp(User user) throws ServerErrorException, UserAlreadyExistsException;

    /**
     * Inicia sesión de un usuario.
     *
     * @param user Las credenciales del usuario.
     * @return El usuario que inicia sesión.
     * @throws ServerErrorException Si hay un error en el servidor.
     * @throws CredentialErrorException Si las credenciales no son válidas.
     * @throws UserNotFoundException Si el usuario no se encuentra.
     */
    public User getExecuteSignIn(User user) throws ServerErrorException, CredentialErrorException, UserNotFoundException;
}
