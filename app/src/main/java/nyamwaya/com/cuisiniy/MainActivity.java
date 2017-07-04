package nyamwaya.com.cuisiniy;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import nyamwaya.com.cuisiniy.ui.CameraActivity;


public class MainActivity extends AppCompatActivity {

    private TextView mSearchText;
    private TextView mCameraText;
    private TextView mAccountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchText = (TextView) findViewById(R.id.text_search);
        mCameraText = (TextView)(findViewById(R.id.text_camera));
        mAccountText = (TextView)(findViewById(R.id.text_account));

        renderBottomView();

    }

    private void renderBottomView(){
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_search:
                        mSearchText.setVisibility(View.VISIBLE);
                        mCameraText.setVisibility(View.GONE);
                        mAccountText.setVisibility(View.GONE);
                        break;
                    case R.id.action_camera:
                        launchActivity(CameraActivity.class);
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


    private void launchActivity(Class<CameraActivity> activity){
        Intent mIntent = new Intent(MainActivity.this, activity);
        startActivity(mIntent);
    }

}
