package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.lang.Comparable;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    final o domain;

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet K() {
        return new DescendingImmutableSortedSet(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public ContiguousSet headSet(Comparable comparable) {
        return Q((Comparable) com.google.common.base.g.m(comparable), false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public ContiguousSet headSet(Comparable comparable, boolean z10) {
        return Q((Comparable) com.google.common.base.g.m(comparable), z10);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public abstract ContiguousSet Q(Comparable comparable, boolean z10);

    public abstract Range c0();

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public ContiguousSet subSet(Comparable comparable, Comparable comparable2) {
        com.google.common.base.g.m(comparable);
        com.google.common.base.g.m(comparable2);
        com.google.common.base.g.d(comparator().compare(comparable, comparable2) <= 0);
        return T(comparable, true, comparable2, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public ContiguousSet subSet(Comparable comparable, boolean z10, Comparable comparable2, boolean z11) {
        com.google.common.base.g.m(comparable);
        com.google.common.base.g.m(comparable2);
        com.google.common.base.g.d(comparator().compare(comparable, comparable2) <= 0);
        return T(comparable, z10, comparable2, z11);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public abstract ContiguousSet T(Comparable comparable, boolean z10, Comparable comparable2, boolean z11);

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public ContiguousSet tailSet(Comparable comparable) {
        return W((Comparable) com.google.common.base.g.m(comparable), true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public ContiguousSet tailSet(Comparable comparable, boolean z10) {
        return W((Comparable) com.google.common.base.g.m(comparable), z10);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public abstract ContiguousSet W(Comparable comparable, boolean z10);

    @Override // java.util.AbstractCollection
    public String toString() {
        return c0().toString();
    }
}
