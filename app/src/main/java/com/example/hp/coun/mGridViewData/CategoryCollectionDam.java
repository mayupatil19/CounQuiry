package com.example.hp.coun.mGridViewData;

import com.example.hp.coun.R;

import java.util.ArrayList;

public class CategoryCollectionDam {
    public static ArrayList<CategoryDam> getCategorydam()
    {
        ArrayList<CategoryDam> c=new ArrayList<>();
        CategoryDam p=null;

        p=new CategoryDam();
        p.setName("Dams");
        p.setImage(R.drawable.dam_all);
        c.add(p);

        p=new CategoryDam();
        p.setName("Tallest Dams");
        p.setImage(R.drawable.tallest_dam);
        c.add(p);

        p=new CategoryDam();
        p.setName("Dams Under Construction");
        p.setImage(R.drawable.underconstructiondam);
        c.add(p);
        return c;
    }
}
