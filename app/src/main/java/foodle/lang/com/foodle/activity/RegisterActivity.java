package foodle.lang.com.foodle.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import foodle.lang.com.foodle.Interfaces.LoginCallBack;
import foodle.lang.com.foodle.Interfaces.RegistCallBack;
import foodle.lang.com.foodle.R;
import foodle.lang.com.foodle.utils.VolleyUtil;

/**
 * Created by Administrator on 2017/7/11.
 */
public class RegisterActivity extends Activity implements View.OnClickListener,RegistCallBack {
    private static final String TAG="RegisterActivity";
    private EditText accountEdit, passwordEdit,ageEdit,sexEdit;
    private ImageView registerBt;
    private EditText registerBt_reg;
    private static  final String FILE_NAME="reg_data";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerlayout);
        init();
    }
    private void init() {
        registerBt=findViewById(R.id.registerBt_reg);
        accountEdit=findViewById(R.id.accountEdit_reg);
        ageEdit=findViewById(R.id.agesEdit_reg);
        sexEdit=findViewById(R.id.sexEdit_reg);
        passwordEdit=findViewById(R.id.passwordEdit_reg);
        registerBt.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        String account= accountEdit.getText().toString().trim();
        String password=accountEdit.getText().toString().trim();
        String age= ageEdit.getText().toString().trim();
        String sex=sexEdit.getText().toString().trim();
        VolleyUtil.register( account,password,age,sex,RegisterActivity.this);
//        VolleyUtil.logoin(account,password,RegisterActivity.this);
    }

    @Override
    public void registsuccess(String info) {
        Log.i(TAG,"注册"+info);
    }

    @Override
    public void registerrr(String error) {
        Log.i(TAG,"注册"+error);
    }
}
