package I;

import H.l;
import T.InterfaceC3551q0;
import T.t1;
import T.z1;
import dh.InterfaceC5380e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: g, reason: collision with root package name */
    private static final a f8378g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final H.l f8379a;

    /* renamed from: b, reason: collision with root package name */
    private H.b f8380b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2948o f8381c;

    /* renamed from: d, reason: collision with root package name */
    private final z1 f8382d = null;

    /* renamed from: e, reason: collision with root package name */
    private final z1 f8383e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3551q0 f8384f;

    private static final class a {

        /* renamed from: I.o1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0344a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8385a;

            static {
                int[] iArr = new int[p1.values().length];
                try {
                    iArr[p1.Start.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p1.End.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f8385a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b d(H.h hVar, InterfaceC2948o interfaceC2948o, X0 x02) {
            L0.S sB;
            S0 s02 = new S0();
            CharSequence charSequenceA = AbstractC2950p.a(hVar, interfaceC2948o, s02);
            if (charSequenceA == hVar) {
                return null;
            }
            long jF = f(hVar.f(), s02, x02);
            L0.S sC = hVar.c();
            if (sC != null) {
                sB = L0.S.b(o1.f8378g.f(sC.r(), s02, x02));
            } else {
                sB = null;
            }
            return new b(new H.h(charSequenceA, jF, sB, null, 8, null), s02);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long e(long j10, S0 s02) {
            long jB = s02.b(L0.S.n(j10));
            long jB2 = L0.S.h(j10) ? jB : s02.b(L0.S.i(j10));
            int iMin = Math.min(L0.S.l(jB), L0.S.l(jB2));
            int iMax = Math.max(L0.S.k(jB), L0.S.k(jB2));
            return L0.S.m(j10) ? L0.T.b(iMax, iMin) : L0.T.b(iMin, iMax);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long f(long j10, S0 s02, X0 x02) {
            long jC = s02.c(L0.S.n(j10));
            long jC2 = L0.S.h(j10) ? jC : s02.c(L0.S.i(j10));
            int iMin = Math.min(L0.S.l(jC), L0.S.l(jC2));
            int iMax = Math.max(L0.S.k(jC), L0.S.k(jC2));
            long jB = L0.S.m(j10) ? L0.T.b(iMax, iMin) : L0.T.b(iMin, iMax);
            if (!L0.S.h(j10) || L0.S.h(jB)) {
                return jB;
            }
            p1 p1VarA = x02 != null ? x02.a() : null;
            int i10 = p1VarA == null ? -1 : C0344a.f8385a[p1VarA.ordinal()];
            if (i10 == -1) {
                return jB;
            }
            if (i10 == 1) {
                return L0.T.a(L0.S.n(jB));
            }
            if (i10 == 2) {
                return L0.T.a(L0.S.i(jB));
            }
            throw new NoWhenBranchMatchedException();
        }

        static /* synthetic */ long g(a aVar, long j10, S0 s02, X0 x02, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                x02 = null;
            }
            return aVar.f(j10, s02, x02);
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final H.h f8386a;

        /* renamed from: b, reason: collision with root package name */
        private final S0 f8387b;

        public b(H.h hVar, S0 s02) {
            this.f8386a = hVar;
            this.f8387b = s02;
        }

        public final S0 a() {
            return this.f8387b;
        }

        public final H.h b() {
            return this.f8386a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f8386a, bVar.f8386a) && AbstractC6492s.d(this.f8387b, bVar.f8387b);
        }

        public int hashCode() {
            return (this.f8386a.hashCode() * 31) + this.f8387b.hashCode();
        }

        public String toString() {
            return "TransformedText(text=" + ((Object) this.f8386a) + ", offsetMapping=" + this.f8387b + ')';
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2948o f8389b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC2948o interfaceC2948o) {
            super(0);
            this.f8389b = interfaceC2948o;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            H.h hVarL;
            b bVar;
            a aVar = o1.f8378g;
            z1 z1Var = o1.this.f8382d;
            if (z1Var == null || (bVar = (b) z1Var.getValue()) == null || (hVarL = bVar.b()) == null) {
                hVarL = o1.this.f8379a.l();
            }
            return aVar.d(hVarL, this.f8389b, o1.this.j());
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f8390a;

        /* renamed from: b, reason: collision with root package name */
        Object f8391b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f8392c;

        /* renamed from: e, reason: collision with root package name */
        int f8394e;

        d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8392c = obj;
            this.f8394e |= PduHandle.NONE;
            return o1.this.g(null, this);
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l.a f8396b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(l.a aVar) {
            super(1);
            this.f8396b = aVar;
        }

        public final void a(Throwable th2) {
            o1.this.f8379a.o(this.f8396b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Yg.J.f24997a;
        }
    }

    public o1(H.l lVar, H.b bVar, InterfaceC2948o interfaceC2948o, H.e eVar) {
        this.f8379a = lVar;
        this.f8380b = bVar;
        this.f8381c = interfaceC2948o;
        this.f8383e = interfaceC2948o != null ? T.o1.e(new c(interfaceC2948o)) : null;
        this.f8384f = t1.d(new X0(p1.Start), null, 2, null);
    }

    public static /* synthetic */ void u(o1 o1Var, CharSequence charSequence, boolean z10, K.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            cVar = K.c.MergeIfPossible;
        }
        o1Var.t(charSequence, z10, cVar);
    }

    public static /* synthetic */ void w(o1 o1Var, CharSequence charSequence, long j10, K.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar = K.c.MergeIfPossible;
        }
        K.c cVar2 = cVar;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        o1Var.v(charSequence, j10, cVar2, z10);
    }

    public final void A(X0 x02) {
        this.f8384f.setValue(x02);
    }

    public final void B() {
        this.f8379a.k().b();
    }

    public final void C(H.b bVar) {
        this.f8380b = bVar;
    }

    public final void e() {
        H.l lVar = this.f8379a;
        H.b bVar = this.f8380b;
        K.c cVar = K.c.MergeIfPossible;
        lVar.g().f().e();
        I iG = lVar.g();
        iG.u(L0.S.i(iG.m()), L0.S.i(iG.m()));
        lVar.e(bVar, true, cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (!AbstractC6492s.d(this.f8379a, o1Var.f8379a) || !AbstractC6492s.d(this.f8381c, o1Var.f8381c)) {
            return false;
        }
        o1Var.getClass();
        return AbstractC6492s.d(null, null);
    }

    public final void f() {
        H.l lVar = this.f8379a;
        H.b bVar = this.f8380b;
        K.c cVar = K.c.MergeIfPossible;
        lVar.g().f().e();
        I iG = lVar.g();
        iG.u(L0.S.k(iG.m()), L0.S.k(iG.m()));
        lVar.e(bVar, true, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(H.l.a r5, dh.InterfaceC5380e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof I.o1.d
            if (r0 == 0) goto L13
            r0 = r6
            I.o1$d r0 = (I.o1.d) r0
            int r1 = r0.f8394e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8394e = r1
            goto L18
        L13:
            I.o1$d r0 = new I.o1$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8392c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f8394e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r0.f8391b
            H.l$a r5 = (H.l.a) r5
            java.lang.Object r5 = r0.f8390a
            I.o1 r5 = (I.o1) r5
            Yg.v.b(r6)
            goto L6d
        L39:
            Yg.v.b(r6)
            r0.f8390a = r4
            r0.f8391b = r5
            r0.f8394e = r3
            Ii.p r6 = new Ii.p
            dh.e r2 = eh.AbstractC5467b.d(r0)
            r6.<init>(r2, r3)
            r6.A()
            H.l r2 = d(r4)
            r2.c(r5)
            I.o1$e r2 = new I.o1$e
            r2.<init>(r5)
            r6.B(r2)
            java.lang.Object r5 = r6.u()
            java.lang.Object r6 = eh.AbstractC5467b.g()
            if (r5 != r6) goto L6a
            kotlin.coroutines.jvm.internal.h.c(r0)
        L6a:
            if (r5 != r1) goto L6d
            return r1
        L6d:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I.o1.g(H.l$a, dh.e):java.lang.Object");
    }

    public final void h() {
        H.l lVar = this.f8379a;
        H.b bVar = this.f8380b;
        K.c cVar = K.c.NeverMerge;
        lVar.g().f().e();
        I iG = lVar.g();
        iG.d(L0.S.l(iG.m()), L0.S.k(iG.m()));
        iG.u(L0.S.l(iG.m()), L0.S.l(iG.m()));
        lVar.e(bVar, true, cVar);
    }

    public int hashCode() {
        int iHashCode = this.f8379a.hashCode() * 31;
        InterfaceC2948o interfaceC2948o = this.f8381c;
        return (iHashCode + (interfaceC2948o != null ? interfaceC2948o.hashCode() : 0)) * 31;
    }

    public final H.h i() {
        b bVar;
        H.h hVarB;
        z1 z1Var = this.f8382d;
        return (z1Var == null || (bVar = (b) z1Var.getValue()) == null || (hVarB = bVar.b()) == null) ? k() : hVarB;
    }

    public final X0 j() {
        return (X0) this.f8384f.getValue();
    }

    public final H.h k() {
        return this.f8379a.l();
    }

    public final H.h l() {
        b bVar;
        H.h hVarB;
        z1 z1Var = this.f8383e;
        return (z1Var == null || (bVar = (b) z1Var.getValue()) == null || (hVarB = bVar.b()) == null) ? i() : hVarB;
    }

    public final void m(int i10, long j10) {
        long jO = o(j10);
        H.l lVar = this.f8379a;
        H.b bVar = this.f8380b;
        K.c cVar = K.c.MergeIfPossible;
        lVar.g().f().e();
        lVar.g().t(i10, L0.S.n(jO), L0.S.i(jO));
        lVar.e(bVar, true, cVar);
    }

    public final long n(int i10) {
        b bVar;
        b bVar2;
        z1 z1Var = this.f8382d;
        S0 s0A = null;
        S0 s0A2 = (z1Var == null || (bVar2 = (b) z1Var.getValue()) == null) ? null : bVar2.a();
        z1 z1Var2 = this.f8383e;
        if (z1Var2 != null && (bVar = (b) z1Var2.getValue()) != null) {
            s0A = bVar.a();
        }
        long jB = s0A != null ? s0A.b(i10) : L0.T.a(i10);
        return s0A2 != null ? f8378g.e(jB, s0A2) : jB;
    }

    public final long o(long j10) {
        b bVar;
        b bVar2;
        z1 z1Var = this.f8382d;
        S0 s0A = null;
        S0 s0A2 = (z1Var == null || (bVar2 = (b) z1Var.getValue()) == null) ? null : bVar2.a();
        z1 z1Var2 = this.f8383e;
        if (z1Var2 != null && (bVar = (b) z1Var2.getValue()) != null) {
            s0A = bVar.a();
        }
        if (s0A != null) {
            j10 = f8378g.e(j10, s0A);
        }
        return s0A2 != null ? f8378g.e(j10, s0A2) : j10;
    }

    public final long p(long j10) {
        b bVar;
        b bVar2;
        z1 z1Var = this.f8382d;
        S0 s0A = null;
        S0 s0A2 = (z1Var == null || (bVar2 = (b) z1Var.getValue()) == null) ? null : bVar2.a();
        z1 z1Var2 = this.f8383e;
        if (z1Var2 != null && (bVar = (b) z1Var2.getValue()) != null) {
            s0A = bVar.a();
        }
        if (s0A2 != null) {
            j10 = a.g(f8378g, j10, s0A2, null, 4, null);
        }
        return s0A != null ? f8378g.f(j10, s0A, j()) : j10;
    }

    public final void q(int i10) {
        y(L0.T.a(i10));
    }

    public final void r() {
        this.f8379a.k().a();
    }

    public final void s(CharSequence charSequence) {
        H.l lVar = this.f8379a;
        H.b bVar = this.f8380b;
        K.c cVar = K.c.MergeIfPossible;
        lVar.g().f().e();
        I iG = lVar.g();
        H.b(iG);
        H.a(iG, charSequence.toString(), 1);
        lVar.e(bVar, true, cVar);
    }

    public final void t(CharSequence charSequence, boolean z10, K.c cVar) {
        H.l lVar = this.f8379a;
        H.b bVar = this.f8380b;
        lVar.g().f().e();
        I iG = lVar.g();
        if (z10) {
            iG.c();
        }
        long jM = iG.m();
        iG.q(L0.S.l(jM), L0.S.k(jM), charSequence);
        int iL = L0.S.l(jM) + charSequence.length();
        iG.u(iL, iL);
        lVar.e(bVar, true, cVar);
    }

    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.f8379a + ", outputTransformation=" + ((Object) null) + ", outputTransformedText=" + this.f8382d + ", codepointTransformation=" + this.f8381c + ", codepointTransformedText=" + this.f8383e + ", outputText=\"" + ((Object) i()) + "\", visualText=\"" + ((Object) l()) + "\")";
    }

    public final void v(CharSequence charSequence, long j10, K.c cVar, boolean z10) {
        H.l lVar = this.f8379a;
        H.b bVar = this.f8380b;
        lVar.g().f().e();
        I iG = lVar.g();
        long jO = o(j10);
        iG.q(L0.S.l(jO), L0.S.k(jO), charSequence);
        int iL = L0.S.l(jO) + charSequence.length();
        iG.u(iL, iL);
        lVar.e(bVar, z10, cVar);
    }

    public final void x() {
        H.l lVar = this.f8379a;
        H.b bVar = this.f8380b;
        K.c cVar = K.c.MergeIfPossible;
        lVar.g().f().e();
        I iG = lVar.g();
        iG.u(0, iG.l());
        lVar.e(bVar, true, cVar);
    }

    public final void y(long j10) {
        z(o(j10));
    }

    public final void z(long j10) {
        H.l lVar = this.f8379a;
        H.b bVar = this.f8380b;
        K.c cVar = K.c.MergeIfPossible;
        lVar.g().f().e();
        lVar.g().u(L0.S.n(j10), L0.S.i(j10));
        lVar.e(bVar, true, cVar);
    }
}
