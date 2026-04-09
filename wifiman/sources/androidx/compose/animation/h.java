package androidx.compose.animation;

import C0.B;
import C0.D;
import T.z1;
import Y0.r;
import Y0.s;
import Yg.J;
import androidx.compose.ui.layout.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import q.AbstractC7398q;
import q.C7388g;
import q.C7404w;
import q.EnumC7392k;
import q.InterfaceC7397p;
import r.H;
import r.o0;

/* loaded from: classes.dex */
final class h extends AbstractC7398q {

    /* renamed from: n, reason: collision with root package name */
    private o0 f27616n;

    /* renamed from: o, reason: collision with root package name */
    private o0.a f27617o;

    /* renamed from: p, reason: collision with root package name */
    private o0.a f27618p;

    /* renamed from: q, reason: collision with root package name */
    private o0.a f27619q;

    /* renamed from: r, reason: collision with root package name */
    private androidx.compose.animation.i f27620r;

    /* renamed from: s, reason: collision with root package name */
    private k f27621s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC6824a f27622t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC7397p f27623u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f27624v;

    /* renamed from: y, reason: collision with root package name */
    private f0.c f27627y;

    /* renamed from: w, reason: collision with root package name */
    private long f27625w = androidx.compose.animation.f.c();

    /* renamed from: x, reason: collision with root package name */
    private long f27626x = Y0.c.b(0, 0, 0, 0, 15, null);

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC6835l f27628z = new i();

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC6835l f27615A = new j();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27629a;

