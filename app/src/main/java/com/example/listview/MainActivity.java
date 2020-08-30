package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    // Declaring variable
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewID);
        final String [] playerInformation = getResources().getStringArray(R.array.player_Name);
        final String[] playerdetails = getResources().getStringArray(R.array.player_details);
        ArrayAdapter<String > adapter = new ArrayAdapter<>(MainActivity.this,R.layout.sample,R.id.textViewID,playerInformation);
        listView.setAdapter(adapter);


        //setOn Item click Lisitner;

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                //,,,useing put extra menu;
                intent.putExtra("player name",playerInformation[i   ]);
                intent.putExtra("playerdetails",playerdetails[i ]);
                startActivity(intent);

            }
        });

    }
}