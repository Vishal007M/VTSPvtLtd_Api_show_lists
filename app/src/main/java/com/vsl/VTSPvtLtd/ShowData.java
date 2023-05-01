package com.vsl.VTSPvtLtd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {

    TextView textView1,textView2,textView3,textView4,textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        textView1 = findViewById(R.id.postId);
        textView2 = findViewById(R.id.id);
        textView3 = findViewById(R.id.name);
        textView4 = findViewById(R.id.email);
        textView5 = findViewById(R.id.body);

        String postid = getIntent().getStringExtra("postid");
        String id = getIntent().getStringExtra("id");
        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String body = getIntent().getStringExtra("body");


        textView1.setText(postid);
        textView2.setText(id);
        textView3.setText(name);
        textView4.setText(email);
        textView5.setText(body);

    }
}