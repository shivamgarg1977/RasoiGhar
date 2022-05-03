package com.shivamgarg.rasoighar.DashBoardAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.shivamgarg.rasoighar.R;
import java.util.List;

public class PopularItemAdapter  extends RecyclerView.Adapter<PopularItemAdapter.ViewHolder> {



    private List<PopularItemData> data;
    private PopularItemsListener listener;
    public PopularItemAdapter(List<PopularItemData> data,PopularItemsListener listener) {
        this.data = data;
        this.listener=listener;
    }


    @NonNull
    @Override
    public PopularItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_item, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull PopularItemAdapter.ViewHolder holder, int position) {
        int imageSource = data.get(position).getRelativeView();
        String textSource = data.get(position).getTextView();
        holder.setData(imageSource, textSource);
    }

    @Override

    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView imageView;
        private TextView textView;
        private ImageView imageLike;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.popular_items_image_view);
            textView = itemView.findViewById(R.id.popular_items_name);
            imageLike=itemView.findViewById(R.id.popular_items_liked);
            imageLike.setOnClickListener(this);
            itemView.setOnClickListener(this);
        }

        public void setData(int imageSource, String textSource) {
            imageView.setImageResource(imageSource);
            textView.setText(textSource);

        }

        @Override
        public void onClick(View v) {
            listener.onClick(v,getAdapterPosition());
        }
    }


    public interface PopularItemsListener {
        void onClick(View v,int position);
    }
}

