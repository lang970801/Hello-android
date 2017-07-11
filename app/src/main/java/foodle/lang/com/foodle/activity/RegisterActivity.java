package foodle.lang.com.foodle.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import foodle.lang.com.foodle.Interfaces.LoginCallBack;
import foodle.lang.com.foodle.R;
import foodle.lang.com.foodle.utils.VolleyUtil;

/**
 * Created by Administrator on 2017/6/25.
 */
public class RegisterActivity extends Activity implements LoginCallBack, View.OnClickListener {
    private static final String TAG="RegisterActivity";
    private EditText accountEdit, passwordEdit;
    private Button registerBt;
    private Button registerBt_reg;
    private static  final String FILE_NAME="reg_data";
    private EditText accountEdit_reg,passwordEdit_reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerlayout);
        init();
    }

    private void init() {
        registerBt_reg=findViewById(R.id.registerBt_reg);
        accountEdit_reg=findViewById(R.id.accountEdit_reg);
        passwordEdit=findViewById(R.id.passwordEdit);
        registerBt.setOnClickListener(this);

    }


    @Override
    public void success(String info) {
        Log.i(TAG,info);
    }

    @Override
    public void errr(String error) {
        Log.i(TAG,error);
    }

    @Override
    public void onClick(View view) {
        String account= accountEdit_reg.getText().toString().trim();
        String password=accountEdit.getText().toString().trim();
        VolleyUtil.logoin(account,password,RegisterActivity.this);
    }
}
