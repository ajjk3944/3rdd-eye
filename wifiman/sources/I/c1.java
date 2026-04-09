package I;

import E0.AbstractC2631i;
import E0.AbstractC2635m;
import E0.InterfaceC2630h;
import E0.InterfaceC2641t;
import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.E1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6533i;
import m0.AbstractC6713l0;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.InterfaceC7036c;
import o0.InterfaceC7039f;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public final class c1 extends AbstractC2635m implements E0.B, E0.r, InterfaceC2630h, InterfaceC2641t, E0.v0 {

    /* renamed from: A, reason: collision with root package name */
    private L0.S f8186A;

    /* renamed from: C, reason: collision with root package name */
    private int f8188C;

    /* renamed from: D, reason: collision with root package name */
    private final J.f f8189D;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8190p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8191q;

    /* renamed from: r, reason: collision with root package name */
    private l1 f8192r;

    /* renamed from: s, reason: collision with root package name */
    private o1 f8193s;

    /* renamed from: t, reason: collision with root package name */
    private J.j f8194t;

    /* renamed from: u, reason: collision with root package name */
    private AbstractC6713l0 f8195u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f8196v;

    /* renamed from: w, reason: collision with root package name */
    private androidx.compose.foundation.o f8197w;

    /* renamed from: x, reason: collision with root package name */
    private w.q f8198x;

    /* renamed from: z, reason: collision with root package name */
    private InterfaceC3091y0 f8200z;

    /* renamed from: y, reason: collision with root package name */
    private final G f8199y = new G();

    /* renamed from: B, reason: collision with root package name */
    private C6533i f8187B = new C6533i(-1.0f, -1.0f, -1.0f, -1.0f);

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f8202b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8203c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f8204d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.m mVar, int i10, androidx.compose.ui.layout.t tVar) {
            super(1);
            this.f8202b = mVar;
            this.f8203c = i10;
            this.f8204d = tVar;
        }

        public final void a(t.a aVar) {
            c1.this.Y2(this.f8202b, this.f8203c, this.f8204d.I0(), c1.this.f8193s.l().f(), this.f8202b.getLayoutDirection());
            t.a.l(aVar, this.f8204d, -c1.this.f8197w.m(), 0, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f8206b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8207c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f8208d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.layout.m mVar, int i10, androidx.compose.ui.layout.t tVar) {
            super(1);
            this.f8206b = mVar;
            this.f8207c = i10;
            this.f8208d = tVar;
        }

        public final void a(t.a aVar) {
            c1.this.Y2(this.f8206b, this.f8207c, this.f8208d.C0(), c1.this.f8193s.l().f(), this.f8206b.getLayoutDirection());
            t.a.l(aVar, this.f8208d, 0, -c1.this.f8197w.m(), 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8209a;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c1 f8211a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.L f8212b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c1 c1Var, kotlin.jvm.internal.L l10) {
                super(0);
                this.f8211a = c1Var;
                this.f8212b = l10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                this.f8211a.f8193s.l();
                Integer numValueOf = Integer.valueOf(((this.f8211a.k2() && ((E1) AbstractC2631i.a(this.f8211a, AbstractC3932k0.u())).a()) ? 1 : 2) * this.f8212b.f51687a);
                this.f8212b.f51687a *= -1;
                return numValueOf;
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f8213a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ int f8214b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c1 f8215c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c1 c1Var, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f8215c = c1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                b bVar = new b(this.f8215c, interfaceC5380e);
                bVar.f8214b = ((Number) obj).intValue();
                return bVar;
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n(((Number) obj).intValue(), (InterfaceC5380e) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f8213a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    if (Math.abs(this.f8214b) == 1) {
                        G g10 = this.f8215c.f8199y;
                        this.f8213a = 1;
                        if (g10.f(this) == objG) {
                            return objG;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return Yg.J.f24997a;
            }

            public final Object n(int i10, InterfaceC5380e interfaceC5380e) {
                return ((b) create(Integer.valueOf(i10), interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return c1.this.new c(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f8209a;
            if (i10 == 0) {
                Yg.v.b(obj);
                kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
                l10.f51687a = 1;
                InterfaceC3220g interfaceC3220gO = T.o1.o(new a(c1.this, l10));
                b bVar = new b(c1.this, null);
                this.f8209a = 1;
                if (AbstractC3222i.i(interfaceC3220gO, bVar, this) == objG) {
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
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8216a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f8218c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C6533i f8219d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f10, C6533i c6533i, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f8218c = f10;
            this.f8219d = c6533i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return c1.this.new d(this.f8218c, this.f8219d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f8216a;
            if (i10 == 0) {
                Yg.v.b(obj);
                androidx.compose.foundation.o oVar = c1.this.f8197w;
                float f10 = b1.f(this.f8218c);
                this.f8216a = 1;
                if (w.u.b(oVar, f10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    return Yg.J.f24997a;
                }
                Yg.v.b(obj);
            }
            D.b bVarC = c1.this.f8192r.c();
            C6533i c6533i = this.f8219d;
            this.f8216a = 2;
            if (bVarC.a(c6533i, this) == objG) {
                return objG;
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public c1(boolean z10, boolean z11, l1 l1Var, o1 o1Var, J.j jVar, AbstractC6713l0 abstractC6713l0, boolean z12, androidx.compose.foundation.o oVar, w.q qVar) {
        this.f8190p = z10;
        this.f8191q = z11;
        this.f8192r = l1Var;
        this.f8193s = o1Var;
        this.f8194t = jVar;
        this.f8195u = abstractC6713l0;
        this.f8196v = z12;
        this.f8197w = oVar;
        this.f8198x = qVar;
        this.f8189D = (J.f) D2(J.a.a(this.f8193s, this.f8194t, this.f8192r, this.f8190p || this.f8191q));
    }

    private final int O2(long j10, int i10) {
        L0.S s10 = this.f8186A;
        if (s10 == null || L0.S.i(j10) != L0.S.i(s10.r())) {
            return L0.S.i(j10);
        }
        L0.S s11 = this.f8186A;
        if (s11 == null || L0.S.n(j10) != L0.S.n(s11.r())) {
            return L0.S.n(j10);
        }
        if (i10 != this.f8188C) {
            return L0.S.n(j10);
        }
        return -1;
    }

    private final void P2(InterfaceC7039f interfaceC7039f) {
        float fD = this.f8199y.d();
        if (fD != 0.0f && T2()) {
            C6533i c6533iT = this.f8194t.T();
            InterfaceC7039f.i0(interfaceC7039f, this.f8195u, c6533iT.o(), c6533iT.f(), c6533iT.r(), 0, null, fD, null, 0, 432, null);
        }
    }

    private final void Q2(InterfaceC7039f interfaceC7039f, Yg.s sVar, L0.M m10) {
        int i10 = ((H.n) sVar.a()).i();
        long jR = ((L0.S) sVar.c()).r();
        if (L0.S.h(jR)) {
            return;
        }
        m0.U0 u0Z = m10.z(L0.S.l(jR), L0.S.k(jR));
        if (!H.n.f(i10, H.n.f7567b.a())) {
            InterfaceC7039f.C1(interfaceC7039f, u0Z, ((M.K) AbstractC2631i.a(this, M.L.b())).a(), 0.0f, null, null, 0, 60, null);
            return;
        }
        AbstractC6713l0 abstractC6713l0G = m10.l().i().g();
        if (abstractC6713l0G != null) {
            InterfaceC7039f.R0(interfaceC7039f, u0Z, abstractC6713l0G, 0.2f, null, null, 0, 56, null);
            return;
        }
        long jH = m10.l().i().h();
        if (jH == 16) {
            jH = C6733v0.f52951b.a();
        }
        long j10 = jH;
        InterfaceC7039f.C1(interfaceC7039f, u0Z, C6733v0.k(j10, C6733v0.n(j10) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, null, 0, 60, null);
    }

    private final void R2(InterfaceC7039f interfaceC7039f, long j10, L0.M m10) {
        int iL = L0.S.l(j10);
        int iK = L0.S.k(j10);
        if (iL != iK) {
            InterfaceC7039f.C1(interfaceC7039f, m10.z(iL, iK), ((M.K) AbstractC2631i.a(this, M.L.b())).a(), 0.0f, null, null, 0, 60, null);
        }
    }

    private final void S2(InterfaceC7039f interfaceC7039f, L0.M m10) {
        L0.Q.f11102a.a(interfaceC7039f.k1().d(), m10);
    }

    private final boolean T2() {
        return this.f8196v && (this.f8190p || this.f8191q) && b1.e(this.f8195u);
    }

    private final C0.D U2(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        androidx.compose.ui.layout.t tVarT = b10.T(Y0.b.d(j10, 0, MPv3.MAX_MESSAGE_ID, 0, 0, 13, null));
        int iMin = Math.min(tVarT.I0(), Y0.b.l(j10));
        return androidx.compose.ui.layout.m.x0(mVar, iMin, tVarT.C0(), null, new a(mVar, iMin, tVarT), 4, null);
    }

    private final C0.D V2(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        androidx.compose.ui.layout.t tVarT = b10.T(Y0.b.d(j10, 0, 0, 0, MPv3.MAX_MESSAGE_ID, 7, null));
        int iMin = Math.min(tVarT.C0(), Y0.b.k(j10));
        return androidx.compose.ui.layout.m.x0(mVar, tVarT.I0(), iMin, null, new b(mVar, iMin, tVarT), 4, null);
    }

    private final void W2() {
        this.f8200z = AbstractC3063k.d(d2(), null, null, new c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y2(Y0.d r9, int r10, int r11, long r12, Y0.t r14) {
        /*
            r8 = this;
            int r0 = r11 - r10
            androidx.compose.foundation.o r1 = r8.f8197w
            r1.n(r0)
            int r0 = r8.O2(r12, r11)
            if (r0 < 0) goto Lc5
            boolean r1 = r8.T2()
            if (r1 != 0) goto L15
            goto Lc5
        L15:
            I.l1 r1 = r8.f8192r
            L0.M r1 = r1.f()
            if (r1 != 0) goto L1e
            return
        L1e:
            sh.i r2 = new sh.i
            L0.L r3 = r1.l()
            L0.d r3 = r3.j()
            int r3 = r3.length()
            r4 = 0
            r2.<init>(r4, r3)
            int r0 = sh.AbstractC7978m.l(r0, r2)
            l0.i r0 = r1.e(r0)
            Y0.t r1 = Y0.t.Rtl
            r2 = 1
            if (r14 != r1) goto L3f
            r14 = r2
            goto L40
        L3f:
            r14 = r4
        L40:
            l0.i r9 = I.b1.a(r9, r0, r14, r11)
            float r14 = r9.k()
            l0.i r1 = r8.f8187B
            float r1 = r1.k()
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L64
            float r14 = r9.n()
            l0.i r1 = r8.f8187B
            float r1 = r1.n()
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L64
            int r14 = r8.f8188C
            if (r11 == r14) goto Lc5
        L64:
            w.q r14 = r8.f8198x
            w.q r1 = w.q.Vertical
            if (r14 != r1) goto L6b
            r4 = r2
        L6b:
            if (r4 == 0) goto L72
            float r14 = r9.n()
            goto L76
        L72:
            float r14 = r9.k()
        L76:
            if (r4 == 0) goto L7d
            float r1 = r9.e()
            goto L81
        L7d:
            float r1 = r9.l()
        L81:
            androidx.compose.foundation.o r2 = r8.f8197w
            int r2 = r2.m()
            int r3 = r2 + r10
            float r3 = (float) r3
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L90
        L8e:
            float r1 = r1 - r3
            goto La9
        L90:
            float r2 = (float) r2
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 >= 0) goto L9d
            float r5 = r1 - r14
            float r6 = (float) r10
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L9d
            goto L8e
        L9d:
            if (r4 >= 0) goto La8
            float r1 = r1 - r14
            float r10 = (float) r10
            int r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r10 > 0) goto La8
            float r1 = r14 - r2
            goto La9
        La8:
            r1 = 0
        La9:
            L0.S r10 = L0.S.b(r12)
            r8.f8186A = r10
            r8.f8187B = r9
            r8.f8188C = r11
            Ii.N r2 = r8.d2()
            Ii.P r4 = Ii.P.UNDISPATCHED
            I.c1$d r5 = new I.c1$d
            r9 = 0
            r5.<init>(r1, r0, r9)
            r6 = 1
            r7 = 0
            r3 = 0
            Ii.AbstractC3059i.d(r2, r3, r4, r5, r6, r7)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I.c1.Y2(Y0.d, int, int, long, Y0.t):void");
    }

    @Override // E0.InterfaceC2641t
    public void B(C0.r rVar) {
        this.f8192r.m(rVar);
        this.f8189D.B(rVar);
    }

    @Override // E0.r
    public void J(InterfaceC7036c interfaceC7036c) {
        interfaceC7036c.X1();
        H.h hVarL = this.f8193s.l();
        L0.M mF = this.f8192r.f();
        if (mF == null) {
            return;
        }
        Yg.s sVarD = hVarL.d();
        if (sVarD != null) {
            Q2(interfaceC7036c, sVarD, mF);
        }
        if (L0.S.h(hVarL.f())) {
            S2(interfaceC7036c, mF);
            if (hVarL.h()) {
                P2(interfaceC7036c);
            }
        } else {
            if (hVarL.h()) {
                R2(interfaceC7036c, hVarL.f(), mF);
            }
            S2(interfaceC7036c, mF);
        }
        this.f8189D.J(interfaceC7036c);
    }

    public final void X2(boolean z10, boolean z11, l1 l1Var, o1 o1Var, J.j jVar, AbstractC6713l0 abstractC6713l0, boolean z12, androidx.compose.foundation.o oVar, w.q qVar) {
        boolean zT2 = T2();
        boolean z13 = this.f8190p;
        o1 o1Var2 = this.f8193s;
        l1 l1Var2 = this.f8192r;
        J.j jVar2 = this.f8194t;
        androidx.compose.foundation.o oVar2 = this.f8197w;
        this.f8190p = z10;
        this.f8191q = z11;
        this.f8192r = l1Var;
        this.f8193s = o1Var;
        this.f8194t = jVar;
        this.f8195u = abstractC6713l0;
        this.f8196v = z12;
        this.f8197w = oVar;
        this.f8198x = qVar;
        this.f8189D.J2(o1Var, jVar, l1Var, z10 || z11);
        if (!T2()) {
            InterfaceC3091y0 interfaceC3091y0 = this.f8200z;
            if (interfaceC3091y0 != null) {
                InterfaceC3091y0.a.b(interfaceC3091y0, null, 1, null);
            }
            this.f8200z = null;
            this.f8199y.c();
        } else if (!z13 || !AbstractC6492s.d(o1Var2, o1Var) || !zT2) {
            W2();
        }
        if (AbstractC6492s.d(o1Var2, o1Var) && AbstractC6492s.d(l1Var2, l1Var) && AbstractC6492s.d(jVar2, jVar) && AbstractC6492s.d(oVar2, oVar)) {
            return;
        }
        E0.E.b(this);
    }

    @Override // E0.B
    public C0.D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        return this.f8198x == w.q.Vertical ? V2(mVar, b10, j10) : U2(mVar, b10, j10);
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        if (this.f8190p && T2()) {
            W2();
        }
    }

    @Override // E0.v0
    public void q(J0.w wVar) {
        this.f8189D.q(wVar);
    }
}
