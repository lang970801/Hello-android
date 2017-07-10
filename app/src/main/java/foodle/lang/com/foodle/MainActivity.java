package foodle.lang.com.foodle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import foodle.lang.com.foodle.fragments.FoodieFranment;
import foodle.lang.com.foodle.fragments.HomeFragment;
import foodle.lang.com.foodle.fragments.MyFragment;
import foodle.lang.com.foodle.fragments.MerchantFrafement;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends FragmentActivity implements ViewPager.OnPageChangeListener,View.OnClickListener {
    private RadioGroup rg;
    private ViewPager pager;
    private List<Fragment> fragment;
    private String flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        flag = getIntent().getStringExtra("flag");
        rg= (RadioGroup) findViewById(R.id.rg);
        pager= (ViewPager) findViewById(R.id.viewpager);
        findViewById(R.id.home).setOnClickListener(this);
        findViewById(R.id.foodie).setOnClickListener(this);
        findViewById(R.id.merchant).setOnClickListener(this);
        findViewById(R.id.my).setOnClickListener(this);

        fragment=new ArrayList<Fragment>();
        fragment.add(new HomeFragment());
        fragment.add(new FoodieFranment());
        fragment.add(new MerchantFrafement());
        fragment.add(new MyFragment());

        pager.setAdapter(new FragmentPagerAdapter(this.getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {

                return fragment.get(position);
            }
            @Override
            public int getCount() {

                return fragment.size();
            }
        });
        pager.setOnPageChangeListener(this);
        rg.check(R.id.home);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.home:
                Toast.makeText(MainActivity.this,"点击了1", LENGTH_SHORT).show();
                pager.setCurrentItem(0,true);
                break;
            case  R.id.foodie:
                pager.setCurrentItem(1,true);
                break;
            case  R.id.merchant:
                pager.setCurrentItem(2,true);
                break;
            case  R.id.my:
                pager.setCurrentItem(3,true);
                break;
        }
    }

    @Override
    public void finish() {
        super.finish();
        ViewGroup viewGroup= (ViewGroup) getWindow().getDecorView();
        viewGroup.removeAllViews();
    }
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position){
            case 0:
                rg.check(R.id.home);
                break;
            case 1:
                rg.check(R.id.foodie);
                break;
            case 2:
                rg.check(R.id.merchant);
                break;
            case 3:
                rg.check(R.id.my);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }
}
