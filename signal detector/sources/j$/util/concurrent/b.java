package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class b implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f20729a;

    @Override // java.util.Collection
    public abstract boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public abstract boolean remove(Object obj);

    public b(ConcurrentHashMap concurrentHashMap) {
        this.f20729a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f20729a.clear();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f20729a.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f20729a.isEmpty();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        long j6 = this.f20729a.j();
        if (j6 < 0) {
            j6 = 0;
        }
        if (j6 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i = (int) j6;
        Object[] objArrCopyOf = new Object[i];
        Iterator it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i3 == i) {
                if (i >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i6 = i < 1073741819 ? (i >>> 1) + 1 + i : 2147483639;
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i6);
                i = i6;
            }
            objArrCopyOf[i3] = next;
            i3++;
        }
        return i3 == i ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i3);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long j6 = this.f20729a.j();
        if (j6 < 0) {
            j6 = 0;
        }
        if (j6 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i = (int) j6;
        Object[] objArrCopyOf = objArr.length >= i ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        int length = objArrCopyOf.length;
        Iterator it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i3 == length) {
                if (length >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i6 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i6);
                length = i6;
            }
            objArrCopyOf[i3] = next;
            i3++;
        }
        if (objArr != objArrCopyOf || i3 >= length) {
            return i3 == length ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i3);
        }
        objArrCopyOf[i3] = null;
        return objArrCopyOf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == this) {
            return true;
        }
        for (Object obj : collection) {
            if (obj == null || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        l[] lVarArr = this.f20729a.f20715a;
        boolean zRemove = false;
        if (lVarArr == null) {
            return false;
        }
        if ((collection instanceof Set) && collection.size() > lVarArr.length) {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    zRemove = true;
                }
            }
            return zRemove;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            zRemove |= remove(it2.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }
}
