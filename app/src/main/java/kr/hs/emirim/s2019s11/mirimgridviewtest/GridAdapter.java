package kr.hs.emirim.s2019s11.mirimgridviewtest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] imgRes = {R.drawable.poster1,R.drawable.poster2,R.drawable.poster3,R.drawable.poster4,R.drawable.poster5,
            R.drawable.poster6,R.drawable.poster7,R.drawable.poster8,R.drawable.poster9,R.drawable.poster10,
            R.drawable.poster11,R.drawable.poster12,R.drawable.poster13,R.drawable.poster14,R.drawable.poster15,
            R.drawable.poster16,R.drawable.poster17,R.drawable.poster18,R.drawable.poster19,R.drawable.poster20};

    public GridAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return imgRes.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new GridView.LayoutParams(200, 300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5, 5, 5, 5);
        imgv.setImageResource(imgRes[position]);
        return imgv;
    }
}
