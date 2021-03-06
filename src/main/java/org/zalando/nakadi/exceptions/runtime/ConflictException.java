package org.zalando.nakadi.exceptions.runtime;

public class ConflictException extends MyNakadiRuntimeException1 {

    public ConflictException(final String message) {
        super(message);
    }

    public ConflictException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
