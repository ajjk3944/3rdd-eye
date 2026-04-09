package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.yandex.mobile.ads.impl.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC4138k<K, V> extends AbstractC4152m<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: e, reason: collision with root package name */
    private transient Map<K, Collection<V>> f29398e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f29399f;

    /* renamed from: com.yandex.mobile.ads.impl.k$a */
    public class a extends vt0<K, Collection<V>> {

        /* renamed from: d, reason: collision with root package name */
        final transient Map<K, Collection<V>> f29400d;

        /* renamed from: com.yandex.mobile.ads.impl.k$a$a, reason: collision with other inner class name */
        public class C0410a extends st0<K, Collection<V>> {
            public C0410a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> setEntrySet = a.this.f29400d.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return a.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Object objRemove;
                Set<Map.Entry<K, Collection<V>>> setEntrySet = a.this.f29400d.entrySet();
                setEntrySet.getClass();
                try {
                    if (!setEntrySet.contains(obj)) {
                        return false;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    Objects.requireNonNull(entry);
                    AbstractC4138k abstractC4138k = AbstractC4138k.this;
                    Object key = entry.getKey();
                    Map map = abstractC4138k.f29398e;
                    map.getClass();
                    try {
                        objRemove = map.remove(key);
                    } catch (ClassCastException | NullPointerException unused) {
                        objRemove = null;
                    }
                    Collection collection = (Collection) objRemove;
                    if (collection == null) {
                        return true;
                    }
                    int size = collection.size();
                    collection.clear();
                    abstractC4138k.f29399f -= size;
                    return true;
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            }
        }

        /* renamed from: com.yandex.mobile.ads.impl.k$a$b */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: b, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f29403b;

            /* renamed from: c, reason: collision with root package name */
            Collection<V> f29404c;

            public b() {
                this.f29403b = a.this.f29400d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f29403b.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.f29403b.next();
                this.f29404c = next.getValue();
                return a.this.a(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                if (!(this.f29404c != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f29403b.remove();
                AbstractC4138k.this.f29399f -= this.f29404c.size();
                this.f29404c.clear();
                this.f29404c = null;
            }
        }

        public a(Map<K, Collection<V>> map) {
            this.f29400d = map;
        }

        public final Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            AbstractC4138k abstractC4138k = AbstractC4138k.this;
            Collection<V> value = entry.getValue();
            AbstractC4124i abstractC4124i = (AbstractC4124i) abstractC4138k;
            abstractC4124i.getClass();
            List list = (List) value;
            return new wj0(key, list instanceof RandomAccess ? new f(abstractC4124i, key, list, null) : new j(key, list, null));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            Map<K, Collection<V>> map = this.f29400d;
            AbstractC4138k abstractC4138k = AbstractC4138k.this;
            if (map == abstractC4138k.f29398e) {
                abstractC4138k.d();
                return;
            }
            b bVar = new b();
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f29400d;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            return this == obj || this.f29400d.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.f29400d;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            AbstractC4124i abstractC4124i = (AbstractC4124i) AbstractC4138k.this;
            abstractC4124i.getClass();
            List list = (List) collection2;
            return list instanceof RandomAccess ? new f(abstractC4124i, obj, list, null) : new j(obj, list, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.f29400d.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractC4138k.this.b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> collectionRemove = this.f29400d.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            List<V> list = ((n31) AbstractC4138k.this).f30753g.get();
            list.addAll(collectionRemove);
            AbstractC4138k.this.f29399f -= collectionRemove.size();
            collectionRemove.clear();
            return list;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.f29400d.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.f29400d.toString();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$b */
    public abstract class b<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f29406b;

        /* renamed from: c, reason: collision with root package name */
        K f29407c = null;

        /* renamed from: d, reason: collision with root package name */
        Collection<V> f29408d = null;

        /* renamed from: e, reason: collision with root package name */
        Iterator<V> f29409e = zp0.f36585b;

        public b() {
            this.f29406b = AbstractC4138k.this.f29398e.entrySet().iterator();
        }

        public abstract T a(K k10, V v10);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f29406b.hasNext() || this.f29409e.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f29409e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f29406b.next();
                this.f29407c = next.getKey();
                Collection<V> value = next.getValue();
                this.f29408d = value;
                this.f29409e = value.iterator();
            }
            return a(this.f29407c, this.f29409e.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f29409e.remove();
            Collection<V> collection = this.f29408d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f29406b.remove();
            }
            AbstractC4138k abstractC4138k = AbstractC4138k.this;
            abstractC4138k.f29399f--;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$c */
    public class c extends tt0<K, Collection<V>> {

        /* renamed from: com.yandex.mobile.ads.impl.k$c$a */
        public class a implements Iterator<K> {

            /* renamed from: b, reason: collision with root package name */
            Map.Entry<K, Collection<V>> f29412b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Iterator f29413c;

            public a(Iterator it) {
                this.f29413c = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f29413c.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f29413c.next();
                this.f29412b = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                Map.Entry<K, Collection<V>> entry = this.f29412b;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection<V> value = entry.getValue();
                this.f29413c.remove();
                AbstractC4138k.this.f29399f -= value.size();
                value.clear();
                this.f29412b = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return;
                }
                aVar.next();
                aVar.remove();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.f33771b.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return this == obj || this.f33771b.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.f33771b.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this.f33771b.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Collection collection = (Collection) this.f33771b.remove(obj);
            if (collection == null) {
                return false;
            }
            int size = collection.size();
            collection.clear();
            AbstractC4138k.this.f29399f -= size;
            return size > 0;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$d */
    public class d extends AbstractC4138k<K, V>.g implements NavigableMap<K, Collection<V>> {
        public d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC4138k.g
        public final SortedSet a() {
            return new e(b());
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC4138k.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) ((SortedMap) this.f29400d);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = b().ceilingEntry(k10);
            if (entryCeilingEntry == null) {
                return null;
            }
            return a(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k10) {
            return b().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return ((d) descendingMap()).navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(b().descendingMap());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = b().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return a(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> entryFloorEntry = b().floorEntry(k10);
            if (entryFloorEntry == null) {
                return null;
            }
            return a(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k10) {
            return b().floorKey(k10);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC4138k.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> entryHigherEntry = b().higherEntry(k10);
            if (entryHigherEntry == null) {
                return null;
            }
            return a(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k10) {
            return b().higherKey(k10);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC4138k.g, com.yandex.mobile.ads.impl.AbstractC4138k.a, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = b().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return a(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> entryLowerEntry = b().lowerEntry(k10);
            if (entryLowerEntry == null) {
                return null;
            }
            return a(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k10) {
            return b().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            Iterator<Map.Entry<K, Collection<V>>> it = entrySet().iterator();
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            List<V> list = ((n31) AbstractC4138k.this).f30753g.get();
            list.addAll(next.getValue());
            it.remove();
            K key = next.getKey();
            ((AbstractC4124i) AbstractC4138k.this).getClass();
            return new wj0(key, Collections.unmodifiableList(list));
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            Iterator<Map.Entry<K, V>> it = ((vt0) descendingMap()).entrySet().iterator();
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, V> next = it.next();
            List<V> list = ((n31) AbstractC4138k.this).f30753g.get();
            list.addAll((Collection) next.getValue());
            it.remove();
            K key = next.getKey();
            ((AbstractC4124i) AbstractC4138k.this).getClass();
            return new wj0(key, Collections.unmodifiableList(list));
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC4138k.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC4138k.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new d(b().headMap(k10, z10));
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC4138k.g, com.yandex.mobile.ads.impl.AbstractC4138k.a, java.util.AbstractMap, java.util.Map
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new d(b().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new d(b().tailMap(k10, z10));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$e */
    public class e extends AbstractC4138k<K, V>.h implements NavigableSet<K> {
        public e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC4138k.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) ((SortedMap) this.f33771b);
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k10) {
            return b().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((c) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new e(b().descendingMap());
        }

        @Override // java.util.NavigableSet
        public final K floor(K k10) {
            return b().floorKey(k10);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC4138k.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public final K higher(K k10) {
            return b().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k10) {
            return b().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            c.a aVar = (c.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k10 = (K) aVar.next();
            aVar.remove();
            return k10;
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            c.a aVar = (c.a) ((c) descendingSet()).iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k10 = (K) aVar.next();
            aVar.remove();
            return k10;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC4138k.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC4138k.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k10, boolean z10) {
            return new e(b().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new e(b().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k10, boolean z10) {
            return new e(b().tailMap(k10, z10));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$f */
    public class f extends AbstractC4138k<K, V>.j implements RandomAccess {
        public f(AbstractC4138k abstractC4138k, K k10, List<V> list, AbstractC4138k<K, V>.i iVar) {
            super(k10, list, iVar);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$g */
    public class g extends AbstractC4138k<K, V>.a implements SortedMap<K, Collection<V>> {

        /* renamed from: f, reason: collision with root package name */
        SortedSet<K> f29417f;

        public g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> a() {
            return new h(b());
        }

        public SortedMap<K, Collection<V>> b() {
            return (SortedMap) this.f29400d;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return b().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new g(b().headMap(k10));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return b().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new g(b().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new g(b().tailMap(k10));
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC4138k.a, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f29417f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetA = a();
            this.f29417f = sortedSetA;
            return sortedSetA;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$h */
    public class h extends AbstractC4138k<K, V>.c implements SortedSet<K> {
        public h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedMap<K, Collection<V>> b() {
            return (SortedMap) this.f33771b;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public final K first() {
            return b().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new h(b().headMap(k10));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return b().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new h(b().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new h(b().tailMap(k10));
        }
    }

    public AbstractC4138k(Map<K, Collection<V>> map) {
        pj1.a(map.isEmpty());
        this.f29398e = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> a(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final int g() {
        return this.f29399f;
    }

    @Override // com.yandex.mobile.ads.impl.j31
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f29398e.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f29399f++;
            return true;
        }
        List<V> list = ((n31) this).f30753g.get();
        if (!list.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f29399f++;
        this.f29398e.put(k10, list);
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4152m, com.yandex.mobile.ads.impl.j31
    public final Collection<V> values() {
        return super.values();
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$i */
    public class i extends AbstractCollection<V> {

        /* renamed from: b, reason: collision with root package name */
        final K f29420b;

        /* renamed from: c, reason: collision with root package name */
        Collection<V> f29421c;

        /* renamed from: d, reason: collision with root package name */
        final AbstractC4138k<K, V>.i f29422d;

        /* renamed from: e, reason: collision with root package name */
        final Collection<V> f29423e;

        public i(K k10, Collection<V> collection, AbstractC4138k<K, V>.i iVar) {
            this.f29420b = k10;
            this.f29421c = collection;
            this.f29422d = iVar;
            this.f29423e = iVar == null ? null : iVar.c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v10) {
            d();
            boolean zIsEmpty = this.f29421c.isEmpty();
            boolean zAdd = this.f29421c.add(v10);
            if (zAdd) {
                AbstractC4138k.this.f29399f++;
                if (zIsEmpty) {
                    b();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            d();
            int size = this.f29421c.size();
            boolean zAddAll = this.f29421c.addAll(collection);
            if (zAddAll) {
                int size2 = this.f29421c.size();
                AbstractC4138k abstractC4138k = AbstractC4138k.this;
                abstractC4138k.f29399f = (size2 - size) + abstractC4138k.f29399f;
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        public final void b() {
            AbstractC4138k<K, V>.i iVar = this.f29422d;
            if (iVar != null) {
                iVar.b();
            } else {
                AbstractC4138k.this.f29398e.put(this.f29420b, this.f29421c);
            }
        }

        public final Collection<V> c() {
            return this.f29421c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            d();
            int size = this.f29421c.size();
            if (size == 0) {
                return;
            }
            this.f29421c.clear();
            AbstractC4138k.this.f29399f -= size;
            e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            d();
            return this.f29421c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            d();
            return this.f29421c.containsAll(collection);
        }

        public final void d() {
            Collection<V> collection;
            AbstractC4138k<K, V>.i iVar = this.f29422d;
            if (iVar != null) {
                iVar.d();
                if (this.f29422d.f29421c != this.f29423e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f29421c.isEmpty() || (collection = (Collection) AbstractC4138k.this.f29398e.get(this.f29420b)) == null) {
                    return;
                }
                this.f29421c = collection;
            }
        }

        public final void e() {
            AbstractC4138k<K, V>.i iVar = this.f29422d;
            if (iVar != null) {
                iVar.e();
            } else if (this.f29421c.isEmpty()) {
                AbstractC4138k.this.f29398e.remove(this.f29420b);
            }
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            d();
            return this.f29421c.equals(obj);
        }

        @Override // java.util.Collection
        public final int hashCode() {
            d();
            return this.f29421c.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            d();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            d();
            boolean zRemove = this.f29421c.remove(obj);
            if (zRemove) {
                AbstractC4138k abstractC4138k = AbstractC4138k.this;
                abstractC4138k.f29399f--;
                e();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            d();
            int size = this.f29421c.size();
            boolean zRemoveAll = this.f29421c.removeAll(collection);
            if (zRemoveAll) {
                int size2 = this.f29421c.size();
                AbstractC4138k abstractC4138k = AbstractC4138k.this;
                abstractC4138k.f29399f = (size2 - size) + abstractC4138k.f29399f;
                e();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            d();
            int size = this.f29421c.size();
            boolean zRetainAll = this.f29421c.retainAll(collection);
            if (zRetainAll) {
                int size2 = this.f29421c.size();
                AbstractC4138k abstractC4138k = AbstractC4138k.this;
                abstractC4138k.f29399f = (size2 - size) + abstractC4138k.f29399f;
                e();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            d();
            return this.f29421c.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            d();
            return this.f29421c.toString();
        }

        /* renamed from: com.yandex.mobile.ads.impl.k$i$a */
        public class a implements Iterator<V> {

            /* renamed from: b, reason: collision with root package name */
            final Iterator<V> f29425b;

            /* renamed from: c, reason: collision with root package name */
            final Collection<V> f29426c;

            public a() {
                Collection<V> collection = i.this.f29421c;
                this.f29426c = collection;
                this.f29425b = AbstractC4138k.a(collection);
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                i.this.d();
                if (i.this.f29421c == this.f29426c) {
                    return this.f29425b.hasNext();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final V next() {
                i.this.d();
                if (i.this.f29421c == this.f29426c) {
                    return this.f29425b.next();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f29425b.remove();
                i iVar = i.this;
                AbstractC4138k abstractC4138k = AbstractC4138k.this;
                abstractC4138k.f29399f--;
                iVar.e();
            }

            public a(ListIterator listIterator) {
                this.f29426c = i.this.f29421c;
                this.f29425b = listIterator;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.k$j */
    public class j extends AbstractC4138k<K, V>.i implements List<V> {

        /* renamed from: com.yandex.mobile.ads.impl.k$j$a */
        public class a extends AbstractC4138k<K, V>.i.a implements ListIterator<V> {
            public a() {
                super();
            }

            private ListIterator<V> a() {
                i.this.d();
                if (i.this.f29421c == this.f29426c) {
                    return (ListIterator) this.f29425b;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.ListIterator
            public final void add(V v10) {
                boolean zIsEmpty = j.this.isEmpty();
                a().add(v10);
                j jVar = j.this;
                AbstractC4138k.this.f29399f++;
                if (zIsEmpty) {
                    jVar.b();
                }
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return a().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return a().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return a().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return a().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v10) {
                a().set(v10);
            }

            public a(int i) {
                super(j.this.f().listIterator(i));
            }
        }

        public j(K k10, List<V> list, AbstractC4138k<K, V>.i iVar) {
            super(k10, list, iVar);
        }

        @Override // java.util.List
        public final void add(int i, V v10) {
            d();
            boolean zIsEmpty = this.f29421c.isEmpty();
            ((List) this.f29421c).add(i, v10);
            AbstractC4138k.this.f29399f++;
            if (zIsEmpty) {
                b();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            d();
            int size = this.f29421c.size();
            boolean zAddAll = ((List) this.f29421c).addAll(i, collection);
            if (zAddAll) {
                int size2 = this.f29421c.size();
                AbstractC4138k abstractC4138k = AbstractC4138k.this;
                abstractC4138k.f29399f = (size2 - size) + abstractC4138k.f29399f;
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        public final List<V> f() {
            return (List) this.f29421c;
        }

        @Override // java.util.List
        public final V get(int i) {
            d();
            return (V) ((List) this.f29421c).get(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            d();
            return ((List) this.f29421c).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            d();
            return ((List) this.f29421c).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            d();
            return new a();
        }

        @Override // java.util.List
        public final V remove(int i) {
            d();
            V v10 = (V) ((List) this.f29421c).remove(i);
            AbstractC4138k abstractC4138k = AbstractC4138k.this;
            abstractC4138k.f29399f--;
            e();
            return v10;
        }

        @Override // java.util.List
        public final V set(int i, V v10) {
            d();
            return (V) ((List) this.f29421c).set(i, v10);
        }

        @Override // java.util.List
        public final List<V> subList(int i, int i10) {
            d();
            AbstractC4138k abstractC4138k = AbstractC4138k.this;
            K k10 = this.f29420b;
            List listSubList = ((List) this.f29421c).subList(i, i10);
            AbstractC4138k<K, V>.i iVar = this.f29422d;
            if (iVar == null) {
                iVar = this;
            }
            abstractC4138k.getClass();
            return listSubList instanceof RandomAccess ? new f(abstractC4138k, k10, listSubList, iVar) : new j(k10, listSubList, iVar);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i) {
            d();
            return new a(i);
        }
    }

    public final Map<K, Collection<V>> c() {
        return this.f29398e;
    }

    public final void d() {
        Iterator<Collection<V>> it = this.f29398e.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f29398e.clear();
        this.f29399f = 0;
    }

    public final Map<K, Collection<V>> e() {
        Map<K, Collection<V>> map = this.f29398e;
        return map instanceof NavigableMap ? new d((NavigableMap) this.f29398e) : map instanceof SortedMap ? new g((SortedMap) this.f29398e) : new a(this.f29398e);
    }

    public final Set<K> f() {
        Map<K, Collection<V>> map = this.f29398e;
        return map instanceof NavigableMap ? new e((NavigableMap) this.f29398e) : map instanceof SortedMap ? new h((SortedMap) this.f29398e) : new c(this.f29398e);
    }

    public final void a(Map<K, Collection<V>> map) {
        this.f29398e = map;
        this.f29399f = 0;
        for (Collection<V> collection : map.values()) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException();
            }
            this.f29399f = collection.size() + this.f29399f;
        }
    }
}
