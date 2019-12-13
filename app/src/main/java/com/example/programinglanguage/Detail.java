package com.example.programinglanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    private ImageView photo;
    private TextView name, desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        photo = findViewById(R.id.detailimage);
        name = findViewById(R.id.detailname);
        desc = findViewById(R.id.detaildesc);

        ProgramingLanguage extra = getIntent().getParcelableExtra("objek");

        name.setText(extra.getProgramName());
        photo.setImageResource(extra.getProgramingPhoto());
        desc.setText(extra.getProgramDetail());
    }
}
