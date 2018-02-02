package com.error_found.pk.sample.NewDesigns;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.error_found.pk.sample.R;

public class GmailActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    RecyclerView mRecyclerView;
    Toolbar mToolbar;
    NavigationView mNavigationView;
    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle drawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);

        init();
        setSupportActionBar(mToolbar);
        setUpNavigationView();

        drawerToggle=new ActionBarDrawerToggle(this,mDrawerLayout,mToolbar,R.string.openDrawer,
                R.string.closeDrawer);
        mDrawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        mNavigationView.setNavigationItemSelectedListener(this);
    }

    private void setUpNavigationView() {
    }

    private void init() {
        mDrawerLayout=findViewById(R.id.drawer_layout);
        mToolbar=findViewById(R.id.toolbar_gmail_main_homepage);
        mNavigationView=findViewById(R.id.nav_view);
        mRecyclerView=findViewById(R.id.recyclerview_gmail_main_homepage);
        GmailAdapter gmailAdapter=new GmailAdapter(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false));
        mRecyclerView.setAdapter(gmailAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();


        mDrawerLayout.closeDrawers();
        return true;
    }
}
