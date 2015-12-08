package com.example.nwuser.cameraex;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.MediaScannerConnection;
import android.os.Environment;
import android.view.MotionEvent;
import android.view.TextureView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

//カメラとギャラリー
public class CameraView extends TextureView
        implements TextureView.SurfaceTextureListener, Camera.PictureCallback {
    private Camera camera;//カメラ

    //コンストラクタ
    public CameraView(Context context) {
        super(context);

        //テクスチャービューのリスナーの指定
        setSurfaceTextureListener(this);
    }

    //サーフェイステクスチャ有効化時に呼ばれる(1)
    @Override
    public void onSurfaceTextureAvailable(
            SurfaceTexture surface, int width, int height) {
        //カメラの初期化(2)
        try {
            camera = Camera.open();
            if (camera == null) camera = Camera.open(0);
            camera.setPreviewTexture(surface);
            camera.startPreview();//(3)
        } catch (Exception e) {
        }
    }

    //サーフェイステクスチャサイズ変更時に呼ばれる
    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface,
                                            int width, int height) {
    }

    //サーフェイステクスチャ更新時に呼ばれる
    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
    }

    //サーフェイステクスチャ破棄時に呼ばれる
    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        //カメラのプレビュー停止(4)
        camera.setPreviewCallback(null);
        camera.stopPreview();
        camera.release();
        camera = null;
        return true;
    }

    //タッチ時に呼ばれる
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            //カメラのスクリーンショットの取得(5)
            camera.takePicture(null, null, this);
        }
        return true;
    }

    //写真撮影完了時に呼ばれる
    public void onPictureTaken(byte[] data, Camera camera) {
        try {
            //ファイル名の生成(6)
            SimpleDateFormat format = new SimpleDateFormat(
                    "'IMG'_yyyyMMdd_HHmmss'.png'", Locale.getDefault());
            String fileName = format.format(
                    new Date(System.currentTimeMillis()));

            //SDカードへの保存(7)
            String path = Environment.getExternalStorageDirectory() +
                    "/" + fileName;
            saveToSD(data, path);

            //ギャラリーへの登録(8)
            MediaScannerConnection.scanFile(this.getContext(),
                    new String[]{path},
                    new String[]{"image/png"},
                    null);
            toast("撮影完了");
        } catch (Exception e) {
            toast(e.toString());
        }

        //プレビュー再開
        camera.startPreview();
    }

    //SDカードへの保存
    private void saveToSD(byte[] w, String path)
            throws Exception {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(path);
            out.write(w);
            out.close();
        } catch (Exception e) {
            if (out != null) out.close();
            throw e;
        }
    }

    //トーストの表示　
    private void toast(String text) {
        Toast.makeText(getContext(), text, Toast.LENGTH_LONG).show();
    }
}