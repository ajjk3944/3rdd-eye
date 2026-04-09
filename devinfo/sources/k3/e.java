package k3;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import je.t;
import l3.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends d {
    public int A0;
    public b[] B0;
    public b[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final l3.b L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f27879q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final i0.f f27880r0 = new i0.f(this);

    /* renamed from: s0, reason: collision with root package name */
    public final t f27881s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f27882t0;

    /* renamed from: u0, reason: collision with root package name */
    public n3.e f27883u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f27884v0;

    /* renamed from: w0, reason: collision with root package name */
    public final i3.c f27885w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f27886x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f27887y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f27888z0;

    public e() {
        t tVar = new t();
        tVar.f27615a = true;
        tVar.f27616b = true;
        tVar.f27619e = new ArrayList();
        new ArrayList();
        tVar.f27620f = null;
        tVar.g = new l3.b();
        tVar.f27621h = new ArrayList();
        tVar.f27617c = this;
        tVar.f27618d = this;
        this.f27881s0 = tVar;
        this.f27883u0 = null;
        this.f27884v0 = false;
        this.f27885w0 = new i3.c();
        this.f27888z0 = 0;
        this.A0 = 0;
        this.B0 = new b[4];
        this.C0 = new b[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new l3.b();
    }

    public static void V(d dVar, n3.e eVar, l3.b bVar) {
        int i4;
        int i10;
        if (eVar == null) {
            return;
        }
        int i11 = dVar.f27851g0;
        int[] iArr = dVar.f27872t;
        if (i11 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.f28551e = 0;
            bVar.f28552f = 0;
            return;
        }
        int[] iArr2 = dVar.f27868p0;
        bVar.f28547a = iArr2[0];
        bVar.f28548b = iArr2[1];
        bVar.f28549c = dVar.q();
        bVar.f28550d = dVar.k();
        bVar.f28554i = false;
        bVar.j = 0;
        boolean z3 = bVar.f28547a == 3;
        boolean z10 = bVar.f28548b == 3;
        boolean z11 = z3 && dVar.W > 0.0f;
        boolean z12 = z10 && dVar.W > 0.0f;
        if (z3 && dVar.t(0) && dVar.f27870r == 0 && !z11) {
            bVar.f28547a = 2;
            if (z10 && dVar.f27871s == 0) {
                bVar.f28547a = 1;
            }
            z3 = false;
        }
        if (z10 && dVar.t(1) && dVar.f27871s == 0 && !z12) {
            bVar.f28548b = 2;
            if (z3 && dVar.f27870r == 0) {
                bVar.f28548b = 1;
            }
            z10 = false;
        }
        if (dVar.A()) {
            bVar.f28547a = 1;
            z3 = false;
        }
        if (dVar.B()) {
            bVar.f28548b = 1;
            z10 = false;
        }
        if (z11) {
            if (iArr[0] == 4) {
                bVar.f28547a = 1;
            } else if (!z10) {
                if (bVar.f28548b == 1) {
                    i10 = bVar.f28550d;
                } else {
                    bVar.f28547a = 2;
                    eVar.b(dVar, bVar);
                    i10 = bVar.f28552f;
                }
                bVar.f28547a = 1;
                bVar.f28549c = (int) (dVar.W * i10);
            }
        }
        if (z12) {
            if (iArr[1] == 4) {
                bVar.f28548b = 1;
            } else if (!z3) {
                if (bVar.f28547a == 1) {
                    i4 = bVar.f28549c;
                } else {
                    bVar.f28548b = 2;
                    eVar.b(dVar, bVar);
                    i4 = bVar.f28551e;
                }
                bVar.f28548b = 1;
                if (dVar.X == -1) {
                    bVar.f28550d = (int) (i4 / dVar.W);
                } else {
                    bVar.f28550d = (int) (dVar.W * i4);
                }
            }
        }
        eVar.b(dVar, bVar);
        dVar.O(bVar.f28551e);
        dVar.L(bVar.f28552f);
        dVar.E = bVar.f28553h;
        dVar.I(bVar.g);
        bVar.j = 0;
    }

    @Override // k3.d
    public final void C() {
        this.f27885w0.t();
        this.f27886x0 = 0;
        this.f27887y0 = 0;
        this.f27879q0.clear();
        super.C();
    }

    @Override // k3.d
    public final void F(i0.f fVar) {
        super.F(fVar);
        int size = this.f27879q0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d) this.f27879q0.get(i4)).F(fVar);
        }
    }

    @Override // k3.d
    public final void P(boolean z3, boolean z10) {
        super.P(z3, z10);
        int size = this.f27879q0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d) this.f27879q0.get(i4)).P(z3, z10);
        }
    }

    public final void R(d dVar, int i4) {
        if (i4 == 0) {
            int i10 = this.f27888z0 + 1;
            b[] bVarArr = this.C0;
            if (i10 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i11 = this.f27888z0;
            bVarArr2[i11] = new b(dVar, 0, this.f27884v0);
            this.f27888z0 = i11 + 1;
            return;
        }
        if (i4 == 1) {
            int i12 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i12 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i13 = this.A0;
            bVarArr4[i13] = new b(dVar, 1, this.f27884v0);
            this.A0 = i13 + 1;
        }
    }

    public final void S(i3.c cVar) {
        e eVar;
        i3.c cVar2;
        boolean zW = W(64);
        b(cVar, zW);
        int size = this.f27879q0.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) this.f27879q0.get(i4);
            boolean[] zArr = dVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i10 = 0; i10 < size; i10++) {
                d dVar2 = (d) this.f27879q0.get(i10);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i11 = 0; i11 < aVar.f27922r0; i11++) {
                        d dVar3 = aVar.f27921q0[i11];
                        if (aVar.f27813t0 || dVar3.c()) {
                            int i12 = aVar.f27812s0;
                            if (i12 == 0 || i12 == 1) {
                                dVar3.S[0] = true;
                            } else if (i12 == 2 || i12 == 3) {
                                dVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i13 = 0; i13 < size; i13++) {
            d dVar4 = (d) this.f27879q0.get(i13);
            dVar4.getClass();
            boolean z10 = dVar4 instanceof g;
            if (z10 || (dVar4 instanceof h)) {
                if (z10) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, zW);
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
                for (int i14 = 0; i14 < gVar.f27922r0; i14++) {
                    if (hashSet.contains(gVar.f27921q0[i14])) {
                        gVar.b(cVar, zW);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, zW);
                }
                hashSet.clear();
            }
        }
        if (i3.c.f25834q) {
            HashSet hashSet2 = new HashSet();
            for (int i15 = 0; i15 < size; i15++) {
                d dVar5 = (d) this.f27879q0.get(i15);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.f27868p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, zW);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i16 = 0; i16 < size; i16++) {
                d dVar7 = (d) eVar.f27879q0.get(i16);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f27868p0;
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    if (i17 == 2) {
                        dVar7.M(1);
                    }
                    if (i18 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar2, zW);
                    if (i17 == 2) {
                        dVar7.M(i17);
                    }
                    if (i18 == 2) {
                        dVar7.N(i18);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, zW);
                    }
                }
            }
        }
        if (eVar.f27888z0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.A0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean T(int i4, boolean z3) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        t tVar = this.f27881s0;
        ArrayList arrayList = (ArrayList) tVar.f27619e;
        e eVar = (e) tVar.f27617c;
        int iJ = eVar.j(0);
        int[] iArr = eVar.f27868p0;
        int iJ2 = eVar.j(1);
        int iR = eVar.r();
        int iS = eVar.s();
        if (z3 && (iJ == 2 || iJ2 == 2)) {
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z11 = z3;
                    break;
                }
                Object obj = arrayList.get(i12);
                i12++;
                n nVar = (n) obj;
                if (nVar.f28585f == i4 && !nVar.k()) {
                    z11 = false;
                    break;
                }
            }
            if (i4 == 0) {
                if (z11 && iJ == 2) {
                    eVar.M(1);
                    eVar.O(tVar.d(eVar, 0));
                    eVar.f27845d.f28584e.d(eVar.q());
                }
            } else if (z11 && iJ2 == 2) {
                eVar.N(1);
                eVar.L(tVar.d(eVar, 1));
                eVar.f27847e.f28584e.d(eVar.k());
            }
        }
        if (i4 == 0) {
            i10 = 0;
            int i13 = iArr[0];
            if (i13 == 1 || i13 == 4) {
                int iQ = eVar.q() + iR;
                eVar.f27845d.f28587i.d(iQ);
                eVar.f27845d.f28584e.d(iQ - iR);
                i11 = 1;
            }
            i11 = i10;
        } else {
            i10 = 0;
            int i14 = iArr[1];
            if (i14 == 1 || i14 == 4) {
                int iK = eVar.k() + iS;
                eVar.f27847e.f28587i.d(iK);
                eVar.f27847e.f28584e.d(iK - iS);
                i11 = 1;
            }
            i11 = i10;
        }
        tVar.i();
        int size2 = arrayList.size();
        int i15 = i10;
        while (i15 < size2) {
            Object obj2 = arrayList.get(i15);
            i15++;
            n nVar2 = (n) obj2;
            if (nVar2.f28585f == i4 && (nVar2.f28581b != eVar || nVar2.g)) {
                nVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i16 = i10;
        while (i16 < size3) {
            Object obj3 = arrayList.get(i16);
            i16++;
            n nVar3 = (n) obj3;
            if (nVar3.f28585f == i4 && (i11 != 0 || nVar3.f28581b != eVar)) {
                if (!nVar3.f28586h.j || !nVar3.f28587i.j || (!(nVar3 instanceof l3.c) && !nVar3.f28584e.j)) {
                    z10 = i10;
                    break;
                }
            }
        }
        z10 = 1;
        eVar.M(iJ);
        eVar.N(iJ2);
        return z10;
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
    /* JADX WARN: Removed duplicated region for block: B:428:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x081d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x082a A[LOOP:14: B:488:0x0828->B:489:0x082a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x090b  */
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
            Method dump skipped, instructions count: 2329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.e.U():void");
    }

    public final boolean W(int i4) {
        return (this.D0 & i4) == i4;
    }

    @Override // k3.d
    public final void n(StringBuilder sb2) {
        sb2.append(this.j + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.U);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.V);
        sb2.append("\n");
        ArrayList arrayList = this.f27879q0;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((d) obj).n(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
