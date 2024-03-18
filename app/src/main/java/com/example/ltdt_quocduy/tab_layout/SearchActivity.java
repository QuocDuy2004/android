package com.example.ltdt_quocduy.tab_layout;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ltdt_quocduy.R;

public class SearchActivity extends AppCompatActivity {

    private EditText editTextSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        editTextSearch = findViewById(R.id.editTextSearch);

        // Thiết lập sự kiện cho drawableEnd của EditText
        editTextSearch.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int DRAWABLE_RIGHT = 2;
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= (editTextSearch.getRight() - editTextSearch.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                        // Xử lý sự kiện khi người dùng click vào icon search
                        performSearch();
                        return true;
                    }
                }
                return false;
            }
        });
    }

    // Phương thức để thực hiện tìm kiếm
    private void performSearch() {
        String keyword = editTextSearch.getText().toString().trim();
        if (!keyword.isEmpty()) {
            // Thực hiện tìm kiếm
            // Ví dụ: Hiển thị kết quả tìm kiếm
            Toast.makeText(SearchActivity.this, "Đã tìm kiếm với từ khóa: " + keyword, Toast.LENGTH_SHORT).show();
        } else {
            // Hiển thị thông báo yêu cầu nhập từ khóa
            Toast.makeText(SearchActivity.this, "Vui lòng nhập từ khóa tìm kiếm", Toast.LENGTH_SHORT).show();
        }
    }
}
