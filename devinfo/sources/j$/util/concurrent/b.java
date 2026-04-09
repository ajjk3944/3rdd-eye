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
    public final ConcurrentHashMap f26316a;

    @Override // java.util.Collection
    public abstract boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public abstract boolean remove(Object obj);

    public b(ConcurrentHashMap concurrentHashMap) {
        this.f26316a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f26316a.clear();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f26316a.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f26316a.isEmpty();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        long j = this.f26316a.j();
        if (j < 0) {
            j = 0;
        }
        if (j > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i4 = (int) j;
        Object[] objArrCopyOf = new Object[i4];
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i10 == i4) {
                if (i4 >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i11 = i4 < 1073741819 ? (i4 >>> 1) + 1 + i4 : 2147483639;
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
                i4 = i11;
            }
            objArrCopyOf[i10] = next;
            i10++;
        }
        return i10 == i4 ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i10);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long j = this.f26316a.j();
        if (j < 0) {
            j = 0;
        }
        if (j > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i4 = (int) j;
        Object[] objArrCopyOf = objArr.length >= i4 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        int length = objArrCopyOf.length;
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i10 == length) {
                if (length >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i11 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
                length = i11;
            }
            objArrCopyOf[i10] = next;
            i10++;
        }
        if (objArr != objArrCopyOf || i10 >= length) {
            return i10 == length ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i10);
        }
        objArrCopyOf[i10] = null;
        return objArrCopyOf;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb2.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
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
        l[] lVarArr = this.f26316a.f26303a;
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
        boolean z3 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }
}
