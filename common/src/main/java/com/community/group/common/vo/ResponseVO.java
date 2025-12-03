package main.java.com.community.group.common.vo;
import lombok.Data;
@Data
public class ResponseVO<T> {
    private Integer code;
    private String msg;
    private T data;

    public static <T> ResponseVO<T> success(T data) {
        return new ResponseVO<>(200, "success", data);
    }

    public static <T> ResponseVO<T> error(String msg) {
        return new ResponseVO<>(500, msg, null);
    }
}
