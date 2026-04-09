package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class AB extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f6946j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient Object f6947a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f6948b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f6949c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f6950d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f6951e = Math.min(Math.max(3, 1), 1073741823);

    /* renamed from: f, reason: collision with root package name */
    public transient int f6952f;

    /* renamed from: g, reason: collision with root package name */
    public transient C2165yB f6953g;

    /* renamed from: h, reason: collision with root package name */
    public transient C2165yB f6954h;
    public transient C1841sB i;

    public AB() {
    }

    public final int[] a() {
        int[] iArr = this.f6948b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.f6949c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.f6950d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (d()) {
            return;
        }
        this.f6951e += 32;
        Map mapE = e();
        if (mapE != null) {
            this.f6951e = Math.min(Math.max(size(), 3), 1073741823);
            mapE.clear();
            this.f6947a = null;
            this.f6952f = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f6952f, (Object) null);
        Arrays.fill(c(), 0, this.f6952f, (Object) null);
        Object obj = this.f6947a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f6952f, 0);
        this.f6952f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapE = e();
        return mapE != null ? mapE.containsKey(obj) : i(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapE = e();
        if (mapE != null) {
            return mapE.containsValue(obj);
        }
        for (int i = 0; i < this.f6952f; i++) {
            if (Objects.equals(obj, c()[i])) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        return this.f6947a == null;
    }

    public final Map e() {
        Object obj = this.f6947a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C2165yB c2165yB = this.f6954h;
        if (c2165yB != null) {
            return c2165yB;
        }
        C2165yB c2165yB2 = new C2165yB(this, 0);
        this.f6954h = c2165yB2;
        return c2165yB2;
    }

    public final void f(int i, int i3) {
        Object obj = this.f6947a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i6 = size - 1;
        if (i >= i6) {
            objArrB[i] = null;
            objArrC[i] = null;
            iArrA[i] = 0;
            return;
        }
        int i7 = i + 1;
        Object obj2 = objArrB[i6];
        objArrB[i] = obj2;
        objArrC[i] = objArrC[i6];
        objArrB[i6] = null;
        objArrC[i6] = null;
        iArrA[i] = iArrA[i6];
        iArrA[i6] = 0;
        int iR = AbstractC1984ut.r(obj2) & i3;
        int iR2 = AbstractC0582Jp.r(iR, obj);
        if (iR2 == size) {
            AbstractC0582Jp.I(iR, i7, obj);
            return;
        }
        while (true) {
            int i8 = iR2 - 1;
            int i9 = iArrA[i8];
            int i10 = i9 & i3;
            if (i10 == size) {
                iArrA[i8] = (i9 & (~i3)) | (i3 & i7);
                return;
            }
            iR2 = i10;
        }
    }

    public final int g() {
        return (1 << (this.f6951e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapE = e();
        if (mapE != null) {
            return mapE.get(obj);
        }
        int i = i(obj);
        if (i == -1) {
            return null;
        }
        return c()[i];
    }

    public final int h(int i, int i3, int i6, int i7) {
        int i8 = i3 - 1;
        Object objC = AbstractC0582Jp.c(i3);
        if (i7 != 0) {
            AbstractC0582Jp.I(i6 & i8, i7 + 1, objC);
        }
        Object obj = this.f6947a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i9 = 0; i9 <= i; i9++) {
            int iR = AbstractC0582Jp.r(i9, obj);
            while (iR != 0) {
                int i10 = iR - 1;
                int i11 = iArrA[i10];
                int i12 = ((~i) & i11) | i9;
                int i13 = i12 & i8;
                int iR2 = AbstractC0582Jp.r(i13, objC);
                AbstractC0582Jp.I(i13, iR, objC);
                iArrA[i10] = ((~i8) & i12) | (iR2 & i8);
                iR = i11 & i;
            }
        }
        this.f6947a = objC;
        this.f6951e = ((32 - Integer.numberOfLeadingZeros(i8)) & 31) | (this.f6951e & (-32));
        return i8;
    }

    public final int i(Object obj) {
        if (d()) {
            return -1;
        }
        int iR = AbstractC1984ut.r(obj);
        int iG = g();
        Object obj2 = this.f6947a;
        Objects.requireNonNull(obj2);
        int iR2 = AbstractC0582Jp.r(iR & iG, obj2);
        if (iR2 != 0) {
            int i = ~iG;
            int i3 = iR & i;
            do {
                int i6 = iR2 - 1;
                int i7 = a()[i6];
                if ((i7 & i) == i3 && Objects.equals(obj, b()[i6])) {
                    return i6;
                }
                iR2 = i7 & iG;
            } while (iR2 != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(Object obj) {
        if (!d()) {
            int iG = g();
            Object obj2 = this.f6947a;
            Objects.requireNonNull(obj2);
            int iT = AbstractC0582Jp.T(obj, null, iG, obj2, a(), b(), null);
            if (iT != -1) {
                Object obj3 = c()[iT];
                f(iT, iG);
                this.f6952f--;
                this.f6951e += 32;
                return obj3;
            }
        }
        return f6946j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C2165yB c2165yB = this.f6953g;
        if (c2165yB != null) {
            return c2165yB;
        }
        C2165yB c2165yB2 = new C2165yB(this, 1);
        this.f6953g = c2165yB2;
        return c2165yB2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i3 = 32;
        if (d()) {
            AbstractC0582Jp.i0("Arrays already allocated", d());
            int i6 = this.f6951e;
            int iMax = Math.max(i6 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f6947a = AbstractC0582Jp.c(iMax2);
            this.f6951e = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f6951e & (-32));
            this.f6948b = new int[i6];
            this.f6949c = new Object[i6];
            this.f6950d = new Object[i6];
        }
        Map mapE = e();
        if (mapE != null) {
            return mapE.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i7 = this.f6952f;
        int i8 = i7 + 1;
        int iR = AbstractC1984ut.r(obj);
        int iG = g();
        int i9 = iR & iG;
        Object obj3 = this.f6947a;
        Objects.requireNonNull(obj3);
        int iR2 = AbstractC0582Jp.r(i9, obj3);
        if (iR2 == 0) {
            if (i8 > iG) {
                iG = h(iG, (iG + 1) * (iG < 32 ? 4 : 2), iR, i7);
            } else {
                Object obj4 = this.f6947a;
                Objects.requireNonNull(obj4);
                AbstractC0582Jp.I(i9, i8, obj4);
            }
            i = 1;
        } else {
            int i10 = ~iG;
            int i11 = iR & i10;
            int i12 = 0;
            while (true) {
                int i13 = iR2 - 1;
                int i14 = iArrA[i13];
                i = 1;
                int i15 = i14 & i10;
                int i16 = i3;
                if (i15 == i11 && Objects.equals(obj, objArrB[i13])) {
                    Object obj5 = objArrC[i13];
                    objArrC[i13] = obj2;
                    return obj5;
                }
                int i17 = i14 & iG;
                int i18 = i12 + 1;
                if (i17 != 0) {
                    i12 = i18;
                    iR2 = i17;
                    i3 = i16;
                } else {
                    if (i18 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(g() + 1, 1.0f);
                        int i19 = isEmpty() ? -1 : 0;
                        while (i19 >= 0) {
                            linkedHashMap.put(b()[i19], c()[i19]);
                            int i20 = i19 + 1;
                            i19 = i20 < this.f6952f ? i20 : -1;
                        }
                        this.f6947a = linkedHashMap;
                        this.f6948b = null;
                        this.f6949c = null;
                        this.f6950d = null;
                        this.f6951e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i8 > iG) {
                        iG = h(iG, (iG + 1) * (iG < i16 ? 4 : 2), iR, i7);
                    } else {
                        iArrA[i13] = (i8 & iG) | i15;
                    }
                }
            }
        }
        int length = a().length;
        if (i8 > length) {
            int i21 = i;
            int iMin = Math.min(1073741823, (Math.max(i21, length >>> 1) + length) | i21);
            if (iMin != length) {
                this.f6948b = Arrays.copyOf(a(), iMin);
                this.f6949c = Arrays.copyOf(b(), iMin);
                this.f6950d = Arrays.copyOf(c(), iMin);
            }
        }
        a()[i7] = (~iG) & iR;
        b()[i7] = obj;
        c()[i7] = obj2;
        this.f6952f = i8;
        this.f6951e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapE = e();
        if (mapE != null) {
            return mapE.remove(obj);
        }
        Object objJ = j(obj);
        if (objJ == f6946j) {
            return null;
        }
        return objJ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapE = e();
        return mapE != null ? mapE.size() : this.f6952f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C1841sB c1841sB = this.i;
        if (c1841sB != null) {
            return c1841sB;
        }
        C1841sB c1841sB2 = new C1841sB(1, this);
        this.i = c1841sB2;
        return c1841sB2;
    }

    public AB(int i) {
    }
}
