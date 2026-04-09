package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class a32 implements b32 {

    /* renamed from: b, reason: collision with root package name */
    private final av[] f24425b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f24426c;

    public a32(av[] avVarArr, long[] jArr) {
        this.f24425b = avVarArr;
        this.f24426c = jArr;
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final long a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.f24426c;
        if (i < jArr.length) {
            return jArr[i];
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final List<av> b(long j4) {
        av avVar;
        int iB = s82.b(this.f24426c, j4, false);
        return (iB == -1 || (avVar = this.f24425b[iB]) == av.f24818s) ? Collections.EMPTY_LIST : Collections.singletonList(avVar);
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final int a() {
        return this.f24426c.length;
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final int a(long j4) {
        int iA = s82.a(this.f24426c, j4, false);
        if (iA < this.f24426c.length) {
            return iA;
        }
        return -1;
    }
}
