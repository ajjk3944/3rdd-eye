package v;

import I.m;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.utils.SurfaceUtil;
import com.applovin.impl.A0;
import g0.C4356c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o0.b;
import v.o0;
import z.C5841k;
import z.C5843m;
import z.C5845o;
import z.C5846p;

/* compiled from: CaptureSession.java */
/* loaded from: classes.dex */
public final class Y implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final Object f46642a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f46643b;

    /* renamed from: c, reason: collision with root package name */
    public final b f46644c;

    /* renamed from: d, reason: collision with root package name */
    public r0 f46645d;

    /* renamed from: e, reason: collision with root package name */
    public r0 f46646e;

    /* renamed from: f, reason: collision with root package name */
    public H0 f46647f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f46648g;

    /* renamed from: h, reason: collision with root package name */
    public List<androidx.camera.core.impl.X> f46649h;
    public a i;

    /* renamed from: j, reason: collision with root package name */
    public b.d f46650j;

    /* renamed from: k, reason: collision with root package name */
    public b.a<Void> f46651k;

    /* renamed from: l, reason: collision with root package name */
    public HashMap f46652l;

    /* renamed from: m, reason: collision with root package name */
    public final C5843m f46653m;

    /* renamed from: n, reason: collision with root package name */
    public final C5846p f46654n;

    /* renamed from: o, reason: collision with root package name */
    public final C5841k f46655o;

    /* renamed from: p, reason: collision with root package name */
    public final x.b f46656p;

    /* renamed from: q, reason: collision with root package name */
    public final C5845o f46657q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f46658r;

    /* compiled from: CaptureSession.java */
    public enum a {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* compiled from: CaptureSession.java */
    public final class b extends o0.b {
        public b() {
        }

        @Override // v.o0.b
        public final void i(o0 o0Var) {
            synchronized (Y.this.f46642a) {
                try {
                    switch (Y.this.i) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + Y.this.i);
                        case OPENING:
                        case CLOSED:
                        case RELEASING:
                            Y.this.l();
                            break;
                        case RELEASED:
                            C.S.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    C.S.b("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + Y.this.i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // v.o0.b
        public final void j(r0 r0Var) {
            synchronized (Y.this.f46642a) {
                try {
                    switch (Y.this.i) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                        case RELEASED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + Y.this.i);
                        case OPENING:
                            Y y10 = Y.this;
                            y10.i = a.OPENED;
                            y10.f46646e = r0Var;
                            C.S.a("CaptureSession", "Attempting to send capture request onConfigured");
                            Y y11 = Y.this;
                            y11.q(y11.f46647f);
                            Y y12 = Y.this;
                            y12.f46655o.b().addListener(new o.b0(y12, 4), E.u.y());
                            break;
                        case CLOSED:
                            Y.this.f46646e = r0Var;
                            break;
                        case RELEASING:
                            r0Var.close();
                            break;
                    }
                    C.S.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + Y.this.i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // v.o0.b
        public final void k(r0 r0Var) {
            synchronized (Y.this.f46642a) {
                try {
                    if (Y.this.i.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + Y.this.i);
                    }
                    C.S.a("CaptureSession", "CameraCaptureSession.onReady() " + Y.this.i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // v.o0.b
        public final void l(o0 o0Var) {
            synchronized (Y.this.f46642a) {
                try {
                    if (Y.this.i == a.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + Y.this.i);
                    }
                    C.S.a("CaptureSession", "onSessionFinished()");
                    Y.this.l();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public Y(x.b bVar, boolean z10) {
        this(bVar, new C0(Collections.EMPTY_LIST), z10);
    }

    public static C5667w j(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback c5667w;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1707p abstractC1707p = (AbstractC1707p) it.next();
            if (abstractC1707p == null) {
                c5667w = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                V.a(abstractC1707p, arrayList2);
                c5667w = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new C5667w(arrayList2);
            }
            arrayList.add(c5667w);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new C5667w(arrayList);
    }

    public static HashMap k(HashMap map, HashMap map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (H0.f fVar : (List) map.get(num)) {
                SurfaceUtil.a aVarA = SurfaceUtil.a((Surface) map2.get(fVar.f()));
                if (i == 0) {
                    i = aVarA.f15119a;
                }
                I0.e.l();
                int i10 = aVarA.f15120b;
                int i11 = aVarA.f15121c;
                String strD = fVar.d();
                Objects.requireNonNull(strD);
                arrayList.add(I0.d.c(i10, i11, strD));
            }
            if (i == 0 || arrayList.isEmpty()) {
                StringBuilder sbJ = C4356c.j(i, "Skips to create instances for multi-resolution output. imageFormat: ", ", streamInfos size: ");
                sbJ.append(arrayList.size());
                C.S.b("CaptureSession", sbJ.toString());
            } else {
                List list = null;
                try {
                    list = (List) G0.m.p().getMethod("createInstancesForMultiResolutionOutput", Collection.class, Integer.TYPE).invoke(null, arrayList, Integer.valueOf(i));
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                    C.S.b("CaptureSession", "Failed to create instances for multi-resolution output, " + e4.getMessage());
                }
                if (list != null) {
                    for (H0.f fVar2 : (List) map.get(num)) {
                        OutputConfiguration outputConfigurationB = G0.p.b(list.remove(0));
                        outputConfigurationB.addSurface((Surface) map2.get(fVar2.f()));
                        map3.put(fVar2, new x.f(outputConfigurationB));
                    }
                }
            }
        }
        return map3;
    }

    public static ArrayList n(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x.f fVar = (x.f) it.next();
            if (!arrayList2.contains(fVar.f47605a.a())) {
                arrayList2.add(fVar.f47605a.a());
                arrayList3.add(fVar);
            }
        }
        return arrayList3;
    }

    public static HashMap o(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            H0.f fVar = (H0.f) it.next();
            if (fVar.g() > 0 && fVar.e().isEmpty()) {
                List arrayList2 = (List) map.get(Integer.valueOf(fVar.g()));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Integer.valueOf(fVar.g()), arrayList2);
                }
                arrayList2.add(fVar);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    @Override // v.Z
    public final void a() {
        ArrayList<androidx.camera.core.impl.S> arrayList;
        synchronized (this.f46642a) {
            try {
                if (this.f46643b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f46643b);
                    this.f46643b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (androidx.camera.core.impl.S s10 : arrayList) {
                Iterator<AbstractC1707p> it = s10.f14944e.iterator();
                while (it.hasNext()) {
                    it.next().a(s10.a());
                }
            }
        }
    }

    @Override // v.Z
    public final A4.a b(H0 h02, CameraDevice cameraDevice, r0 r0Var) {
        synchronized (this.f46642a) {
            try {
                if (this.i.ordinal() != 1) {
                    C.S.b("CaptureSession", "Open not allowed in state: " + this.i);
                    return new m.a(new IllegalStateException("open() should not allow the state: " + this.i));
                }
                this.i = a.GET_SURFACE;
                ArrayList arrayList = new ArrayList(h02.b());
                this.f46649h = arrayList;
                this.f46645d = r0Var;
                I.d dVarA = I.d.a(r0Var.t(arrayList));
                A0 a02 = new A0(this, h02, cameraDevice);
                H.g gVar = this.f46645d.f46837d;
                dVarA.getClass();
                I.b bVarJ = I.j.j(dVarA, a02, gVar);
                I.j.a(bVarJ, new W(this), this.f46645d.f46837d);
                return I.j.f(bVarJ);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v.Z
    public final void c(HashMap map) {
        synchronized (this.f46642a) {
            this.f46652l = map;
        }
    }

    @Override // v.Z
    public final void close() {
        synchronized (this.f46642a) {
            try {
                int iOrdinal = this.i.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.i);
                }
                if (iOrdinal == 1) {
                    this.i = a.RELEASED;
                } else if (iOrdinal == 2) {
                    A2.l.p(this.f46645d, "The Opener shouldn't null in state:" + this.i);
                    this.f46645d.u();
                    this.i = a.RELEASED;
                } else if (iOrdinal == 3 || iOrdinal == 4) {
                    A2.l.p(this.f46645d, "The Opener shouldn't null in state:" + this.i);
                    this.f46645d.u();
                    this.i = a.CLOSED;
                    this.f46655o.c();
                    this.f46647f = null;
                }
            } finally {
            }
        }
    }

    @Override // v.Z
    public final List<androidx.camera.core.impl.S> d() {
        List<androidx.camera.core.impl.S> listUnmodifiableList;
        synchronized (this.f46642a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f46643b);
        }
        return listUnmodifiableList;
    }

    @Override // v.Z
    public final void e(List<androidx.camera.core.impl.S> list) {
        synchronized (this.f46642a) {
            try {
                switch (this.i) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.i);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f46643b.addAll(list);
                        break;
                    case OPENED:
                        this.f46643b.addAll(list);
                        this.f46655o.b().addListener(new o.b0(this, 4), E.u.y());
                        break;
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // v.Z
    public final H0 f() {
        H0 h02;
        synchronized (this.f46642a) {
            h02 = this.f46647f;
        }
        return h02;
    }

    @Override // v.Z
    public final void g(H0 h02) {
        synchronized (this.f46642a) {
            try {
                switch (this.i) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.i);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f46647f = h02;
                        break;
                    case OPENED:
                        this.f46647f = h02;
                        if (h02 != null) {
                            if (!this.f46648g.keySet().containsAll(h02.b())) {
                                C.S.b("CaptureSession", "Does not have the proper configured lists");
                                return;
                            } else {
                                C.S.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                                q(this.f46647f);
                                break;
                            }
                        } else {
                            return;
                        }
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // v.Z
    public final boolean h() {
        boolean z10;
        synchronized (this.f46642a) {
            try {
                a aVar = this.i;
                z10 = aVar == a.OPENED || aVar == a.OPENING;
            } finally {
            }
        }
        return z10;
    }

    public final void i() {
        synchronized (this.f46642a) {
            if (this.i != a.OPENED) {
                C.S.b("CaptureSession", "Unable to abort captures. Incorrect state:" + this.i);
            } else {
                try {
                    this.f46646e.n();
                } catch (CameraAccessException e4) {
                    C.S.c("CaptureSession", "Unable to abort captures.", e4);
                }
            }
        }
    }

    public final void l() {
        a aVar = this.i;
        a aVar2 = a.RELEASED;
        if (aVar == aVar2) {
            C.S.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.i = aVar2;
        this.f46646e = null;
        b.a<Void> aVar3 = this.f46651k;
        if (aVar3 != null) {
            aVar3.b(null);
            this.f46651k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x.f m(androidx.camera.core.impl.H0.f r6, java.util.HashMap r7, java.lang.String r8) {
        /*
            r5 = this;
            androidx.camera.core.impl.X r0 = r6.f()
            java.lang.Object r0 = r7.get(r0)
            android.view.Surface r0 = (android.view.Surface) r0
            java.lang.String r1 = "Surface in OutputConfig not found in configuredSurfaceMap."
            A2.l.p(r0, r1)
            x.f r2 = new x.f
            int r3 = r6.g()
            r2.<init>(r3, r0)
            x.k r0 = r2.f47605a
            if (r8 == 0) goto L20
            r0.g(r8)
            goto L27
        L20:
            java.lang.String r8 = r6.d()
            r0.g(r8)
        L27:
            int r8 = r6.c()
            r3 = 1
            if (r8 != 0) goto L32
            r0.h(r3)
            goto L3c
        L32:
            int r8 = r6.c()
            if (r8 != r3) goto L3c
            r8 = 2
            r0.h(r8)
        L3c:
            java.util.List r8 = r6.e()
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L6a
            r0.f()
            java.util.List r8 = r6.e()
            java.util.Iterator r8 = r8.iterator()
        L51:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r8.next()
            androidx.camera.core.impl.X r4 = (androidx.camera.core.impl.X) r4
            java.lang.Object r4 = r7.get(r4)
            android.view.Surface r4 = (android.view.Surface) r4
            A2.l.p(r4, r1)
            r0.c(r4)
            goto L51
        L6a:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 33
            if (r7 < r8) goto La9
            x.b r1 = r5.f46656p
            r1.getClass()
            if (r7 < r8) goto L78
            goto L79
        L78:
            r3 = 0
        L79:
            java.lang.String r7 = "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher."
            A2.l.q(r7, r3)
            x.b$a r7 = r1.f47599a
            android.hardware.camera2.params.DynamicRangeProfiles r7 = r7.b()
            if (r7 == 0) goto La9
            C.C r6 = r6.b()
            java.lang.Long r7 = x.C5753a.a(r6, r7)
            if (r7 != 0) goto La4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CaptureSession"
            C.S.b(r7, r6)
            goto La9
        La4:
            long r6 = r7.longValue()
            goto Lab
        La9:
            r6 = 1
        Lab:
            r0.d(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v.Y.m(androidx.camera.core.impl.H0$f, java.util.HashMap, java.lang.String):x.f");
    }

    public final int p(ArrayList arrayList) {
        L l5;
        ArrayList arrayList2;
        boolean z10;
        androidx.camera.core.impl.A a10;
        synchronized (this.f46642a) {
            try {
                if (this.i != a.OPENED) {
                    C.S.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (arrayList.isEmpty()) {
                    return -1;
                }
                try {
                    l5 = new L();
                    arrayList2 = new ArrayList();
                    C.S.a("CaptureSession", "Issuing capture request.");
                    Iterator it = arrayList.iterator();
                    z10 = false;
                    while (it.hasNext()) {
                        androidx.camera.core.impl.S s10 = (androidx.camera.core.impl.S) it.next();
                        if (Collections.unmodifiableList(s10.f14940a).isEmpty()) {
                            C.S.a("CaptureSession", "Skipping issuing empty capture request.");
                        } else {
                            Iterator it2 = Collections.unmodifiableList(s10.f14940a).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    androidx.camera.core.impl.X x10 = (androidx.camera.core.impl.X) it2.next();
                                    if (!this.f46648g.containsKey(x10)) {
                                        C.S.a("CaptureSession", "Skipping capture request with invalid surface: " + x10);
                                        break;
                                    }
                                } else {
                                    if (s10.f14942c == 2) {
                                        z10 = true;
                                    }
                                    S.a aVar = new S.a(s10);
                                    if (s10.f14942c == 5 && (a10 = s10.f14947h) != null) {
                                        aVar.f14955h = a10;
                                    }
                                    H0 h02 = this.f46647f;
                                    if (h02 != null) {
                                        aVar.c(h02.f14884g.f14941b);
                                    }
                                    aVar.c(s10.f14941b);
                                    CaptureRequest captureRequestC = C5644E.c(aVar.d(), this.f46646e.p(), this.f46648g, false, this.f46657q);
                                    if (captureRequestC == null) {
                                        C.S.a("CaptureSession", "Skipping issuing request without surface.");
                                        return -1;
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator<AbstractC1707p> it3 = s10.f14944e.iterator();
                                    while (it3.hasNext()) {
                                        V.a(it3.next(), arrayList3);
                                    }
                                    l5.a(captureRequestC, arrayList3);
                                    arrayList2.add(captureRequestC);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e4) {
                    C.S.b("CaptureSession", "Unable to access camera: " + e4.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList2.isEmpty()) {
                    C.S.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return -1;
                }
                if (this.f46653m.a(arrayList2, z10)) {
                    this.f46646e.v();
                    l5.f46632b = new B.d(this, 27);
                }
                if (this.f46654n.b(arrayList2, z10)) {
                    l5.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new X(this)));
                }
                return this.f46646e.w(arrayList2, l5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int q(H0 h02) {
        synchronized (this.f46642a) {
            try {
                if (h02 == null) {
                    C.S.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                    return -1;
                }
                if (this.i != a.OPENED) {
                    C.S.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                    return -1;
                }
                androidx.camera.core.impl.S s10 = h02.f14884g;
                if (Collections.unmodifiableList(s10.f14940a).isEmpty()) {
                    C.S.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        this.f46646e.v();
                    } catch (CameraAccessException e4) {
                        C.S.b("CaptureSession", "Unable to access camera: " + e4.getMessage());
                        Thread.dumpStack();
                    }
                } else {
                    try {
                        C.S.a("CaptureSession", "Issuing request for session.");
                        CaptureRequest captureRequestC = C5644E.c(s10, this.f46646e.p(), this.f46648g, true, this.f46657q);
                        if (captureRequestC == null) {
                            C.S.a("CaptureSession", "Skipping issuing empty request for session.");
                            return -1;
                        }
                        return this.f46646e.z(captureRequestC, this.f46655o.a(j(s10.f14944e, new CameraCaptureSession.CaptureCallback[0])));
                    } catch (CameraAccessException e10) {
                        C.S.b("CaptureSession", "Unable to access camera: " + e10.getMessage());
                        Thread.dumpStack();
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        synchronized (this.f46642a) {
            if (this.i != a.OPENED) {
                C.S.b("CaptureSession", "Unable to stop repeating. Incorrect state:" + this.i);
            } else {
                try {
                    this.f46646e.v();
                } catch (CameraAccessException e4) {
                    C.S.c("CaptureSession", "Unable to stop repeating.", e4);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0009, B:5:0x000f, B:23:0x0076, B:7:0x0013, B:9:0x0017, B:12:0x001d, B:14:0x0041, B:15:0x0045, B:17:0x0049, B:18:0x0056, B:19:0x0058, B:21:0x005a, B:22:0x0072, B:26:0x007a, B:27:0x008d), top: B:30:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0009, B:5:0x000f, B:23:0x0076, B:7:0x0013, B:9:0x0017, B:12:0x001d, B:14:0x0041, B:15:0x0045, B:17:0x0049, B:18:0x0056, B:19:0x0058, B:21:0x005a, B:22:0x0072, B:26:0x007a, B:27:0x008d), top: B:30:0x0009 }] */
    @Override // v.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final A4.a release() {
        /*
            r5 = this;
            java.lang.String r0 = "release() should not be possible in state: "
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.Object r3 = r5.f46642a
            monitor-enter(r3)
            v.Y$a r4 = r5.i     // Catch: java.lang.Throwable -> L1b
            int r4 = r4.ordinal()     // Catch: java.lang.Throwable -> L1b
            switch(r4) {
                case 0: goto L7a;
                case 1: goto L72;
                case 2: goto L5a;
                case 3: goto L1d;
                case 4: goto L13;
                case 5: goto L13;
                case 6: goto L45;
                default: goto L12;
            }     // Catch: java.lang.Throwable -> L1b
        L12:
            goto L76
        L13:
            v.r0 r0 = r5.f46646e     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            r0.close()     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r0 = move-exception
            goto L8e
        L1d:
            v.Y$a r0 = v.Y.a.RELEASING     // Catch: java.lang.Throwable -> L1b
            r5.i = r0     // Catch: java.lang.Throwable -> L1b
            z.k r0 = r5.f46655o     // Catch: java.lang.Throwable -> L1b
            r0.c()     // Catch: java.lang.Throwable -> L1b
            v.r0 r0 = r5.f46645d     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            v.Y$a r2 = r5.i     // Catch: java.lang.Throwable -> L1b
            r1.append(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1b
            A2.l.p(r0, r1)     // Catch: java.lang.Throwable -> L1b
            v.r0 r0 = r5.f46645d     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.u()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L45
            r5.l()     // Catch: java.lang.Throwable -> L1b
            goto L76
        L45:
            o0.b$d r0 = r5.f46650j     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L56
            B.f r0 = new B.f     // Catch: java.lang.Throwable -> L1b
            r1 = 24
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L1b
            o0.b$d r0 = o0.b.a(r0)     // Catch: java.lang.Throwable -> L1b
            r5.f46650j = r0     // Catch: java.lang.Throwable -> L1b
        L56:
            o0.b$d r0 = r5.f46650j     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            return r0
        L5a:
            v.r0 r0 = r5.f46645d     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            v.Y$a r1 = r5.i     // Catch: java.lang.Throwable -> L1b
            r2.append(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            A2.l.p(r0, r1)     // Catch: java.lang.Throwable -> L1b
            v.r0 r0 = r5.f46645d     // Catch: java.lang.Throwable -> L1b
            r0.u()     // Catch: java.lang.Throwable -> L1b
        L72:
            v.Y$a r0 = v.Y.a.RELEASED     // Catch: java.lang.Throwable -> L1b
            r5.i = r0     // Catch: java.lang.Throwable -> L1b
        L76:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            I.m$c r0 = I.m.c.f2366c
            return r0
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            v.Y$a r0 = r5.i     // Catch: java.lang.Throwable -> L1b
            r2.append(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1     // Catch: java.lang.Throwable -> L1b
        L8e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v.Y.release():A4.a");
    }

    public Y(x.b bVar, C0 c02, boolean z10) {
        this.f46642a = new Object();
        this.f46643b = new ArrayList();
        this.f46648g = new HashMap();
        this.f46649h = Collections.EMPTY_LIST;
        this.i = a.UNINITIALIZED;
        this.f46652l = new HashMap();
        this.f46653m = new C5843m();
        this.f46654n = new C5846p();
        this.i = a.INITIALIZED;
        this.f46656p = bVar;
        this.f46644c = new b();
        this.f46655o = new C5841k(c02.d(CaptureNoResponseQuirk.class));
        this.f46657q = new C5845o(c02);
        this.f46658r = z10;
    }
}
