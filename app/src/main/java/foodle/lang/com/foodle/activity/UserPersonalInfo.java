package foodle.lang.com.foodle.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import foodle.lang.com.foodle.Interfaces.UserInfoCallBack;
import foodle.lang.com.foodle.R;
import foodle.lang.com.foodle.utils.VolleyUtil;

/**
 * Created by Administrator on 2017/7/12.
 */
public class UserPersonalInfo extends Activity implements UserInfoCallBack{
    private TextView nameTxt,ageTxt,sexTex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userinfo_layout);
        initView();
//        VolleyUtil.GainUserinfo();
    }

    private void initView() {
        nameTxt=findViewById(R.id.showName);
        ageTxt=findViewById(R.id.showage);
        sexTex=findViewById(R.id.showSex);
    }

    @Override
    public void registsuccess(String info) {

    }

    @Override
    public void registerrr(String error) {

    }
}
