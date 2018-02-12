package edu.wtamu.cis.cidm4385saru.criminalintent;


import android.os.Bundle;

//import android.support.v4.app.Fragment;
import android.app.Fragment;
//import android.support.v4.app.FragmentManager;
import android.app.FragmentManager;

//import android.support.v7.app.AppCompatActivity;
import android.app.Activity;


//public class CrimeActivity extends AppCompatActivity {
public class CrimeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

//        FragmentManager fm = getSupportFragmentManager();
        FragmentManager fm = getFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new CrimeFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
