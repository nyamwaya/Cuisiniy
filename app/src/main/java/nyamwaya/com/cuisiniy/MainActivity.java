package nyamwaya.com.cuisiniy;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import nyamwaya.com.cuisiniy.models.BottomViewModel;

public class MainActivity extends AppCompatActivity {

    private TextView mSearchText;
    private TextView mCameraText;
    private TextView mAccountText;
    private BottomViewModel bottomViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        renderSearchText();
        renderCameraText();
        renderAccountText();
        renderBottomView();



    }

    private void renderSearchText(){
        mSearchText = bottomViewModel.getTextSearch();
        mSearchText = (TextView)(findViewById(R.id.text_search));
    }
    private void renderCameraText(){
        mCameraText = bottomViewModel.getTextCamera();
        mCameraText = (TextView)(findViewById(R.id.text_camera));
    }
    private void renderAccountText(){
        mAccountText = bottomViewModel.getTextAccount();
        mCameraText = (TextView)(findViewById(R.id.text_account));
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

}
