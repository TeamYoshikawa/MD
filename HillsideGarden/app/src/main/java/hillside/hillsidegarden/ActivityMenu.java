package hillside.hillsidegarden;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

public class ActivityMenu extends Activity implements OnClickListener {

    private ImageButton imageButton;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private ImageButton imageButton5;
    private ImageButton imageButton6;
    private ImageButton imageButton7;
    private ImageButton imageButton8;
    private ImageButton imageButton9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_menu);

        imageButton=(ImageButton)findViewById(R.id.imageButton);
        imageButton2=(ImageButton)findViewById(R.id.imageButton2);
        imageButton3=(ImageButton)findViewById(R.id.imageButton3);
        imageButton4=(ImageButton)findViewById(R.id.imageButton4);
        imageButton5=(ImageButton)findViewById(R.id.imageButton5);
        imageButton6=(ImageButton)findViewById(R.id.imageButton6);
        imageButton7=(ImageButton)findViewById(R.id.imageButton7);
        imageButton8=(ImageButton)findViewById(R.id.imageButton8);
        imageButton9=(ImageButton)findViewById(R.id.imageButton9);

        imageButton.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
        imageButton6.setOnClickListener(this);
        imageButton7.setOnClickListener(this);
        imageButton8.setOnClickListener(this);
        imageButton9.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // メニューに項目がある場合に項目を追加する
        getMenuInflater().inflate(R.menu.menu_activity_menu, menu);
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
        switch (view.getId()) {
            //イタリアンのページに飛ぶボタン
            case R.id.imageButton:
                Intent intent = new Intent(this, ActivityItalian.class);
                startActivity(intent);
                break;

            case R.id.imageButton2:
                //オリジナルウェディングのページに飛ぶボタン
                intent = new Intent(this, ActivityWeddeing.class);
                startActivity(intent);
                break;


            case R.id.imageButton3:
                //試着大剣に飛ぶボタン
                intent = new Intent(this, ActivityTitle.class);
                startActivity(intent);
            break;

            case R.id.imageButton4:
                //チャペルのページに飛ぶボタン
                intent = new Intent(this, ActivityChapel.class);
                startActivity(intent);
                break;

            case R.id.imageButton5:
                //フレンチのページに飛ぶボタン
                intent = new Intent(this, ActivityFrench.class);
                startActivity(intent);
                break;

            case R.id.imageButton6:
                //ワイン庫のページに飛ぶボタン
                intent = new Intent(this, ActivityWine.class);
                startActivity(intent);
                break;

            case R.id.imageButton7:
                //ガーデンのページに飛ぶボタン
                intent = new Intent(this, ActivityGarden.class);
                startActivity(intent);

                break;

            case R.id.imageButton8:
                //アクセスのページに飛ぶボタン
                intent = new Intent (this,ActivityAccess.class);
                startActivity(intent);

                break;

            case R.id.imageButton9:
                //フロアマップのページに飛ぶボタン
                intent = new Intent (this,ActivityFloorMap.class);
                startActivity(intent);
                break;
        }
    }
}

