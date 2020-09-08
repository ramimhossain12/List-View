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

              ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listViewID);

        String[] valuse = new String[]{

                "FaceBook","Instagram", "Twitter", "YouTube",
                "Tumblr","WhatsApp", "weChat","Telegram",
                "Twitch","Github","SanpChat", "Viber",
                "Android"
        };

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.simple_list_item,R.id.tex1, valuse);

            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    if (i == 0){
                        Intent intent = new Intent(view.getContext(),FaceBookActivity.class);
                        startActivity(intent);
                    }

                    //for 2nd item click
                    if (i == 1){
                        Intent intent = new Intent(view.getContext(),InstragramActivity.class);
                        startActivity(intent);
                    }

                    //for last item click
                    if (i == 12){
                        Intent intent = new Intent(view.getContext(),AndroidActivity.class);
                        startActivity(intent);
                    }


                }
            });

    }
}