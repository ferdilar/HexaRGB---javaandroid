package com.example.ferdilarahmi.hexargb;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by Ferdila Rahmi on 5/6/2016.
 */
public class Menu2Activity extends AppCompatActivity {

    Button btnCheck;
    ImageView ivColor;
    EditText etHexa;
    String valHexa;
    LinearLayout linrgb;
    TextView tvRed, tvGreen, tvBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        btnCheck = (Button) findViewById(R.id.btn_check);
        etHexa = (EditText) findViewById(R.id.et_hexa);
        ivColor = (ImageView) findViewById(R.id.iv_color2);
        linrgb = (LinearLayout) findViewById(R.id.lin_rgb);
        tvRed = (TextView) findViewById(R.id.tv_red);
        tvGreen = (TextView) findViewById(R.id.tv_green);
        tvBlue = (TextView) findViewById(R.id.tv_blue);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valHexa = etHexa.getText().toString();
                int hexaRed=0, hexaGreen=0, hexaBlue=0;
                if(valHexa.matches("^[0-9A-Fa-f]{6}+$")){
                    Toast.makeText(getApplicationContext(), "#" + valHexa, Toast.LENGTH_SHORT).show();
                    ivColor.setBackgroundColor(Color.parseColor("#" + valHexa));
                    linrgb.setVisibility(1);
                    hexaRed = Integer.parseInt(valHexa.substring(0,2), 16);
                    hexaGreen = Integer.parseInt(valHexa.substring(2,4), 16);
                    hexaBlue = Integer.parseInt(valHexa.substring(4,6), 16);
                    tvRed.setText(String.valueOf(hexaRed));
                    tvGreen.setText(String.valueOf(hexaGreen));
                    tvBlue.setText(String.valueOf(hexaBlue));
                }else{
                    etHexa.setError("Wrong Hexadecimal Format and Must be 6 Digits");
                    etHexa.setText("");
                }
            }
        });
    }
}