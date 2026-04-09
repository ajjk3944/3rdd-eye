package v;

import C.C0619f;
import C.C0634v;
import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.impl.C1679b;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1704n0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.I0;
import androidx.camera.core.impl.InterfaceC1715t0;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.N;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.S0;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U0;
import androidx.camera.core.impl.X;
import f2.RunnableC4331a;
import io.appmetrica.analytics.impl.Oo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o0.b;
import v.k0;
import v.o0;
import w.C5687a;
import w.C5698l;
import w.C5704r;
import y.C5787a;

/* compiled from: Camera2CameraImpl.java */
/* renamed from: v.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5664t implements androidx.camera.core.impl.J {

    /* renamed from: A, reason: collision with root package name */
    public final o0.a f46862A;

    /* renamed from: B, reason: collision with root package name */
    public final HashSet f46863B;

    /* renamed from: C, reason: collision with root package name */
    public D.a f46864C;

    /* renamed from: D, reason: collision with root package name */
    public final Object f46865D;

    /* renamed from: E, reason: collision with root package name */
    public I0 f46866E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f46867F;

    /* renamed from: G, reason: collision with root package name */
    public final c0 f46868G;

    /* renamed from: H, reason: collision with root package name */
    public final x.b f46869H;

    /* renamed from: I, reason: collision with root package name */
    public final n0 f46870I;

    /* renamed from: J, reason: collision with root package name */
    public final e f46871J;

    /* renamed from: b, reason: collision with root package name */
    public final S0 f46872b;

    /* renamed from: c, reason: collision with root package name */
    public final C5704r f46873c;

    /* renamed from: d, reason: collision with root package name */
    public final H.g f46874d;

    /* renamed from: e, reason: collision with root package name */
    public final H.c f46875e;

    /* renamed from: f, reason: collision with root package name */
    public volatile f f46876f = f.INITIALIZED;

    /* renamed from: g, reason: collision with root package name */
    public final C1704n0<J.a> f46877g;

    /* renamed from: h, reason: collision with root package name */
    public final S f46878h;
    public final C5658m i;

    /* renamed from: j, reason: collision with root package name */
    public final g f46879j;

    /* renamed from: k, reason: collision with root package name */
    public final C5666v f46880k;

    /* renamed from: l, reason: collision with root package name */
    public CameraDevice f46881l;

    /* renamed from: m, reason: collision with root package name */
    public int f46882m;

    /* renamed from: n, reason: collision with root package name */
    public Z f46883n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f46884o;

    /* renamed from: p, reason: collision with root package name */
    public int f46885p;

    /* renamed from: q, reason: collision with root package name */
    public final b f46886q;

    /* renamed from: r, reason: collision with root package name */
    public final A.a f46887r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.camera.core.impl.N f46888s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f46889t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f46890u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f46891v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f46892w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f46893x;

    /* renamed from: y, reason: collision with root package name */
    public k0 f46894y;

    /* renamed from: z, reason: collision with root package name */
    public final a0 f46895z;

    /* compiled from: Camera2CameraImpl.java */
    /* renamed from: v.t$a */
    public class a implements I.c<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Z f46896b;

        public a(Z z10) {
            this.f46896b = z10;
        }

        @Override // I.c
        public final void onFailure(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            H0 h02 = null;
            if (!(th instanceof X.a)) {
                if (th instanceof CancellationException) {
                    C5664t.this.u("Unable to configure camera cancelled", null);
                    return;
                }
                f fVar = C5664t.this.f46876f;
                f fVar2 = f.OPENED;
                if (fVar == fVar2) {
                    C5664t.this.G(fVar2, new C0619f(4, th), true);
                }
                C.S.c("Camera2CameraImpl", "Unable to configure camera " + C5664t.this, th);
                C5664t c5664t = C5664t.this;
                if (c5664t.f46883n == this.f46896b) {
                    c5664t.E();
                    return;
                }
                return;
            }
            C5664t c5664t2 = C5664t.this;
            androidx.camera.core.impl.X x10 = ((X.a) th).f14996b;
            Iterator<H0> it = c5664t2.f46872b.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                H0 next = it.next();
                if (next.b().contains(x10)) {
                    h02 = next;
                    break;
                }
            }
            if (h02 != null) {
                C5664t c5664t3 = C5664t.this;
                c5664t3.getClass();
                H.c cVarH = E.u.H();
                H0.d dVar = h02.f14883f;
                if (dVar != null) {
                    c5664t3.u("Posting surface closed", new Throwable());
                    cVarH.execute(new RunnableC5660o(0, dVar, h02));
                }
            }
        }

        @Override // I.c
        public final void onSuccess(Void r32) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C5664t c5664t = C5664t.this;
            if (c5664t.f46887r.f4e == 2 && c5664t.f46876f == f.OPENED) {
                C5664t.this.F(f.CONFIGURED);
            }
        }
    }

    /* compiled from: Camera2CameraImpl.java */
    /* renamed from: v.t$b */
    public final class b extends CameraManager.AvailabilityCallback {

        /* renamed from: a, reason: collision with root package name */
        public final String f46898a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f46899b = true;

        public b(String str) {
            this.f46898a = str;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f46898a.equals(str)) {
                this.f46899b = true;
                if (C5664t.this.f46876f == f.PENDING_OPEN) {
                    C5664t.this.K(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            if (this.f46898a.equals(str)) {
                this.f46899b = false;
            }
        }
    }

    /* compiled from: Camera2CameraImpl.java */
    /* renamed from: v.t$c */
    public final class c {
        public c() {
        }
    }

    /* compiled from: Camera2CameraImpl.java */
    /* renamed from: v.t$d */
    public final class d {
        public d() {
        }
    }

    /* compiled from: Camera2CameraImpl.java */
    /* renamed from: v.t$e */
    public class e {

        /* renamed from: a, reason: collision with root package name */
        public a f46903a = null;

        /* compiled from: Camera2CameraImpl.java */
        /* renamed from: v.t$e$a */
        public class a {

            /* renamed from: a, reason: collision with root package name */
            public final ScheduledFuture<?> f46905a;

            /* renamed from: b, reason: collision with root package name */
            public final AtomicBoolean f46906b = new AtomicBoolean(false);

            public a() {
                this.f46905a = C5664t.this.f46875e.schedule(new RunnableC4331a(this, 6), 2000L, TimeUnit.MILLISECONDS);
            }
        }

        public e() {
        }

        public final void a() {
            a aVar = this.f46903a;
            if (aVar != null) {
                aVar.f46906b.set(true);
                aVar.f46905a.cancel(true);
            }
            this.f46903a = null;
        }
    }

    /* compiled from: Camera2CameraImpl.java */
    /* renamed from: v.t$f */
    public enum f {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    /* compiled from: Camera2CameraImpl.java */
    /* renamed from: v.t$g */
    public final class g extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final H.g f46908a;

        /* renamed from: b, reason: collision with root package name */
        public final H.c f46909b;

        /* renamed from: c, reason: collision with root package name */
        public b f46910c;

        /* renamed from: d, reason: collision with root package name */
        public ScheduledFuture<?> f46911d;

        /* renamed from: e, reason: collision with root package name */
        public final a f46912e;

        /* compiled from: Camera2CameraImpl.java */
        /* renamed from: v.t$g$a */
        public class a {

            /* renamed from: a, reason: collision with root package name */
            public final long f46914a;

            /* renamed from: b, reason: collision with root package name */
            public long f46915b = -1;

            public a(long j4) {
                this.f46914a = j4;
            }

            public final int a() {
                if (!g.this.c()) {
                    return 700;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.f46915b == -1) {
                    this.f46915b = jUptimeMillis;
                }
                long j4 = jUptimeMillis - this.f46915b;
                if (j4 <= 120000) {
                    return 1000;
                }
                return j4 <= 300000 ? 2000 : 4000;
            }

            public final int b() {
                boolean zC = g.this.c();
                long j4 = this.f46914a;
                if (zC) {
                    if (j4 > 0) {
                        return Math.min((int) j4, 1800000);
                    }
                    return 1800000;
                }
                if (j4 > 0) {
                    return Math.min((int) j4, 10000);
                }
                return 10000;
            }
        }

        /* compiled from: Camera2CameraImpl.java */
        /* renamed from: v.t$g$b */
        public class b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final H.g f46917b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f46918c = false;

            public b(H.g gVar) {
                this.f46917b = gVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f46917b.execute(new o.b0(this, 3));
            }
        }

        public g(H.g gVar, H.c cVar, long j4) {
            this.f46908a = gVar;
            this.f46909b = cVar;
            this.f46912e = new a(j4);
        }

        public final boolean a() {
            if (this.f46911d == null) {
                return false;
            }
            C5664t.this.u("Cancelling scheduled re-open: " + this.f46910c, null);
            this.f46910c.f46918c = true;
            this.f46910c = null;
            this.f46911d.cancel(false);
            this.f46911d = null;
            return true;
        }

        public final void b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            A2.l.q(null, this.f46910c == null);
            A2.l.q(null, this.f46911d == null);
            a aVar = this.f46912e;
            aVar.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (aVar.f46915b == -1) {
                aVar.f46915b = jUptimeMillis;
            }
            long j4 = jUptimeMillis - aVar.f46915b;
            long jB = aVar.b();
            C5664t c5664t = C5664t.this;
            if (j4 >= jB) {
                aVar.f46915b = -1L;
                C.S.b("Camera2CameraImpl", "Camera reopening attempted for " + aVar.b() + "ms without success.");
                c5664t.G(f.PENDING_OPEN, null, false);
                return;
            }
            this.f46910c = new b(this.f46908a);
            c5664t.u("Attempting camera re-open in " + aVar.a() + "ms: " + this.f46910c + " activeResuming = " + c5664t.f46867F, null);
            this.f46911d = this.f46909b.schedule(this.f46910c, (long) aVar.a(), TimeUnit.MILLISECONDS);
        }

        public final boolean c() {
            C5664t c5664t = C5664t.this;
            if (!c5664t.f46867F) {
                return false;
            }
            int i = c5664t.f46882m;
            return i == 1 || i == 2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C5664t.this.u("CameraDevice.onClosed()", null);
            A2.l.q("Unexpected onClose callback on camera device: " + cameraDevice, C5664t.this.f46881l == null);
            int iOrdinal = C5664t.this.f46876f.ordinal();
            if (iOrdinal == 1 || iOrdinal == 4) {
                A2.l.q(null, C5664t.this.f46884o.isEmpty());
                C5664t.this.s();
                return;
            }
            if (iOrdinal != 5 && iOrdinal != 6) {
                throw new IllegalStateException("Camera closed while in state: " + C5664t.this.f46876f);
            }
            C5664t c5664t = C5664t.this;
            int i = c5664t.f46882m;
            if (i == 0) {
                c5664t.K(false);
            } else {
                c5664t.u("Camera closed due to error: ".concat(C5664t.w(i)), null);
                b();
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C5664t.this.u("CameraDevice.onDisconnected()", null);
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C5664t c5664t = C5664t.this;
            c5664t.f46881l = cameraDevice;
            c5664t.f46882m = i;
            e eVar = c5664t.f46871J;
            C5664t.this.u("Camera receive onErrorCallback", null);
            eVar.a();
            int iOrdinal = C5664t.this.f46876f.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        String id = cameraDevice.getId();
                        String strW = C5664t.w(i);
                        String strName = C5664t.this.f46876f.name();
                        StringBuilder sbD = j6.l.d("CameraDevice.onError(): ", id, " failed with ", strW, " while in ");
                        sbD.append(strName);
                        sbD.append(" state. Will attempt recovering from error.");
                        C.S.a("Camera2CameraImpl", sbD.toString());
                        A2.l.q("Attempt to handle open error from non open state: " + C5664t.this.f46876f, C5664t.this.f46876f == f.OPENING || C5664t.this.f46876f == f.OPENED || C5664t.this.f46876f == f.CONFIGURED || C5664t.this.f46876f == f.REOPENING || C5664t.this.f46876f == f.REOPENING_QUIRK);
                        int i10 = 3;
                        if (i != 1 && i != 2 && i != 4) {
                            C.S.b("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C5664t.w(i) + " closing camera.");
                            C5664t.this.G(f.CLOSING, new C0619f(i == 3 ? 5 : 6, null), true);
                            C5664t.this.r();
                            return;
                        }
                        C.S.a("Camera2CameraImpl", Oo.h("Attempt to reopen camera[", cameraDevice.getId(), "] after error[", C5664t.w(i), "]"));
                        C5664t c5664t2 = C5664t.this;
                        A2.l.q("Can only reopen camera device after error if the camera device is actually in an error state.", c5664t2.f46882m != 0);
                        if (i == 1) {
                            i10 = 2;
                        } else if (i == 2) {
                            i10 = 1;
                        }
                        c5664t2.G(f.REOPENING, new C0619f(i10, null), true);
                        c5664t2.r();
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + C5664t.this.f46876f);
                }
            }
            String id2 = cameraDevice.getId();
            String strW2 = C5664t.w(i);
            String strName2 = C5664t.this.f46876f.name();
            StringBuilder sbD2 = j6.l.d("CameraDevice.onError(): ", id2, " failed with ", strW2, " while in ");
            sbD2.append(strName2);
            sbD2.append(" state. Will finish closing camera.");
            C.S.b("Camera2CameraImpl", sbD2.toString());
            C5664t.this.r();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C5664t.this.u("CameraDevice.onOpened()", null);
            C5664t c5664t = C5664t.this;
            c5664t.f46881l = cameraDevice;
            c5664t.f46882m = 0;
            this.f46912e.f46915b = -1L;
            int iOrdinal = c5664t.f46876f.ordinal();
            if (iOrdinal == 1 || iOrdinal == 4) {
                A2.l.q(null, C5664t.this.f46884o.isEmpty());
                C5664t.this.f46881l.close();
                C5664t.this.f46881l = null;
            } else {
                if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + C5664t.this.f46876f);
                }
                C5664t.this.F(f.OPENED);
                androidx.camera.core.impl.N n9 = C5664t.this.f46888s;
                String id = cameraDevice.getId();
                C5664t c5664t2 = C5664t.this;
                if (n9.f(id, c5664t2.f46887r.a(c5664t2.f46881l.getId()))) {
                    C5664t.this.C();
                }
            }
        }
    }

    /* compiled from: Camera2CameraImpl.java */
    /* renamed from: v.t$h */
    public static abstract class h {
        public abstract List<U0.b> a();

        public abstract H0 b();

        public abstract L0 c();

        public abstract Size d();

        public abstract T0<?> e();

        public abstract String f();

        public abstract Class<?> g();
    }

    public C5664t(Context context, C5704r c5704r, String str, C5666v c5666v, A.a aVar, androidx.camera.core.impl.N n9, Executor executor, Handler handler, c0 c0Var, long j4) throws C0634v {
        C1704n0<J.a> c1704n0 = new C1704n0<>();
        this.f46877g = c1704n0;
        this.f46882m = 0;
        new AtomicInteger(0);
        this.f46884o = new LinkedHashMap();
        this.f46885p = 0;
        this.f46891v = false;
        this.f46892w = false;
        this.f46893x = true;
        this.f46863B = new HashSet();
        this.f46864C = androidx.camera.core.impl.D.f14872a;
        this.f46865D = new Object();
        this.f46867F = false;
        this.f46871J = new e();
        this.f46873c = c5704r;
        this.f46887r = aVar;
        this.f46888s = n9;
        H.c cVar = new H.c(handler);
        this.f46875e = cVar;
        H.g gVar = new H.g(executor);
        this.f46874d = gVar;
        this.f46879j = new g(gVar, cVar, j4);
        this.f46872b = new S0(str);
        c1704n0.f15099a.k(new C1704n0.b<>(J.a.CLOSED));
        S s10 = new S(n9);
        this.f46878h = s10;
        a0 a0Var = new a0(gVar);
        this.f46895z = a0Var;
        this.f46868G = c0Var;
        try {
            C5698l c5698lB = c5704r.b(str);
            C5658m c5658m = new C5658m(c5698lB, cVar, gVar, new d(), c5666v.f46930h);
            this.i = c5658m;
            this.f46880k = c5666v;
            c5666v.o(c5658m);
            c5666v.f46928f.l(s10.f46636b);
            this.f46869H = x.b.a(c5698lB);
            this.f46883n = A();
            this.f46862A = new o0.a(cVar, gVar, handler, c5666v.f46930h, C5787a.f47852a, a0Var);
            this.f46889t = c5666v.f46930h.d(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.f46890u = c5666v.f46930h.d(LegacyCameraSurfaceCleanupQuirk.class);
            b bVar = new b(str);
            this.f46886q = bVar;
            c cVar2 = new c();
            synchronized (n9.f14923b) {
                A2.l.q("Camera is already registered: " + this, !n9.f14926e.containsKey(this));
                n9.f14926e.put(this, new N.a(gVar, cVar2, bVar));
            }
            c5704r.f47151a.a(gVar, bVar);
            this.f46870I = new n0(context, str, c5704r, new E.u(26));
        } catch (C5687a e4) {
            throw new C0634v(e4);
        }
    }

    public static String w(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String x(k0 k0Var) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        k0Var.getClass();
        sb.append(k0Var.hashCode());
        return sb.toString();
    }

    public static String y(C.m0 m0Var) {
        return m0Var.f() + m0Var.hashCode();
    }

    public final Z A() {
        synchronized (this.f46865D) {
            try {
                if (this.f46866E == null) {
                    return new Y(this.f46869H, this.f46880k.f46930h, false);
                }
                return new l0(this.f46866E, this.f46880k, this.f46869H, this.f46874d, this.f46875e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void B(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!z10) {
            this.f46879j.f46912e.f46915b = -1L;
        }
        this.f46879j.a();
        this.f46871J.a();
        u("Opening camera.", null);
        F(f.OPENING);
        try {
            this.f46873c.f47151a.d(this.f46880k.f46923a, this.f46874d, t());
        } catch (SecurityException e4) {
            u("Unable to open camera due to " + e4.getMessage(), null);
            F(f.REOPENING);
            this.f46879j.b();
        } catch (C5687a e10) {
            u("Unable to open camera due to " + e10.getMessage(), null);
            if (e10.f47111b == 10001) {
                G(f.INITIALIZED, new C0619f(7, e10), true);
                return;
            }
            e eVar = this.f46871J;
            if (C5664t.this.f46876f != f.OPENING) {
                C5664t.this.u("Don't need the onError timeout handler.", null);
                return;
            }
            C5664t.this.u("Camera waiting for onError.", null);
            eVar.a();
            eVar.f46903a = eVar.new a();
        }
    }

    public final void C() {
        A2.l.q(null, this.f46876f == f.OPENED);
        H0.h hVarA = this.f46872b.a();
        if (!hVarA.f14897k || !hVarA.f14896j) {
            u("Unable to create capture session due to conflicting configurations", null);
            return;
        }
        if (!this.f46888s.f(this.f46881l.getId(), this.f46887r.a(this.f46881l.getId()))) {
            u("Unable to create capture session in camera operating mode = " + this.f46887r.f4e, null);
            return;
        }
        HashMap map = new HashMap();
        Collection<H0> collectionB = this.f46872b.b();
        Collection<T0<?>> collectionC = this.f46872b.c();
        C1683d c1683d = m0.f46780a;
        ArrayList arrayList = new ArrayList(collectionC);
        Iterator<H0> it = collectionB.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            H0 next = it.next();
            C1717u0 c1717u0 = next.f14884g.f14941b;
            C1683d c1683d2 = m0.f46780a;
            if (c1717u0.f15118G.containsKey(c1683d2) && next.b().size() != 1) {
                C.S.b("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(next.b().size())));
                break;
            }
            if (next.f14884g.f14941b.f15118G.containsKey(c1683d2)) {
                int i = 0;
                for (H0 h02 : collectionB) {
                    if (((T0) arrayList.get(i)).A() == U0.b.METERING_REPEATING) {
                        A2.l.q("MeteringRepeating should contain a surface", !h02.b().isEmpty());
                        map.put(h02.b().get(0), 1L);
                    } else if (h02.f14884g.f14941b.f15118G.containsKey(c1683d2) && !h02.b().isEmpty()) {
                        map.put(h02.b().get(0), (Long) h02.f14884g.f14941b.b(c1683d2));
                    }
                    i++;
                }
            }
        }
        this.f46883n.c(map);
        Z z10 = this.f46883n;
        H0 h0B = hVarA.b();
        CameraDevice cameraDevice = this.f46881l;
        cameraDevice.getClass();
        o0.a aVar = this.f46862A;
        I.j.a(z10.b(h0B, cameraDevice, new r0(aVar.f46818b, aVar.f46817a, aVar.f46819c, aVar.f46821e, aVar.f46822f, aVar.f46820d)), new a(z10), this.f46874d);
    }

    public final void D() {
        if (this.f46894y != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.f46894y.getClass();
            sb.append(this.f46894y.hashCode());
            String string = sb.toString();
            S0 s02 = this.f46872b;
            LinkedHashMap linkedHashMap = s02.f14957b;
            if (linkedHashMap.containsKey(string)) {
                S0.a aVar = (S0.a) linkedHashMap.get(string);
                aVar.f14962e = false;
                if (!aVar.f14963f) {
                    linkedHashMap.remove(string);
                }
            }
            StringBuilder sb2 = new StringBuilder("MeteringRepeating");
            this.f46894y.getClass();
            sb2.append(this.f46894y.hashCode());
            String string2 = sb2.toString();
            LinkedHashMap linkedHashMap2 = s02.f14957b;
            if (linkedHashMap2.containsKey(string2)) {
                S0.a aVar2 = (S0.a) linkedHashMap2.get(string2);
                aVar2.f14963f = false;
                if (!aVar2.f14962e) {
                    linkedHashMap2.remove(string2);
                }
            }
            k0 k0Var = this.f46894y;
            k0Var.getClass();
            C.S.a("MeteringRepeating", "MeteringRepeating clear!");
            C.i0 i0Var = k0Var.f46726a;
            if (i0Var != null) {
                i0Var.a();
            }
            k0Var.f46726a = null;
            this.f46894y = null;
        }
    }

    public final void E() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        A2.l.q(null, this.f46883n != null);
        u("Resetting Capture Session", null);
        Z z10 = this.f46883n;
        H0 h0F = z10.f();
        List<androidx.camera.core.impl.S> listD = z10.d();
        Z zA = A();
        this.f46883n = zA;
        zA.g(h0F);
        this.f46883n.e(listD);
        if (this.f46876f.ordinal() != 8) {
            u("Skipping Capture Session state check due to current camera state: " + this.f46876f + " and previous session status: " + z10.h(), null);
        } else if (this.f46889t && z10.h()) {
            u("Close camera before creating new session", null);
            F(f.REOPENING_QUIRK);
        }
        if (this.f46890u && z10.h()) {
            u("ConfigAndClose is required when close the camera.", null);
            this.f46891v = true;
        }
        z10.close();
        A4.a aVarRelease = z10.release();
        u("Releasing session in state " + this.f46876f.name(), null);
        this.f46884o.put(z10, aVarRelease);
        I.j.a(aVarRelease, new C5663s(this, z10), E.u.y());
    }

    public final void F(f fVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        G(fVar, null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014d A[Catch: all -> 0x00ec, TryCatch #2 {all -> 0x00ec, blocks: (B:28:0x009c, B:30:0x00a2, B:32:0x00ac, B:49:0x00e9, B:53:0x00ef, B:55:0x00f6, B:57:0x00fa, B:59:0x010a, B:62:0x0112, B:64:0x0116, B:65:0x0125, B:67:0x012b, B:69:0x013d, B:77:0x0169, B:78:0x016c, B:70:0x014d, B:72:0x0151, B:74:0x0155, B:34:0x00b4, B:37:0x00cb, B:44:0x00d9, B:46:0x00e0), top: B:101:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(v.C5664t.f r10, C.C0619f r11, boolean r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C5664t.G(v.t$f, C.f, boolean):void");
    }

    public final ArrayList H(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C.m0 m0Var = (C.m0) it.next();
            boolean z10 = this.f46893x;
            String strY = y(m0Var);
            Class<?> cls = m0Var.getClass();
            H0 h02 = z10 ? m0Var.f760n : m0Var.f761o;
            T0<?> t02 = m0Var.f753f;
            L0 l02 = m0Var.f754g;
            arrayList2.add(new C5647b(strY, cls, h02, t02, l02 != null ? l02.d() : null, m0Var.f754g, m0Var.b() != null ? R.c.G(m0Var) : null));
        }
        return arrayList2;
    }

    public final void I(ArrayList arrayList) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Size sizeD;
        boolean zIsEmpty = this.f46872b.b().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            h hVar = (h) it.next();
            if (!this.f46872b.d(hVar.f())) {
                S0 s02 = this.f46872b;
                String strF = hVar.f();
                H0 h0B = hVar.b();
                T0<?> t0E = hVar.e();
                L0 l0C = hVar.c();
                List<U0.b> listA = hVar.a();
                LinkedHashMap linkedHashMap = s02.f14957b;
                S0.a aVar = (S0.a) linkedHashMap.get(strF);
                if (aVar == null) {
                    aVar = new S0.a(h0B, t0E, l0C, listA);
                    linkedHashMap.put(strF, aVar);
                }
                aVar.f14962e = true;
                s02.e(strF, h0B, t0E, l0C, listA);
                arrayList2.add(hVar.f());
                if (hVar.g() == C.W.class && (sizeD = hVar.d()) != null) {
                    rational = new Rational(sizeD.getWidth(), sizeD.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        u("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED", null);
        if (zIsEmpty) {
            this.i.t(true);
            C5658m c5658m = this.i;
            synchronized (c5658m.f46754d) {
                c5658m.f46765p++;
            }
        }
        q();
        M();
        L();
        E();
        f fVar = this.f46876f;
        f fVar2 = f.OPENED;
        if (fVar == fVar2) {
            C();
        } else {
            int iOrdinal = this.f46876f.ordinal();
            if (iOrdinal == 2 || iOrdinal == 3) {
                J(false);
            } else if (iOrdinal != 4) {
                u("open() ignored due to being in state: " + this.f46876f, null);
            } else {
                F(f.REOPENING);
                if (!this.f46884o.isEmpty() && !this.f46892w && this.f46882m == 0) {
                    A2.l.q("Camera Device should be open if session close is not complete", this.f46881l != null);
                    F(fVar2);
                    C();
                }
            }
        }
        if (rational != null) {
            this.i.f46758h.getClass();
        }
    }

    public final void J(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        u("Attempting to force open the camera.", null);
        if (this.f46888s.e(this)) {
            B(z10);
        } else {
            u("No cameras available. Waiting for available camera before opening camera.", null);
            F(f.PENDING_OPEN);
        }
    }

    public final void K(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        u("Attempting to open the camera.", null);
        if (this.f46886q.f46899b && this.f46888s.e(this)) {
            B(z10);
        } else {
            u("No cameras available. Waiting for available camera before opening camera.", null);
            F(f.PENDING_OPEN);
        }
    }

    public final void L() {
        S0 s02 = this.f46872b;
        s02.getClass();
        H0.h hVar = new H0.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : s02.f14957b.entrySet()) {
            S0.a aVar = (S0.a) entry.getValue();
            if (aVar.f14963f && aVar.f14962e) {
                String str = (String) entry.getKey();
                hVar.a(aVar.f14958a);
                arrayList.add(str);
            }
        }
        C.S.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + s02.f14956a);
        boolean z10 = hVar.f14897k && hVar.f14896j;
        C5658m c5658m = this.i;
        if (!z10) {
            c5658m.f46773x = 1;
            c5658m.f46758h.f46714d = 1;
            c5658m.f46763n.f46960h = 1;
            this.f46883n.g(c5658m.o());
            return;
        }
        int i = hVar.b().f14884g.f14942c;
        c5658m.f46773x = i;
        c5658m.f46758h.f46714d = i;
        c5658m.f46763n.f46960h = i;
        hVar.a(c5658m.o());
        this.f46883n.g(hVar.b());
    }

    public final void M() {
        Iterator<T0<?>> it = this.f46872b.c().iterator();
        boolean zH = false;
        while (it.hasNext()) {
            zH |= it.next().H();
        }
        this.i.f46761l.f47001c = zH;
    }

    @Override // androidx.camera.core.impl.J, C.InterfaceC0625l
    public final C.r a() {
        return n();
    }

    @Override // androidx.camera.core.impl.J
    public final boolean b() {
        return ((C5666v) a()).g() == 0;
    }

    @Override // C.m0.b
    public final void c(C.m0 m0Var) {
        m0Var.getClass();
        this.f46874d.execute(new RunnableC5662q(this, y(m0Var), this.f46893x ? m0Var.f760n : m0Var.f761o, m0Var.f753f, m0Var.f754g, m0Var.b() == null ? null : R.c.G(m0Var), 0));
    }

    @Override // androidx.camera.core.impl.J
    public final void d(androidx.camera.core.impl.B b10) {
        if (b10 == null) {
            b10 = androidx.camera.core.impl.D.f14872a;
        }
        D.a aVar = (D.a) b10;
        I0 i0J = aVar.J();
        this.f46864C = aVar;
        synchronized (this.f46865D) {
            this.f46866E = i0J;
        }
    }

    @Override // androidx.camera.core.impl.J
    public final InterfaceC1715t0<J.a> e() {
        return this.f46877g;
    }

    @Override // androidx.camera.core.impl.J
    public final androidx.camera.core.impl.F f() {
        return this.i;
    }

    @Override // androidx.camera.core.impl.J
    public final androidx.camera.core.impl.B g() {
        return this.f46864C;
    }

    @Override // C.m0.b
    public final void h(C.m0 m0Var) {
        this.f46874d.execute(new C.E(22, this, y(m0Var)));
    }

    @Override // androidx.camera.core.impl.J
    public final void i(boolean z10) {
        this.f46874d.execute(new Z.b(this, z10, 3));
    }

    @Override // androidx.camera.core.impl.J
    public final void j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(H(arrayList2));
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            C.m0 m0Var = (C.m0) it.next();
            String strY = y(m0Var);
            HashSet hashSet = this.f46863B;
            if (hashSet.contains(strY)) {
                m0Var.u();
                hashSet.remove(strY);
            }
        }
        this.f46874d.execute(new RunnableC5661p(this, arrayList3, 0));
    }

    @Override // androidx.camera.core.impl.J
    public final void k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        C5658m c5658m = this.i;
        synchronized (c5658m.f46754d) {
            c5658m.f46765p++;
        }
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            C.m0 m0Var = (C.m0) it.next();
            String strY = y(m0Var);
            HashSet hashSet = this.f46863B;
            if (!hashSet.contains(strY)) {
                hashSet.add(strY);
                m0Var.t();
                m0Var.r();
            }
        }
        try {
            this.f46874d.execute(new RunnableC5661p(this, new ArrayList(H(arrayList2)), 1));
        } catch (RejectedExecutionException e4) {
            u("Unable to attach use cases.", e4);
            c5658m.m();
        }
    }

    @Override // androidx.camera.core.impl.J
    public final /* synthetic */ boolean l() {
        return true;
    }

    @Override // androidx.camera.core.impl.J
    public final void m(boolean z10) {
        this.f46893x = z10;
    }

    @Override // androidx.camera.core.impl.J
    public final androidx.camera.core.impl.I n() {
        return this.f46880k;
    }

    @Override // C.m0.b
    public final void o(C.m0 m0Var) {
        this.f46874d.execute(new O.i(this, y(m0Var), this.f46893x ? m0Var.f760n : m0Var.f761o, m0Var.f753f, m0Var.f754g, m0Var.b() == null ? null : R.c.G(m0Var), 2));
    }

    @Override // C.m0.b
    public final void p(C.m0 m0Var) {
        m0Var.getClass();
        this.f46874d.execute(new RunnableC5662q(this, y(m0Var), this.f46893x ? m0Var.f760n : m0Var.f761o, m0Var.f753f, m0Var.f754g, m0Var.b() == null ? null : R.c.G(m0Var), 1));
    }

    public final void q() {
        S0 s02 = this.f46872b;
        H0 h0B = s02.a().b();
        androidx.camera.core.impl.S s10 = h0B.f14884g;
        int size = Collections.unmodifiableList(s10.f14940a).size();
        int size2 = h0B.b().size();
        if (h0B.b().isEmpty()) {
            return;
        }
        if (!Collections.unmodifiableList(s10.f14940a).isEmpty()) {
            if (size2 == 1 && size == 1) {
                D();
                return;
            }
            if (size >= 2) {
                D();
                return;
            }
            if (this.f46894y != null && !z()) {
                D();
                return;
            }
            C.S.a("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
            return;
        }
        if (this.f46894y == null) {
            this.f46894y = new k0(this.f46880k.f46924b, this.f46868G, new B.f(this, 19));
        }
        if (!z()) {
            C.S.b("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
            return;
        }
        k0 k0Var = this.f46894y;
        if (k0Var != null) {
            String strX = x(k0Var);
            k0 k0Var2 = this.f46894y;
            H0 h02 = k0Var2.f46727b;
            U0.b bVar = U0.b.METERING_REPEATING;
            List<U0.b> listSingletonList = Collections.singletonList(bVar);
            LinkedHashMap linkedHashMap = s02.f14957b;
            S0.a aVar = (S0.a) linkedHashMap.get(strX);
            k0.b bVar2 = k0Var2.f46728c;
            if (aVar == null) {
                aVar = new S0.a(h02, bVar2, null, listSingletonList);
                linkedHashMap.put(strX, aVar);
            }
            aVar.f14962e = true;
            s02.e(strX, h02, bVar2, null, listSingletonList);
            k0 k0Var3 = this.f46894y;
            H0 h03 = k0Var3.f46727b;
            List listSingletonList2 = Collections.singletonList(bVar);
            LinkedHashMap linkedHashMap2 = s02.f14957b;
            S0.a aVar2 = (S0.a) linkedHashMap2.get(strX);
            if (aVar2 == null) {
                aVar2 = new S0.a(h03, k0Var3.f46728c, null, listSingletonList2);
                linkedHashMap2.put(strX, aVar2);
            }
            aVar2.f14963f = true;
        }
    }

    public final void r() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        A2.l.q("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f46876f + " (error: " + w(this.f46882m) + ")", this.f46876f == f.CLOSING || this.f46876f == f.RELEASING || (this.f46876f == f.REOPENING && this.f46882m != 0));
        E();
        this.f46883n.a();
    }

    public final void s() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        A2.l.q(null, this.f46876f == f.RELEASING || this.f46876f == f.CLOSING);
        A2.l.q(null, this.f46884o.isEmpty());
        if (!this.f46891v) {
            v();
            return;
        }
        if (this.f46892w) {
            u("Ignored since configAndClose is processing", null);
            return;
        }
        if (!this.f46886q.f46899b) {
            this.f46891v = false;
            v();
            u("Ignore configAndClose and finish the close flow directly since camera is unavailable.", null);
        } else {
            u("Open camera to configAndClose", null);
            b.d dVarA = o0.b.a(new D7.c(this, 21));
            this.f46892w = true;
            dVarA.f44804c.addListener(new C.g0(this, 25), this.f46874d);
        }
    }

    public final CameraDevice.StateCallback t() {
        ArrayList arrayList = new ArrayList(this.f46872b.a().b().f14880c);
        arrayList.add(this.f46895z.f46667f);
        arrayList.add(this.f46879j);
        return O.a(arrayList);
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f46880k.f46923a);
    }

    public final void u(String str, Throwable th) {
        String strF = Oo.f("{", toString(), "} ", str);
        String strF2 = C.S.f("Camera2CameraImpl");
        if (C.S.e(3, strF2)) {
            Log.d(strF2, strF, th);
        }
    }

    public final void v() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        A2.l.q(null, this.f46876f == f.RELEASING || this.f46876f == f.CLOSING);
        A2.l.q(null, this.f46884o.isEmpty());
        this.f46881l = null;
        if (this.f46876f == f.CLOSING) {
            F(f.INITIALIZED);
            return;
        }
        this.f46873c.f47151a.b(this.f46886q);
        F(f.RELEASED);
    }

    public final boolean z() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f46865D) {
            try {
                i = this.f46887r.f4e == 2 ? 1 : 0;
            } finally {
            }
        }
        S0 s02 = this.f46872b;
        s02.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : s02.f14957b.entrySet()) {
            if (((S0.a) entry.getValue()).f14962e) {
                arrayList2.add((S0.a) entry.getValue());
            }
        }
        for (S0.a aVar : Collections.unmodifiableCollection(arrayList2)) {
            List<U0.b> list = aVar.f14961d;
            if (list == null || list.get(0) != U0.b.METERING_REPEATING) {
                if (aVar.f14960c == null || aVar.f14961d == null) {
                    C.S.g("Camera2CameraImpl", "Invalid stream spec or capture types in " + aVar);
                    return false;
                }
                H0 h02 = aVar.f14958a;
                T0<?> t02 = aVar.f14959b;
                for (androidx.camera.core.impl.X x10 : h02.b()) {
                    n0 n0Var = this.f46870I;
                    int iH = t02.h();
                    arrayList.add(new C1679b(N0.f(i, iH, x10.f14994h, n0Var.i(iH)), t02.h(), x10.f14994h, aVar.f14960c.a(), aVar.f14961d, aVar.f14960c.c(), t02.e()));
                }
            }
        }
        this.f46894y.getClass();
        HashMap map = new HashMap();
        k0 k0Var = this.f46894y;
        map.put(k0Var.f46728c, Collections.singletonList(k0Var.f46729d));
        try {
            this.f46870I.g(i, arrayList, map, false, false);
            u("Surface combination with metering repeating supported!", null);
            return true;
        } catch (IllegalArgumentException e4) {
            u("Surface combination with metering repeating  not supported!", e4);
            return false;
        }
    }
}
