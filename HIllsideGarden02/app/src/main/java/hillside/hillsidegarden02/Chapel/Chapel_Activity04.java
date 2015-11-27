package hillside.hillsidegarden02.Chapel;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;



import hillside.hillsidegarden02.R;


public class Chapel_Activity04 extends Activity implements OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapel_04);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // メニューに項目がある場合に項目を追加する
        getMenuInflater().inflate(R.menu.menu_chapel04, menu);
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


    public void onClick(View view){
        Intent intent;
        switch (view.getId()){
            //タップしてね！！
            case R.id.imageButton:
                intent = new Intent(this, hillside.hillsidegarden02.Menu_Activity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
