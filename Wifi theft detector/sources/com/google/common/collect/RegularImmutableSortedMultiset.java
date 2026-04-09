package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.e0;
import java.util.Comparator;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {

    /* renamed from: h, reason: collision with root package name */
    public static final long[] f11959h = {0};

    /* renamed from: i, reason: collision with root package name */
    public static final ImmutableSortedMultiset f11960i = new RegularImmutableSortedMultiset(j0.d());

    /* renamed from: d, reason: collision with root package name */
    public final transient RegularImmutableSortedSet f11961d;

    /* renamed from: e, reason: collision with root package name */
    public final transient long[] f11962e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f11963f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f11964g;

    public RegularImmutableSortedMultiset(Comparator comparator) {
        this.f11961d = ImmutableSortedSet.N(comparator);
        this.f11962e = f11959h;
        this.f11963f = 0;
        this.f11964g = 0;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.r0
    /* renamed from: A */
    public ImmutableSortedMultiset q(Object obj, BoundType boundType) {
        return E(0, this.f11961d.a0(obj, com.google.common.base.g.m(boundType) == BoundType.CLOSED));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.r0
    /* renamed from: C */
    public ImmutableSortedMultiset t(Object obj, BoundType boundType) {
        return E(this.f11961d.b0(obj, com.google.common.base.g.m(boundType) == BoundType.CLOSED), this.f11964g);
    }

    public final int D(int i10) {
        long[] jArr = this.f11962e;
        int i11 = this.f11963f;
        return (int) (jArr[(i11 + i10) + 1] - jArr[i11 + i10]);
    }

    public ImmutableSortedMultiset E(int i10, int i11) {
        com.google.common.base.g.q(i10, i11, this.f11964g);
        return i10 == i11 ? ImmutableSortedMultiset.z(comparator()) : (i10 == 0 && i11 == this.f11964g) ? this : new RegularImmutableSortedMultiset(this.f11961d.Z(i10, i11), this.f11962e, this.f11963f + i10, i11 - i10);
    }

    @Override // com.google.common.collect.r0
    public e0.a firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return w(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean i() {
        return this.f11963f > 0 || this.f11964g < this.f11962e.length - 1;
    }

    @Override // com.google.common.collect.r0
    public e0.a lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return w(this.f11964g - 1);
    }

    @Override // com.google.common.collect.e0
    public int r(Object obj) {
        int iIndexOf = this.f11961d.indexOf(obj);
        if (iIndexOf >= 0) {
            return D(iIndexOf);
        }
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.e0
    public int size() {
        long[] jArr = this.f11962e;
        int i10 = this.f11963f;
        return com.google.common.primitives.c.d(jArr[this.f11964g + i10] - jArr[i10]);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public e0.a w(int i10) {
        return Multisets.g(this.f11961d.v().get(i10), D(i10));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* renamed from: y */
    public ImmutableSortedSet k() {
        return this.f11961d;
    }

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet regularImmutableSortedSet, long[] jArr, int i10, int i11) {
        this.f11961d = regularImmutableSortedSet;
        this.f11962e = jArr;
        this.f11963f = i10;
        this.f11964g = i11;
    }
}
