package com.example.ltdt_quocduy;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.ltdt_quocduy.tab_layout.AccountFragment;
import com.example.ltdt_quocduy.tab_layout.BellFragment;
import com.example.ltdt_quocduy.tab_layout.CartFragment;
import com.example.ltdt_quocduy.tab_layout.HistoryFragment;
import com.example.ltdt_quocduy.tab_layout.HomeFragment;
import com.example.ltdt_quocduy.tab_layout.PlusFragment;
import com.example.ltdt_quocduy.tab_layout.SettingFragment;

public class TablayoutAdapter extends FragmentStateAdapter{
    public TablayoutAdapter(@NonNull FragmentActivity fragmentActivity){
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position){
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new BellFragment();
            case 2:
                return new PlusFragment();
            case 3:
                return new CartFragment();
            case 4:
                return new SettingFragment();
            default:
                return new HomeFragment();
        }
    }
    @Override
    public int getItemCount(){
        return 5;
    }
}
