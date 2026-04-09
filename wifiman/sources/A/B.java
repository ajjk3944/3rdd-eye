package A;

import B.AbstractC2443g;
import B.C2438b;
import B.C2446j;
import B.E;
import B.L;
import B.M;
import C0.N;
import C0.O;
import Ii.AbstractC3063k;
import T.InterfaceC3551q0;
import T.o1;
import T.t1;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.runtime.snapshots.g;
import c0.AbstractC4172a;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6486l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import r.AbstractC7535j;
import r.AbstractC7537l;
import r.C7532h0;
import r.C7536k;
import r.m0;
import r.s0;
import r.u0;
import sh.C7974i;
import y.AbstractC8557l;
import y.InterfaceC8558m;

/* loaded from: classes.dex */
public final class B implements w.y {

    /* renamed from: y, reason: collision with root package name */
    public static final c f1y = new c(null);

    /* renamed from: z, reason: collision with root package name */
    private static final InterfaceC4182k f2z = AbstractC4172a.a(a.f27a, b.f28a);

    /* renamed from: a, reason: collision with root package name */
    private final w f3a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4b;

    /* renamed from: c, reason: collision with root package name */
    private s f5c;

    /* renamed from: d, reason: collision with root package name */
    private final z f6d;

    /* renamed from: e, reason: collision with root package name */
    private final A.f f7e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3551q0 f8f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC8558m f9g;

    /* renamed from: h, reason: collision with root package name */
    private float f10h;

    /* renamed from: i, reason: collision with root package name */
    private final w.y f11i;

    /* renamed from: j, reason: collision with root package name */
    private int f12j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13k;

    /* renamed from: l, reason: collision with root package name */
    private N f14l;

    /* renamed from: m, reason: collision with root package name */
    private final O f15m;

    /* renamed from: n, reason: collision with root package name */
    private final C2438b f16n;

    /* renamed from: o, reason: collision with root package name */
    private final LazyLayoutItemAnimator f17o;

    /* renamed from: p, reason: collision with root package name */
    private final C2446j f18p;

    /* renamed from: q, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.d f19q;

    /* renamed from: r, reason: collision with root package name */
    private final v f20r;

    /* renamed from: s, reason: collision with root package name */
    private final E f21s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3551q0 f22t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3551q0 f23u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3551q0 f24v;

    /* renamed from: w, reason: collision with root package name */
    private final InterfaceC3551q0 f25w;

