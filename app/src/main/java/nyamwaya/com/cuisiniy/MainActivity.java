package nyamwaya.com.cuisiniy;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView mSearchText;
    private TextView mCameraText;
    private TextView mAccountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchText = (TextView) findViewById(R.id.text_search);
        mCameraText = (TextView) (findViewById(R.id.text_camera));
        mAccountText = (TextView) (findViewById(R.id.text_account));

        renderBottomView();

    }

    private void renderBottomView() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_search:
                        mSearchText.setVisibility(View.VISIBLE);
                        mCameraText.setVisibility(View.GONE);
                        mAccountText.setVisibility(View.GONE);
                        break;
                    case R.id.action_camera:
                        mSearchText.setVisibility(View.GONE);
                        mCameraText.setVisibility(View.VISIBLE);
                        mAccountText.setVisibility(View.GONE);
                        break;
                    case R.id.action_account:
                        mSearchText.setVisibility(View.GONE);
                        mCameraText.setVisibility(View.GONE);
                        mAccountText.setVisibility(View.VISIBLE);
                        break;
                }
                return false;
            }
        });
    }

    private void fragmentTracsaction() {
        // Begin the transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        // Replace the contents of the container with the new fragment
        ft.replace(R.id.your_placeholder, new FooFragment());
        // or ft.add(R.id.your_placeholder, new FooFragment());
        // Complete the changes added above
        ft.commit();
    }

}
