package com.biz.woojjujju;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.biz.woojjujju.helper.MainPageAdapter;
import com.biz.woojjujju.service.WooDao;

public class Main2Activity extends AppCompatActivity {

    ViewPager vp ;
    TabLayout tabLayout ;
    WooDao wooDao ;
    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        Intent myIntent = getIntent();
        String fragName = myIntent.getStringExtra("FragName");

        wooDao = new WooDao(getApplicationContext());

        String[] pageTitle = null ;
        if(fragName.equalsIgnoreCase("PREG")) {
            pageTitle = wooDao.getTitle_preg();
        } else if ( fragName.equalsIgnoreCase("BABY")) {
            pageTitle = wooDao.getTitle_baby();
        }else if ( fragName.equalsIgnoreCase("KID")) {
            pageTitle = wooDao.getTitle_kid();
        }
        String pageTitle2 = null ;
        if ( fragName.equalsIgnoreCase("SEARCH")) {
            pageTitle2 = wooDao.getTitle_search();
        }




        vp = findViewById(R.id.view_main);
        tabLayout = findViewById(R.id.tab_menu);

        MainPageAdapter adapter
                = new MainPageAdapter(getSupportFragmentManager(),pageTitle);

        vp.setAdapter(adapter);
        tabLayout.setupWithViewPager(vp);

//        Typeface tf = getResources().getFont(R.font.notosanscjkkrregular);


//        recyclerView = findViewById(R.id.txt_list1);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
//              //  recyclerView.scrollToPosition(0);
//
//                recyclerView.smoothScrollToPosition(0);
//
//
//            }
//        });

//        fab.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                recyclerView.scrollToPosition(0);
//                return false;
//            }
//        });

    }

}
