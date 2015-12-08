package hillside.hillsidegarden02.Access;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
//WebViewをインポート
import android.webkit.WebView;
import android.webkit.WebViewClient;

import hillside.hillsidegarden02.R;


public class HomePage_Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home_page);
        WebView  myWebView = (WebView)findViewById(R.id.webView1);
        /*標準ブラウザをキャンセル*/
        myWebView.setWebViewClient(new WebViewClient());
        /*アプリ起動時に読み込むURL*/
        myWebView.loadUrl("http://www.hillsidegarden.jp/");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_homepage, menu);
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
