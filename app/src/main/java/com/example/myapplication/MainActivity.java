package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<Disaster> disasterList = new ArrayList<>();
        Disaster tsunami = new Disaster("Tsunami", "Natural");
        Disaster war = new Disaster("War", "Man-made");
        Disaster flood = new Disaster("Food", "Natural");
        disasterList.add(tsunami);
        disasterList.add(war);
        disasterList.add(flood);
        DisasterAdapter adapterDisaster = new DisasterAdapter();
        binding.rvDisaster.setAdapter(adapterDisaster);
        binding.rvDisaster.setLayoutManager(new LinearLayoutManager(this));
    }
}