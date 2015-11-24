package sample.buttonanime;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //アニメーション対象ボタンを取得
        ImageButton alphaanimation =(ImageButton)findViewById(R.id.btn); //フェードイン・アウトさせるもの
        ImageButton transanimation =(ImageButton)findViewById(R.id.icon); //translateさせるもの

       //アニメーションの準備 フェードイン(0,1) フェードアウト(1,0)
        AlphaAnimation feedin_btn = new AlphaAnimation(0,1); //アニメーション 変数 = new アニメーション(引数二つ)
        //アニメーションの準備(translateAnimation)
        TranslateAnimation trans_icon =new TranslateAnimation(0,0,-50,50);
        //時間 1/1000
        feedin_btn.setDuration(5000);
        trans_icon.setDuration(5000);
       //実行
        alphaanimation.startAnimation(feedin_btn);
        transanimation.startAnimation(trans_icon);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // メニューに項目がある場合に項目を追加する
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            case R.id.btn:

        }
    }
}