package com.doyen.fans.junittest;

import android.support.test.rule.ActivityTestRule;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainActivityTest {
    final static String TAG = "MainActivityTest";
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private MainActivity mActivity = null;
    @Before
    public void setUp() throws Exception {
        Log.i(TAG, "setUp");
        mActivity = mActivityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
        Log.i(TAG, "tearDown");
        mActivity = null;
    }

    @Test
    public void onCreate() {
        Log.i(TAG, "onCreate");
        View txtView;
        txtView = mActivity.findViewById(R.id.textViewDog);
        assertNotNull(txtView);
    }
}