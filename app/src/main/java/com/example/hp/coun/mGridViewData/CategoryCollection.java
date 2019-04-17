package com.example.hp.coun.mGridViewData;

import com.example.hp.coun.R;

import java.util.ArrayList;

public class CategoryCollection
{
    public static ArrayList<Category> getCategory()
    {
        ArrayList<Category> c=new ArrayList<>();
        Category p=null;

        p=new Category();
        p.setName("Countries");
        p.setImage(R.drawable.countries);
        c.add(p);

        p=new Category();
        p.setName("Mountains");
        p.setImage(R.drawable.mountain);
        c.add(p);

        p=new Category();
        p.setName("Rivers");
        p.setImage(R.drawable.river);
        c.add(p);

        p=new Category();
        p.setName("Volcanos");
        p.setImage(R.drawable.volcano);
        c.add(p);

        p=new Category();
        p.setName("Desert");
        p.setImage(R.drawable.desert);
        c.add(p);

        p=new Category();
        p.setName("Lakes");
        p.setImage(R.drawable.lake);
        c.add(p);

        p=new Category();
        p.setName("Oceans");
        p.setImage(R.drawable.ocean);
        c.add(p);

        p=new Category();
        p.setName("Dam");
        p.setImage(R.drawable.dam);
        c.add(p);

        return c;
    }


}

