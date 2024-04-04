package project.ourduty.common;

import lombok.Getter;

@Getter
public class ApiHeader {

    private final int result;
    private final String codeName;

    public ApiHeader(int result, String codeName) {
        this.result = result;
        this.codeName = codeName;
    }
}
