package com.example.euphoria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.euphoria.model.kpop;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler = findViewById(R.id.kpop_recycler);

        String[] captions = new String[kpop.kpops.length];
        int[] ids = new int[kpop.kpops.length];
        int[] prices = new int[kpop.kpops.length];

        for (int i = 0; i<captions.length; i++){
            captions[i] = kpop.kpops[i].getName();
            ids[i] = kpop.kpops[i].getImageId();
            prices[i] = kpop.kpops[i].getPrice();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        ProductAdapter adapter = new ProductAdapter(captions,ids,prices);
        recycler.setAdapter(adapter);
    }

}