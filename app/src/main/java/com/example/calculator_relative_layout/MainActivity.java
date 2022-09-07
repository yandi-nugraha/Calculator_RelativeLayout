package com.example.calculator_relative_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2;
    Button tambah, kurang, kali, bagi;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        result = findViewById(R.id.result);

        tambah = findViewById(R.id.btnTambah);
        kurang = findViewById(R.id.btnKurang);
        kali = findViewById(R.id.btnKali);
        bagi = findViewById(R.id.btnBagi);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double nilai1 = Double.parseDouble(input1.getText().toString());
                double nilai2 = Double.parseDouble(input2.getText().toString());

                double hasil = nilai1 + nilai2;
                result.setText(String.valueOf(hasil));
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double nilai1 = Double.parseDouble(input1.getText().toString());
                double nilai2 = Double.parseDouble(input2.getText().toString());

                double hasil = nilai1 - nilai2;
                result.setText(String.valueOf(hasil));
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double nilai1 = Double.parseDouble(input1.getText().toString());
                double nilai2 = Double.parseDouble(input2.getText().toString());

                double hasil = nilai1 * nilai2;
                result.setText(String.valueOf(hasil));
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double nilai1 = Double.parseDouble(input1.getText().toString());
                double nilai2 = Double.parseDouble(input2.getText().toString());

                double hasil = nilai1 / nilai2;
                result.setText(String.valueOf(hasil));
            }
        });
    }
}