package com.example.thirddayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class SmsContentProviderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_content_provider);

        //uri --sms db n table
        Uri uriSms = Uri.parse("content://sms/inbox");
        //query-- data
        Cursor dataCursor = getContentResolver().query(uriSms, null,null,null,null);
        //put data into adapter
        CursorAdapter adapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_list_item_2, //layout of each row
                dataCursor,
                new String[]{"address","body"},//from column names
                new int[]{android.R.id.text1,android.R.id.text2}, //to textview ids
                0);
        //set the adapter on the listview
        ListView cpListView = findViewById(R.id.cpListview);
        cpListView.setAdapter(adapter);

    }
}