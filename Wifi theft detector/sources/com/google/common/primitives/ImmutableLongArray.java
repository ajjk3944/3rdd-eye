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
public final class ImmutableLongArray implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final ImmutableLongArray f12103b = new ImmutableLongArray(new long[0]);

    /* renamed from: a, reason: collision with root package name */
    public final transient int f12104a;
    private final long[] array;
    private final int end;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public long[] f12105a;

        /* renamed from: b, reason: collision with root package name */
        public int f12106b = 0;

        public b(int i10) {
            this.f12105a = new long[i10];
        }

        public static int d(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public b a(long j10) {
            c(1);
            long[] jArr = this.f12105a;
            int i10 = this.f12106b;
            jArr[i10] = j10;
            this.f12106b = i10 + 1;
            return this;
        }

        public ImmutableLongArray b() {
            if (this.f12106b == 0) {
                return ImmutableLongArray.f12103b;
            }
            return new ImmutableLongArray(this.f12105a, 0, this.f12106b);
        }

        public final void c(int i10) {
            int i11 = this.f12106b + i10;
            long[] jArr = this.f12105a;
            if (i11 > jArr.length) {
                this.f12105a = Arrays.copyOf(jArr, d(jArr.length, i11));
            }
        }
    }

    public static b g() {
        return new b(10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (k() != immutableLongArray.k()) {
            return false;
        }
        for (int i10 = 0; i10 < k(); i10++) {
            if (h(i10) != immutableLongArray.h(i10)) {
                return false;
            }
        }
        return true;
    }

    public long h(int i10) {
        com.google.common.base.g.k(i10, k());
        return this.array[this.f12104a + i10];
    }

    public int hashCode() {
        int iB = 1;
        for (int i10 = this.f12104a; i10 < this.end; i10++) {
            iB = (iB * 31) + e.b(this.array[i10]);
        }
        return iB;
    }

    public boolean i() {
        return this.end == this.f12104a;
    }

    public final boolean j() {
        return this.f12104a > 0 || this.end < this.array.length;
    }

    public int k() {
        return this.end - this.f12104a;
    }

    public long[] l() {
        return Arrays.copyOfRange(this.array, this.f12104a, this.end);
    }

    public ImmutableLongArray m() {
        return j() ? new ImmutableLongArray(l()) : this;
    }

    public Object readResolve() {
        return i() ? f12103b : this;
    }

    public String toString() {
        if (i()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(k() * 5);
        sb.append('[');
        sb.append(this.array[this.f12104a]);
        int i10 = this.f12104a;
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
        return m();
    }

    public ImmutableLongArray(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    public ImmutableLongArray(long[] jArr, int i10, int i11) {
        this.array = jArr;
        this.f12104a = i10;
        this.end = i11;
    }
}
