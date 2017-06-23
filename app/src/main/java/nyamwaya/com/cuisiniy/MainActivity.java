package nyamwaya.com.cuisiniy;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import nyamwaya.com.cuisiniy.ui.AccountFragment;
import nyamwaya.com.cuisiniy.ui.CameraFragment;
import nyamwaya.com.cuisiniy.ui.HomeFragment;


public class MainActivity extends AppCompatActivity {

    private TextView mSearchText;
    private TextView mCameraText;
    private TextView mAccountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        renderBottomView();

    }

    private void renderBottomView() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        fragmentTracsaction(new HomeFragment());

                        break;
                    case R.id.action_camera:
                        fragmentTracsaction(new CameraFragment());
                        break;
                    case R.id.action_account:
                        fragmentTracsaction(new AccountFragment());
                        break;
                }
                return false;
            }
        });
    }

    private void fragmentTracsaction(Fragment fragment) {
        // Begin the transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        // Replace the contents of the container with the new fragment
        ft.replace(R.id.your_placeholder, fragment);
        // or ft.add(R.id.your_placeholder, new FooFragment());
        // Complete the changes added above
        ft.commit();
    }

}
