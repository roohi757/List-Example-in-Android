package com.example.listexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    int[] arrNo = new int[]{1, 2, 3, 4, 5};
    ArrayList<String> arrNames = new ArrayList<>();
    ArrayList<String> arrIds = new ArrayList<>();
    ArrayList<String> arrLanguage = new ArrayList<>();
    Spinner spinner;
    AutoCompleteTextView actxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);
        actxtView = findViewById(R.id.actxtView);

        arrNames.add("Item one ");
        arrNames.add("Item second");
        arrNames.add("Item third");
        arrNames.add("Item fourth");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Clicked First Item", Toast.LENGTH_SHORT).show();
                }
                  else if (position == 1) {
                    Toast.makeText(MainActivity.this, "Clicked second Item", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    Toast.makeText(MainActivity.this, "Clicked third Item", Toast.LENGTH_SHORT).show();
                } else if (position == 3) {
                    Toast.makeText(MainActivity.this, "Clicked fourth Item", Toast.LENGTH_SHORT).show();
                }
            }

        });




        //Spinner

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,arrIds);
        spinner.setAdapter(spinnerAdapter);

        arrIds.add("Aadhaar card");
        arrIds.add("PAN card");
        arrIds.add("Voter ID card");
        arrIds.add("Driving Licence card");
        arrIds.add("Ration card");
        arrIds.add("Credit card");
        arrIds.add("Debit card");
        arrIds.add("ATM card");
        arrIds.add("ABHA card");


        //AutoCompleteTextView


        arrLanguage.add("c");
        arrLanguage.add("c++");
        arrLanguage.add("c#");
        arrLanguage.add("java");
        arrLanguage.add("python");
        arrLanguage.add("html");
        arrLanguage.add("kotlin");

        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrLanguage);
        actxtView.setAdapter(actvAdapter);
        actxtView.setThreshold(1);

    }
}

