package hillside.hillsidegarden02.Title;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;


import hillside.hillsidegarden02.R; //フォルダ分けしてるためR.javaのリソースをインポートする必要がある



    public class Title_Activity extends Activity {

private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_title);

        /*アニメーション画像を選択*/
        ImageView feed_out = (ImageView)findViewById(R.id.imageView);
        /*アニメーション準備*/
        AlphaAnimation alphaAnimation = new AlphaAnimation(1,0);
        /*起動開始1/1000*/
        alphaAnimation.setStartOffset(3000);
        /*起動時間1/1000*/
        alphaAnimation.setDuration(2000);
        /*実行*/
        feed_out.startAnimation(alphaAnimation);

        /*スプラッシュ画像を1/1000のミリ秒で表示（起動開始時間+起動時間=5000/1000→5秒）*/
        feed_out.postDelayed(new Title_Activity.splashHandler(), 3000+2000);

    }
    class splashHandler implements Runnable{
    public void run(){
        Intent intent;
        /*インテントを生成して遷移先のアクティヴィティクラスを指定*/
        intent =new Intent(getApplication(),Tap_Activity.class);
        /*↓い　つ　も　の↓*/
        startActivity(intent);
        Title_Activity.this.finish();
    }

}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // メニューに項目がある場合に項目を追加する
        getMenuInflater().inflate(R.menu.menu_title, menu);
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

}
