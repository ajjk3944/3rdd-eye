package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Arrays;

@Immutable
@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class ImmutableDoubleArray implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final ImmutableDoubleArray f12099b = new ImmutableDoubleArray(new double[0]);

    /* renamed from: a, reason: collision with root package name */
    public final transient int f12100a;
    private final double[] array;
    private final int end;

    public ImmutableDoubleArray(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    public static boolean a(double d10, double d11) {
        return Double.doubleToLongBits(d10) == Double.doubleToLongBits(d11);
    }

    public double b(int i10) {
        com.google.common.base.g.k(i10, h());
        return this.array[this.f12100a + i10];
    }

    public boolean d() {
        return this.end == this.f12100a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (h() != immutableDoubleArray.h()) {
            return false;
        }
        for (int i10 = 0; i10 < h(); i10++) {
            if (!a(b(i10), immutableDoubleArray.b(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        return this.f12100a > 0 || this.end < this.array.length;
    }

    public int h() {
        return this.end - this.f12100a;
    }

    public int hashCode() {
        int iB = 1;
        for (int i10 = this.f12100a; i10 < this.end; i10++) {
            iB = (iB * 31) + a.b(this.array[i10]);
        }
        return iB;
    }

    public double[] i() {
        return Arrays.copyOfRange(this.array, this.f12100a, this.end);
    }

    public ImmutableDoubleArray j() {
        return g() ? new ImmutableDoubleArray(i()) : this;
    }

    public Object readResolve() {
        return d() ? f12099b : this;
    }

    public String toString() {
        if (d()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(h() * 5);
        sb.append('[');
        sb.append(this.array[this.f12100a]);
        int i10 = this.f12100a;
        while (true) {
            i10++;
            if (i10 >= this.end) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(this.array[i10]);
        }
    }

    public Object writeReplace() {
        return j();
    }

    public ImmutableDoubleArray(double[] dArr, int i10, int i11) {
        this.array = dArr;
        this.f12100a = i10;
        this.end = i11;
    }
}
