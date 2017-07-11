package foodle.lang.com.foodle.fragments;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import foodle.lang.com.foodle.R;
import foodle.lang.com.foodle.activity.logoinActivity;

public class HomeFragment extends Fragment implements View.OnClickListener {
    private View view;
    private ListView home_lv;
    private String mParam;
    private ImageView img;
    private static final int VIEWPAGER = 0;
    private static final String PRCTURE_LATEST_PARAM = "param";
//    private Handler mhandler=new Handler(){
//        @Override
//        public void handleMessage(Message msg) {
//           switch (msg.what){
//               case VIEWPAGER:
//                   break;
//           }
//        }
//    };
    public static HomeFragment newInstance(String param) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(PRCTURE_LATEST_PARAM , param);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            mParam = savedInstanceState.getString(PRCTURE_LATEST_PARAM);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_home_layout, container, false);
            init(view);
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    private void init(View view) {
        home_lv=view.findViewById(R.id.home_lv);
        img=view.findViewById(R.id.home_img);
        img.setOnClickListener(this);

//        SimpleAdapter adapter=new SimpleAdapter(view.getContext(),)
//        home_lv.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ((ViewGroup) view.getParent()).removeView(view);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.home_img:
                Intent intent=new Intent(view.getContext(),logoinActivity.class);
                startActivity(intent);
                break;
        }
    }
}

