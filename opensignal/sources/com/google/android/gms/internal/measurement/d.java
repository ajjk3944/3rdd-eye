package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class d implements Iterable, n, j {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f4945a;

    /* renamed from: d, reason: collision with root package name */
    public final TreeMap f4946d;

    public d() {
        this.f4945a = new TreeMap();
        this.f4946d = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return new c(this, this.f4945a.keySet().iterator(), this.f4946d.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double c() {
        TreeMap treeMap = this.f4945a;
        return treeMap.size() == 1 ? r(0).c() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n d(String str) {
        n nVar;
        return "length".equals(str) ? new g(Double.valueOf(p())) : (!j(str) || (nVar = (n) this.f4946d.get(str)) == null) ? n.f5129f : nVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void e(String str, n nVar) {
        TreeMap treeMap = this.f4946d;
        if (nVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, nVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (p() != dVar.p()) {
            return false;
        }
        TreeMap treeMap = this.f4945a;
        if (treeMap.isEmpty()) {
            return dVar.f4945a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!r(iIntValue).equals(dVar.r(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e5, code lost:
    
        if (xu.d.l0(r7, r2, (com.google.android.gms.internal.measurement.m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).p() == r7.p()) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0203  */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.n g(java.lang.String r38, kg.r r39, java.util.ArrayList r40) {
        /*
            Method dump skipped, instructions count: 2200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d.g(java.lang.String, kg.r, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final int hashCode() {
        return this.f4945a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(2, this);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean j(String str) {
        return "length".equals(str) || this.f4946d.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() {
        return v(",");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n m() {
        d dVar = new d();
        for (Map.Entry entry : this.f4945a.entrySet()) {
            boolean z10 = entry.getValue() instanceof j;
            TreeMap treeMap = dVar.f4945a;
            if (z10) {
                treeMap.put((Integer) entry.getKey(), (n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((n) entry.getValue()).m());
            }
        }
        return dVar;
    }

    public final List n() {
        ArrayList arrayList = new ArrayList(p());
        for (int i10 = 0; i10 < p(); i10++) {
            arrayList.add(r(i10));
        }
        return arrayList;
    }

    public final Iterator o() {
        return this.f4945a.keySet().iterator();
    }

    public final int p() {
        TreeMap treeMap = this.f4945a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final n r(int i10) {
        n nVar;
        if (i10 < p()) {
            return (!t(i10) || (nVar = (n) this.f4945a.get(Integer.valueOf(i10))) == null) ? n.f5129f : nVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void s(int i10, n nVar) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(c7.a.l(i10, "Out of bounds index: ", new StringBuilder(String.valueOf(i10).length() + 21)));
        }
        TreeMap treeMap = this.f4945a;
        if (nVar == null) {
            treeMap.remove(Integer.valueOf(i10));
        } else {
            treeMap.put(Integer.valueOf(i10), nVar);
        }
    }

    public final boolean t(int i10) {
        if (i10 >= 0) {
            TreeMap treeMap = this.f4945a;
            if (i10 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i10));
            }
        }
        throw new IndexOutOfBoundsException(c7.a.l(i10, "Out of bounds index: ", new StringBuilder(String.valueOf(i10).length() + 21)));
    }

    public final String toString() {
        return v(",");
    }

    public final void u(int i10) {
        TreeMap treeMap = this.f4945a;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            Integer numValueOf = Integer.valueOf(i11);
            if (treeMap.containsKey(numValueOf) || i11 < 0) {
                return;
            }
            treeMap.put(numValueOf, n.f5129f);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i10);
            n nVar = (n) treeMap.get(numValueOf2);
            if (nVar != null) {
                treeMap.put(Integer.valueOf(i10 - 1), nVar);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final String v(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f4945a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= p()) {
                    break;
                }
                n nVarR = r(i10);
                sb2.append(str2);
                if (!(nVarR instanceof r) && !(nVarR instanceof l)) {
                    sb2.append(nVarR.l());
                }
                i10++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    public d(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                s(i10, (n) list.get(i10));
            }
        }
    }
}
