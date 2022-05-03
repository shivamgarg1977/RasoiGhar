package com.shivamgarg.rasoighar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.google.android.material.navigation.NavigationView;
import com.shivamgarg.rasoighar.DashBoardAdapter.FeaturedRestaurantsAdapter;
import com.shivamgarg.rasoighar.DashBoardAdapter.FeaturedRestaurantsData;
import com.shivamgarg.rasoighar.DashboardFragment.SearchActivity;

import java.util.ArrayList;
import java.util.List;

public class UserDashBoard extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;


    SearchActivity searchActivity=new SearchActivity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dash_board);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        navigationView=findViewById(R.id.dash_board_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.dash_board_container, searchActivity).commit();


    }




}