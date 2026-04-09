package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d implements Iterable, n, j {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f19652a;

    /* renamed from: b, reason: collision with root package name */
    public final TreeMap f19653b;

    public d() {
        this.f19652a = new TreeMap();
        this.f19653b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n N1() {
        d dVar = new d();
        for (Map.Entry entry : this.f19652a.entrySet()) {
            boolean z3 = entry.getValue() instanceof j;
            TreeMap treeMap = dVar.f19652a;
            if (z3) {
                treeMap.put((Integer) entry.getKey(), (n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((n) entry.getValue()).N1());
            }
        }
        return dVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void a(String str, n nVar) {
        TreeMap treeMap = this.f19653b;
        if (nVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return new c(this, this.f19652a.keySet().iterator(), this.f19653b.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (m() != dVar.m()) {
            return false;
        }
        TreeMap treeMap = this.f19652a;
        if (treeMap.isEmpty()) {
            return dVar.f19652a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!o(iIntValue).equals(dVar.o(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double f() {
        TreeMap treeMap = this.f19652a;
        return treeMap.size() == 1 ? o(0).f() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n g(String str) {
        n nVar;
        return "length".equals(str) ? new g(Double.valueOf(m())) : (!j(str) || (nVar = (n) this.f19653b.get(str)) == null) ? n.J8 : nVar;
    }

    public final int hashCode() {
        return this.f19652a.hashCode() * 31;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e5, code lost:
    
        if (ci.b.G(r7, r2, (com.google.android.gms.internal.measurement.m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).m() == r7.m()) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0203  */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.n i(java.lang.String r38, a0.x0 r39, java.util.ArrayList r40) {
        /*
            Method dump skipped, instructions count: 2196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d.i(java.lang.String, a0.x0, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(2, this);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean j(String str) {
        return "length".equals(str) || this.f19653b.containsKey(str);
    }

    public final List k() {
        ArrayList arrayList = new ArrayList(m());
        for (int i4 = 0; i4 < m(); i4++) {
            arrayList.add(o(i4));
        }
        return arrayList;
    }

    public final Iterator l() {
        return this.f19652a.keySet().iterator();
    }

    public final int m() {
        TreeMap treeMap = this.f19652a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final n o(int i4) {
        n nVar;
        if (i4 < m()) {
            return (!q(i4) || (nVar = (n) this.f19652a.get(Integer.valueOf(i4))) == null) ? n.J8 : nVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void p(int i4, n nVar) {
        if (i4 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(d.h.q(i4, "Out of bounds index: ", new StringBuilder(String.valueOf(i4).length() + 21)));
        }
        TreeMap treeMap = this.f19652a;
        if (nVar == null) {
            treeMap.remove(Integer.valueOf(i4));
        } else {
            treeMap.put(Integer.valueOf(i4), nVar);
        }
    }

    public final boolean q(int i4) {
        if (i4 >= 0) {
            TreeMap treeMap = this.f19652a;
            if (i4 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i4));
            }
        }
        throw new IndexOutOfBoundsException(d.h.q(i4, "Out of bounds index: ", new StringBuilder(String.valueOf(i4).length() + 21)));
    }

    public final void r(int i4) {
        TreeMap treeMap = this.f19652a;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i4 > iIntValue || i4 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i4));
        if (i4 == iIntValue) {
            int i10 = i4 - 1;
            Integer numValueOf = Integer.valueOf(i10);
            if (treeMap.containsKey(numValueOf) || i10 < 0) {
                return;
            }
            treeMap.put(numValueOf, n.J8);
            return;
        }
        while (true) {
            i4++;
            if (i4 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i4);
            n nVar = (n) treeMap.get(numValueOf2);
            if (nVar != null) {
                treeMap.put(Integer.valueOf(i4 - 1), nVar);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final String s(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f19652a.isEmpty()) {
            int i4 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i4 >= m()) {
                    break;
                }
                n nVarO = o(i4);
                sb2.append(str2);
                if (!(nVarO instanceof r) && !(nVarO instanceof l)) {
                    sb2.append(nVarO.zzc());
                }
                i4++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    public final String toString() {
        return s(",");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzc() {
        return s(",");
    }

    public d(List list) {
        this();
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                p(i4, (n) list.get(i4));
            }
        }
    }
}
