package turtleManager.Unit;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import turtleManager.Domain.User;

/**
 * Created by Killer on 2017/7/25.
 */
public class PublicFunction {
    public static final String ALLCHAR = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    /**
     * 返回一个定长的随机字符串(只包含大小写字母、数字)
     *
     * @param length
     *            随机字符串长度
     * @return 随机字符串
     */
    /**
     * 随机产生一个8位的随机数据
     * @return
     */
    public static String getRandomInteger()
    {
        int temp=(int) (Math.random()*99999999);
        return String.valueOf(temp);
    }

    /**
     * 获取当前用户登录的user信息
     * @return
     */
    public static User getUser(){
        String userName = (String) SecurityUtils.getSubject().getSession().getAttribute("userName");
        User user=new User();
        user.setUserName(userName);
        return user;
    }
}
