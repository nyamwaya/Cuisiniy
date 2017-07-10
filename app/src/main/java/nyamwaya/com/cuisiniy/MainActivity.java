package nyamwaya.com.cuisiniy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import nyamwaya.com.cuisiniy.fragments.HomeFragment;
import nyamwaya.com.cuisiniy.ui.CameraActivity;


public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;
    private FragmentManager mFragmentManager;
    private Fragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        mFragmentManager = getSupportFragmentManager();
        mFragment = new HomeFragment();
        final FragmentTransaction transaction = mFragmentManager.beginTransaction();
        transaction.add(R.id.main_container, mFragment).commit();



        renderBottomView();

    }

    private void renderBottomView() {
        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_search:
                        mFragment = new HomeFragment();
                        break;
                    case R.id.action_camera:
                        launchActivity(CameraActivity.class);
                        break;
                    case R.id.action_account:
                        break;
                }
                return false;
            }
        });
    }

    private void launchActivity(Class<CameraActivity> activity) {
        Intent mIntent = new Intent(MainActivity.this, activity);
        startActivity(mIntent);
    }
}