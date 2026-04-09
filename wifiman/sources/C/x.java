package C;

import T.AbstractC3528f1;
import T.C0;
import T.InterfaceC3543m0;
import T.InterfaceC3545n0;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final C f2112a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3545n0 f2113b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3543m0 f2114c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2115d;

    /* renamed from: e, reason: collision with root package name */
    private Object f2116e;

    /* renamed from: f, reason: collision with root package name */
    private final B.B f2117f;

    public x(int i10, float f10, C c10) {
        this.f2112a = c10;
        this.f2113b = AbstractC3528f1.a(i10);
        this.f2114c = C0.a(f10);
        this.f2117f = new B.B(i10, 30, 100);
    }

    private final void g(int i10) {
        this.f2113b.l(i10);
    }

    private final void h(float f10) {
        this.f2114c.k(f10);
    }

    private final void i(int i10, float f10) {
        g(i10);
        this.f2117f.j(i10);
        h(f10);
    }

    public final void a(int i10) {
        h(c() + (this.f2112a.H() == 0 ? 0.0f : i10 / this.f2112a.H()));
    }

    public final int b() {
        return this.f2113b.e();
    }

    public final float c() {
        return this.f2114c.c();
    }

    public final B.B d() {
        return this.f2117f;
    }

    public final int e(r rVar, int i10) {
        int iA = B.u.a(rVar, this.f2116e, i10);
        if (i10 != iA) {
            g(iA);
            this.f2117f.j(i10);
        }
        return iA;
    }

    public final void f(int i10, float f10) {
        i(i10, f10);
        this.f2116e = null;
    }

    public final void j(float f10) {
        h(f10);
    }

    public final void k(u uVar) {
        C2520e c2520eO = uVar.o();
        this.f2116e = c2520eO != null ? c2520eO.d() : null;
        if (this.f2115d || !uVar.h().isEmpty()) {
            this.f2115d = true;
            C2520e c2520eO2 = uVar.o();
            i(c2520eO2 != null ? c2520eO2.getIndex() : 0, uVar.s());
        }
    }
}
