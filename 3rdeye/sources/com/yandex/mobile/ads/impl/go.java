package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class go implements tw1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27846a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f27847b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f27848c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f27849d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f27850e;

    /* renamed from: f, reason: collision with root package name */
    private final long f27851f;

    public go(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f27847b = iArr;
        this.f27848c = jArr;
        this.f27849d = jArr2;
        this.f27850e = jArr3;
        int length = iArr.length;
        this.f27846a = length;
        if (length <= 0) {
            this.f27851f = 0L;
        } else {
            int i = length - 1;
            this.f27851f = jArr2[i] + jArr3[i];
        }
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f27851f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f27846a + ", sizes=" + Arrays.toString(this.f27847b) + ", offsets=" + Arrays.toString(this.f27848c) + ", timeUs=" + Arrays.toString(this.f27850e) + ", durationsUs=" + Arrays.toString(this.f27849d) + ")";
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        int iB = s82.b(this.f27850e, j4, true);
        long[] jArr = this.f27850e;
        long j10 = jArr[iB];
        long[] jArr2 = this.f27848c;
        vw1 vw1Var = new vw1(j10, jArr2[iB]);
        if (j10 >= j4 || iB == this.f27846a - 1) {
            return new tw1.a(vw1Var, vw1Var);
        }
        int i = iB + 1;
        return new tw1.a(vw1Var, new vw1(jArr[i], jArr2[i]));
    }
}
