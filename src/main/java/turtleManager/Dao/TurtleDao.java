package turtleManager.Dao;



import turtleManager.Domain.Turtle;
import turtleManager.Domain.TurtleType;

import java.util.List;

/**
 * Created by Killer on 2017/2/1.
 */
public interface TurtleDao {
    public List<Turtle> getTritleByTypeId(Integer typeId);
    public List<Turtle> getTritleById(Integer id);
    public Turtle getTritleContext(Integer id);
    public List<Turtle> getTritleNoContext(Integer id);
    public List<TurtleType> getTurtleType(Integer turtle_typeId);
    public List<Turtle> getAllTurtle();
}
