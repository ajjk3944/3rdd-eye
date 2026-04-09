package g2;

import android.os.Build;
import android.view.View;
import e4.c2;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p extends androidx.datastore.preferences.protobuf.j implements Runnable, e4.s, View.OnAttachStateChangeListener {

    /* renamed from: c, reason: collision with root package name */
    public boolean f24393c;

    /* renamed from: d, reason: collision with root package name */
    public int f24394d;

    /* renamed from: e, reason: collision with root package name */
    public c2 f24395e;

    /* renamed from: f, reason: collision with root package name */
    public final x.e0 f24396f;
    public final u0.a1 g;

    /* renamed from: h, reason: collision with root package name */
    public final x.a0 f24397h;

    /* renamed from: i, reason: collision with root package name */
    public final g1.q f24398i;

    public p() {
        super(1);
        x.e0 e0Var = new x.e0(9);
        i1.f24359a.getClass();
        e0Var.m(h1.f24351b, new l1("caption bar"));
        e0Var.m(h1.f24352c, new l1("display cutout"));
        e0Var.m(h1.f24353d, new l1("ime"));
        e0Var.m(h1.f24354e, new l1("mandatory system gestures"));
        e0Var.m(h1.f24355f, new l1("navigation bars"));
        e0Var.m(h1.g, new l1("status bars"));
        e0Var.m(h1.f24356h, new l1("system gestures"));
        e0Var.m(h1.f24357i, new l1("tappable element"));
        e0Var.m(h1.j, new l1("waterfall"));
        this.f24396f = e0Var;
        this.g = new u0.a1(0);
        this.f24397h = new x.a0(4);
        this.f24398i = new g1.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(e4.c2 r28) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.p.H(e4.c2):void");
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void d(e4.l1 l1Var) {
        boolean z3 = false;
        this.f24393c = false;
        int iD = l1Var.f22371a.d();
        this.f24394d &= ~iD;
        this.f24395e = null;
        i1 i1Var = (i1) k1.f24368a.b(iD);
        if (i1Var != null) {
            Object objG = this.f24396f.g(i1Var);
            nk.k.b(objG);
            l1 l1Var2 = (l1) objG;
            l1Var2.f24372c.g(0.0f);
            l1Var2.f24374e.g(1.0f);
            l1Var2.f24373d.g(0L);
            l1Var2.f24372c.g(0.0f);
            l1Var2.f24371b.setValue(Boolean.FALSE);
            l1Var2.j = -1L;
            l1Var2.f24378k = -1L;
            u0.a1 a1Var = this.g;
            a1Var.h(a1Var.g() + 1);
            synchronized (g1.m.f24260c) {
                x.f0 f0Var = g1.m.j.f24210h;
                if (f0Var != null) {
                    if (f0Var.h()) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                g1.m.a();
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void e(e4.l1 l1Var) {
        this.f24393c = true;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final c2 f(c2 c2Var, List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            e4.l1 l1Var = (e4.l1) list.get(i4);
            i1 i1Var = (i1) k1.f24368a.b(l1Var.f22371a.d());
            if (i1Var != null) {
                Object objG = this.f24396f.g(i1Var);
                nk.k.b(objG);
                l1 l1Var2 = (l1) objG;
                if (((Boolean) l1Var2.f24371b.getValue()).booleanValue()) {
                    e4.k1 k1Var = l1Var.f22371a;
                    l1Var2.f24372c.g(k1Var.c());
                    l1Var2.f24374e.g(k1Var.a());
                    l1Var2.f24373d.g(k1Var.b());
                }
            }
        }
        H(c2Var);
        return c2Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final yb.i g(e4.l1 l1Var, yb.i iVar) {
        c2 c2Var = this.f24395e;
        boolean z3 = false;
        this.f24393c = false;
        this.f24395e = null;
        if (l1Var.f22371a.b() > 0 && c2Var != null) {
            int iD = l1Var.f22371a.d();
            this.f24394d |= iD;
            i1 i1Var = (i1) k1.f24368a.b(iD);
            if (i1Var != null) {
                Object objG = this.f24396f.g(i1Var);
                nk.k.b(objG);
                l1 l1Var2 = (l1) objG;
                v3.b bVarG = c2Var.f22315a.g(iD);
                long j = (bVarG.f35793a << 48) | (bVarG.f35794b << 32) | (bVarG.f35795c << 16) | bVarG.f35796d;
                long j8 = l1Var2.f24376h;
                if (!n0.e(j, j8)) {
                    l1Var2.j = j8;
                    l1Var2.f24378k = j;
                    l1Var2.f24371b.setValue(Boolean.TRUE);
                    e4.k1 k1Var = l1Var.f22371a;
                    l1Var2.f24372c.g(k1Var.c());
                    l1Var2.f24374e.g(k1Var.a());
                    l1Var2.f24373d.g(k1Var.b());
                    u0.a1 a1Var = this.g;
                    a1Var.h(a1Var.g() + 1);
                    synchronized (g1.m.f24260c) {
                        x.f0 f0Var = g1.m.j.f24210h;
                        if (f0Var != null) {
                            if (f0Var.h()) {
                                z3 = true;
                            }
                        }
                    }
                    if (z3) {
                        g1.m.a();
                        return iVar;
                    }
                }
            }
        }
        return iVar;
    }

    @Override // e4.s
    public final c2 j(View view, c2 c2Var) {
        if (this.f24393c) {
            this.f24395e = c2Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return c2Var;
            }
        } else if (this.f24394d == 0) {
            H(c2Var);
        }
        return c2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = e4.v0.f22405a;
        e4.m0.j(view, this);
        e4.v0.r(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = e4.v0.f22405a;
        e4.m0.j(view, null);
        e4.v0.r(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f24393c) {
            this.f24394d = 0;
            this.f24393c = false;
            c2 c2Var = this.f24395e;
            if (c2Var != null) {
                H(c2Var);
                this.f24395e = null;
            }
        }
    }
}
