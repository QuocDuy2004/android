//package com.example.ltdt_quocduy;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//
//import androidx.annotation.NonNull;
//import androidx.viewpager.widget.PagerAdapter;
//
//import com.bumptech.glide.Glide;
//
//import java.util.List;
//public class PhotoAdapter extends PagerAdapter {
//
//    private Context mContext;
//    private List<Photo> mListPhoto;
//
//    public PhotoAdapter(Context mContext, List<Photo> mListPhoto) {
//        this.mContext = mContext;
//        this.mListPhoto = mListPhoto;
//    }
//
//    @NonNull
//    @Override
//    public Object instantiateItem(@NonNull ViewGroup container, int position)
//    {
//        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.item_review, container,false);
//        ImageView imagePhoto = view.findViewById(R.id.img_photo);
//
//        Photo photo = mListPhoto.get(position);
//        if(photo != null){
//            //có thể thay đổi kiểu load khác nhau
//            Glide.with(mContext).load(photo.getResourceId()).into(imagePhoto);
//        }
//        //add view to viewgroup
//        container.addView(view);
//        return view;
//    }
//
//    @Override
//    public int getCount() {
//        if(mListPhoto != null){
//            return mListPhoto.size();
//        }
//        return 0;
//    }
//
//    @Override
//    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//
//        return view == object;
//    }
//
//    @Override
//    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        // remove view
//        container.removeView((View) object);
//    }
//}
