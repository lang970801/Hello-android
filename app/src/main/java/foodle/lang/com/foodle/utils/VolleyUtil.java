package foodle.lang.com.foodle.utils;

import android.nfc.Tag;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

import foodle.lang.com.foodle.Interfaces.LoginCallBack;
import foodle.lang.com.foodle.contents.UserContents;

/**
 * Created by Administrator on 2017/7/11.
 */
public class VolleyUtil {
    private VolleyUtil instance;
    private static final String TAG="VolleyUtil";
    private static final String VOLLEY_LOGO="volleytag";
    public  VolleyUtil(){
        if (instance==null){
            instance=new VolleyUtil();
        }
    }

    public static void  logoin(final String account, final String password, final LoginCallBack loginCallBack){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, UserContents.registUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                loginCallBack.success(response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
              loginCallBack.errr(""+error);
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map=new HashMap<String,String>();
                map.put("account",account);
                map.put("password",password);
                return super.getParams();
            }
        };
        stringRequest.setTag(VOLLEY_LOGO);
        Myapplication.getrequestQueue().add(stringRequest);
    }
}
