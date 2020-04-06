package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LuasTrapesium extends AppCompatActivity {

    private EditText txtSisiAB;
    private EditText txtSisiEF;
    private EditText txtTinggi;
    private TextView txtluasTR;
    private Button btnHitung;

    @Override

    public void onCreate (Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_luas_trapesium);
        txtSisiAB = (EditText)findViewById(R.id.AB2);
        txtSisiEF = (EditText)findViewById(R.id.EF2);
        txtTinggi = (EditText)findViewById(R.id.tinggitrap2);
        txtluasTR = (TextView)findViewById(R.id.hasiltrap2);
        btnHitung = (Button)findViewById(R.id.btntrap2);
    }

    public void hitungLuas (View view){
        try{
            int sisiAB=Integer.parseInt(txtSisiAB.getText().toString());
            int sisiEF=Integer.parseInt(txtSisiEF.getText().toString());
            int tinggi = Integer.parseInt(txtTinggi.getText().toString());
            double luas= (sisiAB + sisiEF)* tinggi /2;

            txtluasTR.setText(String.valueOf(luas));

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
