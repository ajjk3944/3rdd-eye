package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.o2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4169o2 {

    /* renamed from: a, reason: collision with root package name */
    private final ce2 f31138a;

    public C4169o2(ce2 videoDurationHolder) {
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        this.f31138a = videoDurationHolder;
    }

    public final long a(at adBreakPosition) {
        kotlin.jvm.internal.l.f(adBreakPosition, "adBreakPosition");
        long jB = adBreakPosition.b();
        int iOrdinal = adBreakPosition.a().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return -1L;
            }
            return jB;
        }
        if (jB == 100) {
            return Long.MIN_VALUE;
        }
        if (jB == 0) {
            return 0L;
        }
        if (this.f31138a.a() == -9223372036854775807L) {
            return -1L;
        }
        return (long) ((jB / 100) * this.f31138a.a());
    }
}
