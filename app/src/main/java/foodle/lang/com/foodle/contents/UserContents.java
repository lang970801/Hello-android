package foodle.lang.com.foodle.contents;

/**
 * Created by Administrator on 2017/7/11.
 */
public class UserContents {
    private static final String baseUrl="http://172.16.8.253:8080/LucasWeb2/";
//    private static final String baseUrl="http://192.168.11.228:8080/LucasWeb2/";
    public static final String loginUrl = baseUrl + "queryUser.do";
    public static final String registUrl = baseUrl + "addUser.do";
    public static final String userInfoUrl=baseUrl+"queryUserWithName.do";

    public static final String ok = "ok";
    public static final String error = "error";
    public static final String error_user_exit = "user_already_exit";
}
