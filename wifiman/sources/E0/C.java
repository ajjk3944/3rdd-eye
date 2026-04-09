package E0;

import C0.AbstractC2521a;
import androidx.compose.ui.e;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6682S;
import m0.C6733v0;
import m0.InterfaceC6717n0;
import m0.S0;
import m0.T0;
import mh.InterfaceC6835l;
import p0.C7182c;

/* loaded from: classes.dex */
public final class C extends AbstractC2624c0 {

    /* renamed from: o1, reason: collision with root package name */
    public static final a f3607o1 = new a(null);

    /* renamed from: p1, reason: collision with root package name */
    private static final S0 f3608p1;

    /* renamed from: k1, reason: collision with root package name */
    private B f3609k1;

    /* renamed from: l1, reason: collision with root package name */
    private Y0.b f3610l1;

    /* renamed from: m1, reason: collision with root package name */
    private Q f3611m1;

    /* renamed from: n1, reason: collision with root package name */
    private androidx.compose.ui.layout.d f3612n1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b extends Q {
        public b() {
            super(C.this);
        }

        @Override // E0.Q, C0.InterfaceC2534n
        public int R(int i10) {
            B bC3 = C.this.C3();
            Q qC2 = C.this.E3().C2();
            AbstractC6492s.f(qC2);
            return bC3.r(this, qC2, i10);
        }

        @Override // E0.Q, C0.InterfaceC2534n
        public int S(int i10) {
            B bC3 = C.this.C3();
            Q qC2 = C.this.E3().C2();
            AbstractC6492s.f(qC2);
            return bC3.A(this, qC2, i10);
        }

        @Override // C0.B
        public androidx.compose.ui.layout.t T(long j10) {
            C c10 = C.this;
            S0(j10);
            c10.H3(Y0.b.a(j10));
            B bC3 = c10.C3();
            Q qC2 = c10.E3().C2();
            AbstractC6492s.f(qC2);
            l2(bC3.b(this, qC2, j10));
            return this;
        }

        @Override // E0.P
        public int U0(AbstractC2521a abstractC2521a) {
            int iB = D.b(this, abstractC2521a);
            b2().put(abstractC2521a, Integer.valueOf(iB));
            return iB;
        }

        @Override // E0.Q, C0.InterfaceC2534n
        public int s(int i10) {
            B bC3 = C.this.C3();
            Q qC2 = C.this.E3().C2();
            AbstractC6492s.f(qC2);
            return bC3.v(this, qC2, i10);
        }

        @Override // E0.Q, C0.InterfaceC2534n
        public int s0(int i10) {
            B bC3 = C.this.C3();
            Q qC2 = C.this.E3().C2();
            AbstractC6492s.f(qC2);
            return bC3.p(this, qC2, i10);
        }
    }

    public static final class c implements C0.D {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ C0.D f3614a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3615b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3616c;

        c(C0.D d10, C c10) {
            this.f3614a = d10;
            Q qC2 = c10.C2();
            AbstractC6492s.f(qC2);
            this.f3615b = qC2.I0();
            Q qC22 = c10.C2();
            AbstractC6492s.f(qC22);
            this.f3616c = qC22.C0();
        }

        @Override // C0.D
        public int getHeight() {
            return this.f3616c;
        }

        @Override // C0.D
        public int getWidth() {
            return this.f3615b;
        }

        @Override // C0.D
        public Map p() {
            return this.f3614a.p();
        }

        @Override // C0.D
        public void q() {
            this.f3614a.q();
        }

        @Override // C0.D
        public InterfaceC6835l r() {
            return this.f3614a.r();
        }
    }

    static {
        S0 s0A = AbstractC6682S.a();
        s0A.I(C6733v0.f52951b.b());
        s0A.K(1.0f);
        s0A.H(T0.f52853a.b());
        f3608p1 = s0A;
    }

