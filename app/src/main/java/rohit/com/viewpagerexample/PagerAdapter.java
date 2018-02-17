package rohit.com.viewpagerexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by VIVEK on 10/22/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

int tabcount;

    public PagerAdapter(FragmentManager fm, int tabcount) {
        super(fm);
        this.tabcount = tabcount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                FirstFragment firstFragment = new FirstFragment();
                return firstFragment;

            case 1:
                SecondFragment secondFragment = new SecondFragment();
                return secondFragment;

                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
