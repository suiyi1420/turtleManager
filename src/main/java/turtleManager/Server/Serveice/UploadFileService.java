package turtleManager.Server.Serveice;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import turtleManager.Dao.UploadFileDao;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Killer on 2017/10/17.
 */
@Service("UploadFileService")
@Transactional
public class UploadFileService {
    @Resource
    private UploadFileDao uploadFileDao;

    public void addPic(Map<String,Object> map){
        uploadFileDao.addPic(map);
    }
}
