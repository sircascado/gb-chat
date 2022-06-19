package ru.gb.may_chat.server.error;

import java.net.SocketTimeoutException;

public class AuthorizeTimeoutException extends SocketTimeoutException {

    public AuthorizeTimeoutException() {
    }

    public AuthorizeTimeoutException(String s) {
        super(s);
    }

}
