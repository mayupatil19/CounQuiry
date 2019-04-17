package com.example.hp.coun.SecondActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.coun.R;
import com.example.hp.coun.mDatabase.DBHelper;
import com.example.hp.coun.mDatabase.DatabaseHelper;
import com.example.hp.coun.mGridViewData.CategoryCollection;
import com.example.hp.coun.mGridViewData.CategoryCollectionDam;
import com.example.hp.coun.mGridViewData.CategoryCollectionOcean;
import com.example.hp.coun.mGridview_Adapter.GridViewAdapter;
import com.example.hp.coun.mGridview_Adapter.GridViewAdapterDams;
import com.example.hp.coun.mGridview_Adapter.GridViewAdapterOceans;

import java.io.IOException;
import java.util.List;

public class country extends AppCompatActivity {
    private DatabaseHelper mDBHelper;
    private SQLiteDatabase mDb;
    private AutoCompleteTextView countryAuto;
    String cap,pop,lang,niegh,curr,gdp,area,flag;
    TextView t1,t2,t3,t4,t5,t6,t7;
    TextView t8,t9,t10,t11,t12,t13,t14;
    String mounname,lakename,lakecont,lakesize;
    ImageView i;
    Spinner ac;
    GridView gv,gi;
    private ImageView imgSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mDBHelper = new DatabaseHelper(this);

        try{
            mDBHelper.updateDataBase();
        }catch (IOException mIOException) {
            throw new Error("UnableToUpdateDatabase");
        }

        try  {
            mDb = mDBHelper.getWritableDatabase();
        } catch (Exception e){
            throw e;
        }

