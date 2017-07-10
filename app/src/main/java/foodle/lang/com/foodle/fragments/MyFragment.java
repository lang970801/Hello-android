package foodle.lang.com.foodle.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import foodle.lang.com.foodle.R;

public class MyFragment extends Fragment {
    private View view;
    private TextView userName;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      if(view==null){
          view=inflater.inflate(R.layout.fragment_my_layout,container,false);
      }
        return view;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ((ViewGroup)view.getParent()).removeView(view);
    }
}
