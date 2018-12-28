package com.bryantan.swipeviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    Adapter adapter;
    List<Models> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        models = new ArrayList<>();
        models.add(new Models(R.drawable.brochure,"Brochure"));
        models.add(new Models(R.drawable.poster,"poster"));
        models.add(new Models(R.drawable.brochure,"Brochure"));
        models.add(new Models(R.drawable.poster,"poster"));

        adapter = new Adapter(models, this);
        viewPager = findViewById(R.id.webviewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);

    }
}
