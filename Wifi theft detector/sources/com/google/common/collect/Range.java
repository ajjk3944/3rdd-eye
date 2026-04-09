package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.lang.Comparable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements com.google.common.base.h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Range f11928a = new Range(Cut.g(), Cut.d());
    private static final long serialVersionUID = 0;
    final Cut<C> lowerBound;
    final Cut<C> upperBound;

    public static class RangeLexOrdering extends j0 implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final j0 f11929a = new RangeLexOrdering();
        private static final long serialVersionUID = 0;

        private RangeLexOrdering() {
        }

        @Override // com.google.common.collect.j0, java.util.Comparator
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compare(Range range, Range range2) {
            return m.f().d(range.lowerBound, range2.lowerBound).d(range.upperBound, range2.upperBound).e();
        }
    }

    public Range(Cut cut, Cut cut2) {
        this.lowerBound = (Cut) com.google.common.base.g.m(cut);
        this.upperBound = (Cut) com.google.common.base.g.m(cut2);
        if (cut.compareTo(cut2) > 0 || cut == Cut.d() || cut2 == Cut.g()) {
            String strValueOf = String.valueOf(l(cut, cut2));
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Invalid range: ".concat(strValueOf) : new String("Invalid range: "));
        }
    }

    public static Range d() {
        return f11928a;
    }

    public static Range g(Cut cut, Cut cut2) {
        return new Range(cut, cut2);
    }

    public static j0 k() {
        return RangeLexOrdering.f11929a;
    }

    public static String l(Cut cut, Cut cut2) {
        StringBuilder sb = new StringBuilder(16);
        cut.i(sb);
        sb.append("..");
        cut2.j(sb);
        return sb.toString();
    }

    @Override // com.google.common.base.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean apply(Comparable comparable) {
        return f(comparable);
    }

    @Override // com.google.common.base.h
    public boolean equals(Object obj) {
        if (obj instanceof Range) {
            Range range = (Range) obj;
            if (this.lowerBound.equals(range.lowerBound) && this.upperBound.equals(range.upperBound)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(Comparable comparable) {
        com.google.common.base.g.m(comparable);
        return this.lowerBound.k(comparable) && !this.upperBound.k(comparable);
    }

    public Range h(Range range) {
        int iCompareTo = this.lowerBound.compareTo(range.lowerBound);
        int iCompareTo2 = this.upperBound.compareTo(range.upperBound);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return range;
        }
        Cut<C> cut = iCompareTo >= 0 ? this.lowerBound : range.lowerBound;
        Cut<C> cut2 = iCompareTo2 <= 0 ? this.upperBound : range.upperBound;
        com.google.common.base.g.j(cut.compareTo(cut2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, range);
        return g(cut, cut2);
    }

    public int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    public boolean i(Range range) {
        return this.lowerBound.compareTo(range.upperBound) <= 0 && range.lowerBound.compareTo(this.upperBound) <= 0;
    }

    public boolean j() {
        return this.lowerBound.equals(this.upperBound);
    }

    public Object readResolve() {
        return equals(f11928a) ? d() : this;
    }

    public String toString() {
        return l(this.lowerBound, this.upperBound);
    }
}
