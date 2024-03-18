//package com.example.ltdt_quocduy.tab_layout;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.example.ltdt_quocduy.LoginActivity;
//import com.example.ltdt_quocduy.MainActivity;
//import com.example.ltdt_quocduy.R;
//import com.example.ltdt_quocduy.RegisterActivity;
//
//public class ProductActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_home);
//        ImageView imageViewDualuoi = findViewById(R.id.dualuoi);
//        TextView textViewTTK = findViewById(R.id.text);
//
//
//        textViewTTK.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(ProductActivity.this, ReviewActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
//}
