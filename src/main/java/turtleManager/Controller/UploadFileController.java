package turtleManager.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import turtleManager.Server.Serveice.UploadFileService;
import turtleManager.Unit.PublicFunction;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by Killer on 2017/7/21.
 */
@Controller
public class UploadFileController {
    @Resource
    private UploadFileService uploadFileService;

    @ResponseBody
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public List<String> doUpload(@RequestParam(value="file",required=false) MultipartFile[] file,Integer replyId,Integer tieziId,
                                   HttpServletRequest request) throws IOException {
        //获得物理路径webapp所在路径
        String pathRoot = request.getSession().getServletContext().getRealPath("");
        //项目名
        String urlName = request.getContextPath();
        //项目远程库的IP加端口
        String remotePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+urlName;
        String path="";
        List<String> sqlPath=new ArrayList<String>();

        for (MultipartFile mf : file) {
            if(!mf.isEmpty()){
                //生成8位随机数作为文件名称
                String uuid = PublicFunction.getRandomInteger();
                Date date=new Date();
                String name= String.valueOf(date.getTime());
                //获得文件类型（可以判断如果不是图片，禁止上传）
                String contentType=mf.getContentType();
                //获得文件后缀名称
                String imageName=contentType.substring(contentType.indexOf("/")+1);
                if(contentType.equals("image/png")||contentType.equals("image/jpg")||contentType.equals("image/gif")){
                    path="/static/photos/"+name+"."+imageName;
                    sqlPath.add(remotePath+path);
                }else if (contentType.equals("video/mp4")){
                    path="/static/video/"+name+"."+imageName;
                    sqlPath.add(remotePath+path);
                }else{
                    path="/static/other/"+name+"."+imageName;
                }

                mf.transferTo(new File(pathRoot+path));
                Map<String,Object> map=new HashMap<>();
                map.put("replyId",replyId);
                map.put("tieziId",tieziId);
                uploadFileService.addPic(map);
            }
        }
        return sqlPath;
    }


}
