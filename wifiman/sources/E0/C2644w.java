package E0;

import C0.AbstractC2521a;
import E0.G;
import E0.L;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6682S;
import m0.C6733v0;
import m0.InterfaceC6717n0;
import m0.S0;
import m0.T0;
import mh.InterfaceC6835l;
import org.snmp4j.mp.PduHandle;
import p0.C7182c;

/* renamed from: E0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2644w extends AbstractC2624c0 {

    /* renamed from: m1, reason: collision with root package name */
    public static final a f3992m1 = new a(null);

    /* renamed from: n1, reason: collision with root package name */
    private static final S0 f3993n1;

    /* renamed from: k1, reason: collision with root package name */
    private final y0 f3994k1;

    /* renamed from: l1, reason: collision with root package name */
    private Q f3995l1;

    /* renamed from: E0.w$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: E0.w$b */
    private final class b extends Q {
        public b() {
            super(C2644w.this);
        }

        @Override // E0.Q, C0.InterfaceC2534n
        public int R(int i10) {
            return G1().d1(i10);
        }

        @Override // E0.Q, C0.InterfaceC2534n
        public int S(int i10) {
            return G1().Z0(i10);
        }

        @Override // C0.B
        public androidx.compose.ui.layout.t T(long j10) {
            S0(j10);
            V.b bVarW0 = G1().w0();
            int iO = bVarW0.o();
            if (iO > 0) {
                Object[] objArrM = bVarW0.m();
                int i10 = 0;
                do {
                    L.a aVarZ = ((G) objArrM[i10]).Z();
                    AbstractC6492s.f(aVarZ);
                    aVarZ.Y1(G.g.NotUsed);
                    i10++;
                } while (i10 < iO);
            }
            l2(G1().e0().b(this, G1().F(), j10));
            return this;
        }

        @Override // E0.P
        public int U0(AbstractC2521a abstractC2521a) {
            Integer num = (Integer) Z1().v().get(abstractC2521a);
            int iIntValue = num != null ? num.intValue() : PduHandle.NONE;
            b2().put(abstractC2521a, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // E0.Q
        protected void g2() {
            L.a aVarZ = G1().Z();
            AbstractC6492s.f(aVarZ);
            aVarZ.O1();
        }

        @Override // E0.Q, C0.InterfaceC2534n
        public int s(int i10) {
            return G1().Y0(i10);
        }

        @Override // E0.Q, C0.InterfaceC2534n
        public int s0(int i10) {
            return G1().c1(i10);
        }
    }

    static {
        S0 s0A = AbstractC6682S.a();
        s0A.I(C6733v0.f52951b.c());
        s0A.K(1.0f);
        s0A.H(T0.f52853a.b());
        f3993n1 = s0A;
    }

    public C2644w(G g10) {
        super(g10);
        this.f3994k1 = new y0();
        G2().C2(this);
        this.f3995l1 = g10.a0() != null ? new b() : null;
    }

    private final void C3() {
        if (M1()) {
            return;
        }
        a3();
        G1().c0().Z1();
    }

    @Override // E0.AbstractC2624c0
    /* renamed from: B3, reason: merged with bridge method [inline-methods] */
    public y0 G2() {
        return this.f3994k1;
    }

    @Override // E0.AbstractC2624c0
    public Q C2() {
        return this.f3995l1;
    }

    protected void D3(Q q10) {
        this.f3995l1 = q10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // E0.AbstractC2624c0, androidx.compose.ui.layout.t
    public void K0(long j10, float f10, InterfaceC6835l interfaceC6835l) {
        super.K0(j10, f10, interfaceC6835l);
        C3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // E0.AbstractC2624c0, androidx.compose.ui.layout.t
    public void L0(long j10, float f10, C7182c c7182c) {
        super.L0(j10, f10, c7182c);
        C3();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    @Override // E0.AbstractC2624c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Q2(E0.AbstractC2624c0.f r16, long r17, E0.C2642u r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r0 = r15
            r8 = r17
            E0.G r1 = r15.G1()
            r10 = r16
            boolean r1 = r10.c(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            boolean r1 = r15.A3(r8)
            if (r1 == 0) goto L1b
            r11 = r21
        L19:
            r3 = r2
            goto L35
        L1b:
            if (r20 == 0) goto L33
            long r4 = r15.D2()
            float r1 = r15.o2(r8, r4)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L33
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L33
            r11 = r3
            goto L19
        L33:
            r11 = r21
        L35:
            if (r3 == 0) goto L82
            int r12 = E0.C2642u.e(r19)
            E0.G r1 = r15.G1()
            V.b r1 = r1.v0()
            int r3 = r1.o()
            if (r3 <= 0) goto L77
            int r3 = r3 - r2
            java.lang.Object[] r13 = r1.m()
            r14 = r3
        L4f:
            r1 = r13[r14]
            r2 = r1
            E0.G r2 = (E0.G) r2
            boolean r1 = r2.q()
            if (r1 == 0) goto L7a
            r1 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r11
            r1.a(r2, r3, r5, r6, r7)
            boolean r1 = r19.v()
            if (r1 != 0) goto L6d
            goto L7a
        L6d:
            boolean r1 = r19.s()
            if (r1 == 0) goto L77
            r19.b()
            goto L7a
        L77:
            r1 = r19
            goto L7f
        L7a:
            int r14 = r14 + (-1)
            if (r14 >= 0) goto L4f
            goto L77
        L7f:
            E0.C2642u.g(r1, r12)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.C2644w.Q2(E0.c0$f, long, E0.u, boolean, boolean):void");
    }

    @Override // C0.InterfaceC2534n
    public int R(int i10) {
        return G1().b1(i10);
    }

    @Override // C0.InterfaceC2534n
    public int S(int i10) {
        return G1().X0(i10);
    }

    @Override // C0.B
    public androidx.compose.ui.layout.t T(long j10) {
        if (y2()) {
            Q qC2 = C2();
            AbstractC6492s.f(qC2);
            j10 = qC2.c2();
        }
        S0(j10);
        V.b bVarW0 = G1().w0();
        int iO = bVarW0.o();
        if (iO > 0) {
            Object[] objArrM = bVarW0.m();
            int i10 = 0;
            do {
                ((G) objArrM[i10]).c0().f2(G.g.NotUsed);
                i10++;
            } while (i10 < iO);
        }
        k3(G1().e0().b(this, G1().G(), j10));
        Z2();
        return this;
    }

    @Override // E0.P
    public int U0(AbstractC2521a abstractC2521a) {
        Q qC2 = C2();
        if (qC2 != null) {
            return qC2.U0(abstractC2521a);
        }
        Integer num = (Integer) x2().v().get(abstractC2521a);
        return num != null ? num.intValue() : PduHandle.NONE;
    }

    @Override // E0.AbstractC2624c0
    public void c3(InterfaceC6717n0 interfaceC6717n0, C7182c c7182c) {
        m0 m0VarB = K.b(G1());
        V.b bVarV0 = G1().v0();
        int iO = bVarV0.o();
        if (iO > 0) {
            Object[] objArrM = bVarV0.m();
            int i10 = 0;
            do {
                G g10 = (G) objArrM[i10];
                if (g10.q()) {
                    g10.B(interfaceC6717n0, c7182c);
                }
                i10++;
            } while (i10 < iO);
        }
        if (m0VarB.getShowLayoutBounds()) {
            q2(interfaceC6717n0, f3993n1);
        }
    }

    @Override // C0.InterfaceC2534n
    public int s(int i10) {
        return G1().W0(i10);
    }

    @Override // C0.InterfaceC2534n
    public int s0(int i10) {
        return G1().a1(i10);
    }

    @Override // E0.AbstractC2624c0
    public void s2() {
        if (C2() == null) {
            D3(new b());
        }
    }
}
