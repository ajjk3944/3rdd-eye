package z2;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.util.Log;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.services.CameraService;
import java.io.IOException;

/* compiled from: CameraManager.java */
/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC5857a extends AsyncTask<Void, Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5858b f48430a;

    public AsyncTaskC5857a(C5858b c5858b) {
        this.f48430a = c5858b;
    }

    @Override // android.os.AsyncTask
    public final Void doInBackground(Void[] voidArr) {
        C5858b c5858b = this.f48430a;
        try {
            c5858b.f48432c = Camera.open(1);
            return null;
        } catch (Exception e4) {
            e4.printStackTrace();
            Log.i("TAG", "camera error: " + e4.getLocalizedMessage());
            c5858b.a();
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Void r62) throws IOException {
        C5858b c5858b = this.f48430a;
        try {
            if (c5858b.f48432c != null) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(123);
                c5858b.f48433d = surfaceTexture;
                c5858b.f48432c.setPreviewTexture(surfaceTexture);
                Camera.Parameters parameters = c5858b.f48432c.getParameters();
                parameters.setRotation(270);
                Camera camera = c5858b.f48432c;
                if (camera != null ? camera.getParameters().getSupportedFocusModes().contains("auto") : false) {
                    parameters.setFocusMode("auto");
                } else {
                    Log.w("TAG", "Autofocus is not supported");
                }
                c5858b.f48432c.setParameters(parameters);
                c5858b.f48432c.setPreviewCallback(c5858b);
                c5858b.f48432c.setErrorCallback(c5858b);
                c5858b.f48432c.startPreview();
                CameraService cameraService = c5858b.f48431b;
                if (cameraService != null) {
                    try {
                        ((AudioManager) cameraService.getSystemService("audio")).adjustStreamVolume(1, -100, 0);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.i("TAG", "camera error: " + e10.getLocalizedMessage());
            c5858b.a();
        }
    }
}
