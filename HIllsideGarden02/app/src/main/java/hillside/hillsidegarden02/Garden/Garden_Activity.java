package hillside.hillsidegarden02.Garden;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import hillside.hillsidegarden02.Menu_Activity;
import hillside.hillsidegarden02.R;


public class Garden_Activity extends Activity implements OnClickListener {
    private ImageButton imageButton;
    private ImageButton imageButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garden);
        imageButton=(ImageButton)findViewById(R.id.imageButton);
        imageButton2=(ImageButton)findViewById(R.id.imageButton2);

        imageButton.setOnClickListener(this);
        imageButton2.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // メニューに項目がある場合に項目を追加する
        getMenuInflater().inflate(R.menu.menu_garden, menu);
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


    //ボタンの処理
    public void onClick(View view){
        Intent intent;
        switch (view.getId()){
            //タップしてね！！
            case R.id.imageButton:
                intent = new Intent(this, hillside.hillsidegarden02.Garden.Garden_Activity01.class);
                startActivity(intent);
                break;

            case R.id.imageButton2:
                intent = new Intent(this, Menu_Activity.class);
                startActivity(intent);
                break;
        }
        finish();
    }
}