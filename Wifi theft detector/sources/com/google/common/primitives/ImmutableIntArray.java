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
public final class ImmutableIntArray implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final ImmutableIntArray f12101b = new ImmutableIntArray(new int[0]);

    /* renamed from: a, reason: collision with root package name */
    public final transient int f12102a;
    private final int[] array;
    private final int end;

    public ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public int a(int i10) {
        com.google.common.base.g.k(i10, h());
        return this.array[this.f12102a + i10];
    }

    public boolean d() {
        return this.end == this.f12102a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (h() != immutableIntArray.h()) {
            return false;
        }
        for (int i10 = 0; i10 < h(); i10++) {
            if (a(i10) != immutableIntArray.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        return this.f12102a > 0 || this.end < this.array.length;
    }

    public int h() {
        return this.end - this.f12102a;
    }

    public int hashCode() {
        int iC = 1;
        for (int i10 = this.f12102a; i10 < this.end; i10++) {
            iC = (iC * 31) + c.c(this.array[i10]);
        }
        return iC;
    }

    public int[] i() {
        return Arrays.copyOfRange(this.array, this.f12102a, this.end);
    }

    public ImmutableIntArray j() {
        return g() ? new ImmutableIntArray(i()) : this;
    }

    public Object readResolve() {
        return d() ? f12101b : this;
    }

    public String toString() {
        if (d()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(h() * 5);
        sb.append('[');
        sb.append(this.array[this.f12102a]);
        int i10 = this.f12102a;
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

    public ImmutableIntArray(int[] iArr, int i10, int i11) {
        this.array = iArr;
        this.f12102a = i10;
        this.end = i11;
    }
}
