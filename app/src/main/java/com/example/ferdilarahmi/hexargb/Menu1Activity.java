package com.example.ferdilarahmi.hexargb;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ferdila Rahmi on 5/6/2016.
 */
public class Menu1Activity extends AppCompatActivity {

    TextView tvHexa;
    EditText etDeciRed, etDeciGreen, etDeciBlue;
    TextView tvHexaRed, tvHexaGreen, tvHexaBlue;
    Button btnReset;
    SeekBar sbRed, sbGreen, sbBlue;
    ImageView ivColor;
    String r, g, b, name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        btnReset = (Button) findViewById(R.id.btn_reset);
        tvHexa = (TextView) findViewById(R.id.tv_hexa);

        etDeciRed = (EditText) findViewById(R.id.et_deci_red);
        etDeciGreen = (EditText) findViewById(R.id.et_deci_green);
        etDeciBlue = (EditText) findViewById(R.id.et_deci_blue);

        tvHexaRed = (TextView) findViewById(R.id.tv_hexa_red);
        tvHexaGreen = (TextView) findViewById(R.id.tv_hexa_green);
        tvHexaBlue = (TextView) findViewById(R.id.tv_hexa_blue);

        sbRed = (SeekBar) findViewById(R.id.sb_red);
        sbGreen = (SeekBar) findViewById(R.id.sb_green);
        sbBlue = (SeekBar) findViewById(R.id.sb_blue);

        ivColor = (ImageView) findViewById(R.id.iv_color);

        r = getIntent().getExtras().getString("r", "0");
        g = getIntent().getExtras().getString("g", "0");
        b = getIntent().getExtras().getString("b", "0");
        name = getIntent().getExtras().getString("name", "none");

        etDeciRed.setText(r);
        etDeciGreen.setText(g);
        etDeciBlue.setText(b);
        sbRed.setProgress(Integer.parseInt(r));
        sbGreen.setProgress(Integer.parseInt(g));
        sbBlue.setProgress(Integer.parseInt(b));
        convertRGB();

