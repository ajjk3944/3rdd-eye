package u;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f23075a;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f23076d;

    /* renamed from: g, reason: collision with root package name */
    public int f23077g;

    public i0(int i10) {
        this.f23075a = i10 == 0 ? v.a.f23729a : new int[i10];
        this.f23076d = i10 == 0 ? v.a.f23731c : new Object[i10 << 1];
    }

    public final int a(Object obj) {
        int i10 = this.f23077g * 2;
        Object[] objArr = this.f23076d;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i10) {
        int i11 = this.f23077g;
        int[] iArr = this.f23075a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            br.l.d(iArrCopyOf, "copyOf(...)");
            this.f23075a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f23076d, i10 * 2);
            br.l.d(objArrCopyOf, "copyOf(...)");
            this.f23076d = objArrCopyOf;
        }
        if (this.f23077g != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i10, Object obj) {
        int i11 = this.f23077g;
        if (i11 == 0) {
            return -1;
        }
        int iA = v.a.a(i11, i10, this.f23075a);
        if (iA < 0 || br.l.a(obj, this.f23076d[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f23075a[i12] == i10) {
            if (br.l.a(obj, this.f23076d[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f23075a[i13] == i10; i13--) {
            if (br.l.a(obj, this.f23076d[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final void clear() {
        if (this.f23077g > 0) {
            this.f23075a = v.a.f23729a;
            this.f23076d = v.a.f23731c;
            this.f23077g = 0;
        }
        if (this.f23077g > 0) {
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
        int i10 = this.f23077g;
        if (i10 == 0) {
            return -1;
        }
        int iA = v.a.a(i10, 0, this.f23075a);
        if (iA < 0 || this.f23076d[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f23075a[i11] == 0) {
            if (this.f23076d[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f23075a[i12] == 0; i12--) {
            if (this.f23076d[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof i0) {
                int i10 = this.f23077g;
                if (i10 != ((i0) obj).f23077g) {
                    return false;
                }
                i0 i0Var = (i0) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objF = f(i11);
                    Object objI = i(i11);
                    Object obj2 = i0Var.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !i0Var.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f23077g != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f23077g;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objF2 = f(i13);
                Object objI2 = i(i13);
                Object obj3 = ((Map) obj).get(objF2);
                if (objI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f23077g) {
            z10 = true;
        }
        if (z10) {
            return this.f23076d[i10 << 1];
        }
        v.a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final Object g(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f23077g)) {
            v.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        Object[] objArr = this.f23076d;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f23075a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                mq.l.b0(i10, i14, i11, iArr, iArr);
                Object[] objArr2 = this.f23076d;
                mq.l.c0(i12, i14 << 1, i11 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f23076d;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            br.l.d(iArrCopyOf, "copyOf(...)");
            this.f23075a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f23076d, i16 << 1);
            br.l.d(objArrCopyOf, "copyOf(...)");
            this.f23076d = objArrCopyOf;
            if (i11 != this.f23077g) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                mq.l.b0(0, 0, i10, iArr, this.f23075a);
                mq.l.c0(0, 0, i12, objArr, this.f23076d);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                mq.l.b0(i10, i17, i11, iArr, this.f23075a);
                mq.l.c0(i12, i17 << 1, i11 << 1, objArr, this.f23076d);
            }
        }
        if (i11 != this.f23077g) {
            throw new ConcurrentModificationException();
        }
        this.f23077g = i13;
        return obj;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f23076d[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f23076d[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i10, Object obj) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f23077g) {
            z10 = true;
        }
        if (!z10) {
            v.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f23076d;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f23075a;
        Object[] objArr = this.f23076d;
        int i10 = this.f23077g;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f23077g) {
            z10 = true;
        }
        if (z10) {
            return this.f23076d[(i10 << 1) + 1];
        }
        v.a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final boolean isEmpty() {
        return this.f23077g <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i10 = this.f23077g;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f23076d;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iC;
        int[] iArr = this.f23075a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            br.l.d(iArrCopyOf, "copyOf(...)");
            this.f23075a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f23076d, i13 << 1);
            br.l.d(objArrCopyOf, "copyOf(...)");
            this.f23076d = objArrCopyOf;
            if (i10 != this.f23077g) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f23075a;
            int i14 = i12 + 1;
            mq.l.b0(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f23076d;
            mq.l.c0(i14 << 1, i12 << 1, this.f23077g << 1, objArr2, objArr2);
        }
        int i15 = this.f23077g;
        if (i10 == i15) {
            int[] iArr3 = this.f23075a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f23076d;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f23077g = i15 + 1;
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
            return g(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f23077g;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f23077g * 28);
        sb2.append('{');
        int i10 = this.f23077g;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objF = f(i11);
            if (objF != sb2) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objI = i(i11);
            if (objI != sb2) {
                sb2.append(objI);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !br.l.a(obj2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !br.l.a(obj2, i(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }
}
