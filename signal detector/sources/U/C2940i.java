package u;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import d5.AbstractC2281i;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import v.AbstractC2959a;

/* renamed from: u.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2940i {

    /* renamed from: a, reason: collision with root package name */
    public int[] f23703a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f23704b;

    /* renamed from: c, reason: collision with root package name */
    public int f23705c;

    public C2940i(int i) {
        this.f23703a = i == 0 ? AbstractC2959a.f23829a : new int[i];
        this.f23704b = i == 0 ? AbstractC2959a.f23830b : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.f23705c * 2;
        Object[] objArr = this.f23704b;
        if (obj == null) {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i3 = this.f23705c;
        int[] iArr = this.f23703a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            q5.i.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f23703a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f23704b, i * 2);
            q5.i.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f23704b = objArrCopyOf;
        }
        if (this.f23705c != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i3 = this.f23705c;
        if (i3 == 0) {
            return -1;
        }
        int iA = AbstractC2959a.a(this.f23703a, i3, i);
        if (iA < 0 || q5.i.a(obj, this.f23704b[iA << 1])) {
            return iA;
        }
        int i6 = iA + 1;
        while (i6 < i3 && this.f23703a[i6] == i) {
            if (q5.i.a(obj, this.f23704b[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iA - 1; i7 >= 0 && this.f23703a[i7] == i; i7--) {
            if (q5.i.a(obj, this.f23704b[i7 << 1])) {
                return i7;
            }
        }
        return ~i6;
    }

    public void clear() {
        if (this.f23705c > 0) {
            this.f23703a = AbstractC2959a.f23829a;
            this.f23704b = AbstractC2959a.f23830b;
            this.f23705c = 0;
        }
        if (this.f23705c > 0) {
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
        int i = this.f23705c;
        if (i == 0) {
            return -1;
        }
        int iA = AbstractC2959a.a(this.f23703a, i, 0);
        if (iA < 0 || this.f23704b[iA << 1] == null) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i && this.f23703a[i3] == 0) {
            if (this.f23704b[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i6 = iA - 1; i6 >= 0 && this.f23703a[i6] == 0; i6--) {
            if (this.f23704b[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C2940i) {
                int i = this.f23705c;
                if (i != ((C2940i) obj).f23705c) {
                    return false;
                }
                C2940i c2940i = (C2940i) obj;
                for (int i3 = 0; i3 < i; i3++) {
                    Object objF = f(i3);
                    Object objJ = j(i3);
                    Object obj2 = c2940i.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !c2940i.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f23705c != ((Map) obj).size()) {
                return false;
            }
            int i6 = this.f23705c;
            for (int i7 = 0; i7 < i6; i7++) {
                Object objF2 = f(i7);
                Object objJ2 = j(i7);
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

    public final Object f(int i) {
        if (i < 0 || i >= this.f23705c) {
            throw new IllegalArgumentException(AbstractC1135f5.l(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f23704b[i << 1];
    }

    public void g(C2940i c2940i) {
        int i = c2940i.f23705c;
        b(this.f23705c + i);
        if (this.f23705c != 0) {
            for (int i3 = 0; i3 < i; i3++) {
                put(c2940i.f(i3), c2940i.j(i3));
            }
        } else if (i > 0) {
            AbstractC2281i.R(0, 0, i, c2940i.f23703a, this.f23703a);
            AbstractC2281i.S(0, 0, i << 1, c2940i.f23704b, this.f23704b);
            this.f23705c = i;
        }
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f23704b[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f23704b[(iD << 1) + 1] : obj2;
    }

    public Object h(int i) {
        int i3;
        if (i < 0 || i >= (i3 = this.f23705c)) {
            throw new IllegalArgumentException(AbstractC1135f5.l(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f23704b;
        int i6 = i << 1;
        Object obj = objArr[i6 + 1];
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i7 = i3 - 1;
        int[] iArr = this.f23703a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i < i7) {
                int i8 = i + 1;
                AbstractC2281i.R(i, i8, i3, iArr, iArr);
                Object[] objArr2 = this.f23704b;
                AbstractC2281i.S(i6, i8 << 1, i3 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f23704b;
            int i9 = i7 << 1;
            objArr3[i9] = null;
            objArr3[i9 + 1] = null;
        } else {
            int i10 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            q5.i.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f23703a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f23704b, i10 << 1);
            q5.i.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f23704b = objArrCopyOf;
            if (i3 != this.f23705c) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                AbstractC2281i.R(0, 0, i, iArr, this.f23703a);
                AbstractC2281i.S(0, 0, i6, objArr, this.f23704b);
            }
            if (i < i7) {
                int i11 = i + 1;
                AbstractC2281i.R(i, i11, i3, iArr, this.f23703a);
                AbstractC2281i.S(i6, i11 << 1, i3 << 1, objArr, this.f23704b);
            }
        }
        if (i3 != this.f23705c) {
            throw new ConcurrentModificationException();
        }
        this.f23705c = i7;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f23703a;
        Object[] objArr = this.f23704b;
        int i = this.f23705c;
        int i3 = 1;
        int i6 = 0;
        int iHashCode = 0;
        while (i6 < i) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i6];
            i6++;
            i3 += 2;
        }
        return iHashCode;
    }

    public Object i(int i, Object obj) {
        if (i < 0 || i >= this.f23705c) {
            throw new IllegalArgumentException(AbstractC1135f5.l(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i3 = (i << 1) + 1;
        Object[] objArr = this.f23704b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f23705c <= 0;
    }

    public final Object j(int i) {
        if (i < 0 || i >= this.f23705c) {
            throw new IllegalArgumentException(AbstractC1135f5.l(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f23704b[(i << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f23705c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i3 = (iC << 1) + 1;
            Object[] objArr = this.f23704b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i6 = ~iC;
        int[] iArr = this.f23703a;
        if (i >= iArr.length) {
            int i7 = 8;
            if (i >= 8) {
                i7 = (i >> 1) + i;
            } else if (i < 4) {
                i7 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            q5.i.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f23703a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f23704b, i7 << 1);
            q5.i.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f23704b = objArrCopyOf;
            if (i != this.f23705c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i) {
            int[] iArr2 = this.f23703a;
            int i8 = i6 + 1;
            AbstractC2281i.R(i8, i6, i, iArr2, iArr2);
            Object[] objArr2 = this.f23704b;
            AbstractC2281i.S(i8 << 1, i6 << 1, this.f23705c << 1, objArr2, objArr2);
        }
        int i9 = this.f23705c;
        if (i == i9) {
            int[] iArr3 = this.f23703a;
            if (i6 < iArr3.length) {
                iArr3[i6] = iHashCode;
                Object[] objArr3 = this.f23704b;
                int i10 = i6 << 1;
                objArr3[i10] = obj;
                objArr3[i10 + 1] = obj2;
                this.f23705c = i9 + 1;
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
        return this.f23705c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f23705c * 28);
        sb.append('{');
        int i = this.f23705c;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object objF = f(i3);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i3);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        q5.i.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !q5.i.a(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !q5.i.a(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }

    public C2940i(C2940i c2940i) {
        this(0);
        g(c2940i);
    }
}
