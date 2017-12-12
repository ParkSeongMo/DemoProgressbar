package sion.demoprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private CommonProgressbar progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControl();
    }

    private void initControl() {

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProgressBar(true);
            }
        });
    }

    protected void showProgressBar(boolean isShow) {
        if(isShow) {
            showProgressBar();
        } else {
            hideProgressBar();
        }
    }

    protected void showProgressBar() {

        if(progressbar == null) {
            progressbar = new CommonProgressbar(MainActivity.this);
        }

        if(!progressbar.isShowing()) {
            progressbar.show();
        }
    }

    protected void hideProgressBar() {

        if(progressbar == null) {
            return;
        }

        if(progressbar.isShowing()) {
            progressbar.dismiss();
        }
    }
}
