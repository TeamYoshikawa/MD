package sample.pagepuroto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MenuPage extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // メニューに項目を追加する
        getMenuInflater().inflate(R.menu.menupage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //menuからaction_settingsを拾ってます。よくわかんないのでコピッてください
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    //ボタン処理
    public void onClick(View view) {

        switch (view.getId()) {
            //イタリアン
            case R.id.menu_bt001:
                Intent intent = new Intent(this, Italian.class);
                startActivity(intent);
                break;
        }
            //キャベル
        switch (view.getId()) {
            case R.id.menu_bt004:
               Intent intent = new Intent(this, Chapel.class);
                startActivity(intent);
                break;
        }
            //フレンチ
        switch (view.getId()) {
            case R.id.menu_bt005:
                Intent intent = new Intent(this, French.class);
                startActivity(intent);
                break;
        }
            //ワイン
        switch (view.getId()) {
            case R.id.menu_bt006:
                Intent intent = new Intent(this, Wain.class);
                startActivity(intent);
                break;
        }
            //ガーデン
        switch (view.getId()) {
            case R.id.menu_bt007:
                Intent intent = new Intent(this, Garden.class);
                startActivity(intent);
                break;
        }
    }
}








    /*  素材無くてまだ作る気しないボタンの予約
    public void onClick07(View view){
        switch (view.getId()){
            /*case R.id.btnToSecond:
                Intent intent = new Intent(this, ActivitySecond.class);
                startActivity(intent);
                break;

        }
    }
    public void onClick08(View view){
        switch (view.getId()){
            /*case R.id.btnToSecond:
                Intent intent = new Intent(this, ActivitySecond.class);
                startActivity(intent);
                break;

        }
    }
    public void onClick09(View view){
        switch (view.getId()){
            /*case R.id.btnToSecond:
                Intent intent = new Intent(this, ActivitySecond.class);
                startActivity(intent);
                break;

        }
    }
   */


