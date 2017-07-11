package foodle.lang.com.foodle.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import foodle.lang.com.foodle.R;
import foodle.lang.com.foodle.activity.logoinActivity;

public class MyFragment extends Fragment implements View.OnClickListener {
    private View view;
    private TextView logoin_tv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      if(view==null){
          view=inflater.inflate(R.layout.fragment_my_layout,container,false);
          init();
      }
        return view;
    }

    private void init() {
        logoin_tv=view.findViewById(R.id.my_logoin_tv);
        logoin_tv.setOnClickListener(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ((ViewGroup)view.getParent()).removeView(view);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.my_logoin_tv:
                Intent intent=new Intent(view.getContext(),logoinActivity.class);
                startActivity(intent);
                break;
        }
    }
}
