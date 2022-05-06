package fr.kelig.testtechnique.common;

import java.util.HashMap;
import java.util.Map;

public class TooOldException extends RuntimeException {

    private final Map<String, Object> errors;

    public TooOldException(String resource, String field) {
        this.errors = new HashMap<>();
        this.errors.put("resource", resource);
        this.errors.put("field", field);
    }

    public Map<String, Object> getErrors() {
        return errors;
    }
}
