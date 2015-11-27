package zx.going.entity;

import java.io.Serializable;

/**
 * Created by zx on 2015/11/21.
 */
public class Article extends  BaseEntity{

    private String title;

    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
