package com.example.zooapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] categories = {"Млекопитающие", "Птицы", "Рыбы", "Рептилии", "Амфибии"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categories);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showCategoryDetails(categories[position]);
            }
        });
    }

    private void showCategoryDetails(String categoryName) {
        Intent intent = new Intent(this, CategoryDetailActivity.class);
        intent.putExtra("category_name", categoryName);
        startActivity(intent);
    }
}
