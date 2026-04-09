package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4351g implements InterfaceC4402m, InterfaceC4449s, Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final SortedMap f35225a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f35226b;

    public C4351g() {
        this.f35225a = new TreeMap();
        this.f35226b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4402m
    public final boolean b(String str) {
        return "length".equals(str) || this.f35226b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s e(String str, Z2 z22, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? H.d(str, this, z22, list) : AbstractC4426p.a(this, new C4465u(str), z22, list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4351g)) {
            return false;
        }
        C4351g c4351g = (C4351g) obj;
        if (m() != c4351g.m()) {
            return false;
        }
        if (this.f35225a.isEmpty()) {
            return c4351g.f35225a.isEmpty();
        }
        for (int iIntValue = ((Integer) this.f35225a.firstKey()).intValue(); iIntValue <= ((Integer) this.f35225a.lastKey()).intValue(); iIntValue++) {
            if (!i(iIntValue).equals(c4351g.i(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4402m
    public final void f(String str, InterfaceC4449s interfaceC4449s) {
        if (interfaceC4449s == null) {
            this.f35226b.remove(str);
        } else {
            this.f35226b.put(str, interfaceC4449s);
        }
    }

    public final int g() {
        return this.f35225a.size();
    }

    public final int hashCode() {
        return this.f35225a.hashCode() * 31;
    }

    public final InterfaceC4449s i(int i10) {
        InterfaceC4449s interfaceC4449s;
        if (i10 < m()) {
            return (!u(i10) || (interfaceC4449s = (InterfaceC4449s) this.f35225a.get(Integer.valueOf(i10))) == null) ? InterfaceC4449s.f35450e0 : interfaceC4449s;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C4369i(this);
    }

    public final void j(int i10, InterfaceC4449s interfaceC4449s) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i10);
        }
        if (i10 >= m()) {
            s(i10, interfaceC4449s);
            return;
        }
        for (int iIntValue = ((Integer) this.f35225a.lastKey()).intValue(); iIntValue >= i10; iIntValue--) {
            InterfaceC4449s interfaceC4449s2 = (InterfaceC4449s) this.f35225a.get(Integer.valueOf(iIntValue));
            if (interfaceC4449s2 != null) {
                s(iIntValue + 1, interfaceC4449s2);
                this.f35225a.remove(Integer.valueOf(iIntValue));
            }
        }
        s(i10, interfaceC4449s);
    }

    public final void k(InterfaceC4449s interfaceC4449s) {
        s(m(), interfaceC4449s);
    }

    public final int m() {
        if (this.f35225a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f35225a.lastKey()).intValue() + 1;
    }

    public final String o(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.f35225a.isEmpty()) {
            for (int i10 = 0; i10 < m(); i10++) {
                InterfaceC4449s interfaceC4449sI = i(i10);
                sb2.append(str);
                if (!(interfaceC4449sI instanceof C4505z) && !(interfaceC4449sI instanceof C4434q)) {
                    sb2.append(interfaceC4449sI.zzf());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    public final void q(int i10) {
        int iIntValue = ((Integer) this.f35225a.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        this.f35225a.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            if (this.f35225a.containsKey(Integer.valueOf(i11)) || i11 < 0) {
                return;
            }
            this.f35225a.put(Integer.valueOf(i11), InterfaceC4449s.f35450e0);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) this.f35225a.lastKey()).intValue()) {
                return;
            }
            InterfaceC4449s interfaceC4449s = (InterfaceC4449s) this.f35225a.get(Integer.valueOf(i10));
            if (interfaceC4449s != null) {
                this.f35225a.put(Integer.valueOf(i10 - 1), interfaceC4449s);
                this.f35225a.remove(Integer.valueOf(i10));
            }
        }
    }

    public final void s(int i10, InterfaceC4449s interfaceC4449s) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i10);
        }
        if (interfaceC4449s == null) {
            this.f35225a.remove(Integer.valueOf(i10));
        } else {
            this.f35225a.put(Integer.valueOf(i10), interfaceC4449s);
        }
    }

    public final String toString() {
        return o(",");
    }

    public final boolean u(int i10) {
        if (i10 >= 0 && i10 <= ((Integer) this.f35225a.lastKey()).intValue()) {
            return this.f35225a.containsKey(Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i10);
    }

    public final Iterator v() {
        return this.f35225a.keySet().iterator();
    }

    public final List w() {
        ArrayList arrayList = new ArrayList(m());
        for (int i10 = 0; i10 < m(); i10++) {
            arrayList.add(i(i10));
        }
        return arrayList;
    }

    public final void x() {
        this.f35225a.clear();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4402m
    public final InterfaceC4449s zza(String str) {
        InterfaceC4449s interfaceC4449s;
        return "length".equals(str) ? new C4386k(Double.valueOf(m())) : (!b(str) || (interfaceC4449s = (InterfaceC4449s) this.f35226b.get(str)) == null) ? InterfaceC4449s.f35450e0 : interfaceC4449s;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s zzc() {
        C4351g c4351g = new C4351g();
        for (Map.Entry entry : this.f35225a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC4402m) {
                c4351g.f35225a.put((Integer) entry.getKey(), (InterfaceC4449s) entry.getValue());
            } else {
                c4351g.f35225a.put((Integer) entry.getKey(), ((InterfaceC4449s) entry.getValue()).zzc());
            }
        }
        return c4351g;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Double zze() {
        return this.f35225a.size() == 1 ? i(0).zze() : this.f35225a.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final String zzf() {
        return toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Iterator zzh() {
        return new C4342f(this, this.f35225a.keySet().iterator(), this.f35226b.keySet().iterator());
    }

    public C4351g(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                s(i10, (InterfaceC4449s) list.get(i10));
            }
        }
    }

    public C4351g(InterfaceC4449s... interfaceC4449sArr) {
        this(Arrays.asList(interfaceC4449sArr));
    }
}
