package turtleManager.Controller;

;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import turtleManager.Server.Serveice.TurtleService;

import javax.annotation.Resource;

/**
 * Created by Killer on 2017/2/1.
 */
@Controller
public class TurtleController {
    @Resource
    private TurtleService turtleService;

    /*
    根据乌龟的id获取乌龟信息
     */
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/getTritleById")
    @ResponseBody
    public Object getTritleById(Integer id){

            return turtleService.getTritleById(id);

    }

    /*
    根据乌龟分类id获取所有乌龟
     */
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/getTritleByTypeId")
    @ResponseBody
    public Object getTritleByTypeId(Integer typeId){
        return turtleService.getAllTritleByTypeId(typeId);
    }

    /*
    获取所有乌龟分类
     */
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/getTritleType")
    @ResponseBody
    public Object getTurtleType(Integer turtle_typeId){
        if (turtle_typeId==null){
            turtle_typeId=0;
        }
        return turtleService.getTurtleType(turtle_typeId);
    }

    /*
    获取所有乌龟
     */
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/getAllTritle")
    @ResponseBody
    public Object getAllTurtle(){
        return turtleService.getAllTurtle();
    }

    /*
    获取所有乌龟分类下的所有乌龟
     */
//    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/getAllTritleAndType")
//    @ResponseBody
//    public Object getAllTritleAndType(){
//        return turtleService.getAllTritleAndType();
//    }

}
