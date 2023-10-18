/**
 * Enumeración que representa los diferentes tipos de mensajes utilizados en la aplicación.
 * Cada tipo de mensaje se utiliza para identificar la naturaleza de la comunicación entre los componentes de la aplicación.
 *
 * Esta enumeración es serializable para permitir la transferencia de mensajes a través de la red u otros medios.
 *
 * @author Eneko.Josu
 */
package model;

import java.io.Serializable;

public enum MessageType implements Serializable {
    SIGNIN_REQUEST,
    SIGNUP_REQUEST,
    OK_RESPONSE,
    USER_ALREADY_EXISTS_RESPONSE,
    USER_NOT_FOUND_RESPONSE,
    CREDENTIAL_ERROR_RESPONSE,
    ERROR_RESPONSE,
    MAX_USER;
}
