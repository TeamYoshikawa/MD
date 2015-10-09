/**
 * Created by yuta on 2015/10/07.
 */

package net.npake.cameraex;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.MediaScannerConnection;
import android.os.Environment;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.widget.Toast;
import java.io.FileOutputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
public abstract class CameraView extends TextureView implements TextureView.SurfaceTextureListener,Camera.PictureCallback {
    private Camera camera; //カメラ

    public CameraView(Context context) {

        super(context);
        setSurfaceTextureListener(this);
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
        //カメラ初期化
        try {
            camera = camera.open();
            if (camera == null) camera = Camera.open(0);
            camera.setPreviewTexture(surface);
            camera.startPreview();
        } catch (Exception e) {
        }
    }

    @Override  //サーフェイスサイズ変更時
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
    }

    //更新時
    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
    }

    //破棄時
    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        //レビュー停止
        camera.setPreviewCallback(null);
        camera.stopPreview();
        camera.release();
        camera = null;
        return true;
    }

    //タッチ時
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            //スクリーンショットを取得
            if (camera != null)
            camera.takePicture(null, null, this);
        }
        return true;
    }

    //撮影時
    @Override
    public void onPictureTaken(byte[] data, Camera camera) {

        try {
            //ファイル名生成
            SimpleDateFormat format = new SimpleDateFormat(
                    "'IMG'_yyyyMMdd_Hillside'.jpg'",Locale.getDefault());
            String fileName = format.format(
                    new Date(System.currentTimeMillis()));
            //SD保存
            String path = Environment.getExternalStorageDirectory() + "/" + fileName;
            saveToSD(data, path);
            //ギャラリー登録
            MediaScannerConnection.scanFile(this.getContext(),
                    new String[]{path},
                    new String[]{"image/jpeg"},
                    null);
            toast("撮影成功");
        } catch (Exception e) {
            toast(e.toString());
        }
        //プレヴュー再開
        camera.startPreview();
    }
/*
    protected abstract void toast(String s);

    protected abstract void saveToSD(byte[] data, String path);
*/

    //SDカード保存
    private void saveToSD(byte[] w, String path)
        throws Exception{
        FileOutputStream out =null;
        try{
            out=new FileOutputStream(path);
            out.write(w);
            out.close();
        }catch(Exception e){
            if(out !=null)out.close();
            throw e;
        }
    }
    //トースト表示
    private void toast(String text){
        Toast.makeText(getContext(), text,Toast.LENGTH_LONG).show();
    }
}













