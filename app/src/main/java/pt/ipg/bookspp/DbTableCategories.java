package pt.ipg.bookspp;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class DbTableCategories implements BaseColumns{

    private SQLiteDatabase db;
    
    public DbTableCategories(SQLiteDatabase db){
        this.db = db;
    }

    public void create() {

    }
}

