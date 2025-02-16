package inditex.esteban.prueba.exception;


public enum ErrorCode {

    PRICE_NOT_FOUND("404", "No price found for the given parameters");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
