package r;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public int[] f24123a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f24124b;

    /* renamed from: c, reason: collision with root package name */
    public int f24125c;

    public k() {
        this(0, 1, null);
    }

    public final int a(Object obj) {
        int i10 = this.f24125c * 2;
        Object[] objArr = this.f24124b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (p.a(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void c(int i10) {
        int i11 = this.f24125c;
        int[] iArr = this.f24123a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            p.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f24123a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24124b, i10 * 2);
            p.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f24124b = objArrCopyOf;
        }
        if (this.f24125c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f24125c > 0) {
            this.f24123a = s.a.f24185a;
            this.f24124b = s.a.f24187c;
            this.f24125c = 0;
        }
        if (this.f24125c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj, int i10) {
        int i11 = this.f24125c;
        if (i11 == 0) {
            return -1;
        }
        int iA = s.a.a(this.f24123a, i11, i10);
        if (iA < 0 || p.a(obj, this.f24124b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f24123a[i12] == i10) {
            if (p.a(obj, this.f24124b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f24123a[i13] == i10; i13--) {
            if (p.a(obj, this.f24124b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k) {
                if (size() != ((k) obj).size()) {
                    return false;
                }
                k kVar = (k) obj;
                int i10 = this.f24125c;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objH = h(i11);
                    Object objL = l(i11);
                    Object obj2 = kVar.get(objH);
                    if (objL == null) {
                        if (obj2 != null || !kVar.containsKey(objH)) {
                            return false;
                        }
                    } else if (!p.a(objL, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f24125c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objH2 = h(i13);
                Object objL2 = l(i13);
                Object obj3 = ((Map) obj).get(objH2);
                if (objL2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objH2)) {
                        return false;
                    }
                } else if (!p.a(objL2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i10 = this.f24125c;
        if (i10 == 0) {
            return -1;
        }
        int iA = s.a.a(this.f24123a, i10, 0);
        if (iA < 0 || this.f24124b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f24123a[i11] == 0) {
            if (this.f24124b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f24123a[i12] == 0; i12--) {
            if (this.f24124b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public Object get(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return this.f24124b[(iE << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.f24124b[(iE << 1) + 1] : obj2;
    }

    public Object h(int i10) {
        if (i10 >= 0 && i10 < this.f24125c) {
            return this.f24124b[i10 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
    }

    public int hashCode() {
        int[] iArr = this.f24123a;
        Object[] objArr = this.f24124b;
        int i10 = this.f24125c;
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

    public void i(k map) {
        p.e(map, "map");
        int i10 = map.f24125c;
        c(this.f24125c + i10);
        if (this.f24125c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.h(i11), map.l(i11));
            }
        } else if (i10 > 0) {
            z8.m.e(map.f24123a, this.f24123a, 0, 0, i10);
            z8.m.g(map.f24124b, this.f24124b, 0, 0, i10 << 1);
            this.f24125c = i10;
        }
    }

    public boolean isEmpty() {
        return this.f24125c <= 0;
    }

    public Object j(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f24125c)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        Object[] objArr = this.f24124b;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f24123a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                z8.m.e(iArr, iArr, i10, i14, i11);
                Object[] objArr2 = this.f24124b;
                z8.m.g(objArr2, objArr2, i12, i14 << 1, i11 << 1);
            }
            Object[] objArr3 = this.f24124b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            p.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f24123a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24124b, i16 << 1);
            p.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f24124b = objArrCopyOf;
            if (i11 != this.f24125c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                z8.m.e(iArr, this.f24123a, 0, 0, i10);
                z8.m.g(objArr, this.f24124b, 0, 0, i12);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                z8.m.e(iArr, this.f24123a, i10, i17, i11);
                z8.m.g(objArr, this.f24124b, i12, i17 << 1, i11 << 1);
            }
        }
        if (i11 != this.f24125c) {
            throw new ConcurrentModificationException();
        }
        this.f24125c = i13;
        return obj;
    }

    public Object k(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f24125c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f24124b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public Object l(int i10) {
        if (i10 >= 0 && i10 < this.f24125c) {
            return this.f24124b[(i10 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
    }

    public Object put(Object obj, Object obj2) {
        int i10 = this.f24125c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iD = obj != null ? d(obj, iHashCode) : f();
        if (iD >= 0) {
            int i11 = (iD << 1) + 1;
            Object[] objArr = this.f24124b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iD;
        int[] iArr = this.f24123a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            p.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f24123a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24124b, i13 << 1);
            p.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f24124b = objArrCopyOf;
            if (i10 != this.f24125c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f24123a;
            int i14 = i12 + 1;
            z8.m.e(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f24124b;
            z8.m.g(objArr2, objArr2, i14 << 1, i12 << 1, this.f24125c << 1);
        }
        int i15 = this.f24125c;
        if (i10 == i15) {
            int[] iArr3 = this.f24123a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f24124b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f24125c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return j(iE);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE >= 0) {
            return k(iE, obj2);
        }
        return null;
    }

    public int size() {
        return this.f24125c;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f24125c * 28);
        sb.append('{');
        int i10 = this.f24125c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object objH = h(i11);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objL = l(i11);
            if (objL != sb) {
                sb.append(objL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        p.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public k(int i10) {
        this.f24123a = i10 == 0 ? s.a.f24185a : new int[i10];
        this.f24124b = i10 == 0 ? s.a.f24187c : new Object[i10 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0 || !p.a(obj2, l(iE))) {
            return false;
        }
        j(iE);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0 || !p.a(obj2, l(iE))) {
            return false;
        }
        k(iE, obj3);
        return true;
    }

    public /* synthetic */ k(int i10, int i11, kotlin.jvm.internal.i iVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public k(k kVar) {
        this(0, 1, null);
        if (kVar != null) {
            i(kVar);
        }
    }
}
