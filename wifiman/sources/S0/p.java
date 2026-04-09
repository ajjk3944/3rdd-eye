package s0;

import T.AbstractC3528f1;
import T.InterfaceC3545n0;
import T.InterfaceC3551q0;
import T.t1;
import Y0.t;
import Yg.J;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6537m;
import m0.AbstractC6735w0;
import mh.InterfaceC6824a;
import o0.InterfaceC7037d;
import o0.InterfaceC7039f;
import r0.AbstractC7554d;

/* loaded from: classes.dex */
public final class p extends AbstractC7554d {

    /* renamed from: n, reason: collision with root package name */
    public static final int f60990n = 8;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3551q0 f60991g = t1.d(C6537m.c(C6537m.f52356b.b()), null, 2, null);

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3551q0 f60992h = t1.d(Boolean.FALSE, null, 2, null);

    /* renamed from: i, reason: collision with root package name */
    private final l f60993i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3545n0 f60994j;

    /* renamed from: k, reason: collision with root package name */
    private float f60995k;

    /* renamed from: l, reason: collision with root package name */
    private AbstractC6735w0 f60996l;

    /* renamed from: m, reason: collision with root package name */
    private int f60997m;

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        public final void a() {
            if (p.this.f60997m == p.this.s()) {
                p pVar = p.this;
                pVar.w(pVar.s() + 1);
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public p(C7867c c7867c) {
        l lVar = new l(c7867c);
        lVar.o(new a());
        this.f60993i = lVar;
        this.f60994j = AbstractC3528f1.a(0);
        this.f60995k = 1.0f;
        this.f60997m = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int s() {
        return this.f60994j.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(int i10) {
        this.f60994j.l(i10);
    }

    @Override // r0.AbstractC7554d
    protected boolean a(float f10) {
        this.f60995k = f10;
        return true;
    }

    @Override // r0.AbstractC7554d
    protected boolean e(AbstractC6735w0 abstractC6735w0) {
        this.f60996l = abstractC6735w0;
        return true;
    }

    @Override // r0.AbstractC7554d
    public long l() {
        return t();
    }

    @Override // r0.AbstractC7554d
    protected void n(InterfaceC7039f interfaceC7039f) {
        l lVar = this.f60993i;
        AbstractC6735w0 abstractC6735w0K = this.f60996l;
        if (abstractC6735w0K == null) {
            abstractC6735w0K = lVar.k();
        }
        if (r() && interfaceC7039f.getLayoutDirection() == t.Rtl) {
            long jD1 = interfaceC7039f.D1();
            InterfaceC7037d interfaceC7037dK1 = interfaceC7039f.k1();
            long jC = interfaceC7037dK1.c();
            interfaceC7037dK1.d().j();
            try {
                interfaceC7037dK1.e().f(-1.0f, 1.0f, jD1);
                lVar.i(interfaceC7039f, this.f60995k, abstractC6735w0K);
            } finally {
                interfaceC7037dK1.d().r();
                interfaceC7037dK1.f(jC);
            }
        } else {
            lVar.i(interfaceC7039f, this.f60995k, abstractC6735w0K);
        }
        this.f60997m = s();
    }

    public final boolean r() {
        return ((Boolean) this.f60992h.getValue()).booleanValue();
    }

    public final long t() {
        return ((C6537m) this.f60991g.getValue()).m();
    }

    public final void u(boolean z10) {
        this.f60992h.setValue(Boolean.valueOf(z10));
    }

    public final void v(AbstractC6735w0 abstractC6735w0) {
        this.f60993i.n(abstractC6735w0);
    }

    public final void x(String str) {
        this.f60993i.p(str);
    }

    public final void y(long j10) {
        this.f60991g.setValue(C6537m.c(j10));
    }

    public final void z(long j10) {
        this.f60993i.q(j10);
    }
}
