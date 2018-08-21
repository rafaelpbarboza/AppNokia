package com.example.rafael.appnokia.View;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v4.app.FragmentManager;

import com.example.rafael.appnokia.Presenter.View_Pager_Adapter_Order;
import com.example.rafael.appnokia.R;
import com.example.rafael.appnokia.View.Fragment.Fragment_New_Orden;
import com.example.rafael.appnokia.View.Fragment.Fragment_Progress_Order;

import java.util.ArrayList;

import smartdevelop.ir.eram.showcaseviewlib.GuideView;

public class Order extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    private Toolbar toolbar;
    private ViewPager pager;
    private TabLayout tabLayout;
    private BottomNavigationView navigation;
    private SharedPreferences.Editor editor;
    private SharedPreferences sharedPref;
    private ImageView menu_drawable;


    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        pager = (ViewPager) findViewById(R.id.view_Pager_order);
        menu_drawable=(ImageView)findViewById(R.id.menu_drawable);
        tabLayout = (TabLayout) findViewById(R.id.tab_order);
       // navigation = (BottomNavigationView) findViewById(R.id.bottommenu);


        mDrawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        menu_drawable.setOnClickListener(this);

        if (toolbar == null) {
            toolbar = (Toolbar) findViewById(R.id.toolbar_task);
            toolbar.setTitle("");
        }

        setSupportActionBar(toolbar);

        ArrayList<Fragment> fragments = new ArrayList();
        fragments.add(new Fragment_New_Orden());
        fragments.add(new Fragment_Progress_Order());
        pager.setAdapter(new View_Pager_Adapter_Order(getSupportFragmentManager(), fragments));
        tabLayout.setupWithViewPager(pager);
        tabLayout.getTabAt(0).setText(R.string.tab_new_order);
        tabLayout.getTabAt(1).setText(R.string.tab_progress);
        //navigation.setOnNavigationItemSelectedListener(this);

        sharedPref = getSharedPreferences("tutorial", MODE_PRIVATE);
        editor = sharedPref.edit();


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Pass the event to ActionBarDrawerToggle, if it returns
        // true, then it has handled the app icon touch event
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        // Handle your other action bar items...

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (sharedPref.getInt("estado_button_bar", 0) == 0) {
            new GuideView.Builder(this)
                    .setTitle("Boton de navegacion")
                    .setContentText("Navegue el menu para pasar opciones del menu")
                    .setGravity(GuideView.Gravity.auto) //optional
                    .setDismissType(GuideView.DismissType.outside) //optional - default GuideView.DismissType.targetView
                    .setTargetView(navigation)
                    .setContentTextSize(12)//optional
                    .setTitleTextSize(14)//optional
                    .setGuideListener(new GuideView.GuideListener() {
                        @Override
                        public void onDismiss(View view) {
                            editor.putInt("estado_button_bar", 1);
                            editor.commit();
                        }
                    })
                    .build()
                    .show();
        }
        switch (item.getItemId()) {
            case R.id.wo_orders:

                //fragmentTransaction.add(R.id.fragment_container, new Fragment_Progress_Order(), "Fragment Menu");
                // Add the fragment in back stack.
                //fragmentTransaction.addToBackStack(null);

                // Commit.
                //fragmentTransaction.commit();
                return true;

            default:
                //return super.onOptionsItemSelected(item);
        }
        return true;

    }


    @Override
    public void onClick(View view) {
        if(view.getId()==menu_drawable.getId()){
            mDrawerLayout.openDrawer(GravityCompat.START);

        }

    }
}
