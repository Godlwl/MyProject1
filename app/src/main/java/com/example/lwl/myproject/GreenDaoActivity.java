package com.example.lwl.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lwl.myproject.greendao.DaoSession;
import com.example.lwl.myproject.greendao.UserDao;

public class GreenDaoActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText mEtId;
    private EditText mEtName;
    private EditText mEtAge;
    private Button mBtnAdd;
    private Button mBtnDel;
    private Button mBtnUpda;
    private Button mBtnSear;
    private DaoSession session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green_dao);
        initView();
         session=GreenDaoUtils.getSingleTon().getmDaoSession();
    }

    private void initView() {
        mEtId= (EditText) findViewById(R.id.et_id);
        mEtName= (EditText) findViewById(R.id.et_name);
        mEtAge= (EditText) findViewById(R.id.et_age);
        mBtnAdd= (Button) findViewById(R.id.btn_add);
        mBtnDel= (Button) findViewById(R.id.btn_del);
        mBtnUpda= (Button) findViewById(R.id.btn_upda);
        mBtnSear= (Button) findViewById(R.id.btn_search);
        mBtnAdd.setOnClickListener(this);
        mBtnDel.setOnClickListener(this);
        mBtnUpda.setOnClickListener(this);
        mBtnSear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_add:
                User user=new User(Long.parseLong(mEtId.getText().toString()),mEtName.getText().toString(),Integer.valueOf(mEtAge.getText().toString()));
                session.getUserDao().insert(user);
                break;
            case R.id.btn_del:
                session.getUserDao().deleteByKey(Long.parseLong(mEtId.getText().toString()));
                break;
            case R.id.btn_upda:
                session.getUserDao().update(new User(Long.parseLong(mEtId.getText().toString()),mEtName.getText().toString(),Integer.valueOf(mEtAge.getText().toString())));
                break;
            case R.id.btn_search:
                Toast.makeText(this,session.getUserDao().loadAll().get(0).getName(),Toast.LENGTH_LONG).show();
                break;
        }

    }
}
