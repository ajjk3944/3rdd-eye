package P;

import Ii.AbstractC3063k;
import Ii.AbstractC3092z;
import Ii.InterfaceC3088x;
import Ii.N;
import Ii.O;
import T.InterfaceC3551q0;
import T.t1;
import Yg.J;
import a1.AbstractC3751b;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6537m;
import m0.AbstractC6731u0;
import m0.C6733v0;
import mh.InterfaceC6839p;
import o0.InterfaceC7037d;
import o0.InterfaceC7039f;
import org.snmp4j.mp.PduHandle;
import r.AbstractC7519b;
import r.AbstractC7535j;
import r.C7517a;
import r.G;
import r.r0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private C6531g f17901a;

    /* renamed from: b, reason: collision with root package name */
    private final float f17902b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17903c;

    /* renamed from: d, reason: collision with root package name */
    private Float f17904d;

    /* renamed from: e, reason: collision with root package name */
    private C6531g f17905e;

    /* renamed from: f, reason: collision with root package name */
    private final C7517a f17906f;

    /* renamed from: g, reason: collision with root package name */
    private final C7517a f17907g;

    /* renamed from: h, reason: collision with root package name */
    private final C7517a f17908h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3088x f17909i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3551q0 f17910j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3551q0 f17911k;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f17912a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f17913b;

        /* renamed from: d, reason: collision with root package name */
        int f17915d;

        a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17913b = obj;
            this.f17915d |= PduHandle.NONE;
            return h.this.d(this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f17916a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f17917b;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f17919a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f17920b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f17920b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f17920b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f17919a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    C7517a c7517a = this.f17920b.f17906f;
                    Float fC = kotlin.coroutines.jvm.internal.b.c(1.0f);
                    r0 r0VarL = AbstractC7535j.l(75, 0, G.d(), 2, null);
                    this.f17919a = 1;
                    if (C7517a.f(c7517a, fC, r0VarL, null, null, this, 12, null) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: P.h$b$b, reason: collision with other inner class name */
        static final class C0630b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f17921a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f17922b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0630b(h hVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f17922b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C0630b(this.f17922b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f17921a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    C7517a c7517a = this.f17922b.f17907g;
                    Float fC = kotlin.coroutines.jvm.internal.b.c(1.0f);
                    r0 r0VarL = AbstractC7535j.l(225, 0, G.c(), 2, null);
                    this.f17921a = 1;
                    if (C7517a.f(c7517a, fC, r0VarL, null, null, this, 12, null) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((C0630b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f17923a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f17924b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(h hVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f17924b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new c(this.f17924b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f17923a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    C7517a c7517a = this.f17924b.f17908h;
                    Float fC = kotlin.coroutines.jvm.internal.b.c(1.0f);
                    r0 r0VarL = AbstractC7535j.l(225, 0, G.d(), 2, null);
                    this.f17923a = 1;
                    if (C7517a.f(c7517a, fC, r0VarL, null, null, this, 12, null) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = h.this.new b(interfaceC5380e);
            bVar.f17917b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f17916a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            N n10 = (N) this.f17917b;
            AbstractC3063k.d(n10, null, null, new a(h.this, null), 3, null);
            AbstractC3063k.d(n10, null, null, new C0630b(h.this, null), 3, null);
            return AbstractC3063k.d(n10, null, null, new c(h.this, null), 3, null);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f17925a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f17926b;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f17928a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f17929b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f17929b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f17929b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f17928a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    C7517a c7517a = this.f17929b.f17906f;
                    Float fC = kotlin.coroutines.jvm.internal.b.c(0.0f);
                    r0 r0VarL = AbstractC7535j.l(150, 0, G.d(), 2, null);
                    this.f17928a = 1;
                    if (C7517a.f(c7517a, fC, r0VarL, null, null, this, 12, null) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            c cVar = h.this.new c(interfaceC5380e);
            cVar.f17926b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f17925a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            return AbstractC3063k.d((N) this.f17926b, null, null, new a(h.this, null), 3, null);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public /* synthetic */ h(C6531g c6531g, float f10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c6531g, f10, z10);
    }

    private final Object f(InterfaceC5380e interfaceC5380e) {
        Object objG = O.g(new b(null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    private final Object g(InterfaceC5380e interfaceC5380e) {
        Object objG = O.g(new c(null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    private final boolean i() {
        return ((Boolean) this.f17911k.getValue()).booleanValue();
    }

    private final boolean j() {
        return ((Boolean) this.f17910j.getValue()).booleanValue();
    }

    private final void k(boolean z10) {
        this.f17911k.setValue(Boolean.valueOf(z10));
    }

    private final void l(boolean z10) {
        this.f17910j.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(dh.InterfaceC5380e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof P.h.a
            if (r0 == 0) goto L13
            r0 = r7
            P.h$a r0 = (P.h.a) r0
            int r1 = r0.f17915d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17915d = r1
            goto L18
        L13:
            P.h$a r0 = new P.h$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17913b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f17915d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            Yg.v.b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.f17912a
            P.h r2 = (P.h) r2
            Yg.v.b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.f17912a
            P.h r2 = (P.h) r2
            Yg.v.b(r7)
            goto L56
        L47:
            Yg.v.b(r7)
            r0.f17912a = r6
            r0.f17915d = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r2.l(r5)
            Ii.x r7 = r2.f17909i
            r0.f17912a = r2
            r0.f17915d = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r7 = 0
            r0.f17912a = r7
            r0.f17915d = r3
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            Yg.J r7 = Yg.J.f24997a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: P.h.d(dh.e):java.lang.Object");
    }

    public final void e(InterfaceC7039f interfaceC7039f, long j10) {
        if (this.f17904d == null) {
            this.f17904d = Float.valueOf(i.b(interfaceC7039f.c()));
        }
        if (this.f17901a == null) {
            this.f17901a = C6531g.d(interfaceC7039f.D1());
        }
        if (this.f17905e == null) {
            this.f17905e = C6531g.d(AbstractC6532h.a(C6537m.i(interfaceC7039f.c()) / 2.0f, C6537m.g(interfaceC7039f.c()) / 2.0f));
        }
        float fFloatValue = (!i() || j()) ? ((Number) this.f17906f.m()).floatValue() : 1.0f;
        Float f10 = this.f17904d;
        AbstractC6492s.f(f10);
        float fB = AbstractC3751b.b(f10.floatValue(), this.f17902b, ((Number) this.f17907g.m()).floatValue());
        C6531g c6531g = this.f17901a;
        AbstractC6492s.f(c6531g);
        float fM = C6531g.m(c6531g.v());
        C6531g c6531g2 = this.f17905e;
        AbstractC6492s.f(c6531g2);
        float fB2 = AbstractC3751b.b(fM, C6531g.m(c6531g2.v()), ((Number) this.f17908h.m()).floatValue());
        C6531g c6531g3 = this.f17901a;
        AbstractC6492s.f(c6531g3);
        float fN = C6531g.n(c6531g3.v());
        C6531g c6531g4 = this.f17905e;
        AbstractC6492s.f(c6531g4);
        long jA = AbstractC6532h.a(fB2, AbstractC3751b.b(fN, C6531g.n(c6531g4.v()), ((Number) this.f17908h.m()).floatValue()));
        long jK = C6733v0.k(j10, C6733v0.n(j10) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.f17903c) {
            InterfaceC7039f.P1(interfaceC7039f, jK, fB, jA, 0.0f, null, null, 0, 120, null);
            return;
        }
        float fI = C6537m.i(interfaceC7039f.c());
        float fG = C6537m.g(interfaceC7039f.c());
        int iB = AbstractC6731u0.f52948a.b();
        InterfaceC7037d interfaceC7037dK1 = interfaceC7039f.k1();
        long jC = interfaceC7037dK1.c();
        interfaceC7037dK1.d().j();
        try {
            interfaceC7037dK1.e().b(0.0f, 0.0f, fI, fG, iB);
            InterfaceC7039f.P1(interfaceC7039f, jK, fB, jA, 0.0f, null, null, 0, 120, null);
        } finally {
            interfaceC7037dK1.d().r();
            interfaceC7037dK1.f(jC);
        }
    }

    public final void h() {
        k(true);
        this.f17909i.S(J.f24997a);
    }

    private h(C6531g c6531g, float f10, boolean z10) {
        this.f17901a = c6531g;
        this.f17902b = f10;
        this.f17903c = z10;
        this.f17906f = AbstractC7519b.b(0.0f, 0.0f, 2, null);
        this.f17907g = AbstractC7519b.b(0.0f, 0.0f, 2, null);
        this.f17908h = AbstractC7519b.b(0.0f, 0.0f, 2, null);
        this.f17909i = AbstractC3092z.a(null);
        Boolean bool = Boolean.FALSE;
        this.f17910j = t1.d(bool, null, 2, null);
        this.f17911k = t1.d(bool, null, 2, null);
    }
}
