package com.biz.woojjujju;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.biz.woojjujju.helper.GoDataViewAdapter;
import com.biz.woojjujju.models.GoDataListVO;
import com.biz.woojjujju.service.GoDataGetterService;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class SearchActivity extends AppCompatActivity {
    RecyclerView recyclerView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        recyclerView = findViewById(R.id.txt_list1) ; //recyclerView.findViewById(R.id.txt_list1);
        // 데이터 가져오기
        GoDataGetterService goDataGetterService = new GoDataGetterService();
        try {
            List<GoDataListVO> goDataLists
                    = (List<GoDataListVO>)goDataGetterService.execute(100).get(); // 지금부터 task 를 작동하라

            GoDataViewAdapter adapter = new GoDataViewAdapter(goDataLists);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recyclerView.smoothScrollToPosition(0);
            }
        });

        fab.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                recyclerView.scrollToPosition(0);
                return false;
            }
        });

    }

}
