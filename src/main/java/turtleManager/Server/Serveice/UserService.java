package turtleManager.Server.Serveice;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import turtleManager.Dao.UserDao;
import turtleManager.Domain.User;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created by Killer on 2017/9/29.
 */
@Service("userService")
@Transactional
public class UserService {
    @Resource
    private UserDao userDao;

    public User queryUserByName(String userName){
        return userDao.queryUserByName(userName);
    }
    public Set<String> queryRolesByName(String userName){
        return userDao.queryRolesByName(userName);
    }
    public User queryUser(int userId){
        return userDao.queryUser(userId);
    }
}
