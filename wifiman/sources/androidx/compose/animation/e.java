package androidx.compose.animation;

import C0.B;
import C0.D;
import C0.K;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.o1;
import T.t1;
import T.z1;
import Y0.r;
import Y0.s;
import Y0.t;
import Yg.J;
import androidx.compose.animation.d;
import androidx.compose.ui.layout.t;
import j0.AbstractC6234e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import o.C7009H;
import o.S;
import q.AbstractC7399r;
import q.C7390i;
import q.InterfaceC7403v;
import r.AbstractC7535j;
import r.H;
import r.o0;
import r.p0;
import r.u0;

/* loaded from: classes.dex */
public final class e implements androidx.compose.animation.d {

    /* renamed from: a, reason: collision with root package name */
    private final o0 f27541a;

    /* renamed from: b, reason: collision with root package name */
    private f0.c f27542b;

    /* renamed from: c, reason: collision with root package name */
    private t f27543c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3551q0 f27544d = t1.d(r.b(r.f24545b.a()), null, 2, null);

    /* renamed from: e, reason: collision with root package name */
    private final C7009H f27545e = S.d();

    /* renamed from: f, reason: collision with root package name */
    private z1 f27546f;

    public static final class a implements K {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3551q0 f27547a;

        public a(boolean z10) {
            this.f27547a = t1.d(Boolean.valueOf(z10), null, 2, null);
        }

        @Override // C0.K
        public Object M(Y0.d dVar, Object obj) {
            return this;
        }

        public final boolean a() {
            return ((Boolean) this.f27547a.getValue()).booleanValue();
        }

        public final void c(boolean z10) {
            this.f27547a.setValue(Boolean.valueOf(z10));
        }
    }

    private final class b extends AbstractC7399r {

        /* renamed from: a, reason: collision with root package name */
        private final o0.a f27548a;

        /* renamed from: b, reason: collision with root package name */
        private final z1 f27549b;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f27551a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.t f27552b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f27553c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, androidx.compose.ui.layout.t tVar, long j10) {
                super(1);
                this.f27551a = eVar;
                this.f27552b = tVar;
                this.f27553c = j10;
            }

