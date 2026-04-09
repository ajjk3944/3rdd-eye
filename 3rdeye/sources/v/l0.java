package v;

import B.j;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.I0;
import androidx.camera.core.impl.P0;
import androidx.camera.core.impl.U;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import u.C5616a;
import y.C5787a;

/* compiled from: ProcessingCaptureSession.java */
/* loaded from: classes.dex */
public final class l0 implements Z {

    /* renamed from: n, reason: collision with root package name */
    public static final ArrayList f46738n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public static int f46739o = 0;

    /* renamed from: a, reason: collision with root package name */
    public final I0 f46740a;

    /* renamed from: b, reason: collision with root package name */
    public final H.g f46741b;

    /* renamed from: c, reason: collision with root package name */
    public final H.c f46742c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f46743d;

    /* renamed from: f, reason: collision with root package name */
    public H0 f46745f;

    /* renamed from: g, reason: collision with root package name */
    public I f46746g;

    /* renamed from: h, reason: collision with root package name */
    public H0 f46747h;
    public a i;

    /* renamed from: m, reason: collision with root package name */
    public final int f46751m;

    /* renamed from: e, reason: collision with root package name */
    public List<androidx.camera.core.impl.X> f46744e = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public volatile List<androidx.camera.core.impl.S> f46748j = null;

    /* renamed from: k, reason: collision with root package name */
    public B.j f46749k = new B.j(C1717u0.J(C1710q0.K()));

    /* renamed from: l, reason: collision with root package name */
    public B.j f46750l = new B.j(C1717u0.J(C1710q0.K()));

    /* compiled from: ProcessingCaptureSession.java */
    public enum a {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    public l0(I0 i02, C5666v c5666v, x.b bVar, H.g gVar, H.c cVar) {
        this.f46751m = 0;
        this.f46743d = new Y(bVar, C5787a.f47852a.e(CaptureSessionShouldUseMrirQuirk.class) != null);
        this.f46740a = i02;
        this.f46741b = gVar;
        this.f46742c = cVar;
        this.i = a.UNINITIALIZED;
        int i = f46739o;
        f46739o = i + 1;
        this.f46751m = i;
        C.S.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + i + ")");
    }

    public static void i(List<androidx.camera.core.impl.S> list) {
        for (androidx.camera.core.impl.S s10 : list) {
            Iterator<AbstractC1707p> it = s10.f14944e.iterator();
            while (it.hasNext()) {
                it.next().a(s10.a());
            }
        }
    }

