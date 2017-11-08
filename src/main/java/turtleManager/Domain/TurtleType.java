package turtleManager.Domain;

import java.util.List;

/**
 * Created by Killer on 2017/2/1.
 */
public class TurtleType {
    private Integer turtle_typeId;
    private String turtle_typeName;
    private String icon;
    private List<Turtle> turtles;

    public TurtleType() {
    }

    public List<Turtle> getTurtles() {
        return turtles;
    }

    public void setTurtles(List<Turtle> turtles) {
        this.turtles = turtles;
    }

    public Integer getTurtle_typeId() {
        return turtle_typeId;
    }

    public void setTurtle_typeId(Integer turtle_typeId) {
        this.turtle_typeId = turtle_typeId;
    }

    public String getTurtle_typeName() {
        return turtle_typeName;
    }

    public void setTurtle_typeName(String turtle_typeName) {
        this.turtle_typeName = turtle_typeName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
