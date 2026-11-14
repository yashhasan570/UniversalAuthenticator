package com.universalauthenticator.app.encoding;

import java.io.IOException;

public class EncodingException extends IOException {
    public EncodingException(Throwable cause) {
        super(cause);
    }

    public EncodingException(String message) {
        super(message);
    }
}
