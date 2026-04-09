package w;

import C.E;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.yandex.mobile.ads.impl.A3;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import w.C5695i;

/* compiled from: CameraCaptureSessionCompat.java */
/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5688b {

    /* renamed from: a, reason: collision with root package name */
    public final C5695i f47112a;

    /* compiled from: CameraCaptureSessionCompat.java */
    /* renamed from: w.b$a */
    public interface a {
        int a(ArrayList arrayList, H.g gVar, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        int b(CaptureRequest captureRequest, H.g gVar, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    /* compiled from: CameraCaptureSessionCompat.java */
    /* renamed from: w.b$b, reason: collision with other inner class name */
    public static final class C0541b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.CaptureCallback f47113a;

        /* renamed from: b, reason: collision with root package name */
        public final H.g f47114b;

        public C0541b(H.g gVar, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f47114b = gVar;
            this.f47113a = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j4) {
            this.f47114b.execute(new Runnable() { // from class: w.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47126b.f47113a.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j4);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f47114b.execute(new O.e(this, cameraCaptureSession, captureRequest, totalCaptureResult, 4));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f47114b.execute(new N.i(this, cameraCaptureSession, captureRequest, captureFailure, 6));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f47114b.execute(new T1.p(this, cameraCaptureSession, captureRequest, captureResult, 8));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            this.f47114b.execute(new H2.d(this, i, 4, cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j4) {
            this.f47114b.execute(new Runnable() { // from class: w.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47122b.f47113a.onCaptureSequenceCompleted(cameraCaptureSession, i, j4);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j4, final long j10) {
            this.f47114b.execute(new Runnable() { // from class: w.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47117b.f47113a.onCaptureStarted(cameraCaptureSession, captureRequest, j4, j10);
                }
            });
        }
    }

    /* compiled from: CameraCaptureSessionCompat.java */
    /* renamed from: w.b$c */
    public static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f47115a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f47116b;

        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f47116b = executor;
            this.f47115a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onActive(CameraCaptureSession cameraCaptureSession) {
            this.f47116b.execute(new RunnableC5692f(this, cameraCaptureSession, 0));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            this.f47116b.execute(new E(23, this, cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onClosed(CameraCaptureSession cameraCaptureSession) {
            this.f47116b.execute(new RunnableC5693g(this, cameraCaptureSession, 0));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            this.f47116b.execute(new RunnableC5693g(this, cameraCaptureSession, 1));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            this.f47116b.execute(new A3(10, this, cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onReady(CameraCaptureSession cameraCaptureSession) {
            this.f47116b.execute(new RunnableC5692f(this, cameraCaptureSession, 1));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            this.f47116b.execute(new J4.f(this, cameraCaptureSession, surface, 12));
        }
    }

    public C5688b(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f47112a = new C5694h(cameraCaptureSession, null);
        } else {
            this.f47112a = new C5695i(cameraCaptureSession, new C5695i.a(handler));
        }
    }
}
