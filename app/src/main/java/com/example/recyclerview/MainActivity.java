package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private String[] myDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvFriends);
        recyclerView.setHasFixedSize(true);
        myDataset=new String[]{"leen","Ash","mira","lady gaga"};
        layoutManager= new LinearLayoutManager(context: this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter= new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);

    }
    import androidx.appcompat.app.AppCompatActivity;
}