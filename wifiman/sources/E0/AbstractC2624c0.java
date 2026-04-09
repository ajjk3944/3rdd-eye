package E0;

import C0.AbstractC2538s;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.ui.e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6530f;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6529e;
import l0.C6531g;
import l0.C6533i;
import l0.C6537m;
import m0.InterfaceC6717n0;
import m0.O0;
import m0.S0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import p0.C7182c;

/* renamed from: E0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2624c0 extends P implements C0.B, C0.r, n0 {

    /* renamed from: X, reason: collision with root package name */
    public static final e f3847X = new e(null);

    /* renamed from: Y, reason: collision with root package name */
    private static final InterfaceC6835l f3848Y = d.f3878a;

    /* renamed from: Z, reason: collision with root package name */
    private static final InterfaceC6835l f3849Z = c.f3877a;

    /* renamed from: f1, reason: collision with root package name */
    private static final androidx.compose.ui.graphics.d f3850f1 = new androidx.compose.ui.graphics.d();

    /* renamed from: g1, reason: collision with root package name */
    private static final C2647z f3851g1 = new C2647z();

    /* renamed from: h1, reason: collision with root package name */
    private static final float[] f3852h1 = O0.c(null, 1, null);

    /* renamed from: i1, reason: collision with root package name */
    private static final f f3853i1 = new a();

    /* renamed from: j1, reason: collision with root package name */
    private static final f f3854j1 = new b();

    /* renamed from: A, reason: collision with root package name */
    private C0.D f3855A;

    /* renamed from: B, reason: collision with root package name */
    private Map f3856B;

    /* renamed from: D, reason: collision with root package name */
    private float f3858D;

    /* renamed from: E, reason: collision with root package name */
    private C6529e f3859E;

    /* renamed from: F, reason: collision with root package name */
    private C2647z f3860F;

    /* renamed from: I, reason: collision with root package name */
    private boolean f3863I;

    /* renamed from: J, reason: collision with root package name */
    private l0 f3864J;

    /* renamed from: N, reason: collision with root package name */
    private C7182c f3865N;

    /* renamed from: p, reason: collision with root package name */
    private final G f3866p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f3867q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f3868r;

    /* renamed from: s, reason: collision with root package name */
    private AbstractC2624c0 f3869s;

    /* renamed from: t, reason: collision with root package name */
    private AbstractC2624c0 f3870t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f3871u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f3872v;

    /* renamed from: w, reason: collision with root package name */
    private InterfaceC6835l f3873w;

    /* renamed from: x, reason: collision with root package name */
    private Y0.d f3874x = G1().K();

    /* renamed from: y, reason: collision with root package name */
    private Y0.t f3875y = G1().getLayoutDirection();

    /* renamed from: z, reason: collision with root package name */
    private float f3876z = 0.8f;

    /* renamed from: C, reason: collision with root package name */
    private long f3857C = Y0.n.f24536b.a();

    /* renamed from: G, reason: collision with root package name */
    private final InterfaceC6839p f3861G = new g();

    /* renamed from: H, reason: collision with root package name */
    private final InterfaceC6824a f3862H = new j();

    /* renamed from: E0.c0$a */
    public static final class a implements f {
        a() {
        }

        @Override // E0.AbstractC2624c0.f
        public void a(G g10, long j10, C2642u c2642u, boolean z10, boolean z11) {
            g10.x0(j10, c2642u, z10, z11);
        }

        @Override // E0.AbstractC2624c0.f
        public int b() {
            return e0.a(16);
        }

        @Override // E0.AbstractC2624c0.f
        public boolean c(G g10) {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [V.b] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [V.b] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // E0.AbstractC2624c0.f
        public boolean d(e.c cVar) {
            int iA = e0.a(16);
            ?? bVar = 0;
            while (cVar != 0) {
                if (cVar instanceof s0) {
                    if (((s0) cVar).I0()) {
                        return true;
                    }
                } else if ((cVar.f2() & iA) != 0 && (cVar instanceof AbstractC2635m)) {
                    e.c cVarE2 = cVar.E2();
                    int i10 = 0;
                    bVar = bVar;
                    cVar = cVar;
                    while (cVarE2 != null) {
                        if ((cVarE2.f2() & iA) != 0) {
                            i10++;
                            bVar = bVar;
                            if (i10 == 1) {
                                cVar = cVarE2;
                            } else {
                                if (bVar == 0) {
                                    bVar = new V.b(new e.c[16], 0);
                                }
                                if (cVar != 0) {
                                    bVar.b(cVar);
                                    cVar = 0;
                                }
                                bVar.b(cVarE2);
                            }
                        }
                        cVarE2 = cVarE2.b2();
                        bVar = bVar;
                        cVar = cVar;
                    }
                    if (i10 == 1) {
                    }
                }
                cVar = AbstractC2633k.g(bVar);
            }
            return false;
        }
    }

    /* renamed from: E0.c0$b */
    public static final class b implements f {
        b() {
        }

        @Override // E0.AbstractC2624c0.f
        public void a(G g10, long j10, C2642u c2642u, boolean z10, boolean z11) {
            g10.z0(j10, c2642u, z10, z11);
        }

        @Override // E0.AbstractC2624c0.f
        public int b() {
            return e0.a(8);
        }

        @Override // E0.AbstractC2624c0.f
        public boolean c(G g10) {
            J0.j jVarI = g10.I();
            boolean z10 = false;
            if (jVarI != null && jVarI.s()) {
                z10 = true;
            }
            return !z10;
        }

        @Override // E0.AbstractC2624c0.f
        public boolean d(e.c cVar) {
            return false;
        }
    }

    /* renamed from: E0.c0$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f3877a = new c();

        c() {
            super(1);
        }

        public final void a(AbstractC2624c0 abstractC2624c0) {
            l0 l0VarB2 = abstractC2624c0.B2();
            if (l0VarB2 != null) {
                l0VarB2.invalidate();
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC2624c0) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: E0.c0$d */
    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final d f3878a = new d();

        d() {
            super(1);
        }

        public final void a(AbstractC2624c0 abstractC2624c0) {
            if (abstractC2624c0.h0()) {
                C2647z c2647z = abstractC2624c0.f3860F;
                if (c2647z == null) {
                    AbstractC2624c0.z3(abstractC2624c0, false, 1, null);
                    return;
                }
                AbstractC2624c0.f3851g1.a(c2647z);
                AbstractC2624c0.z3(abstractC2624c0, false, 1, null);
                if (AbstractC2624c0.f3851g1.c(c2647z)) {
                    return;
                }
                G gG1 = abstractC2624c0.G1();
                L lU = gG1.U();
                if (lU.s() > 0) {
                    if (lU.u() || lU.v()) {
                        G.u1(gG1, false, 1, null);
                    }
                    lU.I().S1();
                }
                m0 m0VarN0 = gG1.n0();
                if (m0VarN0 != null) {
                    m0VarN0.c(gG1);
                }
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC2624c0) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: E0.c0$e */
    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return AbstractC2624c0.f3853i1;
        }

        public final f b() {
            return AbstractC2624c0.f3854j1;
        }

        private e() {
        }
    }

    /* renamed from: E0.c0$f */
    public interface f {
        void a(G g10, long j10, C2642u c2642u, boolean z10, boolean z11);

        int b();

        boolean c(G g10);

        boolean d(e.c cVar);
    }

    /* renamed from: E0.c0$g */
    static final class g extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: E0.c0$g$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC2624c0 f3880a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6717n0 f3881b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C7182c f3882c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC2624c0 abstractC2624c0, InterfaceC6717n0 interfaceC6717n0, C7182c c7182c) {
                super(0);
                this.f3880a = abstractC2624c0;
                this.f3881b = interfaceC6717n0;
                this.f3882c = c7182c;
            }

            public final void a() {
                this.f3880a.r2(this.f3881b, this.f3882c);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        g() {
            super(2);
        }

        public final void a(InterfaceC6717n0 interfaceC6717n0, C7182c c7182c) {
            if (!AbstractC2624c0.this.G1().q()) {
                AbstractC2624c0.this.f3863I = true;
            } else {
                AbstractC2624c0.this.F2().i(AbstractC2624c0.this, AbstractC2624c0.f3849Z, new a(AbstractC2624c0.this, interfaceC6717n0, c7182c));
                AbstractC2624c0.this.f3863I = false;
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC6717n0) obj, (C7182c) obj2);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: E0.c0$h */
    static final class h extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e.c f3884b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f3885c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f3886d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2642u f3887e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f3888f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f3889g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(e.c cVar, f fVar, long j10, C2642u c2642u, boolean z10, boolean z11) {
            super(0);
            this.f3884b = cVar;
            this.f3885c = fVar;
            this.f3886d = j10;
            this.f3887e = c2642u;
            this.f3888f = z10;
            this.f3889g = z11;
        }

        public final void a() {
            AbstractC2624c0.this.N2(AbstractC2626d0.b(this.f3884b, this.f3885c.b(), e0.a(2)), this.f3885c, this.f3886d, this.f3887e, this.f3888f, this.f3889g);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: E0.c0$i */
    static final class i extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e.c f3891b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f3892c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f3893d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2642u f3894e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f3895f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f3896g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f3897h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(e.c cVar, f fVar, long j10, C2642u c2642u, boolean z10, boolean z11, float f10) {
            super(0);
            this.f3891b = cVar;
            this.f3892c = fVar;
            this.f3893d = j10;
            this.f3894e = c2642u;
            this.f3895f = z10;
            this.f3896g = z11;
            this.f3897h = f10;
        }

        public final void a() {
            AbstractC2624c0.this.O2(AbstractC2626d0.b(this.f3891b, this.f3892c.b(), e0.a(2)), this.f3892c, this.f3893d, this.f3894e, this.f3895f, this.f3896g, this.f3897h);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: E0.c0$j */
    static final class j extends AbstractC6494u implements InterfaceC6824a {
        j() {
            super(0);
        }

        public final void a() {
            AbstractC2624c0 abstractC2624c0I2 = AbstractC2624c0.this.I2();
            if (abstractC2624c0I2 != null) {
                abstractC2624c0I2.R2();
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: E0.c0$k */
    static final class k extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e.c f3900b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f3901c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f3902d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2642u f3903e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f3904f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f3905g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f3906h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(e.c cVar, f fVar, long j10, C2642u c2642u, boolean z10, boolean z11, float f10) {
            super(0);
            this.f3900b = cVar;
            this.f3901c = fVar;
            this.f3902d = j10;
            this.f3903e = c2642u;
            this.f3904f = z10;
            this.f3905g = z11;
            this.f3906h = f10;
        }

        public final void a() {
            AbstractC2624c0.this.p3(AbstractC2626d0.b(this.f3900b, this.f3901c.b(), e0.a(2)), this.f3901c, this.f3902d, this.f3903e, this.f3904f, this.f3905g, this.f3906h);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: E0.c0$l */
    static final class l extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f3907a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(InterfaceC6835l interfaceC6835l) {
            super(0);
            this.f3907a = interfaceC6835l;
        }

        public final void a() {
            this.f3907a.invoke(AbstractC2624c0.f3850f1);
            AbstractC2624c0.f3850f1.T();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public AbstractC2624c0(G g10) {
        this.f3866p = g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o0 F2() {
        return K.b(G1()).getSnapshotObserver();
    }

    private final boolean K2(int i10) {
        e.c cVarM2 = M2(f0.i(i10));
        return cVarM2 != null && AbstractC2633k.e(cVarM2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.c M2(boolean z10) {
        e.c cVarG2;
        if (G1().m0() == this) {
            return G1().k0().k();
        }
        if (z10) {
            AbstractC2624c0 abstractC2624c0 = this.f3870t;
            if (abstractC2624c0 != null && (cVarG2 = abstractC2624c0.G2()) != null) {
                return cVarG2.b2();
            }
        } else {
            AbstractC2624c0 abstractC2624c02 = this.f3870t;
            if (abstractC2624c02 != null) {
                return abstractC2624c02.G2();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N2(e.c cVar, f fVar, long j10, C2642u c2642u, boolean z10, boolean z11) {
        if (cVar == null) {
            Q2(fVar, j10, c2642u, z10, z11);
        } else {
            c2642u.w(cVar, z11, new h(cVar, fVar, j10, c2642u, z10, z11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2(e.c cVar, f fVar, long j10, C2642u c2642u, boolean z10, boolean z11, float f10) {
        if (cVar == null) {
            Q2(fVar, j10, c2642u, z10, z11);
        } else {
            c2642u.x(cVar, f10, z11, new i(cVar, fVar, j10, c2642u, z10, z11, f10));
        }
    }

    private final long U2(long j10) {
        float fM = C6531g.m(j10);
        float fMax = Math.max(0.0f, fM < 0.0f ? -fM : fM - G0());
        float fN = C6531g.n(j10);
        return AbstractC6532h.a(fMax, Math.max(0.0f, fN < 0.0f ? -fN : fN - D0()));
    }

    private final void d3(long j10, float f10, InterfaceC6835l interfaceC6835l, C7182c c7182c) {
        if (c7182c != null) {
            if (!(interfaceC6835l == null)) {
                B0.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.f3865N != c7182c) {
                this.f3865N = null;
                x3(this, null, false, 2, null);
                this.f3865N = c7182c;
            }
            if (this.f3864J == null) {
                l0 l0VarY = K.b(G1()).y(this.f3861G, this.f3862H, c7182c);
                l0VarY.f(E0());
                l0VarY.i(j10);
                this.f3864J = l0VarY;
                G1().B1(true);
                this.f3862H.invoke();
            }
        } else {
            if (this.f3865N != null) {
                this.f3865N = null;
                x3(this, null, false, 2, null);
            }
            x3(this, interfaceC6835l, false, 2, null);
        }
        if (!Y0.n.g(r1(), j10)) {
            l3(j10);
            G1().U().I().S1();
            l0 l0Var = this.f3864J;
            if (l0Var != null) {
                l0Var.i(j10);
            } else {
                AbstractC2624c0 abstractC2624c0 = this.f3870t;
                if (abstractC2624c0 != null) {
                    abstractC2624c0.R2();
                }
            }
            B1(this);
            m0 m0VarN0 = G1().n0();
            if (m0VarN0 != null) {
                m0VarN0.b(G1());
            }
        }
        this.f3858D = f10;
        if (L1()) {
            return;
        }
        W0(h1());
    }

    public static /* synthetic */ void g3(AbstractC2624c0 abstractC2624c0, C6529e c6529e, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        abstractC2624c0.f3(c6529e, z10, z11);
    }

    private final void l2(AbstractC2624c0 abstractC2624c0, C6529e c6529e, boolean z10) {
        if (abstractC2624c0 == this) {
            return;
        }
        AbstractC2624c0 abstractC2624c02 = this.f3870t;
        if (abstractC2624c02 != null) {
            abstractC2624c02.l2(abstractC2624c0, c6529e, z10);
        }
        w2(c6529e, z10);
    }

    private final long m2(AbstractC2624c0 abstractC2624c0, long j10, boolean z10) {
        if (abstractC2624c0 == this) {
            return j10;
        }
        AbstractC2624c0 abstractC2624c02 = this.f3870t;
        return (abstractC2624c02 == null || AbstractC6492s.d(abstractC2624c0, abstractC2624c02)) ? u2(j10, z10) : u2(abstractC2624c02.m2(abstractC2624c0, j10, z10), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p3(e.c cVar, f fVar, long j10, C2642u c2642u, boolean z10, boolean z11, float f10) {
        if (cVar == null) {
            Q2(fVar, j10, c2642u, z10, z11);
        } else if (fVar.d(cVar)) {
            c2642u.D(cVar, f10, z11, new k(cVar, fVar, j10, c2642u, z10, z11, f10));
        } else {
            p3(AbstractC2626d0.b(cVar, fVar.b(), e0.a(2)), fVar, j10, c2642u, z10, z11, f10);
        }
    }

    private final AbstractC2624c0 q3(C0.r rVar) {
        AbstractC2624c0 abstractC2624c0A;
        C0.z zVar = rVar instanceof C0.z ? (C0.z) rVar : null;
        if (zVar != null && (abstractC2624c0A = zVar.a()) != null) {
            return abstractC2624c0A;
        }
        AbstractC6492s.g(rVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (AbstractC2624c0) rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r2(InterfaceC6717n0 interfaceC6717n0, C7182c c7182c) {
        e.c cVarL2 = L2(e0.a(4));
        if (cVarL2 == null) {
            c3(interfaceC6717n0, c7182c);
        } else {
            G1().b0().b(interfaceC6717n0, Y0.s.d(h()), this, cVarL2, c7182c);
        }
    }

    public static /* synthetic */ long s3(AbstractC2624c0 abstractC2624c0, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return abstractC2624c0.r3(j10, z10);
    }

    private final void u3(AbstractC2624c0 abstractC2624c0, float[] fArr) {
        if (AbstractC6492s.d(abstractC2624c0, this)) {
            return;
        }
        AbstractC2624c0 abstractC2624c02 = this.f3870t;
        AbstractC6492s.f(abstractC2624c02);
        abstractC2624c02.u3(abstractC2624c0, fArr);
        if (!Y0.n.g(r1(), Y0.n.f24536b.a())) {
            float[] fArr2 = f3852h1;
            O0.h(fArr2);
            O0.q(fArr2, -Y0.n.h(r1()), -Y0.n.i(r1()), 0.0f, 4, null);
            O0.n(fArr, fArr2);
        }
        l0 l0Var = this.f3864J;
        if (l0Var != null) {
            l0Var.h(fArr);
        }
    }

    public static /* synthetic */ long v2(AbstractC2624c0 abstractC2624c0, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return abstractC2624c0.u2(j10, z10);
    }

    private final void v3(AbstractC2624c0 abstractC2624c0, float[] fArr) {
        AbstractC2624c0 abstractC2624c02 = this;
        while (!AbstractC6492s.d(abstractC2624c02, abstractC2624c0)) {
            l0 l0Var = abstractC2624c02.f3864J;
            if (l0Var != null) {
                l0Var.a(fArr);
            }
            if (!Y0.n.g(abstractC2624c02.r1(), Y0.n.f24536b.a())) {
                float[] fArr2 = f3852h1;
                O0.h(fArr2);
                O0.q(fArr2, Y0.n.h(r1), Y0.n.i(r1), 0.0f, 4, null);
                O0.n(fArr, fArr2);
            }
            abstractC2624c02 = abstractC2624c02.f3870t;
            AbstractC6492s.f(abstractC2624c02);
        }
    }

    private final void w2(C6529e c6529e, boolean z10) {
        float fH = Y0.n.h(r1());
        c6529e.i(c6529e.b() - fH);
        c6529e.j(c6529e.c() - fH);
        float fI = Y0.n.i(r1());
        c6529e.k(c6529e.d() - fI);
        c6529e.h(c6529e.a() - fI);
        l0 l0Var = this.f3864J;
        if (l0Var != null) {
            l0Var.k(c6529e, true);
            if (this.f3872v && z10) {
                c6529e.e(0.0f, 0.0f, Y0.r.g(h()), Y0.r.f(h()));
                c6529e.f();
            }
        }
    }

    public static /* synthetic */ void x3(AbstractC2624c0 abstractC2624c0, InterfaceC6835l interfaceC6835l, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        abstractC2624c0.w3(interfaceC6835l, z10);
    }

    private final void y3(boolean z10) {
        m0 m0VarN0;
        if (this.f3865N != null) {
            return;
        }
        l0 l0Var = this.f3864J;
        if (l0Var == null) {
            if (this.f3873w == null) {
                return;
            }
            B0.a.b("null layer with a non-null layerBlock");
            return;
        }
        InterfaceC6835l interfaceC6835l = this.f3873w;
        if (interfaceC6835l == null) {
            B0.a.c("updateLayerParameters requires a non-null layerBlock");
            throw new KotlinNothingValueException();
        }
        androidx.compose.ui.graphics.d dVar = f3850f1;
        dVar.O();
        dVar.Q(G1().K());
        dVar.R(G1().getLayoutDirection());
        dVar.S(Y0.s.d(h()));
        F2().i(this, f3848Y, new l(interfaceC6835l));
        C2647z c2647z = this.f3860F;
        if (c2647z == null) {
            c2647z = new C2647z();
            this.f3860F = c2647z;
        }
        c2647z.b(dVar);
        l0Var.c(dVar);
        this.f3872v = dVar.q();
        this.f3876z = dVar.b();
        if (!z10 || (m0VarN0 = G1().n0()) == null) {
            return;
        }
        m0VarN0.b(G1());
    }

    static /* synthetic */ void z3(AbstractC2624c0 abstractC2624c0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        abstractC2624c0.y3(z10);
    }

    @Override // C0.r
    public long A(long j10) {
        return K.b(G1()).d(o0(j10));
    }

    public final long A2() {
        return H0();
    }

    protected final boolean A3(long j10) {
        if (!AbstractC6532h.b(j10)) {
            return false;
        }
        l0 l0Var = this.f3864J;
        return l0Var == null || !this.f3872v || l0Var.b(j10);
    }

    public final l0 B2() {
        return this.f3864J;
    }

    public abstract Q C2();

    public final long D2() {
        return this.f3874x.K1(G1().s0().e());
    }

    protected final C6529e E2() {
        C6529e c6529e = this.f3859E;
        if (c6529e != null) {
            return c6529e;
        }
        C6529e c6529e2 = new C6529e(0.0f, 0.0f, 0.0f, 0.0f);
        this.f3859E = c6529e2;
        return c6529e2;
    }

    @Override // E0.P, E0.T
    public G G1() {
        return this.f3866p;
    }

    public abstract e.c G2();

    public final AbstractC2624c0 H2() {
        return this.f3869s;
    }

    public final AbstractC2624c0 I2() {
        return this.f3870t;
    }

    @Override // C0.r
    public C6533i J(C0.r rVar, boolean z10) {
        if (!M()) {
            B0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!rVar.M()) {
            B0.a.b("LayoutCoordinates " + rVar + " is not attached!");
        }
        AbstractC2624c0 abstractC2624c0Q3 = q3(rVar);
        abstractC2624c0Q3.V2();
        AbstractC2624c0 abstractC2624c0T2 = t2(abstractC2624c0Q3);
        C6529e c6529eE2 = E2();
        c6529eE2.i(0.0f);
        c6529eE2.k(0.0f);
        c6529eE2.j(Y0.r.g(rVar.h()));
        c6529eE2.h(Y0.r.f(rVar.h()));
        while (abstractC2624c0Q3 != abstractC2624c0T2) {
            g3(abstractC2624c0Q3, c6529eE2, z10, false, 4, null);
            if (c6529eE2.f()) {
                return C6533i.f52340e.a();
            }
            abstractC2624c0Q3 = abstractC2624c0Q3.f3870t;
            AbstractC6492s.f(abstractC2624c0Q3);
        }
        l2(abstractC2624c0T2, c6529eE2, z10);
        return AbstractC6530f.a(c6529eE2);
    }

    public final float J2() {
        return this.f3858D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.t
    public void K0(long j10, float f10, InterfaceC6835l interfaceC6835l) {
        if (!this.f3867q) {
            d3(j10, f10, interfaceC6835l, null);
            return;
        }
        Q qC2 = C2();
        AbstractC6492s.f(qC2);
        d3(qC2.r1(), f10, interfaceC6835l, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.t
    public void L0(long j10, float f10, C7182c c7182c) {
        if (!this.f3867q) {
            d3(j10, f10, null, c7182c);
            return;
        }
        Q qC2 = C2();
        AbstractC6492s.f(qC2);
        d3(qC2.r1(), f10, null, c7182c);
    }

    public final e.c L2(int i10) {
        boolean zI = f0.i(i10);
        e.c cVarG2 = G2();
        if (!zI && (cVarG2 = cVarG2.h2()) == null) {
            return null;
        }
        for (e.c cVarM2 = M2(zI); cVarM2 != null && (cVarM2.a2() & i10) != 0; cVarM2 = cVarM2.b2()) {
            if ((cVarM2.f2() & i10) != 0) {
                return cVarM2;
            }
            if (cVarM2 == cVarG2) {
                return null;
            }
        }
        return null;
    }

    @Override // C0.r
    public boolean M() {
        return G2().k2();
    }

    @Override // C0.r
    public void O(float[] fArr) {
        m0 m0VarB = K.b(G1());
        v3(q3(AbstractC2538s.d(this)), fArr);
        m0VarB.t(fArr);
    }

    public final void P2(f fVar, long j10, C2642u c2642u, boolean z10, boolean z11) {
        e.c cVarL2 = L2(fVar.b());
        if (!A3(j10)) {
            if (z10) {
                float fO2 = o2(j10, D2());
                if (Float.isInfinite(fO2) || Float.isNaN(fO2) || !c2642u.z(fO2, false)) {
                    return;
                }
                O2(cVarL2, fVar, j10, c2642u, z10, false, fO2);
                return;
            }
            return;
        }
        if (cVarL2 == null) {
            Q2(fVar, j10, c2642u, z10, z11);
            return;
        }
        if (S2(j10)) {
            N2(cVarL2, fVar, j10, c2642u, z10, z11);
            return;
        }
        float fO22 = !z10 ? Float.POSITIVE_INFINITY : o2(j10, D2());
        if (!Float.isInfinite(fO22) && !Float.isNaN(fO22)) {
            if (c2642u.z(fO22, z11)) {
                O2(cVarL2, fVar, j10, c2642u, z10, z11, fO22);
                return;
            }
        }
        p3(cVarL2, fVar, j10, c2642u, z10, z11, fO22);
    }

    public void Q2(f fVar, long j10, C2642u c2642u, boolean z10, boolean z11) {
        AbstractC2624c0 abstractC2624c0 = this.f3869s;
        if (abstractC2624c0 != null) {
            abstractC2624c0.P2(fVar, v2(abstractC2624c0, j10, false, 2, null), c2642u, z10, z11);
        }
    }

    @Override // E0.P
    public void R1() {
        C7182c c7182c = this.f3865N;
        if (c7182c != null) {
            L0(r1(), this.f3858D, c7182c);
        } else {
            K0(r1(), this.f3858D, this.f3873w);
        }
    }

    public void R2() {
        l0 l0Var = this.f3864J;
        if (l0Var != null) {
            l0Var.invalidate();
            return;
        }
        AbstractC2624c0 abstractC2624c0 = this.f3870t;
        if (abstractC2624c0 != null) {
            abstractC2624c0.R2();
        }
    }

    protected final boolean S2(long j10) {
        float fM = C6531g.m(j10);
        float fN = C6531g.n(j10);
        return fM >= 0.0f && fN >= 0.0f && fM < ((float) G0()) && fN < ((float) D0());
    }

    public final boolean T2() {
        if (this.f3864J != null && this.f3876z <= 0.0f) {
            return true;
        }
        AbstractC2624c0 abstractC2624c0 = this.f3870t;
        if (abstractC2624c0 != null) {
            return abstractC2624c0.T2();
        }
        return false;
    }

    @Override // C0.r
    public long V(C0.r rVar, long j10, boolean z10) {
        if (rVar instanceof C0.z) {
            ((C0.z) rVar).a().V2();
            return C6531g.u(rVar.V(this, C6531g.u(j10), z10));
        }
        AbstractC2624c0 abstractC2624c0Q3 = q3(rVar);
        abstractC2624c0Q3.V2();
        AbstractC2624c0 abstractC2624c0T2 = t2(abstractC2624c0Q3);
        while (abstractC2624c0Q3 != abstractC2624c0T2) {
            j10 = abstractC2624c0Q3.r3(j10, z10);
            abstractC2624c0Q3 = abstractC2624c0Q3.f3870t;
            AbstractC6492s.f(abstractC2624c0Q3);
        }
        return m2(abstractC2624c0T2, j10, z10);
    }

    public final void V2() {
        G1().U().S();
    }

    @Override // C0.r
    public long W(long j10) {
        if (!M()) {
            B0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        C0.r rVarD = AbstractC2538s.d(this);
        return b0(rVarD, C6531g.q(K.b(G1()).e(j10), AbstractC2538s.e(rVarD)));
    }

    public void W2() {
        l0 l0Var = this.f3864J;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    public final void X2() {
        w3(this.f3873w, true);
        l0 l0Var = this.f3864J;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    protected void Y2(int i10, int i11) {
        AbstractC2624c0 abstractC2624c0;
        l0 l0Var = this.f3864J;
        if (l0Var != null) {
            l0Var.f(Y0.s.a(i10, i11));
        } else if (G1().q() && (abstractC2624c0 = this.f3870t) != null) {
            abstractC2624c0.R2();
        }
        Q0(Y0.s.a(i10, i11));
        if (this.f3873w != null) {
            y3(false);
        }
        int iA = e0.a(4);
        boolean zI = f0.i(iA);
        e.c cVarG2 = G2();
        if (zI || (cVarG2 = cVarG2.h2()) != null) {
            for (e.c cVarM2 = M2(zI); cVarM2 != null && (cVarM2.a2() & iA) != 0; cVarM2 = cVarM2.b2()) {
                if ((cVarM2.f2() & iA) != 0) {
                    AbstractC2635m abstractC2635mG = cVarM2;
                    ?? bVar = 0;
                    while (abstractC2635mG != 0) {
                        if (abstractC2635mG instanceof r) {
                            ((r) abstractC2635mG).H0();
                        } else if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                            e.c cVarE2 = abstractC2635mG.E2();
                            int i12 = 0;
                            abstractC2635mG = abstractC2635mG;
                            bVar = bVar;
                            while (cVarE2 != null) {
                                if ((cVarE2.f2() & iA) != 0) {
                                    i12++;
                                    bVar = bVar;
                                    if (i12 == 1) {
                                        abstractC2635mG = cVarE2;
                                    } else {
                                        if (bVar == 0) {
                                            bVar = new V.b(new e.c[16], 0);
                                        }
                                        if (abstractC2635mG != 0) {
                                            bVar.b(abstractC2635mG);
                                            abstractC2635mG = 0;
                                        }
                                        bVar.b(cVarE2);
                                    }
                                }
                                cVarE2 = cVarE2.b2();
                                abstractC2635mG = abstractC2635mG;
                                bVar = bVar;
                            }
                            if (i12 == 1) {
                            }
                        }
                        abstractC2635mG = AbstractC2633k.g(bVar);
                    }
                }
                if (cVarM2 == cVarG2) {
                    break;
                }
            }
        }
        m0 m0VarN0 = G1().n0();
        if (m0VarN0 != null) {
            m0VarN0.b(G1());
        }
    }

    @Override // E0.P
    public P Z0() {
        return this.f3869s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [V.b] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    public final void Z2() {
        e.c cVarH2;
        if (K2(e0.a(128))) {
            g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
            androidx.compose.runtime.snapshots.g gVarD = aVar.d();
            InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
            androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
            try {
                int iA = e0.a(128);
                boolean zI = f0.i(iA);
                if (!zI) {
                    cVarH2 = G2().h2();
                    if (cVarH2 == null) {
                    }
                    Yg.J j10 = Yg.J.f24997a;
                    aVar.m(gVarD, gVarF, interfaceC6835lH);
                }
                cVarH2 = G2();
                for (e.c cVarM2 = M2(zI); cVarM2 != null && (cVarM2.a2() & iA) != 0; cVarM2 = cVarM2.b2()) {
                    if ((cVarM2.f2() & iA) != 0) {
                        ?? bVar = 0;
                        AbstractC2635m abstractC2635mG = cVarM2;
                        while (abstractC2635mG != 0) {
                            if (abstractC2635mG instanceof A) {
                                ((A) abstractC2635mG).a0(E0());
                            } else if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                                e.c cVarE2 = abstractC2635mG.E2();
                                int i10 = 0;
                                abstractC2635mG = abstractC2635mG;
                                bVar = bVar;
                                while (cVarE2 != null) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i10++;
                                        bVar = bVar;
                                        if (i10 == 1) {
                                            abstractC2635mG = cVarE2;
                                        } else {
                                            if (bVar == 0) {
                                                bVar = new V.b(new e.c[16], 0);
                                            }
                                            if (abstractC2635mG != 0) {
                                                bVar.b(abstractC2635mG);
                                                abstractC2635mG = 0;
                                            }
                                            bVar.b(cVarE2);
                                        }
                                    }
                                    cVarE2 = cVarE2.b2();
                                    abstractC2635mG = abstractC2635mG;
                                    bVar = bVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC2635mG = AbstractC2633k.g(bVar);
                        }
                    }
                    if (cVarM2 == cVarH2) {
                        break;
                    }
                }
                Yg.J j102 = Yg.J.f24997a;
                aVar.m(gVarD, gVarF, interfaceC6835lH);
            } catch (Throwable th2) {
                aVar.m(gVarD, gVarF, interfaceC6835lH);
                throw th2;
            }
        }
    }

    @Override // C0.r
    public final C0.r a0() {
        if (!M()) {
            B0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        V2();
        return G1().m0().f3870t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void a3() {
        int iA = e0.a(128);
        boolean zI = f0.i(iA);
        e.c cVarG2 = G2();
        if (!zI && (cVarG2 = cVarG2.h2()) == null) {
            return;
        }
        for (e.c cVarM2 = M2(zI); cVarM2 != null && (cVarM2.a2() & iA) != 0; cVarM2 = cVarM2.b2()) {
            if ((cVarM2.f2() & iA) != 0) {
                AbstractC2635m abstractC2635mG = cVarM2;
                ?? bVar = 0;
                while (abstractC2635mG != 0) {
                    if (abstractC2635mG instanceof A) {
                        ((A) abstractC2635mG).Y1(this);
                    } else if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                        e.c cVarE2 = abstractC2635mG.E2();
                        int i10 = 0;
                        abstractC2635mG = abstractC2635mG;
                        bVar = bVar;
                        while (cVarE2 != null) {
                            if ((cVarE2.f2() & iA) != 0) {
                                i10++;
                                bVar = bVar;
                                if (i10 == 1) {
                                    abstractC2635mG = cVarE2;
                                } else {
                                    if (bVar == 0) {
                                        bVar = new V.b(new e.c[16], 0);
                                    }
                                    if (abstractC2635mG != 0) {
                                        bVar.b(abstractC2635mG);
                                        abstractC2635mG = 0;
                                    }
                                    bVar.b(cVarE2);
                                }
                            }
                            cVarE2 = cVarE2.b2();
                            abstractC2635mG = abstractC2635mG;
                            bVar = bVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                    abstractC2635mG = AbstractC2633k.g(bVar);
                }
            }
            if (cVarM2 == cVarG2) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // C0.E, C0.InterfaceC2534n
    public Object b() {
        if (!G1().k0().q(e0.a(64))) {
            return null;
        }
        G2();
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        for (e.c cVarO = G1().k0().o(); cVarO != null; cVarO = cVarO.h2()) {
            if ((e0.a(64) & cVarO.f2()) != 0) {
                int iA = e0.a(64);
                ?? bVar = 0;
                AbstractC2635m abstractC2635mG = cVarO;
                while (abstractC2635mG != 0) {
                    if (abstractC2635mG instanceof p0) {
                        n10.f51689a = ((p0) abstractC2635mG).M(G1().K(), n10.f51689a);
                    } else if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                        e.c cVarE2 = abstractC2635mG.E2();
                        int i10 = 0;
                        abstractC2635mG = abstractC2635mG;
                        bVar = bVar;
                        while (cVarE2 != null) {
                            if ((cVarE2.f2() & iA) != 0) {
                                i10++;
                                bVar = bVar;
                                if (i10 == 1) {
                                    abstractC2635mG = cVarE2;
                                } else {
                                    if (bVar == 0) {
                                        bVar = new V.b(new e.c[16], 0);
                                    }
                                    if (abstractC2635mG != 0) {
                                        bVar.b(abstractC2635mG);
                                        abstractC2635mG = 0;
                                    }
                                    bVar.b(cVarE2);
                                }
                            }
                            cVarE2 = cVarE2.b2();
                            abstractC2635mG = abstractC2635mG;
                            bVar = bVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                    abstractC2635mG = AbstractC2633k.g(bVar);
                }
            }
        }
        return n10.f51689a;
    }

    @Override // C0.r
    public long b0(C0.r rVar, long j10) {
        return V(rVar, j10, true);
    }

    public final void b3() {
        this.f3871u = true;
        this.f3862H.invoke();
        h3();
    }

    @Override // E0.P
    public C0.r c1() {
        return this;
    }

    public abstract void c3(InterfaceC6717n0 interfaceC6717n0, C7182c c7182c);

    public final void e3(long j10, float f10, InterfaceC6835l interfaceC6835l, C7182c c7182c) {
        d3(Y0.n.l(j10, A0()), f10, interfaceC6835l, c7182c);
    }

    public final void f3(C6529e c6529e, boolean z10, boolean z11) {
        l0 l0Var = this.f3864J;
        if (l0Var != null) {
            if (this.f3872v) {
                if (z11) {
                    long jD2 = D2();
                    float fI = C6537m.i(jD2) / 2.0f;
                    float fG = C6537m.g(jD2) / 2.0f;
                    c6529e.e(-fI, -fG, Y0.r.g(h()) + fI, Y0.r.f(h()) + fG);
                } else if (z10) {
                    c6529e.e(0.0f, 0.0f, Y0.r.g(h()), Y0.r.f(h()));
                }
                if (c6529e.f()) {
                    return;
                }
            }
            l0Var.k(c6529e, false);
        }
        float fH = Y0.n.h(r1());
        c6529e.i(c6529e.b() + fH);
        c6529e.j(c6529e.c() + fH);
        float fI2 = Y0.n.i(r1());
        c6529e.k(c6529e.d() + fI2);
        c6529e.h(c6529e.a() + fI2);
    }

    @Override // E0.P
    public boolean g1() {
        return this.f3855A != null;
    }

    @Override // Y0.d
    public float getDensity() {
        return G1().K().getDensity();
    }

    @Override // C0.InterfaceC2535o
    public Y0.t getLayoutDirection() {
        return G1().getLayoutDirection();
    }

    @Override // C0.r
    public final long h() {
        return E0();
    }

    @Override // E0.n0
    public boolean h0() {
        return (this.f3864J == null || this.f3871u || !G1().K0()) ? false : true;
    }

    @Override // E0.P
    public C0.D h1() {
        C0.D d10 = this.f3855A;
        if (d10 != null) {
            return d10;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public final void h3() {
        if (this.f3864J != null) {
            if (this.f3865N != null) {
                this.f3865N = null;
            }
            x3(this, null, false, 2, null);
            G.u1(G1(), false, 1, null);
        }
    }

    public final void i3(boolean z10) {
        this.f3868r = z10;
    }

    public final void j3(boolean z10) {
        this.f3867q = z10;
    }

    public void k3(C0.D d10) {
        C0.D d11 = this.f3855A;
        if (d10 != d11) {
            this.f3855A = d10;
            if (d11 == null || d10.getWidth() != d11.getWidth() || d10.getHeight() != d11.getHeight()) {
                Y2(d10.getWidth(), d10.getHeight());
            }
            Map map = this.f3856B;
            if (((map == null || map.isEmpty()) && d10.p().isEmpty()) || AbstractC6492s.d(d10.p(), this.f3856B)) {
                return;
            }
            x2().p().m();
            Map linkedHashMap = this.f3856B;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f3856B = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(d10.p());
        }
    }

    protected void l3(long j10) {
        this.f3857C = j10;
    }

    public final void m3(AbstractC2624c0 abstractC2624c0) {
        this.f3869s = abstractC2624c0;
    }

    protected final long n2(long j10) {
        return AbstractC6538n.a(Math.max(0.0f, (C6537m.i(j10) - G0()) / 2.0f), Math.max(0.0f, (C6537m.g(j10) - D0()) / 2.0f));
    }

    public final void n3(AbstractC2624c0 abstractC2624c0) {
        this.f3870t = abstractC2624c0;
    }

    @Override // C0.r
    public long o0(long j10) {
        if (!M()) {
            B0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        V2();
        long jS3 = j10;
        for (AbstractC2624c0 abstractC2624c0 = this; abstractC2624c0 != null; abstractC2624c0 = abstractC2624c0.f3870t) {
            jS3 = s3(abstractC2624c0, jS3, false, 2, null);
        }
        return jS3;
    }

    @Override // E0.P
    public P o1() {
        return this.f3870t;
    }

    protected final float o2(long j10, long j11) {
        if (G0() >= C6537m.i(j11) && D0() >= C6537m.g(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        long jN2 = n2(j11);
        float fI = C6537m.i(jN2);
        float fG = C6537m.g(jN2);
        long jU2 = U2(j10);
        if ((fI > 0.0f || fG > 0.0f) && C6531g.m(jU2) <= fI && C6531g.n(jU2) <= fG) {
            return C6531g.l(jU2);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final boolean o3() {
        e.c cVarM2 = M2(f0.i(e0.a(16)));
        if (cVarM2 != null && cVarM2.k2()) {
            int iA = e0.a(16);
            if (!cVarM2.h1().k2()) {
                B0.a.b("visitLocalDescendants called on an unattached node");
            }
            e.c cVarH1 = cVarM2.h1();
            if ((cVarH1.a2() & iA) != 0) {
                while (cVarH1 != null) {
                    if ((cVarH1.f2() & iA) != 0) {
                        AbstractC2635m abstractC2635mG = cVarH1;
                        ?? bVar = 0;
                        while (abstractC2635mG != 0) {
                            if (abstractC2635mG instanceof s0) {
                                if (((s0) abstractC2635mG).E1()) {
                                    return true;
                                }
                            } else if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                                e.c cVarE2 = abstractC2635mG.E2();
                                int i10 = 0;
                                abstractC2635mG = abstractC2635mG;
                                bVar = bVar;
                                while (cVarE2 != null) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i10++;
                                        bVar = bVar;
                                        if (i10 == 1) {
                                            abstractC2635mG = cVarE2;
                                        } else {
                                            if (bVar == 0) {
                                                bVar = new V.b(new e.c[16], 0);
                                            }
                                            if (abstractC2635mG != 0) {
                                                bVar.b(abstractC2635mG);
                                                abstractC2635mG = 0;
                                            }
                                            bVar.b(cVarE2);
                                        }
                                    }
                                    cVarE2 = cVarE2.b2();
                                    abstractC2635mG = abstractC2635mG;
                                    bVar = bVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC2635mG = AbstractC2633k.g(bVar);
                        }
                    }
                    cVarH1 = cVarH1.b2();
                }
            }
        }
        return false;
    }

    public final void p2(InterfaceC6717n0 interfaceC6717n0, C7182c c7182c) {
        l0 l0Var = this.f3864J;
        if (l0Var != null) {
            l0Var.d(interfaceC6717n0, c7182c);
            return;
        }
        float fH = Y0.n.h(r1());
        float fI = Y0.n.i(r1());
        interfaceC6717n0.c(fH, fI);
        r2(interfaceC6717n0, c7182c);
        interfaceC6717n0.c(-fH, -fI);
    }

    protected final void q2(InterfaceC6717n0 interfaceC6717n0, S0 s02) {
        interfaceC6717n0.v(new C6533i(0.5f, 0.5f, Y0.r.g(E0()) - 0.5f, Y0.r.f(E0()) - 0.5f), s02);
    }

    @Override // C0.r
    public long r(long j10) {
        if (!M()) {
            B0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return b0(AbstractC2538s.d(this), K.b(G1()).r(j10));
    }

    @Override // E0.P
    public long r1() {
        return this.f3857C;
    }

    public long r3(long j10, boolean z10) {
        l0 l0Var = this.f3864J;
        if (l0Var != null) {
            j10 = l0Var.e(j10, false);
        }
        return (z10 || !J1()) ? Y0.o.c(j10, r1()) : j10;
    }

    public abstract void s2();

    public final AbstractC2624c0 t2(AbstractC2624c0 abstractC2624c0) {
        G gG1 = abstractC2624c0.G1();
        G gG12 = G1();
        if (gG1 == gG12) {
            e.c cVarG2 = abstractC2624c0.G2();
            e.c cVarG22 = G2();
            int iA = e0.a(2);
            if (!cVarG22.h1().k2()) {
                B0.a.b("visitLocalAncestors called on an unattached node");
            }
            for (e.c cVarH2 = cVarG22.h1().h2(); cVarH2 != null; cVarH2 = cVarH2.h2()) {
                if ((cVarH2.f2() & iA) != 0 && cVarH2 == cVarG2) {
                    return abstractC2624c0;
                }
            }
            return this;
        }
        while (gG1.L() > gG12.L()) {
            gG1 = gG1.o0();
            AbstractC6492s.f(gG1);
        }
        while (gG12.L() > gG1.L()) {
            gG12 = gG12.o0();
            AbstractC6492s.f(gG12);
        }
        while (gG1 != gG12) {
            gG1 = gG1.o0();
            gG12 = gG12.o0();
            if (gG1 == null || gG12 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return gG12 == G1() ? this : gG1 == abstractC2624c0.G1() ? abstractC2624c0 : gG1.P();
    }

    public final C6533i t3() {
        if (!M()) {
            return C6533i.f52340e.a();
        }
        C0.r rVarD = AbstractC2538s.d(this);
        C6529e c6529eE2 = E2();
        long jN2 = n2(D2());
        c6529eE2.i(-C6537m.i(jN2));
        c6529eE2.k(-C6537m.g(jN2));
        c6529eE2.j(G0() + C6537m.i(jN2));
        c6529eE2.h(D0() + C6537m.g(jN2));
        AbstractC2624c0 abstractC2624c0 = this;
        while (abstractC2624c0 != rVarD) {
            abstractC2624c0.f3(c6529eE2, false, true);
            if (c6529eE2.f()) {
                return C6533i.f52340e.a();
            }
            abstractC2624c0 = abstractC2624c0.f3870t;
            AbstractC6492s.f(abstractC2624c0);
        }
        return AbstractC6530f.a(c6529eE2);
    }

    public long u2(long j10, boolean z10) {
        if (z10 || !J1()) {
            j10 = Y0.o.b(j10, r1());
        }
        l0 l0Var = this.f3864J;
        return l0Var != null ? l0Var.e(j10, true) : j10;
    }

    public final void w3(InterfaceC6835l interfaceC6835l, boolean z10) {
        m0 m0VarN0;
        if (!(interfaceC6835l == null || this.f3865N == null)) {
            B0.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        G gG1 = G1();
        boolean z11 = (!z10 && this.f3873w == interfaceC6835l && AbstractC6492s.d(this.f3874x, gG1.K()) && this.f3875y == gG1.getLayoutDirection()) ? false : true;
        this.f3874x = gG1.K();
        this.f3875y = gG1.getLayoutDirection();
        if (!gG1.K0() || interfaceC6835l == null) {
            this.f3873w = null;
            l0 l0Var = this.f3864J;
            if (l0Var != null) {
                l0Var.destroy();
                gG1.B1(true);
                this.f3862H.invoke();
                if (M() && (m0VarN0 = gG1.n0()) != null) {
                    m0VarN0.b(gG1);
                }
            }
            this.f3864J = null;
            this.f3863I = false;
            return;
        }
        this.f3873w = interfaceC6835l;
        if (this.f3864J != null) {
            if (z11) {
                z3(this, false, 1, null);
                return;
            }
            return;
        }
        l0 l0VarN = m0.n(K.b(gG1), this.f3861G, this.f3862H, null, 4, null);
        l0VarN.f(E0());
        l0VarN.i(r1());
        this.f3864J = l0VarN;
        z3(this, false, 1, null);
        gG1.B1(true);
        this.f3862H.invoke();
    }

    public InterfaceC2621b x2() {
        return G1().U().r();
    }

    @Override // Y0.l
    public float y() {
        return G1().K().y();
    }

    public final boolean y2() {
        return this.f3868r;
    }

    @Override // C0.r
    public void z(C0.r rVar, float[] fArr) {
        AbstractC2624c0 abstractC2624c0Q3 = q3(rVar);
        abstractC2624c0Q3.V2();
        AbstractC2624c0 abstractC2624c0T2 = t2(abstractC2624c0Q3);
        O0.h(fArr);
        abstractC2624c0Q3.v3(abstractC2624c0T2, fArr);
        u3(abstractC2624c0T2, fArr);
    }

    public final boolean z2() {
        return this.f3863I;
    }
}
