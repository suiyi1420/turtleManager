package turtleManager.Domain;

/**
 * Created by Killer on 2017/2/1.
 */
public class Turtle {
    private Integer turtleId;
    private String turtleName;
    private String icon;//图标
    private int typeId;//关联乌龟分类ID
    private String context;//百科内容

    public Turtle() {
    }

    public Integer getTurtleId() {
        return turtleId;
    }

    public void setTurtleId(Integer turtleId) {
        this.turtleId = turtleId;
    }

    public String getTurtleName() {
        return turtleName;
    }

    public void setTurtleName(String turtleName) {
        this.turtleName = turtleName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
