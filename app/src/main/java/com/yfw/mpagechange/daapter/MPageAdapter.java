package com.yfw.mpagechange.daapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.yfw.mpagechange.fragment.TClassFragment;
import com.yfw.mpagechange.fragment.TReFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zlt on 2016/7/13.
 */
public class MPageAdapter extends FragmentPagerAdapter {
    //页面列表
    private List<Fragment> fragments=new ArrayList();
    public MPageAdapter(FragmentManager fm) {
        super(fm);
        //添加页面
        fragments.add(new TReFragment());
        fragments.add(new TClassFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
