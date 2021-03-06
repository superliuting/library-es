package landsky.library.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wcn
 * @since 2020-03-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Doc extends BaseEntity implements Comparable<Doc>{

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String document;

    private String tags;

    private Integer categoryId;

    private Integer download;

    @TableField(exist = false)
    private String categoryName;


    @Override
    public int compareTo(Doc doc) {
        return -Integer.compare(this.download, doc.getDownload());
    }
}
