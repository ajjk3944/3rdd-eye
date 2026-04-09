package w;

import C.g0;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import com.yandex.mobile.ads.impl.A3;
import java.util.Set;
import v.C5664t;
import w.C5708v;

/* compiled from: CameraManagerCompat.java */
/* renamed from: w.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5704r {

    /* renamed from: a, reason: collision with root package name */
    public final C5708v f47151a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayMap f47152b = new ArrayMap(4);

    /* compiled from: CameraManagerCompat.java */
    /* renamed from: w.r$a */
    public static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a, reason: collision with root package name */
        public final H.g f47153a;

        /* renamed from: b, reason: collision with root package name */
        public final C5664t.b f47154b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f47155c = new Object();

        /* renamed from: d, reason: collision with root package name */
        public boolean f47156d = false;

        public a(H.g gVar, C5664t.b bVar) {
            this.f47153a = gVar;
            this.f47154b = bVar;
        }

        public final void a() {
            synchronized (this.f47155c) {
                this.f47156d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
            synchronized (this.f47155c) {
                try {
                    if (!this.f47156d) {
                        this.f47153a.execute(new g0(this, 28));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            synchronized (this.f47155c) {
                try {
                    if (!this.f47156d) {
                        this.f47153a.execute(new A3(12, this, str));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            synchronized (this.f47155c) {
                try {
                    if (!this.f47156d) {
                        this.f47153a.execute(new d0.r(6, this, str));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: CameraManagerCompat.java */
    /* renamed from: w.r$b */
    public interface b {
        void a(H.g gVar, C5664t.b bVar);

        void b(CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics c(String str) throws C5687a;

        void d(String str, H.g gVar, CameraDevice.StateCallback stateCallback) throws C5687a;

        Set<Set<String>> e() throws C5687a;
    }

    public C5704r(C5708v c5708v) {
        this.f47151a = c5708v;
    }

    public static C5704r a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        return new C5704r(i >= 30 ? new C5707u(context, null) : i >= 29 ? new C5706t(context, null) : i >= 28 ? new C5705s(context, null) : new C5708v(context, new C5708v.a(handler)));
    }

    public final C5698l b(String str) throws C5687a {
        C5698l c5698l;
        synchronized (this.f47152b) {
            c5698l = (C5698l) this.f47152b.get(str);
            if (c5698l == null) {
                try {
                    C5698l c5698l2 = new C5698l(this.f47151a.c(str), str);
                    this.f47152b.put(str, c5698l2);
                    c5698l = c5698l2;
                } catch (AssertionError e4) {
                    throw new C5687a(e4.getMessage(), e4);
                }
            }
        }
        return c5698l;
    }
}
