package com.ims_hr.latihan6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText E_Alas;
    EditText E_Tinggi;
    Button B_Hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inisial();
        Listen_B_Hitung();
    }

    private void Inisial() {
        E_Alas = findViewById(R.id.editText_Main_Alas);
        E_Tinggi = findViewById(R.id.editText_Main_Tinggi);
        B_Hitung = findViewById(R.id.button_Main_Hitung);
    }

    private void Listen_B_Hitung() {
        B_Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer Alas = Integer.parseInt(E_Alas.getText().toString());
                Integer Tinggi = Integer.parseInt(E_Tinggi.getText().toString());
                Intent In = new Intent(MainActivity.this,HasilActivity.class);
                In.putExtra("alas",Alas);
                In.putExtra("tinggi",Tinggi);
                startActivity(In);
            }
        });
    }

}
