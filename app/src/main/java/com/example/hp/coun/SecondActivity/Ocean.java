package com.example.hp.coun.SecondActivity;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.coun.R;
import com.example.hp.coun.mDatabase.DBHelper;
import com.example.hp.coun.mDatabase.DatabaseHelper;

import java.io.IOException;
import java.util.List;

public class Ocean extends AppCompatActivity {
    TextView t;
    Spinner ac;
    private DatabaseHelper mDBHelper;
    private SQLiteDatabase mDb;
    String oceanname, area,size,country;
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
        //setContentView(R.layout.activity_ocean);
        String data = getIntent().getExtras().getString("name",null);
        switch (data) {

            case "Atlantic Oceans":
                setContentView(R.layout.atlantic_ocean_detail_layout);
                ac=(Spinner) findViewById(R.id.atlanticAuto) ;
                ac.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        DBHelper d = new DBHelper(Ocean.this);
                        String name=(String)parent.getItemAtPosition(position);
                        oceanname=d.atlanticname(name);
                        t=(TextView)findViewById(R.id.atoceanname);
                        t.setText(oceanname);

                        area=d.atlanticarea(name);
                        t=(TextView)findViewById(R.id.atoceanarea);
                        t.setText(area);

                        size=d.atlanticdepth(name);
                        t=(TextView)findViewById(R.id.atoceandepth);
                        t.setText(size);

                        country=d.atlanticcountry(name);
                        t=(TextView)findViewById(R.id.atoceancountry);
                        t.setText(country);
                        Toast.makeText(Ocean.this,"Atlantic Ocean " +name,Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                loadSpinnerDataAtlanticOcean();
                break;
            case "Arctic Oceans":
                setContentView(R.layout.arctic_ocean_detail_layout);
                ac=(Spinner) findViewById(R.id.arcticAuto) ;
                ac.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        DBHelper d = new DBHelper(Ocean.this);
                        String name=(String)parent.getItemAtPosition(position);
                        oceanname=d.articname(name);
                        t=(TextView)findViewById(R.id.aroceanname);
                        t.setText(oceanname);

                        area=d.articarea(name);
                        t=(TextView)findViewById(R.id.aroceanarea);
                        t.setText(area);

                        size=d.articdepth(name);
                        t=(TextView)findViewById(R.id.aroceandepth);
                        t.setText(size);

                        country=d.articcountry(name);
                        t=(TextView)findViewById(R.id.aroceancountry);
                        t.setText(country);
                        Toast.makeText(Ocean.this,"Arctic Ocean " +name,Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                loadSpinnerDataArcticOcean();
                break;
            case "Antartic Oceans":
                setContentView(R.layout.antartic_ocean_detail_layout);
                ac=(Spinner) findViewById(R.id.antarticAuto) ;
                ac.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        DBHelper d = new DBHelper(Ocean.this);
                        String name=(String)parent.getItemAtPosition(position);
                        oceanname=d.antarticname(name);
                        t=(TextView)findViewById(R.id.anoceanname);
                        t.setText(oceanname);

                        area=d.antarticarea(name);
                        t=(TextView)findViewById(R.id.anoceanarea);
                        t.setText(area);

                        size=d.antarticdepth(name);
                        t=(TextView)findViewById(R.id.anoceandepth);
                        t.setText(size);

                        country=d.antarticcountry(name);
                        t=(TextView)findViewById(R.id.anoceancountry);
                        t.setText(country);
                        Toast.makeText(Ocean.this,"Antartic Ocean " +name,Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                loadSpinnerDataAntarticOcean();
                break;
            case "Indian Oceans":
                setContentView(R.layout.indian_ocean_detail_layout);
                ac=(Spinner) findViewById(R.id.indianAuto) ;
                ac.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        DBHelper d = new DBHelper(Ocean.this);
                        String name=(String)parent.getItemAtPosition(position);
                        oceanname=d.indianname(name);
                        t=(TextView)findViewById(R.id.inoceanname);
                        t.setText(oceanname);

                        area=d.indianarea(name);
                        t=(TextView)findViewById(R.id.inoceanarea);
                        t.setText(area);

                        size=d.indiandepth(name);
                        t=(TextView)findViewById(R.id.inoceandepth);
                        t.setText(size);

                        country=d.indiancountry(name);
                        t=(TextView)findViewById(R.id.inoceancountry);
                        t.setText(country);
                        Toast.makeText(Ocean.this,"Indian Ocean " +name,Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                loadSpinnerDataIndianOcean();
                break;
            case "Pacific Oceans":
                setContentView(R.layout.pacific_ocean_detail_layout);
                ac=(Spinner) findViewById(R.id.pacificAuto) ;
                ac.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        DBHelper d = new DBHelper(Ocean.this);
                        String name=(String)parent.getItemAtPosition(position);
                        oceanname=d.pacificname(name);
                        t=(TextView)findViewById(R.id.poceanname);
                        t.setText(oceanname);

                        area=d.pacificarea(name);
                        t=(TextView)findViewById(R.id.poceanarea);
                        t.setText(area);

                        size=d.pacificdepth(name);
                        t=(TextView)findViewById(R.id.poceandepth);
                        t.setText(size);

                        country=d.pacificcountry(name);
                        t=(TextView)findViewById(R.id.poceancountry);
                        t.setText(country);
                        Toast.makeText(Ocean.this,"Pacific Ocean " +name,Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                loadSpinnerDataPacificOcean();
                break;
        }
    }
    private void loadSpinnerDataAtlanticOcean() {
        // database handler
        DBHelper db = new DBHelper(getApplicationContext());
        //  DatabaseHelper mDBHelper=new DatabaseHelper(getApplicationContext());

        // Spinner Drop down elements
        List<String> LakeNameList = db.getAllAtlanticOcean();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, LakeNameList);

        ac=(Spinner) findViewById(R.id.atlanticAuto) ;
        ac.setAdapter(adapter);
        // ac.setThreshold(1);//start searching from 1 character
        ac.setAdapter(adapter);
    }
    private void loadSpinnerDataArcticOcean() {
        // database handler
        DBHelper db = new DBHelper(getApplicationContext());
        //  DatabaseHelper mDBHelper=new DatabaseHelper(getApplicationContext());

        // Spinner Drop down elements
        List<String> LakeNameList = db.getAllArcticOcean();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, LakeNameList);

        ac=(Spinner) findViewById(R.id.arcticAuto) ;
        ac.setAdapter(adapter);
        // ac.setThreshold(1);//start searching from 1 character
        ac.setAdapter(adapter);
    }
    private void loadSpinnerDataAntarticOcean() {
        // database handler
        DBHelper db = new DBHelper(getApplicationContext());
        //  DatabaseHelper mDBHelper=new DatabaseHelper(getApplicationContext());

        // Spinner Drop down elements
        List<String> LakeNameList = db.getAllAntarticOcean();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, LakeNameList);

        ac=(Spinner) findViewById(R.id.antarticAuto) ;
        ac.setAdapter(adapter);
        // ac.setThreshold(1);//start searching from 1 character
        ac.setAdapter(adapter);
    }
    private void loadSpinnerDataIndianOcean() {
        // database handler
        DBHelper db = new DBHelper(getApplicationContext());
        //  DatabaseHelper mDBHelper=new DatabaseHelper(getApplicationContext());

        // Spinner Drop down elements
        List<String> LakeNameList = db.getAllIndianOcean();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, LakeNameList);

        ac=(Spinner) findViewById(R.id.indianAuto) ;
        ac.setAdapter(adapter);
        // ac.setThreshold(1);//start searching from 1 character
        ac.setAdapter(adapter);
    }
    private void loadSpinnerDataPacificOcean() {
        // database handler
        DBHelper db = new DBHelper(getApplicationContext());
        //  DatabaseHelper mDBHelper=new DatabaseHelper(getApplicationContext());

        // Spinner Drop down elements
        List<String> LakeNameList = db.getAllPacificOcean();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, LakeNameList);

        ac=(Spinner) findViewById(R.id.pacificAuto) ;
        ac.setAdapter(adapter);
        // ac.setThreshold(1);//start searching from 1 character
        ac.setAdapter(adapter);
    }
}
