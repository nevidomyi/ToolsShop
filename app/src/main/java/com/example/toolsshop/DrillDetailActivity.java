package com.example.toolsshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrillDetailActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textViewTitle;
    private TextView textViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_detail);

        imageView = findViewById(R.id.imageViewDrill);
        textViewTitle = findViewById(R.id.textViewDrillTitle);
        textViewInfo = findViewById(R.id.textViewDrillInfo);

        Intent intent = getIntent();

        if (intent.hasExtra("title") && intent.hasExtra("info") && intent.hasExtra("img")) {
            String title = intent.getStringExtra("title");
            String info = intent.getStringExtra("info");
            int img = intent.getIntExtra("img", -1);

            imageView.setImageResource(img);
            textViewTitle.setText(title);
            textViewInfo.setText(info);

        } else {
            Intent backIntent = new Intent(this, DrillCategoryActivity.class);
            startActivity(backIntent);
        }
    }
}
