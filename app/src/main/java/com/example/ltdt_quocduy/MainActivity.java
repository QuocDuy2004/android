package com.example.ltdt_quocduy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private static boolean checkSignIn = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!checkSignIn) {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            checkSignIn = true;
        }

        TabLayout tabLayout = findViewById(R.id.tablayout);
        ViewPager2 pager2 = findViewById(R.id.viewPager2);


//
//        ViewPager2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Chuyển đến tab ReviewActivity khi nhấp vào ImageView
//                Intent intent = new Intent(MainActivity.this, ReviewActivity.class);
//                startActivity(intent);
//            }
//        });

        TablayoutAdapter adapter = new TablayoutAdapter(MainActivity.this);
        pager2.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, pager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setIcon(R.drawable.home);
                        break;
                    case 1:
                        tab.setIcon(R.drawable.bell);
                        break;
                    case 2:
                        tab.setIcon(R.drawable.plus);
                        break;
                    case 3:
                        tab.setIcon(R.drawable.cart);
                        break;
                    case 4:
                        tab.setIcon(R.drawable.setting);
                        break;
                    default:
                        tab.setIcon(R.drawable.bell);
                        break;
                }
            }
        }).attach();
    }
}
