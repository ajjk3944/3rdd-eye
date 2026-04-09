package s0;

import T.InterfaceC3551q0;
import T.t1;
import Y0.s;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import l0.C6537m;
import m0.AbstractC6735w0;
import m0.J0;
import m0.K0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import o0.InterfaceC7037d;
import o0.InterfaceC7039f;

/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: b, reason: collision with root package name */
    private final C7867c f60958b;

    /* renamed from: c, reason: collision with root package name */
    private String f60959c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f60960d;

    /* renamed from: e, reason: collision with root package name */
    private final C7865a f60961e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC6824a f60962f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3551q0 f60963g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC6735w0 f60964h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3551q0 f60965i;

    /* renamed from: j, reason: collision with root package name */
    private long f60966j;

    /* renamed from: k, reason: collision with root package name */
    private float f60967k;

    /* renamed from: l, reason: collision with root package name */
    private float f60968l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC6835l f60969m;

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        public final void a(k kVar) {
            l.this.h();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((k) obj);
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final void a(InterfaceC7039f interfaceC7039f) {
            C7867c c7867cL = l.this.l();
            l lVar = l.this;
            float f10 = lVar.f60967k;
            float f11 = lVar.f60968l;
            long jC = C6531g.f52335b.c();
            InterfaceC7037d interfaceC7037dK1 = interfaceC7039f.k1();
            long jC2 = interfaceC7037dK1.c();
            interfaceC7037dK1.d().j();
            try {
                interfaceC7037dK1.e().f(f10, f11, jC);
                c7867cL.a(interfaceC7039f);
            } finally {
                interfaceC7037dK1.d().r();
                interfaceC7037dK1.f(jC2);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f60972a = new c();

        c() {
            super(0);
        }

        public final void a() {
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public l(C7867c c7867c) {
        super(null);
        this.f60958b = c7867c;
        c7867c.d(new a());
        this.f60959c = "";
        this.f60960d = true;
        this.f60961e = new C7865a();
        this.f60962f = c.f60972a;
        this.f60963g = t1.d(null, null, 2, null);
        C6537m.a aVar = C6537m.f52356b;
        this.f60965i = t1.d(C6537m.c(aVar.b()), null, 2, null);
        this.f60966j = aVar.a();
        this.f60967k = 1.0f;
        this.f60968l = 1.0f;
        this.f60969m = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.f60960d = true;
        this.f60962f.invoke();
    }

    @Override // s0.k
    public void a(InterfaceC7039f interfaceC7039f) {
        i(interfaceC7039f, 1.0f, null);
    }

    public final void i(InterfaceC7039f interfaceC7039f, float f10, AbstractC6735w0 abstractC6735w0) {
        int iA = (this.f60958b.j() && this.f60958b.g() != 16 && n.f(k()) && n.f(abstractC6735w0)) ? K0.f52822b.a() : K0.f52822b.b();
        if (this.f60960d || !C6537m.f(this.f60966j, interfaceC7039f.c()) || !K0.i(iA, j())) {
            this.f60964h = K0.i(iA, K0.f52822b.a()) ? AbstractC6735w0.a.b(AbstractC6735w0.f52966b, this.f60958b.g(), 0, 2, null) : null;
            this.f60967k = C6537m.i(interfaceC7039f.c()) / C6537m.i(m());
            this.f60968l = C6537m.g(interfaceC7039f.c()) / C6537m.g(m());
            this.f60961e.b(iA, s.a((int) Math.ceil(C6537m.i(interfaceC7039f.c())), (int) Math.ceil(C6537m.g(interfaceC7039f.c()))), interfaceC7039f, interfaceC7039f.getLayoutDirection(), this.f60969m);
            this.f60960d = false;
            this.f60966j = interfaceC7039f.c();
        }
        if (abstractC6735w0 == null) {
            abstractC6735w0 = k() != null ? k() : this.f60964h;
        }
        this.f60961e.c(interfaceC7039f, f10, abstractC6735w0);
    }

    public final int j() {
        J0 j0D = this.f60961e.d();
        return j0D != null ? j0D.b() : K0.f52822b.b();
    }

    public final AbstractC6735w0 k() {
        return (AbstractC6735w0) this.f60963g.getValue();
    }

    public final C7867c l() {
        return this.f60958b;
    }

    public final long m() {
        return ((C6537m) this.f60965i.getValue()).m();
    }

    public final void n(AbstractC6735w0 abstractC6735w0) {
        this.f60963g.setValue(abstractC6735w0);
    }

    public final void o(InterfaceC6824a interfaceC6824a) {
        this.f60962f = interfaceC6824a;
    }

    public final void p(String str) {
        this.f60959c = str;
    }

    public final void q(long j10) {
        this.f60965i.setValue(C6537m.c(j10));
    }

    public String toString() {
        String str = "Params: \tname: " + this.f60959c + "\n\tviewportWidth: " + C6537m.i(m()) + "\n\tviewportHeight: " + C6537m.g(m()) + "\n";
        AbstractC6492s.h(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