    public C(G g10, B b10) {
        super(g10);
        this.f3609k1 = b10;
        androidx.compose.ui.layout.d dVar = null;
        this.f3611m1 = g10.a0() != null ? new b() : null;
        if ((b10.h1().f2() & e0.a(512)) != 0) {
            AbstractC6492s.g(b10, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            dVar = new androidx.compose.ui.layout.d(this, (androidx.compose.ui.layout.b) b10);
        }
        this.f3612n1 = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void F3() {
        /*
            r7 = this;
            boolean r0 = r7.M1()
            if (r0 == 0) goto L7
            return
        L7:
            r7.a3()
            androidx.compose.ui.layout.d r0 = r7.f3612n1
            r1 = 0
            if (r0 == 0) goto L73
            androidx.compose.ui.layout.b r2 = r0.p()
            androidx.compose.ui.layout.t$a r3 = r7.q1()
            E0.Q r4 = r7.C2()
            kotlin.jvm.internal.AbstractC6492s.f(r4)
            C0.z r4 = r4.e2()
            boolean r2 = r2.k0(r3, r4)
            if (r2 != 0) goto L6b
            boolean r0 = r0.b()
            if (r0 != 0) goto L6b
            long r2 = r7.h()
            E0.Q r0 = r7.C2()
            r4 = 0
            if (r0 == 0) goto L42
            long r5 = r0.f2()
            Y0.r r0 = Y0.r.b(r5)
            goto L43
        L42:
            r0 = r4
        L43:
            boolean r0 = Y0.r.d(r2, r0)
            if (r0 == 0) goto L6b
            E0.c0 r0 = r7.E3()
            long r2 = r0.h()
            E0.c0 r0 = r7.E3()
            E0.Q r0 = r0.C2()
            if (r0 == 0) goto L63
            long r4 = r0.f2()
            Y0.r r4 = Y0.r.b(r4)
        L63:
            boolean r0 = Y0.r.d(r2, r4)
            if (r0 == 0) goto L6b
            r0 = 1
            goto L6c
        L6b:
            r0 = r1
        L6c:
            E0.c0 r2 = r7.E3()
            r2.j3(r0)
        L73:
            C0.D r0 = r7.h1()
            r0.q()
            E0.c0 r0 = r7.E3()
            r0.j3(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.C.F3():void");
    }

    @Override // E0.AbstractC2624c0
    public Q C2() {
        return this.f3611m1;
    }

    public final B C3() {
        return this.f3609k1;
    }

    public final Y0.b D3() {
        return this.f3610l1;
    }

    public final AbstractC2624c0 E3() {
        AbstractC2624c0 abstractC2624c0H2 = H2();
        AbstractC6492s.f(abstractC2624c0H2);
        return abstractC2624c0H2;
    }

    @Override // E0.AbstractC2624c0
    public e.c G2() {
        return this.f3609k1.h1();
    }

    public final void G3(B b10) {
        if (!AbstractC6492s.d(b10, this.f3609k1)) {
            e.c cVarH1 = b10.h1();
            if ((cVarH1.f2() & e0.a(512)) != 0) {
                AbstractC6492s.g(b10, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                androidx.compose.ui.layout.b bVar = (androidx.compose.ui.layout.b) b10;
                androidx.compose.ui.layout.d dVar = this.f3612n1;
                if (dVar != null) {
                    dVar.s(bVar);
                } else {
                    dVar = new androidx.compose.ui.layout.d(this, bVar);
                }
                this.f3612n1 = dVar;
            } else {
                this.f3612n1 = null;
            }
        }
        this.f3609k1 = b10;
    }

    public final void H3(Y0.b bVar) {
        this.f3610l1 = bVar;
    }

    protected void I3(Q q10) {
        this.f3611m1 = q10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // E0.AbstractC2624c0, androidx.compose.ui.layout.t
    public void K0(long j10, float f10, InterfaceC6835l interfaceC6835l) {
        super.K0(j10, f10, interfaceC6835l);
        F3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // E0.AbstractC2624c0, androidx.compose.ui.layout.t
    public void L0(long j10, float f10, C7182c c7182c) {
        super.L0(j10, f10, c7182c);
        F3();
    }

    @Override // C0.InterfaceC2534n
    public int R(int i10) {
        androidx.compose.ui.layout.d dVar = this.f3612n1;
        return dVar != null ? dVar.p().W1(dVar, E3(), i10) : this.f3609k1.r(this, E3(), i10);
    }

    @Override // C0.InterfaceC2534n
    public int S(int i10) {
        androidx.compose.ui.layout.d dVar = this.f3612n1;
        return dVar != null ? dVar.p().O(dVar, E3(), i10) : this.f3609k1.A(this, E3(), i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    @Override // C0.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.ui.layout.t T(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.y2()
            if (r0 == 0) goto L17
            Y0.b r7 = r6.f3610l1
            if (r7 == 0) goto Lf
            long r7 = r7.r()
            goto L17
        Lf:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Lookahead constraints cannot be null in approach pass."
            r7.<init>(r8)
            throw r7
        L17:
            E0.AbstractC2624c0.j2(r6, r7)
            androidx.compose.ui.layout.d r0 = B3(r6)
            if (r0 == 0) goto Lb2
            androidx.compose.ui.layout.b r1 = r0.p()
            long r2 = r0.N()
            boolean r2 = r1.S(r2)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L3d
            Y0.b r2 = r6.D3()
            boolean r2 = Y0.b.e(r7, r2)
            if (r2 != 0) goto L3b
            goto L3d
        L3b:
            r2 = r4
            goto L3e
        L3d:
            r2 = r3
        L3e:
            r0.r(r2)
            boolean r2 = r0.b()
            if (r2 != 0) goto L4e
            E0.c0 r2 = r6.E3()
            r2.i3(r3)
        L4e:
            E0.c0 r2 = r6.E3()
            C0.D r7 = r1.Q0(r0, r2, r7)
            E0.c0 r8 = r6.E3()
            r8.i3(r4)
            int r8 = r7.getWidth()
            E0.Q r1 = r6.C2()
            kotlin.jvm.internal.AbstractC6492s.f(r1)
            int r1 = r1.I0()
            if (r8 != r1) goto L80
            int r8 = r7.getHeight()
            E0.Q r1 = r6.C2()
            kotlin.jvm.internal.AbstractC6492s.f(r1)
            int r1 = r1.C0()
            if (r8 != r1) goto L80
            goto L81
        L80:
            r3 = r4
        L81:
            boolean r8 = r0.b()
            if (r8 != 0) goto Lbe
            E0.c0 r8 = r6.E3()
            long r0 = r8.h()
            E0.c0 r8 = r6.E3()
            E0.Q r8 = r8.C2()
            if (r8 == 0) goto La2
            long r4 = r8.f2()
            Y0.r r8 = Y0.r.b(r4)
            goto La3
        La2:
            r8 = 0
        La3:
            boolean r8 = Y0.r.d(r0, r8)
            if (r8 == 0) goto Lbe
            if (r3 != 0) goto Lbe
            E0.C$c r8 = new E0.C$c
            r8.<init>(r7, r6)
            r7 = r8
            goto Lbe
        Lb2:
            E0.B r0 = r6.C3()
            E0.c0 r1 = r6.E3()
            C0.D r7 = r0.b(r6, r1, r7)
        Lbe:
            r6.k3(r7)
            r6.Z2()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.C.T(long):androidx.compose.ui.layout.t");
    }

    @Override // E0.P
    public int U0(AbstractC2521a abstractC2521a) {
        Q qC2 = C2();
        return qC2 != null ? qC2.a2(abstractC2521a) : D.b(this, abstractC2521a);
    }

    @Override // E0.AbstractC2624c0
    public void c3(InterfaceC6717n0 interfaceC6717n0, C7182c c7182c) {
        E3().p2(interfaceC6717n0, c7182c);
        if (K.b(G1()).getShowLayoutBounds()) {
            q2(interfaceC6717n0, f3608p1);
        }
    }

    @Override // C0.InterfaceC2534n
    public int s(int i10) {
        androidx.compose.ui.layout.d dVar = this.f3612n1;
        return dVar != null ? dVar.p().W0(dVar, E3(), i10) : this.f3609k1.v(this, E3(), i10);
    }

    @Override // C0.InterfaceC2534n
    public int s0(int i10) {
        androidx.compose.ui.layout.d dVar = this.f3612n1;
        return dVar != null ? dVar.p().V(dVar, E3(), i10) : this.f3609k1.p(this, E3(), i10);
    }

    @Override // E0.AbstractC2624c0
    public void s2() {
        if (C2() == null) {
            I3(new b());
        }
    }
}
