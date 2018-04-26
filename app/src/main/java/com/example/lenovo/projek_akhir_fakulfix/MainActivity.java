package com.example.lenovo.projek_akhir_fakulfix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /**
     *
     */
    private Recyclerview rvCategory;
    private ArrayList<Fakultas> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Fakultas UPNVJ");

        rvCategory = (RecyclerView) findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(FakultasData.getListData());

        showRecyclerCardView();

    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewFakultasAdapter cardViewFakultasAdapter = new CardViewFakultasAdapter(this);
        cardViewFakultasAdapter.setListFakultas(list);
        rvCategory.setAdapter(cardViewFakultasAdapter);
    }


}
