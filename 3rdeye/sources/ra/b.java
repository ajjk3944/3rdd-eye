package ra;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ma.q;
import na.l;
import ra.f;

/* compiled from: StandardZoneRules.java */
/* loaded from: classes3.dex */
public final class b extends f implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final long[] f45835b;

    /* renamed from: c, reason: collision with root package name */
    public final q[] f45836c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f45837d;

    /* renamed from: e, reason: collision with root package name */
    public final ma.f[] f45838e;

    /* renamed from: f, reason: collision with root package name */
    public final q[] f45839f;

    /* renamed from: g, reason: collision with root package name */
    public final e[] f45840g;

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f45841h = new ConcurrentHashMap();

    public b(long[] jArr, q[] qVarArr, long[] jArr2, q[] qVarArr2, e[] eVarArr) {
        this.f45835b = jArr;
        this.f45836c = qVarArr;
        this.f45837d = jArr2;
        this.f45839f = qVarArr2;
        this.f45840g = eVarArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jArr2.length) {
            q qVar = qVarArr2[i];
            int i10 = i + 1;
            q qVar2 = qVarArr2[i10];
            ma.f fVarV0 = ma.f.v0(jArr2[i], 0, qVar);
            if (qVar2.f44150c > qVar.f44150c) {
                arrayList.add(fVarV0);
                arrayList.add(fVarV0.x0(qVar2.f44150c - r0));
            } else {
                arrayList.add(fVarV0.x0(r3 - r0));
                arrayList.add(fVarV0);
            }
            i = i10;
        }
        this.f45838e = (ma.f[]) arrayList.toArray(new ma.f[arrayList.size()]);
    }

    private Object writeReplace() {
        return new a((byte) 1, this);
    }

    @Override // ra.f
    public final q a(ma.d dVar) {
        long j4 = dVar.f44091b;
        int length = this.f45840g.length;
        q[] qVarArr = this.f45839f;
        long[] jArr = this.f45837d;
        if (length <= 0 || (jArr.length != 0 && j4 <= jArr[jArr.length - 1])) {
            int iBinarySearch = Arrays.binarySearch(jArr, j4);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return qVarArr[iBinarySearch + 1];
        }
        d[] dVarArrE = e(ma.e.D0(com.google.gson.internal.c.o(qVarArr[qVarArr.length - 1].f44150c + j4, 86400L)).f44097c);
        d dVar2 = null;
        for (int i = 0; i < dVarArrE.length; i++) {
            dVar2 = dVarArrE[i];
            ma.f fVar = dVar2.f45848b;
            q qVar = dVar2.f45849c;
            if (j4 < fVar.m0(qVar)) {
                return qVar;
            }
        }
        return dVar2.f45850d;
    }

    @Override // ra.f
    public final d b(ma.f fVar) {
        Object objF = f(fVar);
        if (objF instanceof d) {
            return (d) objF;
        }
        return null;
    }

    @Override // ra.f
    public final List<q> c(ma.f fVar) {
        Object objF = f(fVar);
        if (!(objF instanceof d)) {
            return Collections.singletonList((q) objF);
        }
        d dVar = (d) objF;
        q qVar = dVar.f45850d;
        int i = qVar.f44150c;
        q qVar2 = dVar.f45849c;
        return i > qVar2.f44150c ? Collections.EMPTY_LIST : Arrays.asList(qVar2, qVar);
    }

    @Override // ra.f
    public final boolean d(ma.f fVar, q qVar) {
        return c(fVar).contains(qVar);
    }

    public final d[] e(int i) {
        ma.e eVarS0;
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = this.f45841h;
        d[] dVarArr = (d[]) concurrentHashMap.get(numValueOf);
        if (dVarArr != null) {
            return dVarArr;
        }
        e[] eVarArr = this.f45840g;
        d[] dVarArr2 = new d[eVarArr.length];
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            e eVar = eVarArr[i10];
            ma.b bVar = eVar.f45853d;
            ma.h hVar = eVar.f45851b;
            byte b10 = eVar.f45852c;
            if (b10 < 0) {
                long j4 = i;
                l.f44466d.getClass();
                int length = hVar.length(l.m(j4)) + 1 + b10;
                ma.e eVar2 = ma.e.f44095f;
                qa.a.YEAR.checkValidValue(j4);
                qa.a.DAY_OF_MONTH.checkValidValue(length);
                eVarS0 = ma.e.s0(i, hVar, length);
                if (bVar != null) {
                    eVarS0 = eVarS0.e(new qa.g(1, bVar));
                }
            } else {
                ma.e eVar3 = ma.e.f44095f;
                qa.a.YEAR.checkValidValue(i);
                com.google.gson.internal.c.v(hVar, "month");
                qa.a.DAY_OF_MONTH.checkValidValue(b10);
                eVarS0 = ma.e.s0(i, hVar, b10);
                if (bVar != null) {
                    eVarS0 = eVarS0.e(new qa.g(0, bVar));
                }
            }
            ma.f fVarU0 = ma.f.u0(eVarS0.F0(eVar.f45855f), eVar.f45854e);
            q qVar = eVar.f45857h;
            q qVar2 = eVar.i;
            dVarArr2[i10] = new d(eVar.f45856g.createDateTime(fVarU0, qVar, qVar2), qVar2, eVar.f45858j);
        }
        if (i < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, dVarArr2);
        }
        return dVarArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return (obj instanceof f.a) && g() && a(ma.d.f44090d).equals(((f.a) obj).f45860b);
        }
        b bVar = (b) obj;
        return Arrays.equals(this.f45835b, bVar.f45835b) && Arrays.equals(this.f45836c, bVar.f45836c) && Arrays.equals(this.f45837d, bVar.f45837d) && Arrays.equals(this.f45839f, bVar.f45839f) && Arrays.equals(this.f45840g, bVar.f45840g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r14.f44105d.t0() <= r0.f44105d.t0()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r14.r0(r0) > 0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(ma.f r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.b.f(ma.f):java.lang.Object");
    }

    public final boolean g() {
        return this.f45837d.length == 0 && this.f45840g.length == 0 && this.f45839f[0].equals(this.f45836c[0]);
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f45835b) ^ Arrays.hashCode(this.f45836c)) ^ Arrays.hashCode(this.f45837d)) ^ Arrays.hashCode(this.f45839f)) ^ Arrays.hashCode(this.f45840g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StandardZoneRules[currentStandardOffset=");
        sb.append(this.f45836c[r1.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
