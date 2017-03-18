package com.example.lwl.myproject;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by LWL on 2017/3/10.
 */

public class ProgressDialogView extends ProgressDialog {
    public ProgressDialogView(Context context) {
        super(context);
    }

    public ProgressDialogView(Context context, int theme) {
        super(context, theme);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_view);
    }
}
