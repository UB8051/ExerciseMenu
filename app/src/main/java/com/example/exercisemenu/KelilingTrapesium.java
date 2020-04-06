package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class KelilingTrapesium extends AppCompatActivity {

    private EditText txtSisiAB;
    private EditText txtSisiEF;
    private EditText txtSisiFB;
    private EditText txtSisiBA;
    private TextView txtkelilingTR;
    private Button btnHitung;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_keliling_segitiga);
        initUI ();
        initEvent ();

    }

    public void initUI(){
        txtSisiAB = (EditText)findViewById(R.id.AB1);
        txtSisiEF = (EditText)findViewById(R.id.EF1);
        txtSisiFB = (EditText)findViewById(R.id.FB1);
        txtSisiBA = (EditText)findViewById(R.id.BA1);
        txtkelilingTR = (TextView) findViewById(R.id.hasiltrap1);
        btnHitung = (Button)findViewById(R.id.btntrap1);
    }

    public void HitungKelilingTR (){
            double sisiAB=Integer.parseInt(txtSisiAB.getText().toString());
            double sisiEF=Integer.parseInt(txtSisiEF.getText().toString());
            double sisiFB=Integer.parseInt(txtSisiFB.getText().toString());
            double sisiBA=Integer.parseInt(txtSisiBA.getText().toString());
            double keliling= sisiAB + sisiEF + sisiFB + sisiBA;

            txtkelilingTR.setText(" Keliling dengan panjang AB =  "+ sisiAB + " Keliling dengan panjang EF =  " + sisiEF + " Keliling dengan panjang FB =  "+ sisiFB + " Keliling dengan panjang BA =  "+ sisiBA + " adalah " + keliling );

    }

    private void initEvent() {
        btnHitung.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                HitungKelilingTR();
            }
        });
    }
}
