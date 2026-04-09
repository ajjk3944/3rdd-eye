package C;

import N7.H7;
import android.os.Handler;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.U;
import androidx.camera.core.impl.U0;
import androidx.camera.core.impl.z0;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: CameraXConfig.java */
/* loaded from: classes.dex */
public final class A implements J.l<C0638z> {

    /* renamed from: H, reason: collision with root package name */
    public static final C1683d f602H = U.a.a(H.a.class, "camerax.core.appConfig.cameraFactoryProvider");

    /* renamed from: I, reason: collision with root package name */
    public static final C1683d f603I = U.a.a(G.a.class, "camerax.core.appConfig.deviceSurfaceManagerProvider");

    /* renamed from: J, reason: collision with root package name */
    public static final C1683d f604J = U.a.a(U0.c.class, "camerax.core.appConfig.useCaseConfigFactoryProvider");

    /* renamed from: K, reason: collision with root package name */
    public static final C1683d f605K = U.a.a(Executor.class, "camerax.core.appConfig.cameraExecutor");

    /* renamed from: L, reason: collision with root package name */
    public static final C1683d f606L = U.a.a(Handler.class, "camerax.core.appConfig.schedulerHandler");

    /* renamed from: M, reason: collision with root package name */
    public static final C1683d f607M = U.a.a(Integer.TYPE, "camerax.core.appConfig.minimumLoggingLevel");

    /* renamed from: N, reason: collision with root package name */
    public static final C1683d f608N = U.a.a(C0632t.class, "camerax.core.appConfig.availableCamerasLimiter");

    /* renamed from: O, reason: collision with root package name */
    public static final C1683d f609O = U.a.a(Long.TYPE, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming");

    /* renamed from: P, reason: collision with root package name */
    public static final C1683d f610P = U.a.a(Z.class, "camerax.core.appConfig.cameraProviderInitRetryPolicy");

    /* renamed from: Q, reason: collision with root package name */
    public static final C1683d f611Q = U.a.a(z0.class, "camerax.core.appConfig.quirksSettings");

    /* renamed from: G, reason: collision with root package name */
    public final C1717u0 f612G;

    /* compiled from: CameraXConfig.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C1710q0 f613a;

        public a() {
            Object objB;
            C1710q0 c1710q0K = C1710q0.K();
            this.f613a = c1710q0K;
            Object objB2 = null;
            try {
                objB = c1710q0K.b(J.l.f2691c);
            } catch (IllegalArgumentException unused) {
                objB = null;
            }
            Class cls = (Class) objB;
            if (cls != null && !cls.equals(C0638z.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            C1683d c1683d = J.l.f2691c;
            C1710q0 c1710q0 = this.f613a;
            c1710q0.N(c1683d, C0638z.class);
            try {
                objB2 = c1710q0.b(J.l.f2690b);
            } catch (IllegalArgumentException unused2) {
            }
            if (objB2 == null) {
                c1710q0.N(J.l.f2690b, C0638z.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    /* compiled from: CameraXConfig.java */
    public interface b {
        A getCameraXConfig();
    }

    public A(C1717u0 c1717u0) {
        this.f612G = c1717u0;
    }

    @Override // J.l
    public final /* synthetic */ String C() {
        throw null;
    }

    public final C0632t J() {
        Object objB;
        try {
            objB = this.f612G.b(f608N);
        } catch (IllegalArgumentException unused) {
            objB = null;
        }
        return (C0632t) objB;
    }

    public final H.a K() {
        Object objB;
        try {
            objB = this.f612G.b(f602H);
        } catch (IllegalArgumentException unused) {
            objB = null;
        }
        return (H.a) objB;
    }

    public final long L() {
        Object objB = -1L;
        try {
            objB = this.f612G.b(f609O);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) objB).longValue();
    }

    public final G.a M() {
        Object objB;
        try {
            objB = this.f612G.b(f603I);
        } catch (IllegalArgumentException unused) {
            objB = null;
        }
        return (G.a) objB;
    }

    public final U0.c N() {
        Object objB;
        try {
            objB = this.f612G.b(f604J);
        } catch (IllegalArgumentException unused) {
            objB = null;
        }
        return (U0.c) objB;
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ Object b(U.a aVar) {
        return H7.j(this, aVar);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ boolean f(U.a aVar) {
        return H7.c(this, aVar);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ void g(B.i iVar) {
        H7.d(this, iVar);
    }

    @Override // androidx.camera.core.impl.D0
    public final androidx.camera.core.impl.U getConfig() {
        return this.f612G;
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ Object j(U.a aVar, U.b bVar) {
        return H7.l(this, aVar, bVar);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ Set l() {
        return H7.i(this);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ Object o(U.a aVar, Object obj) {
        return H7.k(this, aVar, obj);
    }

    @Override // J.l
    public final /* synthetic */ String u(String str) {
        throw null;
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ U.b w(U.a aVar) {
        return H7.f(this, aVar);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ Set x(U.a aVar) {
        return H7.h(this, aVar);
    }
}
