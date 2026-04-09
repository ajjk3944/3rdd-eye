package A;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public z.e f11a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13c;

    /* renamed from: d, reason: collision with root package name */
    public z.e f14d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f15e;

    /* renamed from: f, reason: collision with root package name */
    public C.f f16f;

    /* renamed from: g, reason: collision with root package name */
    public b f17g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f18h;

    public final void a(g gVar, int i, ArrayList arrayList, m mVar) {
        p pVar = gVar.f22d;
        m mVar2 = pVar.f45c;
        g gVar2 = pVar.i;
        g gVar3 = pVar.f50h;
        if (mVar2 == null) {
            z.e eVar = this.f11a;
            if (pVar == eVar.f24322d || pVar == eVar.f24324e) {
                return;
            }
            if (mVar == null) {
                mVar = new m();
                mVar.f33a = null;
                mVar.f34b = new ArrayList();
                mVar.f33a = pVar;
                arrayList.add(mVar);
            }
            pVar.f45c = mVar;
            mVar.f34b.add(pVar);
            ArrayList arrayList2 = gVar3.f28k;
            int size = arrayList2.size();
            int i3 = 0;
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                d dVar = (d) obj;
                if (dVar instanceof g) {
                    a((g) dVar, i, arrayList, mVar);
                }
            }
            ArrayList arrayList3 = gVar2.f28k;
            int size2 = arrayList3.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                d dVar2 = (d) obj2;
                if (dVar2 instanceof g) {
                    a((g) dVar2, i, arrayList, mVar);
                }
            }
            if (i == 1 && (pVar instanceof n)) {
                ArrayList arrayList4 = ((n) pVar).f35k.f28k;
                int size3 = arrayList4.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj3 = arrayList4.get(i8);
                    i8++;
                    d dVar3 = (d) obj3;
                    if (dVar3 instanceof g) {
                        a((g) dVar3, i, arrayList, mVar);
                    }
                }
            }
            ArrayList arrayList5 = gVar3.f29l;
            int size4 = arrayList5.size();
            int i9 = 0;
            while (i9 < size4) {
                Object obj4 = arrayList5.get(i9);
                i9++;
                a((g) obj4, i, arrayList, mVar);
            }
            ArrayList arrayList6 = gVar2.f29l;
            int size5 = arrayList6.size();
            int i10 = 0;
            while (i10 < size5) {
                Object obj5 = arrayList6.get(i10);
                i10++;
                a((g) obj5, i, arrayList, mVar);
            }
            if (i == 1 && (pVar instanceof n)) {
                ArrayList arrayList7 = ((n) pVar).f35k.f29l;
                int size6 = arrayList7.size();
                while (i3 < size6) {
                    Object obj6 = arrayList7.get(i3);
                    i3++;
                    a((g) obj6, i, arrayList, mVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(z.e r25) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.e.b(z.e):void");
    }

    public final void c() {
        z.e eVar = this.f11a;
        ArrayList arrayList = this.f18h;
        ArrayList arrayList2 = this.f15e;
        arrayList2.clear();
        z.e eVar2 = this.f14d;
        eVar2.f24322d.f();
        eVar2.f24324e.f();
        arrayList2.add(eVar2.f24322d);
        arrayList2.add(eVar2.f24324e);
        ArrayList arrayList3 = eVar2.f24369q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            z.d dVar = (z.d) obj;
            if (dVar instanceof z.h) {
                j jVar = new j(dVar);
                dVar.f24322d.f();
                dVar.f24324e.f();
                jVar.f48f = ((z.h) dVar).f24434u0;
                arrayList2.add(jVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f24319b == null) {
                        dVar.f24319b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f24319b);
                } else {
                    arrayList2.add(dVar.f24322d);
                }
                if (dVar.y()) {
                    if (dVar.f24320c == null) {
                        dVar.f24320c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f24320c);
                } else {
                    arrayList2.add(dVar.f24324e);
                }
                if (dVar instanceof z.i) {
                    arrayList2.add(new k(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ((p) obj2).f();
        }
        int size3 = arrayList2.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList2.get(i6);
            i6++;
            p pVar = (p) obj3;
            if (pVar.f44b != eVar2) {
                pVar.d();
            }
        }
        arrayList.clear();
        e(eVar.f24322d, 0, arrayList);
        e(eVar.f24324e, 1, arrayList);
        this.f12b = false;
    }

    public final int d(z.e eVar, int i) {
        ArrayList arrayList;
        int i3;
        long jMax;
        float f2;
        z.e eVar2 = eVar;
        ArrayList arrayList2 = this.f18h;
        int size = arrayList2.size();
        long j6 = 0;
        int i6 = 0;
        long jMax2 = 0;
        while (i6 < size) {
            p pVar = ((m) arrayList2.get(i6)).f33a;
            if (!(pVar instanceof c) ? !(i != 0 ? (pVar instanceof n) : (pVar instanceof l)) : ((c) pVar).f48f != i) {
                g gVar = (i == 0 ? eVar2.f24322d : eVar2.f24324e).f50h;
                g gVar2 = (i == 0 ? eVar2.f24322d : eVar2.f24324e).i;
                g gVar3 = pVar.f50h;
                g gVar4 = pVar.i;
                boolean zContains = gVar3.f29l.contains(gVar);
                boolean zContains2 = gVar4.f29l.contains(gVar2);
                long j7 = pVar.j();
                if (zContains && zContains2) {
                    long jB = m.b(gVar3, j6);
                    long jA = m.a(gVar4, j6);
                    long j8 = jB - j7;
                    int i7 = gVar4.f24f;
                    arrayList = arrayList2;
                    i3 = size;
                    if (j8 >= (-i7)) {
                        j8 += i7;
                    }
                    long j9 = gVar3.f24f;
                    long j10 = ((-jA) - j7) - j9;
                    if (j10 >= j9) {
                        j10 -= j9;
                    }
                    z.d dVar = pVar.f44b;
                    if (i == 0) {
                        f2 = dVar.f24323d0;
                    } else if (i == 1) {
                        f2 = dVar.f24325e0;
                    } else {
                        dVar.getClass();
                        f2 = -1.0f;
                    }
                    float f5 = f2 > 0.0f ? (long) ((j8 / (1.0f - f2)) + (j10 / f2)) : 0L;
                    jMax = (gVar3.f24f + ((((long) ((f5 * f2) + 0.5f)) + j7) + ((long) AbstractC1135f5.h(1.0f, f2, f5, 0.5f)))) - gVar4.f24f;
                } else {
                    arrayList = arrayList2;
                    i3 = size;
                    jMax = zContains ? Math.max(m.b(gVar3, gVar3.f24f), gVar3.f24f + j7) : zContains2 ? Math.max(-m.a(gVar4, gVar4.f24f), (-gVar4.f24f) + j7) : (pVar.j() + gVar3.f24f) - gVar4.f24f;
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                jMax = j6;
            }
            jMax2 = Math.max(jMax2, jMax);
            i6++;
            eVar2 = eVar;
            arrayList2 = arrayList;
            size = i3;
            j6 = 0;
        }
        return (int) jMax2;
    }

    public final void e(p pVar, int i, ArrayList arrayList) {
        g gVar = pVar.f50h;
        g gVar2 = pVar.i;
        ArrayList arrayList2 = gVar.f28k;
        int size = arrayList2.size();
        int i3 = 0;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList2.get(i6);
            i6++;
            d dVar = (d) obj;
            if (dVar instanceof g) {
                a((g) dVar, i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f50h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = gVar2.f28k;
        int size2 = arrayList3.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList3.get(i7);
            i7++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof g) {
                a((g) dVar2, i, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((n) pVar).f35k.f28k;
            int size3 = arrayList4.size();
            while (i3 < size3) {
                Object obj3 = arrayList4.get(i3);
                i3++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof g) {
                    a((g) dVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i3, int i6, int i7, z.d dVar) {
        b bVar = this.f17g;
        bVar.f0a = i;
        bVar.f1b = i6;
        bVar.f2c = i3;
        bVar.f3d = i7;
        this.f16f.b(dVar, bVar);
        dVar.O(bVar.f4e);
        dVar.L(bVar.f5f);
        dVar.f24296E = bVar.f7h;
        dVar.I(bVar.f6g);
    }

    public final void g() {
        a aVar;
        e eVar = this;
        ArrayList arrayList = eVar.f11a.f24369q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i3 = i + 1;
            z.d dVar = (z.d) arrayList.get(i);
            if (!dVar.f24317a) {
                int[] iArr = dVar.f24346p0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                int i8 = dVar.f24348r;
                int i9 = dVar.f24349s;
                boolean z6 = i6 == 2 || (i6 == 3 && i8 == 1);
                boolean z7 = i7 == 2 || (i7 == 3 && i9 == 1);
                h hVar = dVar.f24322d.f47e;
                boolean z8 = hVar.f27j;
                h hVar2 = dVar.f24324e.f47e;
                boolean z9 = hVar2.f27j;
                boolean z10 = z6;
                if (z8 && z9) {
                    eVar.f(1, hVar.f25g, 1, hVar2.f25g, dVar);
                    dVar.f24317a = true;
                } else if (z8 && z7) {
                    f(1, hVar.f25g, 2, hVar2.f25g, dVar);
                    if (i7 == 3) {
                        dVar.f24324e.f47e.f30m = dVar.k();
                    } else {
                        dVar.f24324e.f47e.d(dVar.k());
                        dVar.f24317a = true;
                    }
                } else if (z9 && z10) {
                    f(2, hVar.f25g, 1, hVar2.f25g, dVar);
                    if (i6 == 3) {
                        dVar.f24322d.f47e.f30m = dVar.q();
                    } else {
                        dVar.f24322d.f47e.d(dVar.q());
                        dVar.f24317a = true;
                    }
                }
                if (dVar.f24317a && (aVar = dVar.f24324e.f36l) != null) {
                    aVar.d(dVar.f24318a0);
                }
                eVar = this;
            }
            i = i3;
        }
    }
}
