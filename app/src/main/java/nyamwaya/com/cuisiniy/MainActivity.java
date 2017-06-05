package nyamwaya.com.cuisiniy;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textSearch;
    private TextView textCamera;
    private TextView textAccount;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textSearch = (TextView) findViewById(R.id.text_search);
        textCamera = (TextView) findViewById(R.id.text_camera);
        textAccount = (TextView) findViewById(R.id.text_account);

        bottomNavigationView =(BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_search:
                        textSearch.setVisibility(View.VISIBLE);
                        textCamera.setVisibility(View.GONE);
                        textAccount.setVisibility(View.GONE);
                        break;
                    case R.id.action_camera:
                        textSearch.setVisibility(View.GONE);
                        textCamera.setVisibility(View.VISIBLE);
                        textAccount.setVisibility(View.GONE);
                        break;
                    case R.id.action_account:
                        textSearch.setVisibility(View.GONE);
                        textCamera.setVisibility(View.GONE);
                        textAccount.setVisibility(View.VISIBLE);
                        break;
                }
                return false;
            }
        });
    }
}
