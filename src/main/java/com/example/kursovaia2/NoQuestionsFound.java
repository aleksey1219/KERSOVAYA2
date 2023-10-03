package com.example.kursovaia2;

public class NoQuestionsFound extends RuntimeException {
    public NoQuestionsFound() {
    }

    public NoQuestionsFound(String message) {
        super(message);
    }

    public NoQuestionsFound(String message, Throwable cause) {
        super(message, cause);
    }

    public NoQuestionsFound(Throwable cause) {
        super(cause);
    }

    public NoQuestionsFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
