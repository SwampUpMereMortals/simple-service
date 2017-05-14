package io.mere.mortal.api.model;

/**
 * @author jw
 */
public class SimpleResponse {
    private final String id;
    private final String message;

    public SimpleResponse(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
