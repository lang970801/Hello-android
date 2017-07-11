package foodle.lang.com.foodle.adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

import foodle.lang.com.foodle.R;

/**
 * Created by Administrator on 2017/7/11/011.
 */
public class Merchanadpter extends BaseAdapter {
    private Context context;
    private List<Map<String,Object>>list;
    private LayoutInflater inflater;
    public Merchanadpter(Context context,List<Map<String,Object>>list){
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
            view=inflater.inflate(R.layout.fragment_home_layout,null);
            holder.imageView=view.findViewById(R.id.merchan_layout_iv);
            holder.textView=view.findViewById(R.id.merchan_layout_tv);
            view.setTag(holder);
        }
        else {
            holder= (ViewHolder) view.getTag();
        }
        holder.imageView.setImageResource((Integer) list.get(i).get("img"));
        holder.textView.setText((Integer) list.get(i).get("text"));
        return view;
    }
    class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
