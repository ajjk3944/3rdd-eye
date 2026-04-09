package A;

import T.AbstractC3528f1;
import T.InterfaceC3545n0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3545n0 f203a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3545n0 f204b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f205c;

    /* renamed from: d, reason: collision with root package name */
    private Object f206d;

    /* renamed from: e, reason: collision with root package name */
    private final B.B f207e;

    public z(int i10, int i11) {
        this.f203a = AbstractC3528f1.a(i10);
        this.f204b = AbstractC3528f1.a(i11);
        this.f207e = new B.B(i10, 30, 100);
    }

    private final void f(int i10) {
        this.f204b.l(i10);
    }

    private final void g(int i10, int i11) {
        if (i10 >= 0.0f) {
            e(i10);
            this.f207e.j(i10);
            f(i11);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
        }
    }

    public final int a() {
        return this.f203a.e();
    }

    public final B.B b() {
        return this.f207e;
    }

    public final int c() {
        return this.f204b.e();
    }

    public final void d(int i10, int i11) {
        g(i10, i11);
        this.f206d = null;
    }

    public final void e(int i10) {
        this.f203a.l(i10);
    }

    public final void h(s sVar) {
        t tVarT = sVar.t();
        this.f206d = tVarT != null ? tVarT.getKey() : null;
        if (this.f205c || sVar.h() > 0) {
            this.f205c = true;
            int iU = sVar.u();
            if (iU >= 0.0f) {
                t tVarT2 = sVar.t();
                g(tVarT2 != null ? tVarT2.getIndex() : 0, iU);
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + iU + ')').toString());
            }
        }
    }

    public final void i(int i10) {
        if (i10 >= 0.0f) {
            f(i10);
            return;
        }
        throw new IllegalStateException(("scrollOffset should be non-negative (" + i10 + ')').toString());
    }

    public final int j(m mVar, int i10) {
        int iA = B.u.a(mVar, this.f206d, i10);
        if (i10 != iA) {
            e(iA);
            this.f207e.j(i10);
        }
        return iA;
    }
}
