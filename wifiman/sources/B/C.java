package B;

import B.E;
import C0.L;
import T.AbstractC3528f1;
import T.InterfaceC3545n0;
import T.InterfaceC3551q0;
import T.t1;
import androidx.compose.runtime.snapshots.g;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class C implements C0.L, L.a, E.a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f868a;

    /* renamed from: b, reason: collision with root package name */
    private final E f869b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3545n0 f870c = AbstractC3528f1.a(-1);

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3545n0 f871d = AbstractC3528f1.a(0);

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3551q0 f872e = t1.d(null, null, 2, null);

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3551q0 f873f = t1.d(null, null, 2, null);

    public C(Object obj, E e10) {
        this.f868a = obj;
        this.f869b = e10;
    }

    private final L.a b() {
        return (L.a) this.f872e.getValue();
    }

    private final int d() {
        return this.f871d.e();
    }

    private final C0.L e() {
        return (C0.L) this.f873f.getValue();
    }

    private final void h(L.a aVar) {
        this.f872e.setValue(aVar);
    }

    private final void j(int i10) {
        this.f871d.l(i10);
    }

    private final void k(C0.L l10) {
        this.f873f.setValue(l10);
    }

    @Override // C0.L
    public L.a a() {
        if (d() == 0) {
            this.f869b.j(this);
            C0.L lC = c();
            h(lC != null ? lC.a() : null);
        }
        j(d() + 1);
        return this;
    }

    public final C0.L c() {
        return e();
    }

    public final void f() {
        int iD = d();
        for (int i10 = 0; i10 < iD; i10++) {
            release();
        }
    }

    public void g(int i10) {
        this.f870c.l(i10);
    }

    @Override // B.E.a
    public int getIndex() {
        return this.f870c.e();
    }

    @Override // B.E.a
    public Object getKey() {
        return this.f868a;
    }

    public final void i(C0.L l10) {
        g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
        androidx.compose.runtime.snapshots.g gVarD = aVar.d();
        InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
        try {
            if (l10 != e()) {
                k(l10);
                if (d() > 0) {
                    L.a aVarB = b();
                    if (aVarB != null) {
                        aVarB.release();
                    }
                    h(l10 != null ? l10.a() : null);
                }
            }
            Yg.J j10 = Yg.J.f24997a;
            aVar.m(gVarD, gVarF, interfaceC6835lH);
        } catch (Throwable th2) {
            aVar.m(gVarD, gVarF, interfaceC6835lH);
            throw th2;
        }
    }

    @Override // C0.L.a
    public void release() {
        if (d() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        j(d() - 1);
        if (d() == 0) {
            this.f869b.k(this);
            L.a aVarB = b();
            if (aVarB != null) {
                aVarB.release();
            }
            h(null);
        }
    }
}
