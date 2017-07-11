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

import java.util.HashMap;
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
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_home_layout, container, false);
            init(view);
        }
        return view;
    }
    private void init(View view) {
        ininData();
        home_lv=view.findViewById(R.id.home_lv);
        img=view.findViewById(R.id.home_img);
        gv=view.findViewById(R.id.gv_layout);
    }

    private void ininData() {
        String[] imgNanme = getResources().getStringArray(R.array.imgName);
        int[] img={R.mipmap.ic_dd,R.mipmap.ic_wm, R.mipmap.ic_xckc,R.mipmap.ic_gac, R.mipmap.ic_hg,R.mipmap.ic_zzc_pp,
                R.mipmap.ic_srdg,R.mipmap.ic_tdyp,};
        for (int i=0;i<imgNanme.length;i++){
            Map<String,Object> map=new HashMap<String,Object>();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ((ViewGroup) view.getParent()).removeView(view);
    }
}