        static {
            int[] iArr = new int[EnumC7392k.values().length];
            try {
                iArr[EnumC7392k.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7392k.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7392k.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27629a = iArr;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f27630a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t tVar) {
            super(1);
            this.f27630a = tVar;
        }

        public final void a(t.a aVar) {
            t.a.h(aVar, this.f27630a, 0, 0, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f27631a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f27632b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f27633c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27634d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(t tVar, long j10, long j11, InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f27631a = tVar;
            this.f27632b = j10;
            this.f27633c = j11;
            this.f27634d = interfaceC6835l;
        }

        public final void a(t.a aVar) {
            aVar.u(this.f27631a, Y0.n.h(this.f27633c) + Y0.n.h(this.f27632b), Y0.n.i(this.f27633c) + Y0.n.i(this.f27632b), 0.0f, this.f27634d);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f27635a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(t tVar) {
            super(1);
            this.f27635a = tVar;
        }

        public final void a(t.a aVar) {
            t.a.h(aVar, this.f27635a, 0, 0, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f27637b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10) {
            super(1);
            this.f27637b = j10;
        }

        public final long a(EnumC7392k enumC7392k) {
            return h.this.P2(enumC7392k, this.f27637b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return r.b(a((EnumC7392k) obj));
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final f f27638a = new f();

        f() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H invoke(o0.b bVar) {
            return androidx.compose.animation.g.f27576c;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f27640b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j10) {
            super(1);
            this.f27640b = j10;
        }

        public final long a(EnumC7392k enumC7392k) {
            return h.this.R2(enumC7392k, this.f27640b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Y0.n.b(a((EnumC7392k) obj));
        }
    }

    /* renamed from: androidx.compose.animation.h$h, reason: collision with other inner class name */
    static final class C1033h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f27642b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1033h(long j10) {
            super(1);
            this.f27642b = j10;
        }

        public final long a(EnumC7392k enumC7392k) {
            return h.this.Q2(enumC7392k, this.f27642b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Y0.n.b(a((EnumC7392k) obj));
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {
        i() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H invoke(o0.b bVar) {
            EnumC7392k enumC7392k = EnumC7392k.PreEnter;
            EnumC7392k enumC7392k2 = EnumC7392k.Visible;
            H hB = null;
            if (bVar.e(enumC7392k, enumC7392k2)) {
                C7388g c7388gA = h.this.E2().b().a();
                if (c7388gA != null) {
                    hB = c7388gA.b();
                }
            } else if (bVar.e(enumC7392k2, EnumC7392k.PostExit)) {
                C7388g c7388gA2 = h.this.F2().b().a();
                if (c7388gA2 != null) {
                    hB = c7388gA2.b();
                }
            } else {
                hB = androidx.compose.animation.g.f27577d;
            }
            return hB == null ? androidx.compose.animation.g.f27577d : hB;
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6835l {
        j() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H invoke(o0.b bVar) {
            H hA;
            H hA2;
            EnumC7392k enumC7392k = EnumC7392k.PreEnter;
            EnumC7392k enumC7392k2 = EnumC7392k.Visible;
            if (bVar.e(enumC7392k, enumC7392k2)) {
                C7404w c7404wF = h.this.E2().b().f();
                return (c7404wF == null || (hA2 = c7404wF.a()) == null) ? androidx.compose.animation.g.f27576c : hA2;
            }
            if (!bVar.e(enumC7392k2, EnumC7392k.PostExit)) {
                return androidx.compose.animation.g.f27576c;
            }
            C7404w c7404wF2 = h.this.F2().b().f();
            return (c7404wF2 == null || (hA = c7404wF2.a()) == null) ? androidx.compose.animation.g.f27576c : hA;
        }
    }

    public h(o0 o0Var, o0.a aVar, o0.a aVar2, o0.a aVar3, androidx.compose.animation.i iVar, k kVar, InterfaceC6824a interfaceC6824a, InterfaceC7397p interfaceC7397p) {
        this.f27616n = o0Var;
        this.f27617o = aVar;
        this.f27618p = aVar2;
        this.f27619q = aVar3;
        this.f27620r = iVar;
        this.f27621s = kVar;
        this.f27622t = interfaceC6824a;
        this.f27623u = interfaceC7397p;
    }

    private final void K2(long j10) {
        this.f27624v = true;
        this.f27626x = j10;
    }

    public final f0.c D2() {
        f0.c cVarA;
        if (this.f27616n.n().e(EnumC7392k.PreEnter, EnumC7392k.Visible)) {
            C7388g c7388gA = this.f27620r.b().a();
            if (c7388gA == null || (cVarA = c7388gA.a()) == null) {
                C7388g c7388gA2 = this.f27621s.b().a();
                if (c7388gA2 != null) {
                    return c7388gA2.a();
                }
                return null;
            }
        } else {
            C7388g c7388gA3 = this.f27621s.b().a();
            if (c7388gA3 == null || (cVarA = c7388gA3.a()) == null) {
                C7388g c7388gA4 = this.f27620r.b().a();
                if (c7388gA4 != null) {
                    return c7388gA4.a();
                }
                return null;
            }
        }
        return cVarA;
    }

    public final androidx.compose.animation.i E2() {
        return this.f27620r;
    }

    public final k F2() {
        return this.f27621s;
    }

    public final void G2(InterfaceC6824a interfaceC6824a) {
        this.f27622t = interfaceC6824a;
    }

    public final void H2(androidx.compose.animation.i iVar) {
        this.f27620r = iVar;
    }

    public final void I2(k kVar) {
        this.f27621s = kVar;
    }

    public final void J2(InterfaceC7397p interfaceC7397p) {
        this.f27623u = interfaceC7397p;
    }

    public final void L2(o0.a aVar) {
        this.f27618p = aVar;
    }

    public final void M2(o0.a aVar) {
        this.f27617o = aVar;
    }

    public final void N2(o0.a aVar) {
        this.f27619q = aVar;
    }

    public final void O2(o0 o0Var) {
        this.f27616n = o0Var;
    }

    public final long P2(EnumC7392k enumC7392k, long j10) {
        InterfaceC6835l interfaceC6835lD;
        InterfaceC6835l interfaceC6835lD2;
        int i10 = a.f27629a[enumC7392k.ordinal()];
        if (i10 == 1) {
            return j10;
        }
        if (i10 == 2) {
            C7388g c7388gA = this.f27620r.b().a();
            return (c7388gA == null || (interfaceC6835lD = c7388gA.d()) == null) ? j10 : ((r) interfaceC6835lD.invoke(r.b(j10))).j();
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        C7388g c7388gA2 = this.f27621s.b().a();
        return (c7388gA2 == null || (interfaceC6835lD2 = c7388gA2.d()) == null) ? j10 : ((r) interfaceC6835lD2.invoke(r.b(j10))).j();
    }

    public final long Q2(EnumC7392k enumC7392k, long j10) {
        InterfaceC6835l interfaceC6835lB;
        InterfaceC6835l interfaceC6835lB2;
        C7404w c7404wF = this.f27620r.b().f();
        long jA = (c7404wF == null || (interfaceC6835lB2 = c7404wF.b()) == null) ? Y0.n.f24536b.a() : ((Y0.n) interfaceC6835lB2.invoke(r.b(j10))).n();
        C7404w c7404wF2 = this.f27621s.b().f();
        long jA2 = (c7404wF2 == null || (interfaceC6835lB = c7404wF2.b()) == null) ? Y0.n.f24536b.a() : ((Y0.n) interfaceC6835lB.invoke(r.b(j10))).n();
        int i10 = a.f27629a[enumC7392k.ordinal()];
        if (i10 == 1) {
            return Y0.n.f24536b.a();
        }
        if (i10 == 2) {
            return jA;
        }
        if (i10 == 3) {
            return jA2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long R2(EnumC7392k enumC7392k, long j10) {
        int i10;
        if (this.f27627y != null && D2() != null && !AbstractC6492s.d(this.f27627y, D2()) && (i10 = a.f27629a[enumC7392k.ordinal()]) != 1 && i10 != 2) {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            C7388g c7388gA = this.f27621s.b().a();
            if (c7388gA == null) {
                return Y0.n.f24536b.a();
            }
            long j11 = ((r) c7388gA.d().invoke(r.b(j10))).j();
            f0.c cVarD2 = D2();
            AbstractC6492s.f(cVarD2);
            Y0.t tVar = Y0.t.Ltr;
            long jA = cVarD2.a(j10, j11, tVar);
            f0.c cVar = this.f27627y;
            AbstractC6492s.f(cVar);
            return Y0.n.k(jA, cVar.a(j10, j11, tVar));
        }
        return Y0.n.f24536b.a();
    }

    @Override // E0.B
    public D b(androidx.compose.ui.layout.m mVar, B b10, long j10) {
        z1 z1VarA;
        z1 z1VarA2;
        if (this.f27616n.i() == this.f27616n.p()) {
            this.f27627y = null;
        } else if (this.f27627y == null) {
            f0.c cVarD2 = D2();
            if (cVarD2 == null) {
                cVarD2 = f0.c.f46573a.o();
            }
            this.f27627y = cVarD2;
        }
        if (mVar.a1()) {
            t tVarT = b10.T(j10);
            long jA = s.a(tVarT.I0(), tVarT.C0());
            this.f27625w = jA;
            K2(j10);
            return androidx.compose.ui.layout.m.x0(mVar, r.g(jA), r.f(jA), null, new b(tVarT), 4, null);
        }
        if (!((Boolean) this.f27622t.invoke()).booleanValue()) {
            t tVarT2 = b10.T(j10);
            return androidx.compose.ui.layout.m.x0(mVar, tVarT2.I0(), tVarT2.C0(), null, new d(tVarT2), 4, null);
        }
        InterfaceC6835l interfaceC6835lA = this.f27623u.a();
        t tVarT3 = b10.T(j10);
        long jA2 = s.a(tVarT3.I0(), tVarT3.C0());
        long j11 = androidx.compose.animation.f.d(this.f27625w) ? this.f27625w : jA2;
        o0.a aVar = this.f27617o;
        z1 z1VarA3 = aVar != null ? aVar.a(this.f27628z, new e(j11)) : null;
        if (z1VarA3 != null) {
            jA2 = ((r) z1VarA3.getValue()).j();
        }
        long jF = Y0.c.f(j10, jA2);
        o0.a aVar2 = this.f27618p;
        long jA3 = (aVar2 == null || (z1VarA2 = aVar2.a(f.f27638a, new g(j11))) == null) ? Y0.n.f24536b.a() : ((Y0.n) z1VarA2.getValue()).n();
        o0.a aVar3 = this.f27619q;
        long jA4 = (aVar3 == null || (z1VarA = aVar3.a(this.f27615A, new C1033h(j11))) == null) ? Y0.n.f24536b.a() : ((Y0.n) z1VarA.getValue()).n();
        f0.c cVar = this.f27627y;
        return androidx.compose.ui.layout.m.x0(mVar, r.g(jF), r.f(jF), null, new c(tVarT3, Y0.n.l(cVar != null ? cVar.a(j11, jF, Y0.t.Ltr) : Y0.n.f24536b.a(), jA4), jA3, interfaceC6835lA), 4, null);
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        super.n2();
        this.f27624v = false;
        this.f27625w = androidx.compose.animation.f.c();
    }
}
