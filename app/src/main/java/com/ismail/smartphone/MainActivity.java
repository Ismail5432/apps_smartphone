package com.ismail.smartphone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ismail.smartphone.model.Lis;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton btnupdate;
    ImageButton btnedit;
    ListView lvdaftar;
    TextView txnodata;
    DaftarSmartphoneAdapter adapter;
    List<Lis> DaftarSmartphone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}