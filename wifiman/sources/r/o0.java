package r;

import Ii.AbstractC3063k;
import T.AbstractC3535i0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3543m0;
import T.InterfaceC3547o0;
import T.InterfaceC3551q0;
import T.L0;
import T.X0;
import T.h1;
import T.o1;
import T.t1;
import T.z1;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import oh.AbstractC7137b;
import r.C7522c0;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    private final q0 f59774a;

    /* renamed from: b, reason: collision with root package name */
    private final o0 f59775b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59776c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3551q0 f59777d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3551q0 f59778e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3547o0 f59779f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3547o0 f59780g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3551q0 f59781h;

    /* renamed from: i, reason: collision with root package name */
    private final androidx.compose.runtime.snapshots.k f59782i;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.compose.runtime.snapshots.k f59783j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3551q0 f59784k;

    /* renamed from: l, reason: collision with root package name */
    private long f59785l;

    /* renamed from: m, reason: collision with root package name */
    private final z1 f59786m;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        private final s0 f59787a;

        /* renamed from: b, reason: collision with root package name */
        private final String f59788b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3551q0 f59789c = t1.d(null, null, 2, null);

        /* renamed from: r.o0$a$a, reason: collision with other inner class name */
        public final class C2085a implements z1 {

            /* renamed from: a, reason: collision with root package name */
            private final d f59791a;

            /* renamed from: b, reason: collision with root package name */
            private InterfaceC6835l f59792b;

            /* renamed from: c, reason: collision with root package name */
            private InterfaceC6835l f59793c;

            public C2085a(d dVar, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
                this.f59791a = dVar;
                this.f59792b = interfaceC6835l;
                this.f59793c = interfaceC6835l2;
            }

            public final d g() {
                return this.f59791a;
            }

            @Override // T.z1
            public Object getValue() {
                r(o0.this.n());
                return this.f59791a.getValue();
            }

            public final InterfaceC6835l i() {
                return this.f59793c;
            }

            public final InterfaceC6835l j() {
                return this.f59792b;
            }

            public final void p(InterfaceC6835l interfaceC6835l) {
                this.f59793c = interfaceC6835l;
            }

            public final void q(InterfaceC6835l interfaceC6835l) {
                this.f59792b = interfaceC6835l;
            }

            public final void r(b bVar) {
                Object objInvoke = this.f59793c.invoke(bVar.f());
                if (!o0.this.u()) {
                    this.f59791a.K(objInvoke, (H) this.f59792b.invoke(bVar));
                } else {
                    this.f59791a.I(this.f59793c.invoke(bVar.d()), objInvoke, (H) this.f59792b.invoke(bVar));
                }
            }
        }

        public a(s0 s0Var, String str) {
            this.f59787a = s0Var;
            this.f59788b = str;
        }

        public final z1 a(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
            C2085a c2085aB = b();
            if (c2085aB == null) {
                o0 o0Var = o0.this;
                c2085aB = new C2085a(o0Var.new d(interfaceC6835l2.invoke(o0Var.i()), AbstractC7537l.i(this.f59787a, interfaceC6835l2.invoke(o0.this.i())), this.f59787a, this.f59788b), interfaceC6835l, interfaceC6835l2);
                o0 o0Var2 = o0.this;
                c(c2085aB);
                o0Var2.c(c2085aB.g());
            }
            o0 o0Var3 = o0.this;
            c2085aB.p(interfaceC6835l2);
            c2085aB.q(interfaceC6835l);
            c2085aB.r(o0Var3.n());
            return c2085aB;
        }

        public final C2085a b() {
            return (C2085a) this.f59789c.getValue();
        }

        public final void c(C2085a c2085a) {
            this.f59789c.setValue(c2085a);
        }

        public final void d() {
            C2085a c2085aB = b();
            if (c2085aB != null) {
                o0 o0Var = o0.this;
                c2085aB.g().I(c2085aB.i().invoke(o0Var.n().d()), c2085aB.i().invoke(o0Var.n().f()), (H) c2085aB.j().invoke(o0Var.n()));
            }
        }
    }

    public interface b {
        Object d();

        default boolean e(Object obj, Object obj2) {
            return AbstractC6492s.d(obj, d()) && AbstractC6492s.d(obj2, f());
        }

        Object f();
    }

    private static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final Object f59795a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f59796b;

        public c(Object obj, Object obj2) {
            this.f59795a = obj;
            this.f59796b = obj2;
        }

        @Override // r.o0.b
        public Object d() {
            return this.f59795a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (AbstractC6492s.d(d(), bVar.d()) && AbstractC6492s.d(f(), bVar.f())) {
                    return true;
                }
            }
            return false;
        }

        @Override // r.o0.b
        public Object f() {
            return this.f59796b;
        }

        public int hashCode() {
            Object objD = d();
            int iHashCode = (objD != null ? objD.hashCode() : 0) * 31;
            Object objF = f();
            return iHashCode + (objF != null ? objF.hashCode() : 0);
        }
    }

    public final class d implements z1 {

        /* renamed from: a, reason: collision with root package name */
        private final s0 f59797a;

        /* renamed from: b, reason: collision with root package name */
        private final String f59798b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3551q0 f59799c;

        /* renamed from: d, reason: collision with root package name */
        private final C7532h0 f59800d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC3551q0 f59801e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC3551q0 f59802f;

        /* renamed from: g, reason: collision with root package name */
        private C7522c0.b f59803g;

        /* renamed from: h, reason: collision with root package name */
        private n0 f59804h;

        /* renamed from: i, reason: collision with root package name */
        private final InterfaceC3551q0 f59805i;

        /* renamed from: j, reason: collision with root package name */
        private final InterfaceC3543m0 f59806j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f59807k;

        /* renamed from: l, reason: collision with root package name */
        private final InterfaceC3551q0 f59808l;

        /* renamed from: m, reason: collision with root package name */
        private AbstractC7542q f59809m;

        /* renamed from: n, reason: collision with root package name */
        private final InterfaceC3547o0 f59810n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f59811o;

        /* renamed from: p, reason: collision with root package name */
        private final H f59812p;

        public d(Object obj, AbstractC7542q abstractC7542q, s0 s0Var, String str) {
            Object objInvoke;
            this.f59797a = s0Var;
            this.f59798b = str;
            this.f59799c = t1.d(obj, null, 2, null);
            C7532h0 c7532h0J = AbstractC7535j.j(0.0f, 0.0f, null, 7, null);
            this.f59800d = c7532h0J;
            this.f59801e = t1.d(c7532h0J, null, 2, null);
            this.f59802f = t1.d(new n0(j(), s0Var, obj, s(), abstractC7542q), null, 2, null);
            this.f59805i = t1.d(Boolean.TRUE, null, 2, null);
            this.f59806j = T.C0.a(-1.0f);
            this.f59808l = t1.d(obj, null, 2, null);
            this.f59809m = abstractC7542q;
            this.f59810n = h1.a(i().b());
            Float f10 = (Float) I0.h().get(s0Var);
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                AbstractC7542q abstractC7542q2 = (AbstractC7542q) s0Var.a().invoke(obj);
                int iB = abstractC7542q2.b();
                for (int i10 = 0; i10 < iB; i10++) {
                    abstractC7542q2.e(i10, fFloatValue);
                }
                objInvoke = this.f59797a.b().invoke(abstractC7542q2);
            } else {
                objInvoke = null;
            }
            this.f59812p = AbstractC7535j.j(0.0f, 0.0f, objInvoke, 3, null);
        }

        private final void E(Object obj) {
            this.f59799c.setValue(obj);
        }

        private final void G(Object obj, boolean z10) {
            n0 n0Var = this.f59804h;
            if (AbstractC6492s.d(n0Var != null ? n0Var.g() : null, s())) {
                y(new n0(this.f59812p, this.f59797a, obj, obj, r.g(this.f59809m)));
                this.f59807k = true;
                A(i().b());
                return;
            }
            InterfaceC7533i interfaceC7533iJ = (!z10 || this.f59811o || (j() instanceof C7532h0)) ? j() : this.f59812p;
            if (o0.this.m() > 0) {
                interfaceC7533iJ = AbstractC7535j.c(interfaceC7533iJ, o0.this.m());
            }
            y(new n0(interfaceC7533iJ, this.f59797a, obj, s(), this.f59809m));
            A(i().b());
            this.f59807k = false;
            o0.this.v();
        }

        static /* synthetic */ void H(d dVar, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            dVar.G(obj, z10);
        }

        private final Object s() {
            return this.f59799c.getValue();
        }

        private final void y(n0 n0Var) {
            this.f59802f.setValue(n0Var);
        }

        private final void z(H h10) {
            this.f59801e.setValue(h10);
        }

        public final void A(long j10) {
            this.f59810n.m(j10);
        }

        public final void B(boolean z10) {
            this.f59805i.setValue(Boolean.valueOf(z10));
        }

        public final void C(C7522c0.b bVar) {
            if (!AbstractC6492s.d(i().g(), i().i())) {
                this.f59804h = i();
                this.f59803g = bVar;
            }
            y(new n0(this.f59812p, this.f59797a, getValue(), getValue(), r.g(this.f59809m)));
            A(i().b());
            this.f59807k = true;
        }

        public final void D(float f10) {
            this.f59806j.k(f10);
        }

        public void F(Object obj) {
            this.f59808l.setValue(obj);
        }

        public final void I(Object obj, Object obj2, H h10) {
            E(obj2);
            z(h10);
            if (AbstractC6492s.d(i().i(), obj) && AbstractC6492s.d(i().g(), obj2)) {
                return;
            }
            H(this, obj, false, 2, null);
        }

        public final void J() {
            n0 n0Var;
            C7522c0.b bVar = this.f59803g;
            if (bVar == null || (n0Var = this.f59804h) == null) {
                return;
            }
            long jF = AbstractC7137b.f(bVar.c() * bVar.g());
            Object objF = n0Var.f(jF);
            if (this.f59807k) {
                i().k(objF);
            }
            i().j(objF);
            A(i().b());
            if (r() == -2.0f || this.f59807k) {
                F(objF);
            } else {
                x(o0.this.m());
            }
            if (jF < bVar.c()) {
                bVar.k(false);
            } else {
                this.f59803g = null;
                this.f59804h = null;
            }
        }

        public final void K(Object obj, H h10) {
            if (this.f59807k) {
                n0 n0Var = this.f59804h;
                if (AbstractC6492s.d(obj, n0Var != null ? n0Var.g() : null)) {
                    return;
                }
            }
            if (AbstractC6492s.d(s(), obj) && r() == -1.0f) {
                return;
            }
            E(obj);
            z(h10);
            G(r() == -3.0f ? obj : getValue(), !t());
            B(r() == -3.0f);
            if (r() >= 0.0f) {
                F(i().f((long) (i().b() * r())));
            } else if (r() == -3.0f) {
                F(obj);
            }
            this.f59807k = false;
            D(-1.0f);
        }

        public final void g() {
            this.f59804h = null;
            this.f59803g = null;
            this.f59807k = false;
        }

        @Override // T.z1
        public Object getValue() {
            return this.f59808l.getValue();
        }

        public final n0 i() {
            return (n0) this.f59802f.getValue();
        }

        public final H j() {
            return (H) this.f59801e.getValue();
        }

        public final long p() {
            return this.f59810n.a();
        }

        public final C7522c0.b q() {
            return this.f59803g;
        }

        public final float r() {
            return this.f59806j.c();
        }

        public final boolean t() {
            return ((Boolean) this.f59805i.getValue()).booleanValue();
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + s() + ", spec: " + j();
        }

        public final void u(long j10, boolean z10) {
            if (z10) {
                j10 = i().b();
            }
            F(i().f(j10));
            this.f59809m = i().d(j10);
            if (i().e(j10)) {
                B(true);
            }
        }

        public final void v() {
            D(-2.0f);
        }

        public final void w(float f10) {
            if (f10 != -4.0f && f10 != -5.0f) {
                D(f10);
                return;
            }
            n0 n0Var = this.f59804h;
            if (n0Var != null) {
                i().j(n0Var.g());
                this.f59803g = null;
                this.f59804h = null;
            }
            Object objI = f10 == -4.0f ? i().i() : i().g();
            i().j(objI);
            i().k(objI);
            F(objI);
            A(i().b());
        }

        public final void x(long j10) {
            if (r() == -1.0f) {
                this.f59811o = true;
                if (AbstractC6492s.d(i().g(), i().i())) {
                    F(i().g());
                } else {
                    F(i().f(j10));
                    this.f59809m = i().d(j10);
                }
            }
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ii.N f59814a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f59815b;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            float f59816a;

            /* renamed from: b, reason: collision with root package name */
            int f59817b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f59818c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ o0 f59819d;

            /* renamed from: r.o0$e$a$a, reason: collision with other inner class name */
            static final class C2086a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ o0 f59820a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ float f59821b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2086a(o0 o0Var, float f10) {
                    super(1);
                    this.f59820a = o0Var;
                    this.f59821b = f10;
                }

                public final void a(long j10) {
                    if (this.f59820a.u()) {
                        return;
                    }
                    this.f59820a.x(j10, this.f59821b);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((Number) obj).longValue());
                    return Yg.J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f59819d = o0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f59819d, interfaceC5380e);
                aVar.f59818c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                float fN;
                Ii.N n10;
                Object objG = AbstractC5467b.g();
                int i10 = this.f59817b;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    Ii.N n11 = (Ii.N) this.f59818c;
                    fN = m0.n(n11.getCoroutineContext());
                    n10 = n11;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fN = this.f59816a;
                    n10 = (Ii.N) this.f59818c;
                    Yg.v.b(obj);
                }
                while (Ii.O.i(n10)) {
                    C2086a c2086a = new C2086a(this.f59819d, fN);
                    this.f59818c = n10;
                    this.f59816a = fN;
                    this.f59817b = 1;
                    if (AbstractC3535i0.c(c2086a, this) == objG) {
                        return objG;
                    }
                }
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        public static final class b implements T.K {
            @Override // T.K
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Ii.N n10, o0 o0Var) {
            super(1);
            this.f59814a = n10;
            this.f59815b = o0Var;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            AbstractC3063k.d(this.f59814a, null, Ii.P.UNDISPATCHED, new a(this.f59815b, null), 1, null);
            return new b();
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f59823b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59824c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Object obj, int i10) {
            super(2);
            this.f59823b = obj;
            this.f59824c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            o0.this.e(this.f59823b, interfaceC3540l, L0.a(this.f59824c | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6824a {
        g() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(o0.this.f());
        }
    }

    public o0(q0 q0Var, o0 o0Var, String str) {
        this.f59774a = q0Var;
        this.f59775b = o0Var;
        this.f59776c = str;
        this.f59777d = t1.d(i(), null, 2, null);
        this.f59778e = t1.d(new c(i(), i()), null, 2, null);
        this.f59779f = h1.a(0L);
        this.f59780g = h1.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f59781h = t1.d(bool, null, 2, null);
        this.f59782i = o1.f();
        this.f59783j = o1.f();
        this.f59784k = t1.d(bool, null, 2, null);
        this.f59786m = o1.e(new g());
        q0Var.f(this);
    }

    private final void F() {
        androidx.compose.runtime.snapshots.k kVar = this.f59782i;
        int size = kVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) kVar.get(i10)).v();
        }
        androidx.compose.runtime.snapshots.k kVar2 = this.f59783j;
        int size2 = kVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((o0) kVar2.get(i11)).F();
        }
    }

    private final void L(b bVar) {
        this.f59778e.setValue(bVar);
    }

    private final void O(boolean z10) {
        this.f59781h.setValue(Boolean.valueOf(z10));
    }

    private final void P(long j10) {
        this.f59779f.m(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long f() {
        androidx.compose.runtime.snapshots.k kVar = this.f59782i;
        int size = kVar.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, ((d) kVar.get(i10)).p());
        }
        androidx.compose.runtime.snapshots.k kVar2 = this.f59783j;
        int size2 = kVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, ((o0) kVar2.get(i11)).f());
        }
        return jMax;
    }

    private final boolean r() {
        return ((Boolean) this.f59781h.getValue()).booleanValue();
    }

    private final long s() {
        return this.f59779f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        O(true);
        if (u()) {
            androidx.compose.runtime.snapshots.k kVar = this.f59782i;
            int size = kVar.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) kVar.get(i10);
                jMax = Math.max(jMax, dVar.p());
                dVar.x(this.f59785l);
            }
            O(false);
        }
    }

    public final void A(long j10) {
        M(j10);
        this.f59774a.e(true);
    }

    public final void B(a aVar) {
        d dVarG;
        a.C2085a c2085aB = aVar.b();
        if (c2085aB == null || (dVarG = c2085aB.g()) == null) {
            return;
        }
        C(dVarG);
    }

    public final void C(d dVar) {
        this.f59782i.remove(dVar);
    }

    public final boolean D(o0 o0Var) {
        return this.f59783j.remove(o0Var);
    }

    public final void E(float f10) {
        androidx.compose.runtime.snapshots.k kVar = this.f59782i;
        int size = kVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) kVar.get(i10)).w(f10);
        }
        androidx.compose.runtime.snapshots.k kVar2 = this.f59783j;
        int size2 = kVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((o0) kVar2.get(i11)).E(f10);
        }
    }

    public final void G(Object obj, Object obj2, long j10) {
        M(Long.MIN_VALUE);
        this.f59774a.e(false);
        if (!u() || !AbstractC6492s.d(i(), obj) || !AbstractC6492s.d(p(), obj2)) {
            if (!AbstractC6492s.d(i(), obj)) {
                q0 q0Var = this.f59774a;
                if (q0Var instanceof W) {
                    q0Var.d(obj);
                }
            }
            N(obj2);
            K(true);
            L(new c(obj, obj2));
        }
        androidx.compose.runtime.snapshots.k kVar = this.f59783j;
        int size = kVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0 o0Var = (o0) kVar.get(i10);
            AbstractC6492s.g(o0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (o0Var.u()) {
                o0Var.G(o0Var.i(), o0Var.p(), j10);
            }
        }
        androidx.compose.runtime.snapshots.k kVar2 = this.f59782i;
        int size2 = kVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((d) kVar2.get(i11)).x(j10);
        }
        this.f59785l = j10;
    }

    public final void H(long j10) {
        if (o() == Long.MIN_VALUE) {
            M(j10);
        }
        J(j10);
        O(false);
        androidx.compose.runtime.snapshots.k kVar = this.f59782i;
        int size = kVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) kVar.get(i10)).x(j10);
        }
        androidx.compose.runtime.snapshots.k kVar2 = this.f59783j;
        int size2 = kVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            o0 o0Var = (o0) kVar2.get(i11);
            if (!AbstractC6492s.d(o0Var.p(), o0Var.i())) {
                o0Var.H(j10);
            }
        }
    }

    public final void I(C7522c0.b bVar) {
        androidx.compose.runtime.snapshots.k kVar = this.f59782i;
        int size = kVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) kVar.get(i10)).C(bVar);
        }
        androidx.compose.runtime.snapshots.k kVar2 = this.f59783j;
        int size2 = kVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((o0) kVar2.get(i11)).I(bVar);
        }
    }

    public final void J(long j10) {
        if (this.f59775b == null) {
            P(j10);
        }
    }

    public final void K(boolean z10) {
        this.f59784k.setValue(Boolean.valueOf(z10));
    }

    public final void M(long j10) {
        this.f59780g.m(j10);
    }

    public final void N(Object obj) {
        this.f59777d.setValue(obj);
    }

    public final void Q() {
        androidx.compose.runtime.snapshots.k kVar = this.f59782i;
        int size = kVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) kVar.get(i10)).J();
        }
        androidx.compose.runtime.snapshots.k kVar2 = this.f59783j;
        int size2 = kVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((o0) kVar2.get(i11)).Q();
        }
    }

    public final void R(Object obj) {
        if (AbstractC6492s.d(p(), obj)) {
            return;
        }
        L(new c(p(), obj));
        if (!AbstractC6492s.d(i(), p())) {
            this.f59774a.d(p());
        }
        N(obj);
        if (!t()) {
            O(true);
        }
        F();
    }

    public final boolean c(d dVar) {
        return this.f59782i.add(dVar);
    }

    public final boolean d(o0 o0Var) {
        return this.f59783j.add(o0Var);
    }

    public final void e(Object obj, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1493585151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? interfaceC3540lR.T(obj) : interfaceC3540lR.l(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1493585151, i11, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1211)");
            }
            if (u()) {
                interfaceC3540lR.U(1823992347);
                interfaceC3540lR.J();
            } else {
                interfaceC3540lR.U(1822507602);
                R(obj);
                if (!AbstractC6492s.d(obj, i()) || t() || r()) {
                    interfaceC3540lR.U(1822738893);
                    Object objF = interfaceC3540lR.f();
                    InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
                    if (objF == aVar.a()) {
                        T.A a10 = new T.A(T.O.i(C5385j.f46088a, interfaceC3540lR));
                        interfaceC3540lR.K(a10);
                        objF = a10;
                    }
                    Ii.N nA = ((T.A) objF).a();
                    int i12 = i11 & 112;
                    boolean zL = (i12 == 32) | interfaceC3540lR.l(nA);
                    Object objF2 = interfaceC3540lR.f();
                    if (zL || objF2 == aVar.a()) {
                        objF2 = new e(nA, this);
                        interfaceC3540lR.K(objF2);
                    }
                    T.O.b(nA, this, (InterfaceC6835l) objF2, interfaceC3540lR, i12);
                    interfaceC3540lR.J();
                } else {
                    interfaceC3540lR.U(1823982427);
                    interfaceC3540lR.J();
                }
                interfaceC3540lR.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new f(obj, i10));
        }
    }

    public final void g() {
        androidx.compose.runtime.snapshots.k kVar = this.f59782i;
        int size = kVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) kVar.get(i10)).g();
        }
        androidx.compose.runtime.snapshots.k kVar2 = this.f59783j;
        int size2 = kVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((o0) kVar2.get(i11)).g();
        }
    }

    public final List h() {
        return this.f59782i;
    }

    public final Object i() {
        return this.f59774a.a();
    }

    public final boolean j() {
        androidx.compose.runtime.snapshots.k kVar = this.f59782i;
        int size = kVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                androidx.compose.runtime.snapshots.k kVar2 = this.f59783j;
                int size2 = kVar2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (!((o0) kVar2.get(i11)).j()) {
                    }
                }
                return false;
            }
            if (((d) kVar.get(i10)).q() != null) {
                break;
            }
            i10++;
        }
        return true;
    }

    public final String k() {
        return this.f59776c;
    }

    public final long l() {
        return this.f59785l;
    }

    public final long m() {
        o0 o0Var = this.f59775b;
        return o0Var != null ? o0Var.m() : s();
    }

    public final b n() {
        return (b) this.f59778e.getValue();
    }

    public final long o() {
        return this.f59780g.a();
    }

    public final Object p() {
        return this.f59777d.getValue();
    }

    public final long q() {
        return ((Number) this.f59786m.getValue()).longValue();
    }

    public final boolean t() {
        return o() != Long.MIN_VALUE;
    }

    public String toString() {
        List listH = h();
        int size = listH.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + ((d) listH.get(i10)) + ", ";
        }
        return str;
    }

    public final boolean u() {
        return ((Boolean) this.f59784k.getValue()).booleanValue();
    }

    public final void w() {
        z();
        this.f59774a.g();
    }

    public final void x(long j10, float f10) {
        if (o() == Long.MIN_VALUE) {
            A(j10);
        }
        long jO = j10 - o();
        if (f10 != 0.0f) {
            jO = AbstractC7137b.f(jO / f10);
        }
        J(jO);
        y(jO, f10 == 0.0f);
    }

    public final void y(long j10, boolean z10) {
        boolean z11 = true;
        if (o() == Long.MIN_VALUE) {
            A(j10);
        } else if (!this.f59774a.c()) {
            this.f59774a.e(true);
        }
        O(false);
        androidx.compose.runtime.snapshots.k kVar = this.f59782i;
        int size = kVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) kVar.get(i10);
            if (!dVar.t()) {
                dVar.u(j10, z10);
            }
            if (!dVar.t()) {
                z11 = false;
            }
        }
        androidx.compose.runtime.snapshots.k kVar2 = this.f59783j;
        int size2 = kVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            o0 o0Var = (o0) kVar2.get(i11);
            if (!AbstractC6492s.d(o0Var.p(), o0Var.i())) {
                o0Var.y(j10, z10);
            }
            if (!AbstractC6492s.d(o0Var.p(), o0Var.i())) {
                z11 = false;
            }
        }
        if (z11) {
            z();
        }
    }

    public final void z() {
        M(Long.MIN_VALUE);
        q0 q0Var = this.f59774a;
        if (q0Var instanceof W) {
            q0Var.d(p());
        }
        J(0L);
        this.f59774a.e(false);
        androidx.compose.runtime.snapshots.k kVar = this.f59783j;
        int size = kVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((o0) kVar.get(i10)).z();
        }
    }

    public o0(q0 q0Var, String str) {
        this(q0Var, null, str);
    }

    public o0(Object obj, String str) {
        this(new W(obj), null, str);
    }
}
