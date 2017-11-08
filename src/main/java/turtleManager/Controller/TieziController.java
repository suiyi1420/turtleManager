package turtleManager.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import turtleManager.Domain.Page;
import turtleManager.Domain.Reply;
import turtleManager.Domain.Tiezi;
import turtleManager.Server.Serveice.TieziService;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Killer on 2017/2/7.
 */
@Controller
public class TieziController {
    @Resource
    private TieziService tieziService;

    /**
     * 获取帖子
     * @param turtleId  根据乌龟获取帖子的内容
     * @param id        根据帖子的id获取帖子的内容
     * @param turtleTypeId   根据乌龟分类获取帖子的内容
     * @param tieziTypeId   根据帖子分类获取帖子的内容
     * @return 返回帖子信息 上面参数全为空则查找所有帖子
     */
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/getTiezi")
    @ResponseBody
    public Object getTiezi(Integer turtleId,Integer id,Integer tieziTypeId,Integer turtleTypeId){
        Map<String,Object> map=new HashMap<>();
        //查找所有帖子
        if(turtleId==null&&id==null&&tieziTypeId==null&&turtleTypeId==null){

        }else{
            if(turtleTypeId!=null){
                if (turtleId!=null){
                    map.put("turtleTypeId",turtleTypeId);
                    map.put("turtleId",turtleId);
                }else{
                    map.put("turtleTypeId",turtleTypeId);
                }
            }
            if(id!=null){
                map.put("id",id);
            }
            if (tieziTypeId!=null){
                map.put("tieziTypeId",tieziTypeId);
            }
        }
        return tieziService.getTiezi(map);
    }

    /**
     * 获取帖子回复的内容
     * @param tieziId 帖子ID
     * @param replyId   回复的内容ID
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/getReply")
    @ResponseBody
    public Object getReply(Integer tieziId,Integer replyId,Page page){
        Map<String,Object> map=new HashMap<>();
            if (replyId!=null){//回复内容的ID不是空，那么就是查询该回复下的所有回复，是空就是仅查询该帖子的回复
                map.put("replyId", replyId);
            }
            map.put("tieziId",tieziId);
        if(page.getCurrentPage()!=0) {
            map.put("page", page);
        }
        return tieziService.getReply(map);
    }


    /**
     * 添加主题、视频帖
     * @param tiezi
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/addPublicTiezi")
    @ResponseBody
    public Object addPublicTiezi(Tiezi tiezi,Integer turtleId,Integer tieziTypeId){
        Date time = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        tiezi.setTime(sdf.format(time));
        Map<String,Object> map=new HashMap<>();
        map.put("tiezi",tiezi);
        map.put("turtleId",turtleId);
        map.put("tieziTypeId",tieziTypeId);
        tieziService.addPublicTiezi(map);
        return null;
    }

    /**
     * 添加帖子回复
     * @param reply
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/addReply")
    public ResponseEntity addReply(Reply reply){
        Date time = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        reply.setTime(sdf.format(time));
        tieziService.addReply(reply);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 删除帖子
     * @param id
     * @return
     */
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "/deleteTiezi")
    public ResponseEntity deleteTiezi(Integer id){
        tieziService.deleteTiezi(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
