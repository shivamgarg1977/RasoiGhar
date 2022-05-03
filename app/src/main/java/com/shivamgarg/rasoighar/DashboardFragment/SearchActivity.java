package com.shivamgarg.rasoighar.DashboardFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.shivamgarg.rasoighar.DashBoardAdapter.FeaturedRestaurantsAdapter;
import com.shivamgarg.rasoighar.DashBoardAdapter.FeaturedRestaurantsData;
import com.shivamgarg.rasoighar.DashBoardAdapter.PopularItemAdapter;
import com.shivamgarg.rasoighar.DashBoardAdapter.PopularItemData;
import com.shivamgarg.rasoighar.R;

import java.util.ArrayList;
import java.util.List;


public class SearchActivity extends Fragment {


    private RecyclerView recyclerViewFeaturedRest;
    private RecyclerView recyclerViewPopularItems;
    List<FeaturedRestaurantsData> userDataFeaturedRest;
    List<PopularItemData> userDataPopularItems;
    private FeaturedRestaurantsAdapter madapterFeaturedRest;
    private PopularItemAdapter madapterPopularItems;
    private PopularItemAdapter.PopularItemsListener listener;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_search_activity, container, false);
        initFeaturedRestaurantsData();
        initFeaturedPopularItems();
        setOnClickListener();
        recyclerViewFeaturedRest=(RecyclerView) view.findViewById(R.id.feature_restaurants_recycler_view);
        recyclerViewPopularItems=(RecyclerView) view.findViewById(R.id.popular_items_recycler_view);

        LinearLayoutManager layoutManagerFeaturedRest = new LinearLayoutManager(
                getActivity(), LinearLayoutManager.HORIZONTAL,true);
LinearLayoutManager layoutManagerPopularItems = new LinearLayoutManager(
                getActivity(), LinearLayoutManager.HORIZONTAL,true);

        recyclerViewFeaturedRest.setLayoutManager(layoutManagerFeaturedRest);
        recyclerViewPopularItems.setLayoutManager(layoutManagerPopularItems);

        madapterFeaturedRest=new FeaturedRestaurantsAdapter(userDataFeaturedRest);
        madapterPopularItems= new PopularItemAdapter(userDataPopularItems,listener);
        recyclerViewFeaturedRest.setAdapter(madapterFeaturedRest);
        recyclerViewPopularItems.setAdapter(madapterPopularItems);

        return view;
    }

    private void setOnClickListener() {
        listener=new PopularItemAdapter.PopularItemsListener() {

            @Override
            public void onClick(View v, int position) {
                String s="Its working for "+ position;
                Toast.makeText(getContext(),s,Toast.LENGTH_LONG).show();
            }
        };
    }

    private void initFeaturedPopularItems() {
        userDataPopularItems=new ArrayList<>();
        userDataPopularItems.add(new PopularItemData(R.drawable.pasta_pic,"Pasta"));
        userDataPopularItems.add(new PopularItemData(R.drawable.pizza_res,"Pizza"));
        userDataPopularItems.add(new PopularItemData(R.drawable.dhokla,"Dhokla"));
        userDataPopularItems.add(new PopularItemData(R.drawable.mutton,"Mutton"));
        userDataPopularItems.add(new PopularItemData(R.drawable.spagetthi,"Spagetthi"));
        userDataPopularItems.add(new PopularItemData(R.drawable.non_veg,"Chicken"));
        userDataPopularItems.add(new PopularItemData(R.drawable.icecream,"Icecream"));
        userDataPopularItems.add(new PopularItemData(R.drawable.salad,"Salad"));
        userDataPopularItems.add(new PopularItemData(R.drawable.sandwich,"Sandwich"));

    }

    private void initFeaturedRestaurantsData() {
        userDataFeaturedRest=new ArrayList<>();
        userDataFeaturedRest.add(new FeaturedRestaurantsData(R.drawable.pasta_pic,"McDonald's"));
        userDataFeaturedRest.add(new FeaturedRestaurantsData(R.drawable.pizza_res,"Domino's"));
        userDataFeaturedRest.add(new FeaturedRestaurantsData(R.drawable.dhokla,"McDonald's"));
        userDataFeaturedRest.add(new FeaturedRestaurantsData(R.drawable.mutton,"McDonald's"));
        userDataFeaturedRest.add(new FeaturedRestaurantsData(R.drawable.spagetthi,"McDonald's"));
        userDataFeaturedRest.add(new FeaturedRestaurantsData(R.drawable.non_veg,"McDonald's"));
        userDataFeaturedRest.add(new FeaturedRestaurantsData(R.drawable.icecream,"McDonald's"));
        userDataFeaturedRest.add(new FeaturedRestaurantsData(R.drawable.salad,"McDonald's"));
        userDataFeaturedRest.add(new FeaturedRestaurantsData(R.drawable.sandwich,"McDonald's"));

    }
}