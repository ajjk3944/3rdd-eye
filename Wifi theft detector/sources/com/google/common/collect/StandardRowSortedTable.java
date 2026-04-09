package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import com.google.common.collect.StandardTable;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements t0 {
    private static final long serialVersionUID = 0;

    public class b extends StandardTable.d implements SortedMap {
        public b() {
            super();
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return StandardRowSortedTable.this.s().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return StandardRowSortedTable.this.s().firstKey();
        }

        @Override // com.google.common.collect.Maps.j
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public SortedSet i() {
            return new Maps.h(this);
        }

        @Override // java.util.SortedMap
        public SortedMap headMap(Object obj) {
            com.google.common.base.g.m(obj);
            return new StandardRowSortedTable(StandardRowSortedTable.this.s().headMap(obj), StandardRowSortedTable.this.factory).g();
        }

        @Override // com.google.common.collect.Maps.j, java.util.AbstractMap, java.util.Map
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public SortedSet j() {
            return (SortedSet) super.j();
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return StandardRowSortedTable.this.s().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap subMap(Object obj, Object obj2) {
            com.google.common.base.g.m(obj);
            com.google.common.base.g.m(obj2);
            return new StandardRowSortedTable(StandardRowSortedTable.this.s().subMap(obj, obj2), StandardRowSortedTable.this.factory).g();
        }

        @Override // java.util.SortedMap
        public SortedMap tailMap(Object obj) {
            com.google.common.base.g.m(obj);
            return new StandardRowSortedTable(StandardRowSortedTable.this.s().tailMap(obj), StandardRowSortedTable.this.factory).g();
        }
    }

    public StandardRowSortedTable(SortedMap sortedMap, com.google.common.base.j jVar) {
        super(sortedMap, jVar);
    }

    @Override // com.google.common.collect.StandardTable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public SortedMap l() {
        return new b();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.t0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public SortedMap g() {
        return (SortedMap) super.g();
    }

    public final SortedMap s() {
        return (SortedMap) this.backingMap;
    }
}
