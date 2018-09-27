package com.biz.woojjujju.service;

import android.content.Context;

import com.biz.woojjujju.R;

public class WooDao {


        private String[] title_preg ;
        private String[] title_baby ;
        private String[] title_kid ;
        private String title_search ;


        Context context ;

        public WooDao(Context context) {
            this.context = context;
        }


        public String[] getTitle_preg() {
            title_preg = context.getResources().getStringArray(R.array.title_preg);
            return title_preg;
        }

        public String[] getTitle_baby() {
            title_baby = context.getResources().getStringArray(R.array.title_baby);
            return title_baby;
        }
        public String[] getTitle_kid() {
            title_kid = context.getResources().getStringArray(R.array.title_kid);
            return title_kid;
        }
        public String getTitle_search() {
            title_search = context.getResources().getString(R.string.title_search);
            return title_search;
        }


}

