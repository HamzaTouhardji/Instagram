package com.example.instagram.utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.instagram.Likes.LikesActivity;
import com.example.instagram.Main.MainActivity;
import com.example.instagram.Profile.ProfileActivity;
import com.example.instagram.R;
import com.example.instagram.Search.SearchActivity;
import com.example.instagram.Share.ShareActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        //bottomNavigationViewEx.enableAnimation(false);
        //bottomNavigationViewEx.enableItemShiftingMode(false);
        //bottomNavigationViewEx.setTextVisibility(false);
        //bottomNavigationViewEx.enableShiftingMode(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, MainActivity.class); //ACTIVITY_NUM 0
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_search:
                        Intent intent2 = new Intent(context, SearchActivity.class); //ACTIVITY_NUM 1
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_add:
                        Intent intent3 = new Intent(context, ShareActivity.class); //ACTIVITY_NUM 2
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_send:
                        Intent intent4 = new Intent(context, LikesActivity.class); //ACTIVITY_NUM 3
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_personal:
                        Intent intent5 = new Intent(context, ProfileActivity.class); //ACTIVITY_NUM 4
                        context.startActivity(intent5);
                        break;

                }

                return false;
            }
        });
    }
}






















































