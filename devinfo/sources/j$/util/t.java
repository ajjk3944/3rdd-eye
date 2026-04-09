package j$.util;

import j$.util.Collection;
import j$.util.stream.Stream;
import j$.util.stream.a7;
import j$.util.stream.b5;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class t extends w {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.n, java.lang.Iterable, j$.util.Collection
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        Collection.EL.a(this.f26429a, new q(0, consumer));
    }

    @Override // j$.util.n, java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        return new s(Collection.EL.c(this.f26429a));
    }

    @Override // j$.util.n, java.util.Collection, j$.util.Collection
    public final Stream stream() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new b5(spliterator, a7.k(spliterator), false);
    }

    @Override // j$.util.n, java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new b5(spliterator, a7.k(spliterator), true);
    }

    @Override // j$.util.n, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new m(this);
    }

    @Override // j$.util.n, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.f26429a.toArray();
        for (int i4 = 0; i4 < array.length; i4++) {
            array[i4] = new r((Map.Entry) array[i4]);
        }
        return array;
    }

    @Override // j$.util.n, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.f26429a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i4 = 0; i4 < array.length; i4++) {
            array[i4] = new r((Map.Entry) array[i4]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }

    @Override // j$.util.n, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return this.f26429a.contains(new r((Map.Entry) obj));
        }
        return false;
    }

    @Override // j$.util.n, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.w, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (set.size() != this.f26429a.size()) {
            return false;
        }
        return containsAll(set);
    }
}
