package com.example.page1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class regact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regact);
    }

    public void back2(View view) {
        Intent intent = new Intent(regact.this, page5.class);
    }
}