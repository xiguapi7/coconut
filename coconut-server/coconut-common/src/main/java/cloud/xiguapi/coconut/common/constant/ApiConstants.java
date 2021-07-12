package cloud.xiguapi.coconut.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * API 状态码与响应信息 枚举
 * <p>
 * 成功响应码: 0
 * 错误响应码为负数
 * 其他类型响应码为正数
 *
 * @author 大大大西西瓜皮🍉
 * date: 2021/7/12 23:48
 * desc:
 */
@Getter
@AllArgsConstructor
public enum ApiConstants {

    /**
     * 成功
     */
    SUCCESS(0, "操作成功"),

    /**
     * 错误
     */
    ERROR(-1, "操作失败"),

    /**
     * 超时
     */
    TIMEOUT(-2, "操作超时"),

    /**
     * 连接异常
     */
    CONNECT_FAIL(-3, "连接异常"),

    /**
     * 未授权
     */
    UNAUTHORIZED(-4, "操作未授权"),

    /**
     * 频繁操作异常
     */
    FREQUENT_OPERATION(-5, "请勿频繁操作, 休息一下叭"),

    /**
     * 通用文件异常
     */
    FILE_FAIL(-6, "文件操作异常"),

    /**
     * 文件未找到
     */
    FILE_NOT_FOUND(-7, "文件未找到"),

    /**
     * 文件下载异常
     */
    FILE_DOWNLOAD_FAIL(-8, "文件下载失败"),

    /**
     * 文件上传异常
     */
    FILE_UPLOAD_FAIL(-9, "文件上传失败"),

    /**
     * 文件大小受限
     */
    FILE_SIZE_LIMIT(-10, "文件大小超过限制");

    /**
     * 状态码
     */
    private final int code;

    /**
     * 消息
     */
    private final String message;
}