            public final void a(t.a aVar) {
                t.a.j(aVar, this.f27552b, this.f27551a.n().a(s.a(this.f27552b.I0(), this.f27552b.C0()), this.f27553c, Y0.t.Ltr), 0.0f, 2, null);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return J.f24997a;
            }
        }

        /* renamed from: androidx.compose.animation.e$b$b, reason: collision with other inner class name */
        static final class C1030b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f27554a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f27555b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1030b(e eVar, b bVar) {
                super(1);
                this.f27554a = eVar;
                this.f27555b = bVar;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final H invoke(o0.b bVar) {
                H hB;
                z1 z1Var = (z1) this.f27554a.q().c(bVar.d());
                long j10 = z1Var != null ? ((r) z1Var.getValue()).j() : r.f24545b.a();
                z1 z1Var2 = (z1) this.f27554a.q().c(bVar.f());
                long j11 = z1Var2 != null ? ((r) z1Var2.getValue()).j() : r.f24545b.a();
                InterfaceC7403v interfaceC7403v = (InterfaceC7403v) this.f27555b.a().getValue();
                return (interfaceC7403v == null || (hB = interfaceC7403v.b(j10, j11)) == null) ? AbstractC7535j.j(0.0f, 0.0f, null, 7, null) : hB;
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f27556a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e eVar) {
                super(1);
                this.f27556a = eVar;
            }

            public final long a(Object obj) {
                z1 z1Var = (z1) this.f27556a.q().c(obj);
                return z1Var != null ? ((r) z1Var.getValue()).j() : r.f24545b.a();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return r.b(a(obj));
            }
        }

        public b(o0.a aVar, z1 z1Var) {
            this.f27548a = aVar;
            this.f27549b = z1Var;
        }

        public final z1 a() {
            return this.f27549b;
        }

        @Override // C0.x
        public D b(androidx.compose.ui.layout.m mVar, B b10, long j10) {
            androidx.compose.ui.layout.t tVarT = b10.T(j10);
            z1 z1VarA = this.f27548a.a(new C1030b(e.this, this), new c(e.this));
            e.this.u(z1VarA);
            long jA = mVar.a1() ? s.a(tVarT.I0(), tVarT.C0()) : ((r) z1VarA.getValue()).j();
            return androidx.compose.ui.layout.m.x0(mVar, r.g(jA), r.f(jA), null, new a(e.this, tVarT, jA), 4, null);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27557a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f27558b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6835l interfaceC6835l, e eVar) {
            super(1);
            this.f27557a = interfaceC6835l;
            this.f27558b = eVar;
        }

        public final Integer a(int i10) {
            return (Integer) this.f27557a.invoke(Integer.valueOf(r.g(this.f27558b.o()) - Y0.n.h(this.f27558b.j(s.a(i10, i10), this.f27558b.o()))));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27559a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f27560b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC6835l interfaceC6835l, e eVar) {
            super(1);
            this.f27559a = interfaceC6835l;
            this.f27560b = eVar;
        }

        public final Integer a(int i10) {
            return (Integer) this.f27559a.invoke(Integer.valueOf((-Y0.n.h(this.f27560b.j(s.a(i10, i10), this.f27560b.o()))) - i10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* renamed from: androidx.compose.animation.e$e, reason: collision with other inner class name */
    static final class C1031e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27561a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f27562b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1031e(InterfaceC6835l interfaceC6835l, e eVar) {
            super(1);
            this.f27561a = interfaceC6835l;
            this.f27562b = eVar;
        }

        public final Integer a(int i10) {
            return (Integer) this.f27561a.invoke(Integer.valueOf(r.f(this.f27562b.o()) - Y0.n.i(this.f27562b.j(s.a(i10, i10), this.f27562b.o()))));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27563a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f27564b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC6835l interfaceC6835l, e eVar) {
            super(1);
            this.f27563a = interfaceC6835l;
            this.f27564b = eVar;
        }

        public final Integer a(int i10) {
            return (Integer) this.f27563a.invoke(Integer.valueOf((-Y0.n.i(this.f27564b.j(s.a(i10, i10), this.f27564b.o()))) - i10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27566b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f27566b = interfaceC6835l;
        }

        public final Integer a(int i10) {
            z1 z1Var = (z1) e.this.q().c(e.this.r().p());
            return (Integer) this.f27566b.invoke(Integer.valueOf((-Y0.n.h(e.this.j(s.a(i10, i10), z1Var != null ? ((r) z1Var.getValue()).j() : r.f24545b.a()))) - i10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27568b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f27568b = interfaceC6835l;
        }

        public final Integer a(int i10) {
            z1 z1Var = (z1) e.this.q().c(e.this.r().p());
            long j10 = z1Var != null ? ((r) z1Var.getValue()).j() : r.f24545b.a();
            return (Integer) this.f27568b.invoke(Integer.valueOf((-Y0.n.h(e.this.j(s.a(i10, i10), j10))) + r.g(j10)));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27570b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f27570b = interfaceC6835l;
        }

        public final Integer a(int i10) {
            z1 z1Var = (z1) e.this.q().c(e.this.r().p());
            return (Integer) this.f27570b.invoke(Integer.valueOf((-Y0.n.i(e.this.j(s.a(i10, i10), z1Var != null ? ((r) z1Var.getValue()).j() : r.f24545b.a()))) - i10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f27572b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f27572b = interfaceC6835l;
        }

        public final Integer a(int i10) {
            z1 z1Var = (z1) e.this.q().c(e.this.r().p());
            long j10 = z1Var != null ? ((r) z1Var.getValue()).j() : r.f24545b.a();
            return (Integer) this.f27572b.invoke(Integer.valueOf((-Y0.n.i(e.this.j(s.a(i10, i10), j10))) + r.f(j10)));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public e(o0 o0Var, f0.c cVar, Y0.t tVar) {
        this.f27541a = o0Var;
        this.f27542b = cVar;
        this.f27543c = tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long j(long j10, long j11) {
        return n().a(j10, j11, Y0.t.Ltr);
    }

    private static final boolean l(InterfaceC3551q0 interfaceC3551q0) {
        return ((Boolean) interfaceC3551q0.getValue()).booleanValue();
    }

    private static final void m(InterfaceC3551q0 interfaceC3551q0, boolean z10) {
        interfaceC3551q0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long o() {
        z1 z1Var = this.f27546f;
        return z1Var != null ? ((r) z1Var.getValue()).j() : p();
    }

    private final boolean s(int i10) {
        d.a.C1029a c1029a = d.a.f27532a;
        return d.a.h(i10, c1029a.c()) || (d.a.h(i10, c1029a.e()) && this.f27543c == Y0.t.Ltr) || (d.a.h(i10, c1029a.b()) && this.f27543c == Y0.t.Rtl);
    }

    private final boolean t(int i10) {
        d.a.C1029a c1029a = d.a.f27532a;
        return d.a.h(i10, c1029a.d()) || (d.a.h(i10, c1029a.e()) && this.f27543c == Y0.t.Rtl) || (d.a.h(i10, c1029a.b()) && this.f27543c == Y0.t.Ltr);
    }

    @Override // androidx.compose.animation.d
    public androidx.compose.animation.i b(int i10, H h10, InterfaceC6835l interfaceC6835l) {
        if (s(i10)) {
            return androidx.compose.animation.g.A(h10, new c(interfaceC6835l, this));
        }
        if (t(i10)) {
            return androidx.compose.animation.g.A(h10, new d(interfaceC6835l, this));
        }
        d.a.C1029a c1029a = d.a.f27532a;
        return d.a.h(i10, c1029a.f()) ? androidx.compose.animation.g.B(h10, new C1031e(interfaceC6835l, this)) : d.a.h(i10, c1029a.a()) ? androidx.compose.animation.g.B(h10, new f(interfaceC6835l, this)) : androidx.compose.animation.i.f27645a.a();
    }

    @Override // r.o0.b
    public Object d() {
        return this.f27541a.n().d();
    }

    @Override // r.o0.b
    public Object f() {
        return this.f27541a.n().f();
    }

    @Override // androidx.compose.animation.d
    public k g(int i10, H h10, InterfaceC6835l interfaceC6835l) {
        if (s(i10)) {
            return androidx.compose.animation.g.D(h10, new g(interfaceC6835l));
        }
        if (t(i10)) {
            return androidx.compose.animation.g.D(h10, new h(interfaceC6835l));
        }
        d.a.C1029a c1029a = d.a.f27532a;
        return d.a.h(i10, c1029a.f()) ? androidx.compose.animation.g.E(h10, new i(interfaceC6835l)) : d.a.h(i10, c1029a.a()) ? androidx.compose.animation.g.E(h10, new j(interfaceC6835l)) : k.f27648a.a();
    }

    public final androidx.compose.ui.e k(C7390i c7390i, InterfaceC3540l interfaceC3540l, int i10) {
        androidx.compose.ui.e eVar;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(93755870, i10, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:573)");
        }
        boolean zT = interfaceC3540l.T(this);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = t1.d(Boolean.FALSE, null, 2, null);
            interfaceC3540l.K(objF);
        }
        InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
        z1 z1VarN = o1.n(c7390i.b(), interfaceC3540l, 0);
        if (AbstractC6492s.d(this.f27541a.i(), this.f27541a.p())) {
            m(interfaceC3551q0, false);
        } else if (z1VarN.getValue() != null) {
            m(interfaceC3551q0, true);
        }
        if (l(interfaceC3551q0)) {
            interfaceC3540l.U(249037309);
            o0.a aVarC = p0.c(this.f27541a, u0.e(r.f24545b), null, interfaceC3540l, 0, 2);
            boolean zT2 = interfaceC3540l.T(aVarC);
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                InterfaceC7403v interfaceC7403v = (InterfaceC7403v) z1VarN.getValue();
                objF2 = ((interfaceC7403v == null || interfaceC7403v.a()) ? AbstractC6234e.b(androidx.compose.ui.e.f28771b0) : androidx.compose.ui.e.f28771b0).b0(new b(aVarC, z1VarN));
                interfaceC3540l.K(objF2);
            }
            eVar = (androidx.compose.ui.e) objF2;
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(249353726);
            interfaceC3540l.J();
            this.f27546f = null;
            eVar = androidx.compose.ui.e.f28771b0;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return eVar;
    }

    public f0.c n() {
        return this.f27542b;
    }

    public final long p() {
        return ((r) this.f27544d.getValue()).j();
    }

    public final C7009H q() {
        return this.f27545e;
    }

    public final o0 r() {
        return this.f27541a;
    }

    public final void u(z1 z1Var) {
        this.f27546f = z1Var;
    }

    public void v(f0.c cVar) {
        this.f27542b = cVar;
    }

    public final void w(Y0.t tVar) {
        this.f27543c = tVar;
    }

    public final void x(long j10) {
        this.f27544d.setValue(r.b(j10));
    }
}
