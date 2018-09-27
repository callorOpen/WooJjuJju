package com.biz.woojjujju;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.biz.woojjujju.service.WooDao;

public class MainActivity extends AppCompatActivity {

    ImageView img_preg ;
    ImageView img_baby ;
    ImageView img_kid ;
    ImageView img_search ;

    ViewPager vp ;
    WooDao wooDao ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_preg = findViewById(R.id.img_preg);
        img_baby = findViewById(R.id.img_baby);
        img_kid = findViewById(R.id.img_kid);
        img_search = findViewById(R.id.img_search);


        img_preg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prgIntent = new Intent(MainActivity.this,Main2Activity.class);

            prgIntent.putExtra("FragName","preg");
            startActivity(prgIntent);

            }
        });
        img_baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prgIntent = new Intent(MainActivity.this,Main2Activity.class);

                prgIntent.putExtra("FragName","baby");
                startActivity(prgIntent);

            }
        });
        img_kid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prgIntent = new Intent(MainActivity.this,Main2Activity.class);

                prgIntent.putExtra("FragName","kid");
                startActivity(prgIntent);


            }
        });
        img_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prgIntent = new Intent(MainActivity.this,SearchActivity.class);

                prgIntent.putExtra("FragName","search");
                startActivity(prgIntent);


            }
        });
    }
}
