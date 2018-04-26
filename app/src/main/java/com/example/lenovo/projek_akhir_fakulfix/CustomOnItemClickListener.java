package com.example.lenovo.projek_akhir_fakulfix;

import android.view.View;

/**
 * Created by lenovo on 20/10/2017.
 */

public class CustomOnItemClickListener implements View.OnClickListener{

    private int position;
    private OnItemClickCallback onItemClickCallback;
    public CustomOnItemClickListener(int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, position);
    }
    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }
}
