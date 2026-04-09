package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m41 extends AbstractMap implements Serializable {
    public static final Object j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient Object f13754a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f13755b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f13756c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f13757d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f13758e = Math.min(Math.max(3, 1), 1073741823);

    /* renamed from: f, reason: collision with root package name */
    public transient int f13759f;
    public transient k41 g;

    /* renamed from: h, reason: collision with root package name */
    public transient k41 f13760h;

    /* renamed from: i, reason: collision with root package name */
    public transient e41 f13761i;

    public m41() {
    }

    public final int[] a() {
        int[] iArr = this.f13755b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.f13756c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.f13757d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (d()) {
            return;
        }
        this.f13758e += 32;
        Map mapE = e();
        if (mapE != null) {
            this.f13758e = Math.min(Math.max(size(), 3), 1073741823);
            mapE.clear();
            this.f13754a = null;
            this.f13759f = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f13759f, (Object) null);
        Arrays.fill(c(), 0, this.f13759f, (Object) null);
        Object obj = this.f13754a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f13759f, 0);
        this.f13759f = 0;
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
        for (int i4 = 0; i4 < this.f13759f; i4++) {
            if (Objects.equals(obj, c()[i4])) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        return this.f13754a == null;
    }

    public final Map e() {
        Object obj = this.f13754a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        k41 k41Var = this.f13760h;
        if (k41Var != null) {
            return k41Var;
        }
        k41 k41Var2 = new k41(this, 0);
        this.f13760h = k41Var2;
        return k41Var2;
    }

    public final void f(int i4, int i10) {
        Object obj = this.f13754a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i11 = size - 1;
        if (i4 >= i11) {
            objArrB[i4] = null;
            objArrC[i4] = null;
            iArrA[i4] = 0;
            return;
        }
        int i12 = i4 + 1;
        Object obj2 = objArrB[i11];
        objArrB[i4] = obj2;
        objArrC[i4] = objArrC[i11];
        objArrB[i11] = null;
        objArrC[i11] = null;
        iArrA[i4] = iArrA[i11];
        iArrA[i11] = 0;
        int iR = yo0.r(obj2) & i10;
        int iR2 = mq0.r(iR, obj);
        if (iR2 == size) {
            mq0.H(iR, i12, obj);
            return;
        }
        while (true) {
            int i13 = iR2 - 1;
            int i14 = iArrA[i13];
            int i15 = i14 & i10;
            if (i15 == size) {
                iArrA[i13] = (i14 & (~i10)) | (i10 & i12);
                return;
            }
            iR2 = i15;
        }
    }

    public final int g() {
        return (1 << (this.f13758e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapE = e();
        if (mapE != null) {
            return mapE.get(obj);
        }
        int i4 = i(obj);
        if (i4 == -1) {
            return null;
        }
        return c()[i4];
    }

    public final int h(int i4, int i10, int i11, int i12) {
        int i13 = i10 - 1;
        Object objC = mq0.c(i10);
        if (i12 != 0) {
            mq0.H(i11 & i13, i12 + 1, objC);
        }
        Object obj = this.f13754a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i14 = 0; i14 <= i4; i14++) {
            int iR = mq0.r(i14, obj);
            while (iR != 0) {
                int i15 = iR - 1;
                int i16 = iArrA[i15];
                int i17 = ((~i4) & i16) | i14;
                int i18 = i17 & i13;
                int iR2 = mq0.r(i18, objC);
                mq0.H(i18, iR, objC);
                iArrA[i15] = ((~i13) & i17) | (iR2 & i13);
                iR = i16 & i4;
            }
        }
        this.f13754a = objC;
        this.f13758e = ((32 - Integer.numberOfLeadingZeros(i13)) & 31) | (this.f13758e & (-32));
        return i13;
    }

    public final int i(Object obj) {
        if (d()) {
            return -1;
        }
        int iR = yo0.r(obj);
        int iG = g();
        Object obj2 = this.f13754a;
        Objects.requireNonNull(obj2);
        int iR2 = mq0.r(iR & iG, obj2);
        if (iR2 != 0) {
            int i4 = ~iG;
            int i10 = iR & i4;
            do {
                int i11 = iR2 - 1;
                int i12 = a()[i11];
                if ((i12 & i4) == i10 && Objects.equals(obj, b()[i11])) {
                    return i11;
                }
                iR2 = i12 & iG;
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
            Object obj2 = this.f13754a;
            Objects.requireNonNull(obj2);
            int iS = mq0.S(obj, null, iG, obj2, a(), b(), null);
            if (iS != -1) {
                Object obj3 = c()[iS];
                f(iS, iG);
                this.f13759f--;
                this.f13758e += 32;
                return obj3;
            }
        }
        return j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        k41 k41Var = this.g;
        if (k41Var != null) {
            return k41Var;
        }
        k41 k41Var2 = new k41(this, 1);
        this.g = k41Var2;
        return k41Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i4;
        int i10 = 32;
        if (d()) {
            mq0.d0("Arrays already allocated", d());
            int i11 = this.f13758e;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f13754a = mq0.c(iMax2);
            this.f13758e = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f13758e & (-32));
            this.f13755b = new int[i11];
            this.f13756c = new Object[i11];
            this.f13757d = new Object[i11];
        }
        Map mapE = e();
        if (mapE != null) {
            return mapE.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i12 = this.f13759f;
        int i13 = i12 + 1;
        int iR = yo0.r(obj);
        int iG = g();
        int i14 = iR & iG;
        Object obj3 = this.f13754a;
        Objects.requireNonNull(obj3);
        int iR2 = mq0.r(i14, obj3);
        if (iR2 == 0) {
            if (i13 > iG) {
                iG = h(iG, (iG + 1) * (iG < 32 ? 4 : 2), iR, i12);
            } else {
                Object obj4 = this.f13754a;
                Objects.requireNonNull(obj4);
                mq0.H(i14, i13, obj4);
            }
            i4 = 1;
        } else {
            int i15 = ~iG;
            int i16 = iR & i15;
            int i17 = 0;
            while (true) {
                int i18 = iR2 - 1;
                int i19 = iArrA[i18];
                i4 = 1;
                int i20 = i19 & i15;
                int i21 = i10;
                if (i20 == i16 && Objects.equals(obj, objArrB[i18])) {
                    Object obj5 = objArrC[i18];
                    objArrC[i18] = obj2;
                    return obj5;
                }
                int i22 = i19 & iG;
                int i23 = i17 + 1;
                if (i22 != 0) {
                    i17 = i23;
                    iR2 = i22;
                    i10 = i21;
                } else {
                    if (i23 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(g() + 1, 1.0f);
                        int i24 = isEmpty() ? -1 : 0;
                        while (i24 >= 0) {
                            linkedHashMap.put(b()[i24], c()[i24]);
                            int i25 = i24 + 1;
                            i24 = i25 < this.f13759f ? i25 : -1;
                        }
                        this.f13754a = linkedHashMap;
                        this.f13755b = null;
                        this.f13756c = null;
                        this.f13757d = null;
                        this.f13758e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i13 > iG) {
                        iG = h(iG, (iG + 1) * (iG < i21 ? 4 : 2), iR, i12);
                    } else {
                        iArrA[i18] = (i13 & iG) | i20;
                    }
                }
            }
        }
        int length = a().length;
        if (i13 > length) {
            int i26 = i4;
            int iMin = Math.min(1073741823, (Math.max(i26, length >>> 1) + length) | i26);
            if (iMin != length) {
                this.f13755b = Arrays.copyOf(a(), iMin);
                this.f13756c = Arrays.copyOf(b(), iMin);
                this.f13757d = Arrays.copyOf(c(), iMin);
            }
        }
        a()[i12] = (~iG) & iR;
        b()[i12] = obj;
        c()[i12] = obj2;
        this.f13759f = i13;
        this.f13758e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapE = e();
        if (mapE != null) {
            return mapE.remove(obj);
        }
        Object objJ = j(obj);
        if (objJ == j) {
            return null;
        }
        return objJ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapE = e();
        return mapE != null ? mapE.size() : this.f13759f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        e41 e41Var = this.f13761i;
        if (e41Var != null) {
            return e41Var;
        }
        e41 e41Var2 = new e41(1, this);
        this.f13761i = e41Var2;
        return e41Var2;
    }

    public m41(int i4) {
    }
}
