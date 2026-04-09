package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class ImmutableSortedMap<K, V> extends ImmutableSortedMapFauxverideShim<K, V> implements NavigableMap<K, V> {

    /* renamed from: h, reason: collision with root package name */
    public static final Comparator f11829h = j0.d();

    /* renamed from: i, reason: collision with root package name */
    public static final ImmutableSortedMap f11830i = new ImmutableSortedMap(ImmutableSortedSet.N(j0.d()), ImmutableList.A());
    private static final long serialVersionUID = 0;

    /* renamed from: e, reason: collision with root package name */
    public final transient RegularImmutableSortedSet f11831e;

    /* renamed from: f, reason: collision with root package name */
    public final transient ImmutableList f11832f;

    /* renamed from: g, reason: collision with root package name */
    public transient ImmutableSortedMap f11833g;

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;
        private final Comparator<? super K> comparator;

        public SerializedForm(ImmutableSortedMap immutableSortedMap) {
            super(immutableSortedMap);
            this.comparator = immutableSortedMap.comparator();
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a e(int i10) {
            return new a(this.comparator);
        }
    }

    public static class a extends ImmutableMap.a {

        /* renamed from: f, reason: collision with root package name */
        public transient Object[] f11834f;

        /* renamed from: g, reason: collision with root package name */
        public transient Object[] f11835g;

        /* renamed from: h, reason: collision with root package name */
        public final Comparator f11836h;

        public a(Comparator comparator) {
            this(comparator, 4);
        }

        public final void e(int i10) {
            Object[] objArr = this.f11834f;
            if (i10 > objArr.length) {
                int iA = ImmutableCollection.b.a(objArr.length, i10);
                this.f11834f = Arrays.copyOf(this.f11834f, iA);
                this.f11835g = Arrays.copyOf(this.f11835g, iA);
            }
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedMap a() {
            return d();
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final ImmutableSortedMap c() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedMap d() {
            int i10 = this.f11796c;
            if (i10 == 0) {
                return ImmutableSortedMap.v(this.f11836h);
            }
            if (i10 == 1) {
                Comparator comparator = this.f11836h;
                Object obj = this.f11834f[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.f11835g[0];
                Objects.requireNonNull(obj2);
                return ImmutableSortedMap.C(comparator, obj, obj2);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f11834f, i10);
            Arrays.sort(objArrCopyOf, this.f11836h);
            Object[] objArr = new Object[this.f11796c];
            for (int i11 = 0; i11 < this.f11796c; i11++) {
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    if (this.f11836h.compare(objArrCopyOf[i12], objArrCopyOf[i11]) == 0) {
                        String strValueOf = String.valueOf(objArrCopyOf[i12]);
                        String strValueOf2 = String.valueOf(objArrCopyOf[i11]);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
                        sb.append("keys required to be distinct but compared as equal: ");
                        sb.append(strValueOf);
                        sb.append(" and ");
                        sb.append(strValueOf2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                Object obj3 = this.f11834f[i11];
                Objects.requireNonNull(obj3);
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, this.f11836h);
                Object obj4 = this.f11835g[i11];
                Objects.requireNonNull(obj4);
                objArr[iBinarySearch] = obj4;
            }
            return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.s(objArrCopyOf), this.f11836h), ImmutableList.s(objArr));
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a g(Object obj, Object obj2) {
            e(this.f11796c + 1);
            j.a(obj, obj2);
            Object[] objArr = this.f11834f;
            int i10 = this.f11796c;
            objArr[i10] = obj;
            this.f11835g[i10] = obj2;
            this.f11796c = i10 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a h(Map.Entry entry) {
            super.h(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public a i(Iterable iterable) {
            super.i(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a j(Map map) {
            super.j(map);
            return this;
        }

        public a(Comparator comparator, int i10) {
            this.f11836h = (Comparator) com.google.common.base.g.m(comparator);
            this.f11834f = new Object[i10];
            this.f11835g = new Object[i10];
        }
    }

    public ImmutableSortedMap(RegularImmutableSortedSet regularImmutableSortedSet, ImmutableList immutableList) {
        this(regularImmutableSortedSet, immutableList, null);
    }

    public static ImmutableSortedMap B() {
        return f11830i;
    }

    public static ImmutableSortedMap C(Comparator comparator, Object obj, Object obj2) {
        return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.B(obj), (Comparator) com.google.common.base.g.m(comparator)), ImmutableList.B(obj2));
    }

    public static ImmutableSortedMap v(Comparator comparator) {
        return j0.d().equals(comparator) ? B() : new ImmutableSortedMap(ImmutableSortedSet.N(comparator), ImmutableList.A());
    }

    @Override // java.util.NavigableMap
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet navigableKeySet() {
        return this.f11831e;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        com.google.common.base.g.m(obj);
        com.google.common.base.g.m(obj2);
        com.google.common.base.g.j(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z11).tailMap(obj, z10);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap tailMap(Object obj, boolean z10) {
        return w(this.f11831e.b0(com.google.common.base.g.m(obj), z10), size());
    }

    @Override // java.util.NavigableMap
    public Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Object ceilingKey(Object obj) {
        return Maps.h(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public Comparator comparator() {
        return keySet().comparator();
    }

    @Override // java.util.NavigableMap
    public Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().v().get(0);
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap
    public Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Object floorKey(Object obj) {
        return Maps.h(floorEntry(obj));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public Object get(Object obj) {
        int iIndexOf = this.f11831e.indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        return this.f11832f.get(iIndexOf);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet h() {
        return isEmpty() ? ImmutableSet.F() : new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet
            @Override // com.google.common.collect.ImmutableSet
            public ImmutableList D() {
                return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                    @Override // java.util.List
                    /* renamed from: G, reason: merged with bridge method [inline-methods] */
                    public Map.Entry get(int i10) {
                        return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.f11831e.v().get(i10), ImmutableSortedMap.this.f11832f.get(i10));
                    }

                    @Override // com.google.common.collect.ImmutableCollection
                    public boolean i() {
                        return true;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return ImmutableSortedMap.this.size();
                    }
                };
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet
            public ImmutableMap J() {
                return ImmutableSortedMap.this;
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
            /* renamed from: j */
            public v0 iterator() {
                return v().iterator();
            }
        };
    }

    @Override // java.util.NavigableMap
    public Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Object higherKey(Object obj) {
        return Maps.h(higherEntry(obj));
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection j() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    /* renamed from: k */
    public ImmutableSet entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().v().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return keySet().last();
    }

    @Override // java.util.NavigableMap
    public Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Object lowerKey(Object obj) {
        return Maps.h(lowerEntry(obj));
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean m() {
        return this.f11831e.i() || this.f11832f.i();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    /* renamed from: p */
    public ImmutableCollection values() {
        return this.f11832f;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.f11832f.size();
    }

    @Override // java.util.NavigableMap
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet descendingKeySet() {
        return this.f11831e.descendingSet();
    }

    @Override // java.util.NavigableMap
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap descendingMap() {
        ImmutableSortedMap immutableSortedMap = this.f11833g;
        return immutableSortedMap == null ? isEmpty() ? v(j0.a(comparator()).i()) : new ImmutableSortedMap((RegularImmutableSortedSet) this.f11831e.descendingSet(), this.f11832f.C(), this) : immutableSortedMap;
    }

    public final ImmutableSortedMap w(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 == i11 ? v(comparator()) : new ImmutableSortedMap(this.f11831e.Z(i10, i11), this.f11832f.subList(i10, i11));
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMap headMap(Object obj, boolean z10) {
        return w(0, this.f11831e.a0(com.google.common.base.g.m(obj), z10));
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet keySet() {
        return this.f11831e;
    }

    public ImmutableSortedMap(RegularImmutableSortedSet regularImmutableSortedSet, ImmutableList immutableList, ImmutableSortedMap immutableSortedMap) {
        this.f11831e = regularImmutableSortedSet;
        this.f11832f = immutableList;
        this.f11833g = immutableSortedMap;
    }
}
