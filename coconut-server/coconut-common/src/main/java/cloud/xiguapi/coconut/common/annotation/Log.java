package cloud.xiguapi.coconut.common.annotation;

import java.lang.annotation.*;

/**
 * 日志注解
 * 作用范围: 方法
 * 保留级别: 运行时
 *
 * @author 大大大西西瓜皮🍉
 * date: 2021/7/13 3:06
 * desc:
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Log {
}
