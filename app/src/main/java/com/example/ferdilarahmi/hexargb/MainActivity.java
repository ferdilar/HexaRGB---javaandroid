package com.example.ferdilarahmi.hexargb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnMenu1, btnMenu2, btnMenu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "more info: ferdila.rahmi@student.upi.edu", Toast.LENGTH_SHORT).show();

        btnMenu1 = (Button) findViewById(R.id.btn_menu1);
        btnMenu2 = (Button) findViewById(R.id.btn_menu2);
        btnMenu3 = (Button) findViewById(R.id.btn_menu3);

        btnMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Menu1Activity.class);
                intent.putExtra("r", "0");
                intent.putExtra("g", "0");
                intent.putExtra("b", "0");
                intent.putExtra("name", "Black");
                startActivity(intent);
                //finish();
            }
        });
        btnMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Menu2Activity.class);
                startActivity(intent);
                //finish();
            }
        });
        btnMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Menu3Activity.class);
                startActivity(intent);
                //finish();
            }
        });
    }
}
