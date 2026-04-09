package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import y.b;

/* loaded from: classes.dex */
public class d extends x.c {
    public int W0;

    /* renamed from: a1, reason: collision with root package name */
    public int f1799a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f1800b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f1801c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f1802d1;
    public y.b U0 = new y.b(this);
    public y.e V0 = new y.e(this);
    public b.InterfaceC0500b X0 = null;
    public boolean Y0 = false;
    public androidx.constraintlayout.core.c Z0 = new androidx.constraintlayout.core.c();

    /* renamed from: e1, reason: collision with root package name */
    public int f1803e1 = 0;

    /* renamed from: f1, reason: collision with root package name */
    public int f1804f1 = 0;

    /* renamed from: g1, reason: collision with root package name */
    public c[] f1805g1 = new c[4];

    /* renamed from: h1, reason: collision with root package name */
    public c[] f1806h1 = new c[4];

    /* renamed from: i1, reason: collision with root package name */
    public boolean f1807i1 = false;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f1808j1 = false;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f1809k1 = false;

    /* renamed from: l1, reason: collision with root package name */
    public int f1810l1 = 0;

    /* renamed from: m1, reason: collision with root package name */
    public int f1811m1 = 0;

    /* renamed from: n1, reason: collision with root package name */
    public int f1812n1 = 257;

    /* renamed from: o1, reason: collision with root package name */
    public boolean f1813o1 = false;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f1814p1 = false;

    /* renamed from: q1, reason: collision with root package name */
    public boolean f1815q1 = false;

    /* renamed from: r1, reason: collision with root package name */
    public int f1816r1 = 0;

    /* renamed from: s1, reason: collision with root package name */
    public WeakReference f1817s1 = null;

    /* renamed from: t1, reason: collision with root package name */
    public WeakReference f1818t1 = null;

    /* renamed from: u1, reason: collision with root package name */
    public WeakReference f1819u1 = null;

    /* renamed from: v1, reason: collision with root package name */
    public WeakReference f1820v1 = null;

    /* renamed from: w1, reason: collision with root package name */
    public HashSet f1821w1 = new HashSet();

    /* renamed from: x1, reason: collision with root package name */
    public b.a f1822x1 = new b.a();

