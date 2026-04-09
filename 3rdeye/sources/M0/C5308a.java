package m0;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.l;

/* compiled from: ArrayMap.java */
/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5308a<K, V> extends C5316i<K, V> implements Map<K, V> {

    /* renamed from: e, reason: collision with root package name */
    public C5308a<K, V>.C0496a f43996e;

    /* renamed from: f, reason: collision with root package name */
    public C5308a<K, V>.c f43997f;

    /* renamed from: g, reason: collision with root package name */
    public C5308a<K, V>.e f43998g;

    /* compiled from: ArrayMap.java */
    /* renamed from: m0.a$a, reason: collision with other inner class name */
    public final class C0496a extends AbstractSet<Map.Entry<K, V>> {
        public C0496a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C5308a.this.f44030d;
        }
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: m0.a$b */
    public final class b extends AbstractC5312e<K> {
        public b() {
            super(C5308a.this.f44030d);
        }

        @Override // m0.AbstractC5312e
        public final K a(int i) {
            return C5308a.this.g(i);
        }

        @Override // m0.AbstractC5312e
        public final void c(int i) {
            C5308a.this.j(i);
        }
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: m0.a$d */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public int f44002b;

        /* renamed from: c, reason: collision with root package name */
        public int f44003c = -1;

        /* renamed from: d, reason: collision with root package name */
        public boolean f44004d;

        public d() {
            this.f44002b = C5308a.this.f44030d - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f44004d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f44003c;
            C5308a c5308a = C5308a.this;
            return l.b(key, c5308a.g(i)) && l.b(entry.getValue(), c5308a.l(this.f44003c));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f44004d) {
                return C5308a.this.g(this.f44003c);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f44004d) {
                return C5308a.this.l(this.f44003c);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f44003c < this.f44002b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f44004d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i = this.f44003c;
            C5308a c5308a = C5308a.this;
            K kG = c5308a.g(i);
            V vL = c5308a.l(this.f44003c);
            return (kG == null ? 0 : kG.hashCode()) ^ (vL != null ? vL.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f44003c++;
            this.f44004d = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f44004d) {
                throw new IllegalStateException();
            }
            C5308a.this.j(this.f44003c);
            this.f44003c--;
            this.f44002b--;
            this.f44004d = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            if (this.f44004d) {
                return C5308a.this.k(this.f44003c, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: m0.a$f */
    public final class f extends AbstractC5312e<V> {
        public f() {
            super(C5308a.this.f44030d);
        }

        @Override // m0.AbstractC5312e
        public final V a(int i) {
            return C5308a.this.l(i);
        }

        @Override // m0.AbstractC5312e
        public final void c(int i) {
            C5308a.this.j(i);
        }
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C5308a<K, V>.C0496a c0496a = this.f43996e;
        if (c0496a != null) {
            return c0496a;
        }
        C5308a<K, V>.C0496a c0496a2 = new C0496a();
        this.f43996e = c0496a2;
        return c0496a2;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        C5308a<K, V>.c cVar = this.f43997f;
        if (cVar != null) {
            return cVar;
        }
        C5308a<K, V>.c cVar2 = new c();
        this.f43997f = cVar2;
        return cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n(Collection<?> collection) {
        int i = this.f44030d;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f44030d;
    }

    public final boolean o(Collection<?> collection) {
        int i = this.f44030d;
        for (int i10 = i - 1; i10 >= 0; i10--) {
            if (!collection.contains(g(i10))) {
                j(i10);
            }
        }
        return i != this.f44030d;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        c(map.size() + this.f44030d);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        C5308a<K, V>.e eVar = this.f43998g;
        if (eVar != null) {
            return eVar;
        }
        C5308a<K, V>.e eVar2 = new e();
        this.f43998g = eVar2;
        return eVar2;
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: m0.a$c */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            C5308a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return C5308a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return C5308a.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            C5308a c5308a = C5308a.this;
            try {
                if (c5308a.f44030d == set.size()) {
                    return c5308a.m(set);
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            C5308a c5308a = C5308a.this;
            int iHashCode = 0;
            for (int i = c5308a.f44030d - 1; i >= 0; i--) {
                K kG = c5308a.g(i);
                iHashCode += kG == null ? 0 : kG.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return C5308a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            C5308a c5308a = C5308a.this;
            int iE = c5308a.e(obj);
            if (iE < 0) {
                return false;
            }
            c5308a.j(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return C5308a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return C5308a.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return C5308a.this.f44030d;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            C5308a c5308a = C5308a.this;
            int i = c5308a.f44030d;
            Object[] objArr = new Object[i];
            for (int i10 = 0; i10 < i; i10++) {
                objArr[i10] = c5308a.g(i10);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            C5308a c5308a = C5308a.this;
            int i = c5308a.f44030d;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i10 = 0; i10 < i; i10++) {
                tArr[i10] = c5308a.g(i10);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: m0.a$e */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            C5308a.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return C5308a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return C5308a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            C5308a c5308a = C5308a.this;
            int iA = c5308a.a(obj);
            if (iA < 0) {
                return false;
            }
            c5308a.j(iA);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            C5308a c5308a = C5308a.this;
            int i = c5308a.f44030d;
            int i10 = 0;
            boolean z10 = false;
            while (i10 < i) {
                if (collection.contains(c5308a.l(i10))) {
                    c5308a.j(i10);
                    i10--;
                    i--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            C5308a c5308a = C5308a.this;
            int i = c5308a.f44030d;
            int i10 = 0;
            boolean z10 = false;
            while (i10 < i) {
                if (!collection.contains(c5308a.l(i10))) {
                    c5308a.j(i10);
                    i10--;
                    i--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final int size() {
            return C5308a.this.f44030d;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            C5308a c5308a = C5308a.this;
            int i = c5308a.f44030d;
            Object[] objArr = new Object[i];
            for (int i10 = 0; i10 < i; i10++) {
                objArr[i10] = c5308a.l(i10);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            C5308a c5308a = C5308a.this;
            int i = c5308a.f44030d;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i10 = 0; i10 < i; i10++) {
                tArr[i10] = c5308a.l(i10);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }
    }
}
