package com.example.lenovo.projek_akhir_fakulfix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFakultas extends AppCompatActivity {

    public static String KEY_ITEM = "item";
    private ImageView ivPhoto;
    private TextView tvLokasi;
    private TextView tvFasilitas;
    private TextView tvAkseskendaraan;
    private Fakultas item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_fakultas);
        getSupportActionBar().setTitle("Detail Fakultas ");

        ivPhoto = (ImageView)findViewById(R.id.iv_detail_photo);
        tvLokasi = (TextView)findViewById(R.id.tv_detail_lokasi);
        tvFasilitas = (TextView)findViewById(R.id.tv_detail_fasilitas);
        tvAkseskendaraan = (TextView)findViewById(R.id.tv_detail_akseskendaraan);

        item = (Fakultas)getIntent().getSerializableExtra(KEY_ITEM);

        ivPhoto.setImageResource(item.getPhoto());
        tvLokasi.setText(item.getLokasi());
        tvFasilitas.setText(item.getFasilitas());
        tvAkseskendaraan.setText(item.getAkseskendaraan());
    }
}
