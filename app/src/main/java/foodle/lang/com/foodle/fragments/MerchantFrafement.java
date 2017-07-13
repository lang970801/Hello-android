package foodle.lang.com.foodle.fragments;

import android.app.ActionBar;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupWindow;


import java.util.ArrayList;
import java.util.List;

import foodle.lang.com.foodle.Adapters.MerchantAdapter;
import foodle.lang.com.foodle.R;
import foodle.lang.com.foodle.domain.ShouMerchant;
import foodle.lang.com.foodle.utils.PopupWindowUtil;

public class MerchantFrafement extends Fragment {
    private View view;
    private PopupWindow popupWindow;
    private Button mButton;
    private MerchantAdapter mMerchanadpter;
    private List<ShouMerchant> lists;
    private ShouMerchant shouMerchant;
    private ListView lv;
    private PopupWindowUtil pop;
    private Button bt1;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view==null){
            view=inflater.inflate(R.layout.fragment_merchant_layout,container,false);
            init(view);
        }
        return view;
    }

    private void init(View view) {
        bt1=view.findViewById(R.id.merchan_bt1);
        //适配数据
        lv=view.findViewById(R.id.merchan_lv);
        shouMerchant=new ShouMerchant();
        lists=new ArrayList<ShouMerchant>();
        shouMerchant.setIv(R.mipmap.logo);
        shouMerchant.setTv("实物介绍");
        lists.add(shouMerchant);

        mMerchanadpter=new MerchantAdapter(getActivity(),lists);
        lv.setAdapter(mMerchanadpter);

        //实现筛选栏功能
        final View popupView=getActivity().getLayoutInflater().inflate(R.layout.merchan_filter_column,null);
        pop=new PopupWindowUtil(popupView,bt1);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ((ViewGroup)view.getParent()).removeView(view);

    }
}
