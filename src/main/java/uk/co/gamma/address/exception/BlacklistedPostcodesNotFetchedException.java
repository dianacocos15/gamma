package main.java.uk.co.gamma.address.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class BlacklistedPostcodesNotFetchedException extends Exception {
    public BlacklistedPostcodesNotFetchedException(String message, Throwable cause) {
        super(message, cause);
    }
}
