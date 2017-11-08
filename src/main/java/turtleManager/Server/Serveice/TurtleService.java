package turtleManager.Server.Serveice;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import turtleManager.Dao.TurtleDao;
import turtleManager.Server.serverApi.TritleServer;

import javax.annotation.Resource;

/**
 * Created by Killer on 2017/2/1.
 */
@Service("TritleService")
@Transactional
public class TurtleService implements TritleServer {
    @Resource
    private TurtleDao turtleDao;

    /**
     * 根据乌龟ID获得乌龟信息
     * @param id
     * @return
     */
    public Object getTritleById(Integer id) {
        return turtleDao.getTritleById(id);
    }

    /**
     * 根据分类获取所有乌龟
     * @param typeId
     * @return
     */
    public Object getAllTritleByTypeId(Integer typeId) {
        return turtleDao.getTritleByTypeId(typeId);
    }

    /**
     * 获取乌龟分类
     * @return
     */
    public Object getTurtleType(Integer turtle_typeId) {
        return turtleDao.getTurtleType(turtle_typeId);
    }

    /**
     * 获取乌龟详情
     * @param id
     * @return
     */
    public Object getTritleContext(Integer id) {
        return turtleDao.getTritleContext(id);
    }

    /**
     * 获取全部乌龟
     * @return
     */
    public Object getAllTurtle() {
        return turtleDao.getAllTurtle();
    }

    /**
     * 获取分类和对应分类的乌龟，并以map形式存储
     * @return
     */
//    public Object getAllTritleAndType() {
//        List<Map<String,Object>> list=new ArrayList<>();
//        List<TurtleType> turtleTypeList = turtleDao.getTritleType();
//        for (int i=0;i< turtleTypeList.size();i++){
//            Map<String,Object> map=new HashMap<>();
//            List<Turtle> turtleList = turtleDao.getTritleByTypeId(turtleTypeList.get(i).getId());
//            map.put("name", turtleTypeList.get(i).getName());
//            map.put("list", turtleList);
//            list.add(map);
//        }
//        return list;
//    }
}
