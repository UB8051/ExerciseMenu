package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasPersegiPanjang extends AppCompatActivity {

    EditText p,l;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi_panjang);

        p = (EditText) findViewById(R.id.panjang2);
        l = (EditText)findViewById(R.id.lebar2);
        hitung = (Button) findViewById(R.id.btnpp2);
        hasil = (TextView)findViewById(R.id.hasilpp2);

        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(p.length()==0 && l.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else if (p.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                else if (l.length()==0){
                    Toast.makeText(getApplication(),"Lebar tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isipanjang = p.getText().toString();
                    String isilebar = l.getText().toString();

                    double p = Double.parseDouble(isipanjang);
                    double l = Double.parseDouble(isilebar);

                    double hs = LuasPersegiPanjang(p,l);

                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasPersegiPanjang(double p, double l){return p*l;}
}