    @Override // v.Z
    public final void a() {
        C.S.a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f46751m + ")");
        if (this.f46748j != null) {
            for (androidx.camera.core.impl.S s10 : this.f46748j) {
                Iterator<AbstractC1707p> it = s10.f14944e.iterator();
                while (it.hasNext()) {
                    it.next().a(s10.a());
                }
            }
            this.f46748j = null;
        }
    }

    @Override // v.Z
    public final A4.a b(H0 h02, CameraDevice cameraDevice, r0 r0Var) {
        A2.l.k("Invalid state state:" + this.i, this.i == a.UNINITIALIZED);
        A2.l.k("SessionConfig contains no surfaces", h02.b().isEmpty() ^ true);
        C.S.a("ProcessingCaptureSession", "open (id=" + this.f46751m + ")");
        List<androidx.camera.core.impl.X> listB = h02.b();
        this.f46744e = listB;
        H.c cVar = this.f46742c;
        H.g gVar = this.f46741b;
        I.d dVarA = I.d.a(androidx.camera.core.impl.Z.c(listB, gVar, cVar));
        com.applovin.impl.privacy.cmp.c cVar2 = new com.applovin.impl.privacy.cmp.c(this, h02, cameraDevice, r0Var);
        dVarA.getClass();
        return I.j.j(I.j.j(dVarA, cVar2, gVar), new H6.I(new V.d(this, 2), 2), gVar);
    }

    @Override // v.Z
    public final void close() {
        C.S.a("ProcessingCaptureSession", "close (id=" + this.f46751m + ") state=" + this.i);
        if (this.i == a.ON_CAPTURE_SESSION_STARTED) {
            C.S.a("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.f46751m + ")");
            this.f46740a.b();
            I i = this.f46746g;
            if (i != null) {
                synchronized (i.f46620a) {
                    i.f46623d = true;
                    i.f46621b = null;
                    i.f46624e = null;
                    i.f46622c = null;
                }
            }
            this.i = a.ON_CAPTURE_SESSION_ENDED;
        }
        this.f46743d.close();
    }

    @Override // v.Z
    public final List<androidx.camera.core.impl.S> d() {
        return this.f46748j != null ? this.f46748j : Collections.EMPTY_LIST;
    }

    @Override // v.Z
    public final void e(List<androidx.camera.core.impl.S> list) {
        if (list.isEmpty()) {
            return;
        }
        C.S.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f46751m + ") + state =" + this.i);
        int iOrdinal = this.i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (this.f46748j == null) {
                this.f46748j = list;
                return;
            } else {
                i(list);
                C.S.a("ProcessingCaptureSession", "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3 || iOrdinal == 4) {
                C.S.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.i);
                i(list);
                return;
            }
            return;
        }
        for (androidx.camera.core.impl.S s10 : list) {
            int i = s10.f14942c;
            if (i == 2 || i == 4) {
                j.a aVarD = j.a.d(s10.f14941b);
                C1683d c1683d = androidx.camera.core.impl.S.i;
                C1717u0 c1717u0 = s10.f14941b;
                if (c1717u0.f15118G.containsKey(c1683d)) {
                    aVarD.f330a.N(C5616a.J(CaptureRequest.JPEG_ORIENTATION), (Integer) c1717u0.b(c1683d));
                }
                C1683d c1683d2 = androidx.camera.core.impl.S.f14938j;
                if (c1717u0.f15118G.containsKey(c1683d2)) {
                    aVarD.f330a.N(C5616a.J(CaptureRequest.JPEG_QUALITY), Byte.valueOf(((Integer) c1717u0.b(c1683d2)).byteValue()));
                }
                B.j jVarC = aVarD.c();
                this.f46750l = jVarC;
                B.j jVar = this.f46749k;
                C1710q0 c1710q0K = C1710q0.K();
                U.b bVar = U.b.OPTIONAL;
                for (U.a aVar : jVar.l()) {
                    c1710q0K.M(aVar, bVar, jVar.b(aVar));
                }
                U.b bVar2 = U.b.OPTIONAL;
                for (U.a aVar2 : jVarC.l()) {
                    c1710q0K.M(aVar2, bVar2, jVarC.b(aVar2));
                }
                C1717u0.J(c1710q0K);
                this.f46740a.f();
                s10.a();
                this.f46740a.a();
            } else {
                C.S.a("ProcessingCaptureSession", "issueTriggerRequest");
                Iterator<U.a<?>> it = j.a.d(s10.f14941b).c().getConfig().l().iterator();
                while (it.hasNext()) {
                    CaptureRequest.Key key = (CaptureRequest.Key) it.next().c();
                    if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                        s10.a();
                        this.f46740a.getClass();
                        break;
                    }
                }
                i(Arrays.asList(s10));
            }
        }
    }

    @Override // v.Z
    public final H0 f() {
        return this.f46745f;
    }

    @Override // v.Z
    public final void g(H0 h02) {
        C.S.a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f46751m + ")");
        this.f46745f = h02;
        if (h02 == null) {
            return;
        }
        I i = this.f46746g;
        if (i != null) {
            synchronized (i.f46620a) {
                i.f46624e = h02;
            }
        }
        if (this.i == a.ON_CAPTURE_SESSION_STARTED) {
            B.j jVarC = j.a.d(h02.f14884g.f14941b).c();
            this.f46749k = jVarC;
            B.j jVar = this.f46750l;
            C1710q0 c1710q0K = C1710q0.K();
            U.b bVar = U.b.OPTIONAL;
            for (U.a aVar : jVarC.l()) {
                c1710q0K.M(aVar, bVar, jVarC.b(aVar));
            }
            U.b bVar2 = U.b.OPTIONAL;
            for (U.a aVar2 : jVar.l()) {
                c1710q0K.M(aVar2, bVar2, jVar.b(aVar2));
            }
            C1717u0.J(c1710q0K);
            this.f46740a.f();
            for (androidx.camera.core.impl.X x10 : Collections.unmodifiableList(h02.f14884g.f14940a)) {
                if (Objects.equals(x10.f14995j, C.W.class) || Objects.equals(x10.f14995j, R.c.class)) {
                    I0 i02 = this.f46740a;
                    P0 p02 = h02.f14884g.f14946g;
                    i02.g();
                    return;
                }
            }
            this.f46740a.d();
        }
    }

    @Override // v.Z
    public final boolean h() {
        return this.f46743d.h();
    }

    @Override // v.Z
    public final A4.a release() {
        C.S.a("ProcessingCaptureSession", "release (id=" + this.f46751m + ") mProcessorState=" + this.i);
        A4.a aVarRelease = this.f46743d.release();
        int iOrdinal = this.i.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            aVarRelease.addListener(new com.vungle.ads.internal.util.a(this, 11), E.u.y());
        }
        this.i = a.DE_INITIALIZED;
        return aVarRelease;
    }

    /* compiled from: ProcessingCaptureSession.java */
    public static class b implements I0.a {
        @Override // androidx.camera.core.impl.I0.a
        public final void a() {
        }

        @Override // androidx.camera.core.impl.I0.a
        public final void c() {
        }

        @Override // androidx.camera.core.impl.I0.a
        public final void d() {
        }

        @Override // androidx.camera.core.impl.I0.a
        public final void b(androidx.camera.extensions.internal.sessionprocessor.c cVar) {
        }

        @Override // androidx.camera.core.impl.I0.a
        public final /* synthetic */ void onCaptureProcessProgressed(int i) {
        }
    }

    @Override // v.Z
    public final void c(HashMap map) {
    }
}
