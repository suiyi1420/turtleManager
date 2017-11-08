package turtleManager.Controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import turtleManager.Domain.User;
import turtleManager.Server.Serveice.UserService;
import turtleManager.Unit.PublicFunction;

import javax.annotation.Resource;


/**
 * Created by Killer on 2017/9/29.
 */
@Controller
public class LoginController {
    //private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Resource
    private UserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public String login(User user,Model model){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new
                UsernamePasswordToken(user.getUserName(),user.getPassword());
        try {
            subject.login(usernamePasswordToken);
            subject.getSession().setAttribute("userName",user.getUserName());
            //logger.info("======登陆成功=======");
            return PublicFunction.getUser().getUserName();
            //return "success";
        } catch (Exception e) {
            //logger.error("======登陆异常=======");
            //model.addAttribute("msg", "用户名或者密码错误,登陆失败");
            e.printStackTrace();
            return "error";
        }
    }
}
