package u;

import B.j;
import C.D;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.InterfaceC1708p0;
import androidx.camera.core.impl.U;

/* compiled from: Camera2ImplConfig.java */
/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5616a extends j {

    /* renamed from: H, reason: collision with root package name */
    public static final C1683d f46476H = U.a.a(Integer.TYPE, "camera2.captureRequest.templateType");

    /* renamed from: I, reason: collision with root package name */
    public static final C1683d f46477I = U.a.a(Long.TYPE, "camera2.cameraCaptureSession.streamUseCase");

    /* renamed from: J, reason: collision with root package name */
    public static final C1683d f46478J = U.a.a(CameraDevice.StateCallback.class, "camera2.cameraDevice.stateCallback");

    /* renamed from: K, reason: collision with root package name */
    public static final C1683d f46479K = U.a.a(CameraCaptureSession.StateCallback.class, "camera2.cameraCaptureSession.stateCallback");

    /* renamed from: L, reason: collision with root package name */
    public static final C1683d f46480L = U.a.a(CameraCaptureSession.CaptureCallback.class, "camera2.cameraCaptureSession.captureCallback");

    /* renamed from: M, reason: collision with root package name */
    public static final C1683d f46481M;

    /* compiled from: Camera2ImplConfig.java */
    /* renamed from: u.a$a, reason: collision with other inner class name */
    public static final class C0536a implements D<C5616a> {

        /* renamed from: a, reason: collision with root package name */
        public final C1710q0 f46482a = C1710q0.K();

        @Override // C.D
        public final InterfaceC1708p0 a() {
            throw null;
        }

        public final void c(CaptureRequest.Key key, Object obj, U.b bVar) {
            this.f46482a.M(C5616a.J(key), bVar, obj);
        }
    }

    static {
        U.a.a(Object.class, "camera2.captureRequest.tag");
        f46481M = U.a.a(String.class, "camera2.cameraCaptureSession.physicalCameraId");
    }

    public static C1683d J(CaptureRequest.Key key) {
        return new C1683d("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
