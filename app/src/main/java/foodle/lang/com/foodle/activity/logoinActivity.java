package foodle.lang.com.foodle.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import foodle.lang.com.foodle.Interfaces.LoginCallBack;
import foodle.lang.com.foodle.R;
import foodle.lang.com.foodle.contents.UserContents;
import foodle.lang.com.foodle.utils.VolleyUtil;

/**
 * Created by Administrator on 2017/7/11.
 */
public class logoinActivity extends Activity implements View.OnClickListener,LoginCallBack{
    private TextView remeTv;
    private ImageView logoin_img,login_zuce;
    private EditText userNanme,pawss;
    private String sreturn;
    private String name;
    private static final String TAG="logoinActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logoin_layout);
        init();
    }

    private void init() {
        logoin_img=findViewById(R.id.logoin_denglu_img);
        login_zuce=findViewById(R.id.login_zuce_img);
        logoin_img.setOnClickListener(this);
        login_zuce.setOnClickListener(this);
        userNanme=findViewById(R.id.login_accoutEdit);
        pawss=findViewById(R.id.login_passdEdit);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.logoin_denglu_img:
                name= userNanme.getText().toString().trim();
               String pawass= pawss.getText().toString().trim();
                VolleyUtil.logoin(name,pawass,logoinActivity.this);

                break;
            case R.id.login_zuce_img:
                Intent intent=new Intent(logoinActivity.this,RegisterActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void success(String info) {
        Log.i("DSDS","info"+info);
        if (info.equals(UserContents.ok)){
            Intent intent=new Intent(logoinActivity.this,MainActivity.class);
           intent.putExtra("flag",TAG);
            intent.putExtra("name",name);
            startActivity(intent);
            Toast.makeText(logoinActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(logoinActivity.this,"登录失败",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void errr(String error) {
        Log.i("DSDS","error"+error);
    }
}
