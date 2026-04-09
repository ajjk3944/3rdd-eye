package z;

import A.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import o.a1;
import x.C2982c;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: A0, reason: collision with root package name */
    public int f24357A0;

    /* renamed from: B0, reason: collision with root package name */
    public b[] f24358B0;

    /* renamed from: C0, reason: collision with root package name */
    public b[] f24359C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f24360D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f24361E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f24362F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f24363G0;

    /* renamed from: H0, reason: collision with root package name */
    public WeakReference f24364H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f24365I0;

    /* renamed from: J0, reason: collision with root package name */
    public WeakReference f24366J0;

    /* renamed from: K0, reason: collision with root package name */
    public final HashSet f24367K0;

    /* renamed from: L0, reason: collision with root package name */
    public final A.b f24368L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f24369q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final V2.e f24370r0 = new V2.e(this);

    /* renamed from: s0, reason: collision with root package name */
    public final A.e f24371s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f24372t0;

    /* renamed from: u0, reason: collision with root package name */
    public C.f f24373u0;
    public boolean v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C2982c f24374w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f24375x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f24376y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f24377z0;

    public e() {
        A.e eVar = new A.e();
        eVar.f12b = true;
        eVar.f13c = true;
        eVar.f15e = new ArrayList();
        new ArrayList();
        eVar.f16f = null;
        eVar.f17g = new A.b();
        eVar.f18h = new ArrayList();
        eVar.f11a = this;
        eVar.f14d = this;
        this.f24371s0 = eVar;
        this.f24373u0 = null;
        this.v0 = false;
        this.f24374w0 = new C2982c();
        this.f24377z0 = 0;
        this.f24357A0 = 0;
        this.f24358B0 = new b[4];
        this.f24359C0 = new b[4];
        this.f24360D0 = 257;
        this.f24361E0 = false;
        this.f24362F0 = false;
        this.f24363G0 = null;
        this.f24364H0 = null;
        this.f24365I0 = null;
        this.f24366J0 = null;
        this.f24367K0 = new HashSet();
        this.f24368L0 = new A.b();
    }

    public static void V(d dVar, C.f fVar, A.b bVar) {
        int i;
        int i3;
        if (fVar == null) {
            return;
        }
        int i6 = dVar.f24329g0;
        int[] iArr = dVar.f24350t;
        if (i6 == 8 || (dVar instanceof h) || (dVar instanceof C3013a)) {
            bVar.f4e = 0;
            bVar.f5f = 0;
            return;
        }
        int[] iArr2 = dVar.f24346p0;
        bVar.f0a = iArr2[0];
        bVar.f1b = iArr2[1];
        bVar.f2c = dVar.q();
        bVar.f3d = dVar.k();
        bVar.i = false;
        bVar.f8j = 0;
        boolean z6 = bVar.f0a == 3;
        boolean z7 = bVar.f1b == 3;
        boolean z8 = z6 && dVar.f24313W > 0.0f;
        boolean z9 = z7 && dVar.f24313W > 0.0f;
        if (z6 && dVar.t(0) && dVar.f24348r == 0 && !z8) {
            bVar.f0a = 2;
            if (z7 && dVar.f24349s == 0) {
                bVar.f0a = 1;
            }
            z6 = false;
        }
        if (z7 && dVar.t(1) && dVar.f24349s == 0 && !z9) {
            bVar.f1b = 2;
            if (z6 && dVar.f24348r == 0) {
                bVar.f1b = 1;
            }
            z7 = false;
        }
        if (dVar.A()) {
            bVar.f0a = 1;
            z6 = false;
        }
        if (dVar.B()) {
            bVar.f1b = 1;
            z7 = false;
        }
        if (z8) {
            if (iArr[0] == 4) {
                bVar.f0a = 1;
            } else if (!z7) {
                if (bVar.f1b == 1) {
                    i3 = bVar.f3d;
                } else {
                    bVar.f0a = 2;
                    fVar.b(dVar, bVar);
                    i3 = bVar.f5f;
                }
                bVar.f0a = 1;
                bVar.f2c = (int) (dVar.f24313W * i3);
            }
        }
        if (z9) {
            if (iArr[1] == 4) {
                bVar.f1b = 1;
            } else if (!z6) {
                if (bVar.f0a == 1) {
                    i = bVar.f2c;
                } else {
                    bVar.f1b = 2;
                    fVar.b(dVar, bVar);
                    i = bVar.f4e;
                }
                bVar.f1b = 1;
                if (dVar.f24314X == -1) {
                    bVar.f3d = (int) (i / dVar.f24313W);
                } else {
                    bVar.f3d = (int) (dVar.f24313W * i);
                }
            }
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f4e);
        dVar.L(bVar.f5f);
        dVar.f24296E = bVar.f7h;
        dVar.I(bVar.f6g);
        bVar.f8j = 0;
    }

    @Override // z.d
    public final void C() {
        this.f24374w0.t();
        this.f24375x0 = 0;
        this.f24376y0 = 0;
        this.f24369q0.clear();
        super.C();
    }

    @Override // z.d
    public final void F(a1 a1Var) {
        super.F(a1Var);
        int size = this.f24369q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f24369q0.get(i)).F(a1Var);
        }
    }

    @Override // z.d
    public final void P(boolean z6, boolean z7) {
        super.P(z6, z7);
        int size = this.f24369q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f24369q0.get(i)).P(z6, z7);
        }
    }

    public final void R(d dVar, int i) {
        if (i == 0) {
            int i3 = this.f24377z0 + 1;
            b[] bVarArr = this.f24359C0;
            if (i3 >= bVarArr.length) {
                this.f24359C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f24359C0;
            int i6 = this.f24377z0;
            bVarArr2[i6] = new b(dVar, 0, this.v0);
            this.f24377z0 = i6 + 1;
            return;
        }
        if (i == 1) {
            int i7 = this.f24357A0 + 1;
            b[] bVarArr3 = this.f24358B0;
            if (i7 >= bVarArr3.length) {
                this.f24358B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f24358B0;
            int i8 = this.f24357A0;
            bVarArr4[i8] = new b(dVar, 1, this.v0);
            this.f24357A0 = i8 + 1;
        }
    }

    public final void S(C2982c c2982c) {
        e eVar;
        C2982c c2982c2;
        boolean zW = W(64);
        b(c2982c, zW);
        int size = this.f24369q0.size();
        boolean z6 = false;
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.f24369q0.get(i);
            boolean[] zArr = dVar.f24309S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof C3013a) {
                z6 = true;
            }
        }
        if (z6) {
            for (int i3 = 0; i3 < size; i3++) {
                d dVar2 = (d) this.f24369q0.get(i3);
                if (dVar2 instanceof C3013a) {
                    C3013a c3013a = (C3013a) dVar2;
                    for (int i6 = 0; i6 < c3013a.f24436r0; i6++) {
                        d dVar3 = c3013a.f24435q0[i6];
                        if (c3013a.f24266t0 || dVar3.c()) {
                            int i7 = c3013a.f24265s0;
                            if (i7 == 0 || i7 == 1) {
                                dVar3.f24309S[0] = true;
                            } else if (i7 == 2 || i7 == 3) {
                                dVar3.f24309S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f24367K0;
        hashSet.clear();
        for (int i8 = 0; i8 < size; i8++) {
            d dVar4 = (d) this.f24369q0.get(i8);
            dVar4.getClass();
            boolean z7 = dVar4 instanceof g;
            if (z7 || (dVar4 instanceof h)) {
                if (z7) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(c2982c, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i9 = 0; i9 < gVar.f24436r0; i9++) {
                    if (hashSet.contains(gVar.f24435q0[i9])) {
                        gVar.b(c2982c, zW);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(c2982c, zW);
                }
                hashSet.clear();
            }
        }
        if (C2982c.f24000p) {
            HashSet hashSet2 = new HashSet();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar5 = (d) this.f24369q0.get(i10);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            c2982c2 = c2982c;
            eVar.a(this, c2982c2, hashSet2, this.f24346p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, c2982c2, dVar6);
                dVar6.b(c2982c2, zW);
            }
        } else {
            eVar = this;
            c2982c2 = c2982c;
            for (int i11 = 0; i11 < size; i11++) {
                d dVar7 = (d) eVar.f24369q0.get(i11);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f24346p0;
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    if (i12 == 2) {
                        dVar7.M(1);
                    }
                    if (i13 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(c2982c2, zW);
                    if (i12 == 2) {
                        dVar7.M(i12);
                    }
                    if (i13 == 2) {
                        dVar7.N(i13);
                    }
                } else {
                    j.b(this, c2982c2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(c2982c2, zW);
                    }
                }
            }
        }
        if (eVar.f24377z0 > 0) {
            j.a(this, c2982c2, null, 0);
        }
        if (eVar.f24357A0 > 0) {
            j.a(this, c2982c2, null, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean T(int i, boolean z6) {
        int i3;
        int i6;
        boolean z7;
        boolean z8;
        A.e eVar = this.f24371s0;
        ArrayList arrayList = eVar.f15e;
        e eVar2 = eVar.f11a;
        int iJ = eVar2.j(0);
        int[] iArr = eVar2.f24346p0;
        int iJ2 = eVar2.j(1);
        int iR = eVar2.r();
        int iS = eVar2.s();
        if (z6 && (iJ == 2 || iJ2 == 2)) {
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z8 = z6;
                    break;
                }
                Object obj = arrayList.get(i7);
                i7++;
                p pVar = (p) obj;
                if (pVar.f48f == i && !pVar.k()) {
                    z8 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z8 && iJ == 2) {
                    eVar2.M(1);
                    eVar2.O(eVar.d(eVar2, 0));
                    eVar2.f24322d.f47e.d(eVar2.q());
                }
            } else if (z8 && iJ2 == 2) {
                eVar2.N(1);
                eVar2.L(eVar.d(eVar2, 1));
                eVar2.f24324e.f47e.d(eVar2.k());
            }
        }
        if (i == 0) {
            i3 = 0;
            int i8 = iArr[0];
            if (i8 == 1 || i8 == 4) {
                int iQ = eVar2.q() + iR;
                eVar2.f24322d.i.d(iQ);
                eVar2.f24322d.f47e.d(iQ - iR);
                i6 = 1;
            }
            i6 = i3;
        } else {
            i3 = 0;
            int i9 = iArr[1];
            if (i9 == 1 || i9 == 4) {
                int iK = eVar2.k() + iS;
                eVar2.f24324e.i.d(iK);
                eVar2.f24324e.f47e.d(iK - iS);
                i6 = 1;
            }
            i6 = i3;
        }
        eVar.g();
        int size2 = arrayList.size();
        int i10 = i3;
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            p pVar2 = (p) obj2;
            if (pVar2.f48f == i && (pVar2.f44b != eVar2 || pVar2.f49g)) {
                pVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i11 = i3;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            p pVar3 = (p) obj3;
            if (pVar3.f48f == i && (i6 != 0 || pVar3.f44b != eVar2)) {
                if (!pVar3.f50h.f27j || !pVar3.i.f27j || (!(pVar3 instanceof A.c) && !pVar3.f47e.f27j)) {
                    z7 = i3;
                    break;
                }
            }
        }
        z7 = 1;
        eVar2.M(iJ);
        eVar2.N(iJ2);
        return z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x082f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x083c A[LOOP:14: B:488:0x083a->B:489:0x083c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.e.U():void");
    }

    public final boolean W(int i) {
        return (this.f24360D0 & i) == i;
    }

    @Override // z.d
    public final void n(StringBuilder sb) {
        sb.append(this.f24333j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f24311U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f24312V);
        sb.append("\n");
        ArrayList arrayList = this.f24369q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((d) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
