package E0;

import C0.InterfaceC2535o;
import E0.L;
import E0.m0;
import T.InterfaceC3538k;
import T.InterfaceC3563x;
import android.view.View;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.E0;
import androidx.compose.ui.platform.w1;
import j0.InterfaceC6232c;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.InterfaceC6717n0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.conscrypt.PSKKeyManager;
import p0.C7182c;

/* loaded from: classes.dex */
public final class G implements InterfaceC3538k, C0.N, n0, C0.v, InterfaceC2629g, m0.b {

    /* renamed from: X, reason: collision with root package name */
    public static final d f3617X = new d(null);

    /* renamed from: Y, reason: collision with root package name */
    public static final int f3618Y = 8;

    /* renamed from: Z, reason: collision with root package name */
    private static final f f3619Z = new c();

    /* renamed from: f1, reason: collision with root package name */
    private static final InterfaceC6824a f3620f1 = a.f3660a;

    /* renamed from: g1, reason: collision with root package name */
    private static final w1 f3621g1 = new b();

    /* renamed from: h1, reason: collision with root package name */
    private static final Comparator f3622h1 = new Comparator() { // from class: E0.F
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return G.n((G) obj, (G) obj2);
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private final C2620a0 f3623A;

    /* renamed from: B, reason: collision with root package name */
    private final L f3624B;

    /* renamed from: C, reason: collision with root package name */
    private androidx.compose.ui.layout.h f3625C;

    /* renamed from: D, reason: collision with root package name */
    private AbstractC2624c0 f3626D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f3627E;

    /* renamed from: F, reason: collision with root package name */
    private androidx.compose.ui.e f3628F;

    /* renamed from: G, reason: collision with root package name */
    private androidx.compose.ui.e f3629G;

    /* renamed from: H, reason: collision with root package name */
    private InterfaceC6835l f3630H;

    /* renamed from: I, reason: collision with root package name */
    private InterfaceC6835l f3631I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f3632J;

    /* renamed from: N, reason: collision with root package name */
    private boolean f3633N;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3634a;

    /* renamed from: b, reason: collision with root package name */
    private int f3635b;

    /* renamed from: c, reason: collision with root package name */
    private int f3636c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3637d;

    /* renamed from: e, reason: collision with root package name */
    private G f3638e;

    /* renamed from: f, reason: collision with root package name */
    private int f3639f;

    /* renamed from: g, reason: collision with root package name */
    private final X f3640g;

    /* renamed from: h, reason: collision with root package name */
    private V.b f3641h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3642i;

    /* renamed from: j, reason: collision with root package name */
    private G f3643j;

    /* renamed from: k, reason: collision with root package name */
    private m0 f3644k;

    /* renamed from: l, reason: collision with root package name */
    private androidx.compose.ui.viewinterop.c f3645l;

    /* renamed from: m, reason: collision with root package name */
    private int f3646m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f3647n;

    /* renamed from: o, reason: collision with root package name */
    private J0.j f3648o;

    /* renamed from: p, reason: collision with root package name */
    private final V.b f3649p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f3650q;

    /* renamed from: r, reason: collision with root package name */
    private C0.C f3651r;

    /* renamed from: s, reason: collision with root package name */
    private C2646y f3652s;

    /* renamed from: t, reason: collision with root package name */
    private Y0.d f3653t;

    /* renamed from: u, reason: collision with root package name */
    private Y0.t f3654u;

    /* renamed from: v, reason: collision with root package name */
    private w1 f3655v;

    /* renamed from: w, reason: collision with root package name */
    private InterfaceC3563x f3656w;

    /* renamed from: x, reason: collision with root package name */
    private g f3657x;

    /* renamed from: y, reason: collision with root package name */
    private g f3658y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f3659z;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3660a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke() {
            return new G(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    public static final class b implements w1 {
        b() {
        }

        @Override // androidx.compose.ui.platform.w1
        public long a() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.w1
        public long b() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.w1
        public long c() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.w1
        public long e() {
            return Y0.k.f24532b.b();
        }

        @Override // androidx.compose.ui.platform.w1
        public float g() {
            return 16.0f;
        }
    }

    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // C0.C
        public /* bridge */ /* synthetic */ C0.D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
            return (C0.D) j(mVar, list, j10);
        }

        public Void j(androidx.compose.ui.layout.m mVar, List list, long j10) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC6824a a() {
            return G.f3620f1;
        }

        public final Comparator b() {
            return G.f3622h1;
        }

        private d() {
        }
    }

    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    public static abstract class f implements C0.C {

        /* renamed from: a, reason: collision with root package name */
        private final String f3661a;

        public f(String str) {
            this.f3661a = str;
        }

        public Void a(InterfaceC2535o interfaceC2535o, List list, int i10) {
            throw new IllegalStateException(this.f3661a.toString());
        }

        @Override // C0.C
        public /* bridge */ /* synthetic */ int c(InterfaceC2535o interfaceC2535o, List list, int i10) {
            return ((Number) a(interfaceC2535o, list, i10)).intValue();
        }

        public Void d(InterfaceC2535o interfaceC2535o, List list, int i10) {
            throw new IllegalStateException(this.f3661a.toString());
        }

        @Override // C0.C
        public /* bridge */ /* synthetic */ int e(InterfaceC2535o interfaceC2535o, List list, int i10) {
            return ((Number) d(interfaceC2535o, list, i10)).intValue();
        }

        @Override // C0.C
        public /* bridge */ /* synthetic */ int f(InterfaceC2535o interfaceC2535o, List list, int i10) {
            return ((Number) h(interfaceC2535o, list, i10)).intValue();
        }

        public Void g(InterfaceC2535o interfaceC2535o, List list, int i10) {
            throw new IllegalStateException(this.f3661a.toString());
        }

        public Void h(InterfaceC2535o interfaceC2535o, List list, int i10) {
            throw new IllegalStateException(this.f3661a.toString());
        }

        @Override // C0.C
        public /* bridge */ /* synthetic */ int i(InterfaceC2535o interfaceC2535o, List list, int i10) {
            return ((Number) g(interfaceC2535o, list, i10)).intValue();
        }
    }

    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    public /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3662a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3662a = iArr;
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6824a {
        i() {
            super(0);
        }

        public final void a() {
            G.this.U().N();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f3665b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(kotlin.jvm.internal.N n10) {
            super(0);
            this.f3665b = n10;
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
        public final void a() {
            C2620a0 c2620a0K0 = G.this.k0();
            int iA = e0.a(8);
            kotlin.jvm.internal.N n10 = this.f3665b;
            if ((c2620a0K0.i() & iA) != 0) {
                for (e.c cVarO = c2620a0K0.o(); cVarO != null; cVarO = cVarO.h2()) {
                    if ((cVarO.f2() & iA) != 0) {
                        AbstractC2635m abstractC2635mG = cVarO;
                        ?? bVar = 0;
                        while (abstractC2635mG != 0) {
                            if (abstractC2635mG instanceof v0) {
                                v0 v0Var = (v0) abstractC2635mG;
                                if (v0Var.D0()) {
                                    J0.j jVar = new J0.j();
                                    n10.f51689a = jVar;
                                    jVar.w(true);
                                }
                                if (v0Var.S1()) {
                                    ((J0.j) n10.f51689a).x(true);
                                }
                                v0Var.q((J0.j) n10.f51689a);
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
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public G(boolean z10, int i10) {
        this.f3634a = z10;
        this.f3635b = i10;
        this.f3640g = new X(new V.b(new G[16], 0), new i());
        this.f3649p = new V.b(new G[16], 0);
        this.f3650q = true;
        this.f3651r = f3619Z;
        this.f3653t = K.f3668a;
        this.f3654u = Y0.t.Ltr;
        this.f3655v = f3621g1;
        this.f3656w = InterfaceC3563x.f21273W.a();
        g gVar = g.NotUsed;
        this.f3657x = gVar;
        this.f3658y = gVar;
        this.f3623A = new C2620a0(this);
        this.f3624B = new L(this);
        this.f3627E = true;
        this.f3628F = androidx.compose.ui.e.f28771b0;
    }

    private final void C0() {
        if (this.f3623A.p(e0.a(1024) | e0.a(2048) | e0.a(4096))) {
            for (e.c cVarK = this.f3623A.k(); cVarK != null; cVarK = cVarK.b2()) {
                if (((e0.a(1024) & cVarK.f2()) != 0) | ((e0.a(2048) & cVarK.f2()) != 0) | ((e0.a(4096) & cVarK.f2()) != 0)) {
                    f0.a(cVarK);
                }
            }
        }
    }

    private final void E1(G g10) {
        if (AbstractC6492s.d(g10, this.f3638e)) {
            return;
        }
        this.f3638e = g10;
        if (g10 != null) {
            this.f3624B.q();
            AbstractC2624c0 abstractC2624c0H2 = P().H2();
            for (AbstractC2624c0 abstractC2624c0M0 = m0(); !AbstractC6492s.d(abstractC2624c0M0, abstractC2624c0H2) && abstractC2624c0M0 != null; abstractC2624c0M0 = abstractC2624c0M0.H2()) {
                abstractC2624c0M0.s2();
            }
        }
        F0();
    }

    private final void J0() {
        G g10;
        if (this.f3639f > 0) {
            this.f3642i = true;
        }
        if (!this.f3634a || (g10 = this.f3643j) == null) {
            return;
        }
        g10.J0();
    }

    private final AbstractC2624c0 Q() {
        if (this.f3627E) {
            AbstractC2624c0 abstractC2624c0P = P();
            AbstractC2624c0 abstractC2624c0I2 = m0().I2();
            this.f3626D = null;
            while (true) {
                if (AbstractC6492s.d(abstractC2624c0P, abstractC2624c0I2)) {
                    break;
                }
                if ((abstractC2624c0P != null ? abstractC2624c0P.B2() : null) != null) {
                    this.f3626D = abstractC2624c0P;
                    break;
                }
                abstractC2624c0P = abstractC2624c0P != null ? abstractC2624c0P.I2() : null;
            }
        }
        AbstractC2624c0 abstractC2624c0 = this.f3626D;
        if (abstractC2624c0 == null || abstractC2624c0.B2() != null) {
            return abstractC2624c0;
        }
        B0.a.c("layer was not set");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ boolean Q0(G g10, Y0.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = g10.f3624B.z();
        }
        return g10.P0(bVar);
    }

    private final void f1(G g10) {
        if (g10.f3624B.s() > 0) {
            this.f3624B.W(r0.s() - 1);
        }
        if (this.f3644k != null) {
            g10.z();
        }
        g10.f3643j = null;
        g10.m0().n3(null);
        if (g10.f3634a) {
            this.f3639f--;
            V.b bVarF = g10.f3640g.f();
            int iO = bVarF.o();
            if (iO > 0) {
                Object[] objArrM = bVarF.m();
                int i10 = 0;
                do {
                    ((G) objArrM[i10]).m0().n3(null);
                    i10++;
                } while (i10 < iO);
            }
        }
        J0();
        h1();
    }

    private final void g1() {
        F0();
        G gO0 = o0();
        if (gO0 != null) {
            gO0.D0();
        }
        E0();
    }

    private final void j1() {
        if (this.f3642i) {
            int i10 = 0;
            this.f3642i = false;
            V.b bVar = this.f3641h;
            if (bVar == null) {
                bVar = new V.b(new G[16], 0);
                this.f3641h = bVar;
            }
            bVar.h();
            V.b bVarF = this.f3640g.f();
            int iO = bVarF.o();
            if (iO > 0) {
                Object[] objArrM = bVarF.m();
                do {
                    G g10 = (G) objArrM[i10];
                    if (g10.f3634a) {
                        bVar.c(bVar.o(), g10.w0());
                    } else {
                        bVar.b(g10);
                    }
                    i10++;
                } while (i10 < iO);
            }
            this.f3624B.N();
        }
    }

    private final C2646y l0() {
        C2646y c2646y = this.f3652s;
        if (c2646y != null) {
            return c2646y;
        }
        C2646y c2646y2 = new C2646y(this, e0());
        this.f3652s = c2646y2;
        return c2646y2;
    }

    public static /* synthetic */ boolean l1(G g10, Y0.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = g10.f3624B.y();
        }
        return g10.k1(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(G g10, G g11) {
        return g10.u0() == g11.u0() ? AbstractC6492s.k(g10.p0(), g11.p0()) : Float.compare(g10.u0(), g11.u0());
    }

    public static /* synthetic */ void q1(G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        g10.p1(z10);
    }

    public static /* synthetic */ void s1(G g10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        g10.r1(z10, z11, z12);
    }

    private final void t(androidx.compose.ui.e eVar) {
        this.f3628F = eVar;
        this.f3623A.E(eVar);
        this.f3624B.c0();
        if (this.f3638e == null && this.f3623A.q(e0.a(512))) {
            E1(this);
        }
    }

    private final float u0() {
        return c0().B1();
    }

    public static /* synthetic */ void u1(G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        g10.t1(z10);
    }

    private final void w() {
        this.f3658y = this.f3657x;
        this.f3657x = g.NotUsed;
        V.b bVarW0 = w0();
        int iO = bVarW0.o();
        if (iO > 0) {
            Object[] objArrM = bVarW0.m();
            int i10 = 0;
            do {
                G g10 = (G) objArrM[i10];
                if (g10.f3657x == g.InLayoutBlock) {
                    g10.w();
                }
                i10++;
            } while (i10 < iO);
        }
    }

    public static /* synthetic */ void w1(G g10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        g10.v1(z10, z11, z12);
    }

    private final String x(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        V.b bVarW0 = w0();
        int iO = bVarW0.o();
        if (iO > 0) {
            Object[] objArrM = bVarW0.m();
            int i12 = 0;
            do {
                sb2.append(((G) objArrM[i12]).x(i10 + 1));
                i12++;
            } while (i12 < iO);
        }
        String string = sb2.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    static /* synthetic */ String y(G g10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return g10.x(i10);
    }

    public static /* synthetic */ void y0(G g10, long j10, C2642u c2642u, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        g10.x0(j10, c2642u, z12, z11);
    }

    private final void y1() {
        this.f3623A.x();
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
    public final void A() {
        if (W() != e.Idle || V() || d0() || L0() || !q()) {
            return;
        }
        C2620a0 c2620a0 = this.f3623A;
        int iA = e0.a(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        if ((c2620a0.i() & iA) != 0) {
            for (e.c cVarK = c2620a0.k(); cVarK != null; cVarK = cVarK.b2()) {
                if ((cVarK.f2() & iA) != 0) {
                    AbstractC2635m abstractC2635mG = cVarK;
                    ?? bVar = 0;
                    while (abstractC2635mG != 0) {
                        if (abstractC2635mG instanceof InterfaceC2641t) {
                            InterfaceC2641t interfaceC2641t = (InterfaceC2641t) abstractC2635mG;
                            interfaceC2641t.B(AbstractC2633k.h(interfaceC2641t, e0.a(PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
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
                if ((cVarK.a2() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final void A1(boolean z10) {
        this.f3659z = z10;
    }

    public final void B(InterfaceC6717n0 interfaceC6717n0, C7182c c7182c) {
        m0().p2(interfaceC6717n0, c7182c);
    }

    public final void B0(int i10, G g10) {
        if (!(g10.f3643j == null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot insert ");
            sb2.append(g10);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(y(this, 0, 1, null));
            sb2.append(" Other tree: ");
            G g11 = g10.f3643j;
            sb2.append(g11 != null ? y(g11, 0, 1, null) : null);
            B0.a.b(sb2.toString());
        }
        if (!(g10.f3644k == null)) {
            B0.a.b("Cannot insert " + g10 + " because it already has an owner. This tree: " + y(this, 0, 1, null) + " Other tree: " + y(g10, 0, 1, null));
        }
        g10.f3643j = this;
        this.f3640g.a(i10, g10);
        h1();
        if (g10.f3634a) {
            this.f3639f++;
        }
        J0();
        m0 m0Var = this.f3644k;
        if (m0Var != null) {
            g10.u(m0Var);
        }
        if (g10.f3624B.s() > 0) {
            L l10 = this.f3624B;
            l10.W(l10.s() + 1);
        }
    }

    public final void B1(boolean z10) {
        this.f3627E = z10;
    }

    public final boolean C() {
        AbstractC2619a abstractC2619aP;
        L l10 = this.f3624B;
        if (l10.r().p().k()) {
            return true;
        }
        InterfaceC2621b interfaceC2621bC = l10.C();
        return (interfaceC2621bC == null || (abstractC2619aP = interfaceC2621bC.p()) == null || !abstractC2619aP.k()) ? false : true;
    }

    public final void C1(androidx.compose.ui.viewinterop.c cVar) {
        this.f3645l = cVar;
    }

    public final boolean D() {
        return this.f3629G != null;
    }

    public final void D0() {
        AbstractC2624c0 abstractC2624c0Q = Q();
        if (abstractC2624c0Q != null) {
            abstractC2624c0Q.R2();
            return;
        }
        G gO0 = o0();
        if (gO0 != null) {
            gO0.D0();
        }
    }

    public final void D1(g gVar) {
        this.f3657x = gVar;
    }

    public final boolean E() {
        return this.f3659z;
    }

    public final void E0() {
        AbstractC2624c0 abstractC2624c0M0 = m0();
        AbstractC2624c0 abstractC2624c0P = P();
        while (abstractC2624c0M0 != abstractC2624c0P) {
            AbstractC6492s.g(abstractC2624c0M0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C c10 = (C) abstractC2624c0M0;
            l0 l0VarB2 = c10.B2();
            if (l0VarB2 != null) {
                l0VarB2.invalidate();
            }
            abstractC2624c0M0 = c10.H2();
        }
        l0 l0VarB22 = P().B2();
        if (l0VarB22 != null) {
            l0VarB22.invalidate();
        }
    }

    public final List F() {
        L.a aVarZ = Z();
        AbstractC6492s.f(aVarZ);
        return aVarZ.Y0();
    }

    public final void F0() {
        if (this.f3638e != null) {
            s1(this, false, false, false, 7, null);
        } else {
            w1(this, false, false, false, 7, null);
        }
    }

    public final void F1(boolean z10) {
        this.f3632J = z10;
    }

    public final List G() {
        return c0().h1();
    }

    public final void G0() {
        if (V() || d0() || this.f3632J) {
            return;
        }
        K.b(this).c(this);
    }

    public final void G1(InterfaceC6835l interfaceC6835l) {
        this.f3630H = interfaceC6835l;
    }

    public final List H() {
        return w0().g();
    }

    public final void H0() {
        this.f3624B.M();
    }

    public final void H1(InterfaceC6835l interfaceC6835l) {
        this.f3631I = interfaceC6835l;
    }

    public final J0.j I() {
        if (!K0() || L0()) {
            return null;
        }
        if (!this.f3623A.q(e0.a(8)) || this.f3648o != null) {
            return this.f3648o;
        }
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        n10.f51689a = new J0.j();
        K.b(this).getSnapshotObserver().j(this, new j(n10));
        Object obj = n10.f51689a;
        this.f3648o = (J0.j) obj;
        return (J0.j) obj;
    }

    public final void I0() {
        this.f3648o = null;
        K.b(this).z();
    }

    public void I1(int i10) {
        this.f3635b = i10;
    }

    public InterfaceC3563x J() {
        return this.f3656w;
    }

    public final void J1(androidx.compose.ui.layout.h hVar) {
        this.f3625C = hVar;
    }

    public Y0.d K() {
        return this.f3653t;
    }

    public boolean K0() {
        return this.f3644k != null;
    }

    public final void K1(boolean z10) {
        this.f3637d = z10;
    }

    public final int L() {
        return this.f3646m;
    }

    public boolean L0() {
        return this.f3633N;
    }

    public final void L1() {
        if (this.f3639f > 0) {
            j1();
        }
    }

    public final List M() {
        return this.f3640g.b();
    }

    public final boolean M0() {
        return c0().L1();
    }

    public final boolean N() {
        long jA2 = P().A2();
        return Y0.b.j(jA2) && Y0.b.i(jA2);
    }

    public final Boolean N0() {
        L.a aVarZ = Z();
        if (aVarZ != null) {
            return Boolean.valueOf(aVarZ.q());
        }
        return null;
    }

    public int O() {
        return this.f3624B.x();
    }

    public final boolean O0() {
        return this.f3637d;
    }

    public final AbstractC2624c0 P() {
        return this.f3623A.l();
    }

    public final boolean P0(Y0.b bVar) {
        if (bVar == null || this.f3638e == null) {
            return false;
        }
        L.a aVarZ = Z();
        AbstractC6492s.f(aVarZ);
        return aVarZ.S1(bVar.r());
    }

    public View R() {
        androidx.compose.ui.viewinterop.c cVar = this.f3645l;
        if (cVar != null) {
            return cVar.getInteropView();
        }
        return null;
    }

    public final void R0() {
        if (this.f3657x == g.NotUsed) {
            w();
        }
        L.a aVarZ = Z();
        AbstractC6492s.f(aVarZ);
        aVarZ.U1();
    }

    public final androidx.compose.ui.viewinterop.c S() {
        return this.f3645l;
    }

    public final void S0() {
        this.f3624B.O();
    }

    public final g T() {
        return this.f3657x;
    }

    public final void T0() {
        this.f3624B.P();
    }

    public final L U() {
        return this.f3624B;
    }

    public final void U0() {
        this.f3624B.Q();
    }

    public final boolean V() {
        return this.f3624B.A();
    }

    public final void V0() {
        this.f3624B.R();
    }

    public final e W() {
        return this.f3624B.B();
    }

    public final int W0(int i10) {
        return l0().b(i10);
    }

    public final boolean X() {
        return this.f3624B.F();
    }

    public final int X0(int i10) {
        return l0().c(i10);
    }

    public final boolean Y() {
        return this.f3624B.G();
    }

    public final int Y0(int i10) {
        return l0().d(i10);
    }

    public final L.a Z() {
        return this.f3624B.H();
    }

    public final int Z0(int i10) {
        return l0().e(i10);
    }

    @Override // E0.InterfaceC2629g
    public void a(Y0.d dVar) {
        if (AbstractC6492s.d(this.f3653t, dVar)) {
            return;
        }
        this.f3653t = dVar;
        g1();
        for (e.c cVarK = this.f3623A.k(); cVarK != null; cVarK = cVarK.b2()) {
            if ((e0.a(16) & cVarK.f2()) != 0) {
                ((s0) cVarK).T0();
            } else if (cVarK instanceof InterfaceC6232c) {
                ((InterfaceC6232c) cVarK).c0();
            }
        }
    }

    public final G a0() {
        return this.f3638e;
    }

    public final int a1(int i10) {
        return l0().f(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
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
    @Override // E0.InterfaceC2629g
    public void b(Y0.t tVar) {
        if (this.f3654u != tVar) {
            this.f3654u = tVar;
            g1();
            C2620a0 c2620a0 = this.f3623A;
            int iA = e0.a(4);
            if ((c2620a0.i() & iA) != 0) {
                for (e.c cVarK = c2620a0.k(); cVarK != null; cVarK = cVarK.b2()) {
                    if ((cVarK.f2() & iA) != 0) {
                        AbstractC2635m abstractC2635mG = cVarK;
                        ?? bVar = 0;
                        while (abstractC2635mG != 0) {
                            if (abstractC2635mG instanceof r) {
                                r rVar = (r) abstractC2635mG;
                                if (rVar instanceof InterfaceC6232c) {
                                    ((InterfaceC6232c) rVar).c0();
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
                    if ((cVarK.a2() & iA) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final I b0() {
        return K.b(this).getSharedDrawScope();
    }

    public final int b1(int i10) {
        return l0().g(i10);
    }

    @Override // C0.v
    public C0.r c() {
        return P();
    }

    public final L.b c0() {
        return this.f3624B.I();
    }

    public final int c1(int i10) {
        return l0().h(i10);
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
    @Override // E0.m0.b
    public void d() {
        AbstractC2624c0 abstractC2624c0P = P();
        int iA = e0.a(128);
        boolean zI = f0.i(iA);
        e.c cVarG2 = abstractC2624c0P.G2();
        if (!zI && (cVarG2 = cVarG2.h2()) == null) {
            return;
        }
        for (e.c cVarM2 = abstractC2624c0P.M2(zI); cVarM2 != null && (cVarM2.a2() & iA) != 0; cVarM2 = cVarM2.b2()) {
            if ((cVarM2.f2() & iA) != 0) {
                AbstractC2635m abstractC2635mG = cVarM2;
                ?? bVar = 0;
                while (abstractC2635mG != 0) {
                    if (abstractC2635mG instanceof A) {
                        ((A) abstractC2635mG).Y1(P());
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

    public final boolean d0() {
        return this.f3624B.J();
    }

    public final int d1(int i10) {
        return l0().i(i10);
    }

    @Override // E0.InterfaceC2629g
    public void e(int i10) {
        this.f3636c = i10;
    }

    public C0.C e0() {
        return this.f3651r;
    }

    public final void e1(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            this.f3640g.a(i10 > i11 ? i11 + i13 : (i11 + i12) - 2, (G) this.f3640g.g(i10 > i11 ? i10 + i13 : i10));
        }
        h1();
        J0();
        F0();
    }

    @Override // T.InterfaceC3538k
    public void f() {
        androidx.compose.ui.viewinterop.c cVar = this.f3645l;
        if (cVar != null) {
            cVar.f();
        }
        androidx.compose.ui.layout.h hVar = this.f3625C;
        if (hVar != null) {
            hVar.f();
        }
        AbstractC2624c0 abstractC2624c0H2 = P().H2();
        for (AbstractC2624c0 abstractC2624c0M0 = m0(); !AbstractC6492s.d(abstractC2624c0M0, abstractC2624c0H2) && abstractC2624c0M0 != null; abstractC2624c0M0 = abstractC2624c0M0.H2()) {
            abstractC2624c0M0.b3();
        }
    }

    public final g f0() {
        return c0().r1();
    }

    @Override // E0.InterfaceC2629g
    public void g(androidx.compose.ui.e eVar) {
        if (!(!this.f3634a || i0() == androidx.compose.ui.e.f28771b0)) {
            B0.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (L0()) {
            B0.a.a("modifier is updated when deactivated");
        }
        if (K0()) {
            t(eVar);
        } else {
            this.f3629G = eVar;
        }
    }

    public final g g0() {
        g gVarH1;
        L.a aVarZ = Z();
        return (aVarZ == null || (gVarH1 = aVarZ.h1()) == null) ? g.NotUsed : gVarH1;
    }

    @Override // C0.v
    public Y0.t getLayoutDirection() {
        return this.f3654u;
    }

    @Override // T.InterfaceC3538k
    public void h() {
        androidx.compose.ui.viewinterop.c cVar = this.f3645l;
        if (cVar != null) {
            cVar.h();
        }
        androidx.compose.ui.layout.h hVar = this.f3625C;
        if (hVar != null) {
            hVar.h();
        }
        this.f3633N = true;
        y1();
        if (K0()) {
            I0();
        }
    }

    @Override // E0.n0
    public boolean h0() {
        return K0();
    }

    public final void h1() {
        if (!this.f3634a) {
            this.f3650q = true;
            return;
        }
        G gO0 = o0();
        if (gO0 != null) {
            gO0.h1();
        }
    }

    @Override // E0.InterfaceC2629g
    public void i(C0.C c10) {
        if (AbstractC6492s.d(this.f3651r, c10)) {
            return;
        }
        this.f3651r = c10;
        C2646y c2646y = this.f3652s;
        if (c2646y != null) {
            c2646y.k(e0());
        }
        F0();
    }

    public androidx.compose.ui.e i0() {
        return this.f3628F;
    }

    public final void i1(int i10, int i11) {
        t.a placementScope;
        AbstractC2624c0 abstractC2624c0P;
        if (this.f3657x == g.NotUsed) {
            w();
        }
        G gO0 = o0();
        if (gO0 == null || (abstractC2624c0P = gO0.P()) == null || (placementScope = abstractC2624c0P.q1()) == null) {
            placementScope = K.b(this).getPlacementScope();
        }
        t.a.l(placementScope, c0(), i10, i11, 0.0f, 4, null);
    }

    @Override // C0.N
    public void j() {
        if (this.f3638e != null) {
            s1(this, false, false, false, 5, null);
        } else {
            w1(this, false, false, false, 5, null);
        }
        Y0.b bVarY = this.f3624B.y();
        if (bVarY != null) {
            m0 m0Var = this.f3644k;
            if (m0Var != null) {
                m0Var.A(this, bVarY.r());
                return;
            }
            return;
        }
        m0 m0Var2 = this.f3644k;
        if (m0Var2 != null) {
            m0.f(m0Var2, false, 1, null);
        }
    }

    public final boolean j0() {
        return this.f3632J;
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
    @Override // E0.InterfaceC2629g
    public void k(w1 w1Var) {
        if (AbstractC6492s.d(this.f3655v, w1Var)) {
            return;
        }
        this.f3655v = w1Var;
        C2620a0 c2620a0 = this.f3623A;
        int iA = e0.a(16);
        if ((c2620a0.i() & iA) != 0) {
            for (e.c cVarK = c2620a0.k(); cVarK != null; cVarK = cVarK.b2()) {
                if ((cVarK.f2() & iA) != 0) {
                    AbstractC2635m abstractC2635mG = cVarK;
                    ?? bVar = 0;
                    while (abstractC2635mG != 0) {
                        if (abstractC2635mG instanceof s0) {
                            ((s0) abstractC2635mG).M1();
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
                if ((cVarK.a2() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final C2620a0 k0() {
        return this.f3623A;
    }

    public final boolean k1(Y0.b bVar) {
        if (bVar == null) {
            return false;
        }
        if (this.f3657x == g.NotUsed) {
            v();
        }
        return c0().c2(bVar.r());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
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
    @Override // E0.InterfaceC2629g
    public void l(InterfaceC3563x interfaceC3563x) {
        this.f3656w = interfaceC3563x;
        a((Y0.d) interfaceC3563x.b(AbstractC3932k0.g()));
        b((Y0.t) interfaceC3563x.b(AbstractC3932k0.m()));
        k((w1) interfaceC3563x.b(AbstractC3932k0.t()));
        C2620a0 c2620a0 = this.f3623A;
        int iA = e0.a(32768);
        if ((c2620a0.i() & iA) != 0) {
            for (e.c cVarK = c2620a0.k(); cVarK != null; cVarK = cVarK.b2()) {
                if ((cVarK.f2() & iA) != 0) {
                    AbstractC2635m abstractC2635mG = cVarK;
                    ?? bVar = 0;
                    while (abstractC2635mG != 0) {
                        if (abstractC2635mG instanceof InterfaceC2630h) {
                            e.c cVarH1 = ((InterfaceC2630h) abstractC2635mG).h1();
                            if (cVarH1.k2()) {
                                f0.e(cVarH1);
                            } else {
                                cVarH1.A2(true);
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
                if ((cVarK.a2() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final AbstractC2624c0 m0() {
        return this.f3623A.n();
    }

    public final void m1() {
        int iE = this.f3640g.e();
        while (true) {
            iE--;
            if (-1 >= iE) {
                this.f3640g.c();
                return;
            }
            f1((G) this.f3640g.d(iE));
        }
    }

    public final m0 n0() {
        return this.f3644k;
    }

    public final void n1(int i10, int i11) {
        if (!(i11 >= 0)) {
            B0.a.a("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            f1((G) this.f3640g.d(i12));
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    public final G o0() {
        G g10 = this.f3643j;
        while (g10 != null && g10.f3634a) {
            g10 = g10.f3643j;
        }
        return g10;
    }

    public final void o1() {
        if (this.f3657x == g.NotUsed) {
            w();
        }
        c0().d2();
    }

    @Override // T.InterfaceC3538k
    public void p() {
        if (!K0()) {
            B0.a.a("onReuse is only expected on attached node");
        }
        androidx.compose.ui.viewinterop.c cVar = this.f3645l;
        if (cVar != null) {
            cVar.p();
        }
        androidx.compose.ui.layout.h hVar = this.f3625C;
        if (hVar != null) {
            hVar.p();
        }
        if (L0()) {
            this.f3633N = false;
            I0();
        } else {
            y1();
        }
        I1(J0.m.a());
        this.f3623A.s();
        this.f3623A.y();
        x1(this);
    }

    public final int p0() {
        return c0().z1();
    }

    public final void p1(boolean z10) {
        m0 m0Var;
        if (this.f3634a || (m0Var = this.f3644k) == null) {
            return;
        }
        m0Var.C(this, true, z10);
    }

    @Override // C0.v
    public boolean q() {
        return c0().q();
    }

    public int q0() {
        return this.f3635b;
    }

    public final androidx.compose.ui.layout.h r0() {
        return this.f3625C;
    }

    public final void r1(boolean z10, boolean z11, boolean z12) {
        if (!(this.f3638e != null)) {
            B0.a.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        m0 m0Var = this.f3644k;
        if (m0Var == null || this.f3647n || this.f3634a) {
            return;
        }
        m0Var.o(this, true, z10, z11);
        if (z12) {
            L.a aVarZ = Z();
            AbstractC6492s.f(aVarZ);
            aVarZ.q1(z10);
        }
    }

    public w1 s0() {
        return this.f3655v;
    }

    public int t0() {
        return this.f3624B.L();
    }

    public final void t1(boolean z10) {
        m0 m0Var;
        if (this.f3634a || (m0Var = this.f3644k) == null) {
            return;
        }
        m0.B(m0Var, this, false, z10, 2, null);
    }

    public String toString() {
        return E0.a(this, null) + " children: " + H().size() + " measurePolicy: " + e0();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(E0.m0 r7) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.G.u(E0.m0):void");
    }

    public final void v() {
        this.f3658y = this.f3657x;
        this.f3657x = g.NotUsed;
        V.b bVarW0 = w0();
        int iO = bVarW0.o();
        if (iO > 0) {
            Object[] objArrM = bVarW0.m();
            int i10 = 0;
            do {
                G g10 = (G) objArrM[i10];
                if (g10.f3657x != g.NotUsed) {
                    g10.v();
                }
                i10++;
            } while (i10 < iO);
        }
    }

    public final V.b v0() {
        if (this.f3650q) {
            this.f3649p.h();
            V.b bVar = this.f3649p;
            bVar.c(bVar.o(), w0());
            this.f3649p.F(f3622h1);
            this.f3650q = false;
        }
        return this.f3649p;
    }

    public final void v1(boolean z10, boolean z11, boolean z12) {
        m0 m0Var;
        if (this.f3647n || this.f3634a || (m0Var = this.f3644k) == null) {
            return;
        }
        m0.v(m0Var, this, false, z10, z11, 2, null);
        if (z12) {
            c0().E1(z10);
        }
    }

    public final V.b w0() {
        L1();
        if (this.f3639f == 0) {
            return this.f3640g.f();
        }
        V.b bVar = this.f3641h;
        AbstractC6492s.f(bVar);
        return bVar;
    }

    public final void x0(long j10, C2642u c2642u, boolean z10, boolean z11) {
        m0().P2(AbstractC2624c0.f3847X.a(), AbstractC2624c0.v2(m0(), j10, false, 2, null), c2642u, z10, z11);
    }

    public final void x1(G g10) {
        if (h.f3662a[g10.W().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + g10.W());
        }
        if (g10.Y()) {
            s1(g10, true, false, false, 6, null);
            return;
        }
        if (g10.X()) {
            g10.p1(true);
        }
        if (g10.d0()) {
            w1(g10, true, false, false, 6, null);
        } else if (g10.V()) {
            g10.t1(true);
        }
    }

    public final void z() {
        m0 m0Var = this.f3644k;
        if (m0Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            G gO0 = o0();
            sb2.append(gO0 != null ? y(gO0, 0, 1, null) : null);
            B0.a.c(sb2.toString());
            throw new KotlinNothingValueException();
        }
        G gO02 = o0();
        if (gO02 != null) {
            gO02.D0();
            gO02.F0();
            L.b bVarC0 = c0();
            g gVar = g.NotUsed;
            bVarC0.f2(gVar);
            L.a aVarZ = Z();
            if (aVarZ != null) {
                aVarZ.Y1(gVar);
            }
        }
        this.f3624B.V();
        InterfaceC6835l interfaceC6835l = this.f3631I;
        if (interfaceC6835l != null) {
            interfaceC6835l.invoke(m0Var);
        }
        if (this.f3623A.q(e0.a(8))) {
            I0();
        }
        this.f3623A.z();
        this.f3647n = true;
        V.b bVarF = this.f3640g.f();
        int iO = bVarF.o();
        if (iO > 0) {
            Object[] objArrM = bVarF.m();
            int i10 = 0;
            do {
                ((G) objArrM[i10]).z();
                i10++;
            } while (i10 < iO);
        }
        this.f3647n = false;
        this.f3623A.t();
        m0Var.i(this);
        this.f3644k = null;
        E1(null);
        this.f3646m = 0;
        c0().Y1();
        L.a aVarZ2 = Z();
        if (aVarZ2 != null) {
            aVarZ2.M1();
        }
    }

    public final void z0(long j10, C2642u c2642u, boolean z10, boolean z11) {
        m0().P2(AbstractC2624c0.f3847X.b(), AbstractC2624c0.v2(m0(), j10, false, 2, null), c2642u, true, z11);
    }

    public final void z1() {
        V.b bVarW0 = w0();
        int iO = bVarW0.o();
        if (iO > 0) {
            Object[] objArrM = bVarW0.m();
            int i10 = 0;
            do {
                G g10 = (G) objArrM[i10];
                g gVar = g10.f3658y;
                g10.f3657x = gVar;
                if (gVar != g.NotUsed) {
                    g10.z1();
                }
                i10++;
            } while (i10 < iO);
        }
    }

    public /* synthetic */ G(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? J0.m.a() : i10);
    }
}
