package s0;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import r0.C5508e;
import r0.C5509f;
import r0.C5511h;
import r0.C5512i;
import s0.C5543b;

/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public C5509f f45912a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45913b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f45914c;

    /* renamed from: d, reason: collision with root package name */
    public C5509f f45915d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<p> f45916e;

    /* renamed from: f, reason: collision with root package name */
    public C5543b.InterfaceC0526b f45917f;

    /* renamed from: g, reason: collision with root package name */
    public C5543b.a f45918g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<m> f45919h;

    public final void a(f fVar, int i, ArrayList arrayList, m mVar) {
        p pVar = fVar.f45923d;
        if (pVar.f45948c == null) {
            C5509f c5509f = this.f45912a;
            if (pVar == c5509f.f45547d || pVar == c5509f.f45549e) {
                return;
            }
            if (mVar == null) {
                mVar = new m();
                mVar.f45935a = null;
                mVar.f45936b = new ArrayList<>();
                mVar.f45935a = pVar;
                arrayList.add(mVar);
            }
            pVar.f45948c = mVar;
            mVar.f45936b.add(pVar);
            f fVar2 = pVar.f45953h;
            Iterator it = fVar2.f45929k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar instanceof f) {
                    a((f) dVar, i, arrayList, mVar);
                }
            }
            f fVar3 = pVar.i;
            Iterator it2 = fVar3.f45929k.iterator();
            while (it2.hasNext()) {
                d dVar2 = (d) it2.next();
                if (dVar2 instanceof f) {
                    a((f) dVar2, i, arrayList, mVar);
                }
            }
            if (i == 1 && (pVar instanceof n)) {
                Iterator it3 = ((n) pVar).f45937k.f45929k.iterator();
                while (it3.hasNext()) {
                    d dVar3 = (d) it3.next();
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i, arrayList, mVar);
                    }
                }
            }
            Iterator it4 = fVar2.f45930l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i, arrayList, mVar);
            }
            Iterator it5 = fVar3.f45930l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i, arrayList, mVar);
            }
            if (i == 1 && (pVar instanceof n)) {
                Iterator it6 = ((n) pVar).f45937k.f45930l.iterator();
                while (it6.hasNext()) {
                    a((f) it6.next(), i, arrayList, mVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x01af A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(r0.C5509f r24) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.e.b(r0.f):void");
    }

    public final void c() {
        ArrayList<p> arrayList = this.f45916e;
        arrayList.clear();
        C5509f c5509f = this.f45915d;
        c5509f.f45547d.f();
        c5509f.f45549e.f();
        arrayList.add(c5509f.f45547d);
        arrayList.add(c5509f.f45549e);
        Iterator<C5508e> it = c5509f.f45667r0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C5508e next = it.next();
            if (next instanceof C5511h) {
                j jVar = new j(next);
                next.f45547d.f();
                next.f45549e.f();
                jVar.f45951f = ((C5511h) next).f45650v0;
                arrayList.add(jVar);
            } else {
                if (next.x()) {
                    if (next.f45543b == null) {
                        next.f45543b = new C5544c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f45543b);
                } else {
                    arrayList.add(next.f45547d);
                }
                if (next.y()) {
                    if (next.f45545c == null) {
                        next.f45545c = new C5544c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f45545c);
                } else {
                    arrayList.add(next.f45549e);
                }
                if (next instanceof C5512i) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f45947b != c5509f) {
                next2.d();
            }
        }
        ArrayList<m> arrayList2 = this.f45919h;
        arrayList2.clear();
        C5509f c5509f2 = this.f45912a;
        e(c5509f2.f45547d, 0, arrayList2);
        e(c5509f2.f45549e, 1, arrayList2);
        this.f45913b = false;
    }

    public final int d(C5509f c5509f, int i) {
        ArrayList<m> arrayList;
        int i10;
        int i11;
        long jMax;
        float f10;
        C5509f c5509f2 = c5509f;
        ArrayList<m> arrayList2 = this.f45919h;
        int size = arrayList2.size();
        int i12 = 0;
        long jMax2 = 0;
        while (i12 < size) {
            p pVar = arrayList2.get(i12).f45935a;
            if (!(pVar instanceof C5544c) ? !(i != 0 ? (pVar instanceof n) : (pVar instanceof l)) : ((C5544c) pVar).f45951f != i) {
                f fVar = (i == 0 ? c5509f2.f45547d : c5509f2.f45549e).f45953h;
                f fVar2 = (i == 0 ? c5509f2.f45547d : c5509f2.f45549e).i;
                boolean zContains = pVar.f45953h.f45930l.contains(fVar);
                f fVar3 = pVar.i;
                boolean zContains2 = fVar3.f45930l.contains(fVar2);
                long j4 = pVar.j();
                f fVar4 = pVar.f45953h;
                if (zContains && zContains2) {
                    long jB = m.b(fVar4, 0L);
                    ArrayList<m> arrayList3 = arrayList2;
                    i10 = size;
                    long jA = m.a(fVar3, 0L);
                    long j10 = jB - j4;
                    int i13 = fVar3.f45925f;
                    arrayList = arrayList3;
                    i11 = i12;
                    if (j10 >= (-i13)) {
                        j10 += i13;
                    }
                    long j11 = (-jA) - j4;
                    long j12 = fVar4.f45925f;
                    long j13 = j11 - j12;
                    if (j13 >= j12) {
                        j13 -= j12;
                    }
                    C5508e c5508e = pVar.f45947b;
                    if (i == 0) {
                        f10 = c5508e.f45552f0;
                    } else if (i == 1) {
                        f10 = c5508e.f45554g0;
                    } else {
                        c5508e.getClass();
                        f10 = -1.0f;
                    }
                    float f11 = f10 > 0.0f ? (long) ((j10 / (1.0f - f10)) + (j13 / f10)) : 0L;
                    jMax = (fVar4.f45925f + ((((long) ((f11 * f10) + 0.5f)) + j4) + ((long) com.google.android.gms.measurement.internal.a.e(1.0f, f10, f11, 0.5f)))) - fVar3.f45925f;
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i12;
                    jMax = zContains ? Math.max(m.b(fVar4, fVar4.f45925f), fVar4.f45925f + j4) : zContains2 ? Math.max(-m.a(fVar3, fVar3.f45925f), (-fVar3.f45925f) + j4) : (pVar.j() + fVar4.f45925f) - fVar3.f45925f;
                }
            } else {
                arrayList = arrayList2;
                i10 = size;
                i11 = i12;
                jMax = 0;
            }
            jMax2 = Math.max(jMax2, jMax);
            i12 = i11 + 1;
            c5509f2 = c5509f;
            size = i10;
            arrayList2 = arrayList;
        }
        return (int) jMax2;
    }

    public final void e(p pVar, int i, ArrayList<m> arrayList) {
        f fVar;
        Iterator it = pVar.f45953h.f45929k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fVar = pVar.i;
            if (!zHasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f45953h, i, arrayList, null);
            }
        }
        Iterator it2 = fVar.f45929k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                a((f) dVar2, i, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((n) pVar).f45937k.f45929k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(C5508e c5508e, C5508e.b bVar, int i, C5508e.b bVar2, int i10) {
        C5543b.a aVar = this.f45918g;
        aVar.f45901a = bVar;
        aVar.f45902b = bVar2;
        aVar.f45903c = i;
        aVar.f45904d = i10;
        ((ConstraintLayout.c) this.f45917f).b(c5508e, aVar);
        c5508e.O(aVar.f45905e);
        c5508e.L(aVar.f45906f);
        c5508e.f45519E = aVar.f45908h;
        c5508e.I(aVar.f45907g);
    }

    public final void g() {
        C5542a c5542a;
        Iterator<C5508e> it = this.f45912a.f45667r0.iterator();
        while (it.hasNext()) {
            C5508e next = it.next();
            if (!next.f45541a) {
                C5508e.b[] bVarArr = next.f45535U;
                boolean z10 = false;
                C5508e.b bVar = bVarArr[0];
                C5508e.b bVar2 = bVarArr[1];
                int i = next.f45574r;
                int i10 = next.f45575s;
                C5508e.b bVar3 = C5508e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == C5508e.b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == C5508e.b.MATCH_CONSTRAINT && i10 == 1)) {
                    z10 = true;
                }
                g gVar = next.f45547d.f45950e;
                boolean z12 = gVar.f45928j;
                g gVar2 = next.f45549e.f45950e;
                boolean z13 = gVar2.f45928j;
                if (z12 && z13) {
                    C5508e.b bVar4 = C5508e.b.FIXED;
                    f(next, bVar4, gVar.f45926g, bVar4, gVar2.f45926g);
                    next.f45541a = true;
                } else if (z12 && z10) {
                    f(next, C5508e.b.FIXED, gVar.f45926g, bVar3, gVar2.f45926g);
                    if (bVar2 == C5508e.b.MATCH_CONSTRAINT) {
                        next.f45549e.f45950e.f45931m = next.k();
                    } else {
                        next.f45549e.f45950e.d(next.k());
                        next.f45541a = true;
                    }
                } else if (z13 && z11) {
                    f(next, bVar3, gVar.f45926g, C5508e.b.FIXED, gVar2.f45926g);
                    if (bVar == C5508e.b.MATCH_CONSTRAINT) {
                        next.f45547d.f45950e.f45931m = next.q();
                    } else {
                        next.f45547d.f45950e.d(next.q());
                        next.f45541a = true;
                    }
                }
                if (next.f45541a && (c5542a = next.f45549e.f45938l) != null) {
                    c5542a.d(next.f45546c0);
                }
            }
        }
    }
}
