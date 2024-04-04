package project.ourduty.common;

import lombok.Getter;

@Getter
public class ApiBody <T>{

    private final T data;
    private final T message;

    public ApiBody(T data, T message) {
        this.data = data;
        this.message = message;
    }
}
