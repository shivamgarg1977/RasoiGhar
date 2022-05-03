package com.shivamgarg.rasoighar.DashBoardAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shivamgarg.rasoighar.R;

import java.util.List;

public class FeaturedRestaurantsAdapter extends RecyclerView.Adapter<FeaturedRestaurantsAdapter.ViewHolder> {

    private List<FeaturedRestaurantsData> data;

    public FeaturedRestaurantsAdapter(List<FeaturedRestaurantsData> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public FeaturedRestaurantsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_restaurants, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedRestaurantsAdapter.ViewHolder holder, int position) {
        int imageSource = data.get(position).getImageView();
        String textSource = data.get(position).getTextView();
        holder.setData(imageSource, textSource);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView;


        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.feature_restaurants_image_view);
            textView = itemView.findViewById(R.id.feature_restaurants_name);

        }

        public void setData(int imageSource, String textSource) {
            imageView.setImageResource(imageSource);
            textView.setText(textSource);
        }
    }
}
