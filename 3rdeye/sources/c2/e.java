package C2;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.customview.AutoFitTextureView;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: CameraConnectionFragment.java */
@SuppressLint({"ValidFragment"})
/* loaded from: classes.dex */
public final class e extends Fragment {

    /* renamed from: w, reason: collision with root package name */
    public static final D2.c f873w = new D2.c();

    /* renamed from: e, reason: collision with root package name */
    public final com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a f877e;

    /* renamed from: f, reason: collision with root package name */
    public final Size f878f;

    /* renamed from: g, reason: collision with root package name */
    public final int f879g;

    /* renamed from: h, reason: collision with root package name */
    public final a.g f880h;

    /* renamed from: j, reason: collision with root package name */
    public String f881j;

    /* renamed from: k, reason: collision with root package name */
    public AutoFitTextureView f882k;

    /* renamed from: l, reason: collision with root package name */
    public CameraCaptureSession f883l;

    /* renamed from: m, reason: collision with root package name */
    public CameraDevice f884m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f885n;

    /* renamed from: o, reason: collision with root package name */
    public Size f886o;

    /* renamed from: p, reason: collision with root package name */
    public HandlerThread f887p;

    /* renamed from: q, reason: collision with root package name */
    public Handler f888q;

    /* renamed from: r, reason: collision with root package name */
    public ImageReader f889r;

    /* renamed from: s, reason: collision with root package name */
    public CaptureRequest.Builder f890s;

    /* renamed from: t, reason: collision with root package name */
    public CaptureRequest f891t;

    /* renamed from: b, reason: collision with root package name */
    public boolean f874b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f875c = false;

    /* renamed from: d, reason: collision with root package name */
    public final Semaphore f876d = new Semaphore(1);
    public final a i = new a();

    /* renamed from: u, reason: collision with root package name */
    public final b f892u = new b();

    /* renamed from: v, reason: collision with root package name */
    public final c f893v = new c();

