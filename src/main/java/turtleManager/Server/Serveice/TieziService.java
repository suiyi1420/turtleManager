package turtleManager.Server.Serveice;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import turtleManager.Dao.TieziDao;
import turtleManager.Domain.Pic;
import turtleManager.Domain.Reply;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Killer on 2017/2/4.
 */
@Service("TieziService")
@Transactional
public class TieziService {
    @Resource
    private TieziDao tieziDao;

    public Object getTiezi(Map<String,Object> map){
        Object object=tieziDao.getTiezi(map);

        return tieziDao.getTiezi(map);
    }

    public List<Reply> getReply(Map<String,Object> map){
        List<Reply> replyList=tieziDao.getReply(map);

        for (Reply reply:replyList){
            Map<String,Object> map1=new HashMap<>();
            map1.put("replyId",reply.getReplyId());
            List<Reply> replyList2=tieziDao.getReply(map1);
            if(replyList2.size()!=0){
                reply.setReplyList(replyList2);
                getReply(map1);//递归查询回复下的回复
            }
            Map<String,Object> map2=new HashMap<>();
            map2.put("tieziId",reply.getTieziId());
            map2.put("replyId",reply.getReplyId());
            List<Pic> picList2=tieziDao.getPic(map2);
            reply.setPicList(picList2);//查询图片
        }
        return replyList;
    }

    /**
     * 添加帖子
     * @param map 帖子内容对象
     */
    public void addPublicTiezi(Map<String,Object> map){

        tieziDao.addPublicTiezi(map);//添加主题帖
    }

    public void deleteTiezi(Integer id){
        tieziDao.deleteTiezi(id);
    }

    public void addReply(Reply reply){
        tieziDao.addReply(reply);
    }

}
