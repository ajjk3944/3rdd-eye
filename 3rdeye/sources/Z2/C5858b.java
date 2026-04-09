package z2;

import I2.m;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.AudioManager;
import android.net.Uri;
import android.util.Log;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.services.CameraService;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import m1.C5317a;

/* compiled from: CameraManager.java */
/* renamed from: z2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5858b implements Camera.PictureCallback, Camera.ErrorCallback, Camera.PreviewCallback, Camera.AutoFocusCallback {

    /* renamed from: b, reason: collision with root package name */
    public final CameraService f48431b;

    /* renamed from: c, reason: collision with root package name */
    public Camera f48432c;

    /* renamed from: d, reason: collision with root package name */
    public SurfaceTexture f48433d;

    /* renamed from: e, reason: collision with root package name */
    public final CameraService f48434e;

    /* renamed from: f, reason: collision with root package name */
    public final m f48435f;

    public C5858b(CameraService cameraService, CameraService cameraService2) {
        this.f48431b = cameraService;
        this.f48434e = cameraService2;
        this.f48435f = new m(cameraService);
    }

    public final void a() {
        Camera camera = this.f48432c;
        if (camera != null) {
            camera.release();
            this.f48433d.release();
            this.f48432c = null;
            this.f48433d = null;
        }
        try {
            CameraService cameraService = this.f48431b;
            if (cameraService != null) {
                ((AudioManager) cameraService.getSystemService("audio")).adjustStreamVolume(1, 100, 0);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            Log.i("TAG", "unmute expction : " + e4.getLocalizedMessage());
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z10, Camera camera) {
        if (camera != null) {
            try {
                camera.takePicture(null, null, this);
                this.f48432c.autoFocus(null);
            } catch (Exception e4) {
                e4.printStackTrace();
                Log.i("TAG", "on auto : " + e4.getLocalizedMessage());
                a();
            }
        }
    }

    @Override // android.hardware.Camera.ErrorCallback
    public final void onError(int i, Camera camera) {
        if (i == 1) {
            Log.e("TAG", "Camera error: Unknown");
            return;
        }
        if (i == 2) {
            Log.e("TAG", "Camera error: Camera was disconnected due to use by higher priority user");
            return;
        }
        if (i == 100) {
            Log.e("TAG", "Camera error: Media server died");
            return;
        }
        Log.e("TAG", "Camera error: no such error id (" + i + ")");
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) throws IOException {
        m mVar = this.f48435f;
        try {
            File file = new File(I2.b.f2414b);
            Log.i(AppMeasurementSdk.ConditionalUserProperty.NAME, "directory : " + file);
            if (bArr == null) {
                Log.e("TAG", "Can't save image - no data");
            } else if (file.exists() || file.mkdirs()) {
                new SimpleDateFormat("yyyy-MM-dd HH-mm-ss", Locale.US).format(new Date());
                String str = file.getPath() + File.separator + ("intruder_detected_" + UUID.randomUUID().toString() + ".png");
                Log.d("TAG", str);
                File file2 = new File(str);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                Log.i("TAG", "pic :" + file2.getPath());
                boolean z10 = mVar.f2429a.getBoolean("GALLERY", false);
                CameraService cameraService = this.f48431b;
                if (z10) {
                    String path = file2.getPath();
                    Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                    intent.setData(Uri.fromFile(new File(path)));
                    cameraService.sendBroadcast(intent);
                }
                String path2 = file2.getPath();
                Intent intent2 = new Intent("ACTION_NEW_INTRUDER");
                intent2.putExtra("EXTRA_PHOTO_PATH", path2);
                C5317a.a(cameraService).c(intent2);
            } else {
                Log.e("TAG", "Can't create directory to save image.");
            }
        } catch (Exception e4) {
            Log.e("TAG", e4.getLocalizedMessage());
            e4.printStackTrace();
        }
        CameraService cameraService2 = this.f48434e;
        CameraService cameraService3 = cameraService2.f22235c;
        Intent intent3 = new Intent("ACTION_CAMERA_SERVICE");
        intent3.putExtra("message", "This is my message!");
        C5317a.a(cameraService3).c(intent3);
        cameraService2.stopSelf();
        int i = mVar.f2429a.getInt("FLAG", 0) + 1;
        mVar.f2429a.edit().putInt("FLAG", i).apply();
        Log.i("TAG", "onPictureTaken" + i);
        a();
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        boolean zContains;
        if (camera != null) {
            try {
                zContains = camera.getParameters().getSupportedFocusModes().contains("auto");
            } catch (Exception e4) {
                Log.e("TAG", "Camera error while taking picture");
                e4.printStackTrace();
                a();
                return;
            }
        } else {
            zContains = false;
        }
        if (zContains) {
            camera.setPreviewCallback(null);
            camera.takePicture(null, null, this);
        } else {
            camera.setPreviewCallback(null);
            camera.takePicture(null, null, this);
        }
    }
}
