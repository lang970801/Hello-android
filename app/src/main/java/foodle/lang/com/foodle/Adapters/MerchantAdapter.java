package foodle.lang.com.foodle.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import foodle.lang.com.foodle.R;
import foodle.lang.com.foodle.domain.ShouMerchant;
/**
 * Created by Administrator on 2017/7/13.
 */
public class MerchantAdapter extends BaseAdapter{
    private static final String TAG = "Merchanadapter";
    private Context context;
    private List<ShouMerchant>list;
    private LayoutInflater inflater;
    public MerchantAdapter(Context context, List<ShouMerchant>list){
        this.context=context;
        this.list=list;
        this.inflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder=null;
        if (view==null){
            holder=new ViewHolder();
            view=inflater.inflate(R.layout.home_merchan_layout,null);
            holder.imageView=view.findViewById(R.id.merchan_layout_iv);
            holder.textView=view.findViewById(R.id.merchan_layout_tv);
            view.setTag(holder);
        }
        else {
            holder= (ViewHolder) view.getTag();
        }
        holder.imageView.setImageResource(list.get(i).getIv());
        holder.textView.setText(list.get(i).getTv());

        return view;
    }
    class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}

