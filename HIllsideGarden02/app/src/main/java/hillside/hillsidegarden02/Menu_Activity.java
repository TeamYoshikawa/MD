package hillside.hillsidegarden02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;



public class Menu_Activity extends Activity implements OnClickListener {

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
        setContentView(R.layout.activity_menu);

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
        getMenuInflater().inflate(R.menu.menu_menu, menu);
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
        switch (view.getId()) {
            //チャペルのページに飛ぶボタン
            case R.id.imageButton:
                intent = new Intent(this, hillside.hillsidegarden02.Chapel.Chapel_Activity.class);
                startActivity(intent);
                break;

            case R.id.imageButton2:
                //フレンチのページに飛ぶボタン
                intent = new Intent(this, hillside.hillsidegarden02.French.French_Activity.class);
                startActivity(intent);
                break;

            case R.id.imageButton3:
                //ワインに飛ぶボタン
                intent = new Intent(this, hillside.hillsidegarden02.Wine_Activity.class);
                startActivity(intent);
                break;

            case R.id.imageButton4:
                //ガーデンのページに飛ぶボタン
                intent = new Intent(this, hillside.hillsidegarden02.Garden.Garden_Activity.class);
                startActivity(intent);
                break;

            case R.id.imageButton5:
                //イタリアンのページに飛ぶボタン
                intent = new Intent(this, hillside.hillsidegarden02.Italian.Italian_Activity.class);
                startActivity(intent);
                break;

            case R.id.imageButton6:
                //オリジナルのページに飛ぶボタン
                intent = new Intent(this, hillside.hillsidegarden02.Weddeing_Activity.class);
                startActivity(intent);
                break;

            case R.id.imageButton7:
                //試着体験のページに飛ぶボタン
                intent = new Intent(this, hillside.hillsidegarden02.Garden.Garden_Activity.class);
                startActivity(intent);
                break;

            case R.id.imageButton8:
                //アクセスのページに飛ぶボタン
                intent = new Intent (this, hillside.hillsidegarden02.Access_Activity.class);
                startActivity(intent);
                break;

            case R.id.imageButton9:
                //フロアマップのページに飛ぶボタン
                intent = new Intent (this,FloorMap_Activity.class);
                startActivity(intent);
                break;
        }
        finish();
    }
}

