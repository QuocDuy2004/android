package com.example.ltdt_quocduy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class IntrolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introl);

        // Tải và hiển thị ảnh GIF trong ImageView
        ImageView backgroundImage = findViewById(R.id.backgroundImage);
        Glide.with(this).asGif().load(R.drawable.load).into(backgroundImage);

        // Chuyển sang MainActivity sau 3 giây
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(IntrolActivity.this, MainActivity.class));
                finish();
            }
        }, 200);
    }
}
