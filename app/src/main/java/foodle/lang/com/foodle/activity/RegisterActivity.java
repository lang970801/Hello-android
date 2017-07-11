package foodle.lang.com.foodle.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import foodle.lang.com.foodle.R;

/**
 * Created by Administrator on 2017/6/25.
 */
public class RegisterActivity extends Activity {
    private EditText accountEdit, passwordEdit;
    private Button registerBt;
    private static  final String FILE_NAME="reg_data";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerlayout);
    }


}
