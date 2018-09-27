package com.biz.woojjujju.helper;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.biz.woojjujju.R;
import com.biz.woojjujju.models.GoDataListVO;

import java.util.List;

public class GoDataViewAdapter extends RecyclerView.Adapter {
    List<GoDataListVO> ListVO;

    public GoDataViewAdapter(List<GoDataListVO> listVO) {
        ListVO = listVO;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_go_data,parent,false);
        return new GoDataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    GoDataViewHolder goDataViewHolder = (GoDataViewHolder) holder;
    GoDataListVO vo = ListVO.get(position);
    goDataViewHolder.servNm.setText(vo.getServNm());

    goDataViewHolder.servDgst.setText(Html.fromHtml(vo.getServDgst()));

        }

    @Override
    public int getItemCount() {
        return ListVO.size();
    }
    class GoDataViewHolder extends RecyclerView.ViewHolder {
//        private String servNm;       //	서비스명
//            private String servDgst;     //	서비스 요약
        TextView servNm;
        TextView servDgst;

        public GoDataViewHolder(View itemView) {
            super(itemView);
            servNm = itemView.findViewById(R.id.item_txt_serv_nm);
            servDgst = itemView.findViewById(R.id.item_txt_serv_dgst);

        }
    }
}
