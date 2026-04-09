package com.bytedance.adsdk.vt;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
abstract class rn<K, V> {
    rn<K, V>.vt vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public final class ouw<T> implements Iterator<T> {

        /* renamed from: lh, reason: collision with root package name */
        int f7209lh;
        int vt;
        boolean yu = false;
        final int ouw = 0;

        public ouw() {
            this.vt = rn.this.ouw();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f7209lh < this.vt;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) rn.this.ouw(this.f7209lh);
            this.f7209lh++;
            this.yu = true;
            return t10;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.yu) {
                throw new IllegalStateException();
            }
            int i4 = this.f7209lh - 1;
            this.f7209lh = i4;
            this.vt--;
            this.yu = false;
            rn.this.vt(i4);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public final class vt implements Set<K> {
        public vt() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            rn.this.lh();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return rn.this.ouw(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> mapVt = rn.this.vt();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mapVt.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return rn.ouw(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int iHashCode = 0;
            for (int iOuw = rn.this.ouw() - 1; iOuw >= 0; iOuw--) {
                Object objOuw = rn.this.ouw(iOuw);
                iHashCode += objOuw == null ? 0 : objOuw.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return rn.this.ouw() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new ouw();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int iOuw = rn.this.ouw(obj);
            if (iOuw < 0) {
                return false;
            }
            rn.this.vt(iOuw);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> mapVt = rn.this.vt();
            int size = mapVt.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mapVt.remove(it.next());
            }
            return size != mapVt.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            Map<K, V> mapVt = rn.this.vt();
            int size = mapVt.size();
            Iterator<K> it = mapVt.keySet().iterator();
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                }
            }
            return size != mapVt.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return rn.this.ouw();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            return rn.this.yu();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) rn.this.ouw((Object[]) tArr);
        }
    }

    public abstract void lh();

    public abstract int ouw();

    public abstract int ouw(Object obj);

    public abstract Object ouw(int i4);

    public final <T> T[] ouw(T[] tArr) {
        int iOuw = ouw();
        if (tArr.length < iOuw) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iOuw));
        }
        for (int i4 = 0; i4 < iOuw; i4++) {
            tArr[i4] = ouw(i4);
        }
        if (tArr.length > iOuw) {
            tArr[iOuw] = null;
        }
        return tArr;
    }

    public abstract Map<K, V> vt();

    public abstract void vt(int i4);

    public final Object[] yu() {
        int iOuw = ouw();
        Object[] objArr = new Object[iOuw];
        for (int i4 = 0; i4 < iOuw; i4++) {
            objArr[i4] = ouw(i4);
        }
        return objArr;
    }

    public static <T> boolean ouw(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
