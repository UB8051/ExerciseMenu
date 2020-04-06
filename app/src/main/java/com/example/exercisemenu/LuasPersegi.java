package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasPersegi extends AppCompatActivity {

    EditText s;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);
        s = (EditText) findViewById(R.id.sisipersegi2);
        hitung = (Button) findViewById(R.id.btnpersegi2);
        hasil = (TextView)findViewById(R.id.hasilpersegi2);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //notifikasi jika lebar tidak diisi
                if (s.length()==0){
                    Toast.makeText(getApplication(),"Sisi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }
                else{
                    String isisisi = s.getText().toString();
                    double s = Double.parseDouble(isisisi);
                    double hs = LuasPersegi(s);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasPersegi(double s){return s*s;}
}
