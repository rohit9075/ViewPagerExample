package rohit.com.viewpagerexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class SecondFragment extends Fragment {

    public SecondFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mSecond =  inflater.inflate(R.layout.fragment_second, container, false);
        return mSecond;
    }


}
