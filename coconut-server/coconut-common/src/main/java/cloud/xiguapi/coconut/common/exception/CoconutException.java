package cloud.xiguapi.coconut.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 椰子网盘自定义异常, 继承自运行时异常RuntimeException
 * 异常中包含状态码 code, 默认为-1
 *
 * @author 大大大西西瓜皮🍉
 * date: 2021/7/13 2:57
 * desc:
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CoconutException extends RuntimeException {

    private int code = -1;

    public CoconutException(String message) {
        super(message);
    }

    public CoconutException(String message, int code) {
        super(message);
        this.code = code;
    }

    public CoconutException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }
}
