package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    private final boolean accessOrder;

    /* renamed from: k, reason: collision with root package name */
    public transient long[] f11713k;

    /* renamed from: l, reason: collision with root package name */
    public transient int f11714l;

    /* renamed from: m, reason: collision with root package name */
    public transient int f11715m;

    public CompactLinkedHashMap() {
        this(3);
    }

    public static CompactLinkedHashMap b0() {
        return new CompactLinkedHashMap();
    }

    public static CompactLinkedHashMap c0(int i10) {
        return new CompactLinkedHashMap(i10);
    }

    @Override // com.google.common.collect.CompactHashMap
    public int C() {
        return this.f11714l;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int D(int i10) {
        return ((int) e0(i10)) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void H(int i10) {
        super.H(i10);
        this.f11714l = -2;
        this.f11715m = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void I(int i10, Object obj, Object obj2, int i11, int i12) {
        super.I(i10, obj, obj2, i11, i12);
        i0(this.f11715m, i10);
        i0(i10, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void L(int i10, int i11) {
        int size = size() - 1;
        super.L(i10, i11);
        i0(d0(i10), D(i10));
        if (i10 < size) {
            i0(d0(size), i10);
            i0(i10, D(size));
        }
        g0(size, 0L);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void S(int i10) {
        super.S(i10);
        this.f11713k = Arrays.copyOf(f0(), i10);
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (M()) {
            return;
        }
        this.f11714l = -2;
        this.f11715m = -2;
        long[] jArr = this.f11713k;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    public final int d0(int i10) {
        return ((int) (e0(i10) >>> 32)) - 1;
    }

    public final long e0(int i10) {
        return f0()[i10];
    }

    public final long[] f0() {
        long[] jArr = this.f11713k;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    public final void g0(int i10, long j10) {
        f0()[i10] = j10;
    }

    public final void h0(int i10, int i11) {
        g0(i10, (e0(i10) & 4294967295L) | ((i11 + 1) << 32));
    }

    public final void i0(int i10, int i11) {
        if (i10 == -2) {
            this.f11714l = i11;
        } else {
            j0(i10, i11);
        }
        if (i11 == -2) {
            this.f11715m = i10;
        } else {
            h0(i11, i10);
        }
    }

    public final void j0(int i10, int i11) {
        g0(i10, (e0(i10) & (-4294967296L)) | ((i11 + 1) & 4294967295L));
    }

    @Override // com.google.common.collect.CompactHashMap
    public void p(int i10) {
        if (this.accessOrder) {
            i0(d0(i10), D(i10));
            i0(this.f11715m, i10);
            i0(i10, -2);
            F();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    public int q(int i10, int i11) {
        return i10 >= size() ? i11 : i10;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int r() {
        int iR = super.r();
        this.f11713k = new long[iR];
        return iR;
    }

    @Override // com.google.common.collect.CompactHashMap
    public Map s() {
        Map mapS = super.s();
        this.f11713k = null;
        return mapS;
    }

    @Override // com.google.common.collect.CompactHashMap
    public Map v(int i10) {
        return new LinkedHashMap(i10, 1.0f, this.accessOrder);
    }

    public CompactLinkedHashMap(int i10) {
        this(i10, false);
    }

    public CompactLinkedHashMap(int i10, boolean z10) {
        super(i10);
        this.accessOrder = z10;
    }
}
