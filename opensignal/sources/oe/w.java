package oe;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import lf.t1;

/* loaded from: classes.dex */
public final class w extends AbstractMap implements Serializable {
    public static final Object F = new Object();
    public transient u B;
    public transient u D;
    public transient p E;

    /* renamed from: a, reason: collision with root package name */
    public transient Object f19390a;

    /* renamed from: d, reason: collision with root package name */
    public transient int[] f19391d;

    /* renamed from: g, reason: collision with root package name */
    public transient Object[] f19392g;

    /* renamed from: r, reason: collision with root package name */
    public transient Object[] f19393r;

    /* renamed from: x, reason: collision with root package name */
    public transient int f19394x;

    /* renamed from: y, reason: collision with root package name */
    public transient int f19395y;

    public static w a() {
        w wVar = new w();
        wVar.f19394x = t1.i(3, 1);
        return wVar;
    }

    public static w b() {
        w wVar = new w();
        wVar.f19394x = t1.i(8, 1);
        return wVar;
    }

    public final Map c() {
        Object obj = this.f19390a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.f19394x += 32;
        Map mapC = c();
        if (mapC != null) {
            this.f19394x = t1.i(size(), 3);
            mapC.clear();
            this.f19390a = null;
            this.f19395y = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f19395y, (Object) null);
        Arrays.fill(k(), 0, this.f19395y, (Object) null);
        Object obj = this.f19390a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f19395y, 0);
        this.f19395y = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapC = c();
        return mapC != null ? mapC.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f19395y; i10++) {
            if (a.a.k(obj, k()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f19394x & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int iS = s.s(obj);
        int iD = d();
        Object obj2 = this.f19390a;
        Objects.requireNonNull(obj2);
        int iT = s.t(iS & iD, obj2);
        if (iT == 0) {
            return -1;
        }
        int i10 = ~iD;
        int i11 = iS & i10;
        do {
            int i12 = iT - 1;
            int i13 = i()[i12];
            if ((i13 & i10) == i11 && a.a.k(obj, j()[i12])) {
                return i12;
            }
            iT = i13 & iD;
        } while (iT != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        u uVar = this.D;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this, 0);
        this.D = uVar2;
        return uVar2;
    }

    public final void f(int i10, int i11) {
        Object obj = this.f19390a;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        Object[] objArrJ = j();
        Object[] objArrK = k();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrJ[i10] = null;
            objArrK[i10] = null;
            iArrI[i10] = 0;
            return;
        }
        Object obj2 = objArrJ[i12];
        objArrJ[i10] = obj2;
        objArrK[i10] = objArrK[i12];
        objArrJ[i12] = null;
        objArrK[i12] = null;
        iArrI[i10] = iArrI[i12];
        iArrI[i12] = 0;
        int iS = s.s(obj2) & i11;
        int iT = s.t(iS, obj);
        if (iT == size) {
            s.u(iS, i10 + 1, obj);
            return;
        }
        while (true) {
            int i13 = iT - 1;
            int i14 = iArrI[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArrI[i13] = s.m(i14, i10 + 1, i11);
                return;
            }
            iT = i15;
        }
    }

    public final boolean g() {
        return this.f19390a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return k()[iE];
    }

    public final Object h(Object obj) {
        if (!g()) {
            int iD = d();
            Object obj2 = this.f19390a;
            Objects.requireNonNull(obj2);
            int iP = s.p(obj, null, iD, obj2, i(), j(), null);
            if (iP != -1) {
                Object obj3 = k()[iP];
                f(iP, iD);
                this.f19395y--;
                this.f19394x += 32;
                return obj3;
            }
        }
        return F;
    }

    public final int[] i() {
        int[] iArr = this.f19391d;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f19392g;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f19393r;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        u uVar = this.B;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this, 1);
        this.B = uVar2;
        return uVar2;
    }

    public final int l(int i10, int i11, int i12, int i13) {
        Object objD = s.d(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            s.u(i12 & i14, i13 + 1, objD);
        }
        Object obj = this.f19390a;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iT = s.t(i15, obj);
            while (iT != 0) {
                int i16 = iT - 1;
                int i17 = iArrI[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iT2 = s.t(i19, objD);
                s.u(i19, iT, objD);
                iArrI[i16] = s.m(i18, iT2, i14);
                iT = i17 & i10;
            }
        }
        this.f19390a = objD;
        this.f19394x = s.m(this.f19394x, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.w.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        Object objH = h(obj);
        if (objH == F) {
            return null;
        }
        return objH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapC = c();
        return mapC != null ? mapC.size() : this.f19395y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        p pVar = this.E;
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(1, this);
        this.E = pVar2;
        return pVar2;
    }
}
