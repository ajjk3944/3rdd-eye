package u;

import d5.AbstractC2281i;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import v.AbstractC2959a;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2937f implements Collection, Set, r5.b {

    /* renamed from: a, reason: collision with root package name */
    public int[] f23694a = AbstractC2959a.f23829a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f23695b = AbstractC2959a.f23830b;

    /* renamed from: c, reason: collision with root package name */
    public int f23696c;

    public C2937f(int i) {
        if (i > 0) {
            AbstractC2939h.b(this, i);
        }
    }

    public final Object a(int i) {
        int i3 = this.f23696c;
        Object[] objArr = this.f23695b;
        Object obj = objArr[i];
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i6 = i3 - 1;
        int[] iArr = this.f23694a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i < i6) {
                int i7 = i + 1;
                AbstractC2281i.R(i, i7, i3, iArr, iArr);
                Object[] objArr2 = this.f23695b;
                AbstractC2281i.S(i, i7, i3, objArr2, objArr2);
            }
            this.f23695b[i6] = null;
        } else {
            int i8 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArr2 = new int[i8];
            this.f23694a = iArr2;
            this.f23695b = new Object[i8];
            if (i > 0) {
                AbstractC2281i.R(0, 0, i, iArr, iArr2);
                AbstractC2281i.T(0, i, 6, objArr, this.f23695b);
            }
            if (i < i6) {
                int i9 = i + 1;
                AbstractC2281i.R(i, i9, i3, iArr, this.f23694a);
                AbstractC2281i.S(i, i9, i3, objArr, this.f23695b);
            }
        }
        if (i3 != this.f23696c) {
            throw new ConcurrentModificationException();
        }
        this.f23696c = i6;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iC;
        int i3 = this.f23696c;
        if (obj == null) {
            iC = AbstractC2939h.c(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iC = AbstractC2939h.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i6 = ~iC;
        int[] iArr = this.f23694a;
        if (i3 >= iArr.length) {
            int i7 = 8;
            if (i3 >= 8) {
                i7 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.f23695b;
            int[] iArr2 = new int[i7];
            this.f23694a = iArr2;
            this.f23695b = new Object[i7];
            if (i3 != this.f23696c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                AbstractC2281i.R(0, 0, iArr.length, iArr, iArr2);
                AbstractC2281i.T(0, objArr.length, 6, objArr, this.f23695b);
            }
        }
        if (i6 < i3) {
            int[] iArr3 = this.f23694a;
            int i8 = i6 + 1;
            AbstractC2281i.R(i8, i6, i3, iArr3, iArr3);
            Object[] objArr2 = this.f23695b;
            AbstractC2281i.S(i8, i6, i3, objArr2, objArr2);
        }
        int i9 = this.f23696c;
        if (i3 == i9) {
            int[] iArr4 = this.f23694a;
            if (i6 < iArr4.length) {
                iArr4[i6] = i;
                this.f23695b[i6] = obj;
                this.f23696c = i9 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        q5.i.e(collection, "elements");
        int size = collection.size() + this.f23696c;
        int i = this.f23696c;
        int[] iArr = this.f23694a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f23695b;
            int[] iArr2 = new int[size];
            this.f23694a = iArr2;
            this.f23695b = new Object[size];
            if (i > 0) {
                AbstractC2281i.R(0, 0, i, iArr, iArr2);
                AbstractC2281i.T(0, this.f23696c, 6, objArr, this.f23695b);
            }
        }
        if (this.f23696c != i) {
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
        if (this.f23696c != 0) {
            this.f23694a = AbstractC2959a.f23829a;
            this.f23695b = AbstractC2959a.f23830b;
            this.f23696c = 0;
        }
        if (this.f23696c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC2939h.c(this, null, 0) : AbstractC2939h.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        q5.i.e(collection, "elements");
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
        if (!(obj instanceof Set) || this.f23696c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f23696c;
            for (int i3 = 0; i3 < i; i3++) {
                if (!((Set) obj).contains(this.f23695b[i3])) {
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
        int[] iArr = this.f23694a;
        int i = this.f23696c;
        int i3 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            i3 += iArr[i6];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f23696c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2932a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC = obj == null ? AbstractC2939h.c(this, null, 0) : AbstractC2939h.c(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        a(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        q5.i.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        q5.i.e(collection, "elements");
        boolean z6 = false;
        for (int i = this.f23696c - 1; -1 < i; i--) {
            if (!collection.contains(this.f23695b[i])) {
                a(i);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f23696c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC2281i.U(this.f23695b, 0, this.f23696c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f23696c * 14);
        sb.append('{');
        int i = this.f23696c;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.f23695b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        q5.i.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        q5.i.e(objArr, "array");
        int i = this.f23696c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC2281i.S(0, 0, this.f23696c, this.f23695b, objArr);
        return objArr;
    }
}
