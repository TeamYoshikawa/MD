package hillside.hillsidegarden02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;





public class Camera_Menu_Activity extends Activity implements View.OnClickListener {
    private ImageButton imageButton;
    private Button imageButton2;
    private Button imageButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_menu);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton2 = (Button) findViewById(R.id.imageButton2);
        imageButton3 = (Button) findViewById(R.id.imageButton3);

        imageButton.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // メニューに項目がある場合に項目を追加する
        getMenuInflater().inflate(R.menu.menu_experience, menu);
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
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            //TOP
            case R.id.imageButton:
                intent = new Intent(this, hillside.hillsidegarden02.Menu_Activity.class);
                startActivity(intent);
                break;
//インカメ
            case R.id.imageButton2:
                intent = new Intent(this, hillside.hillsidegarden02.CameraEx.class);
                startActivity(intent);
                break;
//通常カメラ
            case R.id.imageButton3:
                intent = new Intent(this, hillside.hillsidegarden02.CameraEx02.class);
                startActivity(intent);
                break;
        }
        finish();
    }
}