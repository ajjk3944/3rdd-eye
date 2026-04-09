package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class f implements Collection, Set, cr.b, cr.d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f23064a = v.a.f23729a;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f23065d = v.a.f23731c;

    /* renamed from: g, reason: collision with root package name */
    public int f23066g;

    public f(int i10) {
        if (i10 > 0) {
            p.a(this, i10);
        }
    }

    public final Object a(int i10) {
        int i11 = this.f23066g;
        Object[] objArr = this.f23065d;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i12 = i11 - 1;
        int[] iArr = this.f23064a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                mq.l.b0(i10, i13, i11, iArr, iArr);
                Object[] objArr2 = this.f23065d;
                mq.l.c0(i10, i13, i11, objArr2, objArr2);
            }
            this.f23065d[i12] = null;
        } else {
            int i14 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArr2 = new int[i14];
            this.f23064a = iArr2;
            this.f23065d = new Object[i14];
            if (i10 > 0) {
                mq.l.e0(0, i10, 6, iArr, iArr2);
                mq.l.f0(0, i10, 6, objArr, this.f23065d);
            }
            if (i10 < i12) {
                int i15 = i10 + 1;
                mq.l.b0(i10, i15, i11, iArr, this.f23064a);
                mq.l.c0(i10, i15, i11, objArr, this.f23065d);
            }
        }
        if (i11 != this.f23066g) {
            throw new ConcurrentModificationException();
        }
        this.f23066g = i12;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int iB;
        int i11 = this.f23066g;
        if (obj == null) {
            iB = p.b(this, null, 0);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iB = p.b(this, obj, iHashCode);
        }
        if (iB >= 0) {
            return false;
        }
        int i12 = ~iB;
        int[] iArr = this.f23064a;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f23065d;
            int[] iArr2 = new int[i13];
            this.f23064a = iArr2;
            this.f23065d = new Object[i13];
            if (i11 != this.f23066g) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                mq.l.e0(0, iArr.length, 6, iArr, iArr2);
                mq.l.f0(0, objArr.length, 6, objArr, this.f23065d);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f23064a;
            int i14 = i12 + 1;
            mq.l.b0(i14, i12, i11, iArr3, iArr3);
            Object[] objArr2 = this.f23065d;
            mq.l.c0(i14, i12, i11, objArr2, objArr2);
        }
        int i15 = this.f23066g;
        if (i11 == i15) {
            int[] iArr4 = this.f23064a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f23065d[i12] = obj;
                this.f23066g = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        br.l.e(collection, "elements");
        int size = collection.size() + this.f23066g;
        int i10 = this.f23066g;
        int[] iArr = this.f23064a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f23065d;
            int[] iArr2 = new int[size];
            this.f23064a = iArr2;
            this.f23065d = new Object[size];
            if (i10 > 0) {
                mq.l.e0(0, i10, 6, iArr, iArr2);
                mq.l.f0(0, this.f23066g, 6, objArr, this.f23065d);
            }
        }
        if (this.f23066g != i10) {
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
        if (this.f23066g != 0) {
            this.f23064a = v.a.f23729a;
            this.f23065d = v.a.f23731c;
            this.f23066g = 0;
        }
        if (this.f23066g != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? p.b(this, null, 0) : p.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        br.l.e(collection, "elements");
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
        if (!(obj instanceof Set) || this.f23066g != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = this.f23066g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(this.f23065d[i11])) {
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
        int[] iArr = this.f23064a;
        int i10 = this.f23066g;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f23066g <= 0;
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
        br.l.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        br.l.e(collection, "elements");
        boolean z10 = false;
        for (int i10 = this.f23066g - 1; -1 < i10; i10--) {
            if (!mq.o.k0(collection, this.f23065d[i10])) {
                a(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f23066g;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return mq.l.h0(this.f23065d, 0, this.f23066g);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f23066g * 14);
        sb2.append('{');
        int i10 = this.f23066g;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f23065d[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        br.l.e(objArr, "array");
        int i10 = this.f23066g;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        } else if (objArr.length > i10) {
            objArr[i10] = null;
        }
        mq.l.c0(0, 0, this.f23066g, this.f23065d, objArr);
        return objArr;
    }
}
