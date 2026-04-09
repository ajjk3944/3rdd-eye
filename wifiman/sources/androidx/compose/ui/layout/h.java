package androidx.compose.ui.layout;

import C0.C;
import C0.C2527g;
import C0.D;
import C0.U;
import E0.B0;
import E0.C2620a0;
import E0.G;
import E0.K;
import E0.L;
import E0.Q;
import T.AbstractC3546o;
import T.AbstractC3550q;
import T.InterfaceC3538k;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.U0;
import T.t1;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.x;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.platform.M1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class h implements InterfaceC3538k {

    /* renamed from: a, reason: collision with root package name */
    private final G f28995a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC3550q f28996b;

    /* renamed from: c, reason: collision with root package name */
    private y f28997c;

    /* renamed from: d, reason: collision with root package name */
    private int f28998d;

    /* renamed from: e, reason: collision with root package name */
    private int f28999e;

    /* renamed from: n, reason: collision with root package name */
    private int f29008n;

    /* renamed from: o, reason: collision with root package name */
    private int f29009o;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f29000f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f29001g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final c f29002h = new c();

    /* renamed from: i, reason: collision with root package name */
    private final b f29003i = new b();

    /* renamed from: j, reason: collision with root package name */
    private final HashMap f29004j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private final y.a f29005k = new y.a(null, 1, null);

    /* renamed from: l, reason: collision with root package name */
    private final Map f29006l = new LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    private final V.b f29007m = new V.b(new Object[16], 0);

    /* renamed from: p, reason: collision with root package name */
    private final String f29010p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    private final class b implements U, m {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ c f29017a;

        public b() {
            this.f29017a = h.this.f29002h;
        }

        @Override // Y0.d
        public long F0(float f10) {
            return this.f29017a.F0(f10);
        }

        @Override // Y0.d
        public long K1(long j10) {
            return this.f29017a.K1(j10);
        }

        @Override // Y0.d
        public float N0(float f10) {
            return this.f29017a.N0(f10);
        }

        @Override // Y0.d
        public float N1(long j10) {
            return this.f29017a.N1(j10);
        }

        @Override // C0.U
        public List Q1(Object obj, InterfaceC6839p interfaceC6839p) {
            G g10 = (G) h.this.f29001g.get(obj);
            List listG = g10 != null ? g10.G() : null;
            return listG != null ? listG : h.this.F(obj, interfaceC6839p);
        }

        @Override // C0.InterfaceC2535o
        public boolean a1() {
            return this.f29017a.a1();
        }

        @Override // Y0.d
        public float d1(float f10) {
            return this.f29017a.d1(f10);
        }

        @Override // Y0.l
        public long e0(float f10) {
            return this.f29017a.e0(f10);
        }

        @Override // Y0.d
        public long f0(long j10) {
            return this.f29017a.f0(j10);
        }

        @Override // Y0.d
        public float getDensity() {
            return this.f29017a.getDensity();
        }

        @Override // C0.InterfaceC2535o
        public Y0.t getLayoutDirection() {
            return this.f29017a.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.m
        public D i1(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
            return this.f29017a.i1(i10, i11, map, interfaceC6835l, interfaceC6835l2);
        }

        @Override // Y0.l
        public float n0(long j10) {
            return this.f29017a.n0(j10);
        }

        @Override // androidx.compose.ui.layout.m
        public D v1(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l) {
            return this.f29017a.v1(i10, i11, map, interfaceC6835l);
        }

        @Override // Y0.d
        public float x(int i10) {
            return this.f29017a.x(i10);
        }

        @Override // Y0.d
        public int x1(float f10) {
            return this.f29017a.x1(f10);
        }

        @Override // Y0.l
        public float y() {
            return this.f29017a.y();
        }
    }

    private final class c implements U {

        /* renamed from: a, reason: collision with root package name */
        private Y0.t f29019a = Y0.t.Rtl;

        /* renamed from: b, reason: collision with root package name */
        private float f29020b;

        /* renamed from: c, reason: collision with root package name */
        private float f29021c;

        public static final class a implements D {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f29023a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f29024b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map f29025c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f29026d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f29027e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h f29028f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f29029g;

            a(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l, c cVar, h hVar, InterfaceC6835l interfaceC6835l2) {
                this.f29023a = i10;
                this.f29024b = i11;
                this.f29025c = map;
                this.f29026d = interfaceC6835l;
                this.f29027e = cVar;
                this.f29028f = hVar;
                this.f29029g = interfaceC6835l2;
            }

            @Override // C0.D
            public int getHeight() {
                return this.f29024b;
            }

            @Override // C0.D
            public int getWidth() {
                return this.f29023a;
            }

            @Override // C0.D
            public Map p() {
                return this.f29025c;
            }

            @Override // C0.D
            public void q() {
                Q qC2;
                if (!this.f29027e.a1() || (qC2 = this.f29028f.f28995a.P().C2()) == null) {
                    this.f29029g.invoke(this.f29028f.f28995a.P().q1());
                } else {
                    this.f29029g.invoke(qC2.q1());
                }
            }

            @Override // C0.D
            public InterfaceC6835l r() {
                return this.f29026d;
            }
        }

        public c() {
        }

        @Override // C0.U
        public List Q1(Object obj, InterfaceC6839p interfaceC6839p) {
            return h.this.K(obj, interfaceC6839p);
        }

        @Override // C0.InterfaceC2535o
        public boolean a1() {
            return h.this.f28995a.W() == G.e.LookaheadLayingOut || h.this.f28995a.W() == G.e.LookaheadMeasuring;
        }

        public void b(float f10) {
            this.f29020b = f10;
        }

        @Override // Y0.d
        public float getDensity() {
            return this.f29020b;
        }

        @Override // C0.InterfaceC2535o
        public Y0.t getLayoutDirection() {
            return this.f29019a;
        }

        @Override // androidx.compose.ui.layout.m
        public D i1(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
            if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
                B0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(i10, i11, map, interfaceC6835l, this, h.this, interfaceC6835l2);
        }

        public void p(float f10) {
            this.f29021c = f10;
        }

        public void q(Y0.t tVar) {
            this.f29019a = tVar;
        }

        @Override // Y0.l
        public float y() {
            return this.f29021c;
        }
    }

    public static final class d extends G.f {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f29031c;

        public static final class a implements D {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ D f29032a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f29033b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f29034c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ D f29035d;

            public a(D d10, h hVar, int i10, D d11) {
                this.f29033b = hVar;
                this.f29034c = i10;
                this.f29035d = d11;
                this.f29032a = d10;
            }

            @Override // C0.D
            public int getHeight() {
                return this.f29032a.getHeight();
            }

            @Override // C0.D
            public int getWidth() {
                return this.f29032a.getWidth();
            }

            @Override // C0.D
            public Map p() {
                return this.f29032a.p();
            }

            @Override // C0.D
            public void q() {
                this.f29033b.f28999e = this.f29034c;
                this.f29035d.q();
                this.f29033b.y();
            }

            @Override // C0.D
            public InterfaceC6835l r() {
                return this.f29032a.r();
            }
        }

        public static final class b implements D {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ D f29036a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f29037b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f29038c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ D f29039d;

            public b(D d10, h hVar, int i10, D d11) {
                this.f29037b = hVar;
                this.f29038c = i10;
                this.f29039d = d11;
                this.f29036a = d10;
            }

            @Override // C0.D
            public int getHeight() {
                return this.f29036a.getHeight();
            }

            @Override // C0.D
            public int getWidth() {
                return this.f29036a.getWidth();
            }

            @Override // C0.D
            public Map p() {
                return this.f29036a.p();
            }

            @Override // C0.D
            public void q() {
                this.f29037b.f28998d = this.f29038c;
                this.f29039d.q();
                h hVar = this.f29037b;
                hVar.x(hVar.f28998d);
            }

            @Override // C0.D
            public InterfaceC6835l r() {
                return this.f29036a.r();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC6839p interfaceC6839p, String str) {
            super(str);
            this.f29031c = interfaceC6839p;
        }

        @Override // C0.C
        public D b(m mVar, List list, long j10) {
            h.this.f29002h.q(mVar.getLayoutDirection());
            h.this.f29002h.b(mVar.getDensity());
            h.this.f29002h.p(mVar.y());
            if (mVar.a1() || h.this.f28995a.a0() == null) {
                h.this.f28998d = 0;
                D d10 = (D) this.f29031c.invoke(h.this.f29002h, Y0.b.a(j10));
                return new b(d10, h.this, h.this.f28998d, d10);
            }
            h.this.f28999e = 0;
            D d11 = (D) this.f29031c.invoke(h.this.f29003i, Y0.b.a(j10));
            return new a(d11, h.this, h.this.f28999e, d11);
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {
        e() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            boolean z10;
            Object key = entry.getKey();
            x.a aVar = (x.a) entry.getValue();
            int iQ = h.this.f29007m.q(key);
            if (iQ < 0 || iQ >= h.this.f28999e) {
                aVar.dispose();
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class f implements x.a {
        f() {
        }

        @Override // androidx.compose.ui.layout.x.a
        public void dispose() {
        }
    }

    public static final class g implements x.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f29042b;

        g(Object obj) {
            this.f29042b = obj;
        }

        @Override // androidx.compose.ui.layout.x.a
        public void a(Object obj, InterfaceC6835l interfaceC6835l) {
            C2620a0 c2620a0K0;
            e.c cVarK;
            G g10 = (G) h.this.f29004j.get(this.f29042b);
            if (g10 == null || (c2620a0K0 = g10.k0()) == null || (cVarK = c2620a0K0.k()) == null) {
                return;
            }
            B0.e(cVarK, obj, interfaceC6835l);
        }

        @Override // androidx.compose.ui.layout.x.a
        public void b(int i10, long j10) {
            G g10 = (G) h.this.f29004j.get(this.f29042b);
            if (g10 == null || !g10.K0()) {
                return;
            }
            int size = g10.H().size();
            if (i10 < 0 || i10 >= size) {
                throw new IndexOutOfBoundsException("Index (" + i10 + ") is out of bound of [0, " + size + ')');
            }
            if (g10.q()) {
                throw new IllegalArgumentException("Pre-measure called on node that is not placed");
            }
            G g11 = h.this.f28995a;
            g11.f3647n = true;
            K.b(g10).A((G) g10.H().get(i10), j10);
            g11.f3647n = false;
        }

        @Override // androidx.compose.ui.layout.x.a
        public int c() {
            List listH;
            G g10 = (G) h.this.f29004j.get(this.f29042b);
            if (g10 == null || (listH = g10.H()) == null) {
                return 0;
            }
            return listH.size();
        }

        @Override // androidx.compose.ui.layout.x.a
        public void dispose() {
            h.this.B();
            G g10 = (G) h.this.f29004j.remove(this.f29042b);
            if (g10 != null) {
                if (h.this.f29009o <= 0) {
                    throw new IllegalStateException("No pre-composed items to dispose");
                }
                int iIndexOf = h.this.f28995a.M().indexOf(g10);
                if (iIndexOf < h.this.f28995a.M().size() - h.this.f29009o) {
                    throw new IllegalStateException("Item is not in pre-composed item range");
                }
                h.this.f29008n++;
                h hVar = h.this;
                hVar.f29009o--;
                int size = (h.this.f28995a.M().size() - h.this.f29009o) - h.this.f29008n;
                h.this.D(iIndexOf, size, 1);
                h.this.x(size);
            }
        }
    }

    /* renamed from: androidx.compose.ui.layout.h$h, reason: collision with other inner class name */
    static final class C1068h extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f29043a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f29044b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1068h(a aVar, InterfaceC6839p interfaceC6839p) {
            super(2);
            this.f29043a = aVar;
            this.f29044b = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1750409193, i10, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:493)");
            }
            boolean zA = this.f29043a.a();
            InterfaceC6839p interfaceC6839p = this.f29044b;
            interfaceC3540l.y(207, Boolean.valueOf(zA));
            boolean zC = interfaceC3540l.c(zA);
            interfaceC3540l.U(-869707859);
            if (zA) {
                interfaceC6839p.invoke(interfaceC3540l, 0);
            } else {
                interfaceC3540l.p(zC);
            }
            interfaceC3540l.J();
            interfaceC3540l.d();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public h(G g10, y yVar) {
        this.f28995a = g10;
        this.f28997c = yVar;
    }

    private final Object A(int i10) {
        Object obj = this.f29000f.get((G) this.f28995a.M().get(i10));
        AbstractC6492s.f(obj);
        return ((a) obj).f();
    }

    private final void C(boolean z10) {
        this.f29009o = 0;
        this.f29004j.clear();
        int size = this.f28995a.M().size();
        if (this.f29008n != size) {
            this.f29008n = size;
            g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
            androidx.compose.runtime.snapshots.g gVarD = aVar.d();
            InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
            androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    G g10 = (G) this.f28995a.M().get(i10);
                    a aVar2 = (a) this.f29000f.get(g10);
                    if (aVar2 != null && aVar2.a()) {
                        H(g10);
                        if (z10) {
                            U0 u0B = aVar2.b();
                            if (u0B != null) {
                                u0B.deactivate();
                            }
                            aVar2.h(t1.d(Boolean.FALSE, null, 2, null));
                        } else {
                            aVar2.g(false);
                        }
                        aVar2.m(w.f29074a);
                    }
                } catch (Throwable th2) {
                    aVar.m(gVarD, gVarF, interfaceC6835lH);
                    throw th2;
                }
            }
            J j10 = J.f24997a;
            aVar.m(gVarD, gVarF, interfaceC6835lH);
            this.f29001g.clear();
        }
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int i10, int i11, int i12) {
        G g10 = this.f28995a;
        g10.f3647n = true;
        this.f28995a.e1(i10, i11, i12);
        g10.f3647n = false;
    }

    static /* synthetic */ void E(h hVar, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 1;
        }
        hVar.D(i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List F(Object obj, InterfaceC6839p interfaceC6839p) {
        if (this.f29007m.o() < this.f28999e) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        int iO = this.f29007m.o();
        int i10 = this.f28999e;
        if (iO == i10) {
            this.f29007m.b(obj);
        } else {
            this.f29007m.C(i10, obj);
        }
        this.f28999e++;
        if (!this.f29004j.containsKey(obj)) {
            this.f29006l.put(obj, G(obj, interfaceC6839p));
            if (this.f28995a.W() == G.e.LayingOut) {
                this.f28995a.p1(true);
            } else {
                G.s1(this.f28995a, true, false, false, 6, null);
            }
        }
        G g10 = (G) this.f29004j.get(obj);
        if (g10 == null) {
            return AbstractC3689v.l();
        }
        List listH1 = g10.c0().h1();
        int size = listH1.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((L.b) listH1.get(i11)).M1();
        }
        return listH1;
    }

    private final void H(G g10) {
        L.b bVarC0 = g10.c0();
        G.g gVar = G.g.NotUsed;
        bVarC0.f2(gVar);
        L.a aVarZ = g10.Z();
        if (aVarZ != null) {
            aVarZ.Y1(gVar);
        }
    }

    private final void L(G g10, a aVar) {
        g.a aVar2 = androidx.compose.runtime.snapshots.g.f28632e;
        androidx.compose.runtime.snapshots.g gVarD = aVar2.d();
        InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = aVar2.f(gVarD);
        try {
            G g11 = this.f28995a;
            g11.f3647n = true;
            InterfaceC6839p interfaceC6839pC = aVar.c();
            U0 u0B = aVar.b();
            AbstractC3550q abstractC3550q = this.f28996b;
            if (abstractC3550q == null) {
                throw new IllegalStateException("parent composition reference not set");
            }
            aVar.i(N(u0B, g10, aVar.e(), abstractC3550q, b0.c.c(-1750409193, true, new C1068h(aVar, interfaceC6839pC))));
            aVar.l(false);
            g11.f3647n = false;
            J j10 = J.f24997a;
        } finally {
            aVar2.m(gVarD, gVarF, interfaceC6835lH);
        }
    }

    private final void M(G g10, Object obj, InterfaceC6839p interfaceC6839p) {
        HashMap map = this.f29000f;
        Object aVar = map.get(g10);
        if (aVar == null) {
            aVar = new a(obj, C2527g.f2142a.a(), null, 4, null);
            map.put(g10, aVar);
        }
        a aVar2 = (a) aVar;
        U0 u0B = aVar2.b();
        boolean zO = u0B != null ? u0B.o() : true;
        if (aVar2.c() != interfaceC6839p || zO || aVar2.d()) {
            aVar2.j(interfaceC6839p);
            L(g10, aVar2);
            aVar2.k(false);
        }
    }

    private final U0 N(U0 u02, G g10, boolean z10, AbstractC3550q abstractC3550q, InterfaceC6839p interfaceC6839p) {
        if (u02 == null || u02.isDisposed()) {
            u02 = M1.a(g10, abstractC3550q);
        }
        if (z10) {
            u02.v(interfaceC6839p);
        } else {
            u02.e(interfaceC6839p);
        }
        return u02;
    }

    private final G O(Object obj) {
        int i10;
        if (this.f29008n == 0) {
            return null;
        }
        int size = this.f28995a.M().size() - this.f29009o;
        int i11 = size - this.f29008n;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 < i11) {
                i10 = -1;
                break;
            }
            if (AbstractC6492s.d(A(i13), obj)) {
                i10 = i13;
                break;
            }
            i13--;
        }
        if (i10 == -1) {
            while (i12 >= i11) {
                Object obj2 = this.f29000f.get((G) this.f28995a.M().get(i12));
                AbstractC6492s.f(obj2);
                a aVar = (a) obj2;
                if (aVar.f() == w.f29074a || this.f28997c.b(obj, aVar.f())) {
                    aVar.m(obj);
                    i13 = i12;
                    i10 = i13;
                    break;
                }
                i12--;
            }
            i13 = i12;
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            D(i13, i11, 1);
        }
        this.f29008n--;
        G g10 = (G) this.f28995a.M().get(i11);
        Object obj3 = this.f29000f.get(g10);
        AbstractC6492s.f(obj3);
        a aVar2 = (a) obj3;
        aVar2.h(t1.d(Boolean.TRUE, null, 2, null));
        aVar2.l(true);
        aVar2.k(true);
        return g10;
    }

    private final G v(int i10) {
        G g10 = new G(true, 0, 2, null);
        G g11 = this.f28995a;
        g11.f3647n = true;
        this.f28995a.B0(i10, g10);
        g11.f3647n = false;
        return g10;
    }

    private final void w() {
        G g10 = this.f28995a;
        g10.f3647n = true;
        Iterator it = this.f29000f.values().iterator();
        while (it.hasNext()) {
            U0 u0B = ((a) it.next()).b();
            if (u0B != null) {
                u0B.dispose();
            }
        }
        this.f28995a.m1();
        g10.f3647n = false;
        this.f29000f.clear();
        this.f29001g.clear();
        this.f29009o = 0;
        this.f29008n = 0;
        this.f29004j.clear();
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        AbstractC3689v.I(this.f29006l.entrySet(), new e());
    }

    public final void B() {
        int size = this.f28995a.M().size();
        if (this.f29000f.size() != size) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f29000f.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((size - this.f29008n) - this.f29009o >= 0) {
            if (this.f29004j.size() == this.f29009o) {
                return;
            }
            throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f29009o + ". Map size " + this.f29004j.size()).toString());
        }
        throw new IllegalArgumentException(("Incorrect state. Total children " + size + ". Reusable children " + this.f29008n + ". Precomposed children " + this.f29009o).toString());
    }

    public final x.a G(Object obj, InterfaceC6839p interfaceC6839p) {
        if (!this.f28995a.K0()) {
            return new f();
        }
        B();
        if (!this.f29001g.containsKey(obj)) {
            this.f29006l.remove(obj);
            HashMap map = this.f29004j;
            Object objO = map.get(obj);
            if (objO == null) {
                objO = O(obj);
                if (objO != null) {
                    D(this.f28995a.M().indexOf(objO), this.f28995a.M().size(), 1);
                    this.f29009o++;
                } else {
                    objO = v(this.f28995a.M().size());
                    this.f29009o++;
                }
                map.put(obj, objO);
            }
            M((G) objO, obj, interfaceC6839p);
        }
        return new g(obj);
    }

    public final void I(AbstractC3550q abstractC3550q) {
        this.f28996b = abstractC3550q;
    }

    public final void J(y yVar) {
        if (this.f28997c != yVar) {
            this.f28997c = yVar;
            C(false);
            G.w1(this.f28995a, false, false, false, 7, null);
        }
    }

    public final List K(Object obj, InterfaceC6839p interfaceC6839p) {
        B();
        G.e eVarW = this.f28995a.W();
        G.e eVar = G.e.Measuring;
        if (!(eVarW == eVar || eVarW == G.e.LayingOut || eVarW == G.e.LookaheadMeasuring || eVarW == G.e.LookaheadLayingOut)) {
            B0.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        HashMap map = this.f29001g;
        Object obj2 = map.get(obj);
        if (obj2 == null) {
            obj2 = (G) this.f29004j.remove(obj);
            if (obj2 != null) {
                if (!(this.f29009o > 0)) {
                    B0.a.b("Check failed.");
                }
                this.f29009o--;
            } else {
                G gO = O(obj);
                if (gO == null) {
                    gO = v(this.f28998d);
                }
                obj2 = gO;
            }
            map.put(obj, obj2);
        }
        G g10 = (G) obj2;
        if (AbstractC3689v.t0(this.f28995a.M(), this.f28998d) != g10) {
            int iIndexOf = this.f28995a.M().indexOf(g10);
            int i10 = this.f28998d;
            if (iIndexOf < i10) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i10 != iIndexOf) {
                E(this, iIndexOf, i10, 0, 4, null);
            }
        }
        this.f28998d++;
        M(g10, obj, interfaceC6839p);
        return (eVarW == eVar || eVarW == G.e.LayingOut) ? g10.G() : g10.F();
    }

    @Override // T.InterfaceC3538k
    public void f() {
        w();
    }

    @Override // T.InterfaceC3538k
    public void h() {
        C(true);
    }

    @Override // T.InterfaceC3538k
    public void p() {
        C(false);
    }

    public final C u(InterfaceC6839p interfaceC6839p) {
        return new d(interfaceC6839p, this.f29010p);
    }

    public final void x(int i10) {
        boolean z10 = false;
        this.f29008n = 0;
        int size = (this.f28995a.M().size() - this.f29009o) - 1;
        if (i10 <= size) {
            this.f29005k.clear();
            if (i10 <= size) {
                int i11 = i10;
                while (true) {
                    this.f29005k.add(A(i11));
                    if (i11 == size) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f28997c.a(this.f29005k);
            g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
            androidx.compose.runtime.snapshots.g gVarD = aVar.d();
            InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
            androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
            boolean z11 = false;
            while (size >= i10) {
                try {
                    G g10 = (G) this.f28995a.M().get(size);
                    Object obj = this.f29000f.get(g10);
                    AbstractC6492s.f(obj);
                    a aVar2 = (a) obj;
                    Object objF = aVar2.f();
                    if (this.f29005k.contains(objF)) {
                        this.f29008n++;
                        if (aVar2.a()) {
                            H(g10);
                            aVar2.g(false);
                            z11 = true;
                        }
                    } else {
                        G g11 = this.f28995a;
                        g11.f3647n = true;
                        this.f29000f.remove(g10);
                        U0 u0B = aVar2.b();
                        if (u0B != null) {
                            u0B.dispose();
                        }
                        this.f28995a.n1(size, 1);
                        g11.f3647n = false;
                    }
                    this.f29001g.remove(objF);
                    size--;
                } catch (Throwable th2) {
                    aVar.m(gVarD, gVarF, interfaceC6835lH);
                    throw th2;
                }
            }
            J j10 = J.f24997a;
            aVar.m(gVarD, gVarF, interfaceC6835lH);
            z10 = z11;
        }
        if (z10) {
            androidx.compose.runtime.snapshots.g.f28632e.n();
        }
        B();
    }

    public final void z() {
        if (this.f29008n != this.f28995a.M().size()) {
            Iterator it = this.f29000f.entrySet().iterator();
            while (it.hasNext()) {
                ((a) ((Map.Entry) it.next()).getValue()).k(true);
            }
            if (this.f28995a.d0()) {
                return;
            }
            G.w1(this.f28995a, false, false, false, 7, null);
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Object f29011a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC6839p f29012b;

        /* renamed from: c, reason: collision with root package name */
        private U0 f29013c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f29014d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f29015e;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC3551q0 f29016f;

        public a(Object obj, InterfaceC6839p interfaceC6839p, U0 u02) {
            this.f29011a = obj;
            this.f29012b = interfaceC6839p;
            this.f29013c = u02;
            this.f29016f = t1.d(Boolean.TRUE, null, 2, null);
        }

        public final boolean a() {
            return ((Boolean) this.f29016f.getValue()).booleanValue();
        }

        public final U0 b() {
            return this.f29013c;
        }

        public final InterfaceC6839p c() {
            return this.f29012b;
        }

        public final boolean d() {
            return this.f29014d;
        }

        public final boolean e() {
            return this.f29015e;
        }

        public final Object f() {
            return this.f29011a;
        }

        public final void g(boolean z10) {
            this.f29016f.setValue(Boolean.valueOf(z10));
        }

        public final void h(InterfaceC3551q0 interfaceC3551q0) {
            this.f29016f = interfaceC3551q0;
        }

        public final void i(U0 u02) {
            this.f29013c = u02;
        }

        public final void j(InterfaceC6839p interfaceC6839p) {
            this.f29012b = interfaceC6839p;
        }

        public final void k(boolean z10) {
            this.f29014d = z10;
        }

        public final void l(boolean z10) {
            this.f29015e = z10;
        }

        public final void m(Object obj) {
            this.f29011a = obj;
        }

        public /* synthetic */ a(Object obj, InterfaceC6839p interfaceC6839p, U0 u02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, interfaceC6839p, (i10 & 4) != 0 ? null : u02);
        }
    }
}
