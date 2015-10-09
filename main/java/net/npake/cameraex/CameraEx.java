

/**
 * Created by yuta on 2015/10/07.
 */


package net.npake.cameraex;
import android.app.Activity;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
public class CameraEx extends Activity{
    /*アクティヴィティ起動時に呼ばれる*/
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        //フルスクリーン設定
        getWindow().clearFlags(
                WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(new CameraView(this) {

            @Override
            public void onPictureTaken(byte[] data, Camera camera) {
            }
        });

    }

}
/*AndroidManifest用メモ
*　android:screenOrientation=”portrait”　　画面を縦画面に固定
*  android:screenOrientation=”landscape”　　画面を横画面に固定
* */


