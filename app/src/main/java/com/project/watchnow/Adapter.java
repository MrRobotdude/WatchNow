package com.project.watchnow;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Adapter extends FragmentPagerAdapter {

    int count;

    public Adapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        count = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NowPlaying();
            case 1:
                return new ComingSoon();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
