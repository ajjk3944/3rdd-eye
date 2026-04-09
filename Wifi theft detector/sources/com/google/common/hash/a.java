package com.google.common.hash;

import com.google.common.base.g;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLongArray f12090a;

    /* renamed from: b, reason: collision with root package name */
    public final b f12091b;

    public a(long[] jArr) {
        g.e(jArr.length > 0, "data length is zero!");
        this.f12090a = new AtomicLongArray(jArr);
        this.f12091b = LongAddables.a();
        long jBitCount = 0;
        for (long j10 : jArr) {
            jBitCount += Long.bitCount(j10);
        }
        this.f12091b.add(jBitCount);
    }

    public static long[] a(AtomicLongArray atomicLongArray) {
        int length = atomicLongArray.length();
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = atomicLongArray.get(i10);
        }
        return jArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(a(this.f12090a), a(((a) obj).f12090a));
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(a(this.f12090a));
    }
}
