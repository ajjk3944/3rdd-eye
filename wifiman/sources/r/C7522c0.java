package r;

import Ii.AbstractC3063k;
import Ii.InterfaceC3069n;
import T.AbstractC3535i0;
import T.InterfaceC3543m0;
import T.InterfaceC3551q0;
import T.t1;
import Zg.AbstractC3682n;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o.C7007F;
import oh.AbstractC7137b;
import org.snmp4j.mp.PduHandle;
import sh.AbstractC7978m;
import sh.C7974i;

/* renamed from: r.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7522c0 extends q0 {

    /* renamed from: r, reason: collision with root package name */
    private static final a f59618r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f59619s = 8;

    /* renamed from: t, reason: collision with root package name */
    private static final C7538m f59620t = new C7538m(0.0f);

    /* renamed from: u, reason: collision with root package name */
    private static final C7538m f59621u = new C7538m(1.0f);

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f59622b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3551q0 f59623c;

    /* renamed from: d, reason: collision with root package name */
    private Object f59624d;

    /* renamed from: e, reason: collision with root package name */
    private o0 f59625e;

    /* renamed from: f, reason: collision with root package name */
    private long f59626f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6824a f59627g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3543m0 f59628h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC3069n f59629i;

    /* renamed from: j, reason: collision with root package name */
    private final Ti.a f59630j;

    /* renamed from: k, reason: collision with root package name */
    private final Z f59631k;

    /* renamed from: l, reason: collision with root package name */
    private long f59632l;

    /* renamed from: m, reason: collision with root package name */
    private final C7007F f59633m;

    /* renamed from: n, reason: collision with root package name */
    private b f59634n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC6835l f59635o;

    /* renamed from: p, reason: collision with root package name */
    private float f59636p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC6835l f59637q;

    /* renamed from: r.c0$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7538m a() {
            return C7522c0.f59621u;
        }

        public final C7538m b() {
            return C7522c0.f59620t;
        }

        private a() {
        }
    }

    /* renamed from: r.c0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f59638a;

        /* renamed from: b, reason: collision with root package name */
        private v0 f59639b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f59640c;

        /* renamed from: d, reason: collision with root package name */
        private float f59641d;

        /* renamed from: e, reason: collision with root package name */
        private C7538m f59642e = new C7538m(0.0f);

        /* renamed from: f, reason: collision with root package name */
        private C7538m f59643f;

        /* renamed from: g, reason: collision with root package name */
        private long f59644g;

        /* renamed from: h, reason: collision with root package name */
        private long f59645h;

        public final v0 a() {
            return this.f59639b;
        }

        public final long b() {
            return this.f59645h;
        }

        public final long c() {
            return this.f59644g;
        }

        public final C7538m d() {
            return this.f59643f;
        }

        public final long e() {
            return this.f59638a;
        }

        public final C7538m f() {
            return this.f59642e;
        }

        public final float g() {
            return this.f59641d;
        }

        public final boolean h() {
            return this.f59640c;
        }

        public final void i(v0 v0Var) {
            this.f59639b = v0Var;
        }

        public final void j(long j10) {
            this.f59645h = j10;
        }

        public final void k(boolean z10) {
            this.f59640c = z10;
        }

        public final void l(long j10) {
            this.f59644g = j10;
        }

        public final void m(C7538m c7538m) {
            this.f59643f = c7538m;
        }

        public final void n(long j10) {
            this.f59638a = j10;
        }

        public final void o(float f10) {
            this.f59641d = f10;
        }

        public String toString() {
            return "progress nanos: " + this.f59638a + ", animationSpec: " + this.f59639b + ", isComplete: " + this.f59640c + ", value: " + this.f59641d + ", start: " + this.f59642e + ", initialVelocity: " + this.f59643f + ", durationNanos: " + this.f59644g + ", animationSpecDuration: " + this.f59645h;
        }
    }

    /* renamed from: r.c0$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {
        c() {
            super(1);
        }

        public final void a(long j10) {
            long j11 = j10 - C7522c0.this.f59632l;
            C7522c0.this.f59632l = j10;
            long jF = AbstractC7137b.f(j11 / C7522c0.this.f59636p);
            if (C7522c0.this.f59633m.d()) {
                C7007F c7007f = C7522c0.this.f59633m;
                C7522c0 c7522c0 = C7522c0.this;
                Object[] objArr = c7007f.f54910a;
                int i10 = c7007f.f54911b;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    b bVar = (b) objArr[i12];
                    c7522c0.N(bVar, jF);
                    bVar.k(true);
                }
                o0 o0Var = C7522c0.this.f59625e;
                if (o0Var != null) {
                    o0Var.Q();
                }
                C7007F c7007f2 = C7522c0.this.f59633m;
                int i13 = c7007f2.f54911b;
                Object[] objArr2 = c7007f2.f54910a;
                C7974i c7974iS = AbstractC7978m.s(0, i13);
                int i14 = c7974iS.i();
                int iJ = c7974iS.j();
                if (i14 <= iJ) {
                    while (true) {
                        objArr2[i14 - i11] = objArr2[i14];
                        if (((b) objArr2[i14]).h()) {
                            i11++;
                        }
                        if (i14 == iJ) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                AbstractC3682n.v(objArr2, null, i13 - i11, i13);
                c7007f2.f54911b -= i11;
            }
            b bVar2 = C7522c0.this.f59634n;
            if (bVar2 != null) {
                bVar2.l(C7522c0.this.J());
                C7522c0.this.N(bVar2, jF);
                C7522c0.this.U(bVar2.g());
                if (bVar2.g() == 1.0f) {
                    C7522c0.this.f59634n = null;
                }
                C7522c0.this.R();
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: r.c0$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        int f59647a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f59648b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7522c0 f59649c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f59650d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ H f59651e;

        /* renamed from: r.c0$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            Object f59652a;

            /* renamed from: b, reason: collision with root package name */
            Object f59653b;

            /* renamed from: c, reason: collision with root package name */
            int f59654c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C7522c0 f59655d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f59656e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ o0 f59657f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ H f59658g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C7522c0 c7522c0, Object obj, o0 o0Var, H h10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f59655d = c7522c0;
                this.f59656e = obj;
                this.f59657f = o0Var;
                this.f59658g = h10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f59655d, this.f59656e, this.f59657f, this.f59658g, interfaceC5380e);
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x00b7 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x01e7 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 502
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: r.C7522c0.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o0 o0Var, C7522c0 c7522c0, Object obj, H h10, InterfaceC5380e interfaceC5380e) {
            super(1, interfaceC5380e);
            this.f59648b = o0Var;
            this.f59649c = c7522c0;
            this.f59650d = obj;
            this.f59651e = h10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
            return new d(this.f59648b, this.f59649c, this.f59650d, this.f59651e, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f59647a;
            if (i10 == 0) {
                Yg.v.b(obj);
                a aVar = new a(this.f59649c, this.f59650d, this.f59648b, this.f59651e, null);
                this.f59647a = 1;
                if (Ii.O.g(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            this.f59648b.z();
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5380e interfaceC5380e) {
            return ((d) create(interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: r.c0$e */
    static final class e extends AbstractC6494u implements InterfaceC6835l {
        e() {
            super(1);
        }

        public final void a(long j10) {
            C7522c0.this.f59632l = j10;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: r.c0$f */
    static final class f extends AbstractC6494u implements InterfaceC6824a {
        f() {
            super(0);
        }

        public final void a() {
            C7522c0 c7522c0 = C7522c0.this;
            o0 o0Var = c7522c0.f59625e;
            c7522c0.W(o0Var != null ? o0Var.q() : 0L);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: r.c0$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f59661a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f59662b;

        /* renamed from: d, reason: collision with root package name */
        int f59664d;

        g(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f59662b = obj;
            this.f59664d |= PduHandle.NONE;
            return C7522c0.this.O(this);
        }
    }

    /* renamed from: r.c0$h */
    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        int f59665a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f59666b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f59667c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C7522c0 f59668d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o0 f59669e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f59670f;

        /* renamed from: r.c0$h$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f59671a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f59672b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f59673c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f59674d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C7522c0 f59675e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ o0 f59676f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f59677g;

            /* renamed from: r.c0$h$a$a, reason: collision with other inner class name */
            static final class C2084a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f59678a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C7522c0 f59679b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2084a(C7522c0 c7522c0, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f59679b = c7522c0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C2084a(this.f59679b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f59678a;
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        C7522c0 c7522c0 = this.f59679b;
                        this.f59678a = 1;
                        if (c7522c0.O(this) == objG) {
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
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C2084a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, Object obj2, C7522c0 c7522c0, o0 o0Var, float f10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f59673c = obj;
                this.f59674d = obj2;
                this.f59675e = c7522c0;
                this.f59676f = o0Var;
                this.f59677g = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f59673c, this.f59674d, this.f59675e, this.f59676f, this.f59677g, interfaceC5380e);
                aVar.f59672b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f59671a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    Ii.N n10 = (Ii.N) this.f59672b;
                    if (AbstractC6492s.d(this.f59673c, this.f59674d)) {
                        this.f59675e.f59634n = null;
                        if (AbstractC6492s.d(this.f59675e.a(), this.f59673c)) {
                            return Yg.J.f24997a;
                        }
                    } else {
                        this.f59675e.K();
                    }
                    if (!AbstractC6492s.d(this.f59673c, this.f59674d)) {
                        this.f59676f.R(this.f59673c);
                        this.f59676f.J(0L);
                        this.f59675e.V(this.f59673c);
                        this.f59676f.E(this.f59677g);
                    }
                    this.f59675e.U(this.f59677g);
                    if (this.f59675e.f59633m.d()) {
                        AbstractC3063k.d(n10, null, null, new C2084a(this.f59675e, null), 3, null);
                    } else {
                        this.f59675e.f59632l = Long.MIN_VALUE;
                    }
                    C7522c0 c7522c0 = this.f59675e;
                    this.f59671a = 1;
                    if (c7522c0.Z(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                this.f59675e.R();
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Object obj, Object obj2, C7522c0 c7522c0, o0 o0Var, float f10, InterfaceC5380e interfaceC5380e) {
            super(1, interfaceC5380e);
            this.f59666b = obj;
            this.f59667c = obj2;
            this.f59668d = c7522c0;
            this.f59669e = o0Var;
            this.f59670f = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
            return new h(this.f59666b, this.f59667c, this.f59668d, this.f59669e, this.f59670f, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f59665a;
            if (i10 == 0) {
                Yg.v.b(obj);
                a aVar = new a(this.f59666b, this.f59667c, this.f59668d, this.f59669e, this.f59670f, null);
                this.f59665a = 1;
                if (Ii.O.g(aVar, this) == objG) {
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
            return ((h) create(interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: r.c0$i */
    static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        int f59680a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f59682c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o0 f59683d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Object obj, o0 o0Var, InterfaceC5380e interfaceC5380e) {
            super(1, interfaceC5380e);
            this.f59682c = obj;
            this.f59683d = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
            return C7522c0.this.new i(this.f59682c, this.f59683d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f59680a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C7522c0.this.E();
                C7522c0.this.f59632l = Long.MIN_VALUE;
                C7522c0.this.U(0.0f);
                Object obj2 = this.f59682c;
                float f10 = AbstractC6492s.d(obj2, C7522c0.this.a()) ? -4.0f : AbstractC6492s.d(obj2, C7522c0.this.b()) ? -5.0f : -3.0f;
                this.f59683d.R(this.f59682c);
                this.f59683d.J(0L);
                C7522c0.this.V(this.f59682c);
                C7522c0.this.U(0.0f);
                C7522c0.this.d(this.f59682c);
                this.f59683d.E(f10);
                if (f10 == -3.0f) {
                    C7522c0 c7522c0 = C7522c0.this;
                    this.f59680a = 1;
                    if (c7522c0.Z(this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            this.f59683d.z();
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5380e interfaceC5380e) {
            return ((i) create(interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: r.c0$j */
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f59684a;

        /* renamed from: b, reason: collision with root package name */
        Object f59685b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f59686c;

        /* renamed from: e, reason: collision with root package name */
        int f59688e;

        j(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f59686c = obj;
            this.f59688e |= PduHandle.NONE;
            return C7522c0.this.Y(this);
        }
    }

    /* renamed from: r.c0$k */
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f59689a;

        /* renamed from: b, reason: collision with root package name */
        Object f59690b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f59691c;

        /* renamed from: e, reason: collision with root package name */
        int f59693e;

        k(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f59691c = obj;
            this.f59693e |= PduHandle.NONE;
            return C7522c0.this.Z(this);
        }
    }

    public C7522c0(Object obj) {
        super(null);
        this.f59622b = t1.d(obj, null, 2, null);
        this.f59623c = t1.d(obj, null, 2, null);
        this.f59624d = obj;
        this.f59627g = new f();
        this.f59628h = T.C0.a(0.0f);
        this.f59630j = Ti.g.b(false, 1, null);
        this.f59631k = new Z();
        this.f59632l = Long.MIN_VALUE;
        this.f59633m = new C7007F(0, 1, null);
        this.f59635o = new e();
        this.f59637q = new c();
    }

    private final Object A(InterfaceC5380e interfaceC5380e) {
        float fN = m0.n(interfaceC5380e.getContext());
        if (fN <= 0.0f) {
            E();
            return Yg.J.f24997a;
        }
        this.f59636p = fN;
        Object objC = AbstractC3535i0.c(this.f59637q, interfaceC5380e);
        return objC == AbstractC5467b.g() ? objC : Yg.J.f24997a;
    }

    public static /* synthetic */ Object C(C7522c0 c7522c0, Object obj, H h10, InterfaceC5380e interfaceC5380e, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = c7522c0.b();
        }
        if ((i10 & 2) != 0) {
            h10 = null;
        }
        return c7522c0.B(obj, h10, interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(InterfaceC5380e interfaceC5380e) {
        if (this.f59632l == Long.MIN_VALUE) {
            Object objC = AbstractC3535i0.c(this.f59635o, interfaceC5380e);
            return objC == AbstractC5467b.g() ? objC : Yg.J.f24997a;
        }
        Object objA = A(interfaceC5380e);
        return objA == AbstractC5467b.g() ? objA : Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        o0 o0Var = this.f59625e;
        if (o0Var != null) {
            o0Var.g();
        }
        this.f59633m.h();
        if (this.f59634n != null) {
            this.f59634n = null;
            U(1.0f);
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        o0 o0Var = this.f59625e;
        if (o0Var == null) {
            return;
        }
        b bVar = this.f59634n;
        if (bVar == null) {
            if (this.f59626f <= 0 || I() == 1.0f || AbstractC6492s.d(a(), b())) {
                bVar = null;
            } else {
                bVar = new b();
                bVar.o(I());
                long j10 = this.f59626f;
                bVar.l(j10);
                bVar.j(AbstractC7137b.f(j10 * (1.0d - I())));
                bVar.f().e(0, I());
            }
        }
        if (bVar != null) {
            bVar.l(this.f59626f);
            this.f59633m.g(bVar);
            o0Var.I(bVar);
        }
        this.f59634n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(b bVar, long j10) {
        long jE = bVar.e() + j10;
        bVar.n(jE);
        long jB = bVar.b();
        if (jE >= jB) {
            bVar.o(1.0f);
            return;
        }
        v0 v0VarA = bVar.a();
        if (v0VarA == null) {
            bVar.o(u0.k(bVar.f().a(0), 1.0f, jE / jB));
            return;
        }
        C7538m c7538mF = bVar.f();
        C7538m c7538m = f59621u;
        C7538m c7538mD = bVar.d();
        if (c7538mD == null) {
            c7538mD = f59620t;
        }
        bVar.o(AbstractC7978m.j(((C7538m) v0VarA.c(jE, c7538mF, c7538m, c7538mD)).a(0), 0.0f, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O(dh.InterfaceC5380e r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof r.C7522c0.g
            if (r0 == 0) goto L13
            r0 = r10
            r.c0$g r0 = (r.C7522c0.g) r0
            int r1 = r0.f59664d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59664d = r1
            goto L18
        L13:
            r.c0$g r0 = new r.c0$g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f59662b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f59664d
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            goto L33
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            java.lang.Object r2 = r0.f59661a
            r.c0 r2 = (r.C7522c0) r2
            Yg.v.b(r10)
            goto L76
        L3b:
            Yg.v.b(r10)
            o.F r10 = r9.f59633m
            boolean r10 = r10.c()
            if (r10 == 0) goto L4d
            r.c0$b r10 = r9.f59634n
            if (r10 != 0) goto L4d
            Yg.J r10 = Yg.J.f24997a
            return r10
        L4d:
            dh.i r10 = r0.getContext()
            float r10 = r.m0.n(r10)
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L62
            r9.E()
            r9.f59632l = r5
            Yg.J r10 = Yg.J.f24997a
            return r10
        L62:
            long r7 = r9.f59632l
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L75
            mh.l r10 = r9.f59635o
            r0.f59661a = r9
            r0.f59664d = r4
            java.lang.Object r10 = T.AbstractC3535i0.c(r10, r0)
            if (r10 != r1) goto L75
            return r1
        L75:
            r2 = r9
        L76:
            o.F r10 = r2.f59633m
            boolean r10 = r10.d()
            if (r10 != 0) goto L88
            r.c0$b r10 = r2.f59634n
            if (r10 == 0) goto L83
            goto L88
        L83:
            r2.f59632l = r5
            Yg.J r10 = Yg.J.f24997a
            return r10
        L88:
            r0.f59661a = r2
            r0.f59664d = r3
            java.lang.Object r10 = r2.A(r0)
            if (r10 != r1) goto L76
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C7522c0.O(dh.e):java.lang.Object");
    }

    public static /* synthetic */ Object Q(C7522c0 c7522c0, float f10, Object obj, InterfaceC5380e interfaceC5380e, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = c7522c0.b();
        }
        return c7522c0.P(f10, obj, interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        o0 o0Var = this.f59625e;
        if (o0Var == null) {
            return;
        }
        o0Var.H(AbstractC7137b.f(I() * o0Var.q()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(float f10) {
        this.f59628h.k(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Y(dh.InterfaceC5380e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof r.C7522c0.j
            if (r0 == 0) goto L13
            r0 = r8
            r.c0$j r0 = (r.C7522c0.j) r0
            int r1 = r0.f59688e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59688e = r1
            goto L18
        L13:
            r.c0$j r0 = new r.c0$j
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f59686c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f59688e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r1 = r0.f59685b
            java.lang.Object r0 = r0.f59684a
            r.c0 r0 = (r.C7522c0) r0
            Yg.v.b(r8)
            goto L8c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.f59685b
            java.lang.Object r6 = r0.f59684a
            r.c0 r6 = (r.C7522c0) r6
            Yg.v.b(r8)
            r8 = r2
            goto L5d
        L46:
            Yg.v.b(r8)
            java.lang.Object r8 = r7.b()
            Ti.a r2 = r7.f59630j
            r0.f59684a = r7
            r0.f59685b = r8
            r0.f59688e = r5
            java.lang.Object r2 = Ti.a.C0811a.a(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L5c
            return r1
        L5c:
            r6 = r7
        L5d:
            r0.f59684a = r6
            r0.f59685b = r8
            r0.f59688e = r3
            Ii.p r2 = new Ii.p
            dh.e r3 = eh.AbstractC5467b.d(r0)
            r2.<init>(r3, r5)
            r2.A()
            r6.T(r2)
            Ti.a r3 = r6.H()
            Ti.a.C0811a.c(r3, r4, r5, r4)
            java.lang.Object r2 = r2.u()
            java.lang.Object r3 = eh.AbstractC5467b.g()
            if (r2 != r3) goto L86
            kotlin.coroutines.jvm.internal.h.c(r0)
        L86:
            if (r2 != r1) goto L89
            return r1
        L89:
            r1 = r8
            r8 = r2
            r0 = r6
        L8c:
            boolean r8 = kotlin.jvm.internal.AbstractC6492s.d(r8, r1)
            if (r8 == 0) goto L95
            Yg.J r8 = Yg.J.f24997a
            return r8
        L95:
            r1 = -9223372036854775808
            r0.f59632l = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "targetState while waiting for composition"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C7522c0.Y(dh.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Z(dh.InterfaceC5380e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof r.C7522c0.k
            if (r0 == 0) goto L13
            r0 = r8
            r.c0$k r0 = (r.C7522c0.k) r0
            int r1 = r0.f59693e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59693e = r1
            goto L18
        L13:
            r.c0$k r0 = new r.c0$k
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f59691c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f59693e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r1 = r0.f59690b
            java.lang.Object r0 = r0.f59689a
            r.c0 r0 = (r.C7522c0) r0
            Yg.v.b(r8)
            goto L9a
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.f59690b
            java.lang.Object r6 = r0.f59689a
            r.c0 r6 = (r.C7522c0) r6
            Yg.v.b(r8)
            r8 = r2
            goto L5d
        L46:
            Yg.v.b(r8)
            java.lang.Object r8 = r7.b()
            Ti.a r2 = r7.f59630j
            r0.f59689a = r7
            r0.f59690b = r8
            r0.f59693e = r5
            java.lang.Object r2 = Ti.a.C0811a.a(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L5c
            return r1
        L5c:
            r6 = r7
        L5d:
            java.lang.Object r2 = r6.f59624d
            boolean r2 = kotlin.jvm.internal.AbstractC6492s.d(r8, r2)
            if (r2 == 0) goto L6b
            Ti.a r8 = r6.f59630j
            Ti.a.C0811a.c(r8, r4, r5, r4)
            goto La0
        L6b:
            r0.f59689a = r6
            r0.f59690b = r8
            r0.f59693e = r3
            Ii.p r2 = new Ii.p
            dh.e r3 = eh.AbstractC5467b.d(r0)
            r2.<init>(r3, r5)
            r2.A()
            r6.T(r2)
            Ti.a r3 = r6.H()
            Ti.a.C0811a.c(r3, r4, r5, r4)
            java.lang.Object r2 = r2.u()
            java.lang.Object r3 = eh.AbstractC5467b.g()
            if (r2 != r3) goto L94
            kotlin.coroutines.jvm.internal.h.c(r0)
        L94:
            if (r2 != r1) goto L97
            return r1
        L97:
            r1 = r8
            r8 = r2
            r0 = r6
        L9a:
            boolean r2 = kotlin.jvm.internal.AbstractC6492s.d(r8, r1)
            if (r2 == 0) goto La3
        La0:
            Yg.J r8 = Yg.J.f24997a
            return r8
        La3:
            r2 = -9223372036854775808
            r0.f59632l = r2
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "snapTo() was canceled because state was changed to "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = " instead of "
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C7522c0.Z(dh.e):java.lang.Object");
    }

    public final Object B(Object obj, H h10, InterfaceC5380e interfaceC5380e) {
        Object objE;
        o0 o0Var = this.f59625e;
        return (o0Var != null && (objE = Z.e(this.f59631k, null, new d(o0Var, this, obj, h10, null), interfaceC5380e, 1, null)) == AbstractC5467b.g()) ? objE : Yg.J.f24997a;
    }

    public final Object F() {
        return this.f59624d;
    }

    public final InterfaceC3069n G() {
        return this.f59629i;
    }

    public final Ti.a H() {
        return this.f59630j;
    }

    public final float I() {
        return this.f59628h.c();
    }

    public final long J() {
        return this.f59626f;
    }

    public final void L() {
        p0.e().o(this, p0.f59831a, this.f59627g);
    }

    public final void M() {
        long j10 = this.f59626f;
        L();
        long j11 = this.f59626f;
        if (j10 != j11) {
            b bVar = this.f59634n;
            if (bVar == null) {
                if (j11 != 0) {
                    R();
                }
            } else {
                bVar.l(j11);
                if (bVar.a() == null) {
                    bVar.j(AbstractC7137b.f((1.0d - bVar.f().a(0)) * this.f59626f));
                }
            }
        }
    }

    public final Object P(float f10, Object obj, InterfaceC5380e interfaceC5380e) {
        boolean z10 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
        }
        if (!z10) {
            AbstractC7518a0.a("Expecting fraction between 0 and 1. Got " + f10);
        }
        o0 o0Var = this.f59625e;
        if (o0Var == null) {
            return Yg.J.f24997a;
        }
        Object objE = Z.e(this.f59631k, null, new h(obj, b(), this, o0Var, f10, null), interfaceC5380e, 1, null);
        return objE == AbstractC5467b.g() ? objE : Yg.J.f24997a;
    }

    public final void S(Object obj) {
        this.f59624d = obj;
    }

    public final void T(InterfaceC3069n interfaceC3069n) {
        this.f59629i = interfaceC3069n;
    }

    public void V(Object obj) {
        this.f59622b.setValue(obj);
    }

    public final void W(long j10) {
        this.f59626f = j10;
    }

    public final Object X(Object obj, InterfaceC5380e interfaceC5380e) {
        Object objE;
        o0 o0Var = this.f59625e;
        return o0Var == null ? Yg.J.f24997a : (!(AbstractC6492s.d(a(), obj) && AbstractC6492s.d(b(), obj)) && (objE = Z.e(this.f59631k, null, new i(obj, o0Var, null), interfaceC5380e, 1, null)) == AbstractC5467b.g()) ? objE : Yg.J.f24997a;
    }

    @Override // r.q0
    public Object a() {
        return this.f59623c.getValue();
    }

    @Override // r.q0
    public Object b() {
        return this.f59622b.getValue();
    }

    @Override // r.q0
    public void d(Object obj) {
        this.f59623c.setValue(obj);
    }

    @Override // r.q0
    public void f(o0 o0Var) {
        o0 o0Var2 = this.f59625e;
        if (!(o0Var2 == null || AbstractC6492s.d(o0Var, o0Var2))) {
            AbstractC7518a0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f59625e + ", new instance: " + o0Var);
        }
        this.f59625e = o0Var;
    }

    @Override // r.q0
    public void g() {
        this.f59625e = null;
        p0.e().k(this);
    }
}
