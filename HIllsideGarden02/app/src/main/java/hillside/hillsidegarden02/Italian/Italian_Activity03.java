package hillside.hillsidegarden02.Italian;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import hillside.hillsidegarden02.R;


public class Italian_Activity03 extends Activity implements OnClickListener {
    private ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_03);
        imageButton=(ImageButton)findViewById(R.id.imageButton);
        imageButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // メニューに項目がある場合に項目を追加する
        getMenuInflater().inflate(R.menu.menu_italian03, menu);
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

            case R.id.imageButton:
                intent = new Intent(this, hillside.hillsidegarden02.Italian.Italian_Activity02.class);
                startActivity(intent);
                break;
        }
    }
}