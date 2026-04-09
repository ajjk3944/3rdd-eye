package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.e0;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {

    /* renamed from: d, reason: collision with root package name */
    public final transient ImmutableSortedMultiset f11731d;

    public DescendingImmutableSortedMultiset(ImmutableSortedMultiset immutableSortedMultiset) {
        this.f11731d = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.r0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset q(Object obj, BoundType boundType) {
        return this.f11731d.t(obj, boundType).o();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.r0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset t(Object obj, BoundType boundType) {
        return this.f11731d.q(obj, boundType).o();
    }

    @Override // com.google.common.collect.r0
    public e0.a firstEntry() {
        return this.f11731d.lastEntry();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean i() {
        return this.f11731d.i();
    }

    @Override // com.google.common.collect.r0
    public e0.a lastEntry() {
        return this.f11731d.firstEntry();
    }

    @Override // com.google.common.collect.e0
    public int r(Object obj) {
        return this.f11731d.r(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.e0
    public int size() {
        return this.f11731d.size();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public e0.a w(int i10) {
        return (e0.a) this.f11731d.entrySet().v().C().get(i10);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.r0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset o() {
        return this.f11731d;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet k() {
        return this.f11731d.k().descendingSet();
    }
}
