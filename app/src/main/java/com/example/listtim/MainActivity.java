package com.example.listtim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTim;
    private ArrayList<TimModel> modelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTim = findViewById(R.id.recyclerview);
        rvTim.setHasFixedSize(true);
        modelList.addAll(TimData.getListTim());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvTim.setLayoutManager(new LinearLayoutManager(this));
        TimAdapter timAdapter = new TimAdapter(this);
        timAdapter.setTimModels(modelList);
        rvTim.setAdapter(timAdapter);
        rvTim.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
