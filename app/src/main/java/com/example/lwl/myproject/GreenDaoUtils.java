package com.example.lwl.myproject;

import android.database.sqlite.SQLiteDatabase;

import com.example.lwl.myproject.greendao.DaoMaster;
import com.example.lwl.myproject.greendao.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * Created by LWL on 2017/3/8.
 */

public class GreenDaoUtils {

    private DaoMaster.DevOpenHelper mHelper;
    private SQLiteDatabase db;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;

    private static GreenDaoUtils greenDaoUtils;

    private GreenDaoUtils(){}

    public static GreenDaoUtils getSingleTon(){
        if (greenDaoUtils==null){
            greenDaoUtils=new GreenDaoUtils();
        }
        return greenDaoUtils;
    }

    private void initGreenDao(){
        mHelper=new DaoMaster.DevOpenHelper(MyApplication.getAppliction(),"test-db",null);

        db=mHelper.getWritableDatabase();
        mDaoMaster=new DaoMaster(db);
        mDaoSession=mDaoMaster.newSession();
    }

    public DaoSession getmDaoSession() {
        if (mDaoMaster==null){
            initGreenDao();
        }
        return mDaoSession;
    }

    public SQLiteDatabase getDb() {
        if (db==null){
            initGreenDao();
        }
        return db;
    }

}