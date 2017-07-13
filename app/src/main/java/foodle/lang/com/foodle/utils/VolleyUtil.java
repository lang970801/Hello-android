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
import foodle.lang.com.foodle.Interfaces.RegistCallBack;
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
    public static void  logoin(final String name, final String password, final LoginCallBack loginCallBack){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, UserContents.loginUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.equals(UserContents.ok)){
                    loginCallBack.success(UserContents.ok);
                }else{
                    loginCallBack.errr(UserContents.error);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
              loginCallBack.errr(error.toString());
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map=new HashMap<String,String>();
                map.put("name", name);
                map.put("password", password);
                return map;
            }
        };
        stringRequest.setTag(VOLLEY_LOGO);
        Myapplication.getrequestQueue().add(stringRequest);
    }
    public static void register(final String name, final String password,final String age,final String gender,final RegistCallBack registCallBack){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, UserContents.registUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
              registCallBack.registsuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                registCallBack.registerrr(error.toString());
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String, String> map=new HashMap<String,String>();
                map.put("name", name);
                map.put("password", password);
                map.put("age", age);
                map.put("gender", gender);
                return map;
            }
        };
        stringRequest.setTag(VOLLEY_LOGO);
        Myapplication.getrequestQueue().add(stringRequest);
    }
    public static void GainUserinfo(final String name, final RegistCallBack registCallBack){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, UserContents.userInfoUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                registCallBack.registsuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                registCallBack.registerrr(error.toString());
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String, String> map=new HashMap<String,String>();
                map.put("name", name);
                return map;
            }
        };
        stringRequest.setTag(VOLLEY_LOGO);
        Myapplication.getrequestQueue().add(stringRequest);
    }
}
