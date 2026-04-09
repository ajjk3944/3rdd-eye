package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class GeneralRange<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;

    @CheckForNull
    private final T lowerEndpoint;
    private final BoundType upperBoundType;

    @CheckForNull
    private final T upperEndpoint;

    /* JADX WARN: Multi-variable type inference failed */
    public GeneralRange(Comparator comparator, boolean z10, Object obj, BoundType boundType, boolean z11, Object obj2, BoundType boundType2) {
        this.comparator = (Comparator) com.google.common.base.g.m(comparator);
        this.hasLowerBound = z10;
        this.hasUpperBound = z11;
        this.lowerEndpoint = obj;
        this.lowerBoundType = (BoundType) com.google.common.base.g.m(boundType);
        this.upperEndpoint = obj2;
        this.upperBoundType = (BoundType) com.google.common.base.g.m(boundType2);
        if (z10) {
            comparator.compare(f0.a(obj), f0.a(obj));
        }
        if (z11) {
            comparator.compare(f0.a(obj2), f0.a(obj2));
        }
        if (z10 && z11) {
            int iCompare = comparator.compare(f0.a(obj), f0.a(obj2));
            com.google.common.base.g.j(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                com.google.common.base.g.d((boundType == boundType3 && boundType2 == boundType3) ? false : true);
            }
        }
    }

    public static GeneralRange a(Comparator comparator) {
        BoundType boundType = BoundType.OPEN;
        return new GeneralRange(comparator, false, null, boundType, false, null, boundType);
    }

    public static GeneralRange f(Comparator comparator, Object obj, BoundType boundType) {
        return new GeneralRange(comparator, true, obj, boundType, false, null, BoundType.OPEN);
    }

    public static GeneralRange p(Comparator comparator, Object obj, BoundType boundType) {
        return new GeneralRange(comparator, false, null, BoundType.OPEN, true, obj, boundType);
    }

    public Comparator d() {
        return this.comparator;
    }

    public boolean e(Object obj) {
        return (o(obj) || n(obj)) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && g().equals(generalRange.g()) && i().equals(generalRange.i()) && com.google.common.base.f.a(h(), generalRange.h()) && com.google.common.base.f.a(j(), generalRange.j())) {
                return true;
            }
        }
        return false;
    }

    public BoundType g() {
        return this.lowerBoundType;
    }

    public Object h() {
        return this.lowerEndpoint;
    }

    public int hashCode() {
        return com.google.common.base.f.b(this.comparator, h(), g(), j(), i());
    }

    public BoundType i() {
        return this.upperBoundType;
    }

    public Object j() {
        return this.upperEndpoint;
    }

    public boolean k() {
        return this.hasLowerBound;
    }

    public boolean l() {
        return this.hasUpperBound;
    }

    public GeneralRange m(GeneralRange generalRange) {
        int iCompare;
        int iCompare2;
        Object obj;
        int iCompare3;
        BoundType boundType;
        com.google.common.base.g.m(generalRange);
        com.google.common.base.g.d(this.comparator.equals(generalRange.comparator));
        boolean z10 = this.hasLowerBound;
        Object objH = h();
        BoundType boundTypeG = g();
        if (!k()) {
            z10 = generalRange.hasLowerBound;
            objH = generalRange.h();
            boundTypeG = generalRange.g();
        } else if (generalRange.k() && ((iCompare = this.comparator.compare((Object) h(), generalRange.h())) < 0 || (iCompare == 0 && generalRange.g() == BoundType.OPEN))) {
            objH = generalRange.h();
            boundTypeG = generalRange.g();
        }
        boolean z11 = z10;
        boolean z12 = this.hasUpperBound;
        Object objJ = j();
        BoundType boundTypeI = i();
        if (!l()) {
            z12 = generalRange.hasUpperBound;
            objJ = generalRange.j();
            boundTypeI = generalRange.i();
        } else if (generalRange.l() && ((iCompare2 = this.comparator.compare((Object) j(), generalRange.j())) > 0 || (iCompare2 == 0 && generalRange.i() == BoundType.OPEN))) {
            objJ = generalRange.j();
            boundTypeI = generalRange.i();
        }
        boolean z13 = z12;
        Object obj2 = objJ;
        if (z11 && z13 && ((iCompare3 = this.comparator.compare(objH, obj2)) > 0 || (iCompare3 == 0 && boundTypeG == (boundType = BoundType.OPEN) && boundTypeI == boundType))) {
            boundTypeG = BoundType.OPEN;
            boundTypeI = BoundType.CLOSED;
            obj = obj2;
        } else {
            obj = objH;
        }
        return new GeneralRange(this.comparator, z11, obj, boundTypeG, z13, obj2, boundTypeI);
    }

    public boolean n(Object obj) {
        if (!l()) {
            return false;
        }
        int iCompare = this.comparator.compare(obj, f0.a(j()));
        return ((iCompare == 0) & (i() == BoundType.OPEN)) | (iCompare > 0);
    }

    public boolean o(Object obj) {
        if (!k()) {
            return false;
        }
        int iCompare = this.comparator.compare(obj, f0.a(h()));
        return ((iCompare == 0) & (g() == BoundType.OPEN)) | (iCompare < 0);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.comparator);
        BoundType boundType = this.lowerBoundType;
        BoundType boundType2 = BoundType.CLOSED;
        char c10 = boundType == boundType2 ? '[' : '(';
        String strValueOf2 = String.valueOf(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        String strValueOf3 = String.valueOf(this.hasUpperBound ? this.upperEndpoint : "∞");
        char c11 = this.upperBoundType == boundType2 ? ']' : ')';
        StringBuilder sb = new StringBuilder(strValueOf.length() + 4 + strValueOf2.length() + strValueOf3.length());
        sb.append(strValueOf);
        sb.append(":");
        sb.append(c10);
        sb.append(strValueOf2);
        sb.append(',');
        sb.append(strValueOf3);
        sb.append(c11);
        return sb.toString();
    }
}
