package com.example.mydo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.TTXX.LionJump.UnityPlayerActivity;

public class Unity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Context mContext = getApplicationContext();
        Intent intent = new Intent(mContext, UnityPlayerActivity.class);
        startActivity(intent);
    }
}
