package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.NavigableMap;
import java.util.Set;

@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public class TreeRangeSet<C extends Comparable<?>> extends e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient Set f12018a;

    @VisibleForTesting
    final NavigableMap<Cut<C>, Range<C>> rangesByLowerBound;

    public final class a extends q implements Set {

        /* renamed from: a, reason: collision with root package name */
        public final Collection f12019a;

        public a(TreeRangeSet treeRangeSet, Collection collection) {
            this.f12019a = collection;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.a(this, obj);
        }

        @Override // com.google.common.collect.v
        /* renamed from: h */
        public Collection x() {
            return this.f12019a;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.b(this);
        }
    }

    @Override // com.google.common.collect.m0
    public Set d() {
        Set set = this.f12018a;
        if (set != null) {
            return set;
        }
        a aVar = new a(this, this.rangesByLowerBound.values());
        this.f12018a = aVar;
        return aVar;
    }

    @Override // com.google.common.collect.e
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }
}
