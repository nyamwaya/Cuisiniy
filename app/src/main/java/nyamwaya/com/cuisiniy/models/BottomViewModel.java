package nyamwaya.com.cuisiniy.models;

import android.widget.TextView;

/**
 * Created by kerub on 6/5/2017.
 */

public class BottomViewModel {
    private TextView textSearch;
    private TextView textCamera;
    private TextView textAccount;


    public TextView getTextSearch() {
        return textSearch;
    }

    public void setTextSearch(TextView textSearch) {
        this.textSearch = textSearch;
    }

    public TextView getTextCamera() {
        return textCamera;
    }

    public void setTextCamera(TextView textCamera) {
        this.textCamera = textCamera;
    }

    public TextView getTextAccount() {
        return textAccount;
    }

    public void setTextAccount(TextView textAccount) {
        this.textAccount = textAccount;
    }
}
