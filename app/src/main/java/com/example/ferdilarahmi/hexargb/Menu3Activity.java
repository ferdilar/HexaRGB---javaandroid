package com.example.ferdilarahmi.hexargb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ferdila Rahmi on 5/6/2016.
 */
public class Menu3Activity extends AppCompatActivity {

    Button btnSample[] = new Button[15];
    TextView tvSampleRed[] = new TextView[15];
    TextView tvSampleGreen[] = new TextView[15];
    TextView tvSampleBlue[] = new TextView[15];
    TextView tvSampleName[] = new TextView[15];
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);

        btnSample[0] = (Button) findViewById(R.id.btn_sample0);
        tvSampleRed[0] = (TextView) findViewById(R.id.tv_s0_red);
        tvSampleGreen[0] = (TextView) findViewById(R.id.tv_s0_green);
        tvSampleBlue[0] = (TextView) findViewById(R.id.tv_s0_blue);
        tvSampleName[0] = (TextView) findViewById(R.id.tv_s0_name);

        btnSample[1] = (Button) findViewById(R.id.btn_sample1);
        tvSampleRed[1] = (TextView) findViewById(R.id.tv_s1_red);
        tvSampleGreen[1] = (TextView) findViewById(R.id.tv_s1_green);
        tvSampleBlue[1] = (TextView) findViewById(R.id.tv_s1_blue);
        tvSampleName[1] = (TextView) findViewById(R.id.tv_s1_name);

        btnSample[2] = (Button) findViewById(R.id.btn_sample2);
        tvSampleRed[2] = (TextView) findViewById(R.id.tv_s2_red);
        tvSampleGreen[2] = (TextView) findViewById(R.id.tv_s2_green);
        tvSampleBlue[2] = (TextView) findViewById(R.id.tv_s2_blue);
        tvSampleName[2] = (TextView) findViewById(R.id.tv_s2_name);

        btnSample[3] = (Button) findViewById(R.id.btn_sample3);
        tvSampleRed[3] = (TextView) findViewById(R.id.tv_s3_red);
        tvSampleGreen[3] = (TextView) findViewById(R.id.tv_s3_green);
        tvSampleBlue[3] = (TextView) findViewById(R.id.tv_s3_blue);
        tvSampleName[3] = (TextView) findViewById(R.id.tv_s3_name);

        btnSample[4] = (Button) findViewById(R.id.btn_sample4);
        tvSampleRed[4] = (TextView) findViewById(R.id.tv_s4_red);
        tvSampleGreen[4] = (TextView) findViewById(R.id.tv_s4_green);
        tvSampleBlue[4] = (TextView) findViewById(R.id.tv_s4_blue);
        tvSampleName[4] = (TextView) findViewById(R.id.tv_s4_name);

        btnSample[5] = (Button) findViewById(R.id.btn_sample5);
        tvSampleRed[5] = (TextView) findViewById(R.id.tv_s5_red);
        tvSampleGreen[5] = (TextView) findViewById(R.id.tv_s5_green);
        tvSampleBlue[5] = (TextView) findViewById(R.id.tv_s5_blue);
        tvSampleName[5] = (TextView) findViewById(R.id.tv_s5_name);

        btnSample[6] = (Button) findViewById(R.id.btn_sample6);
        tvSampleRed[6] = (TextView) findViewById(R.id.tv_s6_red);
        tvSampleGreen[6] = (TextView) findViewById(R.id.tv_s6_green);
        tvSampleBlue[6] = (TextView) findViewById(R.id.tv_s6_blue);
        tvSampleName[6] = (TextView) findViewById(R.id.tv_s6_name);

        btnSample[7] = (Button) findViewById(R.id.btn_sample7);
        tvSampleRed[7] = (TextView) findViewById(R.id.tv_s7_red);
        tvSampleGreen[7] = (TextView) findViewById(R.id.tv_s7_green);
        tvSampleBlue[7] = (TextView) findViewById(R.id.tv_s7_blue);
        tvSampleName[7] = (TextView) findViewById(R.id.tv_s7_name);

        btnSample[8] = (Button) findViewById(R.id.btn_sample8);
        tvSampleRed[8] = (TextView) findViewById(R.id.tv_s8_red);
        tvSampleGreen[8] = (TextView) findViewById(R.id.tv_s8_green);
        tvSampleBlue[8] = (TextView) findViewById(R.id.tv_s8_blue);
        tvSampleName[8] = (TextView) findViewById(R.id.tv_s8_name);

        btnSample[9] = (Button) findViewById(R.id.btn_sample9);
        tvSampleRed[9] = (TextView) findViewById(R.id.tv_s9_red);
        tvSampleGreen[9] = (TextView) findViewById(R.id.tv_s9_green);
        tvSampleBlue[9] = (TextView) findViewById(R.id.tv_s9_blue);
        tvSampleName[9] = (TextView) findViewById(R.id.tv_s9_name);

        btnSample[10] = (Button) findViewById(R.id.btn_sample10);
        tvSampleRed[10] = (TextView) findViewById(R.id.tv_s10_red);
        tvSampleGreen[10] = (TextView) findViewById(R.id.tv_s10_green);
        tvSampleBlue[10] = (TextView) findViewById(R.id.tv_s10_blue);
        tvSampleName[10] = (TextView) findViewById(R.id.tv_s10_name);

        btnSample[11] = (Button) findViewById(R.id.btn_sample11);
        tvSampleRed[11] = (TextView) findViewById(R.id.tv_s11_red);
        tvSampleGreen[11] = (TextView) findViewById(R.id.tv_s11_green);
        tvSampleBlue[11] = (TextView) findViewById(R.id.tv_s11_blue);
        tvSampleName[11] = (TextView) findViewById(R.id.tv_s11_name);

        btnSample[12] = (Button) findViewById(R.id.btn_sample12);
        tvSampleRed[12] = (TextView) findViewById(R.id.tv_s12_red);
        tvSampleGreen[12] = (TextView) findViewById(R.id.tv_s12_green);
        tvSampleBlue[12] = (TextView) findViewById(R.id.tv_s12_blue);
        tvSampleName[12] = (TextView) findViewById(R.id.tv_s12_name);

        btnSample[13] = (Button) findViewById(R.id.btn_sample13);
        tvSampleRed[13] = (TextView) findViewById(R.id.tv_s13_red);
        tvSampleGreen[13] = (TextView) findViewById(R.id.tv_s13_green);
        tvSampleBlue[13] = (TextView) findViewById(R.id.tv_s13_blue);
        tvSampleName[13] = (TextView) findViewById(R.id.tv_s13_name);

        btnSample[14] = (Button) findViewById(R.id.btn_sample14);
        tvSampleRed[14] = (TextView) findViewById(R.id.tv_s14_red);
        tvSampleGreen[14] = (TextView) findViewById(R.id.tv_s14_green);
        tvSampleBlue[14] = (TextView) findViewById(R.id.tv_s14_blue);
        tvSampleName[14] = (TextView) findViewById(R.id.tv_s14_name);

        for(i=0;i<15;i++) {
            btnSample[i].setOnClickListener(new View.OnClickListener() {
                String red = tvSampleRed[i].getText().toString();
                String green = tvSampleGreen[i].getText().toString();
                String blue = tvSampleBlue[i].getText().toString();
                String name = tvSampleName[i].getText().toString();
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Menu3Activity.this, Menu1Activity.class);
                    intent.putExtra("r", red);
                    intent.putExtra("g", green);
                    intent.putExtra("b", blue);
                    intent.putExtra("name", name);
                    Toast.makeText(getApplicationContext(), name, Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            });
        }
    }
}