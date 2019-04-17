package com.example.hp.coun.mGridViewData;

import com.example.hp.coun.R;

import java.util.ArrayList;

public class CategoryCollectionOcean {
    public static ArrayList<CategoryOcean> getCategory()
    {
        ArrayList<CategoryOcean> c=new ArrayList<>();
        CategoryOcean p=null;

        p=new CategoryOcean();
        p.setName("Atlantic Oceans");
        p.setImage(R.drawable.atlantic_ocean);
        c.add(p);

        p=new CategoryOcean();
        p.setName("Arctic Oceans");
        p.setImage(R.drawable.arctic_ocean);
        c.add(p);

        p=new CategoryOcean();
        p.setName("Antartic Oceans");
        p.setImage(R.drawable.antartic_ocean);
        c.add(p);

        p=new CategoryOcean();
        p.setName("Indian Oceans");
        p.setImage(R.drawable.indian_ocean);
        c.add(p);

        p=new CategoryOcean();
        p.setName("Pacific Oceans");
        p.setImage(R.drawable.pacific_ocean);
        c.add(p);

        return c;
    }
}
