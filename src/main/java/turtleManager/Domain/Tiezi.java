package turtleManager.Domain;

import java.util.List;

/**
 * Created by Killer on 2017/2/4.
 */
public class Tiezi {
    private int tieziId;
    private String title;//标题
    private String context;//帖子内容
    private List<Pic> picList;//图片列表
    private Video video;//视频
    private String time;//帖子发布时间
    private String location;//帖子发布位置
    private Turtle turtle;
    private User user;
    private TieziType tieziType;
    private TieziDeal tieziDeal;

    public Tiezi() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getTieziId() {
        return tieziId;
    }

    public void setTieziId(int tieziId) {
        this.tieziId = tieziId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public List<Pic> getPicList() {
        return picList;
    }

    public void setPicList(List<Pic> picList) {
        this.picList = picList;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public TieziType getTieziType() {
        return tieziType;
    }

    public void setTieziType(TieziType tieziType) {
        this.tieziType = tieziType;
    }

    public TieziDeal getTieziDeal() {
        return tieziDeal;
    }

    public void setTieziDeal(TieziDeal tieziDeal) {
        this.tieziDeal = tieziDeal;
    }
}
