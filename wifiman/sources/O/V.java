package o;

import Zg.AbstractC3682n;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.AbstractC7173a;
import p.AbstractC7176d;

/* loaded from: classes.dex */
public class V {

    /* renamed from: a, reason: collision with root package name */
    private int[] f54935a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f54936b;

    /* renamed from: c, reason: collision with root package name */
    private int f54937c;

    public V() {
        this(0, 1, null);
    }

    private final int e(Object obj, int i10) {
        int i11 = this.f54937c;
        if (i11 == 0) {
            return -1;
        }
        int iA = AbstractC7173a.a(this.f54935a, i11, i10);
        if (iA < 0 || AbstractC6492s.d(obj, this.f54936b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f54935a[i12] == i10) {
            if (AbstractC6492s.d(obj, this.f54936b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f54935a[i13] == i10; i13--) {
            if (AbstractC6492s.d(obj, this.f54936b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    private final int g() {
        int i10 = this.f54937c;
        if (i10 == 0) {
            return -1;
        }
        int iA = AbstractC7173a.a(this.f54935a, i10, 0);
        if (iA < 0 || this.f54936b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f54935a[i11] == 0) {
            if (this.f54936b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f54935a[i12] == 0; i12--) {
            if (this.f54936b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int b(Object obj) {
        int i10 = this.f54937c * 2;
        Object[] objArr = this.f54936b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (AbstractC6492s.d(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.f54937c > 0) {
            this.f54935a = AbstractC7173a.f57281a;
            this.f54936b = AbstractC7173a.f57283c;
            this.f54937c = 0;
        }
        if (this.f54937c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public void d(int i10) {
        int i11 = this.f54937c;
        int[] iArr = this.f54935a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            AbstractC6492s.h(iArrCopyOf, "copyOf(this, newSize)");
            this.f54935a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f54936b, i10 * 2);
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            this.f54936b = objArrCopyOf;
        }
        if (this.f54937c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof V) {
                if (size() != ((V) obj).size()) {
                    return false;
                }
                V v10 = (V) obj;
                int i10 = this.f54937c;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objH = h(i11);
                    Object objL = l(i11);
                    Object obj2 = v10.get(objH);
                    if (objL == null) {
                        if (obj2 != null || !v10.containsKey(objH)) {
                            return false;
                        }
                    } else if (!AbstractC6492s.d(objL, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f54937c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objH2 = h(i13);
                Object objL2 = l(i13);
                Object obj3 = ((Map) obj).get(objH2);
                if (objL2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objH2)) {
                        return false;
                    }
                } else if (!AbstractC6492s.d(objL2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public Object get(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return this.f54936b[(iF << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iF = f(obj);
        return iF >= 0 ? this.f54936b[(iF << 1) + 1] : obj2;
    }

    public Object h(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f54937c) {
            z10 = true;
        }
        if (!z10) {
            AbstractC7176d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f54936b[i10 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f54935a;
        Object[] objArr = this.f54936b;
        int i10 = this.f54937c;
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

    public void i(V map) {
        AbstractC6492s.i(map, "map");
        int i10 = map.f54937c;
        d(this.f54937c + i10);
        if (this.f54937c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.h(i11), map.l(i11));
            }
        } else if (i10 > 0) {
            AbstractC3682n.k(map.f54935a, this.f54935a, 0, 0, i10);
            AbstractC3682n.m(map.f54936b, this.f54936b, 0, 0, i10 << 1);
            this.f54937c = i10;
        }
    }

    public boolean isEmpty() {
        return this.f54937c <= 0;
    }

    public Object j(int i10) {
        if (!(i10 >= 0 && i10 < this.f54937c)) {
            AbstractC7176d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        Object[] objArr = this.f54936b;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f54937c;
        if (i12 <= 1) {
            clear();
        } else {
            int i13 = i12 - 1;
            int[] iArr = this.f54935a;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    AbstractC3682n.k(iArr, iArr, i10, i14, i12);
                    Object[] objArr2 = this.f54936b;
                    AbstractC3682n.m(objArr2, objArr2, i11, i14 << 1, i12 << 1);
                }
                Object[] objArr3 = this.f54936b;
                int i15 = i13 << 1;
                objArr3[i15] = null;
                objArr3[i15 + 1] = null;
            } else {
                int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
                AbstractC6492s.h(iArrCopyOf, "copyOf(this, newSize)");
                this.f54935a = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f54936b, i16 << 1);
                AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
                this.f54936b = objArrCopyOf;
                if (i12 != this.f54937c) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    AbstractC3682n.k(iArr, this.f54935a, 0, 0, i10);
                    AbstractC3682n.m(objArr, this.f54936b, 0, 0, i11);
                }
                if (i10 < i13) {
                    int i17 = i10 + 1;
                    AbstractC3682n.k(iArr, this.f54935a, i10, i17, i12);
                    AbstractC3682n.m(objArr, this.f54936b, i11, i17 << 1, i12 << 1);
                }
            }
            if (i12 != this.f54937c) {
                throw new ConcurrentModificationException();
            }
            this.f54937c = i13;
        }
        return obj;
    }

    public Object k(int i10, Object obj) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f54937c) {
            z10 = true;
        }
        if (!z10) {
            AbstractC7176d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f54936b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public Object l(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f54937c) {
            z10 = true;
        }
        if (!z10) {
            AbstractC7176d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f54936b[(i10 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10 = this.f54937c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iE = obj != null ? e(obj, iHashCode) : g();
        if (iE >= 0) {
            int i11 = (iE << 1) + 1;
            Object[] objArr = this.f54936b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iE;
        int[] iArr = this.f54935a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            AbstractC6492s.h(iArrCopyOf, "copyOf(this, newSize)");
            this.f54935a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f54936b, i13 << 1);
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            this.f54936b = objArrCopyOf;
            if (i10 != this.f54937c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f54935a;
            int i14 = i12 + 1;
            AbstractC3682n.k(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f54936b;
            AbstractC3682n.m(objArr2, objArr2, i14 << 1, i12 << 1, this.f54937c << 1);
        }
        int i15 = this.f54937c;
        if (i10 == i15) {
            int[] iArr3 = this.f54935a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f54936b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f54937c = i15 + 1;
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
        int iF = f(obj);
        if (iF >= 0) {
            return j(iF);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF >= 0) {
            return k(iF, obj2);
        }
        return null;
    }

    public int size() {
        return this.f54937c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f54937c * 28);
        sb2.append('{');
        int i10 = this.f54937c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objH = h(i11);
            if (objH != sb2) {
                sb2.append(objH);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objL = l(i11);
            if (objL != sb2) {
                sb2.append(objL);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public V(int i10) {
        this.f54935a = i10 == 0 ? AbstractC7173a.f57281a : new int[i10];
        this.f54936b = i10 == 0 ? AbstractC7173a.f57283c : new Object[i10 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0 || !AbstractC6492s.d(obj2, l(iF))) {
            return false;
        }
        j(iF);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iF = f(obj);
        if (iF < 0 || !AbstractC6492s.d(obj2, l(iF))) {
            return false;
        }
        k(iF, obj3);
        return true;
    }

    public /* synthetic */ V(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public V(V v10) {
        this(0, 1, null);
        if (v10 != null) {
            i(v10);
        }
    }
}
