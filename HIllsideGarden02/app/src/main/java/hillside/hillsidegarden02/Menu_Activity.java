package hillside.hillsidegarden02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
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
/*アクティビティ起動時にボタンを作成*/
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

 /*アクティビティ起動と同時にアニメーションを起動*/
        /*アニメーション対象ボタンの取得*/
        ImageButton transanimation  =(ImageButton)findViewById(R.id.imageButton);   //translateさせるもの
        ImageButton transanimation2 =(ImageButton)findViewById(R.id.imageButton2); //translateさせるもの
        ImageButton transanimation3 =(ImageButton)findViewById(R.id.imageButton3); //translateさせるもの
        ImageButton transanimation4 =(ImageButton)findViewById(R.id.imageButton4); //translateさせるもの
        ImageButton transanimation5 =(ImageButton)findViewById(R.id.imageButton5); //translateさせるもの
        ImageButton transanimation6 =(ImageButton)findViewById(R.id.imageButton6); //translateさせるもの
        ImageButton transanimation7 =(ImageButton)findViewById(R.id.imageButton7); //translateさせるもの


        /*アニメーションの準備(translateAnimation)*/
        TranslateAnimation trans_icon =new TranslateAnimation(0,0,-5,5);
        TranslateAnimation trans_icon_var2 =new TranslateAnimation(0,0,5,-5);
       /*アニメーション起動*/
        /*無限に繰り返す*/
        trans_icon.setRepeatCount(Animation.INFINITE);
        trans_icon_var2.setRepeatCount(Animation.INFINITE);
        /*繰り返し方の指定*/
        trans_icon.setRepeatMode(Animation.REVERSE);
        trans_icon_var2.setRepeatMode(Animation.REVERSE);
        /* 一回ごとの実行時間間隔　1/1000 */
        trans_icon.setDuration(1000);
        trans_icon_var2.setDuration(1000);
        /*実行*/
        transanimation.startAnimation(trans_icon);
        transanimation2.startAnimation(trans_icon_var2);
        transanimation3.startAnimation(trans_icon);
        transanimation4.startAnimation(trans_icon_var2);
        transanimation5.startAnimation(trans_icon);
        transanimation6.startAnimation(trans_icon_var2);
        transanimation7.startAnimation(trans_icon_var2);
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
                //ワインのページに飛ぶボタン
                intent = new Intent(this, hillside.hillsidegarden02.Wine.Wine_Activity02.class);
                startActivity(intent);
                break;

            case R.id.imageButton3:
                //オリジナルに飛ぶボタン
                intent = new Intent(this, hillside.hillsidegarden02.Weddeing.Weddeing_Activity.class);
                startActivity(intent);
                break;

            case R.id.imageButton4:
                //イタリアンのページに飛ぶボタン
                intent = new Intent(this, hillside.hillsidegarden02.Italian.Italian_Activity.class);
                startActivity(intent);
                break;

            case R.id.imageButton5:
                //ガーデンのページに飛ぶボタン
                intent = new Intent(this, hillside.hillsidegarden02.Garden.Garden_Activity.class);
                startActivity(intent);
                break;

            case R.id.imageButton6:
                //フレンチのページに飛ぶボタン
                intent = new Intent(this, hillside.hillsidegarden02.French.French_Activity.class);
                startActivity(intent);
                break;

            case R.id.imageButton7:
                //試着体験のページに飛ぶボタン
                intent = new Intent(this, hillside.hillsidegarden02.Experience_Activity.class);
                startActivity(intent);
                break;

            case R.id.imageButton8:
                //アクセスのページに飛ぶボタン
                intent = new Intent (this, hillside.hillsidegarden02.Access.Access_Activity.class);
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

