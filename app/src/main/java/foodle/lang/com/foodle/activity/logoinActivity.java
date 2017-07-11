package foodle.lang.com.foodle.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import foodle.lang.com.foodle.R;

/**
 * Created by Administrator on 2017/7/11.
 */
public class logoinActivity extends Activity{
    private TextView remeTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logoin_layout);
//        init();
    }

    private void init() {
//        remeTv=findViewById(R.id.remeTv);
//        Intent intent=new Intent(logoinActivity.this,RegisterActivity.class);
//        startActivity(intent);
    }
}
