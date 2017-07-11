package foodle.lang.com.foodle.utils;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Administrator on 2017/7/11.
 */
public class Myapplication extends Application{
    private static RequestQueue requestQueue;
   public static RequestQueue getrequestQueue(){
      return requestQueue;
   }
    @Override
    public void onCreate() {
        super.onCreate();
        requestQueue=Volley.newRequestQueue(getApplicationContext());
    }
}
