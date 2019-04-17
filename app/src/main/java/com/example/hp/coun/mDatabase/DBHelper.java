package com.example.hp.coun.mDatabase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {


    // public String f;
    public String retriveQuery;
    // Database Version
    private static final int DATABASE_VERSION = 5;

    // Database Name
    private static final String DATABASE_NAME = "country.db";

    // Labels table name
    private static final String TABLE_LABELS = "country";

    // Labels Table Columns names

   /* private static final String KEY_NAME = "Country";
    private static final String KEY_CAPITAL = "Capital"; */




    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Category table create query
      /* String CREATE_CATEGORIES_TABLE = "CREATE TABLE " + TABLE_LABELS + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT, " + KEY_CAPITAL + " TEXT, " + KEY_FLAG + " TEXT," + KEY_POPULATION + " TEXT," + KEY_GDP + " TEXT, " + KEY_AREA + " TEXT, " + KEY_LANGUAGE + " TEXT)";
        db.execSQL(CREATE_CATEGORIES_TABLE);*/
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
       /* db.execSQL("DROP TABLE IF EXISTS " + TABLE_LABELS);

        // Create tables again
        onCreate(db);*/
    }



    /**
     * Getting all labels
     * returns list of labels
     * */
    public List<String> getAllLabels(){
        List<String> labels = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  * FROM country" ;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllMountains(){
        List<String> labels = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  * FROM Mountains";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllLakes(){
        List<String> labels = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  * FROM Lakes";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllAtlanticOcean(){
        List<String> labels = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  * FROM Atlantic_Ocean";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllArcticOcean(){
        List<String> labels = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  * FROM Artic_Ocean";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllAntarticOcean(){
        List<String> labels = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  * FROM Antartic_Ocean";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllIndianOcean(){
        List<String> labels = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  * FROM Indian_Ocean";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllPacificOcean(){
        List<String> labels = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  * FROM Pacific_Ocean";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllTallestDam(){
        List<String> labels = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  * FROM Tallest_Dams";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }
    public List<String> getAllUCDam(){
        List<String> labels = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  * FROM under_Construction_Dam";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return labels;
    }

    public String capit(String sp)
    {
        retriveQuery="select * from country where Country='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(1);
        result.close();
        return r;
    }

    public String fla(String sp)
    {
        retriveQuery="select * from country where Country='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(8);
        result.close();
        return r;
    }

    public String pop(String sp)
    {
        retriveQuery="select * from country where Country='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(2);
        result.close();
        return r;
    }
    public String lang(String sp)
    {
        retriveQuery="select * from country where Country='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(3);
        result.close();
        return r;
    }
    public String neigh(String sp)
    {
        retriveQuery="select * from country where Country='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(4);
        result.close();
        return r;
    }
    public String curr(String sp)
    {
        retriveQuery="select * from country where Country='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(5);
        result.close();
        return r;
    }

    public String gd(String sp)
    {
        retriveQuery="select * from country where Country='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(6);
        result.close();
        return r;
    }

    public String are(String sp)
    {
        retriveQuery="select * from country where Country='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(7);
        result.close();
        return r;
    }

    public String mountainname(String sp)
    {
        retriveQuery="select * from Mountains where MountainName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(0);
        result.close();
        return r;
    }
    public String lakename(String sp)
    {
        retriveQuery="select * from Lakes where LakeName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(0);
        result.close();
        return r;
    }
    public String lakecontinent(String sp)
    {
        retriveQuery="select * from Lakes where LakeName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(1);
        result.close();
        return r;

    }
    public String lakesize(String sp)
    {
        retriveQuery="select * from Lakes where LakeName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(2);
        result.close();
        return r;
    }

    public String atlanticname(String sp)
    {
        retriveQuery="select * from Atlantic_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(0);
        result.close();
        return r;
    }
    public String atlanticarea(String sp)
    {
        retriveQuery="select * from Atlantic_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(1);
        result.close();
        return r;
    }
    public String atlanticdepth(String sp)
    {
        retriveQuery="select * from Atlantic_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(2);
        result.close();
        return r;
    }
    public String atlanticcountry(String sp)
    {
        retriveQuery="select * from Atlantic_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(3);
        result.close();
        return r;
    }

    public String articname(String sp)
    {
        retriveQuery="select * from Artic_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(0);
        result.close();
        return r;
    }
    public String articarea(String sp)
    {
        retriveQuery="select * from Artic_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(1);
        result.close();
        return r;
    }
    public String articdepth(String sp)
    {
        retriveQuery="select * from Artic_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(2);
        result.close();
        return r;
    }
    public String articcountry(String sp)
    {
        retriveQuery="select * from Artic_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(3);
        result.close();
        return r;
    }

    public String antarticname(String sp)
    {
        retriveQuery="select * from Antartic_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(0);
        result.close();
        return r;
    }
    public String antarticarea(String sp)
    {
        retriveQuery="select * from Antartic_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(1);
        result.close();
        return r;
    }
    public String antarticdepth(String sp)
    {
        retriveQuery="select * from Antartic_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(2);
        result.close();
        return r;
    }
    public String antarticcountry(String sp)
    {
        retriveQuery="select * from Antartic_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(3);
        result.close();
        return r;
    }
    public String indianname(String sp)
    {
        retriveQuery="select * from Indian_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(0);
        result.close();
        return r;
    }
    public String indianarea(String sp)
    {
        retriveQuery="select * from Indian_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(1);
        result.close();
        return r;
    }
    public String indiandepth(String sp)
    {
        retriveQuery="select * from Indian_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(2);
        result.close();
        return r;
    }
    public String indiancountry(String sp)
    {
        retriveQuery="select * from Indian_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(3);
        result.close();
        return r;
    }
    public String pacificname(String sp)
    {
        retriveQuery="select * from Pacific_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(0);
        result.close();
        return r;
    }
    public String pacificarea(String sp)
    {
        retriveQuery="select * from Pacific_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(1);
        result.close();
        return r;
    }
    public String pacificdepth(String sp)
    {
        retriveQuery="select * from Pacific_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(2);
        result.close();
        return r;
    }
    public String pacificcountry(String sp)
    {
        retriveQuery="select * from Pacific_Ocean where SeaName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(3);
        result.close();
        return r;
    }
    public String tallestdamname(String sp)
    {
        retriveQuery="select * from Tallest_Dams where DamName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(0);
        result.close();
        return r;
    }
    public String tallestdamheight(String sp)
    {
        retriveQuery="select * from Tallest_Dams where DamName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(1);
        result.close();
        return r;
    }
    public String tallestdamtype(String sp)
    {
        retriveQuery="select * from Tallest_Dams where DamName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(2);
        result.close();
        return r;
    }
    public String tallestdamcountry(String sp)
    {
        retriveQuery="select * from Tallest_Dams where DamName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(3);
        result.close();
        return r;
    }
    public String tallestdamriver(String sp)
    {
        retriveQuery="select * from Tallest_Dams where DamName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(4);
        result.close();
        return r;
    }
    public String ucname(String sp)
    {
        retriveQuery="select * from Under_Construction_Dam where DamName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(0);
        result.close();
        return r;
    }
    public String ucheight(String sp)
    {
        retriveQuery="select * from Under_Construction_Dam where DamName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(1);
        result.close();
        return r;
    }
    public String uctype(String sp)
    {
        retriveQuery="select * from Under_Construction_Dam where DamName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(2);
        result.close();
        return r;
    }
    public String uccountry(String sp)
    {
        retriveQuery="select * from Under_Construction_Dam where DamName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(3);
        result.close();
        return r;
    }
    public String ucriver(String sp)
    {
        retriveQuery="select * from Under_Construction_Dam where DamName='"+sp+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(retriveQuery, null);
        result.moveToFirst();
        String r = result.getString(4);
        result.close();
        return r;
    }
}
