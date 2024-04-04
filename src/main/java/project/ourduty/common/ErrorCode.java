package project.ourduty.common;

import lombok.Getter;

@Getter
public enum ErrorCode {
    FAIL(999, "실패");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
