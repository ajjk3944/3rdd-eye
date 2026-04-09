package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.lang.Comparable;

@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class ImmutableRangeSet<C extends Comparable> extends e implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final ImmutableRangeSet f11821b = new ImmutableRangeSet(ImmutableList.A());

    /* renamed from: c, reason: collision with root package name */
    public static final ImmutableRangeSet f11822c = new ImmutableRangeSet(ImmutableList.B(Range.d()));

    /* renamed from: a, reason: collision with root package name */
    public final transient ImmutableList f11823a;

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        private final ImmutableList<Range<C>> ranges;

        public SerializedForm(ImmutableList immutableList) {
            this.ranges = immutableList;
        }

        public Object readResolve() {
            return this.ranges.isEmpty() ? ImmutableRangeSet.i() : this.ranges.equals(ImmutableList.B(Range.d())) ? ImmutableRangeSet.g() : new ImmutableRangeSet(this.ranges);
        }
    }

    public ImmutableRangeSet(ImmutableList immutableList) {
        this.f11823a = immutableList;
    }

    public static ImmutableRangeSet g() {
        return f11822c;
    }

    public static ImmutableRangeSet i() {
        return f11821b;
    }

    @Override // com.google.common.collect.e
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.m0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ImmutableSet d() {
        return this.f11823a.isEmpty() ? ImmutableSet.F() : new RegularImmutableSortedSet(this.f11823a, Range.k());
    }

    public Object writeReplace() {
        return new SerializedForm(this.f11823a);
    }
}
