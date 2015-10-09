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
    private Camera camera; //�J����

    public CameraView(Context context) {

        super(context);
        setSurfaceTextureListener(this);
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
        //�J����������
        try {
            camera = camera.open();
            if (camera == null) camera = Camera.open(0);
            camera.setPreviewTexture(surface);
            camera.startPreview();
        } catch (Exception e) {
        }
    }

    @Override  //�T�[�t�F�C�X�T�C�Y�ύX��
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
    }

    //�X�V��
    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
    }

    //�j����
    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        //���r���[��~
        camera.setPreviewCallback(null);
        camera.stopPreview();
        camera.release();
        camera = null;
        return true;
    }

    //�^�b�`��
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            //�X�N���[���V���b�g���擾
            if (camera != null)
            camera.takePicture(null, null, this);
        }
        return true;
    }

    //�B�e��
    @Override
    public void onPictureTaken(byte[] data, Camera camera) {

        try {
            //�t�@�C��������
            SimpleDateFormat format = new SimpleDateFormat(
                    "'IMG'_yyyyMMdd_Hillside'.jpg'",Locale.getDefault());
            String fileName = format.format(
                    new Date(System.currentTimeMillis()));
            //SD�ۑ�
            String path = Environment.getExternalStorageDirectory() + "/" + fileName;
            saveToSD(data, path);
            //�M�������[�o�^
            MediaScannerConnection.scanFile(this.getContext(),
                    new String[]{path},
                    new String[]{"image/jpeg"},
                    null);
            toast("�B�e����");
        } catch (Exception e) {
            toast(e.toString());
        }
        //�v�������[�ĊJ
        camera.startPreview();
    }
/*
    protected abstract void toast(String s);

    protected abstract void saveToSD(byte[] data, String path);
*/

    //SD�J�[�h�ۑ�
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
    //�g�[�X�g�\��
    private void toast(String text){
        Toast.makeText(getContext(), text,Toast.LENGTH_LONG).show();
    }
}













