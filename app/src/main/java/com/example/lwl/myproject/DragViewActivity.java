package com.example.lwl.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class DragViewActivity extends AppCompatActivity implements View.OnTouchListener {
    private Button mBtnDrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag_view);
        mBtnDrag= (Button) findViewById(R.id.btn_drag);
        mBtnDrag.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("ACTION_DOWN","x:"+v.getX()+"  y:"+v.getY());
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("ACTION_MOVE","x:"+v.getX()+"  y:"+v.getY());
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        return false;
    }
}
