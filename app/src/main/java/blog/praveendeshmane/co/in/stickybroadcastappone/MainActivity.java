package blog.praveendeshmane.co.in.stickybroadcastappone;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyReceiver myReceiver = null;
    IntentFilter intentFilter = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        myReceiver = new MyReceiver();
        intentFilter = new IntentFilter();
        intentFilter.addAction("blog.praveendeshmane.co.in");
        registerReceiver(myReceiver,intentFilter);
    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(myReceiver);
        super.onDestroy();
    }
}
