package com.example.page1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    public void back1(View view) {
        Intent intent = new Intent(page3.this, page2.class);
        startActivity(intent);
    }

    public void btnlogin(View view) {
        Intent intent = new Intent(page3.this, page5.class);
        startActivity(intent);
    }
}