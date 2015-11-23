package hillside.hillsidegarden;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class ActivityItalian extends Activity implements OnClickListener{

    private ImageButton imageButton;
    private ImageButton imageButton2;
    private ImageButton imageButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_italian);

        imageButton=(ImageButton)findViewById(R.id.imageButton);
        imageButton2=(ImageButton)findViewById(R.id.imageButton2);
        imageButton3=(ImageButton)findViewById(R.id.imageButton3);

        imageButton.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // メニューに項目がある場合に項目を追加する
        getMenuInflater().inflate(R.menu.menu_activity_italian, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //ボタン処理
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButton:
                Intent intent = new Intent(this, ActivityMenu.class);
                startActivity(intent);
                break;

            case R.id.imageButton2:
                //→ボタン
                intent =new Intent(this,ActivityWine.class);
                startActivity(intent);
                break;

            case R.id.imageButton3:
                //←ボタン
                intent =new Intent(this,ActivityFrench.class);
                startActivity(intent);
                break;

        }
    }
}