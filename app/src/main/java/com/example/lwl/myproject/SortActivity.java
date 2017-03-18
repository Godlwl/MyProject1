package com.example.lwl.myproject;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;

public class SortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);
        int [] a=new int[]{5,10,8,1,2,6,74,16};
//        Sort.bubbleSort(a);
//        Log.d("sortafter", Arrays.asList(a).toString()+"");
//        Sort.select_sort(a);
        Sort.insertSort(a);
        Log.d("search",Sort.binarySearch(a,8)+"");
        for (int b:a){
            Log.d("sortafter", b+"");
        }
        ProgressDialogView dialog=new ProgressDialogView(this,R.style.loading_dialog);
        dialog.show();
    }
}
