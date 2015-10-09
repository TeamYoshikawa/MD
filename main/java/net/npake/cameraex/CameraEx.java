

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
    /*�A�N�e�B���B�e�B�N�����ɌĂ΂��*/
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        //�t���X�N���[���ݒ�
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
/*AndroidManifest�p����
*�@android:screenOrientation=�hportrait�h�@�@��ʂ��c��ʂɌŒ�
*  android:screenOrientation=�hlandscape�h�@�@��ʂ�����ʂɌŒ�
* */