        String data = getIntent().getExtras().getString("name",null);
        switch (data) {
            case "Countries":
                setContentView(R.layout.country_detail_layout);
                String[] countryNameList = {"India", "China", "Australia", "New Zealand", "England", "Pakistan"};
                countryAuto = (AutoCompleteTextView) findViewById(R.id.countryAuto);
                countryAuto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent, View view, int position, long rowId) {
                        DBHelper d = new DBHelper(country.this);
                        String selection = (String)parent.getItemAtPosition(position);
                        cap=d.capit(selection);
                        t1=(TextView)findViewById(R.id.txtcap);
                        t1.setText(cap);
                        pop=d.pop(selection);
                        t2=(TextView)findViewById(R.id.txtpop);
                        t2.setText(pop);

                        lang=d.lang(selection);
                        t3=(TextView)findViewById(R.id.txtlang);
                        t3.setText(lang);

                        niegh=d.neigh(selection);
                        t4=(TextView)findViewById(R.id.txtniegh);
                        t4.setText(niegh);

                        curr=d.curr(selection);
                        t5=(TextView)findViewById(R.id.txtcurr);
                        t5.setText(curr);

                        gdp=d.gd(selection);
                        t6=(TextView)findViewById(R.id.txtgdp);
                        t6.setText(gdp);

                        area=d.are(selection);
                        t7=(TextView)findViewById(R.id.txtarea);
                        t7.setText(area);
                        flag=d.fla(selection);
                        i= (ImageView)findViewById(R.id.fla);
                        int id = getResources().getIdentifier("com.example.hp.counquiry_3:drawable/" + flag, null, null);
                        i.setImageResource(id);
                    }
                });

                imgSearch=(ImageView)findViewById(R.id.imgSearch);
                loadSpinnerDataCountry();

                break;

                case "Mountains":
                    setContentView(R.layout.detail_mountain_layout);
                    ac=(Spinner) findViewById(R.id.mountainAuto) ;
                    ac.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            DBHelper d = new DBHelper(country.this);
                            String name=(String)parent.getItemAtPosition(position);
                          /*  mounname=d.mountainname(name);
                            t8=(TextView)findViewById(R.id.txtname);
                            t8.setText(mounname);*/
                            Toast.makeText(country.this,"Mountains" +name,Toast.LENGTH_LONG).show();

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });


                    loadSpinnerDataMountain();
                    break;
            case "Lakes":
                setContentView(R.layout.lake_detail_layout);
                ac=(Spinner) findViewById(R.id.lakeAuto) ;
                ac.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        DBHelper d = new DBHelper(country.this);
                        String name=(String)parent.getItemAtPosition(position);
                        lakename=d.lakename(name);
                        t8=(TextView)findViewById(R.id.lakename);
                        t8.setText(lakename);

                        lakecont=d.lakecontinent(name);
                        t8=(TextView)findViewById(R.id.lakecontinent);
                        t8.setText(lakecont);

                        lakesize=d.lakesize(name);
                        t8=(TextView)findViewById(R.id.lakesize);
                        t8.setText(lakesize);
                        Toast.makeText(country.this,"lake" +name,Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                loadSpinnerDataLake();
                break;
            case "Oceans":
                setContentView(R.layout.activity_country);
                gv = (GridView) findViewById(R.id.gridviewoceans);
                GridViewAdapterOceans gridViewAdapter = new GridViewAdapterOceans(this, CategoryCollectionOcean.getCategory());
                gv.setAdapter(gridViewAdapter);

                break;
            case "Rivers":
                setContentView(R.layout.river_detail_layout);
                break;
            case "Dam":
                setContentView(R.layout.dam_grid_layout);
                gi = (GridView) findViewById(R.id.gridviewdam);
                GridViewAdapterDams gridViewAdapter2 = new GridViewAdapterDams(this, CategoryCollectionDam.getCategorydam());
                gi.setAdapter(gridViewAdapter2);


                break;
            case "Desert":
                setContentView(R.layout.desert_detail_layout);
                break;
            case "Volcanos":
                setContentView(R.layout.volcano_detail_layout);
                break;
            case "Dams":
                setContentView(R.layout.dam_detail_layout);
                break;
            case "Tallest Dams":
                setContentView(R.layout.tallest_dam_detail_layout);
                ac=(Spinner) findViewById(R.id.tallestdamAuto) ;
                ac.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        DBHelper d = new DBHelper(country.this);
                        String name=(String)parent.getItemAtPosition(position);
                        lakename=d.tallestdamname(name);
                        t8=(TextView)findViewById(R.id.tdname);
                        t8.setText(lakename);

                        lakename=d.tallestdamheight(name);
                        t8=(TextView)findViewById(R.id.tdheight);
                        t8.setText(lakename);


                        lakename=d.tallestdamtype(name);
                        t8=(TextView)findViewById(R.id.tdtype);
                        t8.setText(lakename);


                        lakename=d.tallestdamcountry(name);
                        t8=(TextView)findViewById(R.id.tdcountry);
                        t8.setText(lakename);


                        lakename=d.tallestdamriver(name);
                        t8=(TextView)findViewById(R.id.tdriver);
                        t8.setText(lakename);



                        Toast.makeText(country.this,"lake" +name,Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                loadSpinnerTallestdam();


                break;
            case"Dams Under Construction":
                setContentView(R.layout.under_construction_dam_detail_layout);
                ac=(Spinner) findViewById(R.id.ucdamAuto) ;
                ac.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        DBHelper d = new DBHelper(country.this);
                        String name=(String)parent.getItemAtPosition(position);
                        lakename=d.ucname(name);
                        t8=(TextView)findViewById(R.id.ucname);
                        t8.setText(lakename);

                        lakename=d.ucheight(name);
                        t8=(TextView)findViewById(R.id.ucheight);
                        t8.setText(lakename);


                        lakename=d.uctype(name);
                        t8=(TextView)findViewById(R.id.uctype);
                        t8.setText(lakename);


                        lakename=d.uccountry(name);
                        t8=(TextView)findViewById(R.id.uccountry);
                        t8.setText(lakename);


                        lakename=d.ucriver(name);
                        t8=(TextView)findViewById(R.id.ucriver);
                        t8.setText(lakename);



                        Toast.makeText(country.this,"lake" +name,Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                loadSpinnerUCdam();
                break;

        }

    }

    private void loadSpinnerDataCountry() {
        // database handler
        DBHelper db = new DBHelper(getApplicationContext());
        //  DatabaseHelper mDBHelper=new DatabaseHelper(getApplicationContext());

        // Spinner Drop down elements
        List<String> countryNameList = db.getAllLabels();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countryNameList);

        countryAuto.setAdapter(adapter);
        countryAuto.setThreshold(1);//start searching from 1 character
        countryAuto.setAdapter(adapter);
    }
    private void loadSpinnerDataMountain() {
        // database handler
        DBHelper db = new DBHelper(getApplicationContext());
        //  DatabaseHelper mDBHelper=new DatabaseHelper(getApplicationContext());

        // Spinner Drop down elements
        List<String> MountainNameList = db.getAllMountains();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, MountainNameList);

        ac=(Spinner) findViewById(R.id.mountainAuto) ;
        ac.setAdapter(adapter);
        // ac.setThreshold(1);//start searching from 1 character
        ac.setAdapter(adapter);
    }
    private void loadSpinnerDataLake() {
        // database handler
        DBHelper db = new DBHelper(getApplicationContext());
        //  DatabaseHelper mDBHelper=new DatabaseHelper(getApplicationContext());

        // Spinner Drop down elements
        List<String> LakeNameList = db.getAllLakes();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, LakeNameList);

        ac=(Spinner) findViewById(R.id.lakeAuto) ;
        ac.setAdapter(adapter);
        // ac.setThreshold(1);//start searching from 1 character
        ac.setAdapter(adapter);
    }
    private void loadSpinnerTallestdam() {
        // database handler
        DBHelper db = new DBHelper(getApplicationContext());
        //  DatabaseHelper mDBHelper=new DatabaseHelper(getApplicationContext());

        // Spinner Drop down elements
        List<String> LakeNameList = db.getAllTallestDam();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, LakeNameList);

        ac=(Spinner) findViewById(R.id.tallestdamAuto) ;
        ac.setAdapter(adapter);
        // ac.setThreshold(1);//start searching from 1 character
        ac.setAdapter(adapter);
    }
    private void loadSpinnerUCdam() {
        // database handler
        DBHelper db = new DBHelper(getApplicationContext());
        //  DatabaseHelper mDBHelper=new DatabaseHelper(getApplicationContext());

        // Spinner Drop down elements
        List<String> LakeNameList = db.getAllUCDam();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, LakeNameList);

        ac=(Spinner) findViewById(R.id.ucdamAuto) ;
        ac.setAdapter(adapter);
        // ac.setThreshold(1);//start searching from 1 character
        ac.setAdapter(adapter);
    }
}
