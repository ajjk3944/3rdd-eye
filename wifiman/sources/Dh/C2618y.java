package Dh;

import Bh.AbstractC2510u;
import Bh.EnumC2496f;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2505o;
import Bh.b0;
import Bh.g0;
import Bh.l0;
import Bh.q0;
import Zg.AbstractC3689v;
import fi.AbstractC5833e;
import ii.C6173t;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import mh.InterfaceC6835l;
import pi.AbstractC7335C;
import pi.AbstractC7346d0;
import pi.C7373u;
import pi.C7376x;
import pi.E0;
import pi.G0;
import pi.J0;
import pi.N0;
import pi.v0;

/* renamed from: Dh.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2618y extends z {

    /* renamed from: b, reason: collision with root package name */
    private final z f3557b;

    /* renamed from: c, reason: collision with root package name */
    private final G0 f3558c;

    /* renamed from: d, reason: collision with root package name */
    private G0 f3559d;

    /* renamed from: e, reason: collision with root package name */
    private List f3560e;

    /* renamed from: f, reason: collision with root package name */
    private List f3561f;

    /* renamed from: g, reason: collision with root package name */
    private v0 f3562g;

    /* renamed from: Dh.y$a */
    class a implements InterfaceC6835l {
        a() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(l0 l0Var) {
            return Boolean.valueOf(!l0Var.m0());
        }
    }

    /* renamed from: Dh.y$b */
    class b implements InterfaceC6835l {
        b() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC7346d0 invoke(AbstractC7346d0 abstractC7346d0) {
            return C2618y.this.M0(abstractC7346d0);
        }
    }

    public C2618y(z zVar, G0 g02) {
        this.f3557b = zVar;
        this.f3558c = g02;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void B0(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Dh.C2618y.B0(int):void");
    }

    private G0 K0() {
        if (this.f3559d == null) {
            if (this.f3558c.k()) {
                this.f3559d = this.f3558c;
            } else {
                List parameters = this.f3557b.k().getParameters();
                this.f3560e = new ArrayList(parameters.size());
                this.f3559d = AbstractC7335C.b(parameters, this.f3558c.j(), this, this.f3560e);
                this.f3561f = AbstractC3689v.m0(this.f3560e, new a());
            }
        }
        return this.f3559d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC7346d0 M0(AbstractC7346d0 abstractC7346d0) {
        return (abstractC7346d0 == null || this.f3558c.k()) ? abstractC7346d0 : (AbstractC7346d0) K0().p(abstractC7346d0, N0.INVARIANT);
    }

    @Override // Bh.InterfaceC2495e
    public boolean D() {
        return this.f3557b.D();
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC6164k E0() {
        InterfaceC6164k interfaceC6164kI0 = i0(AbstractC5833e.r(bi.i.g(this.f3557b)));
        if (interfaceC6164kI0 == null) {
            B0(12);
        }
        return interfaceC6164kI0;
    }

    @Override // Bh.C
    public boolean F0() {
        return this.f3557b.F0();
    }

    @Override // Bh.InterfaceC2495e
    public List H0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            B0(17);
        }
        return listEmptyList;
    }

    @Override // Dh.z
    public InterfaceC6164k I(E0 e02, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (e02 == null) {
            B0(5);
        }
        if (gVar == null) {
            B0(6);
        }
        InterfaceC6164k interfaceC6164kI = this.f3557b.I(e02, gVar);
        if (!this.f3558c.k()) {
            return new C6173t(interfaceC6164kI, K0());
        }
        if (interfaceC6164kI == null) {
            B0(7);
        }
        return interfaceC6164kI;
    }

    @Override // Bh.InterfaceC2495e
    public boolean I0() {
        return this.f3557b.I0();
    }

    @Override // Bh.InterfaceC2495e
    public b0 J0() {
        throw new UnsupportedOperationException();
    }

    @Override // Bh.C
    public boolean L() {
        return this.f3557b.L();
    }

    @Override // Bh.i0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public InterfaceC2495e c(G0 g02) {
        if (g02 == null) {
            B0(23);
        }
        return g02.k() ? this : new C2618y(this, G0.h(g02.j(), K0().j()));
    }

    @Override // Bh.InterfaceC2499i
    public boolean M() {
        return this.f3557b.M();
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC2494d P() {
        return this.f3557b.P();
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC6164k Q() {
        InterfaceC6164k interfaceC6164kQ = this.f3557b.Q();
        if (interfaceC6164kQ == null) {
            B0(15);
        }
        return interfaceC6164kQ;
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC2495e S() {
        return this.f3557b.S();
    }

    @Override // Bh.InterfaceC2495e, Bh.InterfaceC2504n, Bh.InterfaceC2503m
    public InterfaceC2503m b() {
        InterfaceC2503m interfaceC2503mB = this.f3557b.b();
        if (interfaceC2503mB == null) {
            B0(22);
        }
        return interfaceC2503mB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations = this.f3557b.getAnnotations();
        if (annotations == null) {
            B0(19);
        }
        return annotations;
    }

    @Override // Bh.I
    public Zh.f getName() {
        Zh.f name = this.f3557b.getName();
        if (name == null) {
            B0(20);
        }
        return name;
    }

    @Override // Bh.InterfaceC2495e, Bh.C, Bh.InterfaceC2507q
    public AbstractC2510u getVisibility() {
        AbstractC2510u visibility = this.f3557b.getVisibility();
        if (visibility == null) {
            B0(27);
        }
        return visibility;
    }

    @Override // Bh.InterfaceC2495e
    public EnumC2496f h() {
        EnumC2496f enumC2496fH = this.f3557b.h();
        if (enumC2496fH == null) {
            B0(25);
        }
        return enumC2496fH;
    }

    @Override // Dh.z
    public InterfaceC6164k i0(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            B0(13);
        }
        InterfaceC6164k interfaceC6164kI0 = this.f3557b.i0(gVar);
        if (!this.f3558c.k()) {
            return new C6173t(interfaceC6164kI0, K0());
        }
        if (interfaceC6164kI0 == null) {
            B0(14);
        }
        return interfaceC6164kI0;
    }

    @Override // Bh.C
    public boolean isExternal() {
        return this.f3557b.isExternal();
    }

    @Override // Bh.InterfaceC2495e
    public boolean isInline() {
        return this.f3557b.isInline();
    }

    @Override // Bh.InterfaceC2506p
    public g0 j() {
        g0 g0Var = g0.f1784a;
        if (g0Var == null) {
            B0(29);
        }
        return g0Var;
    }

    @Override // Bh.InterfaceC2498h
    public v0 k() {
        v0 v0VarK = this.f3557b.k();
        if (this.f3558c.k()) {
            if (v0VarK == null) {
                B0(0);
            }
            return v0VarK;
        }
        if (this.f3562g == null) {
            G0 g0K0 = K0();
            Collection collectionA = v0VarK.a();
            ArrayList arrayList = new ArrayList(collectionA.size());
            Iterator it = collectionA.iterator();
            while (it.hasNext()) {
                arrayList.add(g0K0.p((pi.S) it.next(), N0.INVARIANT));
            }
            this.f3562g = new C7373u(this, this.f3560e, arrayList, oi.f.f55716e);
        }
        v0 v0Var = this.f3562g;
        if (v0Var == null) {
            B0(1);
        }
        return v0Var;
    }

    @Override // Bh.InterfaceC2495e, Bh.C
    public Bh.D l() {
        Bh.D dL = this.f3557b.l();
        if (dL == null) {
            B0(26);
        }
        return dL;
    }

    @Override // Bh.InterfaceC2495e
    public Collection m() {
        Collection<InterfaceC2494d> collectionM = this.f3557b.m();
        ArrayList arrayList = new ArrayList(collectionM.size());
        for (InterfaceC2494d interfaceC2494d : collectionM) {
            arrayList.add(((InterfaceC2494d) interfaceC2494d.v().j(interfaceC2494d.a()).h(interfaceC2494d.l()).f(interfaceC2494d.getVisibility()).s(interfaceC2494d.h()).m(false).a()).c(K0()));
        }
        return arrayList;
    }

    @Override // Bh.InterfaceC2495e
    public Collection n() {
        Collection collectionN = this.f3557b.n();
        if (collectionN == null) {
            B0(31);
        }
        return collectionN;
    }

    @Override // Bh.InterfaceC2495e
    public boolean o() {
        return this.f3557b.o();
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o interfaceC2505o, Object obj) {
        return interfaceC2505o.l(this, obj);
    }

    @Override // Bh.InterfaceC2495e, Bh.InterfaceC2498h
    public AbstractC7346d0 u() {
        AbstractC7346d0 abstractC7346d0M = pi.V.m(C7376x.f58188a.a(getAnnotations(), null, null), k(), J0.g(k().getParameters()), false, E0());
        if (abstractC7346d0M == null) {
            B0(16);
        }
        return abstractC7346d0M;
    }

    @Override // Bh.InterfaceC2495e, Bh.InterfaceC2499i
    public List w() {
        K0();
        List list = this.f3561f;
        if (list == null) {
            B0(30);
        }
        return list;
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC6164k w0(E0 e02) {
        if (e02 == null) {
            B0(10);
        }
        InterfaceC6164k interfaceC6164kI = I(e02, AbstractC5833e.r(bi.i.g(this)));
        if (interfaceC6164kI == null) {
            B0(11);
        }
        return interfaceC6164kI;
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC6164k y0() {
        InterfaceC6164k interfaceC6164kY0 = this.f3557b.y0();
        if (interfaceC6164kY0 == null) {
            B0(28);
        }
        return interfaceC6164kY0;
    }

    @Override // Bh.InterfaceC2495e
    public boolean z() {
        return this.f3557b.z();
    }

    @Override // Bh.InterfaceC2495e
    public q0 z0() {
        q0 q0VarZ0 = this.f3557b.z0();
        if (q0VarZ0 == null) {
            return null;
        }
        return q0VarZ0.b(new b());
    }

    @Override // Bh.InterfaceC2503m
    public InterfaceC2495e a() {
        InterfaceC2495e interfaceC2495eA = this.f3557b.a();
        if (interfaceC2495eA == null) {
            B0(21);
        }
        return interfaceC2495eA;
    }
}
