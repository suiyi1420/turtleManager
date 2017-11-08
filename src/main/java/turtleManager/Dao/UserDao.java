package turtleManager.Dao;

import turtleManager.Domain.User;

import java.util.Set;

/**
 * Created by Killer on 2017/9/29.
 */
public interface UserDao {
    public User queryUserByName(String userName);
    public Set<String> queryRolesByName(String userName);
    public User queryUser(int userId);
}
