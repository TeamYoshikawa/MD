package sample.HillsideGarden;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import sample.xmlcenger.R;

public class ActivityCover extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // メニューに項目を追加する
        getMenuInflater().inflate(R.menu.activity_cover, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
 //menuからaction_settingsを拾ってます。よくわかんないのでコピッてください
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnToSecond:
                Intent intent = new Intent(this, ActivityDescription.class);
                startActivity(intent);
                break;
        }
    }
}
