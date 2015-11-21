package zx.going.entity;

import java.io.Serializable;

/**
 * Created by zx on 2015/11/21.
 */
public class BaseEntity  implements Serializable {

    private  Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
