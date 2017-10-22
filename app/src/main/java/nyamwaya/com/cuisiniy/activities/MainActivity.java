package nyamwaya.com.cuisiniy.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import nyamwaya.com.cuisiniy.R;
import nyamwaya.com.cuisiniy.fragments.HomeFragment;
import nyamwaya.com.cuisiniy.fragments.ProfileFragment;


public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;
    private Fragment mFragment;
    private FragmentManager mFragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);

        mFragmentManager = getSupportFragmentManager();
        final FragmentTransaction transaction = mFragmentManager.beginTransaction();
        mBottomNavigationView = findViewById(R.id.bottom_navigation);

        renderBottomView();
    }



    private void renderBottomView() {
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.action_account:
                        mFragment= new ProfileFragment();
                        break;
                    case R.id.action_search:
                        mFragment= new HomeFragment();
                        break;
                    /*case R.id.action_camera:
                        break;*/
                }
                final FragmentTransaction transaction = mFragmentManager.beginTransaction();
                transaction.replace(R.id.main_container, mFragment).commit();
                return true;
            }
        });
    }

    public void performStreamClick(){
        View view = mBottomNavigationView.findViewById(R.id.main_container);
        view.performClick();
    }
}