package edu.wtamu.cis.cidm4385saru.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by sarup on 2/12/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
