package w;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import com.yandex.mobile.ads.impl.A3;
import com.yandex.mobile.ads.impl.L;
import w.C5703q;

/* compiled from: CameraDeviceCompat.java */
/* renamed from: w.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5699m {

    /* renamed from: a, reason: collision with root package name */
    public final C5700n f47145a;

    /* compiled from: CameraDeviceCompat.java */
    /* renamed from: w.m$a */
    public interface a {
        void a(x.l lVar) throws C5687a;
    }

    /* compiled from: CameraDeviceCompat.java */
    /* renamed from: w.m$b */
    public static final class b extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final CameraDevice.StateCallback f47146a;

        /* renamed from: b, reason: collision with root package name */
        public final H.g f47147b;

        public b(H.g gVar, CameraDevice.StateCallback stateCallback) {
            this.f47147b = gVar;
            this.f47146a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            this.f47147b.execute(new A3(11, this, cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            this.f47147b.execute(new d0.r(5, this, cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
            this.f47147b.execute(new com.applovin.mediation.nativeAds.adPlacer.a(this, cameraDevice, i));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            this.f47147b.execute(new L(21, this, cameraDevice));
        }
    }

    public C5699m(CameraDevice cameraDevice, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            cameraDevice.getClass();
            this.f47145a = new C5702p(cameraDevice, null);
        } else if (i >= 24) {
            this.f47145a = new C5701o(cameraDevice, new C5703q.a(handler));
        } else {
            this.f47145a = new C5700n(cameraDevice, new C5703q.a(handler));
        }
    }
}
