package com.example.apparel;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;

import com.example.apparel.Fragment.CartFragment;
import com.example.apparel.Fragment.HomeFragment;
import com.example.apparel.Fragment.ProfileFragment;
import com.example.apparel.Fragment.SearchFragment;
import com.example.apparel.utils.DrawerMenu;

public class MainActivity extends AppCompatActivity {
    private Button logout;
    public static final String PREFERENCE= "preference";

    BottomNavigationView mBottomNavigation;
    Toolbar mToolbar;

    String title = "Home";

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            initDrawerMenu();
            replaceFragment(new HomeFragment());
            initBottomBar();

//            logout = (Button)findViewById(R.id.main_logout);
//
//            logout.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    SharedPreferences preferences = getSharedPreferences(PREFERENCE , Context.MODE_PRIVATE);
//                    SharedPreferences.Editor editor = preferences.edit();
//                    editor.clear();
//                    editor.commit();
//                    Intent intent = new Intent(MainActivity.this,LoginActivity.class);
//                    startActivity(intent);
//            }
//        });
    }

    private void initBottomBar(){
        mBottomNavigation = (BottomNavigationView) findViewById(R.id.main_bottom_navigation);

        mBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        fragment = new HomeFragment();
                        title = "Home";
                        mToolbar.setTitle(title);
                        break;

                    case R.id.navigation_search:
                        fragment = new SearchFragment();
                        title = "Search";
                        mToolbar.setTitle(title);
                        break;

                    case R.id.navigation_cart:
                        fragment = new CartFragment();
                        title = "Cart";
                        mToolbar.setTitle(title);
                        break;

                    case R.id.navigation_profile:
                        fragment = new ProfileFragment();
                        title = "Profile";
                        mToolbar.setTitle(title);
                        break;
                }
                mToolbar.setTitleTextColor(Color.rgb(135,135,135));
                return replaceFragment(fragment);
            }
        });
    }

    public boolean replaceFragment (Fragment fragment){
        String backStateName =  fragment.getClass().getName();
        String fragmentTag = backStateName;

        FragmentManager manager = getSupportFragmentManager();
        boolean fragmentPopped = manager.popBackStackImmediate (backStateName, 0);
        FragmentTransaction ft = manager.beginTransaction();
        if (!fragmentPopped && manager.findFragmentByTag(fragmentTag) == null){ //fragment not in back stack, create it.
            ft.replace(R.id.main_container, fragment, fragmentTag);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(fragmentTag);
            ft.commit();
            return true;
        }
        return true;
    }

    private void initDrawerMenu(){
        mToolbar = findViewById(R.id.main_toolbar);
        mToolbar.setTitleTextColor(getColor(R.color.primary_dark));
        this.setSupportActionBar(mToolbar);
//
        DrawerMenu drawer = new DrawerMenu();
        drawer.createDrawer(this, this, mToolbar);
        mToolbar.setTitleTextColor(Color.rgb(135,135,135));
    }

}
