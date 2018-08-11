package com.example.kmj.glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview=findViewById(R.id.imageview);
        Glide.with(this).load("https://shared-comic.pstatic.net/thumb/webtoon/183559/thumbnail/title_thumbnail_20160516123017_t83x90.jpg").into(imageview);
    }
}
