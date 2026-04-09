package E;

import C.J;
import C.K;
import C.RunnableC0615b;
import C.V;
import C.g0;
import C.i0;
import D9.G;
import H6.I;
import android.util.Log;
import androidx.camera.core.b;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1692h0;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.T;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o0.b;

/* compiled from: TakePictureManager.java */
/* loaded from: classes.dex */
public final class D implements b.a {

    /* renamed from: b, reason: collision with root package name */
    public final J.a f1289b;

    /* renamed from: c, reason: collision with root package name */
    public r f1290c;

    /* renamed from: d, reason: collision with root package name */
    public B f1291d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1292e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f1288a = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1293f = false;

    /* compiled from: TakePictureManager.java */
    public static abstract class a {
        public abstract K a();

        public abstract int b();
    }

    public D(J.a aVar) {
        G.n.a();
        this.f1289b = aVar;
        this.f1292e = new ArrayList();
    }

    public final void a() {
        G.n.a();
        K k10 = new K("Camera is closed.", null);
        ArrayDeque arrayDeque = this.f1288a;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            E e4 = (E) it.next();
            e4.a().execute(new g0(e4, k10));
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.f1292e).iterator();
        while (it2.hasNext()) {
            B b10 = (B) it2.next();
            b10.getClass();
            G.n.a();
            if (!b10.f1281d.f44804c.isDone()) {
                G.n.a();
                b10.f1284g = true;
                I.b bVar = b10.i;
                Objects.requireNonNull(bVar);
                bVar.cancel(true);
                b10.f1282e.d(k10);
                b10.f1283f.b(null);
                G.n.a();
                E e10 = b10.f1278a;
                e10.a().execute(new g0(e10, k10));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [int] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void b() {
        ?? r16;
        int i = 2;
        boolean z10 = false;
        G.n.a();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (this.f1291d != null) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.f1293f) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        r rVar = this.f1290c;
        rVar.getClass();
        G.n.a();
        if (rVar.f1339c.a() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        E e4 = (E) this.f1288a.poll();
        if (e4 == null) {
            Log.d("TakePictureManager", "No new request.");
            return;
        }
        B b10 = new B(e4, this);
        A2.l.q(null, !(this.f1291d != null));
        this.f1291d = b10;
        G.n.a();
        b10.f1280c.f44804c.addListener(new C2.h(this, i), u.y());
        this.f1292e.add(b10);
        G.n.a();
        b10.f1281d.f44804c.addListener(new RunnableC0615b(i, this, b10), u.y());
        r rVar2 = this.f1290c;
        G.n.a();
        b.d dVar = b10.f1280c;
        rVar2.getClass();
        G.n.a();
        Q q10 = (Q) rVar2.f1337a.o(C1692h0.f15044J, new C.B(Arrays.asList(new T.a())));
        Objects.requireNonNull(q10);
        int i10 = r.f1336f;
        r.f1336f = i10 + 1;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(q10.hashCode());
        List<T> listA = q10.a();
        Objects.requireNonNull(listA);
        for (T t10 : listA) {
            S.a aVar = new S.a();
            S s10 = rVar2.f1338b;
            aVar.f14950c = s10.f14942c;
            aVar.c(s10.f14941b);
            aVar.a(e4.j());
            C0654b c0654b = rVar2.f1341e;
            i0 i0Var = c0654b.f1333b;
            Objects.requireNonNull(i0Var);
            aVar.f14948a.add(i0Var);
            aVar.f14951d = c0654b.f1334c != null ? true : z10;
            if (M.b.b(c0654b.f1298e)) {
                if (((ImageCaptureRotationOptionQuirk) K.b.f2936a.e(ImageCaptureRotationOptionQuirk.class)) != null) {
                    C1683d c1683d = S.i;
                    r16 = z10;
                } else {
                    r16 = z10;
                    aVar.f14949b.N(S.i, Integer.valueOf(e4.h()));
                }
                aVar.f14949b.N(S.f14938j, Integer.valueOf(((e4.f() != null ? true : r16 == true ? 1 : 0) && G.o.b(e4.c(), c0654b.f1297d)) ? e4.b() == 0 ? 100 : 95 : e4.e()));
            } else {
                r16 = z10;
            }
            aVar.c(t10.a().f14941b);
            aVar.f14954g.f14935a.put(strValueOf, Integer.valueOf((int) r16));
            aVar.f14954g.f14935a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i10));
            aVar.b(c0654b.f1332a);
            arrayList.add(aVar.d());
            z10 = r16;
        }
        boolean z11 = z10;
        G g10 = new G(arrayList, b10);
        A a10 = new A(q10, e4.g(), e4.c(), e4.h(), e4.e(), e4.i(), b10, dVar, i10);
        r rVar3 = this.f1290c;
        rVar3.getClass();
        G.n.a();
        rVar3.f1341e.f1303k.accept(a10);
        G.n.a();
        J j4 = J.this;
        synchronized (j4.f638q) {
            try {
                if (j4.f638q.get() == null) {
                    j4.f638q.set(Integer.valueOf(j4.E()));
                }
            } finally {
            }
        }
        J j10 = J.this;
        j10.getClass();
        G.n.a();
        boolean z12 = z11;
        I.b bVarJ = I.j.j(j10.c().g(arrayList, j10.f637p, j10.f639r), new I(new C.I(z12 ? 1 : 0), 2), u.y());
        I.j.a(bVarJ, new C(this, g10), u.H());
        G.n.a();
        if (b10.i == null) {
            z12 = true;
        }
        A2.l.q("CaptureRequestFuture can only be set once.", z12);
        b10.i = bVarJ;
    }

    @Override // androidx.camera.core.b.a
    public final void c(androidx.camera.core.b bVar) {
        u.H().execute(new V(this, 1));
    }
}
