package turtleManager.Domain;

/**
 * Created by Killer on 2017/9/30.
 */
public class UserInfo {
    private int userInfoId;
    private String userPicture;

    public UserInfo() {
    }

    public int getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(int userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }
}
