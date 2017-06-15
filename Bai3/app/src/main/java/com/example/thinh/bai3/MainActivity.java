package com.example.thinh.bai3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    ArrayList<BaiHatkaraOk> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list);
        arrayList = new ArrayList<>();
        arrayList.add(new BaiHatkaraOk("001","Nguyen va a ","abcc"));
        arrayList.add(new BaiHatkaraOk("001","Nguyen va a ","abcc"));
        arrayList.add(new BaiHatkaraOk("001","Nguyen va a ","abcc"));
        arrayList.add(new BaiHatkaraOk("001","Nguyen va a ","abcc"));
        arrayList.add(new BaiHatkaraOk("001","Nguyen va a ","abcc"));
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
