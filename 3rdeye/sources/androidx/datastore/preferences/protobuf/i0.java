package androidx.datastore.preferences.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes.dex */
public class i0<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f15624b;

    /* renamed from: c, reason: collision with root package name */
    public List<i0<K, V>.d> f15625c = Collections.EMPTY_LIST;

    /* renamed from: d, reason: collision with root package name */
    public Map<K, V> f15626d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15627e;

    /* renamed from: f, reason: collision with root package name */
    public volatile i0<K, V>.f f15628f;

    /* renamed from: g, reason: collision with root package name */
    public Map<K, V> f15629g;

    /* renamed from: h, reason: collision with root package name */
    public volatile i0<K, V>.b f15630h;

    /* compiled from: SmallSortedMap.java */
    public class a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public int f15631b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f15632c;

        public a() {
            this.f15631b = i0.this.f15625c.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f15632c == null) {
                this.f15632c = i0.this.f15629g.entrySet().iterator();
            }
            return this.f15632c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.f15631b;
            return (i > 0 && i <= i0.this.f15625c.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return a().next();
            }
            List<i0<K, V>.d> list = i0.this.f15625c;
            int i = this.f15631b - 1;
            this.f15631b = i;
            return list.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class b extends i0<K, V>.f {
        public b() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.i0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }
    }

    /* compiled from: SmallSortedMap.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15635a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final b f15636b = new b();

        /* compiled from: SmallSortedMap.java */
        public static class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap.java */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return c.f15635a;
            }
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class d implements Map.Entry<K, V>, Comparable<i0<K, V>.d> {

        /* renamed from: b, reason: collision with root package name */
        public final K f15637b;

        /* renamed from: c, reason: collision with root package name */
        public V f15638c;

        public d() {
            throw null;
        }

        public d(K k10, V v10) {
            this.f15637b = k10;
            this.f15638c = v10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f15637b.compareTo(((d) obj).f15637b);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k10 = this.f15637b;
                    if (k10 == null ? key == null : k10.equals(key)) {
                        V v10 = this.f15638c;
                        Object value = entry.getValue();
                        if (v10 == null ? value == null : v10.equals(value)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f15637b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f15638c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f15637b;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f15638c;
            return (v10 != null ? v10.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            int i = i0.i;
            i0.this.c();
            V v11 = this.f15638c;
            this.f15638c = v10;
            return v11;
        }

        public final String toString() {
            return this.f15637b + "=" + this.f15638c;
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class e implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public int f15640b = -1;

        /* renamed from: c, reason: collision with root package name */
        public boolean f15641c;

        /* renamed from: d, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f15642d;

        public e() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f15642d == null) {
                this.f15642d = i0.this.f15626d.entrySet().iterator();
            }
            return this.f15642d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.f15640b + 1;
            i0 i0Var = i0.this;
            return i < i0Var.f15625c.size() || (!i0Var.f15626d.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f15641c = true;
            int i = this.f15640b + 1;
            this.f15640b = i;
            i0 i0Var = i0.this;
            return i < i0Var.f15625c.size() ? i0Var.f15625c.get(this.f15640b) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f15641c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f15641c = false;
            int i = i0.i;
            i0 i0Var = i0.this;
            i0Var.c();
            if (this.f15640b >= i0Var.f15625c.size()) {
                a().remove();
                return;
            }
            int i10 = this.f15640b;
            this.f15640b = i10 - 1;
            i0Var.j(i10);
        }
    }

    /* compiled from: SmallSortedMap.java */
    public class f extends AbstractSet<Map.Entry<K, V>> {
        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            i0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            i0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            i0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return i0.this.size();
        }
    }

    public i0(int i10) {
        this.f15624b = i10;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f15626d = map;
        this.f15629g = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(K r5) {
        /*
            r4 = this;
            java.util.List<androidx.datastore.preferences.protobuf.i0<K, V>$d> r0 = r4.f15625c
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List<androidx.datastore.preferences.protobuf.i0<K, V>$d> r2 = r4.f15625c
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.i0$d r2 = (androidx.datastore.preferences.protobuf.i0.d) r2
            K extends java.lang.Comparable<K> r2 = r2.f15637b
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<androidx.datastore.preferences.protobuf.i0<K, V>$d> r3 = r4.f15625c
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.i0$d r3 = (androidx.datastore.preferences.protobuf.i0.d) r3
            K extends java.lang.Comparable<K> r3 = r3.f15637b
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i0.a(java.lang.Comparable):int");
    }

    public final void c() {
        if (this.f15627e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.f15625c.isEmpty()) {
            this.f15625c.clear();
        }
        if (this.f15626d.isEmpty()) {
            return;
        }
        this.f15626d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f15626d.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i10) {
        return this.f15625c.get(i10);
    }

    public final Iterable<Map.Entry<K, V>> e() {
        return this.f15626d.isEmpty() ? c.f15636b : this.f15626d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f15628f == null) {
            this.f15628f = new f();
        }
        return this.f15628f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        int size = size();
        if (size == i0Var.size()) {
            int size2 = this.f15625c.size();
            if (size2 != i0Var.f15625c.size()) {
                return ((AbstractSet) entrySet()).equals(i0Var.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (d(i10).equals(i0Var.d(i10))) {
                }
            }
            if (size2 != size) {
                return this.f15626d.equals(i0Var.f15626d);
            }
            return true;
        }
        return false;
    }

    public final SortedMap<K, V> f() {
        c();
        if (this.f15626d.isEmpty() && !(this.f15626d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f15626d = treeMap;
            this.f15629g = treeMap.descendingMap();
        }
        return (SortedMap) this.f15626d;
    }

    public void g() {
        if (this.f15627e) {
            return;
        }
        this.f15626d = this.f15626d.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f15626d);
        this.f15629g = this.f15629g.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f15629g);
        this.f15627e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? this.f15625c.get(iA).f15638c : this.f15626d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        c();
        int iA = a(k10);
        if (iA >= 0) {
            return this.f15625c.get(iA).setValue(v10);
        }
        c();
        boolean zIsEmpty = this.f15625c.isEmpty();
        int i10 = this.f15624b;
        if (zIsEmpty && !(this.f15625c instanceof ArrayList)) {
            this.f15625c = new ArrayList(i10);
        }
        int i11 = -(iA + 1);
        if (i11 >= i10) {
            return f().put(k10, v10);
        }
        if (this.f15625c.size() == i10) {
            i0<K, V>.d dVarRemove = this.f15625c.remove(i10 - 1);
            f().put(dVarRemove.f15637b, dVarRemove.f15638c);
        }
        this.f15625c.add(i11, new d(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f15625c.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += this.f15625c.get(i10).hashCode();
        }
        return this.f15626d.size() > 0 ? this.f15626d.hashCode() + iHashCode : iHashCode;
    }

    public final V j(int i10) {
        c();
        V v10 = this.f15625c.remove(i10).f15638c;
        if (!this.f15626d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = f().entrySet().iterator();
            List<i0<K, V>.d> list = this.f15625c;
            Map.Entry<K, V> next = it.next();
            list.add(new d(next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return j(iA);
        }
        if (this.f15626d.isEmpty()) {
            return null;
        }
        return this.f15626d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f15626d.size() + this.f15625c.size();
    }
}
