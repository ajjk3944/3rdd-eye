package C2;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.customview.AutoFitTextureView;
import java.io.IOException;
import java.util.List;

/* compiled from: LegacyCameraConnectionFragment.java */
@SuppressLint({"ValidFragment"})
/* loaded from: classes.dex */
public final class j extends Fragment {
    public static final D2.c i = new D2.c();

    /* renamed from: b, reason: collision with root package name */
    public Camera f904b;

    /* renamed from: c, reason: collision with root package name */
    public final com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a f905c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f906d;

    /* renamed from: e, reason: collision with root package name */
    public final int f907e;

    /* renamed from: f, reason: collision with root package name */
    public AutoFitTextureView f908f;

    /* renamed from: g, reason: collision with root package name */
    public final a f909g = new a();

    /* renamed from: h, reason: collision with root package name */
    public HandlerThread f910h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, 180);
    }

    public j(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a aVar, int i10, Size size) {
        this.f905c = aVar;
        this.f907e = i10;
        this.f906d = size;
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(this.f907e, viewGroup, false);
    }

    @Override // android.app.Fragment
    public final void onPause() throws InterruptedException {
        Camera camera = this.f904b;
        if (camera != null) {
            camera.stopPreview();
            this.f904b.setPreviewCallback(null);
            this.f904b.release();
            this.f904b = null;
        }
        this.f910h.quitSafely();
        try {
            this.f910h.join();
            this.f910h = null;
        } catch (InterruptedException e4) {
            i.b(e4, "Exception!", new Object[0]);
        }
        super.onPause();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f910h = handlerThread;
        handlerThread.start();
        if (!this.f908f.isAvailable()) {
            this.f908f.setSurfaceTextureListener(this.f909g);
            return;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i10 = 0;
        while (true) {
            if (i10 >= Camera.getNumberOfCameras()) {
                i10 = -1;
                break;
            }
            Camera.getCameraInfo(i10, cameraInfo);
            if (cameraInfo.facing == 0) {
                break;
            } else {
                i10++;
            }
        }
        Camera cameraOpen = Camera.open(i10);
        this.f904b = cameraOpen;
        try {
            cameraOpen.startPreview();
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.f908f = (AutoFitTextureView) view.findViewById(R.id.texture);
    }

    /* compiled from: LegacyCameraConnectionFragment.java */
    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) throws IOException {
            j jVar = j.this;
            try {
                jVar.getClass();
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 >= Camera.getNumberOfCameras()) {
                        i12 = -1;
                        break;
                    }
                    Camera.getCameraInfo(i12, cameraInfo);
                    if (cameraInfo.facing == 0) {
                        break;
                    } else {
                        i12++;
                    }
                }
                Camera cameraOpen = Camera.open(i12);
                jVar.f904b = cameraOpen;
                Camera.Parameters parameters = cameraOpen.getParameters();
                List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                if (supportedFocusModes != null && supportedFocusModes.contains("continuous-picture")) {
                    parameters.setFocusMode("continuous-picture");
                }
                List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                Size[] sizeArr = new Size[supportedPreviewSizes.size()];
                for (Camera.Size size : supportedPreviewSizes) {
                    sizeArr[i11] = new Size(size.width, size.height);
                    i11++;
                }
                Size sizeA = e.a(sizeArr, jVar.f906d.getWidth(), jVar.f906d.getHeight());
                parameters.setPreviewSize(sizeA.getWidth(), sizeA.getHeight());
                jVar.f904b.setDisplayOrientation(90);
                jVar.f904b.setParameters(parameters);
                jVar.f904b.setPreviewTexture(surfaceTexture);
            } catch (IOException unused) {
                jVar.f904b.release();
            }
            jVar.f904b.setPreviewCallbackWithBuffer(jVar.f905c);
            Camera.Size previewSize = jVar.f904b.getParameters().getPreviewSize();
            Camera camera = jVar.f904b;
            int i13 = previewSize.height;
            int i14 = previewSize.width;
            D2.c cVar = D2.b.f1033a;
            camera.addCallbackBuffer(new byte[(((i14 + 1) / 2) * ((i13 + 1) / 2) * 2) + (i13 * i14)]);
            jVar.f908f.a(previewSize.height, previewSize.width);
            jVar.f904b.startPreview();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i10) {
        }
    }
}
