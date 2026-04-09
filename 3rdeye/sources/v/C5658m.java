package v;

import B.j;
import C.C0626m;
import C.J;
import I.m;
import Q9.C1553s;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Size;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1712s;
import androidx.camera.core.impl.C1713s0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.P0;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.S0;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.yandex.mobile.ads.impl.A3;
import f2.RunnableC4331a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import o0.b;
import u.C5616a;
import u1.RunnableC5618a;
import v.C5664t;
import v.C5670z;
import w.C5698l;
import z.C5831a;
import z.C5832b;
import z.C5839i;

/* compiled from: Camera2CameraControlImpl.java */
/* renamed from: v.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5658m implements androidx.camera.core.impl.F {

    /* renamed from: b, reason: collision with root package name */
    public final b f46752b;

    /* renamed from: c, reason: collision with root package name */
    public final H.g f46753c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f46754d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final C5698l f46755e;

    /* renamed from: f, reason: collision with root package name */
    public final C5664t.d f46756f;

    /* renamed from: g, reason: collision with root package name */
    public final H0.b f46757g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f46758h;
    public final w0 i;

    /* renamed from: j, reason: collision with root package name */
    public final v0 f46759j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f46760k;

    /* renamed from: l, reason: collision with root package name */
    public final z0 f46761l;

    /* renamed from: m, reason: collision with root package name */
    public final B.g f46762m;

    /* renamed from: n, reason: collision with root package name */
    public final C5670z f46763n;

    /* renamed from: o, reason: collision with root package name */
    public final C1553s f46764o;

    /* renamed from: p, reason: collision with root package name */
    public int f46765p;

    /* renamed from: q, reason: collision with root package name */
    public J.g f46766q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f46767r;

    /* renamed from: s, reason: collision with root package name */
    public volatile int f46768s;

    /* renamed from: t, reason: collision with root package name */
    public final C5831a f46769t;

    /* renamed from: u, reason: collision with root package name */
    public final C5832b f46770u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicLong f46771v;

    /* renamed from: w, reason: collision with root package name */
    public volatile A4.a<Void> f46772w;

    /* renamed from: x, reason: collision with root package name */
    public int f46773x;

    /* renamed from: y, reason: collision with root package name */
    public long f46774y;

    /* renamed from: z, reason: collision with root package name */
    public final a f46775z;

    /* compiled from: Camera2CameraControlImpl.java */
    /* renamed from: v.m$a */
    public static final class a extends AbstractC1707p {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f46776a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayMap f46777b = new ArrayMap();

        @Override // androidx.camera.core.impl.AbstractC1707p
        public final void a(int i) {
            Iterator it = this.f46776a.iterator();
            while (it.hasNext()) {
                AbstractC1707p abstractC1707p = (AbstractC1707p) it.next();
                try {
                    ((Executor) this.f46777b.get(abstractC1707p)).execute(new com.applovin.impl.K(i, 4, abstractC1707p));
                } catch (RejectedExecutionException e4) {
                    C.S.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e4);
                }
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1707p
        public final void b(int i, androidx.camera.core.impl.A a10) {
            Iterator it = this.f46776a.iterator();
            while (it.hasNext()) {
                AbstractC1707p abstractC1707p = (AbstractC1707p) it.next();
                try {
                    ((Executor) this.f46777b.get(abstractC1707p)).execute(new RunnableC5618a(abstractC1707p, i, 1, a10));
                } catch (RejectedExecutionException e4) {
                    C.S.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e4);
                }
            }
        }

        @Override // androidx.camera.core.impl.AbstractC1707p
        public final void c(final int i, final C1712s c1712s) {
            Iterator it = this.f46776a.iterator();
            while (it.hasNext()) {
                final AbstractC1707p abstractC1707p = (AbstractC1707p) it.next();
                try {
                    ((Executor) this.f46777b.get(abstractC1707p)).execute(new Runnable() { // from class: v.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC1707p.c(i, c1712s);
                        }
                    });
                } catch (RejectedExecutionException e4) {
                    C.S.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e4);
                }
            }
        }
    }

    /* compiled from: Camera2CameraControlImpl.java */
    /* renamed from: v.m$b */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f46778a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        public final H.g f46779b;

        public b(H.g gVar) {
            this.f46779b = gVar;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f46779b.execute(new A3(7, this, totalCaptureResult));
        }
    }

    /* compiled from: Camera2CameraControlImpl.java */
    /* renamed from: v.m$c */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public C5658m(C5698l c5698l, H.c cVar, H.g gVar, C5664t.d dVar, C0 c02) {
        H0.b bVar = new H0.b();
        this.f46757g = bVar;
        this.f46765p = 0;
        this.f46767r = false;
        this.f46768s = 2;
        this.f46771v = new AtomicLong(0L);
        this.f46772w = m.c.f2366c;
        this.f46773x = 1;
        this.f46774y = 0L;
        a aVar = new a();
        this.f46775z = aVar;
        this.f46755e = c5698l;
        this.f46756f = dVar;
        this.f46753c = gVar;
        this.f46764o = new C1553s(gVar);
        b bVar2 = new b(gVar);
        this.f46752b = bVar2;
        bVar.f14887b.f14950c = this.f46773x;
        bVar.f14887b.b(new U(bVar2));
        bVar.f14887b.b(aVar);
        this.f46760k = new e0(this, gVar);
        this.f46758h = new i0(this, cVar, gVar);
        this.i = new w0(this, c5698l, gVar);
        this.f46759j = new v0(this, c5698l, gVar);
        this.f46761l = new z0(c5698l);
        this.f46769t = new C5831a(c02);
        this.f46770u = new C5832b(c02);
        this.f46762m = new B.g(this, gVar);
        this.f46763n = new C5670z(this, c5698l, c02, gVar, cVar);
    }

    public static int p(C5698l c5698l, int i) {
        int[] iArr = (int[]) c5698l.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return r(i, iArr) ? i : r(1, iArr) ? 1 : 0;
    }

    public static boolean r(int i, int[] iArr) {
        for (int i10 : iArr) {
            if (i == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(TotalCaptureResult totalCaptureResult, long j4) {
        Long l5;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof P0) && (l5 = (Long) ((P0) tag).f14935a.get("CameraControlSessionUpdateId")) != null && l5.longValue() >= j4;
    }

    @Override // androidx.camera.core.impl.F
    public final void a() {
        C1553s c1553s = this.f46764o;
        c1553s.getClass();
        ((H.g) c1553s.f11527b).execute(new com.vungle.ads.internal.util.a(c1553s, 12));
    }

    @Override // androidx.camera.core.impl.F
    public final void b(J.g gVar) {
        this.f46766q = gVar;
    }

    @Override // androidx.camera.core.impl.F
    public final void c(androidx.camera.core.impl.U u8) {
        B.g gVar = this.f46762m;
        B.j jVarC = j.a.d(u8).c();
        synchronized (gVar.f322e) {
            C5616a.C0536a c0536a = gVar.f323f;
            c0536a.getClass();
            U.b bVar = U.b.OPTIONAL;
            for (U.a aVar : jVarC.l()) {
                c0536a.f46482a.M(aVar, bVar, jVarC.b(aVar));
            }
        }
        I.j.f(o0.b.a(new B.d(gVar, 0))).addListener(new RunnableC5655j(0), E.u.y());
    }

    @Override // androidx.camera.core.impl.F
    public final Rect d() {
        Rect rect = (Rect) this.f46755e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        }
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.core.impl.F
    public final void e(int i) {
        if (!q()) {
            C.S.g("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f46768s = i;
        C.S.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f46768s);
        z0 z0Var = this.f46761l;
        boolean z10 = true;
        if (this.f46768s != 1 && this.f46768s != 0) {
            z10 = false;
        }
        z0Var.f47002d = z10;
        this.f46772w = I.j.f(o0.b.a(new D7.c(this, 20)));
    }

    @Override // androidx.camera.core.impl.F
    public final void f(H0.b bVar) throws Exception {
        HashMap map;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        z0 z0Var = this.f46761l;
        C5698l c5698l = z0Var.f46999a;
        while (true) {
            M.d dVar = z0Var.f47000b;
            if (dVar.c()) {
                break;
            } else {
                dVar.a().close();
            }
        }
        C.i0 i0Var = z0Var.i;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (i0Var != null) {
            androidx.camera.core.e eVar = z0Var.f47005g;
            if (eVar != null) {
                I.j.f(i0Var.f14991e).addListener(new E.m(eVar, 1), E.u.H());
                z0Var.f47005g = null;
            }
            i0Var.a();
            z0Var.i = null;
        }
        ImageWriter imageWriter = z0Var.f47007j;
        if (imageWriter != null) {
            imageWriter.close();
            z0Var.f47007j = null;
        }
        boolean z10 = z0Var.f47001c;
        S.a aVar = bVar.f14887b;
        if (z10) {
            aVar.f14950c = 1;
            return;
        }
        if (z0Var.f47004f) {
            aVar.f14950c = 1;
            return;
        }
        try {
            streamConfigurationMap2 = (StreamConfigurationMap) c5698l.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e4) {
            C.S.b("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e4.getMessage());
        }
        if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i : streamConfigurationMap2.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap2.getInputSizes(i);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new G.d(true));
                    map.put(Integer.valueOf(i), inputSizes[0]);
                }
            }
        }
        if (z0Var.f47003e && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) c5698l.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            for (int i10 : validOutputFormatsForInput) {
                if (i10 == 256) {
                    Size size = (Size) map.get(34);
                    androidx.camera.core.d dVar2 = new androidx.camera.core.d(size.getWidth(), size.getHeight(), 34, 9);
                    z0Var.f47006h = dVar2.f14844b;
                    z0Var.f47005g = new androidx.camera.core.e(dVar2);
                    dVar2.h(new B8.b(z0Var, 16), E.u.F());
                    C.i0 i0Var2 = new C.i0(z0Var.f47005g.a(), new Size(z0Var.f47005g.getWidth(), z0Var.f47005g.getHeight()), 34);
                    z0Var.i = i0Var2;
                    androidx.camera.core.e eVar2 = z0Var.f47005g;
                    A4.a aVarF = I.j.f(i0Var2.f14991e);
                    Objects.requireNonNull(eVar2);
                    aVarF.addListener(new E.m(eVar2, 1), E.u.H());
                    bVar.c(z0Var.i, C.C.f616d, -1);
                    bVar.a(z0Var.f47006h);
                    y0 y0Var = new y0(z0Var);
                    ArrayList arrayList = bVar.f14889d;
                    if (!arrayList.contains(y0Var)) {
                        arrayList.add(y0Var);
                    }
                    bVar.f14892g = new InputConfiguration(z0Var.f47005g.getWidth(), z0Var.f47005g.getHeight(), z0Var.f47005g.d());
                    return;
                }
            }
        }
        aVar.f14950c = 1;
    }

    @Override // androidx.camera.core.impl.F
    public final A4.a g(final ArrayList arrayList, final int i, final int i10) {
        if (!q()) {
            C.S.g("Camera2CameraControlImp", "Camera is not active.");
            return new m.a(new C0626m("Camera is not active."));
        }
        final int i11 = this.f46768s;
        I.d dVarA = I.d.a(I.j.f(this.f46772w));
        I.a aVar = new I.a() { // from class: v.i
            @Override // I.a
            public final A4.a apply(Object obj) {
                C5670z c5670z = this.f46705b.f46763n;
                int i12 = i10;
                int i13 = i;
                final int i14 = i11;
                final C5670z.d dVarA2 = c5670z.a(i13, i14, i12);
                I.d dVarA3 = I.d.a(dVarA2.a(i14));
                final ArrayList arrayList2 = arrayList;
                I.a aVar2 = new I.a() { // from class: v.A
                    @Override // I.a
                    public final A4.a apply(Object obj2) {
                        androidx.camera.core.c cVarA;
                        C5670z.d dVar = dVarA2;
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            C5658m c5658m = dVar.f46975d;
                            if (!zHasNext) {
                                c5658m.u(arrayList4);
                                return I.j.b(arrayList3);
                            }
                            androidx.camera.core.impl.S s10 = (androidx.camera.core.impl.S) it.next();
                            S.a aVar3 = new S.a(s10);
                            androidx.camera.core.impl.A a10 = null;
                            int i15 = s10.f14942c;
                            if (i15 == 5) {
                                z0 z0Var = c5658m.f46761l;
                                if (!z0Var.f47002d && !z0Var.f47001c) {
                                    try {
                                        cVarA = z0Var.f47000b.a();
                                    } catch (NoSuchElementException unused) {
                                        C.S.b("ZslControlImpl", "dequeueImageFromBuffer no such element");
                                        cVarA = null;
                                    }
                                    if (cVarA != null) {
                                        z0 z0Var2 = c5658m.f46761l;
                                        z0Var2.getClass();
                                        Image image = cVarA.getImage();
                                        ImageWriter imageWriter = z0Var2.f47007j;
                                        if (imageWriter != null && image != null) {
                                            try {
                                                imageWriter.queueInputImage(image);
                                                C.L lI0 = cVarA.i0();
                                                if (lI0 instanceof J.c) {
                                                    a10 = ((J.c) lI0).f2652a;
                                                }
                                            } catch (IllegalStateException e4) {
                                                C.S.b("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e4.getMessage());
                                            }
                                        }
                                    }
                                }
                            }
                            if (a10 != null) {
                                aVar3.f14955h = a10;
                            } else {
                                int i16 = (dVar.f46972a != 3 || dVar.f46977f) ? (i15 == -1 || i15 == 5) ? 2 : -1 : 4;
                                if (i16 != -1) {
                                    aVar3.f14950c = i16;
                                }
                            }
                            C5839i c5839i = dVar.f46976e;
                            if (c5839i.f48393b && i14 == 0 && c5839i.f48392a) {
                                C1710q0 c1710q0K = C1710q0.K();
                                c1710q0K.N(C5616a.J(CaptureRequest.CONTROL_AE_MODE), 3);
                                aVar3.c(new C5616a(C1717u0.J(c1710q0K)));
                            }
                            arrayList3.add(o0.b.a(new B.d(dVar, aVar3)));
                            arrayList4.add(aVar3.d());
                        }
                    }
                };
                dVarA3.getClass();
                H.g gVar = dVarA2.f46973b;
                I.b bVarJ = I.j.j(dVarA3, aVar2, gVar);
                bVarJ.addListener(new RunnableC4331a(dVarA2, 7), gVar);
                return I.j.f(bVarJ);
            }
        };
        H.g gVar = this.f46753c;
        dVarA.getClass();
        return I.j.j(dVarA, aVar, gVar);
    }

    @Override // androidx.camera.core.impl.F
    public final A4.a<E.i> h(final int i, final int i10) {
        if (!q()) {
            C.S.g("Camera2CameraControlImp", "Camera is not active.");
            return new m.a(new C0626m("Camera is not active."));
        }
        final int i11 = this.f46768s;
        I.d dVarA = I.d.a(I.j.f(this.f46772w));
        I.a aVar = new I.a() { // from class: v.k
            @Override // I.a
            public final A4.a apply(Object obj) {
                C5670z c5670z = this.f46722b.f46763n;
                int i12 = i10;
                int i13 = i;
                int i14 = i11;
                return I.j.e(new C5670z.c(c5670z.a(i13, i14, i12), c5670z.f46957e, i14));
            }
        };
        H.g gVar = this.f46753c;
        dVarA.getClass();
        return I.j.j(dVarA, aVar, gVar);
    }

    @Override // androidx.camera.core.impl.F
    public final androidx.camera.core.impl.U i() {
        C5616a c5616a;
        B.g gVar = this.f46762m;
        synchronized (gVar.f322e) {
            C5616a.C0536a c0536a = gVar.f323f;
            c0536a.getClass();
            c5616a = new C5616a(C1717u0.J(c0536a.f46482a));
        }
        return c5616a;
    }

    @Override // androidx.camera.core.impl.F
    public final void j() {
        B.g gVar = this.f46762m;
        synchronized (gVar.f322e) {
            gVar.f323f = new C5616a.C0536a();
        }
        I.j.f(o0.b.a(new B.f(gVar, 0))).addListener(new RunnableC5655j(0), E.u.y());
    }

    @Override // androidx.camera.core.impl.F
    public final void k() {
        C1553s c1553s = this.f46764o;
        c1553s.getClass();
        ((H.g) c1553s.f11527b).execute(new o.b0(c1553s, 5));
    }

    public final void l(c cVar) {
        this.f46752b.f46778a.add(cVar);
    }

    public final void m() {
        synchronized (this.f46754d) {
            try {
                int i = this.f46765p;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f46765p = i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(boolean z10) {
        this.f46767r = z10;
        if (!z10) {
            S.a aVar = new S.a();
            aVar.f14950c = this.f46773x;
            aVar.f14953f = true;
            C1710q0 c1710q0K = C1710q0.K();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            c1710q0K.N(C5616a.J(key), Integer.valueOf(p(this.f46755e, 1)));
            c1710q0K.N(C5616a.J(CaptureRequest.FLASH_MODE), 0);
            aVar.c(new C5616a(C1717u0.J(c1710q0K)));
            u(Collections.singletonList(aVar.d()));
        }
        v();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.H0 o() {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C5658m.o():androidx.camera.core.impl.H0");
    }

    public final boolean q() {
        int i;
        synchronized (this.f46754d) {
            i = this.f46765p;
        }
        return i > 0;
    }

    public final void t(boolean z10) {
        J.b bVar;
        C.S.a("Camera2CameraControlImp", "setActive: isActive = " + z10);
        i0 i0Var = this.f46758h;
        if (z10 != i0Var.f46713c) {
            i0Var.f46713c = z10;
            if (!i0Var.f46713c) {
                C5658m c5658m = i0Var.f46711a;
                c5658m.f46752b.f46778a.remove(null);
                c5658m.f46752b.f46778a.remove(null);
                if (i0Var.f46715e.length > 0) {
                    i0Var.a(true, false);
                }
                MeteringRectangle[] meteringRectangleArr = i0.f46710j;
                i0Var.f46715e = meteringRectangleArr;
                i0Var.f46716f = meteringRectangleArr;
                i0Var.f46717g = meteringRectangleArr;
                c5658m.v();
            }
        }
        w0 w0Var = this.i;
        if (w0Var.f46944e != z10) {
            w0Var.f46944e = z10;
            if (!z10) {
                synchronized (w0Var.f46941b) {
                    w0Var.f46941b.e();
                    x0 x0Var = w0Var.f46941b;
                    bVar = new J.b(x0Var.d(), x0Var.b(), x0Var.c(), x0Var.a());
                }
                Looper looperMyLooper = Looper.myLooper();
                Looper mainLooper = Looper.getMainLooper();
                androidx.lifecycle.E<Object> e4 = w0Var.f46942c;
                if (looperMyLooper == mainLooper) {
                    e4.j(bVar);
                } else {
                    e4.k(bVar);
                }
                w0Var.f46943d.e();
                w0Var.f46940a.v();
            }
        }
        v0 v0Var = this.f46759j;
        if (v0Var.f46936d != z10) {
            v0Var.f46936d = z10;
            if (!z10) {
                if (v0Var.f46938f) {
                    v0Var.f46938f = false;
                    v0Var.f46933a.n(false);
                    androidx.lifecycle.E<Integer> e10 = v0Var.f46934b;
                    if (G.n.b()) {
                        e10.j(0);
                    } else {
                        e10.k(0);
                    }
                }
                b.a<Void> aVar = v0Var.f46937e;
                if (aVar != null) {
                    aVar.d(new C0626m("Camera is not active."));
                    v0Var.f46937e = null;
                }
            }
        }
        this.f46760k.a(z10);
        B.g gVar = this.f46762m;
        gVar.getClass();
        gVar.f321d.execute(new B.e(gVar, z10, 0));
        if (z10) {
            return;
        }
        this.f46766q = null;
        ((AtomicInteger) this.f46764o.f11528c).set(0);
        C.S.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }

    public final void u(List<androidx.camera.core.impl.S> list) {
        int iC;
        int iB;
        androidx.camera.core.impl.A a10;
        C5664t.d dVar = this.f46756f;
        dVar.getClass();
        list.getClass();
        C5664t c5664t = C5664t.this;
        c5664t.getClass();
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.S s10 : list) {
            HashSet hashSet = new HashSet();
            C1710q0.K();
            ArrayList arrayList2 = new ArrayList();
            C1713s0.a();
            hashSet.addAll(s10.f14940a);
            C1710q0 c1710q0L = C1710q0.L(s10.f14941b);
            arrayList2.addAll(s10.f14944e);
            ArrayMap arrayMap = new ArrayMap();
            P0 p02 = s10.f14946g;
            for (String str : p02.f14935a.keySet()) {
                arrayMap.put(str, p02.f14935a.get(str));
            }
            C1713s0 c1713s0 = new C1713s0(arrayMap);
            androidx.camera.core.impl.A a11 = (s10.f14942c != 5 || (a10 = s10.f14947h) == null) ? null : a10;
            if (Collections.unmodifiableList(s10.f14940a).isEmpty() && s10.f14945f) {
                if (hashSet.isEmpty()) {
                    S0 s02 = c5664t.f46872b;
                    s02.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : s02.f14957b.entrySet()) {
                        S0.a aVar = (S0.a) entry.getValue();
                        if (aVar.f14963f && aVar.f14962e) {
                            arrayList3.add(((S0.a) entry.getValue()).f14958a);
                        }
                    }
                    Iterator it = Collections.unmodifiableCollection(arrayList3).iterator();
                    while (it.hasNext()) {
                        androidx.camera.core.impl.S s11 = ((H0) it.next()).f14884g;
                        List listUnmodifiableList = Collections.unmodifiableList(s11.f14940a);
                        if (!listUnmodifiableList.isEmpty()) {
                            if (s11.b() != 0 && (iB = s11.b()) != 0) {
                                c1710q0L.N(T0.f14969E, Integer.valueOf(iB));
                            }
                            if (s11.c() != 0 && (iC = s11.c()) != 0) {
                                c1710q0L.N(T0.f14970F, Integer.valueOf(iC));
                            }
                            Iterator it2 = listUnmodifiableList.iterator();
                            while (it2.hasNext()) {
                                hashSet.add((androidx.camera.core.impl.X) it2.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        C.S.g("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                    }
                } else {
                    C.S.g("Camera2CameraImpl", "The capture config builder already has surface inside.");
                }
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            C1717u0 c1717u0J = C1717u0.J(c1710q0L);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            P0 p03 = P0.f14934b;
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayMap arrayMap3 = c1713s0.f14935a;
            for (String str2 : arrayMap3.keySet()) {
                arrayMap2.put(str2, arrayMap3.get(str2));
            }
            arrayList.add(new androidx.camera.core.impl.S(arrayList4, c1717u0J, s10.f14942c, s10.f14943d, arrayList5, s10.f14945f, new P0(arrayMap2), a11));
        }
        c5664t.u("Issue capture request", null);
        c5664t.f46883n.e(arrayList);
    }

    public final long v() {
        this.f46774y = this.f46771v.getAndIncrement();
        C5664t.this.L();
        return this.f46774y;
    }
}
