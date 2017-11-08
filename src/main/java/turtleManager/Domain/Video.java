package turtleManager.Domain;

/**
 * Created by Killer on 2017/10/17.
 */
public class Video {
    private Integer videoId;
    private String videoUrl;
    private Integer tieziId;

    public Video() {
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getTieziId() {
        return tieziId;
    }

    public void setTieziId(Integer tieziId) {
        this.tieziId = tieziId;
    }
}
