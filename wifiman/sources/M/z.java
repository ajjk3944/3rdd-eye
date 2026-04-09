package M;

import Ii.AbstractC3063k;
import Ii.N;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.O;
import T.o1;
import T.z1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import r.C7517a;
import r.C7532h0;
import r.C7539n;
import r.s0;
import r.u0;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private static final C7539n f12309a = new C7539n(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    private static final s0 f12310b = u0.a(a.f12313a, b.f12314a);

    /* renamed from: c, reason: collision with root package name */
    private static final long f12311c;

    /* renamed from: d, reason: collision with root package name */
    private static final C7532h0 f12312d;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12313a = new a();

        a() {
            super(1);
        }

        public final C7539n a(long j10) {
            return AbstractC6532h.c(j10) ? new C7539n(C6531g.m(j10), C6531g.n(j10)) : z.f12309a;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C6531g) obj).v());
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f12314a = new b();

        b() {
            super(1);
        }

        public final long a(C7539n c7539n) {
            return AbstractC6532h.a(c7539n.f(), c7539n.g());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C6531g.d(a((C7539n) obj));
        }
    }

    static final class c extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f12315a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f12316b;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1 f12317a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z1 z1Var) {
                super(0);
                this.f12317a = z1Var;
            }

            public final long a() {
                return c.h(this.f12317a);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                return C6531g.d(a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6824a interfaceC6824a, InterfaceC6835l interfaceC6835l) {
            super(3);
            this.f12315a = interfaceC6824a;
            this.f12316b = interfaceC6835l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long h(z1 z1Var) {
            return ((C6531g) z1Var.getValue()).v();
        }

        public final androidx.compose.ui.e c(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(759876635);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(759876635, i10, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
            }
            z1 z1VarH = z.h(this.f12315a, interfaceC3540l, 0);
            InterfaceC6835l interfaceC6835l = this.f12316b;
            boolean zT = interfaceC3540l.T(z1VarH);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(z1VarH);
                interfaceC3540l.K(objF);
            }
            androidx.compose.ui.e eVar2 = (androidx.compose.ui.e) interfaceC6835l.invoke((InterfaceC6824a) objF);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return eVar2;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return c((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f12318a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f12319b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z1 f12320c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C7517a f12321d;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1 f12322a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z1 z1Var) {
                super(0);
                this.f12322a = z1Var;
            }

            public final long a() {
                return z.i(this.f12322a);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                return C6531g.d(a());
            }
        }

        static final class b implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7517a f12323a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ N f12324b;

            static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f12325a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C7517a f12326b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f12327c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C7517a c7517a, long j10, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f12326b = c7517a;
                    this.f12327c = j10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new a(this.f12326b, this.f12327c, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f12325a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        C7517a c7517a = this.f12326b;
                        C6531g c6531gD = C6531g.d(this.f12327c);
                        C7532h0 c7532h0E = z.e();
                        this.f12325a = 1;
                        if (C7517a.f(c7517a, c6531gD, c7532h0E, null, null, this, 12, null) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    return Yg.J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            b(C7517a c7517a, N n10) {
                this.f12323a = c7517a;
                this.f12324b = n10;
            }

            @Override // Li.InterfaceC3221h
            public /* bridge */ /* synthetic */ Object a(Object obj, InterfaceC5380e interfaceC5380e) {
                return b(((C6531g) obj).v(), interfaceC5380e);
            }

            public final Object b(long j10, InterfaceC5380e interfaceC5380e) {
                if (AbstractC6532h.c(((C6531g) this.f12323a.m()).v()) && AbstractC6532h.c(j10) && C6531g.n(((C6531g) this.f12323a.m()).v()) != C6531g.n(j10)) {
                    AbstractC3063k.d(this.f12324b, null, null, new a(this.f12323a, j10, null), 3, null);
                    return Yg.J.f24997a;
                }
                Object objT = this.f12323a.t(C6531g.d(j10), interfaceC5380e);
                return objT == AbstractC5467b.g() ? objT : Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(z1 z1Var, C7517a c7517a, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f12320c = z1Var;
            this.f12321d = c7517a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = new d(this.f12320c, this.f12321d, interfaceC5380e);
            dVar.f12319b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f12318a;
            if (i10 == 0) {
                Yg.v.b(obj);
                N n10 = (N) this.f12319b;
                InterfaceC3220g interfaceC3220gO = o1.o(new a(this.f12320c));
                b bVar = new b(this.f12321d, n10);
                this.f12318a = 1;
                if (interfaceC3220gO.b(bVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static {
        long jA = AbstractC6532h.a(0.01f, 0.01f);
        f12311c = jA;
        f12312d = new C7532h0(0.0f, 0.0f, C6531g.d(jA), 3, null);
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, InterfaceC6824a interfaceC6824a, InterfaceC6835l interfaceC6835l) {
        return androidx.compose.ui.c.c(eVar, null, new c(interfaceC6824a, interfaceC6835l), 1, null);
    }

    public static final C7532h0 e() {
        return f12312d;
    }

    public static final long f() {
        return f12311c;
    }

    public static final s0 g() {
        return f12310b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z1 h(InterfaceC6824a interfaceC6824a, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1589795249, i10, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            objF = o1.e(interfaceC6824a);
            interfaceC3540l.K(objF);
        }
        z1 z1Var = (z1) objF;
        Object objF2 = interfaceC3540l.f();
        if (objF2 == aVar.a()) {
            objF2 = new C7517a(C6531g.d(i(z1Var)), f12310b, C6531g.d(f12311c), null, 8, null);
            interfaceC3540l.K(objF2);
        }
        C7517a c7517a = (C7517a) objF2;
        Yg.J j10 = Yg.J.f24997a;
        boolean zL = interfaceC3540l.l(c7517a);
        Object objF3 = interfaceC3540l.f();
        if (zL || objF3 == aVar.a()) {
            objF3 = new d(z1Var, c7517a, null);
            interfaceC3540l.K(objF3);
        }
        O.f(j10, (InterfaceC6839p) objF3, interfaceC3540l, 6);
        z1 z1VarG = c7517a.g();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return z1VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(z1 z1Var) {
        return ((C6531g) z1Var.getValue()).v();
    }
}