    /* compiled from: CameraConnectionFragment.java */
    public class b extends CameraDevice.StateCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            e eVar = e.this;
            eVar.f876d.release();
            cameraDevice.close();
            eVar.f884m = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
            e eVar = e.this;
            eVar.f876d.release();
            cameraDevice.close();
            eVar.f884m = null;
            Activity activity = eVar.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) throws CameraAccessException {
            e eVar = e.this;
            eVar.f876d.release();
            eVar.f884m = cameraDevice;
            D2.c cVar = e.f873w;
            try {
                SurfaceTexture surfaceTexture = eVar.f882k.getSurfaceTexture();
                surfaceTexture.setDefaultBufferSize(eVar.f886o.getWidth(), eVar.f886o.getHeight());
                Surface surface = new Surface(surfaceTexture);
                CaptureRequest.Builder builderCreateCaptureRequest = eVar.f884m.createCaptureRequest(1);
                eVar.f890s = builderCreateCaptureRequest;
                builderCreateCaptureRequest.addTarget(surface);
                cVar.c("Opening camera preview: " + eVar.f886o.getWidth() + "x" + eVar.f886o.getHeight(), new Object[0]);
                ImageReader imageReaderNewInstance = ImageReader.newInstance(eVar.f886o.getWidth(), eVar.f886o.getHeight(), 35, 2);
                eVar.f889r = imageReaderNewInstance;
                imageReaderNewInstance.setOnImageAvailableListener(eVar.f877e, eVar.f888q);
                eVar.f890s.addTarget(eVar.f889r.getSurface());
                eVar.f884m.createCaptureSession(Arrays.asList(surface, eVar.f889r.getSurface()), new g(eVar), eVar.f888q);
            } catch (CameraAccessException e4) {
                cVar.b(e4, "Exception creating camera preview session!", new Object[0]);
            } catch (IllegalStateException e10) {
                cVar.b(e10, "Camera already closed when creating preview session", new Object[0]);
            }
        }
    }

    /* compiled from: CameraConnectionFragment.java */
    public static class d implements Comparator<Size> {
        @Override // java.util.Comparator
        public final int compare(Size size, Size size2) {
            Size size3 = size;
            Size size4 = size2;
            return Long.signum((size3.getWidth() * size3.getHeight()) - (size4.getWidth() * size4.getHeight()));
        }
    }

    /* compiled from: CameraConnectionFragment.java */
    /* renamed from: C2.e$e, reason: collision with other inner class name */
    public static class DialogFragmentC0005e extends DialogFragment {

        /* compiled from: CameraConnectionFragment.java */
        /* renamed from: C2.e$e$a */
        public class a implements DialogInterface.OnClickListener {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Activity f896b;

            public a(Activity activity) {
                this.f896b = activity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f896b.finish();
            }
        }

        @Override // android.app.DialogFragment
        public final Dialog onCreateDialog(Bundle bundle) {
            Activity activity = getActivity();
            return new AlertDialog.Builder(activity).setMessage(getArguments().getString("message")).setPositiveButton(R.string.ok, new a(activity)).create();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, 180);
    }

    public e(a.g gVar, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a aVar, int i, Size size) {
        this.f880h = gVar;
        this.f877e = aVar;
        this.f879g = i;
        this.f878f = size;
    }

    public static Size a(Size[] sizeArr, int i, int i10) {
        int iMax = Math.max(Math.min(i, i10), Sdk$SDKError.b.WEBVIEW_ERROR_VALUE);
        Size size = new Size(i, i10);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = false;
        for (Size size2 : sizeArr) {
            if (size2.equals(size)) {
                z10 = true;
            }
            if (size2.getHeight() < iMax || size2.getWidth() < iMax) {
                arrayList2.add(size2);
            } else {
                arrayList.add(size2);
            }
        }
        D2.c cVar = f873w;
        cVar.c("Desired size: " + size + ", min size: " + iMax + "x" + iMax, new Object[0]);
        StringBuilder sb = new StringBuilder("Valid preview sizes: [");
        sb.append(TextUtils.join(", ", arrayList));
        sb.append("]");
        cVar.c(sb.toString(), new Object[0]);
        cVar.c("Rejected preview sizes: [" + TextUtils.join(", ", arrayList2) + "]", new Object[0]);
        if (z10) {
            cVar.c("Exact size match found.", new Object[0]);
            return size;
        }
        if (arrayList.size() <= 0) {
            Object[] objArr = new Object[0];
            if (cVar.d(6)) {
                Log.e("tensorflow", cVar.e("Couldn't find any suitable preview size", objArr));
            }
            return sizeArr[0];
        }
        Size size3 = (Size) Collections.min(arrayList, new d());
        cVar.c("Chosen size: " + size3.getWidth() + "x" + size3.getHeight(), new Object[0]);
        return size3;
    }

    public final void b(int i, int i10) {
        Activity activity = getActivity();
        if (this.f882k == null || this.f886o == null || activity == null) {
            return;
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        Matrix matrix = new Matrix();
        float f10 = i;
        float f11 = i10;
        RectF rectF = new RectF(0.0f, 0.0f, f10, f11);
        RectF rectF2 = new RectF(0.0f, 0.0f, this.f886o.getHeight(), this.f886o.getWidth());
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        if (1 == rotation || 3 == rotation) {
            rectF2.offset(fCenterX - rectF2.centerX(), fCenterY - rectF2.centerY());
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            float fMax = Math.max(f11 / this.f886o.getHeight(), f10 / this.f886o.getWidth());
            matrix.postScale(fMax, fMax, fCenterX, fCenterY);
            matrix.postRotate((rotation - 2) * 90, fCenterX, fCenterY);
        } else if (2 == rotation) {
            matrix.postRotate(180.0f, fCenterX, fCenterY);
        }
        this.f882k.setTransform(matrix);
    }

    public final void c(int i, int i10) throws CameraAccessException {
        D2.c cVar = f873w;
        Size size = this.f878f;
        try {
            CameraCharacteristics cameraCharacteristics = ((CameraManager) getActivity().getSystemService("camera")).getCameraCharacteristics(this.f881j);
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            this.f885n = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            this.f886o = a(streamConfigurationMap.getOutputSizes(SurfaceTexture.class), size.getWidth(), size.getHeight());
            if (getResources().getConfiguration().orientation == 2) {
                this.f882k.a(this.f886o.getWidth(), this.f886o.getHeight());
            } else {
                this.f882k.a(this.f886o.getHeight(), this.f886o.getWidth());
            }
        } catch (CameraAccessException e4) {
            cVar.b(e4, "Exception!", new Object[0]);
        } catch (NullPointerException unused) {
            String string = getString(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.string.tfe_od_camera_error);
            DialogFragmentC0005e dialogFragmentC0005e = new DialogFragmentC0005e();
            Bundle bundle = new Bundle();
            bundle.putString("message", string);
            dialogFragmentC0005e.setArguments(bundle);
            dialogFragmentC0005e.show(getChildFragmentManager(), "dialog");
            throw new IllegalStateException(getString(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.string.tfe_od_camera_error));
        }
        Size size2 = this.f886o;
        int iIntValue = this.f885n.intValue();
        a.g gVar = this.f880h;
        gVar.getClass();
        int height = size2.getHeight();
        com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a aVar = com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.objectdetector.cameraui.a.this;
        aVar.f22148d = height;
        aVar.f22147c = size2.getWidth();
        aVar.m(size2, iIntValue);
        b(i, i10);
        CameraManager cameraManager = (CameraManager) getActivity().getSystemService("camera");
        try {
            if (!this.f876d.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                throw new RuntimeException("Time out waiting to lock camera opening.");
            }
            cameraManager.openCamera(this.f881j, this.f892u, this.f888q);
        } catch (CameraAccessException e10) {
            cVar.b(e10, "Exception!", new Object[0]);
        } catch (InterruptedException e11) {
            throw new RuntimeException("Interrupted while trying to lock camera opening.", e11);
        }
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(this.f879g, viewGroup, false);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        this.f875c = true;
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public final void onPause() throws InterruptedException {
        Semaphore semaphore = this.f876d;
        try {
            try {
                this.f874b = true;
                semaphore.acquire();
                CameraCaptureSession cameraCaptureSession = this.f883l;
                D2.c cVar = f873w;
                if (cameraCaptureSession != null) {
                    try {
                        try {
                            cameraCaptureSession.close();
                        } finally {
                            this.f883l = null;
                        }
                    } catch (Exception e4) {
                        cVar.b(e4, "Exception closing capture session", new Object[0]);
                    }
                }
                CameraDevice cameraDevice = this.f884m;
                try {
                    if (cameraDevice != null) {
                        try {
                            cameraDevice.close();
                        } catch (Exception e10) {
                            cVar.b(e10, "Exception closing camera device", new Object[0]);
                        }
                    }
                    ImageReader imageReader = this.f889r;
                    if (imageReader != null) {
                        try {
                            try {
                                imageReader.close();
                            } finally {
                                this.f889r = null;
                            }
                        } catch (Exception e11) {
                            cVar.b(e11, "Exception closing preview reader", new Object[0]);
                        }
                    }
                    semaphore.release();
                    this.f874b = false;
                    this.f887p.quitSafely();
                    try {
                        this.f887p.join();
                        this.f887p = null;
                        this.f888q = null;
                    } catch (InterruptedException e12) {
                        cVar.b(e12, "Exception!", new Object[0]);
                    }
                    super.onPause();
                } finally {
                    this.f884m = null;
                }
            } catch (InterruptedException e13) {
                throw new RuntimeException("Interrupted while trying to lock camera closing.", e13);
            }
        } catch (Throwable th) {
            semaphore.release();
            this.f874b = false;
            throw th;
        }
    }

    @Override // android.app.Fragment
    public final void onResume() throws CameraAccessException {
        super.onResume();
        this.f875c = false;
        this.f874b = false;
        HandlerThread handlerThread = new HandlerThread("ImageListener");
        this.f887p = handlerThread;
        handlerThread.start();
        this.f888q = new Handler(this.f887p.getLooper());
        if (this.f882k.isAvailable()) {
            c(this.f882k.getWidth(), this.f882k.getHeight());
        } else {
            this.f882k.setSurfaceTextureListener(this.f893v);
        }
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.f882k = (AutoFitTextureView) view.findViewById(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.texture);
    }

    /* compiled from: CameraConnectionFragment.java */
    public class c implements TextureView.SurfaceTextureListener {
        public c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) throws CameraAccessException {
            e.this.c(i, i10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i10) {
            e.this.b(i, i10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* compiled from: CameraConnectionFragment.java */
    public class a extends CameraCaptureSession.CaptureCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }
    }
}
