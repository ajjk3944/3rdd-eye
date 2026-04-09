package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import com.google.common.collect.StandardTable;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;
    private final Comparator<? super C> columnComparator;

    public class a extends StandardTable.c implements SortedMap {

        /* renamed from: d, reason: collision with root package name */
        public final Object f11987d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f11988e;

        /* renamed from: f, reason: collision with root package name */
        public transient SortedMap f11989f;

        public a(TreeBasedTable treeBasedTable, Object obj) {
            this(obj, null, null);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return TreeBasedTable.this.t();
        }

        @Override // com.google.common.collect.StandardTable.c, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return k(obj) && super.containsKey(obj);
        }

        @Override // com.google.common.collect.StandardTable.c
        public void d() {
            l();
            SortedMap sortedMap = this.f11989f;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            TreeBasedTable.this.backingMap.remove(this.f11976a);
            this.f11989f = null;
            this.f11977b = null;
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            e();
            Map map = this.f11977b;
            if (map != null) {
                return ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        public int h(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        @Override // java.util.SortedMap
        public SortedMap headMap(Object obj) {
            com.google.common.base.g.d(k(com.google.common.base.g.m(obj)));
            return new a(this.f11976a, this.f11987d, obj);
        }

        @Override // com.google.common.collect.StandardTable.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public SortedMap c() {
            l();
            SortedMap sortedMapTailMap = this.f11989f;
            if (sortedMapTailMap == null) {
                return null;
            }
            Object obj = this.f11987d;
            if (obj != null) {
                sortedMapTailMap = sortedMapTailMap.tailMap(obj);
            }
            Object obj2 = this.f11988e;
            return obj2 != null ? sortedMapTailMap.headMap(obj2) : sortedMapTailMap;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public SortedSet keySet() {
            return new Maps.h(this);
        }

        public boolean k(Object obj) {
            if (obj == null) {
                return false;
            }
            Object obj2 = this.f11987d;
            if (obj2 != null && h(obj2, obj) > 0) {
                return false;
            }
            Object obj3 = this.f11988e;
            return obj3 == null || h(obj3, obj) > 0;
        }

        public void l() {
            SortedMap sortedMap = this.f11989f;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.backingMap.containsKey(this.f11976a))) {
                this.f11989f = (SortedMap) TreeBasedTable.this.backingMap.get(this.f11976a);
            }
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            e();
            Map map = this.f11977b;
            if (map != null) {
                return ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.StandardTable.c, java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            com.google.common.base.g.d(k(com.google.common.base.g.m(obj)));
            return super.put(obj, obj2);
        }

        @Override // java.util.SortedMap
        public SortedMap subMap(Object obj, Object obj2) {
            com.google.common.base.g.d(k(com.google.common.base.g.m(obj)) && k(com.google.common.base.g.m(obj2)));
            return new a(this.f11976a, obj, obj2);
        }

        @Override // java.util.SortedMap
        public SortedMap tailMap(Object obj) {
            com.google.common.base.g.d(k(com.google.common.base.g.m(obj)));
            return new a(this.f11976a, obj, this.f11988e);
        }

        public a(Object obj, Object obj2, Object obj3) {
            super(obj);
            this.f11987d = obj2;
            this.f11988e = obj3;
            com.google.common.base.g.d(obj2 == null || obj3 == null || h(obj2, obj3) <= 0);
        }
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.g, com.google.common.collect.t0
    public /* bridge */ /* synthetic */ Set d() {
        return super.d();
    }

    @Override // com.google.common.collect.g
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.g
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.g
    public /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.common.collect.StandardTable
    public /* bridge */ /* synthetic */ boolean k(Object obj) {
        return super.k(obj);
    }

    @Override // com.google.common.collect.StandardTable
    public /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3) {
        return super.n(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.t0
    /* renamed from: r */
    public SortedMap g() {
        return super.g();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.t0
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public Comparator t() {
        return this.columnComparator;
    }

    @Override // com.google.common.collect.g
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.StandardTable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public SortedMap o(Object obj) {
        return new a(this, obj);
    }
}
