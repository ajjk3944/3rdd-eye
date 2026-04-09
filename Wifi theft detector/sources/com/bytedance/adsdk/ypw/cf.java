package com.bytedance.adsdk.ypw;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
abstract class cf<K, V> {
    cf<K, V>.ypw ypw;

    public final class emc<T> implements Iterator<T> {
        boolean dg = false;
        final int emc;
        int xq;
        int ypw;

        public emc(int i10) {
            this.emc = i10;
            this.ypw = cf.this.emc();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.xq < this.ypw;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) cf.this.emc(this.xq, this.emc);
            this.xq++;
            this.dg = true;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.dg) {
                throw new IllegalStateException();
            }
            int i10 = this.xq - 1;
            this.xq = i10;
            this.ypw--;
            this.dg = false;
            cf.this.emc(i10);
        }
    }

    public final class ypw implements Set<K> {
        public ypw() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            cf.this.xq();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return cf.this.emc(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return cf.emc(cf.this.ypw(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return cf.emc(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iEmc = cf.this.emc() - 1; iEmc >= 0; iEmc--) {
                Object objEmc = cf.this.emc(iEmc, 0);
                iHashCode += objEmc == null ? 0 : objEmc.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return cf.this.emc() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new emc(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iEmc = cf.this.emc(obj);
            if (iEmc < 0) {
                return false;
            }
            cf.this.emc(iEmc);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return cf.ypw(cf.this.ypw(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return cf.xq(cf.this.ypw(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return cf.this.emc();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return cf.this.ypw(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) cf.this.emc(tArr, 0);
        }
    }

    public static <K, V> boolean emc(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean xq(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <K, V> boolean ypw(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public Set<K> dg() {
        if (this.ypw == null) {
            this.ypw = new ypw();
        }
        return this.ypw;
    }

    public abstract int emc();

    public abstract int emc(Object obj);

    public abstract Object emc(int i10, int i11);

    public abstract void emc(int i10);

    public abstract void xq();

    public abstract Map<K, V> ypw();

    public <T> T[] emc(T[] tArr, int i10) {
        int iEmc = emc();
        if (tArr.length < iEmc) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iEmc));
        }
        for (int i11 = 0; i11 < iEmc; i11++) {
            tArr[i11] = emc(i11, i10);
        }
        if (tArr.length > iEmc) {
            tArr[iEmc] = null;
        }
        return tArr;
    }

    public Object[] ypw(int i10) {
        int iEmc = emc();
        Object[] objArr = new Object[iEmc];
        for (int i11 = 0; i11 < iEmc; i11++) {
            objArr[i11] = emc(i11, i10);
        }
        return objArr;
    }

    public static <T> boolean emc(Set<T> set, Object obj) {
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