    /* renamed from: x, reason: collision with root package name */
    private C7536k f26x;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(InterfaceC4184m interfaceC4184m, B b10) {
            return AbstractC3689v.o(Integer.valueOf(b10.r()), Integer.valueOf(b10.s()));
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B invoke(List list) {
            return new B(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC4182k a() {
            return B.f2z;
        }

        private c() {
        }
    }

    public static final class d implements v {
        d() {
        }

        @Override // A.v
        public d.b a(int i10) {
            g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
            B b10 = B.this;
            androidx.compose.runtime.snapshots.g gVarD = aVar.d();
            InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
            androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
            try {
                long jM = ((s) b10.f8f.getValue()).m();
                aVar.m(gVarD, gVarF, interfaceC6835lH);
                return B.this.C().e(i10, jM);
            } catch (Throwable th2) {
                aVar.m(gVarD, gVarF, interfaceC6835lH);
                throw th2;
            }
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f31b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10) {
            super(1);
            this.f31b = i10;
        }

        public final void a(L l10) {
            w wVar = B.this.f3a;
            int i10 = this.f31b;
            g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
            androidx.compose.runtime.snapshots.g gVarD = aVar.d();
            aVar.m(gVarD, aVar.f(gVarD), gVarD != null ? gVarD.h() : null);
            wVar.a(l10, i10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((L) obj);
            return J.f24997a;
        }
    }

    public static final class f implements O {
        f() {
        }

        @Override // C0.O
        public void X(N n10) {
            B.this.f14l = n10;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f33a;

        /* renamed from: b, reason: collision with root package name */
        Object f34b;

        /* renamed from: c, reason: collision with root package name */
        Object f35c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f36d;

        /* renamed from: f, reason: collision with root package name */
        int f38f;

        g(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36d = obj;
            this.f38f |= PduHandle.NONE;
            return B.this.c(null, null, this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f39a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f41c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f42d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, int i11, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f41c = i10;
            this.f42d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return B.this.new h(this.f41c, this.f42d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f39a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            B.this.N(this.f41c, this.f42d, true);
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w.v vVar, InterfaceC5380e interfaceC5380e) {
            return ((h) create(vVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {
        i() {
            super(1);
        }

        public final Float a(float f10) {
            return Float.valueOf(-B.this.I(-f10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).floatValue());
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f44a;

        j(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return B.this.new j(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f44a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C7536k c7536k = B.this.f26x;
                Float fC = kotlin.coroutines.jvm.internal.b.c(0.0f);
                C7532h0 c7532h0J = AbstractC7535j.j(0.0f, 400.0f, kotlin.coroutines.jvm.internal.b.c(0.5f), 1, null);
                this.f44a = 1;
                if (m0.j(c7536k, fC, c7532h0J, true, null, this, 8, null) == objG) {
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
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((j) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f46a;

        k(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return B.this.new k(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f46a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C7536k c7536k = B.this.f26x;
                Float fC = kotlin.coroutines.jvm.internal.b.c(0.0f);
                C7532h0 c7532h0J = AbstractC7535j.j(0.0f, 400.0f, kotlin.coroutines.jvm.internal.b.c(0.5f), 1, null);
                this.f46a = 1;
                if (m0.j(c7536k, fC, c7532h0J, true, null, this, 8, null) == objG) {
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
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((k) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public B(int i10, int i11, w wVar) {
        this.f3a = wVar;
        z zVar = new z(i10, i11);
        this.f6d = zVar;
        this.f7e = new A.f(this);
        this.f8f = o1.h(C.f49b, o1.j());
        this.f9g = AbstractC8557l.a();
        this.f11i = w.z.a(new i());
        this.f13k = true;
        this.f15m = new f();
        this.f16n = new C2438b();
        this.f17o = new LazyLayoutItemAnimator();
        this.f18p = new C2446j();
        this.f19q = new androidx.compose.foundation.lazy.layout.d(wVar.b(), new e(i10));
        this.f20r = new d();
        this.f21s = new E();
        zVar.b();
        this.f22t = M.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.f23u = t1.d(bool, null, 2, null);
        this.f24v = t1.d(bool, null, 2, null);
        this.f25w = M.c(null, 1, null);
        s0 s0VarF = u0.f(C6486l.f51726a);
        Float fValueOf = Float.valueOf(0.0f);
        this.f26x = AbstractC7537l.b(s0VarF, fValueOf, fValueOf, (56 & 8) != 0 ? Long.MIN_VALUE : 0L, (56 & 16) != 0 ? Long.MIN_VALUE : 0L, (56 & 32) != 0 ? false : false);
    }

    private final void H(float f10, q qVar) {
        if (this.f13k) {
            this.f3a.c(this.f20r, f10, qVar);
        }
    }

    public static /* synthetic */ Object K(B b10, int i10, int i11, InterfaceC5380e interfaceC5380e, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return b10.J(i10, i11, interfaceC5380e);
    }

    private void L(boolean z10) {
        this.f24v.setValue(Boolean.valueOf(z10));
    }

    private void M(boolean z10) {
        this.f23u.setValue(Boolean.valueOf(z10));
    }

    private final void O(float f10, Y0.d dVar, Ii.N n10) {
        if (f10 <= dVar.d1(C.f48a)) {
            return;
        }
        g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
        androidx.compose.runtime.snapshots.g gVarD = aVar.d();
        InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
        try {
            float fFloatValue = ((Number) this.f26x.getValue()).floatValue();
            if (this.f26x.r()) {
                this.f26x = AbstractC7537l.g(this.f26x, fFloatValue - f10, 0.0f, 0L, 0L, false, 30, null);
                AbstractC3063k.d(n10, null, null, new j(null), 3, null);
            } else {
                this.f26x = new C7536k(u0.f(C6486l.f51726a), Float.valueOf(-f10), null, 0L, 0L, false, 60, null);
                AbstractC3063k.d(n10, null, null, new k(null), 3, null);
            }
            aVar.m(gVarD, gVarF, interfaceC6835lH);
        } catch (Throwable th2) {
            aVar.m(gVarD, gVarF, interfaceC6835lH);
            throw th2;
        }
    }

    public static /* synthetic */ void n(B b10, s sVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        b10.m(sVar, z10, z11);
    }

    public final InterfaceC3551q0 A() {
        return this.f25w;
    }

    public final s B() {
        return this.f5c;
    }

    public final androidx.compose.foundation.lazy.layout.d C() {
        return this.f19q;
    }

    public final N D() {
        return this.f14l;
    }

    public final O E() {
        return this.f15m;
    }

    public final float F() {
        return ((Number) this.f26x.getValue()).floatValue();
    }

    public final float G() {
        return this.f10h;
    }

    public final float I(float f10) {
        if ((f10 < 0.0f && !e()) || (f10 > 0.0f && !d())) {
            return 0.0f;
        }
        if (Math.abs(this.f10h) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f10h).toString());
        }
        float f11 = this.f10h + f10;
        this.f10h = f11;
        if (Math.abs(f11) > 0.5f) {
            s sVar = (s) this.f8f.getValue();
            float f12 = this.f10h;
            int iRound = Math.round(f12);
            s sVar2 = this.f5c;
            boolean zW = sVar.w(iRound, !this.f4b);
            if (zW && sVar2 != null) {
                zW = sVar2.w(iRound, true);
            }
            if (zW) {
                m(sVar, this.f4b, true);
                M.d(this.f25w);
                H(f12 - this.f10h, sVar);
            } else {
                N n10 = this.f14l;
                if (n10 != null) {
                    n10.j();
                }
                H(f12 - this.f10h, w());
            }
        }
        if (Math.abs(this.f10h) <= 0.5f) {
            return f10;
        }
        float f13 = f10 - this.f10h;
        this.f10h = 0.0f;
        return f13;
    }

    public final Object J(int i10, int i11, InterfaceC5380e interfaceC5380e) {
        Object objB = w.y.b(this, null, new h(i10, i11, null), interfaceC5380e, 1, null);
        return objB == AbstractC5467b.g() ? objB : J.f24997a;
    }

    public final void N(int i10, int i11, boolean z10) {
        if (this.f6d.a() != i10 || this.f6d.c() != i11) {
            this.f17o.o();
        }
        this.f6d.d(i10, i11);
        if (!z10) {
            M.d(this.f22t);
            return;
        }
        N n10 = this.f14l;
        if (n10 != null) {
            n10.j();
        }
    }

    public final int P(m mVar, int i10) {
        return this.f6d.j(mVar, i10);
    }

    @Override // w.y
    public boolean a() {
        return this.f11i.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // w.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(s.EnumC7839L r6, mh.InterfaceC6839p r7, dh.InterfaceC5380e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof A.B.g
            if (r0 == 0) goto L13
            r0 = r8
            A.B$g r0 = (A.B.g) r0
            int r1 = r0.f38f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38f = r1
            goto L18
        L13:
            A.B$g r0 = new A.B$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f36d
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f38f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Yg.v.b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f35c
            r7 = r6
            mh.p r7 = (mh.InterfaceC6839p) r7
            java.lang.Object r6 = r0.f34b
            s.L r6 = (s.EnumC7839L) r6
            java.lang.Object r2 = r0.f33a
            A.B r2 = (A.B) r2
            Yg.v.b(r8)
            goto L5a
        L45:
            Yg.v.b(r8)
            B.b r8 = r5.f16n
            r0.f33a = r5
            r0.f34b = r6
            r0.f35c = r7
            r0.f38f = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            w.y r8 = r2.f11i
            r2 = 0
            r0.f33a = r2
            r0.f34b = r2
            r0.f35c = r2
            r0.f38f = r3
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            Yg.J r6 = Yg.J.f24997a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: A.B.c(s.L, mh.p, dh.e):java.lang.Object");
    }

    @Override // w.y
    public boolean d() {
        return ((Boolean) this.f24v.getValue()).booleanValue();
    }

    @Override // w.y
    public boolean e() {
        return ((Boolean) this.f23u.getValue()).booleanValue();
    }

    @Override // w.y
    public float f(float f10) {
        return this.f11i.f(f10);
    }

    public final Object l(int i10, int i11, InterfaceC5380e interfaceC5380e) {
        Object objD = AbstractC2443g.d(this.f7e, i10, i11, 100, q(), interfaceC5380e);
        return objD == AbstractC5467b.g() ? objD : J.f24997a;
    }

    public final void m(s sVar, boolean z10, boolean z11) {
        if (!z10 && this.f4b) {
            this.f5c = sVar;
            return;
        }
        if (z10) {
            this.f4b = true;
        }
        L(sVar.k());
        M(sVar.l());
        this.f10h -= sVar.n();
        this.f8f.setValue(sVar);
        if (z11) {
            this.f6d.i(sVar.u());
        } else {
            this.f6d.h(sVar);
            if (this.f13k) {
                this.f3a.d(this.f20r, sVar);
            }
        }
        if (z10) {
            O(sVar.v(), sVar.s(), sVar.o());
        }
        this.f12j++;
    }

    public final C2438b o() {
        return this.f16n;
    }

    public final C2446j p() {
        return this.f18p;
    }

    public final Y0.d q() {
        return ((s) this.f8f.getValue()).s();
    }

    public final int r() {
        return this.f6d.a();
    }

    public final int s() {
        return this.f6d.c();
    }

    public final boolean t() {
        return this.f4b;
    }

    public final InterfaceC8558m u() {
        return this.f9g;
    }

    public final LazyLayoutItemAnimator v() {
        return this.f17o;
    }

    public final q w() {
        return (q) this.f8f.getValue();
    }

    public final InterfaceC3551q0 x() {
        return this.f22t;
    }

    public final C7974i y() {
        return (C7974i) this.f6d.b().getValue();
    }

    public final E z() {
        return this.f21s;
    }

    public B(int i10, int i11) {
        this(i10, i11, x.b(0, 1, null));
    }
}
