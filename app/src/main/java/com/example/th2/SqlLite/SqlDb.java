package com.example.th2.SqlLite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.th2.Model.Job;

import java.util.ArrayList;
import java.util.List;

public class SqlDb extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "TH2.db";
    private static int DATABASE_VERSION = 1;

    public SqlDb(@Nullable Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlCreateDB = "CREATE TABLE job("+
                "code INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "image INTEGER,"+
                "name TEXT,"+
                "content TEXT,"+
                "date TEXT,"+
                "actions TEXT,"+
                "collab TEXT)";
        db.execSQL(sqlCreateDB);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }
    public List<Job> GetAllJob(){
        List<Job> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        String order = "date DESC";
        Cursor rs = sqLiteDatabase.query("job",
                null,null,null,null,null,order);
        while ((rs != null) && (rs.moveToNext())) {
            int code= rs.getInt(0);
            int image = rs.getInt(1);
            String name = rs.getString(2);
            String context = rs.getString(3);
            String date = rs.getString(4);
            String action = rs.getString(5);
            String collab = rs.getString(6);
            list.add(new Job(image,code,name,context,date,action,collab));
        }
        return list;
    }
    public void addJob(Job i){
        String sql = "INSERT INTO job(image,name,content,date,actions,collab)"+
                "VALUES(?,?,?,?,?,?)";
        String[] args = {String.valueOf(i.getImage()), i.getName(), i.getContent(),i.getDate(),i.getAction(),i.getCollab()};
        SQLiteDatabase st = getWritableDatabase();
        st.execSQL(sql,args);
    }
    public void updateJob(Job i) {
        String sql = "UPDATE job SET image = ?, name=? ,content=? ,date=? ,action2=? ,collab=?  WHERE code = ?";
        String[] args = {String.valueOf(i.getImage()), i.getName(), i.getContent(),
                i.getDate(),i.getAction(),i.getCollab(),String.valueOf(i.getCode())};
        SQLiteDatabase st = getWritableDatabase();
        st.execSQL(sql,args);
    }
    public void deleteJob(int code){
        String sql = "DELETE FROM items WHERE code = ?";
        String[] args = {Integer.toString(code)};
        SQLiteDatabase st = getWritableDatabase();
        st.execSQL(sql, args);
    }
    //SQLiteDatabase sqLiteDatabase = getReadableDatabase();
}
