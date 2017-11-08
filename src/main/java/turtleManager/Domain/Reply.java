package turtleManager.Domain;

import java.util.List;

/**
 * Created by Killer on 2017/7/16.
 */
public class Reply {
    private Integer replyId;
    private int tieziId;
    private User user;
    private Integer reply_id;
    private String context;
    private List<Pic> picList;
    private String time;
    private Integer floor;
    private List<Reply> replyList;

    public Reply() {
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public int getTieziId() {
        return tieziId;
    }

    public void setTieziId(int tieziId) {
        this.tieziId = tieziId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getReply_id() {
        return reply_id;
    }

    public void setReply_id(Integer reply_id) {
        this.reply_id = reply_id;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public List<Reply> getReplyList() {
        return replyList;
    }

    public void setReplyList(List<Reply> replyList) {
        this.replyList = replyList;
    }
}