    public static boolean N1(int i10, ConstraintWidget constraintWidget, b.InterfaceC0500b interfaceC0500b, b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0500b == null) {
            return false;
        }
        if (constraintWidget.T() == 8 || (constraintWidget instanceof f) || (constraintWidget instanceof a)) {
            aVar.f24994e = 0;
            aVar.f24995f = 0;
            return false;
        }
        aVar.f24990a = constraintWidget.B();
        aVar.f24991b = constraintWidget.R();
        aVar.f24992c = constraintWidget.U();
        aVar.f24993d = constraintWidget.y();
        aVar.f24998i = false;
        aVar.f24999j = i11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f24990a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z10 = dimensionBehaviour == dimensionBehaviour2;
        boolean z11 = aVar.f24991b == dimensionBehaviour2;
        boolean z12 = z10 && constraintWidget.f1684e0 > 0.0f;
        boolean z13 = z11 && constraintWidget.f1684e0 > 0.0f;
        if (z10 && constraintWidget.Y(0) && constraintWidget.f1717v == 0 && !z12) {
            aVar.f24990a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z11 && constraintWidget.f1719w == 0) {
                aVar.f24990a = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z10 = false;
        }
        if (z11 && constraintWidget.Y(1) && constraintWidget.f1719w == 0 && !z13) {
            aVar.f24991b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z10 && constraintWidget.f1717v == 0) {
                aVar.f24991b = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z11 = false;
        }
        if (constraintWidget.l0()) {
            aVar.f24990a = ConstraintWidget.DimensionBehaviour.FIXED;
            z10 = false;
        }
        if (constraintWidget.m0()) {
            aVar.f24991b = ConstraintWidget.DimensionBehaviour.FIXED;
            z11 = false;
        }
        if (z12) {
            if (constraintWidget.f1721x[0] == 4) {
                aVar.f24990a = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z11) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f24991b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i13 = aVar.f24993d;
                } else {
                    aVar.f24990a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0500b.b(constraintWidget, aVar);
                    i13 = aVar.f24995f;
                }
                aVar.f24990a = dimensionBehaviour4;
                aVar.f24992c = (int) (constraintWidget.w() * i13);
            }
        }
        if (z13) {
            if (constraintWidget.f1721x[1] == 4) {
                aVar.f24991b = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z10) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.f24990a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i12 = aVar.f24992c;
                } else {
                    aVar.f24991b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0500b.b(constraintWidget, aVar);
                    i12 = aVar.f24994e;
                }
                aVar.f24991b = dimensionBehaviour6;
                if (constraintWidget.x() == -1) {
                    aVar.f24993d = (int) (i12 / constraintWidget.w());
                } else {
                    aVar.f24993d = (int) (constraintWidget.w() * i12);
                }
            }
        }
        interfaceC0500b.b(constraintWidget, aVar);
        constraintWidget.f1(aVar.f24994e);
        constraintWidget.G0(aVar.f24995f);
        constraintWidget.F0(aVar.f24997h);
        constraintWidget.v0(aVar.f24996g);
        aVar.f24999j = b.a.f24987k;
        return aVar.f24998i;
    }

    public boolean A1(boolean z10) {
        return this.V0.f(z10);
    }

    public boolean B1(boolean z10) {
        return this.V0.g(z10);
    }

    public boolean C1(boolean z10, int i10) {
        return this.V0.h(z10, i10);
    }

    public b.InterfaceC0500b D1() {
        return this.X0;
    }

    public int E1() {
        return this.f1812n1;
    }

    public androidx.constraintlayout.core.c F1() {
        return this.Z0;
    }

    public boolean G1() {
        return false;
    }

    public void H1() {
        this.V0.j();
    }

    public void I1() {
        this.V0.k();
    }

    public boolean J1() {
        return this.f1815q1;
    }

    public boolean K1() {
        return this.Y0;
    }

    public boolean L1() {
        return this.f1814p1;
    }

    public long M1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f1799a1 = i17;
        this.f1800b1 = i18;
        return this.U0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean O1(int i10) {
        return (this.f1812n1 & i10) == i10;
    }

    public final void P1() {
        this.f1803e1 = 0;
        this.f1804f1 = 0;
    }

    public void Q1(b.InterfaceC0500b interfaceC0500b) {
        this.X0 = interfaceC0500b;
        this.V0.n(interfaceC0500b);
    }

    public void R1(int i10) {
        this.f1812n1 = i10;
        androidx.constraintlayout.core.c.f1555r = O1(512);
    }

    public void S1(int i10) {
        this.W0 = i10;
    }

    public void T1(boolean z10) {
        this.Y0 = z10;
    }

    public boolean U1(androidx.constraintlayout.core.c cVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zO1 = O1(64);
        l1(cVar, zO1);
        int size = this.T0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.T0.get(i10);
            constraintWidget.l1(cVar, zO1);
            if (constraintWidget.a0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void V1() {
        this.U0.e(this);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void k1(boolean z10, boolean z11) {
        super.k1(z10, z11);
        int size = this.T0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ConstraintWidget) this.T0.get(i10)).k1(z10, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0329 A[PHI: r13 r19
  0x0329: PHI (r13v9 boolean) = (r13v8 boolean), (r13v11 boolean), (r13v11 boolean), (r13v11 boolean) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]
  0x0329: PHI (r19v4 boolean) = (r19v3 boolean), (r19v6 boolean), (r19v6 boolean), (r19v6 boolean) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0330  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    @Override // x.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n1() {
        /*
            Method dump skipped, instructions count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.d.n1():void");
    }

    public void q1(ConstraintWidget constraintWidget, int i10) {
        if (i10 == 0) {
            s1(constraintWidget);
        } else if (i10 == 1) {
            x1(constraintWidget);
        }
    }

    @Override // x.c, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void r0() {
        this.Z0.D();
        this.f1799a1 = 0;
        this.f1801c1 = 0;
        this.f1800b1 = 0;
        this.f1802d1 = 0;
        this.f1813o1 = false;
        super.r0();
    }

    public boolean r1(androidx.constraintlayout.core.c cVar) {
        d dVar;
        androidx.constraintlayout.core.c cVar2;
        boolean zO1 = O1(64);
        g(cVar, zO1);
        int size = this.T0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.T0.get(i10);
            constraintWidget.N0(0, false);
            constraintWidget.N0(1, false);
            if (constraintWidget instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.T0.get(i11);
                if (constraintWidget2 instanceof a) {
                    ((a) constraintWidget2).t1();
                }
            }
        }
        this.f1821w1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            ConstraintWidget constraintWidget3 = (ConstraintWidget) this.T0.get(i12);
            if (constraintWidget3.f()) {
                if (constraintWidget3 instanceof h) {
                    this.f1821w1.add(constraintWidget3);
                } else {
                    constraintWidget3.g(cVar, zO1);
                }
            }
        }
        while (this.f1821w1.size() > 0) {
            int size2 = this.f1821w1.size();
            Iterator it = this.f1821w1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h hVar = (h) ((ConstraintWidget) it.next());
                if (hVar.q1(this.f1821w1)) {
                    hVar.g(cVar, zO1);
                    this.f1821w1.remove(hVar);
                    break;
                }
            }
            if (size2 == this.f1821w1.size()) {
                Iterator it2 = this.f1821w1.iterator();
                while (it2.hasNext()) {
                    ((ConstraintWidget) it2.next()).g(cVar, zO1);
                }
                this.f1821w1.clear();
            }
        }
        if (androidx.constraintlayout.core.c.f1555r) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                ConstraintWidget constraintWidget4 = (ConstraintWidget) this.T0.get(i13);
                if (!constraintWidget4.f()) {
                    hashSet.add(constraintWidget4);
                }
            }
            dVar = this;
            cVar2 = cVar;
            dVar.e(this, cVar2, hashSet, B() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) it3.next();
                g.a(this, cVar2, constraintWidget5);
                constraintWidget5.g(cVar2, zO1);
            }
        } else {
            dVar = this;
            cVar2 = cVar;
            for (int i14 = 0; i14 < size; i14++) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) dVar.T0.get(i14);
                if (constraintWidget6 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.f1676a0;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.K0(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.b1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.g(cVar2, zO1);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.K0(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.b1(dimensionBehaviour2);
                    }
                } else {
                    g.a(this, cVar2, constraintWidget6);
                    if (!constraintWidget6.f()) {
                        constraintWidget6.g(cVar2, zO1);
                    }
                }
            }
        }
        if (dVar.f1803e1 > 0) {
            b.b(this, cVar2, null, 0);
        }
        if (dVar.f1804f1 > 0) {
            b.b(this, cVar2, null, 1);
        }
        return true;
    }

    public final void s1(ConstraintWidget constraintWidget) {
        int i10 = this.f1803e1 + 1;
        c[] cVarArr = this.f1806h1;
        if (i10 >= cVarArr.length) {
            this.f1806h1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f1806h1[this.f1803e1] = new c(constraintWidget, 0, K1());
        this.f1803e1++;
    }

    public void t1(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.f1820v1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.f1820v1.get()).e()) {
            this.f1820v1 = new WeakReference(constraintAnchor);
        }
    }

    public void u1(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.f1818t1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.f1818t1.get()).e()) {
            this.f1818t1 = new WeakReference(constraintAnchor);
        }
    }

    public final void v1(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.Z0.h(solverVariable, this.Z0.q(constraintAnchor), 0, 5);
    }

    public final void w1(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.Z0.h(this.Z0.q(constraintAnchor), solverVariable, 0, 5);
    }

    public final void x1(ConstraintWidget constraintWidget) {
        int i10 = this.f1804f1 + 1;
        c[] cVarArr = this.f1805g1;
        if (i10 >= cVarArr.length) {
            this.f1805g1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f1805g1[this.f1804f1] = new c(constraintWidget, 1, K1());
        this.f1804f1++;
    }

    public void y1(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.f1819u1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.f1819u1.get()).e()) {
            this.f1819u1 = new WeakReference(constraintAnchor);
        }
    }

    public void z1(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.f1817s1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.f1817s1.get()).e()) {
            this.f1817s1 = new WeakReference(constraintAnchor);
        }
    }
}
