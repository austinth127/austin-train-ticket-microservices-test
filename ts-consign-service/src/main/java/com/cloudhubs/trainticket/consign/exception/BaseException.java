package com.cloudhubs.trainticket.consign.exception;

/**
 * @author fdse
 */
public class BaseException extends RuntimeException {
    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
