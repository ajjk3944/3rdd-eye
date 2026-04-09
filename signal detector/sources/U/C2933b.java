package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2933b implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2936e f23685a;

    public C2933b(C2936e c2936e) {
        this.f23685a = c2936e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f23685a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f23685a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f23685a.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C2936e c2936e = this.f23685a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (c2936e.f23705c == set.size()) {
                return c2936e.k(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C2936e c2936e = this.f23685a;
        int iHashCode = 0;
        for (int i = c2936e.f23705c - 1; i >= 0; i--) {
            Object objF = c2936e.f(i);
            iHashCode += objF == null ? 0 : objF.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f23685a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2932a(this.f23685a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C2936e c2936e = this.f23685a;
        int iD = c2936e.d(obj);
        if (iD < 0) {
            return false;
        }
        c2936e.h(iD);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f23685a.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2936e c2936e = this.f23685a;
        int i = c2936e.f23705c;
        for (int i3 = i - 1; i3 >= 0; i3--) {
            if (!collection.contains(c2936e.f(i3))) {
                c2936e.h(i3);
            }
        }
        return i != c2936e.f23705c;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f23685a.f23705c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C2936e c2936e = this.f23685a;
        int i = c2936e.f23705c;
        Object[] objArr = new Object[i];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = c2936e.f(i3);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2936e c2936e = this.f23685a;
        int i = c2936e.f23705c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = c2936e.f(i3);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
