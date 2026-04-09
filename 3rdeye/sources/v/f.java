package V;

import C.C0632t;
import C.C0638z;
import C.InterfaceC0630q;
import C.InterfaceC0631s;
import C.m0;
import D.a;
import G.n;
import android.content.Context;
import android.os.Trace;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.C1682c0;
import androidx.camera.core.impl.C1691h;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.U0;
import androidx.lifecycle.InterfaceC1790x;
import b9.C1992A;
import c9.C2091l;
import c9.C2092m;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import o0.b;

/* compiled from: ProcessCameraProvider.kt */
/* loaded from: classes.dex */
public final class f implements InterfaceC0631s {

    /* renamed from: g, reason: collision with root package name */
    public static final f f12823g = new f();

    /* renamed from: b, reason: collision with root package name */
    public b.d f12825b;

    /* renamed from: d, reason: collision with root package name */
    public C0638z f12827d;

    /* renamed from: e, reason: collision with root package name */
    public Context f12828e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f12824a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final c f12826c = new c();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f12829f = new HashMap();

    public static final B a(f fVar, C0632t c0632t, I i) {
        fVar.getClass();
        Iterator<InterfaceC0630q> it = c0632t.f770a.iterator();
        while (it.hasNext()) {
            InterfaceC0630q next = it.next();
            l.e(next, "cameraSelector.cameraFilterSet");
            InterfaceC0630q interfaceC0630q = next;
            if (!l.b(interfaceC0630q.getIdentifier(), InterfaceC0630q.f767a)) {
                C1691h identifier = interfaceC0630q.getIdentifier();
                synchronized (C1682c0.f15008a) {
                }
                l.c(fVar.f12828e);
            }
        }
        return D.f14872a;
    }

    public static final void b(f fVar, int i) {
        C0638z c0638z = fVar.f12827d;
        if (c0638z == null) {
            return;
        }
        H h10 = c0638z.f793f;
        if (h10 == null) {
            throw new IllegalStateException("CameraX not initialized yet.");
        }
        A.a aVarD = h10.d();
        if (i != aVarD.f4e) {
            Iterator it = aVarD.f0a.iterator();
            while (it.hasNext()) {
                ((a.InterfaceC0008a) it.next()).a(aVarD.f4e, i);
            }
        }
        if (aVarD.f4e == 2 && i != 2) {
            aVarD.f2c.clear();
        }
        aVarD.f4e = i;
    }

    public final void c(InterfaceC1790x lifecycleOwner, C0632t c0632t, m0... m0VarArr) {
        int i;
        l.f(lifecycleOwner, "lifecycleOwner");
        Trace.beginSection(J1.a.d("CX:bindToLifecycle"));
        try {
            C0638z c0638z = this.f12827d;
            if (c0638z == null) {
                i = 0;
            } else {
                H h10 = c0638z.f793f;
                if (h10 == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                i = h10.d().f4e;
            }
            if (i == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            b(this, 1);
            d(lifecycleOwner, c0632t, (m0[]) Arrays.copyOf(m0VarArr, m0VarArr.length));
        } finally {
            Trace.endSection();
        }
    }

    public final b d(InterfaceC1790x lifecycleOwner, C0632t c0632t, m0... useCases) {
        b bVarB;
        l.f(lifecycleOwner, "lifecycleOwner");
        l.f(useCases, "useCases");
        Trace.beginSection(J1.a.d("CX:bindToLifecycle-internal"));
        try {
            n.a();
            C0638z c0638z = this.f12827d;
            l.c(c0638z);
            J jC = c0632t.c(c0638z.f788a.a());
            l.e(jC, "primaryCameraSelector.se…cameraRepository.cameras)");
            jC.m(true);
            F0 f0E = e(c0632t);
            c cVar = this.f12826c;
            J.a aVarW = J.e.w(f0E, null);
            synchronized (cVar.f12812a) {
                bVarB = (b) cVar.f12813b.get(new a(lifecycleOwner, aVarW));
            }
            Collection<b> collectionD = this.f12826c.d();
            Iterator it = C2091l.l(useCases).iterator();
            while (it.hasNext()) {
                m0 m0Var = (m0) it.next();
                for (b lifecycleCameras : collectionD) {
                    l.e(lifecycleCameras, "lifecycleCameras");
                    b bVar = lifecycleCameras;
                    if (bVar.q(m0Var) && !bVar.equals(bVarB)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{m0Var}, 1)));
                    }
                }
            }
            if (bVarB == null) {
                c cVar2 = this.f12826c;
                C0638z c0638z2 = this.f12827d;
                l.c(c0638z2);
                H h10 = c0638z2.f793f;
                if (h10 == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                A.a aVarD = h10.d();
                C0638z c0638z3 = this.f12827d;
                l.c(c0638z3);
                G g10 = c0638z3.f794g;
                if (g10 == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                C0638z c0638z4 = this.f12827d;
                l.c(c0638z4);
                U0 u02 = c0638z4.f795h;
                if (u02 == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                bVarB = cVar2.b(lifecycleOwner, new J.e(jC, null, f0E, null, aVarD, g10, u02));
            }
            if (useCases.length != 0) {
                c cVar3 = this.f12826c;
                List listW = C2092m.W(Arrays.copyOf(useCases, useCases.length));
                C0638z c0638z5 = this.f12827d;
                l.c(c0638z5);
                H h11 = c0638z5.f793f;
                if (h11 == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                cVar3.a(bVarB, listW, h11.d());
            }
            return bVarB;
        } finally {
            Trace.endSection();
        }
    }

    public final F0 e(C0632t cameraSelector) {
        Object f02;
        l.f(cameraSelector, "cameraSelector");
        Trace.beginSection(J1.a.d("CX:getCameraInfo"));
        try {
            C0638z c0638z = this.f12827d;
            l.c(c0638z);
            I iN = cameraSelector.c(c0638z.f788a.a()).n();
            l.e(iN, "cameraSelector.select(mC…meras).cameraInfoInternal");
            B bA = a(this, cameraSelector, iN);
            J.a aVar = new J.a(iN.d(), ((D.a) bA).f14873G);
            synchronized (this.f12824a) {
                try {
                    f02 = this.f12829f.get(aVar);
                    if (f02 == null) {
                        f02 = new F0(iN, bA);
                        this.f12829f.put(aVar, f02);
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (F0) f02;
        } finally {
            Trace.endSection();
        }
    }

    public final void f() {
        Trace.beginSection(J1.a.d("CX:unbindAll"));
        try {
            n.a();
            b(this, 0);
            this.f12826c.j();
            C1992A c1992a = C1992A.f18074a;
        } finally {
            Trace.endSection();
        }
    }
}
