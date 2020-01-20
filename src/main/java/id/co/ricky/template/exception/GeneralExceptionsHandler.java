package id.co.ricky.template.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import static org.springframework.http.ResponseEntity.notFound;

@RestControllerAdvice
@Slf4j
public class GeneralExceptionsHandler {

    @ExceptionHandler(value = {UserNotFound.class})
    public ResponseEntity userNotFound(UserNotFound ex, WebRequest request) {
        log.debug("handling usersNotFound...");
        return notFound().build();
    }
}