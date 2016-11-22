package com.example.administrator.layoutdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button framelayoutBtn = (Button) findViewById(R.id.btn_framelayout);
        Button absolutelayoutBtn = (Button) findViewById(R.id.btn_absolutelayout);
        Button tablelayoutBtn = (Button) findViewById(R.id.btn_tablelayout);
        Button linearlayoutBtn = (Button) findViewById(R.id.btn_linearlayout);
        Button relativelayoutBtn = (Button) findViewById(R.id.btn_relativelayout);
        framelayoutBtn.setOnClickListener(this);
        absolutelayoutBtn.setOnClickListener(this);
        tablelayoutBtn.setOnClickListener(this);
        linearlayoutBtn.setOnClickListener(this);
        relativelayoutBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_framelayout:
                startActivity(new Intent(MainActivity.this, FrameLayoutActivity.class));
                break;
            case R.id.btn_absolutelayout:
                startActivity(new Intent(MainActivity.this, AbsoluteLayoutActivity.class));
                break;
            case R.id.btn_tablelayout:
                startActivity(new Intent(MainActivity.this, TableLayoutActivity.class));
                break;
            case R.id.btn_linearlayout:
                startActivity(new Intent(MainActivity.this, LinearLayoutActivity.class));
                break;
            case R.id.btn_relativelayout:
                startActivity(new Intent(MainActivity.this, RelativeLayoutActivity.class));
                break;
            default:
                break;
        }
    }
}
