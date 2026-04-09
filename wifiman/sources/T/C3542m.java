package T;

import T.A0;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import d0.AbstractC5269a;
import dh.InterfaceC5384i;
import e0.AbstractC5411d;
import e0.InterfaceC5408a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o.C7009H;
import o.C7032x;

/* renamed from: T.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3542m implements InterfaceC3540l {

    /* renamed from: B, reason: collision with root package name */
    private int f21113B;

    /* renamed from: C, reason: collision with root package name */
    private int f21114C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f21115D;

    /* renamed from: E, reason: collision with root package name */
    private final c f21116E;

    /* renamed from: F, reason: collision with root package name */
    private final y1 f21117F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f21118G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f21119H;

    /* renamed from: I, reason: collision with root package name */
    private C3513a1 f21120I;

    /* renamed from: J, reason: collision with root package name */
    private C3516b1 f21121J;

    /* renamed from: K, reason: collision with root package name */
    private C3525e1 f21122K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f21123L;

    /* renamed from: M, reason: collision with root package name */
    private A0 f21124M;

    /* renamed from: N, reason: collision with root package name */
    private U.a f21125N;

    /* renamed from: O, reason: collision with root package name */
    private final U.b f21126O;

    /* renamed from: P, reason: collision with root package name */
    private C3520d f21127P;

    /* renamed from: Q, reason: collision with root package name */
    private U.c f21128Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f21129R;

    /* renamed from: S, reason: collision with root package name */
    private int f21130S;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3526f f21131b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3550q f21132c;

    /* renamed from: d, reason: collision with root package name */
    private final C3516b1 f21133d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f21134e;

    /* renamed from: f, reason: collision with root package name */
    private U.a f21135f;

    /* renamed from: g, reason: collision with root package name */
    private U.a f21136g;

    /* renamed from: h, reason: collision with root package name */
    private final E f21137h;

    /* renamed from: j, reason: collision with root package name */
    private C3568z0 f21139j;

    /* renamed from: k, reason: collision with root package name */
    private int f21140k;

    /* renamed from: l, reason: collision with root package name */
    private int f21141l;

    /* renamed from: m, reason: collision with root package name */
    private int f21142m;

    /* renamed from: o, reason: collision with root package name */
    private int[] f21144o;

    /* renamed from: p, reason: collision with root package name */
    private C7032x f21145p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21146q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f21147r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21148s;

    /* renamed from: w, reason: collision with root package name */
    private V.a f21152w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f21153x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f21155z;

    /* renamed from: i, reason: collision with root package name */
    private final y1 f21138i = new y1();

    /* renamed from: n, reason: collision with root package name */
    private final V f21143n = new V();

    /* renamed from: t, reason: collision with root package name */
    private final List f21149t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    private final V f21150u = new V();

    /* renamed from: v, reason: collision with root package name */
    private A0 f21151v = b0.f.a();

    /* renamed from: y, reason: collision with root package name */
    private final V f21154y = new V();

    /* renamed from: A, reason: collision with root package name */
    private int f21112A = -1;

    /* renamed from: T.m$a */
    private static final class a implements V0 {

        /* renamed from: a, reason: collision with root package name */
        private final b f21156a;

        public a(b bVar) {
            this.f21156a = bVar;
        }

        public final b a() {
            return this.f21156a;
        }

        @Override // T.S0
        public void b() {
            this.f21156a.s();
        }

        @Override // T.S0
        public void c() {
            this.f21156a.s();
        }

        @Override // T.S0
        public void d() {
        }
    }

    /* renamed from: T.m$b */
    private final class b extends AbstractC3550q {

        /* renamed from: a, reason: collision with root package name */
        private final int f21157a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f21158b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f21159c;

        /* renamed from: d, reason: collision with root package name */
        private final C3567z f21160d;

        /* renamed from: e, reason: collision with root package name */
        private Set f21161e;

        /* renamed from: f, reason: collision with root package name */
        private final Set f21162f = new LinkedHashSet();

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC3551q0 f21163g = o1.h(b0.f.a(), o1.m());

        public b(int i10, boolean z10, boolean z11, C3567z c3567z) {
            this.f21157a = i10;
            this.f21158b = z10;
            this.f21159c = z11;
            this.f21160d = c3567z;
        }

        private final A0 u() {
            return (A0) this.f21163g.getValue();
        }

        private final void v(A0 a02) {
            this.f21163g.setValue(a02);
        }

        @Override // T.AbstractC3550q
        public void a(E e10, InterfaceC6839p interfaceC6839p) {
            C3542m.this.f21132c.a(e10, interfaceC6839p);
        }

        @Override // T.AbstractC3550q
        public void b() {
            C3542m c3542m = C3542m.this;
            c3542m.f21113B--;
        }

        @Override // T.AbstractC3550q
        public boolean c() {
            return C3542m.this.f21132c.c();
        }

        @Override // T.AbstractC3550q
        public boolean d() {
            return this.f21158b;
        }

        @Override // T.AbstractC3550q
        public boolean e() {
            return this.f21159c;
        }

        @Override // T.AbstractC3550q
        public A0 f() {
            return u();
        }

        @Override // T.AbstractC3550q
        public int g() {
            return this.f21157a;
        }

        @Override // T.AbstractC3550q
        public InterfaceC5384i h() {
            return C3542m.this.f21132c.h();
        }

        @Override // T.AbstractC3550q
        public C3567z i() {
            return this.f21160d;
        }

        @Override // T.AbstractC3550q
        public void j(C3541l0 c3541l0) {
            C3542m.this.f21132c.j(c3541l0);
        }

        @Override // T.AbstractC3550q
        public void k(E e10) {
            C3542m.this.f21132c.k(C3542m.this.F0());
            C3542m.this.f21132c.k(e10);
        }

        @Override // T.AbstractC3550q
        public AbstractC3539k0 l(C3541l0 c3541l0) {
            return C3542m.this.f21132c.l(c3541l0);
        }

        @Override // T.AbstractC3550q
        public void m(Set set) {
            Set hashSet = this.f21161e;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f21161e = hashSet;
            }
            hashSet.add(set);
        }

        @Override // T.AbstractC3550q
        public void n(InterfaceC3540l interfaceC3540l) {
            AbstractC6492s.g(interfaceC3540l, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.n((C3542m) interfaceC3540l);
            this.f21162f.add(interfaceC3540l);
        }

        @Override // T.AbstractC3550q
        public void o(E e10) {
            C3542m.this.f21132c.o(e10);
        }

        @Override // T.AbstractC3550q
        public void p() {
            C3542m.this.f21113B++;
        }

        @Override // T.AbstractC3550q
        public void q(InterfaceC3540l interfaceC3540l) {
            Set<Set> set = this.f21161e;
            if (set != null) {
                for (Set set2 : set) {
                    AbstractC6492s.g(interfaceC3540l, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((C3542m) interfaceC3540l).f21133d);
                }
            }
            kotlin.jvm.internal.V.a(this.f21162f).remove(interfaceC3540l);
        }

        @Override // T.AbstractC3550q
        public void r(E e10) {
            C3542m.this.f21132c.r(e10);
        }

        public final void s() {
            if (this.f21162f.isEmpty()) {
                return;
            }
            Set set = this.f21161e;
            if (set != null) {
                for (C3542m c3542m : this.f21162f) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(c3542m.f21133d);
                    }
                }
            }
            this.f21162f.clear();
        }

        public final Set t() {
            return this.f21162f;
        }

        public final void w(A0 a02) {
            v(a02);
        }
    }

    /* renamed from: T.m$c */
    public static final class c implements I {
        c() {
        }

        @Override // T.I
        public void a(H h10) {
            C3542m c3542m = C3542m.this;
            c3542m.f21113B--;
        }

        @Override // T.I
        public void b(H h10) {
            C3542m.this.f21113B++;
        }
    }

    /* renamed from: T.m$d */
    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U.a f21167b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3513a1 f21168c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3541l0 f21169d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(U.a aVar, C3513a1 c3513a1, C3541l0 c3541l0) {
            super(0);
            this.f21167b = aVar;
            this.f21168c = c3513a1;
            this.f21169d = c3541l0;
        }

        public final void a() {
            U.b bVar = C3542m.this.f21126O;
            U.a aVar = this.f21167b;
            C3542m c3542m = C3542m.this;
            C3513a1 c3513a1 = this.f21168c;
            C3541l0 c3541l0 = this.f21169d;
            U.a aVarN = bVar.n();
            try {
                bVar.R(aVar);
                C3513a1 c3513a1J0 = c3542m.J0();
                int[] iArr = c3542m.f21144o;
                V.a aVar2 = c3542m.f21152w;
                c3542m.f21144o = null;
                c3542m.f21152w = null;
                try {
                    c3542m.i1(c3513a1);
                    U.b bVar2 = c3542m.f21126O;
                    boolean zO = bVar2.o();
                    try {
                        bVar2.S(false);
                        c3541l0.c();
                        c3542m.O0(null, c3541l0.e(), c3541l0.f(), true);
                        bVar2.S(zO);
                        Yg.J j10 = Yg.J.f24997a;
                    } catch (Throwable th2) {
                        bVar2.S(zO);
                        throw th2;
                    }
                } finally {
                    c3542m.i1(c3513a1J0);
                    c3542m.f21144o = iArr;
                    c3542m.f21152w = aVar2;
                }
            } finally {
                bVar.R(aVarN);
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: T.m$e */
    static final class e extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3541l0 f21171b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3541l0 c3541l0) {
            super(0);
            this.f21171b = c3541l0;
        }

        public final void a() {
            C3542m c3542m = C3542m.this;
            this.f21171b.c();
            c3542m.O0(null, this.f21171b.e(), this.f21171b.f(), true);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: T.m$f */
    static final class f extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f21172a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(AbstractC3537j0 abstractC3537j0, Object obj) {
            super(2);
            this.f21172a = obj;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
            } else {
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(316014703, i10, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3293)");
                }
                throw null;
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public C3542m(InterfaceC3526f interfaceC3526f, AbstractC3550q abstractC3550q, C3516b1 c3516b1, Set set, U.a aVar, U.a aVar2, E e10) {
        this.f21131b = interfaceC3526f;
        this.f21132c = abstractC3550q;
        this.f21133d = c3516b1;
        this.f21134e = set;
        this.f21135f = aVar;
        this.f21136g = aVar2;
        this.f21137h = e10;
        this.f21115D = abstractC3550q.e() || abstractC3550q.c();
        this.f21116E = new c();
        this.f21117F = new y1();
        C3513a1 c3513a1D = c3516b1.D();
        c3513a1D.d();
        this.f21120I = c3513a1D;
        C3516b1 c3516b12 = new C3516b1();
        if (abstractC3550q.e()) {
            c3516b12.j();
        }
        if (abstractC3550q.c()) {
            c3516b12.i();
        }
        this.f21121J = c3516b12;
        C3525e1 c3525e1G = c3516b12.G();
        c3525e1G.L(true);
        this.f21122K = c3525e1G;
        this.f21126O = new U.b(this, this.f21135f);
        C3513a1 c3513a1D2 = this.f21121J.D();
        try {
            C3520d c3520dA = c3513a1D2.a(0);
            c3513a1D2.d();
            this.f21127P = c3520dA;
            this.f21128Q = new U.c();
        } catch (Throwable th2) {
            c3513a1D2.d();
            throw th2;
        }
    }

    private final void A0(boolean z10, C3568z0 c3568z0) {
        this.f21138i.h(this.f21139j);
        this.f21139j = c3568z0;
        this.f21143n.j(this.f21141l);
        this.f21143n.j(this.f21142m);
        this.f21143n.j(this.f21140k);
        if (z10) {
            this.f21140k = 0;
        }
        this.f21141l = 0;
        this.f21142m = 0;
    }

    private final void A1() {
        if (!this.f21148s) {
            AbstractC3546o.r("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f21148s = false;
    }

    private final void B0(int i10, boolean z10) {
        C3568z0 c3568z0 = (C3568z0) this.f21138i.g();
        if (c3568z0 != null && !z10) {
            c3568z0.l(c3568z0.a() + 1);
        }
        this.f21139j = c3568z0;
        this.f21140k = this.f21143n.i() + i10;
        this.f21142m = this.f21143n.i();
        this.f21141l = this.f21143n.i() + i10;
    }

    private final void B1() {
        if (this.f21148s) {
            AbstractC3546o.r("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final void C0() {
        this.f21126O.m();
        if (!this.f21138i.c()) {
            AbstractC3546o.r("Start/end imbalance");
        }
        k0();
    }

    private final void D0() {
        C3516b1 c3516b1 = new C3516b1();
        if (this.f21115D) {
            c3516b1.j();
        }
        if (this.f21132c.c()) {
            c3516b1.i();
        }
        this.f21121J = c3516b1;
        C3525e1 c3525e1G = c3516b1.G();
        c3525e1G.L(true);
        this.f21122K = c3525e1G;
    }

    private final Object I0(C3513a1 c3513a1) {
        return c3513a1.L(c3513a1.u());
    }

    private final int K0(C3513a1 c3513a1, int i10) {
        Object objZ;
        if (c3513a1.G(i10)) {
            Object objD = c3513a1.D(i10);
            if (objD != null) {
                return objD instanceof Enum ? ((Enum) objD).ordinal() : objD.hashCode();
            }
            return 0;
        }
        int iC = c3513a1.C(i10);
        if (iC == 207 && (objZ = c3513a1.z(i10)) != null && !AbstractC6492s.d(objZ, InterfaceC3540l.f21100a.a())) {
            iC = objZ.hashCode();
        }
        return iC;
    }

    private final void L0(List list) throws Throwable {
        U.b bVar;
        U.a aVar;
        U.b bVar2;
        U.a aVar2;
        C3513a1 c3513a1;
        int[] iArr;
        V.a aVar3;
        U.a aVar4;
        U.a aVar5;
        U.b bVar3;
        int i10;
        U.b bVar4;
        boolean zO;
        E eB;
        E eB2;
        Integer numValueOf;
        int i11;
        C3513a1 c3513a12;
        U.a aVar6;
        int i12 = 1;
        U.b bVar5 = this.f21126O;
        U.a aVar7 = this.f21136g;
        U.a aVarN = bVar5.n();
        try {
            bVar5.R(aVar7);
            this.f21126O.P();
            int size = list.size();
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                try {
                    Yg.s sVar = (Yg.s) list.get(i14);
                    C3541l0 c3541l0 = (C3541l0) sVar.a();
                    C3541l0 c3541l02 = (C3541l0) sVar.c();
                    C3520d c3520dA = c3541l0.a();
                    int iE = c3541l0.g().e(c3520dA);
                    b0.d dVar = new b0.d(i13, i12, null);
                    this.f21126O.e(dVar, c3520dA);
                    if (c3541l02 == null) {
                        if (AbstractC6492s.d(c3541l0.g(), this.f21121J)) {
                            o0();
                        }
                        C3513a1 c3513a1D = c3541l0.g().D();
                        try {
                            c3513a1D.Q(iE);
                            this.f21126O.y(iE);
                            aVar6 = new U.a();
                            c3513a12 = c3513a1D;
                        } catch (Throwable th2) {
                            th = th2;
                            c3513a12 = c3513a1D;
                        }
                        try {
                            Y0(this, null, null, null, null, new d(aVar6, c3513a1D, c3541l0), 15, null);
                            this.f21126O.r(aVar6, dVar);
                            Yg.J j10 = Yg.J.f24997a;
                            c3513a12.d();
                            bVar2 = bVar5;
                            aVar2 = aVarN;
                            i10 = size;
                            i11 = i14;
                        } catch (Throwable th3) {
                            th = th3;
                            c3513a12.d();
                            throw th;
                        }
                    } else {
                        AbstractC3539k0 abstractC3539k0L = this.f21132c.l(c3541l02);
                        C3516b1 c3516b1G = c3541l02.g();
                        C3520d c3520dA2 = c3541l02.a();
                        List listP = AbstractC3546o.p(c3516b1G, c3520dA2);
                        if (!listP.isEmpty()) {
                            this.f21126O.b(listP, dVar);
                            if (AbstractC6492s.d(c3541l0.g(), this.f21133d)) {
                                int iE2 = this.f21133d.e(c3520dA);
                                u1(iE2, z1(iE2) + listP.size());
                            }
                        }
                        this.f21126O.c(abstractC3539k0L, this.f21132c, c3541l02, c3541l0);
                        C3513a1 c3513a1D2 = c3516b1G.D();
                        try {
                            C3513a1 c3513a1J0 = J0();
                            int[] iArr2 = this.f21144o;
                            V.a aVar8 = this.f21152w;
                            this.f21144o = null;
                            this.f21152w = null;
                            try {
                                i1(c3513a1D2);
                                int iE3 = c3516b1G.e(c3520dA2);
                                c3513a1D2.Q(iE3);
                                this.f21126O.y(iE3);
                                aVar4 = new U.a();
                                U.b bVar6 = this.f21126O;
                                U.a aVarN2 = bVar6.n();
                                try {
                                    bVar6.R(aVar4);
                                    i10 = size;
                                    bVar4 = this.f21126O;
                                    zO = bVar4.o();
                                    try {
                                        bVar4.S(false);
                                        eB = c3541l02.b();
                                        eB2 = c3541l0.b();
                                        numValueOf = Integer.valueOf(c3513a1D2.k());
                                        bVar2 = bVar5;
                                        aVar3 = aVar8;
                                        aVar2 = aVarN;
                                        aVar5 = aVarN2;
                                        i11 = i14;
                                        iArr = iArr2;
                                        c3513a1 = c3513a1D2;
                                        bVar3 = bVar6;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        iArr = iArr2;
                                        c3513a1 = c3513a1D2;
                                        aVar3 = aVar8;
                                        bVar3 = bVar6;
                                        aVar5 = aVarN2;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    iArr = iArr2;
                                    c3513a1 = c3513a1D2;
                                    aVar3 = aVar8;
                                    aVar5 = aVarN2;
                                    bVar3 = bVar6;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                iArr = iArr2;
                                c3513a1 = c3513a1D2;
                                aVar3 = aVar8;
                            }
                            try {
                                X0(eB, eB2, numValueOf, c3541l02.d(), new e(c3541l0));
                                try {
                                    bVar4.S(zO);
                                    try {
                                        bVar3.R(aVar5);
                                        this.f21126O.r(aVar4, dVar);
                                        Yg.J j11 = Yg.J.f24997a;
                                        try {
                                            i1(c3513a1J0);
                                            this.f21144o = iArr;
                                            this.f21152w = aVar3;
                                            try {
                                                c3513a1.d();
                                            } catch (Throwable th7) {
                                                th = th7;
                                                aVar = aVar2;
                                                bVar = bVar2;
                                                bVar.R(aVar);
                                                throw th;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            c3513a1.d();
                                            throw th;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        i1(c3513a1J0);
                                        this.f21144o = iArr;
                                        this.f21152w = aVar3;
                                        throw th;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    bVar3.R(aVar5);
                                    throw th;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                bVar4.S(zO);
                                throw th;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            c3513a1 = c3513a1D2;
                        }
                    }
                    this.f21126O.U();
                    i12 = 1;
                    i14 = i11 + 1;
                    size = i10;
                    aVarN = aVar2;
                    bVar5 = bVar2;
                    i13 = 0;
                } catch (Throwable th13) {
                    th = th13;
                    bVar2 = bVar5;
                    aVar2 = aVarN;
                }
            }
            U.b bVar7 = bVar5;
            U.a aVar9 = aVarN;
            this.f21126O.h();
            this.f21126O.y(0);
            bVar7.R(aVar9);
        } catch (Throwable th14) {
            th = th14;
            bVar = bVar5;
            aVar = aVarN;
        }
    }

    private final int N0(int i10) {
        return (-2) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(AbstractC3537j0 abstractC3537j0, A0 a02, Object obj, boolean z10) {
        s(126665345, abstractC3537j0);
        x1(obj);
        int iL = L();
        try {
            this.f21130S = 126665345;
            boolean z11 = false;
            if (o()) {
                C3525e1.t0(this.f21122K, 0, 1, null);
            }
            if (!o() && !AbstractC6492s.d(this.f21120I.l(), a02)) {
                z11 = true;
            }
            if (z11) {
                c1(a02);
            }
            m1(202, AbstractC3546o.y(), T.f20981a.a(), a02);
            this.f21124M = null;
            if (!o() || z10) {
                boolean z12 = this.f21153x;
                this.f21153x = z11;
                AbstractC3517c.d(this, b0.c.c(316014703, true, new f(abstractC3537j0, obj)));
                this.f21153x = z12;
            } else {
                this.f21123L = true;
                C3525e1 c3525e1 = this.f21122K;
                this.f21132c.j(new C3541l0(abstractC3537j0, obj, F0(), this.f21121J, c3525e1.E(c3525e1.E0(c3525e1.c0())), AbstractC3689v.l(), p0()));
            }
            w0();
            this.f21124M = null;
            this.f21130S = iL;
            N();
        } catch (Throwable th2) {
            w0();
            this.f21124M = null;
            this.f21130S = iL;
            N();
            throw th2;
        }
    }

    private final Object S0(C3513a1 c3513a1, int i10) {
        return c3513a1.L(i10);
    }

    private final int T0(int i10, int i11, int i12, int i13) {
        int iP = this.f21120I.P(i11);
        while (iP != i12 && !this.f21120I.J(iP)) {
            iP = this.f21120I.P(iP);
        }
        if (this.f21120I.J(iP)) {
            i13 = 0;
        }
        if (iP == i11) {
            return i13;
        }
        int iZ1 = (z1(iP) - this.f21120I.N(i11)) + i13;
        loop1: while (i13 < iZ1 && iP != i10) {
            iP++;
            while (iP < i10) {
                int iE = this.f21120I.E(iP) + iP;
                if (i10 >= iE) {
                    i13 += this.f21120I.J(iP) ? 1 : z1(iP);
                    iP = iE;
                }
            }
            break loop1;
        }
        return i13;
    }

    private final int V0(int i10) {
        int iP = this.f21120I.P(i10) + 1;
        int i11 = 0;
        while (iP < i10) {
            if (!this.f21120I.G(iP)) {
                i11++;
            }
            iP += this.f21120I.E(iP);
        }
        return i11;
    }

    private final void X() {
        k0();
        this.f21138i.a();
        this.f21143n.a();
        this.f21150u.a();
        this.f21154y.a();
        this.f21152w = null;
        this.f21128Q.a();
        this.f21130S = 0;
        this.f21113B = 0;
        this.f21148s = false;
        this.f21129R = false;
        this.f21155z = false;
        this.f21118G = false;
        this.f21147r = false;
        this.f21112A = -1;
        if (!this.f21120I.i()) {
            this.f21120I.d();
        }
        if (this.f21122K.Z()) {
            return;
        }
        D0();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0022, B:11:0x002c, B:10:0x0028, B:14:0x0033, B:16:0x0039, B:18:0x003f), top: B:23:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object X0(T.E r7, T.E r8, java.lang.Integer r9, java.util.List r10, mh.InterfaceC6824a r11) {
        /*
            r6 = this;
            boolean r0 = r6.f21118G
            int r1 = r6.f21140k
            r2 = 1
            r6.f21118G = r2     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r6.f21140k = r2     // Catch: java.lang.Throwable -> L26
            int r3 = r10.size()     // Catch: java.lang.Throwable -> L26
        Le:
            if (r2 >= r3) goto L2f
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L26
            Yg.s r4 = (Yg.s) r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = r4.a()     // Catch: java.lang.Throwable -> L26
            T.K0 r5 = (T.K0) r5     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r4.c()     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L28
            r6.s1(r5, r4)     // Catch: java.lang.Throwable -> L26
            goto L2c
        L26:
            r7 = move-exception
            goto L48
        L28:
            r4 = 0
            r6.s1(r5, r4)     // Catch: java.lang.Throwable -> L26
        L2c:
            int r2 = r2 + 1
            goto Le
        L2f:
            if (r7 == 0) goto L3f
            if (r9 == 0) goto L38
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L26
            goto L39
        L38:
            r9 = -1
        L39:
            java.lang.Object r7 = r7.f(r8, r9, r11)     // Catch: java.lang.Throwable -> L26
            if (r7 != 0) goto L43
        L3f:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L26
        L43:
            r6.f21118G = r0
            r6.f21140k = r1
            return r7
        L48:
            r6.f21118G = r0
            r6.f21140k = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C3542m.X0(T.E, T.E, java.lang.Integer, java.util.List, mh.a):java.lang.Object");
    }

    static /* synthetic */ Object Y0(C3542m c3542m, E e10, E e11, Integer num, List list, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        E e12 = (i10 & 1) != 0 ? null : e10;
        E e13 = (i10 & 2) != 0 ? null : e11;
        Integer num2 = (i10 & 4) != 0 ? null : num;
        if ((i10 & 8) != 0) {
            list = AbstractC3689v.l();
        }
        return c3542m.X0(e12, e13, num2, list, interfaceC6824a);
    }

    private final void Z0() {
        boolean z10 = this.f21118G;
        this.f21118G = true;
        int iU = this.f21120I.u();
        int iE = this.f21120I.E(iU) + iU;
        int i10 = this.f21140k;
        int iL = L();
        int i11 = this.f21141l;
        int i12 = this.f21142m;
        X x10 = AbstractC3546o.x(this.f21149t, this.f21120I.k(), iE);
        boolean z11 = false;
        int i13 = iU;
        while (x10 != null) {
            int iB = x10.b();
            AbstractC3546o.M(this.f21149t, iB);
            if (x10.d()) {
                this.f21120I.Q(iB);
                int iK = this.f21120I.k();
                d1(i13, iK, iU);
                this.f21140k = T0(iB, iK, iU, i10);
                this.f21142m = V0(iK);
                int iP = this.f21120I.P(iK);
                this.f21130S = n0(iP, V0(iP), iU, iL);
                this.f21124M = null;
                x10.c().g(this);
                this.f21124M = null;
                this.f21120I.R(iU);
                i13 = iK;
                z11 = true;
            } else {
                this.f21117F.h(x10.c());
                x10.c().y();
                this.f21117F.g();
            }
            x10 = AbstractC3546o.x(this.f21149t, this.f21120I.k(), iE);
        }
        if (z11) {
            d1(i13, iU, iU);
            this.f21120I.T();
            int iZ1 = z1(iU);
            this.f21140k = i10 + iZ1;
            this.f21141l = i11 + iZ1;
            this.f21142m = i12;
        } else {
            l1();
        }
        this.f21130S = iL;
        this.f21118G = z10;
    }

    private final void a1() {
        g1(this.f21120I.k());
        this.f21126O.N();
    }

    private final void b1(C3520d c3520d) {
        if (this.f21128Q.e()) {
            this.f21126O.s(c3520d, this.f21121J);
        } else {
            this.f21126O.t(c3520d, this.f21121J, this.f21128Q);
            this.f21128Q = new U.c();
        }
    }

    private final void c1(A0 a02) {
        V.a aVar = this.f21152w;
        if (aVar == null) {
            aVar = new V.a(0, 1, null);
            this.f21152w = aVar;
        }
        aVar.b(this.f21120I.k(), a02);
    }

    private final void d1(int i10, int i11, int i12) {
        C3513a1 c3513a1 = this.f21120I;
        int iJ = AbstractC3546o.J(c3513a1, i10, i11, i12);
        while (i10 > 0 && i10 != iJ) {
            if (c3513a1.J(i10)) {
                this.f21126O.z();
            }
            i10 = c3513a1.P(i10);
        }
        u0(i11, iJ);
    }

    private final C3520d e1() {
        int i10;
        int i11;
        if (o()) {
            if (!AbstractC3546o.G(this.f21122K)) {
                return null;
            }
            int iA0 = this.f21122K.a0() - 1;
            int iE0 = this.f21122K.E0(iA0);
            while (true) {
                int i12 = iE0;
                i11 = iA0;
                iA0 = i12;
                if (iA0 == this.f21122K.c0() || iA0 < 0) {
                    break;
                }
                iE0 = this.f21122K.E0(iA0);
            }
            return this.f21122K.E(i11);
        }
        if (!AbstractC3546o.F(this.f21120I)) {
            return null;
        }
        int iK = this.f21120I.k() - 1;
        int iP = this.f21120I.P(iK);
        while (true) {
            int i13 = iP;
            i10 = iK;
            iK = i13;
            if (iK == this.f21120I.u() || iK < 0) {
                break;
            }
            iP = this.f21120I.P(iK);
        }
        return this.f21120I.a(i10);
    }

    private final void f1() {
        if (this.f21133d.k()) {
            U.a aVar = new U.a();
            this.f21125N = aVar;
            C3513a1 c3513a1D = this.f21133d.D();
            try {
                this.f21120I = c3513a1D;
                U.b bVar = this.f21126O;
                U.a aVarN = bVar.n();
                try {
                    bVar.R(aVar);
                    g1(0);
                    this.f21126O.L();
                    bVar.R(aVarN);
                    Yg.J j10 = Yg.J.f24997a;
                } catch (Throwable th2) {
                    bVar.R(aVarN);
                    throw th2;
                }
            } finally {
                c3513a1D.d();
            }
        }
    }

    private final void g1(int i10) {
        h1(this, i10, false, 0);
        this.f21126O.i();
    }

    private static final int h1(C3542m c3542m, int i10, boolean z10, int i11) {
        C3513a1 c3513a1 = c3542m.f21120I;
        if (c3513a1.F(i10)) {
            int iC = c3513a1.C(i10);
            Object objD = c3513a1.D(i10);
            if (iC != 206 || !AbstractC6492s.d(objD, AbstractC3546o.D())) {
                if (c3513a1.J(i10)) {
                    return 1;
                }
                return c3513a1.N(i10);
            }
            Object objB = c3513a1.B(i10, 0);
            a aVar = objB instanceof a ? (a) objB : null;
            if (aVar != null) {
                for (C3542m c3542m2 : aVar.a().t()) {
                    c3542m2.f1();
                    c3542m.f21132c.o(c3542m2.F0());
                }
            }
            return c3513a1.N(i10);
        }
        if (!c3513a1.e(i10)) {
            if (c3513a1.J(i10)) {
                return 1;
            }
            return c3513a1.N(i10);
        }
        int iE = c3513a1.E(i10) + i10;
        int iH1 = 0;
        for (int iE2 = i10 + 1; iE2 < iE; iE2 += c3513a1.E(iE2)) {
            boolean zJ = c3513a1.J(iE2);
            if (zJ) {
                c3542m.f21126O.i();
                c3542m.f21126O.v(c3513a1.L(iE2));
            }
            iH1 += h1(c3542m, iE2, zJ || z10, zJ ? 0 : i11 + iH1);
            if (zJ) {
                c3542m.f21126O.i();
                c3542m.f21126O.z();
            }
        }
        if (c3513a1.J(i10)) {
            return 1;
        }
        return iH1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i0() {
        /*
            r4 = this;
            boolean r0 = r4.o()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L24
            T.K0 r0 = new T.K0
            T.E r2 = r4.F0()
            kotlin.jvm.internal.AbstractC6492s.g(r2, r1)
            T.s r2 = (T.C3553s) r2
            r0.<init>(r2)
            T.y1 r1 = r4.f21117F
            r1.h(r0)
            r4.y1(r0)
            int r1 = r4.f21114C
            r0.I(r1)
            goto L77
        L24:
            java.util.List r0 = r4.f21149t
            T.a1 r2 = r4.f21120I
            int r2 = r2.u()
            T.X r0 = T.AbstractC3546o.l(r0, r2)
            T.a1 r2 = r4.f21120I
            java.lang.Object r2 = r2.K()
            T.l$a r3 = T.InterfaceC3540l.f21100a
            java.lang.Object r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.AbstractC6492s.d(r2, r3)
            if (r3 == 0) goto L54
            T.K0 r2 = new T.K0
            T.E r3 = r4.F0()
            kotlin.jvm.internal.AbstractC6492s.g(r3, r1)
            T.s r3 = (T.C3553s) r3
            r2.<init>(r3)
            r4.y1(r2)
            goto L5b
        L54:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.AbstractC6492s.g(r2, r1)
            T.K0 r2 = (T.K0) r2
        L5b:
            if (r0 != 0) goto L69
            boolean r0 = r2.m()
            r1 = 0
            if (r0 == 0) goto L67
            r2.D(r1)
        L67:
            if (r0 == 0) goto L6a
        L69:
            r1 = 1
        L6a:
            r2.E(r1)
            T.y1 r0 = r4.f21117F
            r0.h(r2)
            int r0 = r4.f21114C
            r2.I(r0)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C3542m.i0():void");
    }

    private final void k0() {
        this.f21139j = null;
        this.f21140k = 0;
        this.f21141l = 0;
        this.f21130S = 0;
        this.f21148s = false;
        this.f21126O.Q();
        this.f21117F.a();
        l0();
    }

    private final void k1() {
        this.f21141l += this.f21120I.S();
    }

    private final void l0() {
        this.f21144o = null;
        this.f21145p = null;
    }

    private final void l1() {
        this.f21141l = this.f21120I.v();
        this.f21120I.T();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m1(int r14, java.lang.Object r15, int r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C3542m.m1(int, java.lang.Object, int, java.lang.Object):void");
    }

    private final int n0(int i10, int i11, int i12, int i13) {
        if (i10 == i12) {
            return i13;
        }
        int iK0 = K0(this.f21120I, i10);
        if (iK0 == 126665345) {
            return iK0;
        }
        int iP = this.f21120I.P(i10);
        if (iP != i12) {
            i13 = n0(iP, V0(iP), i12, i13);
        }
        if (this.f21120I.G(i10)) {
            i11 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i13, 3) ^ iK0, 3) ^ i11;
    }

    private final void n1(int i10) {
        m1(i10, null, T.f20981a.a(), null);
    }

    private final void o0() {
        AbstractC3546o.O(this.f21122K.Z());
        D0();
    }

    private final void o1(int i10, Object obj) {
        m1(i10, obj, T.f20981a.a(), null);
    }

    private final A0 p0() {
        A0 a02 = this.f21124M;
        return a02 != null ? a02 : q0(this.f21120I.u());
    }

    private final void p1(boolean z10, Object obj) {
        if (z10) {
            this.f21120I.V();
            return;
        }
        if (obj != null && this.f21120I.l() != obj) {
            this.f21126O.X(obj);
        }
        this.f21120I.U();
    }

    private final A0 q0(int i10) {
        A0 a02;
        if (o() && this.f21123L) {
            int iC0 = this.f21122K.c0();
            while (iC0 > 0) {
                if (this.f21122K.i0(iC0) == 202 && AbstractC6492s.d(this.f21122K.j0(iC0), AbstractC3546o.y())) {
                    Object objG0 = this.f21122K.g0(iC0);
                    AbstractC6492s.g(objG0, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    A0 a03 = (A0) objG0;
                    this.f21124M = a03;
                    return a03;
                }
                iC0 = this.f21122K.E0(iC0);
            }
        }
        if (this.f21120I.x() > 0) {
            while (i10 > 0) {
                if (this.f21120I.C(i10) == 202 && AbstractC6492s.d(this.f21120I.D(i10), AbstractC3546o.y())) {
                    V.a aVar = this.f21152w;
                    if (aVar == null || (a02 = (A0) aVar.a(i10)) == null) {
                        Object objZ = this.f21120I.z(i10);
                        AbstractC6492s.g(objZ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        a02 = (A0) objZ;
                    }
                    this.f21124M = a02;
                    return a02;
                }
                i10 = this.f21120I.P(i10);
            }
        }
        A0 a04 = this.f21151v;
        this.f21124M = a04;
        return a04;
    }

    private final void r1() {
        this.f21142m = 0;
        this.f21120I = this.f21133d.D();
        n1(100);
        this.f21132c.p();
        this.f21151v = this.f21132c.f();
        this.f21154y.j(AbstractC3546o.o(this.f21153x));
        this.f21153x = T(this.f21151v);
        this.f21124M = null;
        if (!this.f21146q) {
            this.f21146q = this.f21132c.d();
        }
        if (!this.f21115D) {
            this.f21115D = this.f21132c.e();
        }
        Set set = (Set) AbstractC3565y.b(this.f21151v, AbstractC5411d.a());
        if (set != null) {
            set.add(this.f21133d);
            this.f21132c.m(set);
        }
        n1(this.f21132c.g());
    }

    private final void t0(V.f fVar, InterfaceC6839p interfaceC6839p) {
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        if (this.f21118G) {
            AbstractC3546o.r("Reentrant composition is not supported");
        }
        Object objA = D1.f20843a.a("Compose:recompose");
        try {
            this.f21114C = androidx.compose.runtime.snapshots.j.H().f();
            this.f21152w = null;
            C7009H c7009hD = fVar.d();
            Object[] objArr = c7009hD.f54922b;
            Object[] objArr2 = c7009hD.f54923c;
            long[] jArr3 = c7009hD.f54921a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j10 = jArr3[i12];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8;
                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j10 & 255) < 128) {
                                int i16 = (i12 << 3) + i15;
                                Object obj = objArr[i16];
                                Object obj2 = objArr2[i16];
                                AbstractC6492s.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                C3520d c3520dI = ((K0) obj).i();
                                if (c3520dI != null) {
                                    int iA = c3520dI.a();
                                    List list = this.f21149t;
                                    K0 k02 = (K0) obj;
                                    jArr2 = jArr3;
                                    if (obj2 == W0.f20989a) {
                                        obj2 = null;
                                    }
                                    list.add(new X(k02, iA, obj2));
                                } else {
                                    jArr2 = jArr3;
                                }
                                i11 = 8;
                            } else {
                                jArr2 = jArr3;
                                i11 = i13;
                            }
                            j10 >>= i11;
                            i15++;
                            i13 = i11;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        i10 = 1;
                        if (i14 != i13) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i10 = 1;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12 += i10;
                    jArr3 = jArr;
                }
            }
            AbstractC3689v.B(this.f21149t, AbstractC3546o.f21183g);
            this.f21140k = 0;
            this.f21118G = true;
            try {
                r1();
                Object objQ0 = Q0();
                if (objQ0 != interfaceC6839p && interfaceC6839p != null) {
                    y1(interfaceC6839p);
                }
                c cVar = this.f21116E;
                V.b bVarC = o1.c();
                try {
                    bVarC.b(cVar);
                    if (interfaceC6839p != null) {
                        o1(200, AbstractC3546o.z());
                        AbstractC3517c.d(this, interfaceC6839p);
                        w0();
                    } else if ((!this.f21147r && !this.f21153x) || objQ0 == null || AbstractC6492s.d(objQ0, InterfaceC3540l.f21100a.a())) {
                        j1();
                    } else {
                        o1(200, AbstractC3546o.z());
                        AbstractC3517c.d(this, (InterfaceC6839p) kotlin.jvm.internal.V.f(objQ0, 2));
                        w0();
                    }
                    bVarC.z(bVarC.o() - 1);
                    y0();
                    this.f21118G = false;
                    this.f21149t.clear();
                    o0();
                    Yg.J j11 = Yg.J.f24997a;
                    D1.f20843a.b(objA);
                } finally {
                    bVarC.z(bVarC.o() - 1);
                }
            } catch (Throwable th2) {
                this.f21118G = false;
                this.f21149t.clear();
                X();
                o0();
                throw th2;
            }
        } catch (Throwable th3) {
            D1.f20843a.b(objA);
            throw th3;
        }
    }

    private final void u0(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        u0(this.f21120I.P(i10), i11);
        if (this.f21120I.J(i10)) {
            this.f21126O.v(S0(this.f21120I, i10));
        }
    }

    private final void u1(int i10, int i11) {
        if (z1(i10) != i11) {
            if (i10 < 0) {
                C7032x c7032x = this.f21145p;
                if (c7032x == null) {
                    c7032x = new C7032x(0, 1, null);
                    this.f21145p = c7032x;
                }
                c7032x.q(i10, i11);
                return;
            }
            int[] iArr = this.f21144o;
            if (iArr == null) {
                iArr = new int[this.f21120I.x()];
                AbstractC3682n.w(iArr, -1, 0, 0, 6, null);
                this.f21144o = iArr;
            }
            iArr[i10] = i11;
        }
    }

    private final void v0(boolean z10) {
        int iHashCode;
        Set set;
        List list;
        int iHashCode2;
        int iG = this.f21143n.g() - 1;
        if (o()) {
            int iC0 = this.f21122K.c0();
            int iI0 = this.f21122K.i0(iC0);
            Object objJ0 = this.f21122K.j0(iC0);
            Object objG0 = this.f21122K.g0(iC0);
            if (objJ0 != null) {
                iHashCode2 = Integer.hashCode(objJ0 instanceof Enum ? ((Enum) objJ0).ordinal() : objJ0.hashCode()) ^ Integer.rotateRight(L(), 3);
            } else if (objG0 == null || iI0 != 207 || AbstractC6492s.d(objG0, InterfaceC3540l.f21100a.a())) {
                iHashCode2 = Integer.rotateRight(iG ^ L(), 3) ^ Integer.hashCode(iI0);
            } else {
                this.f21130S = Integer.rotateRight(Integer.rotateRight(iG ^ L(), 3) ^ Integer.hashCode(objG0.hashCode()), 3);
            }
            this.f21130S = Integer.rotateRight(iHashCode2, 3);
        } else {
            int iU = this.f21120I.u();
            int iC = this.f21120I.C(iU);
            Object objD = this.f21120I.D(iU);
            Object objZ = this.f21120I.z(iU);
            if (objD != null) {
                iHashCode = Integer.hashCode(objD instanceof Enum ? ((Enum) objD).ordinal() : objD.hashCode()) ^ Integer.rotateRight(L(), 3);
            } else if (objZ == null || iC != 207 || AbstractC6492s.d(objZ, InterfaceC3540l.f21100a.a())) {
                iHashCode = Integer.rotateRight(iG ^ L(), 3) ^ Integer.hashCode(iC);
            } else {
                this.f21130S = Integer.rotateRight(Integer.rotateRight(iG ^ L(), 3) ^ Integer.hashCode(objZ.hashCode()), 3);
            }
            this.f21130S = Integer.rotateRight(iHashCode, 3);
        }
        int i10 = this.f21141l;
        C3568z0 c3568z0 = this.f21139j;
        if (c3568z0 != null && c3568z0.b().size() > 0) {
            List listB = c3568z0.b();
            List listF = c3568z0.f();
            Set setE = AbstractC5269a.e(listF);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listF.size();
            int size2 = listB.size();
            int i11 = 0;
            int i12 = 0;
            int iO = 0;
            while (i11 < size2) {
                C3512a0 c3512a0 = (C3512a0) listB.get(i11);
                if (setE.contains(c3512a0)) {
                    set = setE;
                    if (!linkedHashSet.contains(c3512a0)) {
                        if (i12 < size) {
                            C3512a0 c3512a02 = (C3512a0) listF.get(i12);
                            if (c3512a02 != c3512a0) {
                                int iG2 = c3568z0.g(c3512a02);
                                linkedHashSet.add(c3512a02);
                                if (iG2 != iO) {
                                    int iO2 = c3568z0.o(c3512a02);
                                    list = listF;
                                    this.f21126O.w(c3568z0.e() + iG2, iO + c3568z0.e(), iO2);
                                    c3568z0.j(iG2, iO, iO2);
                                } else {
                                    list = listF;
                                }
                            } else {
                                list = listF;
                                i11++;
                            }
                            i12++;
                            iO += c3568z0.o(c3512a02);
                            setE = set;
                            listF = list;
                        }
                    }
                    setE = set;
                } else {
                    this.f21126O.O(c3568z0.g(c3512a0) + c3568z0.e(), c3512a0.c());
                    c3568z0.n(c3512a0.b(), 0);
                    this.f21126O.x(c3512a0.b());
                    this.f21120I.Q(c3512a0.b());
                    a1();
                    this.f21120I.S();
                    set = setE;
                    AbstractC3546o.N(this.f21149t, c3512a0.b(), c3512a0.b() + this.f21120I.E(c3512a0.b()));
                }
                i11++;
                setE = set;
            }
            this.f21126O.i();
            if (listB.size() > 0) {
                this.f21126O.x(this.f21120I.m());
                this.f21120I.T();
            }
        }
        int i13 = this.f21140k;
        while (!this.f21120I.H()) {
            int iK = this.f21120I.k();
            a1();
            this.f21126O.O(i13, this.f21120I.S());
            AbstractC3546o.N(this.f21149t, iK, this.f21120I.k());
        }
        boolean zO = o();
        if (zO) {
            if (z10) {
                this.f21128Q.c();
                i10 = 1;
            }
            this.f21120I.f();
            int iC02 = this.f21122K.c0();
            this.f21122K.T();
            if (!this.f21120I.t()) {
                int iN0 = N0(iC02);
                this.f21122K.U();
                this.f21122K.L(true);
                b1(this.f21127P);
                this.f21129R = false;
                if (!this.f21133d.isEmpty()) {
                    u1(iN0, 0);
                    v1(iN0, i10);
                }
            }
        } else {
            if (z10) {
                this.f21126O.z();
            }
            int iW = this.f21120I.w();
            if (iW > 0) {
                this.f21126O.V(iW);
            }
            this.f21126O.g();
            int iU2 = this.f21120I.u();
            if (i10 != z1(iU2)) {
                v1(iU2, i10);
            }
            if (z10) {
                i10 = 1;
            }
            this.f21120I.g();
            this.f21126O.i();
        }
        B0(i10, zO);
    }

    private final void v1(int i10, int i11) {
        int iZ1 = z1(i10);
        if (iZ1 != i11) {
            int i12 = i11 - iZ1;
            int iB = this.f21138i.b() - 1;
            while (i10 != -1) {
                int iZ12 = z1(i10) + i12;
                u1(i10, iZ12);
                int i13 = iB;
                while (true) {
                    if (-1 < i13) {
                        C3568z0 c3568z0 = (C3568z0) this.f21138i.f(i13);
                        if (c3568z0 != null && c3568z0.n(i10, iZ12)) {
                            iB = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.f21120I.u();
                } else if (this.f21120I.J(i10)) {
                    return;
                } else {
                    i10 = this.f21120I.P(i10);
                }
            }
        }
    }

    private final void w0() {
        v0(false);
    }

    private final A0 w1(A0 a02, A0 a03) {
        A0.a aVarC = a02.c();
        aVarC.putAll(a03);
        A0 a0G = aVarC.g();
        o1(204, AbstractC3546o.C());
        x1(a0G);
        x1(a03);
        w0();
        return a0G;
    }

    private final void x1(Object obj) {
        Q0();
        y1(obj);
    }

    private final void y0() {
        w0();
        this.f21132c.b();
        w0();
        this.f21126O.j();
        C0();
        this.f21120I.d();
        this.f21147r = false;
        this.f21153x = AbstractC3546o.n(this.f21154y.i());
    }

    private final void z0() {
        if (this.f21122K.Z()) {
            C3525e1 c3525e1G = this.f21121J.G();
            this.f21122K = c3525e1G;
            c3525e1G.W0();
            this.f21123L = false;
            this.f21124M = null;
        }
    }

    private final int z1(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f21144o;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.f21120I.N(i10) : i11;
        }
        C7032x c7032x = this.f21145p;
        if (c7032x == null || !c7032x.a(i10)) {
            return 0;
        }
        return c7032x.c(i10);
    }

    @Override // T.InterfaceC3540l
    public void A() {
        m1(125, null, T.f20981a.b(), null);
        this.f21148s = true;
    }

    @Override // T.InterfaceC3540l
    public void B(I0[] i0Arr) {
        A0 a0W1;
        A0 a0P0 = p0();
        o1(201, AbstractC3546o.B());
        boolean z10 = true;
        boolean z11 = false;
        if (o()) {
            a0W1 = w1(a0P0, AbstractC3565y.d(i0Arr, a0P0, null, 4, null));
            this.f21123L = true;
        } else {
            Object objA = this.f21120I.A(0);
            AbstractC6492s.g(objA, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            A0 a02 = (A0) objA;
            Object objA2 = this.f21120I.A(1);
            AbstractC6492s.g(objA2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            A0 a03 = (A0) objA2;
            A0 a0C = AbstractC3565y.c(i0Arr, a0P0, a03);
            if (v() && !this.f21155z && AbstractC6492s.d(a03, a0C)) {
                k1();
                a0W1 = a02;
            } else {
                a0W1 = w1(a0P0, a0C);
                if (!this.f21155z && AbstractC6492s.d(a0W1, a02)) {
                    z10 = false;
                }
                z11 = z10;
            }
        }
        if (z11 && !o()) {
            c1(a0W1);
        }
        this.f21154y.j(AbstractC3546o.o(this.f21153x));
        this.f21153x = z11;
        this.f21124M = a0W1;
        m1(202, AbstractC3546o.y(), T.f20981a.a(), a0W1);
    }

    @Override // T.InterfaceC3540l
    public void C() {
        if (!(this.f21141l == 0)) {
            AbstractC3546o.r("No nodes can be emitted before calling skipAndEndGroup");
        }
        K0 k0G0 = G0();
        if (k0G0 != null) {
            k0G0.z();
        }
        if (this.f21149t.isEmpty()) {
            l1();
        } else {
            Z0();
        }
    }

    @Override // T.InterfaceC3540l
    public void D(InterfaceC6824a interfaceC6824a) {
        A1();
        if (!o()) {
            AbstractC3546o.r("createNode() can only be called when inserting");
        }
        int iE = this.f21143n.e();
        C3525e1 c3525e1 = this.f21122K;
        C3520d c3520dE = c3525e1.E(c3525e1.c0());
        this.f21141l++;
        this.f21128Q.b(interfaceC6824a, iE, c3520dE);
    }

    @Override // T.InterfaceC3540l
    public InterfaceC5384i E() {
        return this.f21132c.h();
    }

    public final boolean E0() {
        return this.f21113B > 0;
    }

    @Override // T.InterfaceC3540l
    public void F() {
        w0();
        w0();
        this.f21153x = AbstractC3546o.n(this.f21154y.i());
        this.f21124M = null;
    }

    public E F0() {
        return this.f21137h;
    }

    @Override // T.InterfaceC3540l
    public InterfaceC3563x G() {
        return p0();
    }

    public final K0 G0() {
        y1 y1Var = this.f21117F;
        if (this.f21113B == 0 && y1Var.d()) {
            return (K0) y1Var.e();
        }
        return null;
    }

    @Override // T.InterfaceC3540l
    public boolean H() {
        if (!v() || this.f21153x) {
            return true;
        }
        K0 k0G0 = G0();
        return k0G0 != null && k0G0.l();
    }

    public final U.a H0() {
        return this.f21125N;
    }

    @Override // T.InterfaceC3540l
    public void I() {
        A1();
        if (o()) {
            AbstractC3546o.r("useNode() called while inserting");
        }
        Object objI0 = I0(this.f21120I);
        this.f21126O.v(objI0);
        if (this.f21155z && (objI0 instanceof InterfaceC3538k)) {
            this.f21126O.a0(objI0);
        }
    }

    @Override // T.InterfaceC3540l
    public void J() {
        w0();
    }

    public final C3513a1 J0() {
        return this.f21120I;
    }

    @Override // T.InterfaceC3540l
    public void K(Object obj) {
        t1(obj);
    }

    @Override // T.InterfaceC3540l
    public int L() {
        return this.f21130S;
    }

    @Override // T.InterfaceC3540l
    public AbstractC3550q M() {
        o1(206, AbstractC3546o.D());
        if (o()) {
            C3525e1.t0(this.f21122K, 0, 1, null);
        }
        Object objQ0 = Q0();
        a aVar = objQ0 instanceof a ? (a) objQ0 : null;
        if (aVar == null) {
            int iL = L();
            boolean z10 = this.f21146q;
            boolean z11 = this.f21115D;
            E eF0 = F0();
            C3553s c3553s = eF0 instanceof C3553s ? (C3553s) eF0 : null;
            aVar = new a(new b(iL, z10, z11, c3553s != null ? c3553s.E() : null));
            y1(aVar);
        }
        aVar.a().w(p0());
        w0();
        return aVar.a();
    }

    public void M0(List list) {
        try {
            L0(list);
            k0();
        } catch (Throwable th2) {
            X();
            throw th2;
        }
    }

    @Override // T.InterfaceC3540l
    public void N() {
        w0();
    }

    @Override // T.InterfaceC3540l
    public void O() {
        w0();
        w0();
        this.f21153x = AbstractC3546o.n(this.f21154y.i());
        this.f21124M = null;
    }

    @Override // T.InterfaceC3540l
    public void P() {
        w0();
    }

    public final boolean P0() {
        return this.f21118G;
    }

    @Override // T.InterfaceC3540l
    public void Q(Object obj, InterfaceC6839p interfaceC6839p) {
        if (o()) {
            this.f21128Q.f(obj, interfaceC6839p);
        } else {
            this.f21126O.Y(obj, interfaceC6839p);
        }
    }

    public final Object Q0() {
        if (o()) {
            B1();
            return InterfaceC3540l.f21100a.a();
        }
        Object objK = this.f21120I.K();
        return (!this.f21155z || (objK instanceof V0)) ? objK : InterfaceC3540l.f21100a.a();
    }

    @Override // T.InterfaceC3540l
    public void R() {
        v0(true);
    }

    public final Object R0() {
        if (o()) {
            B1();
            return InterfaceC3540l.f21100a.a();
        }
        Object objK = this.f21120I.K();
        return (!this.f21155z || (objK instanceof V0)) ? objK instanceof T0 ? ((T0) objK).b() : objK : InterfaceC3540l.f21100a.a();
    }

    @Override // T.InterfaceC3540l
    public void S() {
        w0();
        K0 k0G0 = G0();
        if (k0G0 == null || !k0G0.q()) {
            return;
        }
        k0G0.B(true);
    }

    @Override // T.InterfaceC3540l
    public boolean T(Object obj) {
        if (AbstractC6492s.d(Q0(), obj)) {
            return false;
        }
        y1(obj);
        return true;
    }

    @Override // T.InterfaceC3540l
    public void U(int i10) {
        if (this.f21139j != null) {
            m1(i10, null, T.f20981a.a(), null);
            return;
        }
        B1();
        this.f21130S = this.f21142m ^ Integer.rotateLeft(Integer.rotateLeft(L(), 3) ^ i10, 3);
        this.f21142m++;
        C3513a1 c3513a1 = this.f21120I;
        if (o()) {
            c3513a1.c();
            this.f21122K.h1(i10, InterfaceC3540l.f21100a.a());
            A0(false, null);
            return;
        }
        if (c3513a1.n() == i10 && !c3513a1.s()) {
            c3513a1.U();
            A0(false, null);
            return;
        }
        if (!c3513a1.H()) {
            int i11 = this.f21140k;
            int iK = c3513a1.k();
            a1();
            this.f21126O.O(i11, c3513a1.S());
            AbstractC3546o.N(this.f21149t, iK, c3513a1.k());
        }
        c3513a1.c();
        this.f21129R = true;
        this.f21124M = null;
        z0();
        C3525e1 c3525e1 = this.f21122K;
        c3525e1.I();
        int iA0 = c3525e1.a0();
        c3525e1.h1(i10, InterfaceC3540l.f21100a.a());
        this.f21127P = c3525e1.E(iA0);
        A0(false, null);
    }

    public final void U0(InterfaceC6824a interfaceC6824a) {
        if (this.f21118G) {
            AbstractC3546o.r("Preparing a composition while composing is not supported");
        }
        this.f21118G = true;
        try {
            interfaceC6824a.invoke();
        } finally {
            this.f21118G = false;
        }
    }

    @Override // T.InterfaceC3540l
    public void V(J0 j02) {
        K0 k02 = j02 instanceof K0 ? (K0) j02 : null;
        if (k02 == null) {
            return;
        }
        k02.H(true);
    }

    @Override // T.InterfaceC3540l
    public void W(I0 i02) {
        F1 f12;
        A0 a0P0 = p0();
        o1(201, AbstractC3546o.B());
        Object objF = f();
        if (AbstractC6492s.d(objF, InterfaceC3540l.f21100a.a())) {
            f12 = null;
        } else {
            AbstractC6492s.g(objF, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            f12 = (F1) objF;
        }
        AbstractC3557u abstractC3557uB = i02.b();
        AbstractC6492s.g(abstractC3557uB, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        AbstractC6492s.g(i02, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        F1 f1B = abstractC3557uB.b(i02, f12);
        boolean zD = AbstractC6492s.d(f1B, f12);
        if (!zD) {
            K(f1B);
        }
        boolean z10 = true;
        boolean z11 = false;
        if (o()) {
            if (i02.a() || !AbstractC3565y.a(a0P0, abstractC3557uB)) {
                a0P0 = a0P0.F(abstractC3557uB, f1B);
            }
            this.f21123L = true;
        } else {
            C3513a1 c3513a1 = this.f21120I;
            Object objZ = c3513a1.z(c3513a1.k());
            AbstractC6492s.g(objZ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            A0 a02 = (A0) objZ;
            a0P0 = (!(v() && zD) && (i02.a() || !AbstractC3565y.a(a0P0, abstractC3557uB))) ? a0P0.F(abstractC3557uB, f1B) : a02;
            if (!this.f21155z && a02 == a0P0) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11 && !o()) {
            c1(a0P0);
        }
        this.f21154y.j(AbstractC3546o.o(this.f21153x));
        this.f21153x = z11;
        this.f21124M = a0P0;
        m1(202, AbstractC3546o.y(), T.f20981a.a(), a0P0);
    }

    public final boolean W0(V.f fVar) {
        if (!this.f21135f.c()) {
            AbstractC3546o.r("Expected applyChanges() to have been called");
        }
        if (fVar.e() <= 0 && this.f21149t.isEmpty() && !this.f21147r) {
            return false;
        }
        t0(fVar, null);
        return this.f21135f.d();
    }

    @Override // T.InterfaceC3540l
    public void a() {
        this.f21146q = true;
        this.f21115D = true;
        this.f21133d.j();
        this.f21121J.j();
        this.f21122K.v1();
    }

    @Override // T.InterfaceC3540l
    public J0 b() {
        return G0();
    }

    @Override // T.InterfaceC3540l
    public boolean c(boolean z10) {
        Object objQ0 = Q0();
        if ((objQ0 instanceof Boolean) && z10 == ((Boolean) objQ0).booleanValue()) {
            return false;
        }
        y1(Boolean.valueOf(z10));
        return true;
    }

    @Override // T.InterfaceC3540l
    public void d() {
        if (this.f21155z && this.f21120I.u() == this.f21112A) {
            this.f21112A = -1;
            this.f21155z = false;
        }
        v0(false);
    }

    @Override // T.InterfaceC3540l
    public void e(int i10) {
        m1(i10, null, T.f20981a.a(), null);
    }

    @Override // T.InterfaceC3540l
    public Object f() {
        return R0();
    }

    @Override // T.InterfaceC3540l
    public boolean g(float f10) {
        Object objQ0 = Q0();
        if ((objQ0 instanceof Float) && f10 == ((Number) objQ0).floatValue()) {
            return false;
        }
        y1(Float.valueOf(f10));
        return true;
    }

    @Override // T.InterfaceC3540l
    public void h() {
        this.f21155z = this.f21112A >= 0;
    }

    @Override // T.InterfaceC3540l
    public boolean i(int i10) {
        Object objQ0 = Q0();
        if ((objQ0 instanceof Integer) && i10 == ((Number) objQ0).intValue()) {
            return false;
        }
        y1(Integer.valueOf(i10));
        return true;
    }

    public final void i1(C3513a1 c3513a1) {
        this.f21120I = c3513a1;
    }

    @Override // T.InterfaceC3540l
    public boolean j(long j10) {
        Object objQ0 = Q0();
        if ((objQ0 instanceof Long) && j10 == ((Number) objQ0).longValue()) {
            return false;
        }
        y1(Long.valueOf(j10));
        return true;
    }

    public final void j0() {
        this.f21152w = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j1() {
        /*
            r9 = this;
            java.util.List r0 = r9.f21149t
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            r9.k1()
            goto Le1
        Ld:
            T.a1 r0 = r9.f21120I
            int r1 = r0.n()
            java.lang.Object r2 = r0.o()
            java.lang.Object r3 = r0.l()
            int r4 = r9.f21142m
            r5 = 207(0xcf, float:2.9E-43)
            r6 = 3
            if (r2 != 0) goto L58
            if (r3 == 0) goto L47
            if (r1 != r5) goto L47
            T.l$a r7 = T.InterfaceC3540l.f21100a
            java.lang.Object r7 = r7.a()
            boolean r7 = kotlin.jvm.internal.AbstractC6492s.d(r3, r7)
            if (r7 != 0) goto L47
            int r7 = r3.hashCode()
            int r8 = r9.L()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r4
            r9.f21130S = r7
            goto L76
        L47:
            int r7 = r9.L()
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r1
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r4
        L55:
            r9.f21130S = r7
            goto L76
        L58:
            boolean r7 = r2 instanceof java.lang.Enum
            if (r7 == 0) goto L71
            r7 = r2
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
        L63:
            int r8 = r9.L()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            goto L55
        L71:
            int r7 = r2.hashCode()
            goto L63
        L76:
            boolean r7 = r0.I()
            r8 = 0
            r9.p1(r7, r8)
            r9.Z0()
            r0.g()
            if (r2 != 0) goto Lc4
            if (r3 == 0) goto Laf
            if (r1 != r5) goto Laf
            T.l$a r0 = T.InterfaceC3540l.f21100a
            java.lang.Object r0 = r0.a()
            boolean r0 = kotlin.jvm.internal.AbstractC6492s.d(r3, r0)
            if (r0 != 0) goto Laf
            int r0 = r3.hashCode()
            int r1 = r9.L()
            r1 = r1 ^ r4
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.f21130S = r0
            goto Le1
        Laf:
            int r0 = r9.L()
            r0 = r0 ^ r4
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            int r1 = java.lang.Integer.hashCode(r1)
            r0 = r0 ^ r1
        Lbd:
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.f21130S = r0
            goto Le1
        Lc4:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto Ldc
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
        Lce:
            int r1 = r9.L()
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            goto Lbd
        Ldc:
            int r0 = r2.hashCode()
            goto Lce
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C3542m.j1():void");
    }

    @Override // T.InterfaceC3540l
    public InterfaceC5408a k() {
        return this.f21133d;
    }

    @Override // T.InterfaceC3540l
    public boolean l(Object obj) {
        if (Q0() == obj) {
            return false;
        }
        y1(obj);
        return true;
    }

    @Override // T.InterfaceC3540l
    public void m(InterfaceC6824a interfaceC6824a) {
        this.f21126O.T(interfaceC6824a);
    }

    public final void m0(V.f fVar, InterfaceC6839p interfaceC6839p) {
        if (!this.f21135f.c()) {
            AbstractC3546o.r("Expected applyChanges() to have been called");
        }
        t0(fVar, interfaceC6839p);
    }

    @Override // T.InterfaceC3540l
    public boolean n(char c10) {
        Object objQ0 = Q0();
        if ((objQ0 instanceof Character) && c10 == ((Character) objQ0).charValue()) {
            return false;
        }
        y1(Character.valueOf(c10));
        return true;
    }

    @Override // T.InterfaceC3540l
    public boolean o() {
        return this.f21129R;
    }

    @Override // T.InterfaceC3540l
    public void p(boolean z10) {
        if (!(this.f21141l == 0)) {
            AbstractC3546o.r("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (o()) {
            return;
        }
        if (!z10) {
            l1();
            return;
        }
        int iK = this.f21120I.k();
        int iJ = this.f21120I.j();
        this.f21126O.d();
        AbstractC3546o.N(this.f21149t, iK, iJ);
        this.f21120I.T();
    }

    @Override // T.InterfaceC3540l
    public void q() {
        m1(-127, null, T.f20981a.a(), null);
    }

    public final void q1() {
        this.f21112A = 100;
        this.f21155z = true;
    }

    @Override // T.InterfaceC3540l
    public InterfaceC3540l r(int i10) {
        U(i10);
        i0();
        return this;
    }

    public final void r0() {
        this.f21117F.a();
        this.f21149t.clear();
        this.f21135f.a();
        this.f21152w = null;
    }

    @Override // T.InterfaceC3540l
    public void s(int i10, Object obj) {
        m1(i10, obj, T.f20981a.a(), null);
    }

    public final void s0() {
        D1 d12 = D1.f20843a;
        Object objA = d12.a("Compose:Composer.dispose");
        try {
            this.f21132c.q(this);
            r0();
            x().clear();
            this.f21119H = true;
            Yg.J j10 = Yg.J.f24997a;
            d12.b(objA);
        } catch (Throwable th2) {
            D1.f20843a.b(objA);
            throw th2;
        }
    }

    public final boolean s1(K0 k02, Object obj) {
        C3520d c3520dI = k02.i();
        if (c3520dI == null) {
            return false;
        }
        int iD = c3520dI.d(this.f21120I.y());
        if (!this.f21118G || iD < this.f21120I.k()) {
            return false;
        }
        AbstractC3546o.E(this.f21149t, iD, k02, obj);
        return true;
    }

    @Override // T.InterfaceC3540l
    public Object t(AbstractC3557u abstractC3557u) {
        return AbstractC3565y.b(p0(), abstractC3557u);
    }

    public final void t1(Object obj) {
        if (obj instanceof S0) {
            if (o()) {
                this.f21126O.M((S0) obj);
            }
            this.f21134e.add(obj);
            obj = new T0((S0) obj, e1());
        }
        y1(obj);
    }

    @Override // T.InterfaceC3540l
    public void u() {
        m1(125, null, T.f20981a.c(), null);
        this.f21148s = true;
    }

    @Override // T.InterfaceC3540l
    public boolean v() {
        K0 k0G0;
        return (o() || this.f21155z || this.f21153x || (k0G0 = G0()) == null || k0G0.n() || this.f21147r) ? false : true;
    }

    @Override // T.InterfaceC3540l
    public void w() {
        this.f21155z = false;
    }

    @Override // T.InterfaceC3540l
    public InterfaceC3526f x() {
        return this.f21131b;
    }

    public final void x0() {
        if (!(!this.f21118G && this.f21112A == 100)) {
            B0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f21112A = -1;
        this.f21155z = false;
    }

    @Override // T.InterfaceC3540l
    public void y(int i10, Object obj) {
        if (!o() && this.f21120I.n() == i10 && !AbstractC6492s.d(this.f21120I.l(), obj) && this.f21112A < 0) {
            this.f21112A = this.f21120I.k();
            this.f21155z = true;
        }
        m1(i10, null, T.f20981a.a(), obj);
    }

    public final void y1(Object obj) {
        if (o()) {
            this.f21122K.m1(obj);
            return;
        }
        if (!this.f21120I.r()) {
            U.b bVar = this.f21126O;
            C3513a1 c3513a1 = this.f21120I;
            bVar.a(c3513a1.a(c3513a1.u()), obj);
            return;
        }
        int iQ = this.f21120I.q() - 1;
        if (!this.f21126O.p()) {
            this.f21126O.Z(obj, iQ);
            return;
        }
        U.b bVar2 = this.f21126O;
        C3513a1 c3513a12 = this.f21120I;
        bVar2.W(obj, c3513a12.a(c3513a12.u()), iQ);
    }

    @Override // T.InterfaceC3540l
    public X0 z() {
        C3520d c3520dA;
        InterfaceC6835l interfaceC6835lH;
        K0 k02 = null;
        K0 k03 = this.f21117F.d() ? (K0) this.f21117F.g() : null;
        if (k03 != null) {
            k03.E(false);
        }
        if (k03 != null && (interfaceC6835lH = k03.h(this.f21114C)) != null) {
            this.f21126O.f(interfaceC6835lH, F0());
        }
        if (k03 != null && !k03.p() && (k03.q() || this.f21146q)) {
            if (k03.i() == null) {
                if (o()) {
                    C3525e1 c3525e1 = this.f21122K;
                    c3520dA = c3525e1.E(c3525e1.c0());
                } else {
                    C3513a1 c3513a1 = this.f21120I;
                    c3520dA = c3513a1.a(c3513a1.u());
                }
                k03.A(c3520dA);
            }
            k03.C(false);
            k02 = k03;
        }
        v0(false);
        return k02;
    }
}
