package turtleManager.Domain;

/**
 * Created by Killer on 2017/10/17.
 */
public class Pic {
    private Integer picId;
    private String picUrl;
    private Integer tieziId;
    private Integer replyId;

    public Pic() {
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getTieziId() {
        return tieziId;
    }

    public void setTieziId(Integer tieziId) {
        this.tieziId = tieziId;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }
}
