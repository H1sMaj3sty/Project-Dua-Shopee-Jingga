package com.example.projectduashopeejingga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText angka;
    RadioGroup radioGroup;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angka = findViewById(R.id.angka);
        radioGroup = findViewById(R.id.groupRadio);
    }

    public void tombolSubmit(View view) {
        int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        String inputAngka = angka.getText().toString();
        if (selectedRadioButtonId != -1) {
            RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
            String selectedText = selectedRadioButton.getText().toString();
            Toast.makeText(MainActivity.this, selectedText + ": " + inputAngka, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Pilih salah satu RadioButton terlebih dahulu.", Toast.LENGTH_SHORT).show();
        }
    }
}
