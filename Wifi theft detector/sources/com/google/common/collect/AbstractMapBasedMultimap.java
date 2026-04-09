package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import com.google.common.collect.c;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
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

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
abstract class AbstractMapBasedMultimap<K, V> extends com.google.common.collect.c implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: d, reason: collision with root package name */
    public transient Map f11621d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f11622e;

    public class a extends c {
        public a(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(Object obj, Object obj2) {
            return Maps.e(obj, obj2);
        }
    }

    public class b extends Maps.j {

        /* renamed from: d, reason: collision with root package name */
        public final transient Map f11623d;

        public class a extends Maps.e {
            public a() {
            }

            @Override // com.google.common.collect.Maps.e
            public Map b() {
                return b.this;
            }

            @Override // com.google.common.collect.Maps.e, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return com.google.common.collect.k.c(b.this.f11623d.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return b.this.new C0216b();
            }

            @Override // com.google.common.collect.Maps.e, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap.this.y(entry.getKey());
                return true;
            }
        }

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$b$b, reason: collision with other inner class name */
        public class C0216b implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator f11626a;

            /* renamed from: b, reason: collision with root package name */
            public Collection f11627b;

            public C0216b() {
                this.f11626a = b.this.f11623d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f11626a.next();
                this.f11627b = (Collection) entry.getValue();
                return b.this.h(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f11626a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.g.s(this.f11627b != null, "no calls to next() since the last call to remove()");
                this.f11626a.remove();
                AbstractMapBasedMultimap.q(AbstractMapBasedMultimap.this, this.f11627b.size());
                this.f11627b.clear();
                this.f11627b = null;
            }
        }

        public b(Map map) {
            this.f11623d = map;
        }

        @Override // com.google.common.collect.Maps.j
        public Set a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f11623d == AbstractMapBasedMultimap.this.f11621d) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.c(new C0216b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Maps.j(this.f11623d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection get(Object obj) {
            Collection collection = (Collection) Maps.k(this.f11623d, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.B(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f11623d.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f11623d.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection collectionS = AbstractMapBasedMultimap.this.s();
            collectionS.addAll(collection);
            AbstractMapBasedMultimap.q(AbstractMapBasedMultimap.this, collection.size());
            collection.clear();
            return collectionS;
        }

        public Map.Entry h(Map.Entry entry) {
            Object key = entry.getKey();
            return Maps.e(key, AbstractMapBasedMultimap.this.B(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f11623d.hashCode();
        }

        @Override // com.google.common.collect.Maps.j, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set j() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f11623d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f11623d.toString();
        }
    }

    public abstract class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f11629a;

        /* renamed from: b, reason: collision with root package name */
        public Object f11630b = null;

        /* renamed from: c, reason: collision with root package name */
        public Collection f11631c = null;

        /* renamed from: d, reason: collision with root package name */
        public Iterator f11632d = Iterators.g();

        public c() {
            this.f11629a = AbstractMapBasedMultimap.this.f11621d.entrySet().iterator();
        }

        public abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11629a.hasNext() || this.f11632d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f11632d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f11629a.next();
                this.f11630b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f11631c = collection;
                this.f11632d = collection.iterator();
            }
            return a(f0.a(this.f11630b), this.f11632d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f11632d.remove();
            Collection collection = this.f11631c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f11629a.remove();
            }
            AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this);
        }
    }

    public class d extends Maps.g {

        public class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            public Map.Entry f11635a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f11636b;

            public a(Iterator it) {
                this.f11636b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f11636b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f11636b.next();
                this.f11635a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.g.s(this.f11635a != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f11635a.getValue();
                this.f11636b.remove();
                AbstractMapBasedMultimap.q(AbstractMapBasedMultimap.this, collection.size());
                collection.clear();
                this.f11635a = null;
            }
        }

        public d(Map map) {
            super(map);
        }

        @Override // com.google.common.collect.Maps.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return b().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || b().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return b().keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(b().entrySet().iterator());
        }

        @Override // com.google.common.collect.Maps.g, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) b().remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.q(AbstractMapBasedMultimap.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    public class e extends h implements NavigableMap {
        public e(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry<K, V> entryCeilingEntry = k().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return h(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return k().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return new e(k().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry<K, V> entryFirstEntry = k().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return h(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry<K, V> entryFloorEntry = k().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return h(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return k().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry<K, V> entryHigherEntry = k().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return h(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return k().higherKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet i() {
            return new f(k());
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry<K, V> entryLastEntry = k().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return h(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry<K, V> entryLowerEntry = k().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return h(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return k().lowerKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        public Map.Entry n(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection collectionS = AbstractMapBasedMultimap.this.s();
            collectionS.addAll((Collection) entry.getValue());
            it.remove();
            return Maps.e(entry.getKey(), AbstractMapBasedMultimap.this.A(collectionS));
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return j();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap k() {
            return (NavigableMap) super.k();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return n(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return n(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z10) {
            return new e(k().headMap(obj, z10));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.h, com.google.common.collect.AbstractMapBasedMultimap.b, com.google.common.collect.Maps.j, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet j() {
            return (NavigableSet) super.j();
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
            return new e(k().subMap(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z10) {
            return new e(k().tailMap(obj, z10));
        }
    }

    public class f extends i implements NavigableSet {
        public f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return c().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return new f(c().descendingMap());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap c() {
            return (NavigableMap) super.c();
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return c().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return c().higherKey(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return c().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return Iterators.j(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return Iterators.j(descendingIterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z10) {
            return new f(c().headMap(obj, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
            return new f(c().subMap(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z10) {
            return new f(c().tailMap(obj, z10));
        }
    }

    public class g extends k implements RandomAccess {
        public g(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }
    }

    public class h extends b implements SortedMap {

        /* renamed from: f, reason: collision with root package name */
        public SortedSet f11640f;

        public h(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return k().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return k().firstKey();
        }

        public SortedMap headMap(Object obj) {
            return new h(k().headMap(obj));
        }

        @Override // com.google.common.collect.Maps.j
        public SortedSet i() {
            return new i(k());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.b, com.google.common.collect.Maps.j, java.util.AbstractMap, java.util.Map
        public SortedSet j() {
            SortedSet sortedSet = this.f11640f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet sortedSetI = i();
            this.f11640f = sortedSetI;
            return sortedSetI;
        }

        public SortedMap k() {
            return (SortedMap) this.f11623d;
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return k().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new h(k().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return new h(k().tailMap(obj));
        }
    }

    public class i extends d implements SortedSet {
        public i(SortedMap sortedMap) {
            super(sortedMap);
        }

        public SortedMap c() {
            return (SortedMap) super.b();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return c().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return c().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new i(c().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return c().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new i(c().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new i(c().tailMap(obj));
        }
    }

    public class l extends n implements NavigableSet {
        public l(Object obj, NavigableSet navigableSet, j jVar) {
            super(obj, navigableSet, jVar);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return h().ceiling(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return new j.a(h().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return j(h().descendingSet());
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return h().floor(obj);
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z10) {
            return j(h().headSet(obj, z10));
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return h().higher(obj);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet h() {
            return (NavigableSet) super.h();
        }

        public final NavigableSet j(NavigableSet navigableSet) {
            return new l(this.f11643a, navigableSet, c() == null ? this : c());
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return h().lower(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return Iterators.j(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return Iterators.j(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
            return j(h().subSet(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z10) {
            return j(h().tailSet(obj, z10));
        }
    }

    public class m extends j implements Set {
        public m(Object obj, Set set) {
            super(obj, set, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.j, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zE = Sets.e((Set) this.f11644b, collection);
            if (zE) {
                AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, this.f11644b.size() - size);
                g();
            }
            return zE;
        }
    }

    public class n extends j implements SortedSet {
        public n(Object obj, SortedSet sortedSet, j jVar) {
            super(obj, sortedSet, jVar);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return h().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            f();
            return h().first();
        }

        public SortedSet h() {
            return (SortedSet) d();
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            f();
            return new n(e(), h().headSet(obj), c() == null ? this : c());
        }

        @Override // java.util.SortedSet
        public Object last() {
            f();
            return h().last();
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            f();
            return new n(e(), h().subSet(obj, obj2), c() == null ? this : c());
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            f();
            return new n(e(), h().tailSet(obj), c() == null ? this : c());
        }
    }

    public AbstractMapBasedMultimap(Map map) {
        com.google.common.base.g.d(map.isEmpty());
        this.f11621d = map;
    }

    public static /* synthetic */ int n(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i10 = abstractMapBasedMultimap.f11622e;
        abstractMapBasedMultimap.f11622e = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int o(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i10 = abstractMapBasedMultimap.f11622e;
        abstractMapBasedMultimap.f11622e = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int p(AbstractMapBasedMultimap abstractMapBasedMultimap, int i10) {
        int i11 = abstractMapBasedMultimap.f11622e + i10;
        abstractMapBasedMultimap.f11622e = i11;
        return i11;
    }

    public static /* synthetic */ int q(AbstractMapBasedMultimap abstractMapBasedMultimap, int i10) {
        int i11 = abstractMapBasedMultimap.f11622e - i10;
        abstractMapBasedMultimap.f11622e = i11;
        return i11;
    }

    public static Iterator x(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public abstract Collection A(Collection collection);

    public abstract Collection B(Object obj, Collection collection);

    public final List C(Object obj, List list, j jVar) {
        return list instanceof RandomAccess ? new g(this, obj, list, jVar) : new k(obj, list, jVar);
    }

    @Override // com.google.common.collect.c0
    public Collection a(Object obj) {
        Collection collection = (Collection) this.f11621d.remove(obj);
        if (collection == null) {
            return w();
        }
        Collection collectionS = s();
        collectionS.addAll(collection);
        this.f11622e -= collection.size();
        collection.clear();
        return A(collectionS);
    }

    @Override // com.google.common.collect.c0
    public void clear() {
        Iterator<V> it = this.f11621d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f11621d.clear();
        this.f11622e = 0;
    }

    @Override // com.google.common.collect.c0
    public boolean containsKey(Object obj) {
        return this.f11621d.containsKey(obj);
    }

    @Override // com.google.common.collect.c
    public Map g() {
        return new b(this.f11621d);
    }

    @Override // com.google.common.collect.c0
    public Collection get(Object obj) {
        Collection collectionT = (Collection) this.f11621d.get(obj);
        if (collectionT == null) {
            collectionT = t(obj);
        }
        return B(obj, collectionT);
    }

    @Override // com.google.common.collect.c
    public Collection h() {
        return this instanceof o0 ? new c.b(this) : new c.a();
    }

    @Override // com.google.common.collect.c
    public Set i() {
        return new d(this.f11621d);
    }

    @Override // com.google.common.collect.c
    public Collection j() {
        return super.j();
    }

    @Override // com.google.common.collect.c
    public Iterator k() {
        return new a(this);
    }

    public abstract Collection s();

    @Override // com.google.common.collect.c0
    public int size() {
        return this.f11622e;
    }

    public Collection t(Object obj) {
        return s();
    }

    public final Map u() {
        Map map = this.f11621d;
        return map instanceof NavigableMap ? new e((NavigableMap) this.f11621d) : map instanceof SortedMap ? new h((SortedMap) this.f11621d) : new b(this.f11621d);
    }

    public final Set v() {
        Map map = this.f11621d;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f11621d) : map instanceof SortedMap ? new i((SortedMap) this.f11621d) : new d(this.f11621d);
    }

    public abstract Collection w();

    public final void y(Object obj) {
        Collection collection = (Collection) Maps.l(this.f11621d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f11622e -= size;
        }
    }

    public final void z(Map map) {
        this.f11621d = map;
        this.f11622e = 0;
        for (V v10 : map.values()) {
            com.google.common.base.g.d(!v10.isEmpty());
            this.f11622e += v10.size();
        }
    }

    public class j extends AbstractCollection {

        /* renamed from: a, reason: collision with root package name */
        public final Object f11643a;

        /* renamed from: b, reason: collision with root package name */
        public Collection f11644b;

        /* renamed from: c, reason: collision with root package name */
        public final j f11645c;

        /* renamed from: d, reason: collision with root package name */
        public final Collection f11646d;

        public j(Object obj, Collection collection, j jVar) {
            this.f11643a = obj;
            this.f11644b = collection;
            this.f11645c = jVar;
            this.f11646d = jVar == null ? null : jVar.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            f();
            boolean zIsEmpty = this.f11644b.isEmpty();
            boolean zAdd = this.f11644b.add(obj);
            if (zAdd) {
                AbstractMapBasedMultimap.n(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    b();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f11644b.addAll(collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, this.f11644b.size() - size);
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void b() {
            j jVar = this.f11645c;
            if (jVar != null) {
                jVar.b();
            } else {
                AbstractMapBasedMultimap.this.f11621d.put(this.f11643a, this.f11644b);
            }
        }

        public j c() {
            return this.f11645c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f11644b.clear();
            AbstractMapBasedMultimap.q(AbstractMapBasedMultimap.this, size);
            g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            f();
            return this.f11644b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            f();
            return this.f11644b.containsAll(collection);
        }

        public Collection d() {
            return this.f11644b;
        }

        public Object e() {
            return this.f11643a;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            f();
            return this.f11644b.equals(obj);
        }

        public void f() {
            Collection collection;
            j jVar = this.f11645c;
            if (jVar != null) {
                jVar.f();
                if (this.f11645c.d() != this.f11646d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f11644b.isEmpty() || (collection = (Collection) AbstractMapBasedMultimap.this.f11621d.get(this.f11643a)) == null) {
                    return;
                }
                this.f11644b = collection;
            }
        }

        public void g() {
            j jVar = this.f11645c;
            if (jVar != null) {
                jVar.g();
            } else if (this.f11644b.isEmpty()) {
                AbstractMapBasedMultimap.this.f11621d.remove(this.f11643a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            f();
            return this.f11644b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            f();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            f();
            boolean zRemove = this.f11644b.remove(obj);
            if (zRemove) {
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this);
                g();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f11644b.removeAll(collection);
            if (zRemoveAll) {
                AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, this.f11644b.size() - size);
                g();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            com.google.common.base.g.m(collection);
            int size = size();
            boolean zRetainAll = this.f11644b.retainAll(collection);
            if (zRetainAll) {
                AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, this.f11644b.size() - size);
                g();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            f();
            return this.f11644b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            f();
            return this.f11644b.toString();
        }

        public class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator f11648a;

            /* renamed from: b, reason: collision with root package name */
            public final Collection f11649b;

            public a() {
                Collection collection = j.this.f11644b;
                this.f11649b = collection;
                this.f11648a = AbstractMapBasedMultimap.x(collection);
            }

            public Iterator a() {
                b();
                return this.f11648a;
            }

            public void b() {
                j.this.f();
                if (j.this.f11644b != this.f11649b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f11648a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                b();
                return this.f11648a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f11648a.remove();
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this);
                j.this.g();
            }

            public a(Iterator it) {
                this.f11649b = j.this.f11644b;
                this.f11648a = it;
            }
        }
    }

    public class k extends j implements List {

        public class a extends j.a implements ListIterator {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean zIsEmpty = k.this.isEmpty();
                c().add(obj);
                AbstractMapBasedMultimap.n(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    k.this.b();
                }
            }

            public final ListIterator c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                c().set(obj);
            }

            public a(int i10) {
                super(k.this.h().listIterator(i10));
            }
        }

        public k(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            f();
            boolean zIsEmpty = d().isEmpty();
            h().add(i10, obj);
            AbstractMapBasedMultimap.n(AbstractMapBasedMultimap.this);
            if (zIsEmpty) {
                b();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = h().addAll(i10, collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.p(AbstractMapBasedMultimap.this, d().size() - size);
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public Object get(int i10) {
            f();
            return h().get(i10);
        }

        public List h() {
            return (List) d();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            f();
            return h().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            f();
            return h().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            f();
            return new a();
        }

        @Override // java.util.List
        public Object remove(int i10) {
            f();
            Object objRemove = h().remove(i10);
            AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this);
            g();
            return objRemove;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            f();
            return h().set(i10, obj);
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            f();
            return AbstractMapBasedMultimap.this.C(e(), h().subList(i10, i11), c() == null ? this : c());
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            f();
            return new a(i10);
        }
    }
}
