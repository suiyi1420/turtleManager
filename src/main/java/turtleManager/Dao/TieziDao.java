package turtleManager.Dao;



import turtleManager.Domain.Pic;
import turtleManager.Domain.Reply;
import turtleManager.Domain.Tiezi;

import java.util.List;
import java.util.Map;

/**
 * Created by Killer on 2017/2/4.
 */
public interface TieziDao {
    public List<Tiezi> getTiezi(Map<String, Object> map);
    public void addPublicTiezi(Map<String, Object> map);//添加普通帖
    public void addJiaoyiTiezi(Tiezi tiezi);//添加交易帖
    public void deleteTiezi(Integer id);
    public List<Reply> getReply(Map<String, Object> map);//获取帖子回复
    public void addReply(Reply reply);
    public List<Pic> getPic(Map<String, Object> map);
}
