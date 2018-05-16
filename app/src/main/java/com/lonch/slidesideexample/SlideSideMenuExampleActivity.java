package com.lonch.slidesideexample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

/**
 * 作者：Sword God
 * 创建日期：2018/5/16
 * 描述：
 */
public class SlideSideMenuExampleActivity extends AppCompatActivity {

    private SlideSideMenuTransitionLayout mSlideSideMenu;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_side_menu_example);

        // Grab the widget
        mSlideSideMenu = (SlideSideMenuTransitionLayout) findViewById(R.id.slide_side_menu);

        // Setup the toolbar
        mToolbar = (Toolbar) findViewById(R.id.base_toolbar);
//        setSupportActionBar(mToolbar);
        mToolbar.setTitleTextColor(Color.WHITE);

        // Wire SideMenu with Toolbar
        mToolbar.setNavigationIcon(R.drawable.ic_menu);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSlideSideMenu.toggle();
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (mSlideSideMenu != null && mSlideSideMenu.closeSideMenu()) {
            // Closed the side menu, override the default back pressed behavior
            return;
        }
        super.onBackPressed();
    }

    public void xwOnClick(View view) {
        Toast.makeText(SlideSideMenuExampleActivity.this, "新闻", Toast.LENGTH_SHORT).show();
    }

    public void ylOnClick(View view) {
        Toast.makeText(SlideSideMenuExampleActivity.this, "娱乐", Toast.LENGTH_SHORT).show();
    }

    public void tyOnClick(View view) {
        Toast.makeText(SlideSideMenuExampleActivity.this, "体育", Toast.LENGTH_SHORT).show();
    }

    public void yyOnClick(View view) {
        Toast.makeText(SlideSideMenuExampleActivity.this, "音乐", Toast.LENGTH_SHORT).show();
    }

}
