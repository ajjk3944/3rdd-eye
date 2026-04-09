package x;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements Collection, Set, ok.b, ok.e {

    /* renamed from: a, reason: collision with root package name */
    public int[] f36879a = y.a.f37284a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f36880b = y.a.f37286c;

    /* renamed from: c, reason: collision with root package name */
    public int f36881c;

    public f(int i4) {
        if (i4 > 0) {
            p.a(this, i4);
        }
    }

    public final Object a(int i4) {
        int i10 = this.f36881c;
        Object[] objArr = this.f36880b;
        Object obj = objArr[i4];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f36879a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i4 < i11) {
                int i12 = i4 + 1;
                zj.m.M(i4, i12, i10, iArr, iArr);
                Object[] objArr2 = this.f36880b;
                zj.m.N(i4, i12, i10, objArr2, objArr2);
            }
            this.f36880b[i11] = null;
        } else {
            int i13 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArr2 = new int[i13];
            this.f36879a = iArr2;
            this.f36880b = new Object[i13];
            if (i4 > 0) {
                zj.m.Q(0, i4, 6, iArr, iArr2);
                zj.m.R(0, i4, 6, objArr, this.f36880b);
            }
            if (i4 < i11) {
                int i14 = i4 + 1;
                zj.m.M(i4, i14, i10, iArr, this.f36879a);
                zj.m.N(i4, i14, i10, objArr, this.f36880b);
            }
        }
        if (i10 != this.f36881c) {
            throw new ConcurrentModificationException();
        }
        this.f36881c = i11;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i4;
        int iB;
        int i10 = this.f36881c;
        if (obj == null) {
            iB = p.b(this, null, 0);
            i4 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i4 = iHashCode;
            iB = p.b(this, obj, iHashCode);
        }
        if (iB >= 0) {
            return false;
        }
        int i11 = ~iB;
        int[] iArr = this.f36879a;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f36880b;
            int[] iArr2 = new int[i12];
            this.f36879a = iArr2;
            this.f36880b = new Object[i12];
            if (i10 != this.f36881c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                zj.m.Q(0, iArr.length, 6, iArr, iArr2);
                zj.m.R(0, objArr.length, 6, objArr, this.f36880b);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f36879a;
            int i13 = i11 + 1;
            zj.m.M(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.f36880b;
            zj.m.N(i13, i11, i10, objArr2, objArr2);
        }
        int i14 = this.f36881c;
        if (i10 == i14) {
            int[] iArr4 = this.f36879a;
            if (i11 < iArr4.length) {
                iArr4[i11] = i4;
                this.f36880b[i11] = obj;
                this.f36881c = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        nk.k.e(collection, "elements");
        int size = collection.size() + this.f36881c;
        int i4 = this.f36881c;
        int[] iArr = this.f36879a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f36880b;
            int[] iArr2 = new int[size];
            this.f36879a = iArr2;
            this.f36880b = new Object[size];
            if (i4 > 0) {
                zj.m.Q(0, i4, 6, iArr, iArr2);
                zj.m.R(0, this.f36881c, 6, objArr, this.f36880b);
            }
        }
        if (this.f36881c != i4) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f36881c != 0) {
            this.f36879a = y.a.f37284a;
            this.f36880b = y.a.f37286c;
            this.f36881c = 0;
        }
        if (this.f36881c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? p.b(this, null, 0) : p.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        nk.k.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f36881c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i4 = this.f36881c;
            for (int i10 = 0; i10 < i4; i10++) {
                if (!((Set) obj).contains(this.f36880b[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f36879a;
        int i4 = this.f36881c;
        int i10 = 0;
        for (int i11 = 0; i11 < i4; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f36881c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iB = obj == null ? p.b(this, null, 0) : p.b(this, obj, obj.hashCode());
        if (iB < 0) {
            return false;
        }
        a(iB);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        nk.k.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        nk.k.e(collection, "elements");
        boolean z3 = false;
        for (int i4 = this.f36881c - 1; -1 < i4; i4--) {
            if (!zj.n.Z(collection, this.f36880b[i4])) {
                a(i4);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f36881c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return zj.m.T(this.f36880b, 0, this.f36881c);
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f36881c * 14);
        sb2.append('{');
        int i4 = this.f36881c;
        for (int i10 = 0; i10 < i4; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f36880b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        nk.k.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        nk.k.e(objArr, "array");
        int i4 = this.f36881c;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        } else if (objArr.length > i4) {
            objArr[i4] = null;
        }
        zj.m.N(0, 0, this.f36881c, this.f36880b, objArr);
        return objArr;
    }
}
