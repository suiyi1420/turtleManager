package turtleManager.Server.serverApi;

/**
 * Created by Killer on 2017/2/1.
 * 公用server接口,增删查改
 */
public interface PublicApi {
    public Object add(Object... objects);
    public Object delete(Object... objects);
    public Object get(Object... objects);
    public Object put(Object... objects);
}