        etDeciRed.setSelection(etDeciRed.getText().length());
        etDeciGreen.setSelection(etDeciGreen.getText().length());
        etDeciBlue.setSelection(etDeciBlue.getText().length());
        etDeciRed.requestFocus();
        /*
            Button Reset
         */
        btnReset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), name, Toast.LENGTH_SHORT).show();
                sbRed.setProgress(Integer.parseInt(r));
                sbGreen.setProgress(Integer.parseInt(g));
                sbBlue.setProgress(Integer.parseInt(b));
                convertRGB();
            }
        });
        /*
           SeekBar onChange
         */
        sbRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;
                etDeciRed.setText(String.valueOf(progress));
                //Toast.makeText(getApplicationContext(), "Changing seekbar's progress", Toast.LENGTH_SHORT).show();
                convertRGB();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getApplicationContext(), "Started tracking seekbar", Toast.LENGTH_SHORT).show();
                convertRGB();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getApplicationContext(), "Stopped tracking seekbar", Toast.LENGTH_SHORT).show();
                convertRGB();
            }
        });
        sbGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;
                etDeciGreen.setText(String.valueOf(progress));
                //Toast.makeText(getApplicationContext(), "Changing seekbar's progress", Toast.LENGTH_SHORT).show();
                convertRGB();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getApplicationContext(), "Started tracking seekbar", Toast.LENGTH_SHORT).show();
                convertRGB();
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getApplicationContext(), "Stopped tracking seekbar", Toast.LENGTH_SHORT).show();
                convertRGB();
            }
        });
        sbBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;
                etDeciBlue.setText(String.valueOf(progress));
                //Toast.makeText(getApplicationContext(), "Changing seekbar's progress", Toast.LENGTH_SHORT).show();
                convertRGB();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getApplicationContext(), "Started tracking seekbar", Toast.LENGTH_SHORT).show();
                convertRGB();
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getApplicationContext(), "Stopped tracking seekbar", Toast.LENGTH_SHORT).show();
                convertRGB();
            }
        });
        /*
           EditText onClick
        */
        etDeciRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sbRed.setProgress(0);
                etDeciRed.setSelection(etDeciRed.getText().length());
                convertRGB();
            }
        });
        etDeciGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sbGreen.setProgress(0);
                etDeciRed.setSelection(etDeciRed.getText().length());
                convertRGB();
            }
        });
        etDeciBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sbBlue.setProgress(0);
                etDeciRed.setSelection(etDeciRed.getText().length());
                convertRGB();
            }
        });
        /*
           EditText onChange
        */
        etDeciRed.addTextChangedListener(new TextWatcher() {
            int valueRed = 0;

            public void afterTextChanged(Editable s) {
                valueRed = Integer.parseInt(etDeciRed.getText().toString());
                sbRed.setProgress(valueRed);
                etDeciRed.setSelection(etDeciRed.getText().length());
                convertRGB();
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                etDeciRed.setSelection(etDeciRed.getText().length());
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String stValueRed = etDeciRed.getText().toString();
                if (stValueRed.trim().equals("")) {
                    etDeciRed.setText("0");
                }
                valueRed = Integer.parseInt(etDeciRed.getText().toString());
                if (valueRed > 255) {
                    Toast.makeText(getApplicationContext(), "Maximum 255", Toast.LENGTH_SHORT).show();
                    etDeciRed.setText("255");
                }
                etDeciRed.setSelection(etDeciRed.getText().length());
                convertRGB();
            }
        });
        etDeciGreen.addTextChangedListener(new TextWatcher() {
            int valueGreen = 0;

            public void afterTextChanged(Editable s) {
                valueGreen = Integer.parseInt(etDeciGreen.getText().toString());
                sbGreen.setProgress(valueGreen);
                etDeciGreen.setSelection(etDeciGreen.getText().length());
                convertRGB();
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                etDeciGreen.setSelection(etDeciGreen.getText().length());
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String stValueGreen = etDeciGreen.getText().toString();
                if (stValueGreen.trim().equals("")) {
                    etDeciGreen.setText("0");
                }
                valueGreen = Integer.parseInt(etDeciGreen.getText().toString());
                if (valueGreen > 255) {
                    Toast.makeText(getApplicationContext(), "Maximum 255", Toast.LENGTH_SHORT).show();
                    etDeciGreen.setText("255");
                }
                etDeciGreen.setSelection(etDeciGreen.getText().length());
                convertRGB();
            }
        });
        etDeciBlue.addTextChangedListener(new TextWatcher() {
            int valueBlue = 0;

            public void afterTextChanged(Editable s) {
                valueBlue = Integer.parseInt(etDeciBlue.getText().toString());
                sbBlue.setProgress(valueBlue);
                etDeciBlue.setSelection(etDeciBlue.getText().length());
                convertRGB();
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                etDeciBlue.setSelection(etDeciBlue.getText().length());
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String stValueBlue = etDeciBlue.getText().toString();
                if (stValueBlue.trim().equals("")) {
                    etDeciBlue.setText("0");
                }
                valueBlue = Integer.parseInt(etDeciBlue.getText().toString());
                if (valueBlue > 255) {
                    Toast.makeText(getApplicationContext(), "Maximum 255", Toast.LENGTH_SHORT).show();
                    etDeciBlue.setText("255");
                }
                etDeciBlue.setSelection(etDeciBlue.getText().length());
                convertRGB();
            }
        });
    }
    public void convertRGB(){
        int decRed = 0;
        int decGreen = 0;
        int decBlue = 0;
        String valHexa = "#000000";
        String hexaRed = "00";
        String hexaGreen = "00";
        String hexaBlue = "00";
        decRed=Integer.parseInt(etDeciRed.getText().toString());
        hexaRed = getHexa(decRed);
        tvHexaRed.setText(hexaRed);
        decGreen=Integer.parseInt(etDeciGreen.getText().toString());
        hexaGreen = getHexa(decGreen);
        tvHexaGreen.setText(hexaGreen);
        decBlue=Integer.parseInt(etDeciBlue.getText().toString());
        hexaBlue = getHexa(decBlue);
        tvHexaBlue.setText(hexaBlue);

        valHexa = "#" + hexaRed + "" + hexaGreen + "" + hexaBlue;
        changeColor(valHexa);
    }
    public String getHexa(int decimal){
        String hexa = "";
        int devided=0, modulo=0;

            devided=decimal/16;
            modulo=decimal%16;

            if(devided < 10){
                hexa = String.valueOf(devided);
            }else if(devided == 10){
                hexa = "A";
            }else if(devided == 11){
                hexa = "B";
            }else if(devided == 12){
                hexa = "C";
            }else if(devided == 13){
                hexa = "D";
            }else if(devided == 14){
                hexa = "E";
            }else if(devided == 15){
                hexa = "F";
            }

            if(modulo < 10){
                hexa = hexa + String.valueOf(modulo);
            }else if(modulo == 10){
                hexa = hexa + "A";
            }else if(modulo == 11){
                hexa = hexa + "B";
            }else if(modulo == 12){
                hexa = hexa + "C";
            }else if(modulo == 13){
                hexa = hexa + "D";
            }else if(modulo == 14){
                hexa = hexa + "E";
            }else if(modulo == 15){
                hexa = hexa + "F";
            }
        return hexa;
    }
    public void changeColor(String hexaString){
        tvHexa.setText(hexaString);
        ivColor.setBackgroundColor(Color.parseColor(hexaString));
    }
}
