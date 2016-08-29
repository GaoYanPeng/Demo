package com.lanou3g.demo;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnCancelListener{
//功能一
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itieView();
    }

    private void itieView() {
    }
//功能2
    @Override
    public void onCancel (DialogInterface dialog) {

    }
}
