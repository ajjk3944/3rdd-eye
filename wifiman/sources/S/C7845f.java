package s;

import E0.AbstractC2635m;
import j0.C6233d;
import j0.C6237h;
import j0.InterfaceC6232c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6525a;
import l0.AbstractC6532h;
import l0.AbstractC6536l;
import l0.AbstractC6538n;
import l0.C6533i;
import l0.C6537m;
import m0.AbstractC6713l0;
import m0.AbstractC6731u0;
import m0.AbstractC6735w0;
import m0.J0;
import m0.Q0;
import m0.U0;
import m0.i1;
import mh.InterfaceC6835l;
import o0.C7044k;
import o0.InterfaceC7036c;
import o0.InterfaceC7037d;
import o0.InterfaceC7039f;

/* renamed from: s.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7845f extends AbstractC2635m {

    /* renamed from: p, reason: collision with root package name */
    private C7843d f60744p;

    /* renamed from: q, reason: collision with root package name */
    private float f60745q;

    /* renamed from: r, reason: collision with root package name */
    private AbstractC6713l0 f60746r;

    /* renamed from: s, reason: collision with root package name */
    private i1 f60747s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC6232c f60748t;

    /* renamed from: s.f$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q0.a f60749a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6713l0 f60750b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Q0.a aVar, AbstractC6713l0 abstractC6713l0) {
            super(1);
            this.f60749a = aVar;
            this.f60750b = abstractC6713l0;
        }

        public final void a(InterfaceC7036c interfaceC7036c) {
            interfaceC7036c.X1();
            InterfaceC7039f.R0(interfaceC7036c, this.f60749a.b(), this.f60750b, 0.0f, null, null, 0, 60, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7036c) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: s.f$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6533i f60751a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f60752b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f60753c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC6735w0 f60754d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6533i c6533i, kotlin.jvm.internal.N n10, long j10, AbstractC6735w0 abstractC6735w0) {
            super(1);
            this.f60751a = c6533i;
            this.f60752b = n10;
            this.f60753c = j10;
            this.f60754d = abstractC6735w0;
        }

        public final void a(InterfaceC7036c interfaceC7036c) {
            interfaceC7036c.X1();
            float fK = this.f60751a.k();
            float fN = this.f60751a.n();
            kotlin.jvm.internal.N n10 = this.f60752b;
            long j10 = this.f60753c;
            AbstractC6735w0 abstractC6735w0 = this.f60754d;
            interfaceC7036c.k1().e().c(fK, fN);
            try {
                InterfaceC7039f.u1(interfaceC7036c, (J0) n10.f51689a, 0L, j10, 0L, 0L, 0.0f, null, abstractC6735w0, 0, 0, 890, null);
            } finally {
                interfaceC7036c.k1().e().c(-fK, -fN);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7036c) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: s.f$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f60755a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6713l0 f60756b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f60757c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f60758d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f60759e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f60760f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f60761g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C7044k f60762h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, AbstractC6713l0 abstractC6713l0, long j10, float f10, float f11, long j11, long j12, C7044k c7044k) {
            super(1);
            this.f60755a = z10;
            this.f60756b = abstractC6713l0;
            this.f60757c = j10;
            this.f60758d = f10;
            this.f60759e = f11;
            this.f60760f = j11;
            this.f60761g = j12;
            this.f60762h = c7044k;
        }

        public final void a(InterfaceC7036c interfaceC7036c) throws Throwable {
            long j10;
            interfaceC7036c.X1();
            if (this.f60755a) {
                InterfaceC7039f.d0(interfaceC7036c, this.f60756b, 0L, 0L, this.f60757c, 0.0f, null, null, 0, 246, null);
                return;
            }
            float fD = AbstractC6525a.d(this.f60757c);
            float f10 = this.f60758d;
            if (fD >= f10) {
                InterfaceC7039f.d0(interfaceC7036c, this.f60756b, this.f60760f, this.f60761g, AbstractC7844e.l(this.f60757c, f10), 0.0f, this.f60762h, null, 0, 208, null);
                return;
            }
            float f11 = this.f60759e;
            float fI = C6537m.i(interfaceC7036c.c()) - this.f60759e;
            float fG = C6537m.g(interfaceC7036c.c()) - this.f60759e;
            int iA = AbstractC6731u0.f52948a.a();
            AbstractC6713l0 abstractC6713l0 = this.f60756b;
            long j11 = this.f60757c;
            InterfaceC7037d interfaceC7037dK1 = interfaceC7036c.k1();
            long jC = interfaceC7037dK1.c();
            interfaceC7037dK1.d().j();
            try {
                interfaceC7037dK1.e().b(f11, f11, fI, fG, iA);
                j10 = jC;
            } catch (Throwable th2) {
                th = th2;
                j10 = jC;
            }
            try {
                InterfaceC7039f.d0(interfaceC7036c, abstractC6713l0, 0L, 0L, j11, 0.0f, null, null, 0, 246, null);
                interfaceC7037dK1.d().r();
                interfaceC7037dK1.f(j10);
            } catch (Throwable th3) {
                th = th3;
                interfaceC7037dK1.d().r();
                interfaceC7037dK1.f(j10);
                throw th;
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((InterfaceC7036c) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: s.f$d */
    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ U0 f60763a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6713l0 f60764b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(U0 u02, AbstractC6713l0 abstractC6713l0) {
            super(1);
            this.f60763a = u02;
            this.f60764b = abstractC6713l0;
        }

        public final void a(InterfaceC7036c interfaceC7036c) {
            interfaceC7036c.X1();
            InterfaceC7039f.R0(interfaceC7036c, this.f60763a, this.f60764b, 0.0f, null, null, 0, 60, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7036c) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: s.f$e */
    static final class e extends AbstractC6494u implements InterfaceC6835l {
        e() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6237h invoke(C6233d c6233d) {
            if (c6233d.d1(C7845f.this.P2()) < 0.0f || C6537m.h(c6233d.c()) <= 0.0f) {
                return AbstractC7844e.j(c6233d);
            }
            float f10 = 2;
            float fMin = Math.min(Y0.h.n(C7845f.this.P2(), Y0.h.f24523b.a()) ? 1.0f : (float) Math.ceil(c6233d.d1(C7845f.this.P2())), (float) Math.ceil(C6537m.h(c6233d.c()) / f10));
            float f11 = fMin / f10;
            long jA = AbstractC6532h.a(f11, f11);
            long jA2 = AbstractC6538n.a(C6537m.i(c6233d.c()) - fMin, C6537m.g(c6233d.c()) - fMin);
            boolean z10 = f10 * fMin > C6537m.h(c6233d.c());
            Q0 q0A = C7845f.this.O2().a(c6233d.c(), c6233d.getLayoutDirection(), c6233d);
            if (q0A instanceof Q0.a) {
                C7845f c7845f = C7845f.this;
                return c7845f.L2(c6233d, c7845f.N2(), (Q0.a) q0A, z10, fMin);
            }
            if (q0A instanceof Q0.c) {
                C7845f c7845f2 = C7845f.this;
                return c7845f2.M2(c6233d, c7845f2.N2(), (Q0.c) q0A, jA, jA2, z10, fMin);
            }
            if (q0A instanceof Q0.b) {
                return AbstractC7844e.k(c6233d, C7845f.this.N2(), jA, jA2, z10, fMin);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ C7845f(float f10, AbstractC6713l0 abstractC6713l0, i1 i1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, abstractC6713l0, i1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j0.C6237h L2(j0.C6233d r48, m0.AbstractC6713l0 r49, m0.Q0.a r50, boolean r51, float r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C7845f.L2(j0.d, m0.l0, m0.Q0$a, boolean, float):j0.h");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6237h M2(C6233d c6233d, AbstractC6713l0 abstractC6713l0, Q0.c cVar, long j10, long j11, boolean z10, float f10) {
        if (AbstractC6536l.f(cVar.b())) {
            return c6233d.p(new c(z10, abstractC6713l0, cVar.b().h(), f10 / 2, f10, j10, j11, new C7044k(f10, 0.0f, 0, 0, null, 30, null)));
        }
        if (this.f60744p == null) {
            this.f60744p = new C7843d(null, null, null, null, 15, null);
        }
        C7843d c7843d = this.f60744p;
        AbstractC6492s.f(c7843d);
        return c6233d.p(new d(AbstractC7844e.i(c7843d.g(), cVar.b(), f10, z10), abstractC6713l0));
    }

    public final void I1(i1 i1Var) {
        if (AbstractC6492s.d(this.f60747s, i1Var)) {
            return;
        }
        this.f60747s = i1Var;
        this.f60748t.c0();
    }

    public final AbstractC6713l0 N2() {
        return this.f60746r;
    }

    public final i1 O2() {
        return this.f60747s;
    }

    public final float P2() {
        return this.f60745q;
    }

    public final void Q2(AbstractC6713l0 abstractC6713l0) {
        if (AbstractC6492s.d(this.f60746r, abstractC6713l0)) {
            return;
        }
        this.f60746r = abstractC6713l0;
        this.f60748t.c0();
    }

    public final void R2(float f10) {
        if (Y0.h.n(this.f60745q, f10)) {
            return;
        }
        this.f60745q = f10;
        this.f60748t.c0();
    }

    private C7845f(float f10, AbstractC6713l0 abstractC6713l0, i1 i1Var) {
        this.f60745q = f10;
        this.f60746r = abstractC6713l0;
        this.f60747s = i1Var;
        this.f60748t = (InterfaceC6232c) D2(androidx.compose.ui.draw.b.a(new e()));
    }
}
