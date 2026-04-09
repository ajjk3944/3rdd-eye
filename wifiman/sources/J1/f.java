package j1;

import c1.C4188d;
import c1.C4193i;
import j1.e;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import k1.C6356b;

/* loaded from: classes.dex */
public class f extends m {

    /* renamed from: L0, reason: collision with root package name */
    C6356b f49945L0;

    /* renamed from: M0, reason: collision with root package name */
    public k1.e f49946M0;

    /* renamed from: N0, reason: collision with root package name */
    private int f49947N0;

    /* renamed from: O0, reason: collision with root package name */
    protected C6356b.InterfaceC1888b f49948O0;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f49949P0;

    /* renamed from: Q0, reason: collision with root package name */
    protected C4188d f49950Q0;

    /* renamed from: R0, reason: collision with root package name */
    int f49951R0;

    /* renamed from: S0, reason: collision with root package name */
    int f49952S0;

    /* renamed from: T0, reason: collision with root package name */
    int f49953T0;

    /* renamed from: U0, reason: collision with root package name */
    int f49954U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f49955V0;

    /* renamed from: W0, reason: collision with root package name */
    public int f49956W0;

    /* renamed from: X0, reason: collision with root package name */
    c[] f49957X0;

    /* renamed from: Y0, reason: collision with root package name */
    c[] f49958Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f49959Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f49960a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f49961b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f49962c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f49963d1;

    /* renamed from: e1, reason: collision with root package name */
    private int f49964e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f49965f1;

    /* renamed from: g1, reason: collision with root package name */
    private boolean f49966g1;

    /* renamed from: h1, reason: collision with root package name */
    private boolean f49967h1;

    /* renamed from: i1, reason: collision with root package name */
    int f49968i1;

    /* renamed from: j1, reason: collision with root package name */
    private WeakReference f49969j1;

    /* renamed from: k1, reason: collision with root package name */
    private WeakReference f49970k1;

    /* renamed from: l1, reason: collision with root package name */
    private WeakReference f49971l1;

    /* renamed from: m1, reason: collision with root package name */
    private WeakReference f49972m1;

    /* renamed from: n1, reason: collision with root package name */
    HashSet f49973n1;

    /* renamed from: o1, reason: collision with root package name */
    public C6356b.a f49974o1;

    public f(int i10, int i11) {
        super(i10, i11);
        this.f49945L0 = new C6356b(this);
        this.f49946M0 = new k1.e(this);
        this.f49948O0 = null;
        this.f49949P0 = false;
        this.f49950Q0 = new C4188d();
        this.f49955V0 = 0;
        this.f49956W0 = 0;
        this.f49957X0 = new c[4];
        this.f49958Y0 = new c[4];
        this.f49959Z0 = false;
        this.f49960a1 = false;
        this.f49961b1 = false;
        this.f49962c1 = 0;
        this.f49963d1 = 0;
        this.f49964e1 = 257;
        this.f49965f1 = false;
        this.f49966g1 = false;
        this.f49967h1 = false;
        this.f49968i1 = 0;
        this.f49969j1 = null;
        this.f49970k1 = null;
        this.f49971l1 = null;
        this.f49972m1 = null;
        this.f49973n1 = new HashSet();
        this.f49974o1 = new C6356b.a();
    }

