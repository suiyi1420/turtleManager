package turtleManager.Domain;

/**
 * Created by Killer on 2017/2/4.
 */
public class TieziType {
    private int tiezi_typeId;
    private String tiezi_typeName;//帖子分类名

    public TieziType() {
    }

    public int getTiezi_typeId() {
        return tiezi_typeId;
    }

    public void setTiezi_typeId(int tiezi_typeId) {
        this.tiezi_typeId = tiezi_typeId;
    }

    public String getTiezi_typeName() {
        return tiezi_typeName;
    }

    public void setTiezi_typeName(String tiezi_typeName) {
        this.tiezi_typeName = tiezi_typeName;
    }
}
