package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class bw0 {
    public int[] f;
    public Object[] g;
    public int h;

    public bw0(int i) {
        this.f = i == 0 ? ob1.a : new int[i];
        this.g = i == 0 ? ob1.c : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.h * 2;
        Object[] objArr = this.g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.h;
        int[] iArr = this.f;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            i30.l(iArrCopyOf, "copyOf(this, newSize)");
            this.f = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.g, i * 2);
            i30.l(objArrCopyOf, "copyOf(this, newSize)");
            this.g = objArrCopyOf;
        }
        if (this.h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i2 = this.h;
        if (i2 == 0) {
            return -1;
        }
        int iA = ob1.a(i2, i, this.f);
        if (iA < 0 || i30.c(obj, this.g[iA << 1])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.f[i3] == i) {
            if (i30.c(obj, this.g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.f[i4] == i; i4--) {
            if (i30.c(obj, this.g[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final void clear() {
        if (this.h > 0) {
            this.f = ob1.a;
            this.g = ob1.c;
            this.h = 0;
        }
        if (this.h > 0) {
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
        int i = this.h;
        if (i == 0) {
            return -1;
        }
        int iA = ob1.a(i, 0, this.f);
        if (iA < 0 || this.g[iA << 1] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.f[i2] == 0) {
            if (this.g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.f[i3] == 0; i3--) {
            if (this.g[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof bw0) {
                int i = this.h;
                if (i != ((bw0) obj).h) {
                    return false;
                }
                bw0 bw0Var = (bw0) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objF = f(i2);
                    Object objI = i(i2);
                    Object obj2 = bw0Var.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !bw0Var.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.h != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.h;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objF2 = f(i4);
                Object objI2 = i(i4);
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

    public final Object f(int i) {
        if (i < 0 || i >= this.h) {
            throw new IllegalArgumentException(ex0.f("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        return this.g[i << 1];
    }

    public final Object g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.h)) {
            throw new IllegalArgumentException(ex0.f("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        Object[] objArr = this.g;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                w8.T(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.g;
                w8.U(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.g;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            i30.l(iArrCopyOf, "copyOf(this, newSize)");
            this.f = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.g, i7 << 1);
            i30.l(objArrCopyOf, "copyOf(this, newSize)");
            this.g = objArrCopyOf;
            if (i2 != this.h) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                w8.T(0, 0, i, iArr, this.f);
                w8.U(0, 0, i3, objArr, this.g);
            }
            if (i < i4) {
                int i8 = i + 1;
                w8.T(i, i8, i2, iArr, this.f);
                w8.U(i3, i8 << 1, i2 << 1, objArr, this.g);
            }
        }
        if (i2 != this.h) {
            throw new ConcurrentModificationException();
        }
        this.h = i4;
        return obj;
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.g[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.g[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        if (i < 0 || i >= this.h) {
            throw new IllegalArgumentException(ex0.f("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.g;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f;
        Object[] objArr = this.g;
        int i = this.h;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i) {
        if (i < 0 || i >= this.h) {
            throw new IllegalArgumentException(ex0.f("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        return this.g[(i << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.h <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.h;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i2 = (iC << 1) + 1;
            Object[] objArr = this.g;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iC;
        int[] iArr = this.f;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            i30.l(iArrCopyOf, "copyOf(this, newSize)");
            this.f = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.g, i4 << 1);
            i30.l(objArrCopyOf, "copyOf(this, newSize)");
            this.g = objArrCopyOf;
            if (i != this.h) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f;
            int i5 = i3 + 1;
            w8.T(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.g;
            w8.U(i5 << 1, i3 << 1, this.h << 1, objArr2, objArr2);
        }
        int i6 = this.h;
        if (i == i6) {
            int[] iArr3 = this.f;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.g;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.h = i6 + 1;
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
        return this.h;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objF = f(i2);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i2);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        i30.l(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !i30.c(obj2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !i30.c(obj2, i(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bw0(bw0 bw0Var) {
        this(0);
        int i = bw0Var.h;
        b(this.h + i);
        if (this.h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(bw0Var.f(i2), bw0Var.i(i2));
            }
        } else if (i > 0) {
            w8.T(0, 0, i, bw0Var.f, this.f);
            w8.U(0, 0, i << 1, bw0Var.g, this.g);
            this.h = i;
        }
    }
}
