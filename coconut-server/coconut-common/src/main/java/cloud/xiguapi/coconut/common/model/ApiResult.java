package cloud.xiguapi.coconut.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

import static cloud.xiguapi.coconut.common.constant.ApiConstants.ERROR;
import static cloud.xiguapi.coconut.common.constant.ApiConstants.SUCCESS;

/**
 * API通用响应对象
 *
 * @author 大大大西西瓜皮🍉
 * date: 2021/7/12 23:35
 * desc:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResult<T> implements Serializable {

    private int code;

    private String message;

    private String time;

    private T data;

    /**
     * 构造API Result对象
     *
     * @param code    状态码
     * @param message 响应消息
     * @param time    响应时间
     * @param data    响应数据
     * @param <T>     响应数据的泛型
     * @return API响应对象
     */
    public static <T> ApiResult<T> instance(int code, String message, String time, T data) {
        return new ApiResult<>(code, message, time, data);
    }

    /**
     * 成功响应
     *
     * @param data 响应数据
     * @param <T>  响应数据的泛型
     * @return API响应对象
     */
    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<>(SUCCESS.getCode(), SUCCESS.getMessage(), LocalDateTime.now().toString(), data);
    }

    /**
     * 成功响应
     *
     * @param data    响应数据
     * @param message 响应信息
     * @param <T>     响应数据的泛型
     * @return API响应对象
     */
    public static <T> ApiResult<T> success(String message, T data) {
        return new ApiResult<>(SUCCESS.getCode(), message, LocalDateTime.now().toString(), data);
    }

    /**
     * 成功响应
     *
     * @param code    状态码
     * @param message 响应消息
     * @param data    响应数据
     * @param <T>     响应数据的泛型
     * @return API响应对象
     */
    public static <T> ApiResult<T> success(int code, String message, T data) {
        return new ApiResult<>(code, message, LocalDateTime.now().toString(), data);
    }

    /**
     * 错误响应
     *
     * @param code    状态码
     * @param message 响应消息
     * @param <T>     响应数据的泛型
     * @return API响应对象
     */
    public static <T> ApiResult<T> error(int code, String message) {
        return new ApiResult<>(code, message, LocalDateTime.now().toString(), null);
    }

    /**
     * 错误响应
     *
     * @param message 响应消息
     * @param <T>     响应数据的泛型
     * @return API响应对象
     */
    public static <T> ApiResult<T> error(String message) {
        return new ApiResult<>(ERROR.getCode(), message, LocalDateTime.now().toString(), null);
    }

    /**
     * 错误响应
     *
     * @param <T> 响应数据的泛型
     * @return API响应对象
     */
    public static <T> ApiResult<T> error() {
        return new ApiResult<>(ERROR.getCode(), ERROR.getMessage(), LocalDateTime.now().toString(), null);
    }
}
