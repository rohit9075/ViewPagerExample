package rohit.com.viewpagerexample;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

   private   ViewPager mViewPager;
   private int count = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), count);
        mViewPager.setAdapter(pagerAdapter);


    }
}
