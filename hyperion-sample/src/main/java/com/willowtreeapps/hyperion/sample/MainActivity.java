package com.willowtreeapps.hyperion.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.willowtreeapps.hyperion.sample.debug.CustomLog;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Log samples for Timber plugin.
        Timber.wtf("Hello Timber Assert!");
        Timber.d("Hello Timber Debug!");
        Timber.e("Hello Timber Error!");
        Timber.i("Hello Timber Info!");
        Timber.v("Hello Timber Verbose!");
        Timber.w("Hello Timber Warn!");

        CustomLog.debug("I'm a custom message!");

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(android.R.id.content, new PagerFragment())
                    .commit();
        }
    }
}