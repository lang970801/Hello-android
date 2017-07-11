package foodle.lang.com.foodle.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import foodle.lang.com.foodle.R;

/**
 * Created by Administrator on 2017/7/11.
 */
public class logoinActivity extends Activity implements View.OnClickListener {
    private TextView remeTv;
    private ImageView logoin_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logoin_layout);
        init();
    }

    private void init() {
          logoin_img=findViewById(R.id.logoin_denglu_img);
         logoin_img.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.logoin_denglu_img:
                Intent intent=new Intent(logoinActivity.this,RegisterActivity.class);
                startActivity(intent);
                break;
        }
    }
}
