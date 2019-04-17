package com.example.hp.coun.mGridview_Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.coun.R;
import com.example.hp.coun.SecondActivity.Ocean;
import com.example.hp.coun.SecondActivity.country;
import com.example.hp.coun.mGridViewData.Category;
import com.example.hp.coun.mGridViewData.CategoryOcean;

import java.util.ArrayList;

public class GridViewAdapterOceans extends BaseAdapter {
    ArrayList<CategoryOcean> cl;
    Context ctx;
    // LayoutInflater inflater;
    public GridViewAdapterOceans(Context ctx, ArrayList<CategoryOcean> cl)
    {
        this.ctx=ctx;
        this.cl=cl;

    }
    @Override
    public int getCount() {
        return cl.size();
    }

    @Override
    public Object getItem(int position) {
        return cl.get(position);
    }

    @Override
    public long getItemId(int position) {
        return cl.indexOf(getItem(position));
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent)
    {


        LayoutInflater inflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view==null)
        {
            view=inflater.inflate(R.layout.grid_view_list_layout,null);
        }

        // view=inflater.inflate(R.layout.grid_view_list_layout,null);
        ImageView img=(ImageView)view.findViewById(R.id.gridviewimg);
        TextView tv=(TextView)view.findViewById(R.id.gridviewtxt);
        tv.setText(cl.get(position).getName());
        img.setImageResource(cl.get(position).getImage());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ctx, Ocean.class);
                i.putExtra("name",cl.get(position).getName());
                ctx.startActivity(i);
            }
        });
        return view;
    }
}