    public static boolean A1(int i10, e eVar, C6356b.InterfaceC1888b interfaceC1888b, C6356b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC1888b == null) {
            return false;
        }
        if (eVar.N() == 8 || (eVar instanceof h) || (eVar instanceof C6241a)) {
            aVar.f51027e = 0;
            aVar.f51028f = 0;
            return false;
        }
        aVar.f51023a = eVar.x();
        aVar.f51024b = eVar.M();
        aVar.f51025c = eVar.O();
        aVar.f51026d = eVar.u();
        aVar.f51031i = false;
        aVar.f51032j = i11;
        e.b bVar = aVar.f51023a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f51024b == bVar2;
        boolean z12 = z10 && eVar.f49897c0 > 0.0f;
        boolean z13 = z11 && eVar.f49897c0 > 0.0f;
        if (z10 && eVar.S(0) && eVar.f49936w == 0 && !z12) {
            aVar.f51023a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f49938x == 0) {
                aVar.f51023a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.S(1) && eVar.f49938x == 0 && !z13) {
            aVar.f51024b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f49936w == 0) {
                aVar.f51024b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.e0()) {
            aVar.f51023a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.f0()) {
            aVar.f51024b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f49940y[0] == 4) {
                aVar.f51023a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar3 = aVar.f51024b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f51026d;
                } else {
                    aVar.f51023a = e.b.WRAP_CONTENT;
                    interfaceC1888b.b(eVar, aVar);
                    i13 = aVar.f51028f;
                }
                aVar.f51023a = bVar4;
                aVar.f51025c = (int) (eVar.s() * i13);
            }
        }
        if (z13) {
            if (eVar.f49940y[1] == 4) {
                aVar.f51024b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar5 = aVar.f51023a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f51025c;
                } else {
                    aVar.f51024b = e.b.WRAP_CONTENT;
                    interfaceC1888b.b(eVar, aVar);
                    i12 = aVar.f51027e;
                }
                aVar.f51024b = bVar6;
                if (eVar.t() == -1) {
                    aVar.f51026d = (int) (i12 / eVar.s());
                } else {
                    aVar.f51026d = (int) (eVar.s() * i12);
                }
            }
        }
        interfaceC1888b.b(eVar, aVar);
        eVar.U0(aVar.f51027e);
        eVar.z0(aVar.f51028f);
        eVar.y0(aVar.f51030h);
        eVar.o0(aVar.f51029g);
        aVar.f51032j = C6356b.a.f51020k;
        return aVar.f51031i;
    }

    private void C1() {
        this.f49955V0 = 0;
        this.f49956W0 = 0;
    }

    private void i1(e eVar) {
        int i10 = this.f49955V0 + 1;
        c[] cVarArr = this.f49958Y0;
        if (i10 >= cVarArr.length) {
            this.f49958Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f49958Y0[this.f49955V0] = new c(eVar, 0, y1());
        this.f49955V0++;
    }

    private void l1(d dVar, C4193i c4193i) {
        this.f49950Q0.h(c4193i, this.f49950Q0.q(dVar), 0, 5);
    }

    private void m1(d dVar, C4193i c4193i) {
        this.f49950Q0.h(this.f49950Q0.q(dVar), c4193i, 0, 5);
    }

    private void n1(e eVar) {
        int i10 = this.f49956W0 + 1;
        c[] cVarArr = this.f49957X0;
        if (i10 >= cVarArr.length) {
            this.f49957X0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f49957X0[this.f49956W0] = new c(eVar, 1, y1());
        this.f49956W0++;
    }

    public boolean B1(int i10) {
        return (this.f49964e1 & i10) == i10;
    }

    public void D1(C6356b.InterfaceC1888b interfaceC1888b) {
        this.f49948O0 = interfaceC1888b;
        this.f49946M0.m(interfaceC1888b);
    }

    public void E1(int i10) {
        this.f49964e1 = i10;
        C4188d.f33664s = B1(512);
    }

    public void F1(int i10) {
        this.f49947N0 = i10;
    }

    public boolean G1(C4188d c4188d, boolean[] zArr) {
        zArr[2] = false;
        boolean zB1 = B1(64);
        Z0(c4188d, zB1);
        int size = this.f50043K0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.f50043K0.get(i10);
            eVar.Z0(c4188d, zB1);
            if (eVar.U()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void H1() {
        this.f49945L0.e(this);
    }

    @Override // j1.e
    public void Y0(boolean z10, boolean z11) {
        super.Y0(z10, z11);
        int size = this.f50043K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f50043K0.get(i10)).Y0(z10, z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0307 A[PHI: r2 r16
  0x0307: PHI (r2v15 boolean) = (r2v14 boolean), (r2v19 boolean), (r2v19 boolean), (r2v19 boolean) binds: [B:138:0x02c8, B:146:0x02ed, B:147:0x02ef, B:149:0x02f5] A[DONT_GENERATE, DONT_INLINE]
  0x0307: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:138:0x02c8, B:146:0x02ed, B:147:0x02ef, B:149:0x02f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // j1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d1() {
        /*
            Method dump skipped, instructions count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.f.d1():void");
    }

    void g1(e eVar, int i10) {
        if (i10 == 0) {
            i1(eVar);
        } else if (i10 == 1) {
            n1(eVar);
        }
    }

    public boolean h1(C4188d c4188d) {
        boolean zB1 = B1(64);
        d(c4188d, zB1);
        int size = this.f50043K0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.f50043K0.get(i10);
            eVar.G0(0, false);
            eVar.G0(1, false);
            if (eVar instanceof C6241a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.f50043K0.get(i11);
                if (eVar2 instanceof C6241a) {
                    ((C6241a) eVar2).i1();
                }
            }
        }
        this.f49973n1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = (e) this.f50043K0.get(i12);
            if (eVar3.c()) {
                if (eVar3 instanceof l) {
                    this.f49973n1.add(eVar3);
                } else {
                    eVar3.d(c4188d, zB1);
                }
            }
        }
        while (this.f49973n1.size() > 0) {
            int size2 = this.f49973n1.size();
            Iterator it = this.f49973n1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) ((e) it.next());
                if (lVar.d1(this.f49973n1)) {
                    lVar.d(c4188d, zB1);
                    this.f49973n1.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f49973n1.size()) {
                Iterator it2 = this.f49973n1.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).d(c4188d, zB1);
                }
                this.f49973n1.clear();
            }
        }
        if (C4188d.f33664s) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = (e) this.f50043K0.get(i13);
                if (!eVar4.c()) {
                    hashSet.add(eVar4);
                }
            }
            b(this, c4188d, hashSet, x() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e eVar5 = (e) it3.next();
                k.a(this, c4188d, eVar5);
                eVar5.d(c4188d, zB1);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                e eVar6 = (e) this.f50043K0.get(i14);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.f49890Y;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.D0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.Q0(e.b.FIXED);
                    }
                    eVar6.d(c4188d, zB1);
                    if (bVar == bVar3) {
                        eVar6.D0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.Q0(bVar2);
                    }
                } else {
                    k.a(this, c4188d, eVar6);
                    if (!eVar6.c()) {
                        eVar6.d(c4188d, zB1);
                    }
                }
            }
        }
        if (this.f49955V0 > 0) {
            AbstractC6242b.b(this, c4188d, null, 0);
        }
        if (this.f49956W0 > 0) {
            AbstractC6242b.b(this, c4188d, null, 1);
        }
        return true;
    }

    public void j1(d dVar) {
        WeakReference weakReference = this.f49972m1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f49972m1.get()).e()) {
            this.f49972m1 = new WeakReference(dVar);
        }
    }

    @Override // j1.m, j1.e
    public void k0() {
        this.f49950Q0.D();
        this.f49951R0 = 0;
        this.f49953T0 = 0;
        this.f49952S0 = 0;
        this.f49954U0 = 0;
        this.f49965f1 = false;
        super.k0();
    }

    public void k1(d dVar) {
        WeakReference weakReference = this.f49970k1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f49970k1.get()).e()) {
            this.f49970k1 = new WeakReference(dVar);
        }
    }

    void o1(d dVar) {
        WeakReference weakReference = this.f49971l1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f49971l1.get()).e()) {
            this.f49971l1 = new WeakReference(dVar);
        }
    }

    void p1(d dVar) {
        WeakReference weakReference = this.f49969j1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f49969j1.get()).e()) {
            this.f49969j1 = new WeakReference(dVar);
        }
    }

    public boolean q1(boolean z10) {
        return this.f49946M0.f(z10);
    }

    public boolean r1(boolean z10) {
        return this.f49946M0.g(z10);
    }

    public boolean s1(boolean z10, int i10) {
        return this.f49946M0.h(z10, i10);
    }

    public C6356b.InterfaceC1888b t1() {
        return this.f49948O0;
    }

    public int u1() {
        return this.f49964e1;
    }

    public C4188d v1() {
        return this.f49950Q0;
    }

    public boolean w1() {
        return false;
    }

    public void x1() {
        this.f49946M0.j();
    }

    public boolean y1() {
        return this.f49949P0;
    }

    public long z1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f49951R0 = i17;
        this.f49952S0 = i18;
        return this.f49945L0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }
}
