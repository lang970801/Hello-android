package foodle.lang.com.foodle.utils;

import android.app.ActionBar;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

/**
 * Created by Administrator on 2017/7/13/013.
 */

public class PopupWindowUtil {
    private View mButton;
    private PopupWindow popupWindow;
    public PopupWindowUtil(View popupView,View bt1){
        popupWindow=new PopupWindow(popupView, ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT,true);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable(Resources.getSystem(),(Bitmap)null));
        mButton=bt1;
        Log.e("papapa", String.valueOf(bt1));
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                popupWindow.showAsDropDown(view);
            }
        });
    }


}
