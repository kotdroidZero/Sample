package com.error_found.pk.sample.NewDesigns;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.error_found.pk.sample.R;

public class GmailActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    Toolbar mToolbar;
    NavigationView mNavigationView;
    DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);

        init();
        setSupportActionBar(mToolbar);
        setUpNavigationView();
    }

    private void setUpNavigationView() {
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                //Log.e("item id =",item.getItemId()+" , "+item.getGroupId());
                item.setChecked(true);
                switch (item.getItemId())
                {
                    case R.id.nav_allinbox:
                        Snackbar.make(getWindow().getDecorView().getRootView(),
                                "All inboxes",Snackbar.LENGTH_LONG);
                        break;
                    case R.id.nav_primary:
                        //mNavigationView.getMenu().getItem(1).setChecked(true);
                        Snackbar.make(getWindow().getDecorView().getRootView(),
                                "primary messages",Snackbar.LENGTH_LONG);
                        break;
                    case R.id.nav_social:
                        //mNavigationView.getMenu().getItem(2).setChecked(true);
                        Snackbar.make(getWindow().getDecorView().getRootView(),
                                "social ",Snackbar.LENGTH_LONG);
                        break;
                    case R.id.nav_promotions:
                        Snackbar.make(getWindow().getDecorView().getRootView(),
                                "mails related to promotions",Snackbar.LENGTH_LONG);
                        break;
                    case R.id.nav_starred:
                        Snackbar.make(getWindow().getDecorView().getRootView(),
                                "starred messages",Snackbar.LENGTH_LONG);
                        break;
                    case R.id.nav_important:
                        Snackbar.make(getWindow().getDecorView().getRootView(),
                                "important mails",Snackbar.LENGTH_LONG);
                        break;
                    case R.id.nav_sent:
                        Snackbar.make(getWindow().getDecorView().getRootView(),
                                "mail you have sent",Snackbar.LENGTH_LONG);
                        break;
                    case R.id.nav_outbox:
                        Snackbar.make(getWindow().getDecorView().getRootView(),
                                "mail is sending",Snackbar.LENGTH_LONG);
                        break;
                    case R.id.nav_drafts:
                        Snackbar.make(getWindow().getDecorView().getRootView(),
                                "continue writing",Snackbar.LENGTH_LONG);
                        break;
                    case R.id.nav_all_mail:
                        Snackbar.make(getWindow().getDecorView().getRootView(),
                                "all mails",Snackbar.LENGTH_LONG);
                        break;
                    case R.id.nav_spam:
                        Snackbar.make(getWindow().getDecorView().getRootView(),
                                "spam mails",Snackbar.LENGTH_LONG);
                        break;
                    case R.id.nav_trash:
                        Snackbar.make(getWindow().getDecorView().getRootView(),
                                "trash mails",Snackbar.LENGTH_LONG);
                        break;
                    default:
                }
                return true;
            }
        });

        ActionBarDrawerToggle mActionBarDrawerToggle=new ActionBarDrawerToggle(this
                ,mDrawerLayout,R.string.openDrawer,R.string.closeDrawer){
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
        mDrawerLayout.addDrawerListener(mActionBarDrawerToggle);
        mActionBarDrawerToggle.syncState();
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
}
