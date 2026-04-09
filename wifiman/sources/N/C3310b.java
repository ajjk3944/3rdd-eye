package N;

import T.InterfaceC3543m0;
import T.InterfaceC3551q0;
import T.o1;
import T.t1;
import T.z1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import r.InterfaceC7533i;
import s.EnumC7839L;
import sh.AbstractC7978m;

/* renamed from: N.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3310b {

    /* renamed from: p, reason: collision with root package name */
    public static final a f14298p = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f14299a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f14300b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7533i f14301c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6835l f14302d;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3551q0 f14305g;

    /* renamed from: e, reason: collision with root package name */
    private final C3315d0 f14303e = new C3315d0();

    /* renamed from: f, reason: collision with root package name */
    private final w.m f14304f = new h();

    /* renamed from: h, reason: collision with root package name */
    private final z1 f14306h = o1.e(new j());

    /* renamed from: i, reason: collision with root package name */
    private final z1 f14307i = o1.e(new g());

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3543m0 f14308j = T.C0.a(Float.NaN);

    /* renamed from: k, reason: collision with root package name */
    private final z1 f14309k = o1.d(o1.p(), new i());

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3543m0 f14310l = T.C0.a(0.0f);

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3551q0 f14311m = t1.d(null, null, 2, null);

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3551q0 f14312n = t1.d(androidx.compose.material.a.i(), null, 2, null);

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3308a f14313o = new f();

    /* renamed from: N.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: N.b$b, reason: collision with other inner class name */
    static final class C0550b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f14314a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14315b;

        /* renamed from: d, reason: collision with root package name */
        int f14317d;

        C0550b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14315b = obj;
            this.f14317d |= PduHandle.NONE;
            return C3310b.this.j(null, null, this);
        }
    }

    /* renamed from: N.b$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        int f14318a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mh.q f14320c;

        /* renamed from: N.b$c$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3310b f14321a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3310b c3310b) {
                super(0);
                this.f14321a = c3310b;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D invoke() {
                return this.f14321a.o();
            }
        }

        /* renamed from: N.b$c$b, reason: collision with other inner class name */
        static final class C0551b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f14322a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f14323b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ mh.q f14324c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3310b f14325d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0551b(mh.q qVar, C3310b c3310b, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f14324c = qVar;
                this.f14325d = c3310b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C0551b c0551b = new C0551b(this.f14324c, this.f14325d, interfaceC5380e);
                c0551b.f14323b = obj;
                return c0551b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f14322a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    D d10 = (D) this.f14323b;
                    mh.q qVar = this.f14324c;
                    InterfaceC3308a interfaceC3308a = this.f14325d.f14313o;
                    this.f14322a = 1;
                    if (qVar.s(interfaceC3308a, d10, this) == objG) {
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
            public final Object invoke(D d10, InterfaceC5380e interfaceC5380e) {
                return ((C0551b) create(d10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(mh.q qVar, InterfaceC5380e interfaceC5380e) {
            super(1, interfaceC5380e);
            this.f14320c = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
            return C3310b.this.new c(this.f14320c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f14318a;
            if (i10 == 0) {
                Yg.v.b(obj);
                a aVar = new a(C3310b.this);
                C0551b c0551b = new C0551b(this.f14320c, C3310b.this, null);
                this.f14318a = 1;
                if (androidx.compose.material.a.j(aVar, c0551b, this) == objG) {
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

        @Override // mh.InterfaceC6835l
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5380e interfaceC5380e) {
            return ((c) create(interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: N.b$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f14326a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14327b;

        /* renamed from: d, reason: collision with root package name */
        int f14329d;

        d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f14327b = obj;
            this.f14329d |= PduHandle.NONE;
            return C3310b.this.i(null, null, null, this);
        }
    }

    /* renamed from: N.b$e */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        int f14330a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f14332c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ mh.r f14333d;

        /* renamed from: N.b$e$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3310b f14334a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3310b c3310b) {
                super(0);
                this.f14334a = c3310b;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Yg.s invoke() {
                return Yg.z.a(this.f14334a.o(), this.f14334a.x());
            }
        }

        /* renamed from: N.b$e$b, reason: collision with other inner class name */
        static final class C0552b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f14335a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f14336b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ mh.r f14337c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3310b f14338d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0552b(mh.r rVar, C3310b c3310b, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f14337c = rVar;
                this.f14338d = c3310b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                C0552b c0552b = new C0552b(this.f14337c, this.f14338d, interfaceC5380e);
                c0552b.f14336b = obj;
                return c0552b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f14335a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    Yg.s sVar = (Yg.s) this.f14336b;
                    D d10 = (D) sVar.a();
                    Object objC = sVar.c();
                    mh.r rVar = this.f14337c;
                    InterfaceC3308a interfaceC3308a = this.f14338d.f14313o;
                    this.f14335a = 1;
                    if (rVar.y(interfaceC3308a, d10, objC, this) == objG) {
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
            public final Object invoke(Yg.s sVar, InterfaceC5380e interfaceC5380e) {
                return ((C0552b) create(sVar, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj, mh.r rVar, InterfaceC5380e interfaceC5380e) {
            super(1, interfaceC5380e);
            this.f14332c = obj;
            this.f14333d = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
            return C3310b.this.new e(this.f14332c, this.f14333d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f14330a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C3310b.this.D(this.f14332c);
                a aVar = new a(C3310b.this);
                C0552b c0552b = new C0552b(this.f14333d, C3310b.this, null);
                this.f14330a = 1;
                if (androidx.compose.material.a.j(aVar, c0552b, this) == objG) {
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

        @Override // mh.InterfaceC6835l
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5380e interfaceC5380e) {
            return ((e) create(interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: N.b$f */
    public static final class f implements InterfaceC3308a {
        f() {
        }

        @Override // N.InterfaceC3308a
        public void a(float f10, float f11) {
            C3310b.this.F(f10);
            C3310b.this.E(f11);
        }
    }

    /* renamed from: N.b$g */
    static final class g extends AbstractC6494u implements InterfaceC6824a {
        g() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            Object objT = C3310b.this.t();
            if (objT != null) {
                return objT;
            }
            C3310b c3310b = C3310b.this;
            float fW = c3310b.w();
            return !Float.isNaN(fW) ? c3310b.m(fW, c3310b.s()) : c3310b.s();
        }
    }

    /* renamed from: N.b$h */
    public static final class h implements w.m {

        /* renamed from: a, reason: collision with root package name */
        private final C0553b f14341a;

        /* renamed from: N.b$h$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            int f14343a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f14345c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
                super(3, interfaceC5380e);
                this.f14345c = interfaceC6839p;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f14343a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    C0553b c0553b = h.this.f14341a;
                    InterfaceC6839p interfaceC6839p = this.f14345c;
                    this.f14343a = 1;
                    if (interfaceC6839p.invoke(c0553b, this) == objG) {
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

            @Override // mh.q
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object s(InterfaceC3308a interfaceC3308a, D d10, InterfaceC5380e interfaceC5380e) {
                return h.this.new a(this.f14345c, interfaceC5380e).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* renamed from: N.b$h$b, reason: collision with other inner class name */
        public static final class C0553b implements w.k {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3310b f14346a;

            C0553b(C3310b c3310b) {
                this.f14346a = c3310b;
            }

            @Override // w.k
            public void a(float f10) {
                InterfaceC3308a.b(this.f14346a.f14313o, this.f14346a.z(f10), 0.0f, 2, null);
            }
        }

        h() {
            this.f14341a = new C0553b(C3310b.this);
        }

        @Override // w.m
        public Object a(EnumC7839L enumC7839L, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) throws Throwable {
            Object objJ = C3310b.this.j(enumC7839L, new a(interfaceC6839p, null), interfaceC5380e);
            return objJ == AbstractC5467b.g() ? objJ : Yg.J.f24997a;
        }
    }

    /* renamed from: N.b$i */
    static final class i extends AbstractC6494u implements InterfaceC6824a {
        i() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float fE = C3310b.this.o().e(C3310b.this.s());
            float fE2 = C3310b.this.o().e(C3310b.this.q()) - fE;
            float fAbs = Math.abs(fE2);
            float f10 = 1.0f;
            if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                float fA = (C3310b.this.A() - fE) / fE2;
                if (fA < 1.0E-6f) {
                    f10 = 0.0f;
                } else if (fA <= 0.999999f) {
                    f10 = fA;
                }
            }
            return Float.valueOf(f10);
        }
    }

    /* renamed from: N.b$j */
    static final class j extends AbstractC6494u implements InterfaceC6824a {
        j() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            Object objT = C3310b.this.t();
            if (objT != null) {
                return objT;
            }
            C3310b c3310b = C3310b.this;
            float fW = c3310b.w();
            return !Float.isNaN(fW) ? c3310b.l(fW, c3310b.s(), 0.0f) : c3310b.s();
        }
    }

    /* renamed from: N.b$k */
    static final class k extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f14350b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Object obj) {
            super(0);
            this.f14350b = obj;
        }

        public final void a() {
            InterfaceC3308a interfaceC3308a = C3310b.this.f14313o;
            C3310b c3310b = C3310b.this;
            Object obj = this.f14350b;
            float fE = c3310b.o().e(obj);
            if (!Float.isNaN(fE)) {
                InterfaceC3308a.b(interfaceC3308a, fE, 0.0f, 2, null);
                c3310b.D(null);
            }
            c3310b.C(obj);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public C3310b(Object obj, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, InterfaceC7533i interfaceC7533i, InterfaceC6835l interfaceC6835l2) {
        this.f14299a = interfaceC6835l;
        this.f14300b = interfaceC6824a;
        this.f14301c = interfaceC7533i;
        this.f14302d = interfaceC6835l2;
        this.f14305g = t1.d(obj, null, 2, null);
    }

    private final void B(D d10) {
        this.f14312n.setValue(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(Object obj) {
        this.f14305g.setValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(Object obj) {
        this.f14311m.setValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(float f10) {
        this.f14310l.k(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(float f10) {
        this.f14308j.k(f10);
    }

    private final boolean H(Object obj) {
        return this.f14303e.e(new k(obj));
    }

    public static /* synthetic */ void J(C3310b c3310b, D d10, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0 && (Float.isNaN(c3310b.w()) || (obj = d10.d(c3310b.w())) == null)) {
            obj = c3310b.x();
        }
        c3310b.I(d10, obj);
    }

    public static /* synthetic */ Object k(C3310b c3310b, Object obj, EnumC7839L enumC7839L, mh.r rVar, InterfaceC5380e interfaceC5380e, int i10, Object obj2) throws Throwable {
        if ((i10 & 2) != 0) {
            enumC7839L = EnumC7839L.Default;
        }
        return c3310b.i(obj, enumC7839L, rVar, interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(float f10, Object obj, float f11) {
        Object objC;
        D dO = o();
        float fE = dO.e(obj);
        float fFloatValue = ((Number) this.f14300b.invoke()).floatValue();
        if (fE == f10 || Float.isNaN(fE)) {
            return obj;
        }
        if (fE < f10) {
            if (f11 >= fFloatValue) {
                Object objC2 = dO.c(f10, true);
                AbstractC6492s.f(objC2);
                return objC2;
            }
            objC = dO.c(f10, true);
            AbstractC6492s.f(objC);
            if (f10 < Math.abs(fE + Math.abs(((Number) this.f14299a.invoke(Float.valueOf(Math.abs(dO.e(objC) - fE)))).floatValue()))) {
                return obj;
            }
        } else {
            if (f11 <= (-fFloatValue)) {
                Object objC3 = dO.c(f10, false);
                AbstractC6492s.f(objC3);
                return objC3;
            }
            objC = dO.c(f10, false);
            AbstractC6492s.f(objC);
            float fAbs = Math.abs(fE - Math.abs(((Number) this.f14299a.invoke(Float.valueOf(Math.abs(fE - dO.e(objC))))).floatValue()));
            if (f10 < 0.0f) {
                if (Math.abs(f10) < fAbs) {
                    return obj;
                }
            } else if (f10 > fAbs) {
                return obj;
            }
        }
        return objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(float f10, Object obj) {
        Object objC;
        D dO = o();
        float fE = dO.e(obj);
        if (fE == f10 || Float.isNaN(fE)) {
            return obj;
        }
        if (fE < f10) {
            objC = dO.c(f10, true);
            if (objC == null) {
                return obj;
            }
        } else {
            objC = dO.c(f10, false);
            if (objC == null) {
                return obj;
            }
        }
        return objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t() {
        return this.f14311m.getValue();
    }

    public final float A() {
        if (Float.isNaN(w())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return w();
    }

    public final Object G(float f10, InterfaceC5380e interfaceC5380e) throws Throwable {
        Object objS = s();
        Object objL = l(A(), objS, f10);
        if (((Boolean) this.f14302d.invoke(objL)).booleanValue()) {
            Object objF = androidx.compose.material.a.f(this, objL, f10, interfaceC5380e);
            return objF == AbstractC5467b.g() ? objF : Yg.J.f24997a;
        }
        Object objF2 = androidx.compose.material.a.f(this, objS, f10, interfaceC5380e);
        return objF2 == AbstractC5467b.g() ? objF2 : Yg.J.f24997a;
    }

    public final void I(D d10, Object obj) {
        if (AbstractC6492s.d(o(), d10)) {
            return;
        }
        B(d10);
        if (H(obj)) {
            return;
        }
        D(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Object r7, s.EnumC7839L r8, mh.r r9, dh.InterfaceC5380e r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof N.C3310b.d
            if (r0 == 0) goto L13
            r0 = r10
            N.b$d r0 = (N.C3310b.d) r0
            int r1 = r0.f14329d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14329d = r1
            goto L18
        L13:
            N.b$d r0 = new N.b$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f14327b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f14329d
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.f14326a
            N.b r7 = (N.C3310b) r7
            Yg.v.b(r10)     // Catch: java.lang.Throwable -> L30
            goto L5a
        L30:
            r8 = move-exception
            goto L94
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            Yg.v.b(r10)
            N.D r10 = r6.o()
            boolean r10 = r10.f(r7)
            if (r10 == 0) goto Lcc
            N.d0 r10 = r6.f14303e     // Catch: java.lang.Throwable -> L92
            N.b$e r2 = new N.b$e     // Catch: java.lang.Throwable -> L92
            r2.<init>(r7, r9, r5)     // Catch: java.lang.Throwable -> L92
            r0.f14326a = r6     // Catch: java.lang.Throwable -> L92
            r0.f14329d = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r7 = r10.d(r8, r2, r0)     // Catch: java.lang.Throwable -> L92
            if (r7 != r1) goto L59
            return r1
        L59:
            r7 = r6
        L5a:
            r7.D(r5)
            N.D r8 = r7.o()
            float r9 = r7.w()
            java.lang.Object r8 = r8.d(r9)
            if (r8 == 0) goto Lcf
            float r9 = r7.w()
            N.D r10 = r7.o()
            float r10 = r10.e(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lcf
            mh.l r9 = r7.f14302d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lcf
            r7.C(r8)
            goto Lcf
        L92:
            r8 = move-exception
            r7 = r6
        L94:
            r7.D(r5)
            N.D r9 = r7.o()
            float r10 = r7.w()
            java.lang.Object r9 = r9.d(r10)
            if (r9 == 0) goto Lcb
            float r10 = r7.w()
            N.D r0 = r7.o()
            float r0 = r0.e(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto Lcb
            mh.l r10 = r7.f14302d
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lcb
            r7.C(r9)
        Lcb:
            throw r8
        Lcc:
            r6.C(r7)
        Lcf:
            Yg.J r7 = Yg.J.f24997a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C3310b.i(java.lang.Object, s.L, mh.r, dh.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(s.EnumC7839L r7, mh.q r8, dh.InterfaceC5380e r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof N.C3310b.C0550b
            if (r0 == 0) goto L13
            r0 = r9
            N.b$b r0 = (N.C3310b.C0550b) r0
            int r1 = r0.f14317d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14317d = r1
            goto L18
        L13:
            N.b$b r0 = new N.b$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f14315b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f14317d
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.f14314a
            N.b r7 = (N.C3310b) r7
            Yg.v.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L50
        L2f:
            r8 = move-exception
            goto L89
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            Yg.v.b(r9)
            N.d0 r9 = r6.f14303e     // Catch: java.lang.Throwable -> L87
            N.b$c r2 = new N.b$c     // Catch: java.lang.Throwable -> L87
            r5 = 0
            r2.<init>(r8, r5)     // Catch: java.lang.Throwable -> L87
            r0.f14314a = r6     // Catch: java.lang.Throwable -> L87
            r0.f14317d = r4     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = r9.d(r7, r2, r0)     // Catch: java.lang.Throwable -> L87
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r7 = r6
        L50:
            N.D r8 = r7.o()
            float r9 = r7.w()
            java.lang.Object r8 = r8.d(r9)
            if (r8 == 0) goto L84
            float r9 = r7.w()
            N.D r0 = r7.o()
            float r0 = r0.e(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L84
            mh.l r9 = r7.f14302d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L84
            r7.C(r8)
        L84:
            Yg.J r7 = Yg.J.f24997a
            return r7
        L87:
            r8 = move-exception
            r7 = r6
        L89:
            N.D r9 = r7.o()
            float r0 = r7.w()
            java.lang.Object r9 = r9.d(r0)
            if (r9 == 0) goto Lbd
            float r0 = r7.w()
            N.D r1 = r7.o()
            float r1 = r1.e(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lbd
            mh.l r0 = r7.f14302d
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbd
            r7.C(r9)
        Lbd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C3310b.j(s.L, mh.q, dh.e):java.lang.Object");
    }

    public final float n(float f10) {
        float fZ = z(f10);
        float fW = Float.isNaN(w()) ? 0.0f : w();
        F(fZ);
        return fZ - fW;
    }

    public final D o() {
        return (D) this.f14312n.getValue();
    }

    public final InterfaceC7533i p() {
        return this.f14301c;
    }

    public final Object q() {
        return this.f14307i.getValue();
    }

    public final InterfaceC6835l r() {
        return this.f14302d;
    }

    public final Object s() {
        return this.f14305g.getValue();
    }

    public final w.m u() {
        return this.f14304f;
    }

    public final float v() {
        return this.f14310l.c();
    }

    public final float w() {
        return this.f14308j.c();
    }

    public final Object x() {
        return this.f14306h.getValue();
    }

    public final boolean y() {
        return t() != null;
    }

    public final float z(float f10) {
        return AbstractC7978m.j((Float.isNaN(w()) ? 0.0f : w()) + f10, o().b(), o().g());
    }
}
