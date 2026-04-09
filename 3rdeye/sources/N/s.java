package N;

import C.C0624k;
import C.i0;
import C.k0;
import N7.G8;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.X;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import o0.b;

/* compiled from: SurfaceEdge.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f4432a;

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f4433b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4434c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4435d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4436e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4437f;

    /* renamed from: g, reason: collision with root package name */
    public final L0 f4438g;

    /* renamed from: h, reason: collision with root package name */
    public int f4439h;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public k0 f4441k;

    /* renamed from: l, reason: collision with root package name */
    public a f4442l;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4440j = false;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f4443m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public boolean f4444n = false;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f4445o = new ArrayList();

    /* compiled from: SurfaceEdge.java */
    public static class a extends X {

        /* renamed from: o, reason: collision with root package name */
        public final b.d f4446o;

        /* renamed from: p, reason: collision with root package name */
        public b.a<Surface> f4447p;

        /* renamed from: q, reason: collision with root package name */
        public X f4448q;

        /* renamed from: r, reason: collision with root package name */
        public t f4449r;

        public a(Size size, int i) {
            super(size, i);
            this.f4446o = o0.b.a(new M8.a(this, 1));
        }

        @Override // androidx.camera.core.impl.X
        public final void a() {
            super.a();
            G.n.c(new B.b(this, 6));
        }

        @Override // androidx.camera.core.impl.X
        public final A4.a<Surface> f() {
            return this.f4446o;
        }

        public final boolean g(X x10, Runnable runnable) throws X.a {
            boolean z10;
            G.n.a();
            x10.getClass();
            X x11 = this.f4448q;
            if (x11 == x10) {
                return false;
            }
            A2.l.q("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", x11 == null);
            Size size = this.f14994h;
            Size size2 = x10.f14994h;
            A2.l.k("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
            int i = x10.i;
            int i10 = this.i;
            A2.l.k(G8.r("The provider's format(", i10, ") must match the parent(", i, ")"), i10 == i);
            synchronized (this.f14987a) {
                z10 = this.f14989c;
            }
            A2.l.q("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z10);
            this.f4448q = x10;
            I.j.g(x10.c(), this.f4447p);
            x10.d();
            I.j.f(this.f14991e).addListener(new C2.h(x10, 6), E.u.y());
            I.j.f(x10.f14993g).addListener(runnable, E.u.H());
            return true;
        }
    }

    public s(int i, int i10, L0 l02, Matrix matrix, boolean z10, Rect rect, int i11, int i12, boolean z11) {
        this.f4437f = i;
        this.f4432a = i10;
        this.f4438g = l02;
        this.f4433b = matrix;
        this.f4434c = z10;
        this.f4435d = rect;
        this.i = i11;
        this.f4439h = i12;
        this.f4436e = z11;
        this.f4442l = new a(l02.d(), i10);
    }

    public final void a(Runnable runnable) {
        G.n.a();
        b();
        this.f4443m.add(runnable);
    }

    public final void b() {
        A2.l.q("Edge is already closed.", !this.f4444n);
    }

    public final void c() {
        G.n.a();
        this.f4442l.a();
        this.f4444n = true;
    }

    public final k0 d(J j4, boolean z10) {
        G.n.a();
        b();
        L0 l02 = this.f4438g;
        k0 k0Var = new k0(l02.d(), j4, z10, l02.a(), l02.b(), new o(this, 0));
        try {
            i0 i0Var = k0Var.f741l;
            a aVar = this.f4442l;
            Objects.requireNonNull(aVar);
            if (aVar.g(i0Var, new p(aVar, 0))) {
                I.j.f(aVar.f14991e).addListener(new B.b(i0Var, 5), E.u.y());
            }
            this.f4441k = k0Var;
            f();
            return k0Var;
        } catch (X.a e4) {
            throw new AssertionError("Surface is somehow already closed", e4);
        } catch (RuntimeException e10) {
            k0Var.d();
            throw e10;
        }
    }

    public final void e() {
        boolean z10;
        G.n.a();
        b();
        a aVar = this.f4442l;
        aVar.getClass();
        G.n.a();
        if (aVar.f4448q == null) {
            synchronized (aVar.f14987a) {
                z10 = aVar.f14989c;
            }
            if (!z10) {
                return;
            }
        }
        this.f4440j = false;
        this.f4442l.a();
        this.f4442l = new a(this.f4438g.d(), this.f4432a);
        Iterator it = this.f4443m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void f() {
        k0.e eVar;
        Executor executor;
        G.n.a();
        C0624k c0624k = new C0624k(this.f4435d, this.i, this.f4439h, this.f4434c, this.f4433b, this.f4436e);
        k0 k0Var = this.f4441k;
        if (k0Var != null) {
            synchronized (k0Var.f731a) {
                k0Var.f742m = c0624k;
                eVar = k0Var.f743n;
                executor = k0Var.f744o;
            }
            if (eVar != null && executor != null) {
                executor.execute(new B.a(2, eVar, c0624k));
            }
        }
        Iterator it = this.f4445o.iterator();
        while (it.hasNext()) {
            ((K0.b) it.next()).accept(c0624k);
        }
    }
}
