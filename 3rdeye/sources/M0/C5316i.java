package m0;

import c9.C2088i;
import com.applovin.impl.sdk.utils.JsonUtils;
import g0.C4356c;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.l;
import n0.C5346a;

/* compiled from: SimpleArrayMap.kt */
/* renamed from: m0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5316i<K, V> {

    /* renamed from: b, reason: collision with root package name */
    public int[] f44028b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f44029c;

    /* renamed from: d, reason: collision with root package name */
    public int f44030d;

    public C5316i() {
        this(0);
    }

    public final int a(V v10) {
        int i = this.f44030d * 2;
        Object[] objArr = this.f44029c;
        if (v10 == null) {
            for (int i10 = 1; i10 < i; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i; i11 += 2) {
            if (v10.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void c(int i) {
        int i10 = this.f44030d;
        int[] iArr = this.f44028b;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            l.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f44028b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f44029c, i * 2);
            l.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f44029c = objArrCopyOf;
        }
        if (this.f44030d != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f44030d > 0) {
            this.f44028b = C5346a.f44190a;
            this.f44029c = C5346a.f44192c;
            this.f44030d = 0;
        }
        if (this.f44030d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k10) {
        return e(k10) >= 0;
    }

    public boolean containsValue(V v10) {
        return a(v10) >= 0;
    }

    public final int d(int i, Object obj) {
        int i10 = this.f44030d;
        if (i10 == 0) {
            return -1;
        }
        int iA = C5346a.a(i10, i, this.f44028b);
        if (iA < 0 || l.b(obj, this.f44029c[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f44028b[i11] == i) {
            if (l.b(obj, this.f44029c[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f44028b[i12] == i; i12--) {
            if (l.b(obj, this.f44029c[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int e(K k10) {
        return k10 == null ? f() : d(k10.hashCode(), k10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C5316i) {
                int i = this.f44030d;
                if (i != ((C5316i) obj).f44030d) {
                    return false;
                }
                C5316i c5316i = (C5316i) obj;
                for (int i10 = 0; i10 < i; i10++) {
                    K kG = g(i10);
                    V vL = l(i10);
                    Object obj2 = c5316i.get(kG);
                    if (vL == null) {
                        if (obj2 != null || !c5316i.containsKey(kG)) {
                            return false;
                        }
                    } else if (!vL.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f44030d != ((Map) obj).size()) {
                return false;
            }
            int i11 = this.f44030d;
            for (int i12 = 0; i12 < i11; i12++) {
                K kG2 = g(i12);
                V vL2 = l(i12);
                Object obj3 = ((Map) obj).get(kG2);
                if (vL2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kG2)) {
                        return false;
                    }
                } else if (!vL2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i = this.f44030d;
        if (i == 0) {
            return -1;
        }
        int iA = C5346a.a(i, 0, this.f44028b);
        if (iA < 0 || this.f44029c[iA << 1] == null) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i && this.f44028b[i10] == 0) {
            if (this.f44029c[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f44028b[i11] == 0; i11--) {
            if (this.f44029c[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final K g(int i) {
        if (i < 0 || i >= this.f44030d) {
            throw new IllegalArgumentException(C4356c.h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return (K) this.f44029c[i << 1];
    }

    public V get(K k10) {
        int iE = e(k10);
        if (iE >= 0) {
            return (V) this.f44029c[(iE << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V getOrDefault(Object obj, V v10) {
        int iE = e(obj);
        return iE >= 0 ? (V) this.f44029c[(iE << 1) + 1] : v10;
    }

    public void h(C5316i<? extends K, ? extends V> map) {
        l.f(map, "map");
        int i = map.f44030d;
        c(this.f44030d + i);
        if (this.f44030d != 0) {
            for (int i10 = 0; i10 < i; i10++) {
                put(map.g(i10), map.l(i10));
            }
        } else if (i > 0) {
            C2088i.c(0, 0, i, map.f44028b, this.f44028b);
            C2088i.e(map.f44029c, 0, this.f44029c, 0, i << 1);
            this.f44030d = i;
        }
    }

    public int hashCode() {
        int[] iArr = this.f44028b;
        Object[] objArr = this.f44029c;
        int i = this.f44030d;
        int i10 = 1;
        int i11 = 0;
        int iHashCode = 0;
        while (i11 < i) {
            Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f44030d <= 0;
    }

    public V j(int i) {
        int i10;
        if (i < 0 || i >= (i10 = this.f44030d)) {
            throw new IllegalArgumentException(C4356c.h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f44029c;
        int i11 = i << 1;
        V v10 = (V) objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return v10;
        }
        int i12 = i10 - 1;
        int[] iArr = this.f44028b;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i < i12) {
                int i13 = i + 1;
                C2088i.c(i, i13, i10, iArr, iArr);
                Object[] objArr2 = this.f44029c;
                C2088i.e(objArr2, i11, objArr2, i13 << 1, i10 << 1);
            }
            Object[] objArr3 = this.f44029c;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i15);
            l.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f44028b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f44029c, i15 << 1);
            l.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f44029c = objArrCopyOf;
            if (i10 != this.f44030d) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                C2088i.c(0, 0, i, iArr, this.f44028b);
                C2088i.e(objArr, 0, this.f44029c, 0, i11);
            }
            if (i < i12) {
                int i16 = i + 1;
                C2088i.c(i, i16, i10, iArr, this.f44028b);
                C2088i.e(objArr, i11, this.f44029c, i16 << 1, i10 << 1);
            }
        }
        if (i10 != this.f44030d) {
            throw new ConcurrentModificationException();
        }
        this.f44030d = i12;
        return v10;
    }

    public V k(int i, V v10) {
        if (i < 0 || i >= this.f44030d) {
            throw new IllegalArgumentException(C4356c.h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i10 = (i << 1) + 1;
        Object[] objArr = this.f44029c;
        V v11 = (V) objArr[i10];
        objArr[i10] = v10;
        return v11;
    }

    public final V l(int i) {
        if (i < 0 || i >= this.f44030d) {
            throw new IllegalArgumentException(C4356c.h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return (V) this.f44029c[(i << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i = this.f44030d;
        int iHashCode = k10 != null ? k10.hashCode() : 0;
        int iD = k10 != null ? d(iHashCode, k10) : f();
        if (iD >= 0) {
            int i10 = (iD << 1) + 1;
            Object[] objArr = this.f44029c;
            V v11 = (V) objArr[i10];
            objArr[i10] = v10;
            return v11;
        }
        int i11 = ~iD;
        int[] iArr = this.f44028b;
        if (i >= iArr.length) {
            int i12 = 8;
            if (i >= 8) {
                i12 = (i >> 1) + i;
            } else if (i < 4) {
                i12 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            l.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f44028b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f44029c, i12 << 1);
            l.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f44029c = objArrCopyOf;
            if (i != this.f44030d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i) {
            int[] iArr2 = this.f44028b;
            int i13 = i11 + 1;
            C2088i.c(i13, i11, i, iArr2, iArr2);
            Object[] objArr2 = this.f44029c;
            C2088i.e(objArr2, i13 << 1, objArr2, i11 << 1, this.f44030d << 1);
        }
        int i14 = this.f44030d;
        if (i == i14) {
            int[] iArr3 = this.f44028b;
            if (i11 < iArr3.length) {
                iArr3[i11] = iHashCode;
                Object[] objArr3 = this.f44029c;
                int i15 = i11 << 1;
                objArr3[i15] = k10;
                objArr3[i15 + 1] = v10;
                this.f44030d = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(K k10) {
        int iE = e(k10);
        if (iE >= 0) {
            return j(iE);
        }
        return null;
    }

    public final V replace(K k10, V v10) {
        int iE = e(k10);
        if (iE >= 0) {
            return k(iE, v10);
        }
        return null;
    }

    public final int size() {
        return this.f44030d;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f44030d * 28);
        sb.append('{');
        int i = this.f44030d;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            K kG = g(i10);
            if (kG != sb) {
                sb.append(kG);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vL = l(i10);
            if (vL != sb) {
                sb.append(vL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        l.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public C5316i(int i) {
        this.f44028b = i == 0 ? C5346a.f44190a : new int[i];
        this.f44029c = i == 0 ? C5346a.f44192c : new Object[i << 1];
    }

    public final boolean remove(K k10, V v10) {
        int iE = e(k10);
        if (iE < 0 || !l.b(v10, l(iE))) {
            return false;
        }
        j(iE);
        return true;
    }

    public final boolean replace(K k10, V v10, V v11) {
        int iE = e(k10);
        if (iE < 0 || !l.b(v10, l(iE))) {
            return false;
        }
        k(iE, v11);
        return true;
    }

    public C5316i(C5316i<? extends K, ? extends V> c5316i) {
        this(0);
        if (c5316i != null) {
            h(c5316i);
        }
    }
}
