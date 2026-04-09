package w;

import E0.AbstractC2631i;
import E0.AbstractC2633k;
import E0.InterfaceC2630h;
import Ii.A0;
import Ii.AbstractC3063k;
import Ii.B0;
import Ii.C3073p;
import Ii.InterfaceC3069n;
import Ii.InterfaceC3091y0;
import Ii.N;
import Ii.P;
import Yg.J;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6533i;
import l0.C6537m;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import s.EnumC7839L;

/* renamed from: w.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8245f extends e.c implements D.c, E0.A, InterfaceC2630h {

    /* renamed from: n, reason: collision with root package name */
    private q f63862n;

    /* renamed from: o, reason: collision with root package name */
    private final C8234A f63863o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f63864p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC8243d f63865q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f63866r;

    /* renamed from: t, reason: collision with root package name */
    private C0.r f63868t;

    /* renamed from: u, reason: collision with root package name */
    private C6533i f63869u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f63870v;

    /* renamed from: x, reason: collision with root package name */
    private boolean f63872x;

    /* renamed from: s, reason: collision with root package name */
    private final C8242c f63867s = new C8242c();

    /* renamed from: w, reason: collision with root package name */
    private long f63871w = Y0.r.f24545b.a();

    /* renamed from: w.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6824a f63873a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3069n f63874b;

        public a(InterfaceC6824a interfaceC6824a, InterfaceC3069n interfaceC3069n) {
            this.f63873a = interfaceC6824a;
            this.f63874b = interfaceC3069n;
        }

        public final InterfaceC3069n a() {
            return this.f63874b;
        }

        public final InterfaceC6824a b() {
            return this.f63873a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                Ii.n r0 = r4.f63874b
                dh.i r0 = r0.getContext()
                Ii.M$a r1 = Ii.M.f9275c
                dh.i$b r0 = r0.get(r1)
                Ii.M r0 = (Ii.M) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.Y()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = kotlin.text.AbstractC6507a.a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                kotlin.jvm.internal.AbstractC6492s.h(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L50
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L52
            L50:
                java.lang.String r0 = "("
            L52:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                mh.a r0 = r4.f63873a
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                Ii.n r0 = r4.f63874b
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: w.C8245f.a.toString():java.lang.String");
        }
    }

    /* renamed from: w.f$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63875a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f63875a = iArr;
        }
    }

    /* renamed from: w.f$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f63876a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f63877b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f63879d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC8243d f63880e;

        /* renamed from: w.f$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f63881a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f63882b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ G f63883c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C8245f f63884d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC8243d f63885e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC3091y0 f63886f;

            /* renamed from: w.f$c$a$a, reason: collision with other inner class name */
            static final class C2273a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C8245f f63887a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ G f63888b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC3091y0 f63889c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ p f63890d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2273a(C8245f c8245f, G g10, InterfaceC3091y0 interfaceC3091y0, p pVar) {
                    super(1);
                    this.f63887a = c8245f;
                    this.f63888b = g10;
                    this.f63889c = interfaceC3091y0;
                    this.f63890d = pVar;
                }

                public final void a(float f10) {
                    float f11 = this.f63887a.f63864p ? 1.0f : -1.0f;
                    C8234A c8234a = this.f63887a.f63863o;
                    float fA = f11 * c8234a.A(c8234a.u(this.f63890d.b(c8234a.u(c8234a.B(f11 * f10)), x0.e.f65322a.b())));
                    if (Math.abs(fA) < Math.abs(f10)) {
                        B0.e(this.f63889c, "Scroll animation cancelled because scroll was not consumed (" + fA + " < " + f10 + ')', null, 2, null);
                    }
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((Number) obj).floatValue());
                    return J.f24997a;
                }
            }

            /* renamed from: w.f$c$a$b */
            static final class b extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C8245f f63891a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ G f63892b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC8243d f63893c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C8245f c8245f, G g10, InterfaceC8243d interfaceC8243d) {
                    super(0);
                    this.f63891a = c8245f;
                    this.f63892b = g10;
                    this.f63893c = interfaceC8243d;
                }

                public final void a() {
                    C8242c c8242c = this.f63891a.f63867s;
                    C8245f c8245f = this.f63891a;
                    while (true) {
                        if (!c8242c.f63849a.u()) {
                            break;
                        }
                        C6533i c6533i = (C6533i) ((a) c8242c.f63849a.v()).b().invoke();
                        if (!(c6533i == null ? true : C8245f.V2(c8245f, c6533i, 0L, 1, null))) {
                            break;
                        } else {
                            ((a) c8242c.f63849a.z(c8242c.f63849a.o() - 1)).a().resumeWith(Yg.u.c(J.f24997a));
                        }
                    }
                    if (this.f63891a.f63870v) {
                        C6533i c6533iS2 = this.f63891a.S2();
                        if (c6533iS2 != null && C8245f.V2(this.f63891a, c6533iS2, 0L, 1, null)) {
                            this.f63891a.f63870v = false;
                        }
                    }
                    this.f63892b.j(this.f63891a.N2(this.f63893c));
                }

                @Override // mh.InterfaceC6824a
                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(G g10, C8245f c8245f, InterfaceC8243d interfaceC8243d, InterfaceC3091y0 interfaceC3091y0, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f63883c = g10;
                this.f63884d = c8245f;
                this.f63885e = interfaceC8243d;
                this.f63886f = interfaceC3091y0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f63883c, this.f63884d, this.f63885e, this.f63886f, interfaceC5380e);
                aVar.f63882b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f63881a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    p pVar = (p) this.f63882b;
                    this.f63883c.j(this.f63884d.N2(this.f63885e));
                    G g10 = this.f63883c;
                    C2273a c2273a = new C2273a(this.f63884d, g10, this.f63886f, pVar);
                    b bVar = new b(this.f63884d, this.f63883c, this.f63885e);
                    this.f63881a = 1;
                    if (g10.h(c2273a, bVar, this) == objG) {
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
            public final Object invoke(p pVar, InterfaceC5380e interfaceC5380e) {
                return ((a) create(pVar, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(G g10, InterfaceC8243d interfaceC8243d, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63879d = g10;
            this.f63880e = interfaceC8243d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            c cVar = C8245f.this.new c(this.f63879d, this.f63880e, interfaceC5380e);
            cVar.f63877b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f63876a;
            try {
                try {
                    if (i10 == 0) {
                        Yg.v.b(obj);
                        InterfaceC3091y0 interfaceC3091y0M = A0.m(((N) this.f63877b).getCoroutineContext());
                        C8245f.this.f63872x = true;
                        C8234A c8234a = C8245f.this.f63863o;
                        EnumC7839L enumC7839L = EnumC7839L.Default;
                        a aVar = new a(this.f63879d, C8245f.this, this.f63880e, interfaceC3091y0M, null);
                        this.f63876a = 1;
                        if (c8234a.v(enumC7839L, aVar, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Yg.v.b(obj);
                    }
                    C8245f.this.f63867s.d();
                    C8245f.this.f63872x = false;
                    C8245f.this.f63867s.b(null);
                    C8245f.this.f63870v = false;
                    return J.f24997a;
                } catch (CancellationException e10) {
                    throw e10;
                }
            } catch (Throwable th2) {
                C8245f.this.f63872x = false;
                C8245f.this.f63867s.b(null);
                C8245f.this.f63870v = false;
                throw th2;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public C8245f(q qVar, C8234A c8234a, boolean z10, InterfaceC8243d interfaceC8243d) {
        this.f63862n = qVar;
        this.f63863o = c8234a;
        this.f63864p = z10;
        this.f63865q = interfaceC8243d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float N2(InterfaceC8243d interfaceC8243d) {
        if (Y0.r.e(this.f63871w, Y0.r.f24545b.a())) {
            return 0.0f;
        }
        C6533i c6533iR2 = R2();
        if (c6533iR2 == null) {
            c6533iR2 = this.f63870v ? S2() : null;
            if (c6533iR2 == null) {
                return 0.0f;
            }
        }
        long jD = Y0.s.d(this.f63871w);
        int i10 = b.f63875a[this.f63862n.ordinal()];
        if (i10 == 1) {
            return interfaceC8243d.a(c6533iR2.n(), c6533iR2.e() - c6533iR2.n(), C6537m.g(jD));
        }
        if (i10 == 2) {
            return interfaceC8243d.a(c6533iR2.k(), c6533iR2.l() - c6533iR2.k(), C6537m.i(jD));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int O2(long j10, long j11) {
        int i10 = b.f63875a[this.f63862n.ordinal()];
        if (i10 == 1) {
            return AbstractC6492s.k(Y0.r.f(j10), Y0.r.f(j11));
        }
        if (i10 == 2) {
            return AbstractC6492s.k(Y0.r.g(j10), Y0.r.g(j11));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int P2(long j10, long j11) {
        int i10 = b.f63875a[this.f63862n.ordinal()];
        if (i10 == 1) {
            return Float.compare(C6537m.g(j10), C6537m.g(j11));
        }
        if (i10 == 2) {
            return Float.compare(C6537m.i(j10), C6537m.i(j11));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final C6533i Q2(C6533i c6533i, long j10) {
        return c6533i.x(C6531g.u(Y2(c6533i, j10)));
    }

    private final C6533i R2() {
        V.b bVar = this.f63867s.f63849a;
        int iO = bVar.o();
        C6533i c6533i = null;
        if (iO > 0) {
            int i10 = iO - 1;
            Object[] objArrM = bVar.m();
            do {
                C6533i c6533i2 = (C6533i) ((a) objArrM[i10]).b().invoke();
                if (c6533i2 != null) {
                    if (P2(c6533i2.m(), Y0.s.d(this.f63871w)) > 0) {
                        return c6533i == null ? c6533i2 : c6533i;
                    }
                    c6533i = c6533i2;
                }
                i10--;
            } while (i10 >= 0);
        }
        return c6533i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6533i S2() {
        if (!k2()) {
            return null;
        }
        C0.r rVarK = AbstractC2633k.k(this);
        C0.r rVar = this.f63868t;
        if (rVar != null) {
            if (!rVar.M()) {
                rVar = null;
            }
            if (rVar != null) {
                return rVarK.J(rVar, false);
            }
        }
        return null;
    }

    private final boolean U2(C6533i c6533i, long j10) {
        long jY2 = Y2(c6533i, j10);
        return Math.abs(C6531g.m(jY2)) <= 0.5f && Math.abs(C6531g.n(jY2)) <= 0.5f;
    }

    static /* synthetic */ boolean V2(C8245f c8245f, C6533i c6533i, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = c8245f.f63871w;
        }
        return c8245f.U2(c6533i, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W2() {
        InterfaceC8243d interfaceC8243dZ2 = Z2();
        if (this.f63872x) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        AbstractC3063k.d(d2(), null, P.UNDISPATCHED, new c(new G(interfaceC8243dZ2.b()), interfaceC8243dZ2, null), 1, null);
    }

    private final long Y2(C6533i c6533i, long j10) {
        long jD = Y0.s.d(j10);
        int i10 = b.f63875a[this.f63862n.ordinal()];
        if (i10 == 1) {
            return AbstractC6532h.a(0.0f, Z2().a(c6533i.n(), c6533i.e() - c6533i.n(), C6537m.g(jD)));
        }
        if (i10 == 2) {
            return AbstractC6532h.a(Z2().a(c6533i.k(), c6533i.l() - c6533i.k(), C6537m.i(jD)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC8243d Z2() {
        InterfaceC8243d interfaceC8243d = this.f63865q;
        return interfaceC8243d == null ? (InterfaceC8243d) AbstractC2631i.a(this, AbstractC8244e.a()) : interfaceC8243d;
    }

    @Override // D.c
    public Object K0(InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
        C6533i c6533i = (C6533i) interfaceC6824a.invoke();
        if (c6533i == null || V2(this, c6533i, 0L, 1, null)) {
            return J.f24997a;
        }
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        if (this.f63867s.c(new a(interfaceC6824a, c3073p)) && !this.f63872x) {
            W2();
        }
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU == AbstractC5467b.g() ? objU : J.f24997a;
    }

    public final long T2() {
        return this.f63871w;
    }

    public final void X2(C0.r rVar) {
        this.f63868t = rVar;
    }

    @Override // E0.A
    public void a0(long j10) {
        C6533i c6533iS2;
        long j11 = this.f63871w;
        this.f63871w = j10;
        if (O2(j10, j11) < 0 && (c6533iS2 = S2()) != null) {
            C6533i c6533i = this.f63869u;
            if (c6533i == null) {
                c6533i = c6533iS2;
            }
            if (!this.f63872x && !this.f63870v && U2(c6533i, j11) && !U2(c6533iS2, j10)) {
                this.f63870v = true;
                W2();
            }
            this.f63869u = c6533iS2;
        }
    }

    public final void a3(q qVar, boolean z10, InterfaceC8243d interfaceC8243d) {
        this.f63862n = qVar;
        this.f63864p = z10;
        this.f63865q = interfaceC8243d;
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return this.f63866r;
    }

    @Override // D.c
    public C6533i w0(C6533i c6533i) {
        if (Y0.r.e(this.f63871w, Y0.r.f24545b.a())) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return Q2(c6533i, this.f63871w);
    }
}
