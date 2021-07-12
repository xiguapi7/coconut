package cloud.xiguapi.coconut.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 通用分页对象
 * T: 分页数据对象泛型
 *
 * @author 大大大西西瓜皮🍉
 * date: 2021/7/13 3:11
 * desc:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pager<T> implements Serializable {

    /**
     * 当前页
     */
    private long current;

    /**
     * 条数
     */
    private long size;

    /**
     * 总条数
     */
    private long total;

    /**
     * 当前页数据
     */
    private List<T> records;
}
