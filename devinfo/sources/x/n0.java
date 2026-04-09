package x;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f36918a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f36919b;

    /* renamed from: c, reason: collision with root package name */
    public int f36920c;

    public n0(int i4) {
        this.f36918a = i4 == 0 ? y.a.f37284a : new int[i4];
        this.f36919b = i4 == 0 ? y.a.f37286c : new Object[i4 << 1];
    }

    public final int a(Object obj) {
        int i4 = this.f36920c * 2;
        Object[] objArr = this.f36919b;
        if (obj == null) {
            for (int i10 = 1; i10 < i4; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i4; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i4) {
        int i10 = this.f36920c;
        int[] iArr = this.f36918a;
        if (iArr.length < i4) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            nk.k.d(iArrCopyOf, "copyOf(...)");
            this.f36918a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f36919b, i4 * 2);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            this.f36919b = objArrCopyOf;
        }
        if (this.f36920c != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i4, Object obj) {
        int i10 = this.f36920c;
        if (i10 == 0) {
            return -1;
        }
        int iA = y.a.a(this.f36918a, i10, i4);
        if (iA < 0 || nk.k.a(obj, this.f36919b[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f36918a[i11] == i4) {
            if (nk.k.a(obj, this.f36919b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f36918a[i12] == i4; i12--) {
            if (nk.k.a(obj, this.f36919b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public void clear() {
        if (this.f36920c > 0) {
            this.f36918a = y.a.f37284a;
            this.f36919b = y.a.f37286c;
            this.f36920c = 0;
        }
        if (this.f36920c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i4 = this.f36920c;
        if (i4 == 0) {
            return -1;
        }
        int iA = y.a.a(this.f36918a, i4, 0);
        if (iA < 0 || this.f36919b[iA << 1] == null) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i4 && this.f36918a[i10] == 0) {
            if (this.f36919b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f36918a[i11] == 0; i11--) {
            if (this.f36919b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof n0) {
                int i4 = this.f36920c;
                if (i4 != ((n0) obj).f36920c) {
                    return false;
                }
                n0 n0Var = (n0) obj;
                for (int i10 = 0; i10 < i4; i10++) {
                    Object objF = f(i10);
                    Object objJ = j(i10);
                    Object obj2 = n0Var.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !n0Var.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f36920c != ((Map) obj).size()) {
                return false;
            }
            int i11 = this.f36920c;
            for (int i12 = 0; i12 < i11; i12++) {
                Object objF2 = f(i12);
                Object objJ2 = j(i12);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i4) {
        boolean z3 = false;
        if (i4 >= 0 && i4 < this.f36920c) {
            z3 = true;
        }
        if (z3) {
            return this.f36919b[i4 << 1];
        }
        y.a.c("Expected index to be within 0..size()-1, but was " + i4);
        throw null;
    }

    public void g(n0 n0Var) {
        int i4 = n0Var.f36920c;
        b(this.f36920c + i4);
        if (this.f36920c != 0) {
            for (int i10 = 0; i10 < i4; i10++) {
                put(n0Var.f(i10), n0Var.j(i10));
            }
        } else if (i4 > 0) {
            zj.m.M(0, 0, i4, n0Var.f36918a, this.f36918a);
            zj.m.N(0, 0, i4 << 1, n0Var.f36919b, this.f36919b);
            this.f36920c = i4;
        }
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f36919b[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f36919b[(iD << 1) + 1] : obj2;
    }

    public Object h(int i4) {
        int i10;
        if (i4 < 0 || i4 >= (i10 = this.f36920c)) {
            y.a.c("Expected index to be within 0..size()-1, but was " + i4);
            throw null;
        }
        Object[] objArr = this.f36919b;
        int i11 = i4 << 1;
        Object obj = objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i12 = i10 - 1;
        int[] iArr = this.f36918a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i4 < i12) {
                int i13 = i4 + 1;
                zj.m.M(i4, i13, i10, iArr, iArr);
                Object[] objArr2 = this.f36919b;
                zj.m.N(i11, i13 << 1, i10 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f36919b;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i15);
            nk.k.d(iArrCopyOf, "copyOf(...)");
            this.f36918a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f36919b, i15 << 1);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            this.f36919b = objArrCopyOf;
            if (i10 != this.f36920c) {
                throw new ConcurrentModificationException();
            }
            if (i4 > 0) {
                zj.m.M(0, 0, i4, iArr, this.f36918a);
                zj.m.N(0, 0, i11, objArr, this.f36919b);
            }
            if (i4 < i12) {
                int i16 = i4 + 1;
                zj.m.M(i4, i16, i10, iArr, this.f36918a);
                zj.m.N(i11, i16 << 1, i10 << 1, objArr, this.f36919b);
            }
        }
        if (i10 != this.f36920c) {
            throw new ConcurrentModificationException();
        }
        this.f36920c = i12;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f36918a;
        Object[] objArr = this.f36919b;
        int i4 = this.f36920c;
        int i10 = 1;
        int i11 = 0;
        int iHashCode = 0;
        while (i11 < i4) {
            Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return iHashCode;
    }

    public Object i(int i4, Object obj) {
        boolean z3 = false;
        if (i4 >= 0 && i4 < this.f36920c) {
            z3 = true;
        }
        if (!z3) {
            y.a.c("Expected index to be within 0..size()-1, but was " + i4);
            throw null;
        }
        int i10 = (i4 << 1) + 1;
        Object[] objArr = this.f36919b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f36920c <= 0;
    }

    public final Object j(int i4) {
        boolean z3 = false;
        if (i4 >= 0 && i4 < this.f36920c) {
            z3 = true;
        }
        if (z3) {
            return this.f36919b[(i4 << 1) + 1];
        }
        y.a.c("Expected index to be within 0..size()-1, but was " + i4);
        throw null;
    }

    public Object put(Object obj, Object obj2) {
        int i4 = this.f36920c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i10 = (iC << 1) + 1;
            Object[] objArr = this.f36919b;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~iC;
        int[] iArr = this.f36918a;
        if (i4 >= iArr.length) {
            int i12 = 8;
            if (i4 >= 8) {
                i12 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i12 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            nk.k.d(iArrCopyOf, "copyOf(...)");
            this.f36918a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f36919b, i12 << 1);
            nk.k.d(objArrCopyOf, "copyOf(...)");
            this.f36919b = objArrCopyOf;
            if (i4 != this.f36920c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i4) {
            int[] iArr2 = this.f36918a;
            int i13 = i11 + 1;
            zj.m.M(i13, i11, i4, iArr2, iArr2);
            Object[] objArr2 = this.f36919b;
            zj.m.N(i13 << 1, i11 << 1, this.f36920c << 1, objArr2, objArr2);
        }
        int i14 = this.f36920c;
        if (i4 == i14) {
            int[] iArr3 = this.f36918a;
            if (i11 < iArr3.length) {
                iArr3[i11] = iHashCode;
                Object[] objArr3 = this.f36919b;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f36920c = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f36920c;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f36920c * 28);
        sb2.append('{');
        int i4 = this.f36920c;
        for (int i10 = 0; i10 < i4; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objF = f(i10);
            if (objF != sb2) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objJ = j(i10);
            if (objJ != sb2) {
                sb2.append(objJ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        nk.k.d(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !nk.k.a(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !nk.k.a(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }

    public n0(n0 n0Var) {
        this(0);
        g(n0Var);
    }
}
