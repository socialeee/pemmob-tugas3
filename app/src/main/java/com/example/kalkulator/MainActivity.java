package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnKurang, btnKali, btnBagi;
    EditText edtAngkaPertama, edtAngkaKedua;
    TextView txtHasil;
    double angkaPertama, angkaKedua, hasil;
    String sAngkaPertama, sAngkaKedua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKurang = (Button)findViewById(R.id.btn_kurang);
        btnKali = (Button)findViewById(R.id.btn_kali);
        btnBagi = (Button)findViewById(R.id.btn_bagi);
        edtAngkaPertama = (EditText)findViewById(R.id.edit_text_angka_pertama);
        edtAngkaKedua = (EditText)findViewById(R.id.edit_text_angka_kedua);
        txtHasil = (TextView)findViewById(R.id.text_view_hasil);

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = edtAngkaPertama.getText().toString();
                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(edtAngkaKedua.getText().toString());
                hasil = angkaPertama-angkaKedua;
                txtHasil.setText("Hasil dari "+angkaPertama+" - "+angkaKedua+" = "+hasil);
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = edtAngkaPertama.getText().toString();
                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(edtAngkaKedua.getText().toString());
                hasil = angkaPertama*angkaKedua;
                txtHasil.setText("Hasil dari "+angkaPertama+" x "+angkaKedua+" = "+hasil);
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = edtAngkaPertama.getText().toString();
                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(edtAngkaKedua.getText().toString());
                hasil = angkaPertama/angkaKedua;
                txtHasil.setText("Hasil dari "+angkaPertama+" / "+angkaKedua+" = "+hasil);
            }
        });
    }

    public void tambah(View view) {
        sAngkaPertama = edtAngkaPertama.getText().toString();
        angkaPertama = Double.parseDouble(sAngkaPertama);
        angkaKedua = Double.parseDouble(edtAngkaKedua.getText().toString());
        hasil = angkaPertama+angkaKedua;
        txtHasil.setText("Hasil dari "+angkaPertama+" + "+angkaKedua+" = "+hasil);
    }
}