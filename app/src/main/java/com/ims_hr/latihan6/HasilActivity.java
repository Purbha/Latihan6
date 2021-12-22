package com.ims_hr.latihan6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class HasilActivity extends AppCompatActivity {

    TextView TV_Nilai;
    private int Alas;
    private int Tinggi;
    private double Luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Inisial();
        Get_Var();
        Hitung_Luas();
        Cetak_luas();
    }

    private void Inisial() {
        TV_Nilai = findViewById(R.id.textView_Hasil_Nilai);
    }

    private void Get_Var() {
        Intent In = getIntent();
        Alas = In.getExtras().getInt("alas",0);
        Tinggi = In.getExtras().getInt("tinggi",0);
    }

    private void Hitung_Luas(){
        Luas = (Alas * Tinggi) * 0.5;
    }

    private void Cetak_luas(){
        DecimalFormat presisi = new DecimalFormat("0.00");
        TV_Nilai.setText("Luas Segitiga: " + presisi.format(Luas));
    }

}
