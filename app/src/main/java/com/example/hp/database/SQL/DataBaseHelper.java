package com.example.hp.database.SQL;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "BeneficiaryManager.db" ;
    public static final String TABLE_NAME = "beneficiary" ;
    public static final String NAME = "beneficiary_name" ;
    public static final String EMAIL = "beneficiary_email" ;
    public static final String ADDRESS = "beneficiary_address" ;
    public static final String COUNTRY = "beneficiary_country" ;

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 2);
        SQLiteDatabase db = this.getWritableDatabase() ;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(beneficiary_name TEXT,beneficiary_email TEXT,beneficiary_address TEXT,beneficiary_country TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME );
        onCreate(db);

    }
}
