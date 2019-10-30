package com.example.quiz_1718122;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private adapter adapter;
    private ArrayList<keluarga>familyArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = findViewById(R.id.recycleview);
        adapter = new adapter(familyArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        familyArrayList = new ArrayList<>();
        //mahasiswaArrayList.add(new Mahasiswa(getDrawable(R.drawable.ten),));

        familyArrayList.add(new keluarga(getDrawable(R.drawable.ebes),"Andik Wahyunarto", "Ayah"));
        familyArrayList.add(new keluarga(getDrawable(R.drawable.emes),"Sri Damayanti", "Ibu"));
        familyArrayList.add(new keluarga(getDrawable(R.drawable.uping),"Muhammad Luthfi Andhikaputra", "Anak Pertama"));
        familyArrayList.add(new keluarga(getDrawable(R.drawable.dedek),"Alvina Damayanti Andhikputri", "Anak Kedua"));
    }
}
