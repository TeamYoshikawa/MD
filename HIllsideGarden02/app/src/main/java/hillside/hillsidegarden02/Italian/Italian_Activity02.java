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


public class Italian_Activity02 extends Activity implements OnClickListener {
    private ImageButton imageButton;
    private ImageButton imageButton2;
    //未設置のボタン
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private ImageButton imageButton5;
    private ImageButton imageButton6;
    private ImageButton imageButton7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_02);
        imageButton=(ImageButton)findViewById(R.id.imageButton);
        imageButton2=(ImageButton)findViewById(R.id.imageButton2);
        imageButton3=(ImageButton)findViewById(R.id.imageButton3);
        imageButton4=(ImageButton)findViewById(R.id.imageButton4);
        imageButton5=(ImageButton)findViewById(R.id.imageButton5);
        imageButton6=(ImageButton)findViewById(R.id.imageButton6);
        imageButton7=(ImageButton)findViewById(R.id.imageButton7);

        imageButton.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
        imageButton6.setOnClickListener(this);
        imageButton7.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // メニューに項目がある場合に項目を追加する
        getMenuInflater().inflate(R.menu.menu_italian02, menu);
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
                intent = new Intent(this, hillside.hillsidegarden02.Italian.Italian_Activity01.class);
                startActivity(intent);
                break;
            case R.id.imageButton2:
                intent=new Intent(this,hillside.hillsidegarden02.Menu_Activity.class);
                startActivity(intent);
                break;
            case R.id.imageButton3:
                intent = new Intent(this, hillside.hillsidegarden02.Italian.Italian_Activity03.class);
                startActivity(intent);
                break;
            case R.id.imageButton4:
               // intent=new Intent(this,hillside.hillsidegarden02.Menu_Activity.class);
              //  startActivity(intent);
                break;
            case R.id.imageButton5:
               // intent = new Intent(this, hillside.hillsidegarden02.Chapel.Chapel_Activity01.class);
               // startActivity(intent);
                break;
            case R.id.imageButton6:
               // intent=new Intent(this,hillside.hillsidegarden02.Menu_Activity.class);
               // startActivity(intent);
                break;
            case R.id.imageButton7:
               // intent = new Intent(this, hillside.hillsidegarden02.Chapel.Chapel_Activity01.class);
               // startActivity(intent);
                break;
        }
        finish();
    }
}