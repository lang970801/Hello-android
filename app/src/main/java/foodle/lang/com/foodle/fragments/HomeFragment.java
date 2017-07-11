package foodle.lang.com.foodle.fragments;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.List;
import java.util.Map;

import foodle.lang.com.foodle.R;
public class HomeFragment extends Fragment {
    private View view;
    private ListView home_lv;
    private String mParam;
    private GridView gv;
    private ImageView img;
    private static final int VIEWPAGER = 0;
    private List<Map<String,Object>> list;
    private SimpleAdapter simpleAdapter;
    private static final String PRCTURE_LATEST_PARAM = "param";
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_home_layout, container, false);
            init(view);
        }
        return view;
    }
    private void init(View view) {
        home_lv=view.findViewById(R.id.home_lv);
        img=view.findViewById(R.id.home_img);
        home_lv=view.findViewById(R.id.home_lv);
        gv=view.findViewById(R.id.gv_layout);

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ((ViewGroup) view.getParent()).removeView(view);
    }
}

