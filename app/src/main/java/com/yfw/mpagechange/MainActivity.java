package com.yfw.mpagechange;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yfw.mpagechange.daapter.MPageAdapter;
import com.yfw.mpagechange.view.DotsView;

public class MainActivity extends FragmentActivity implements ViewPager.OnPageChangeListener {
    ViewPager viewPager;
    private DotsView mDotsView;
    /** 对Fragment进行管理  */
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        mDotsView= (DotsView) findViewById(R.id.dotsview_main);
        viewPager= (ViewPager) findViewById(R.id.viewPage);
        viewPager.setAdapter(new MPageAdapter(fragmentManager));
        mDotsView.setDotRessource(R.mipmap.dot_selected, R.mipmap.dot_unselected);
        mDotsView.setNumberOfPage(2);
        mDotsView.selectDot(0);
        viewPager.setOnPageChangeListener(this);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        mDotsView.selectDot(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
