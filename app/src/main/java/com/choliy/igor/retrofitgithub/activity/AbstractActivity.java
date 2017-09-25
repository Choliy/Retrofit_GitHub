package com.choliy.igor.retrofitgithub.activity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import butterknife.ButterKnife;

public abstract class AbstractActivity extends AppCompatActivity {

    public abstract int layoutRes();

    public abstract void setupUi();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(layoutRes());
        ButterKnife.bind(this);
        setupUi();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return Boolean.TRUE;
        }
        return super.onOptionsItemSelected(item);
    }
}